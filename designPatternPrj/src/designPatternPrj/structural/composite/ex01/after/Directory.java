package designPatternPrj.structural.composite.ex01.after;

import java.util.List;

public class Directory implements Node {

	private String name;
	private List<Node> children;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void add(Node node) {
		children.add(node);
	}
}
