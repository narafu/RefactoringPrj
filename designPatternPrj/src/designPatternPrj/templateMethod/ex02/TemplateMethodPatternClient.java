package designPatternPrj.templateMethod.ex02;

public class TemplateMethodPatternClient {

	public static void main(String[] args) {
		AbstractClass abstractClass = new ConcreatClass();
		abstractClass.templateMethod();
	}
}
