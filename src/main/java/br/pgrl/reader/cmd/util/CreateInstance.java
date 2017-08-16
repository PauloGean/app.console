package br.pgrl.reader.cmd.util;

public class CreateInstance<T> {
	@SuppressWarnings("unchecked")
	public T createInstance(Class<?> classe) {
		try {
			return (T) classe.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
