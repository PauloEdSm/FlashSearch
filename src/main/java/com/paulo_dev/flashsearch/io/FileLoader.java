package io;


public class FileLoader {
	String path;
	String content;

	/**
	 * Gets the text current.
	 * @return the current text as a String.
	 */
		public FileLoader(String path) {
		super();
		this.path = path;
		this.content = load();
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getContent() {
		return content;
	}

	/**
	 * Gets the text current.
	 * @return the current text as a String.
	 */
	public static String load(){
	return "";
		
	}
		
		
}
