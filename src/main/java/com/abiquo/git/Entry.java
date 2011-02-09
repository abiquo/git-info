package com.abiquo.git;

public class Entry {
	/**
     * Directory to track
     */
	private String path;
	/**
     * The prefix for the property
     */
	private String prefix;
	
	public Entry() {}
	
	public Entry(String path, String prefix) {
		super();
		this.path = path;
		this.prefix = prefix;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}		
}
