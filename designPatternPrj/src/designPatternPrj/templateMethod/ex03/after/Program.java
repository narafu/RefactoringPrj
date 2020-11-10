package designPatternPrj.templateMethod.ex03.after;

public class Program {

	public static void main(String[] args) {

		CaffeineBeverage coffee = new Coffee();
		CaffeineBeverage tea = new Tea();
		
		coffee.prepareRecipe();
		
		System.out.println();
		
		tea.prepareRecipe();

	}
}
