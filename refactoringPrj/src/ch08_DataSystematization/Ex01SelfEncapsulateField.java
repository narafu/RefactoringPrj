package ch08_DataSystematization;

public class Ex01SelfEncapsulateField {

	class BeforeEx1 {

		private int low, high;

		boolean includes(int arg) {
			return low <= arg && arg <= high;
		}

	}

	class AfterEx1 {

		private int low, high;

		boolean includes(int arg) {
			return low <= arg && arg <= high;
		}

		int getLow() {
			return low;
		}

		int getHigh() {
			return high;
		}

	}

	class BeforeIntRange {

		private int low, high;

		boolean includes(int arg) {
			return low <= arg && arg <= high;
		}

		void grow(int factor) {
			high = high * factor;
		}

		BeforeIntRange(int low, int high) {
			this.low = low;
			this.high = high;
		}

	}

	class AfterIntRange {

		private int low, high;

		boolean includes(int arg) {
			return low <= arg && arg <= high;
		}

		void grow(int factor) {
			high = high * factor;
		}

		public int getLow() {
			return low;
		}

		public void setLow(int low) {
			this.low = low;
		}

		public int getHigh() {
			return high;
		}

		public void setHigh(int high) {
			this.high = high;
		}

	}

}
