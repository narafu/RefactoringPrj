package ch11_generalization;

import java.util.Vector;

public class Ex03_ReplaceInheritanceWithDelegation {

	// 하위클래스가 상위클래스 인터페이스의 일부만 사용할 때나 데이터를 상속받지 않게 해야할 땐,
	// 상위클래스에 필드를 작성하고, 모든 메서드가 그 상위클래스에 위임하게 수정한 후 하위클래스를 없애자.

	class MyStack extends Vector {

		public void push(Object element) {
			insertElementAt(element, 0);
		}

		public void insertElementAt(Object element, int i) {
			// TODO Auto-generated method stub
		}
	}

	public Object pop() {
		Object result = firstElement();
		removeElementAt(0);
		return result;
	}

	private void removeElementAt(int i) {
		// TODO Auto-generated method stub

	}

	private Object firstElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
