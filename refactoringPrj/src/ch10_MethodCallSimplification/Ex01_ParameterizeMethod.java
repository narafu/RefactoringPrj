package ch10_MethodCallSimplification;

public class Ex01_ParameterizeMethod {

	// 여러 메서드가 기능은 비슷하고 안에 든 값만 다를 땐,
	// 서로 다른 값을 하나의 매개변수로 전달받는 매서드를 하나 작성하자.

	class Dollars {

		public Dollars(double result) {
		}
	}

	private int lastUsage() {
		return 0;
	}

	class Before {

		protected Dollars baseCharge() {
			double result = Math.min(lastUsage(), 100) * 0.03;
			if (lastUsage() > 100) {
				result += (Math.min(lastUsage(), 200) - 100) * 0.05;
			}
			if (lastUsage() > 200) {
				result += (lastUsage() - 200) * 0.07;
			}
			return new Dollars(result);
		}

	}

	class After {

		protected Dollars baseCharge() {
			double result = usageInRange(0, 100) * 0.03;
			result += usageInRange(100, 200) * 0.05;
			result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
			return new Dollars(result);
		}

		private double usageInRange(int start, int end) {
			if (lastUsage() > start)
				return Math.min(lastUsage(), end) - start;
			else
				return 0;
		}

	}

}
