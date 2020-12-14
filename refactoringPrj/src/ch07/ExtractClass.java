package ch07;

public class ExtractClass {

	class Person {

		private String _name;
		private String _officeAreaCode;
		private String _officeNumber;

		private TelephoneNumber _officeTelephone = new TelephoneNumber();

		public String getName() {
			return _name;
		}

		public String getTelephoneNumber() {
			return _officeTelephone.getTelephoneNumber();
		}

		public TelephoneNumber getOfficeTelephone() {
			return _officeTelephone;
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

	class TelephoneNumber {

		private String _number;
		private String _areaCode;

		public String getTelephoneNumber() {
			return ("(" + _areaCode + ") " + _number);
		}

		public String getAreaCode() {
			return _areaCode;
		}

		public void setAreaCode(String areaCode) {
			this._areaCode = areaCode;
		}

		public String getNumber() {
			return _number;
		}

		public void setNumber(String arg) {
			this._number = arg;
		}

	}

}
