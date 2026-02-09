package io;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileLoader {
	private static String path;
	private String content;

	/**
	 * Gets the text current.
	 * @return the current text as a String.
	 */
		public FileLoader(String path) throws IOException {
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

	public static String load() throws IOException {

            StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){

				char[] buffer = new char[4096];
				int charsRead;

				while ((charsRead = reader.read(buffer)) != -1) {
					builder.append(buffer,0,charsRead);
				}

        }
	return builder.toString();
	}
}
