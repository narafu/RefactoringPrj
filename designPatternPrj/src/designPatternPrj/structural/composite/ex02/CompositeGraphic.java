package designPatternPrj.structural.composite.ex02;

import java.util.ArrayList;
import java.util.List;

// Composite
public class CompositeGraphic implements Graphic {

	private List<Graphic> childGraphics = new ArrayList<Graphic>();

	@Override
	public void print() {
		for (Graphic graphic : childGraphics) {
			graphic.print();
		}
	}

	public void add(Graphic graphic) {
		childGraphics.add(graphic);
	}

	public void remove(Graphic graphic) {
		childGraphics.remove(graphic);
	}
}
