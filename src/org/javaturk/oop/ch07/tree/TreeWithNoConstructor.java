package org.javaturk.oop.ch07.tree;

public class TreeWithNoConstructor {
	private String type; // Make it final to see the effect!
	private float height;
	
	public TreeWithNoConstructor(){
		type = "pine";
		height = 1.0f;
	}
	
	public void printInfo(){
		System.out.println("\nTreeWithNoConstructor Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		TreeWithNoConstructor tree = new TreeWithNoConstructor();
		tree.printInfo();	// Not a meaningful state!
		tree.type = "Oak";
		tree.height = 8.74f;
		tree.printInfo();	// Meaningful state!
	}
}
