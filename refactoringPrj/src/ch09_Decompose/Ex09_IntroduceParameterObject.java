package ch09_Decompose;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Ex09_IntroduceParameterObject {

	// 여러 개의 매개변수가 항상 붙어 다닐 땐 그 매개변수들을 객체로 바꾸자.

	class Entry {

		private double value;
		private Date chargeDate;

		Entry(double value, Date chargeDate) {
			this.value = value;
			this.chargeDate = chargeDate;
		}

		Date getDate() {
			return chargeDate;
		}

		double getValue() {
			return value;
		}
	}

	class Before {

		class Account {

			private Vector<Entry> entries;

			double getFlowBetween(Date start, Date end) {

				double result = 0;
				Enumeration<Entry> e = entries.elements();

				while (e.hasMoreElements()) {
					Entry each = e.nextElement();
					if (each.getDate().equals(start) || each.getDate().equals(end)
							|| (each.getDate().equals(end) && each.getDate().before(end))) {
						result += each.getValue();
					}
				}
				return result;
			}
		}

	}

	class After {

		class Account {

			private Vector<Entry> entries;

			double getFlowBetween(DateRange range) {

				double result = 0;
				Enumeration<Entry> e = entries.elements();

				while (e.hasMoreElements()) {
					Entry each = e.nextElement();
					if (range.includes(each.getDate())) {
						result += each.getValue();
					}
				}
				return result;
			}

		}

		class DateRange {

			private final Date start;
			private final Date end;

			DateRange(Date start, Date end) {
				this.start = start;
				this.end = end;
			}

			Date getStart() {
				return this.start;
			}

			Date getEnd() {
				return this.end;
			}

			private boolean includes(Date arg) {
				return arg.equals(start) || arg.equals(end) || (arg.equals(end) && arg.before(end));
			}
		}
	}
}
