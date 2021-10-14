package org.javaturk.oop.ch08.enums.size;

enum Size {
	SMALL("S", 1), MEDIUM("M", 2), LARGE("L", 3), EXTRA_LARGE("XL", 4);

	private String abbreviation;
	private int no;

	Size(String abbreviation, int no) {
		this.abbreviation = abbreviation;
		this.no = no;
	}

	public String getAbbreviation() {
		return abbreviation;
	}
	
	public int getNo() {
		return no;
	}
}