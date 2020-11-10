package designPatternPrj.adaptor.ex03;

public class WebClient {

	private WebRequester webRequester;

	public WebClient(WebRequester webRequester) {
		this.webRequester = webRequester;
	}

	public void doWork() {
		webRequester.requestHandler();
	}

}
