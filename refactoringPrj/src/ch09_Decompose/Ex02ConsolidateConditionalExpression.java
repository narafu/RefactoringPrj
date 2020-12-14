package ch09_Decompose;

public class Ex02ConsolidateConditionalExpression {

	public int seniority;
	public int monthsDisabled;
	public boolean isPartTime;

	public boolean onVactaion() {
		// TODO Auto-generated method stub
		return false;
	}

	public int lengthOfService() {
		// TODO Auto-generated method stub
		return 0;
	}

	class Before {

		double disabilityAmount() {

			if (seniority < 2)
				return 0;
			if (monthsDisabled > 12)
				return 0;
			if (isPartTime)
				return 0;

			if (onVactaion() && lengthOfService() > 10) {
				return 1;
			} else {
				return 0.5;
			}
		}

	}

	class After {

		double disabilityAmount() {

			if (isNotEligableForDisability())
				return 0;
			return (onVactaion() && lengthOfService() > 10) ? 1 : 0.5;
		}

		private boolean isNotEligableForDisability() {
			return seniority < 2 || monthsDisabled > 12 || isPartTime;
		}

	}

}
