package app.console.parser;

public interface Converter <S, T>{
	public T convert(S source);
}
