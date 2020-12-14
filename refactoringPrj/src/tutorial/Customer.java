package tutorial;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();
//	<Vector> 
//		ArrayList와 동일한 내부구조
//		ArrayList처럼 값이 추가되면 자동으로 크기 조절되며, 그다음 객체들은 한자리씩 뒤로 이동
//		ArrayList와 차이점은, Vector는 멀티스레드가 동시에 이 메소드들을 실행할 수 없고, 하나의 스레드가 실행을 완료하면, 다른 스레드 실행 가능
//		그래서,
//		멀티스레드 환경에서 안전하게 객체를 추가, 삭제 가능	 

	public Customer(String name) {
		this._name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
//		addElement()
//			obj 객체를 Vector에 저장한다.
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		Enumeration<Rental> rentals = _rentals.elements();
//		Enumeration - 인터페이스
//			객체들의 집합에서 각각의 객체들을 한순간에 하나씩 처리하는 메소드를 제공하는 컬렉션이다.
//			인터페이스이므로 직접 new 연산자를 이요하여 객체를 생성할 수 없고, 그 인터페이스를 사용하는 클래스로 구현해서 사용해야 한다.
//			Enumeration 객체는 new 연산자로 생성할 수 없으며, Vector를 이용하여 생성할 수 있다.
//			Vector 클래스의 elements()는 객체의 모든 요소를 Enumeration 객체로 반환한다.
//			... 요즘엔 Iterator를 사용한다...
//		Iterator - 인터페이스
//			자동으로 인덱스를 만들어 주기 때문에 편하지만, list보다 느리다.
//			hasNext()
//			next(
//			remove()

		String result = getName() + "고객님의 대여 기록 \n";

		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
//			Iterator의 next()와 같다.

			// 비디오 종류별 대여료 계산
			/* thisAmount = amountFor(each); */

			// 이번에 대여하는 비디오 정보와 대여로 출력
			result += "/t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";

		}

		// 푸터 행 추가
		result += "누적 대여료: " + String.valueOf(getTotalCharge()) + "\n";
		result += "적립 포인트: " + String.valueOf(getTotalFrequentRenterPoints());

		return result;
	}

	private double getTotalCharge() {

		double result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}

		return result;
	}

	private int getTotalFrequentRenterPoints() {

		int result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}

		return result;
	}

	public String htmlStatement() {
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "<H1><EM>" + getName() + " 고객님의 대여 기록</EM></H1><p>\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
		}

		// 푸터 행 추가
		result += "<P>누적 대여료: <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
		result += "적립 포인트: <EM>" + String.valueOf(getTotalFrequentRenterPoints() + "</EM><P>");

		return result;
	}

}
