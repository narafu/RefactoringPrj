package designPatternPrj.structural.composite.ex01.before;

import java.util.List;

public class Directory {

	private String name;
	private List<File> children;

	public void add(File file) {
		children.add(file);
	}
}
