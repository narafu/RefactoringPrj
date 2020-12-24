package ch09_Decompose;

public class Ex10_RemoveSettingMethod {

	// 생성할 때 지정한 필드 값이 절대로 변경되지 말아야 할 땐, 그 필드를 설정하는 모든 쓰기 메서드를 삭제하자.
	// 쓰기 메서드가 있다는 건 필드 값을 변경할 수 있다는 얘기다.
	// 객체가 생성된 후에는 필드가 변경되지 말아야 한다면, 쓰기 메서드를 작성하지 않아야 한다.

	class Before {

		class Account {
			private String id;

			Account(String id) {
				setId(id);
			}

			void setId(String id) {
				this.id = id;
			}
		}
	}

	class After {

		class Account {
			private final String id;

			Account(String id) {
				this.id = id;
			}
		}
	}

}
