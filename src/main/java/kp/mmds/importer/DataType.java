package kp.mmds.importer;

public abstract class DataType {
	public abstract void processLine(String line);

	protected static String get(String[] fields, int id) {
		if (fields.length > id) {
			return fields[id];
		}
		return null;
	}

}
