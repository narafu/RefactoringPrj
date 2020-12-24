package ch09_Decompose;

public class Ex05_ReplaceNestedConditionalWithGuardClauses {

	// 메서드에 조건문이 있어서 정상적인 실행 경로를 파악하기 힘들 땐, 감시절을 사용하자

	class Ex01 {
		private double result;
		private boolean isDead;
		private boolean isSeparated;
		private boolean isRetired;

		class Before {

			double getPayAmount() {
				if (isDead)
					result = deadAmount();
				else {
					if (isSeparated)
						result = separetedAmount();
					else
						result = normalPayAmount();
				}
				return result;
			}

			private double deadAmount() {
				// TODO Auto-generated method stub
				return 0;
			}

			private double normalPayAmount() {
				// TODO Auto-generated method stub
				return 0;
			}

			private double separetedAmount() {
				// TODO Auto-generated method stub
				return 0;
			}
		}

		class After {

			double getPayAmount() {
				if (isDead)
					return deadAmount();
				if (isSeparated)
					return separetedAmount();
				if (isRetired)
					return normalPayAmount();
				return result;
			}

			private double deadAmount() {
				// TODO Auto-generated method stub
				return result;
			}

			private double normalPayAmount() {
				// TODO Auto-generated method stub
				return result;
			}

			private double separetedAmount() {
				// TODO Auto-generated method stub
				return result;
			}
		}
	}

	class Ex02 {

		public static final double ADJ_FACTOR = 0;
		public double capital;
		public double inRate;
		public double duration;
		public double income;

		class Before {

			public double getAdjustedCapital() {
				double result = 0.0;
				if (capital > 0.0) {
					if (inRate > 0.0 && duration > 0.0) {
						result = (income / duration) * ADJ_FACTOR;
					}
				}
				return result;
			}
		}

		class After {

			public double getAdjustedCapital() {
				if (capital <= 0.0)
					return 0.0;
				if (inRate <= 0.0 && duration <= 0.0)
					return 0.0;
				return (income / duration) * ADJ_FACTOR;
			}

			public double mine() {
				if (extracted01())
					return extracted02();
				else
					return 0.0;
			}

			private boolean extracted01() {
				return capital > 0.0 && inRate > 0.0 && duration > 0.0;
			}

			private double extracted02() {
				return (income / duration) * ADJ_FACTOR;
			}

		}
	}
}
