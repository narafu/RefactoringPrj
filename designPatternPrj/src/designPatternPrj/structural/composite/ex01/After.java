package designPatternPrj.structural.composite.ex01;

import java.util.List;

public class After {

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

	public class File implements Node {

		private String name;

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return name;
		}

	}

	public interface Node {

		public String getName();

	}

}
