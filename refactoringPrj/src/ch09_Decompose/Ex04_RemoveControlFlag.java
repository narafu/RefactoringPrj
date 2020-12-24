package ch09_Decompose;

public class Ex04_RemoveControlFlag {

	// 논리 연산식의 제어 플래그 역할을 하는 변수가 있을 땐 그 변수를 break문이나 return문으로 바꾸자.

	public void sendAlert() {
		// TODO Auto-generated method stub
	}

	class Before {

		void checkSecurity(String[] people) {
			boolean found = false;
			for (int i = 0; i < people.length; i++) {
				if (!found) {
					if (people[i].equals("Don")) {
						sendAlert();
						found = true;
					}
					if (people[i].equals("John")) {
						sendAlert();
						found = true;
					}
				}
			}
		}
	}

	class After01 {

		void checkSecurity(String[] people) {
			for (int i = 0; i < people.length; i++) {
				if (people[i].equals("Don")) {
					sendAlert();
					break;
				}
				if (people[i].equals("John")) {
					sendAlert();
					break;
				}
			}
		}
	}

	class After02 {

		String foundMiscreant(String[] people) {
			for (int i = 0; i < people.length; i++) {
				if (people[i].equals("Don")) {
					sendAlert();
					return "Don";
				}
				if (people[i].equals("John")) {
					sendAlert();
					return "John";
				}
			}
			return "";
		}
	}

}
