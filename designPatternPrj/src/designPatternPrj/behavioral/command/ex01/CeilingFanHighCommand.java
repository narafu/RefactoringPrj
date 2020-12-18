package designPatternPrj.behavioral.command.ex01;

// ConcreteCommand : ConcreteCommand는 특정 행동과 Receiver 사이를 연결(bind)한다.
// Invoker에서 execute() 호출을 통해 요청을 하면 ConcreteCommand 객체에서 Receiver에 있는 메소드를 호출함으로써 그 작업을 처리한다.
// 이 클래스는 천장팬 속도를 높이는 행동과 Receiver인 CeilingFan 사이를 bind한다.
public class CeilingFanHighCommand implements Command {

	int prevSpeed;
	CeilingFan ceilingFan;

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	// Invoker에서 이 메소드를 호출하면 천장팬 속도를 높인다.
	// 이 때, undo 기능을 구현하기 위해 이전에 있던 속도 값을 저장해둔다.
	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	// 이전 속도를 바탕으로 속도를 재조정한다.
	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}

}
