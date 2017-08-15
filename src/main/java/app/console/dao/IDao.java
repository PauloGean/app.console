package app.console.dao;

import java.util.List;

public interface IDao {
	public String getHeader();
	
	public long count();

	public long countDistinct(String field);
	
	public List<String> filter(String field, String value);

}
