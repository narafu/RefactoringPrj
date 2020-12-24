package ch11_generalization;

public class Ex04_ReplaceDelegationWithInheritance {

	class Person {

		String name;

		public String getName() {
			return name;
		}

		public void setName(String arg) {
			name = arg;
		}

		public String getLastName() {
			return name.substring(name.lastIndexOf(' ') + 1);
		}
	}

	class Before {

		class Employ {

			Person person = new Person();

			public String getName() {
				return person.getName();
			}

			public void setName(String arg) {
				person.setName(arg);
			}

			public String toString() {
				return "사원 " + person.getLastName();
			}
		}
	}

	class After {

		class Employ extends Person {

			public String toString() {
				return "사원 " + getLastName();
			}
		}
	}

}
