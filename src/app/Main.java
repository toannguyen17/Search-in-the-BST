package app;

import app.treebinary.Tree;

public class Main {
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<>(60);

		// Add element
		tree.add(55);
		tree.add(100);
		tree.add(45);
		tree.add(57);
		tree.add(67);
		tree.add(107);
		tree.add(59);
		tree.add(101);

		System.out.println(tree.search(67));

	}
}
