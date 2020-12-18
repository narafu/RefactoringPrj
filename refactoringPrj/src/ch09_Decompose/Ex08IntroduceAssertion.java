package ch09_Decompose;

import org.junit.Assert;

public class Ex08IntroduceAssertion {

	// 일부 코드가 프로그램의 어떤 상태를 전제할 땐 어설션을 넣어서 그 전제를 확실하게 코드로 작성하자.
	// 어설션 : 항상 참으로 전제되는 조건문.
	// 어설션이 실패하면 그건 프로그래머가 오류를 범한 것이다. 그래서 어설션이 실패할 경우, 반드시 예외를 통지해야한다.

	public double expenseLimit;
	public double NULL_EXPENSE;
	public PrimaryProject primaryProject;

	class PrimaryProject {

		private double memberExpenseLimit;

		double getMemberExpenseLimit() {
			return memberExpenseLimit;
		}

	}

	class Before {

		double getExpenseLimit() {
			return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
		}
	}

	class After {

		double getExpenseLimit() {
			Assert.isTrue(expenseLimit != NULL_EXPENSE || primaryProject != null);
			return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
		}
	}

}
