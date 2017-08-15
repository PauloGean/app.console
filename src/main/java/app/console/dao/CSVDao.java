package app.console.dao;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class CSVDao implements IDao {
	

	public abstract String getSeparator();

	public abstract String getHeader();
	
	public abstract File getDirectory();


	@Override
	public long count() {
		long count = 0;
		for (String line : getLines()) {
			if (line.contains(getHeader())) {
				continue;
			}
			count++;
		}
		return count;
	}

	private List<String> getLines() {
		List<String> list = new ArrayList<String>();
		try {
			list = Files.readAllLines(getDirectory().toPath(), StandardCharsets.UTF_8);
		} catch (Exception e) {
		}
		return list;
	}

	public int getIndexColumn(String field) {
		String[] fields = getHeader().split(getSeparator());
		List<String> fieldList = Arrays.asList(fields);
		return fieldList.indexOf(field.trim());

	}


	@Override
	public long countDistinct(String field) {
		int column = getIndexColumn(field);
		Set<String> set = new HashSet<String>();
		for (String line : getLines()) {
			if (line.contains(getHeader())) {
				continue;
			}
			String[] values = line.split(getSeparator());
			set.add(values[column]);
		}
		return set.size();
	}
	
	
	@Override
	public List<String> filter(String field, String value) {
		int column = getIndexColumn(field);
		List<String> list = new ArrayList<String>();
		for (String line : getLines()) {
			if (line.contains(getHeader())) {
				continue;
			}
			String[] values = line.split(getSeparator());
			if (values[column].equals(value)) {
				list.add(line);

			}
		}
		return list;
	}

}
