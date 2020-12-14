package ch06;

public class RemoveAssignment01 {

	int before(int inputVal, int quantity, int yearToDate) {
		if (inputVal > 50)
			inputVal -= 2;
		return 0;
	}

	int after(int inputVal, int quantity, int yearToDate) {
		int result = inputVal;
		if (inputVal > 50)
			inputVal -= 2;
		return result;
	}

}
