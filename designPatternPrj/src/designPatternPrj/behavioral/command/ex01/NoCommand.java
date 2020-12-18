package designPatternPrj.behavioral.command.ex01;

// NoCommand 객체는 일종의 Null Object(널 객체)이다.
// 리턴할 객체는 없지만 클라이언트 쪽에서 null을 처리하지 않아도 되게 하고 싶을 때 활용하면 좋다.
public class NoCommand implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
