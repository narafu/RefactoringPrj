package ch08_DataSystematization;

public class Ex03ReplaceArrayWithObj {

	// 배열을 구성하는 특정 원소가 별의별 의미를 지닐 땐
	// 그 배열을 각 원소마다 필드가 하나씩 든 객체로 전환하자.

	void before() {

		String[] row = new String[3];
		row[0] = "Liverpool";
		row[1] = "15";
	}

	void after() {

		class Performance {

			@SuppressWarnings("unused")
			private String name, wins;

			public void setName(String name) {
				this.name = name;
			}

			public void setWins(String wins) {
				this.wins = wins;
			}
		}

		Performance row = new Performance();
		row.setName("");
		row.setWins("15");
	}
}