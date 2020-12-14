package ch06;

public class RemoveAssignment02 {

//	before

	int before(int inputVal, int quantity, int yearToDate) {
		if (inputVal > 50)
			inputVal -= 2;
		if (quantity > 100)
			inputVal -= 1;
		if (yearToDate > 10000)
			inputVal -= 4;
		return inputVal;
	}

//	after
	// 매개변수 대신 사용할 임시변수를 선언한다.
	// 매개변수로의 값 대입을 임시변수로의 값 대입으로 수정한다.
	// 용도의 일관성으로 인해 코드파악이 수월해진다.

	int after(int inputVal, int quantity, int yearToDate) {
		int result = inputVal;
		if (inputVal > 50)
			result -= 2;
		if (quantity > 100)
			result -= 1;
		if (yearToDate > 10000)
			result -= 4;
		return result;
	}

}
