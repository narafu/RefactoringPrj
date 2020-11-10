package designPatternPrj.structural.adapter.ex03;

public class WebAdaptor implements WebRequester {

//	WebAdaptor는 
//	Target Interface인 WebRequester 인터페이스를 구현하고,
//	인스턴스 생성시 FancyRequester 클래스를 주입한다.
//	(WebRequester -> FancyRequester)
	
	//	이렇게 하면, WebClient에서 requestHandler()를 호출하던 코드는 그대로 두면서도,
	//	WebAdaptor의 requestHandler()를 통해 FancyRequester를 사용할 수 있게 된다.

	private FancyRequester fancyRequester;

	public WebAdaptor(FancyRequester fancyRequester) {
		// TODO Auto-generated constructor stub
		this.fancyRequester = fancyRequester;
	}

	@Override
	public void requestHandler() {
		// TODO Auto-generated method stub
		fancyRequester.fancyRequester();
	}

}
