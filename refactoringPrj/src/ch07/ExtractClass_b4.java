package ch07;

public class ExtractClass_b4 {

//	두 클래스가 처리해야할 기능이 하나의 클래스에 들어 있을 땐
//		새 클래스룰 만들고, 기존 클래스의 관련 필드와 메소드를 새 클래스로 옮기자

	class Person {

		private String _name;
		private String _officeAreaCode;
		private String _officeNumber;

		public String getName() {
			return _name;
		}

		public String getTelephoneNumber() {
			return ("(" + _officeAreaCode + ") " + _officeNumber);
		}

		public String getOfficeAreaCode() {
			return _officeAreaCode;
		}

		public void setOfficeAreaCode(String arg) {
			this._officeAreaCode = arg;
		}

		public String getOfficeNumber() {
			return _officeNumber;
		}

		public void setOfficeNumber(String arg) {
			this._officeNumber = arg;
		}

	}

}
