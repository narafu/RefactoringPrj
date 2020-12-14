package designPatternPrj.structural.composite.ex01;

import java.util.List;

public class Before {

	public class Directory {

		private String name;
		private List<File> children;

		public void add(File file) {
			children.add(file);
		}
	}

	public class File {

		private String name;

	}

}