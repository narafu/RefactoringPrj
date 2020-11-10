package designPatternPrj.structural.adapter.ex03;

public class Program {

	public static void main(String[] args) {
		
		WebAdaptor adaptor = new WebAdaptor(new FancyRequesterImpl());
		WebClient client = new WebClient(adaptor);
		client.doWork();
		
	}
	
}
