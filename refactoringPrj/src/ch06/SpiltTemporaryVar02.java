package ch06;

public class SpiltTemporaryVar02 {

//	 before

	private int _primaryForce;
	private int _mass;
	private int _delay;
	private int _secondaryForce;

	double getDistanceTravelled1(int time) {
		double result;
		double acc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		int secondaryTime = time - _delay;
		if (secondaryTime > 0) {
			double primartVel = acc * _delay;
			acc = (_primaryForce + _secondaryForce) / _mass;
			result += primartVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
		}
		return result;
	}

//	after

	double getDistanceTravelled2(int time) {
		double result;
		double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secondaryTime = time - _delay;
		if (secondaryTime > 0) {
			double primartVel = primaryAcc * _delay;
			double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
			result += primartVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
		}
		return result;
	}

}
