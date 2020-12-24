package ch11_generalization;

import java.util.Enumeration;
import java.util.Vector;

import tutorial.Rental;

public class Ex02_FormTemplateMethod {

	// 하위클래스 안의 두 메서드가 거의 비슷한 단계들을 같은 순서로 수행할 땐
	// 그 단계들을 시그니처가 같은 두 개의 메서드로 만들어서 두 원본 메서드를 같게 만든 후,
	// 두 메서드를 상위클래스로 옮기자.

	class Customer {

		private String _name;
		private Vector<Rental> _rentals = new Vector<Rental>();

		public Customer(String name) {
			this._name = name;
		}

		public void addRental(Rental arg) {
			_rentals.addElement(arg);
		}

		public String getName() {
			return _name;
		}

		public Enumeration<Rental> getRentals() {
			return _rentals.elements();
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
	}

	abstract class Statement {

		public String value(Customer aCustomer) {

			Enumeration<Rental> rentals = aCustomer.getRentals();
			String result = headerString(aCustomer);

			while (rentals.hasMoreElements()) {
				Rental each = (Rental) rentals.nextElement();
				// 이번에 대여하는 비디오 정보와 대여료를 출력
				result += eaxhRentalString(each);
			}

			// 푸터 행 추가
			result += footerString(aCustomer);

			return result;
		}

		public abstract String headerString(Customer aCustomer);

		public abstract String eaxhRentalString(Rental each);

		public abstract String footerString(Customer aCustomer);

	}

	class TextStatment extends Statement {

		@Override
		public String footerString(Customer aCustomer) {
			return "누적 대여료: " + String.valueOf(aCustomer.getTotalCharge()) + "\n" + "적립 포인트: "
					+ String.valueOf(aCustomer.getTotalFrequentRenterPoints());
		}

		@Override
		public String eaxhRentalString(Rental each) {
			return "/t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}

		@Override
		public String headerString(Customer aCustomer) {
			return aCustomer.getName() + "고객님의 대여 기록 \n";
		}
	}

	class HtmlStatement extends Statement {

		@Override
		public String footerString(Customer aCustomer) {
			return "<P>누적 대여료: <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" + "적립 포인트: <EM>"
					+ String.valueOf(aCustomer.getTotalFrequentRenterPoints() + "</EM><P>");
		}

		@Override
		public String eaxhRentalString(Rental each) {
			return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
		}

		@Override
		public String headerString(Customer aCustomer) {
			return "<H1><EM>" + aCustomer.getName() + " 고객님의 대여 기록</EM></H1><p>\n";
		}
	}

}
