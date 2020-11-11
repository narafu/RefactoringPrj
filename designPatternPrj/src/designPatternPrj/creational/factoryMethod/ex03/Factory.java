package designPatternPrj.creational.factoryMethod.ex03;

public abstract class Factory {

	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String owner);

	protected abstract void registerProduct(Product p);

}
