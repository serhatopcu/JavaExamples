package org.javaturk.oop.ch07.thisKeyword;

public class ThisTree {

	private String type;
	private float height;

	public ThisTree(String type, float height) {
		this.type = type;
		this.height = height;
	}

	public void printInfo() {
		System.out.println("\nThisTree Info:");
		System.out.println("Type: " + this.type + " " + type);	// No need to use this here!
		System.out.println("Height: " + this.height + " " + height);	// No need to use this here!
	}

	public static void main(String[] args) {
		ThisTree tree = new ThisTree("Cinar", 12.0f);
		tree.printInfo();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}
