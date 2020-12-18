package designPatternPrj.behavioral.command.ex01;

// 모든 커맨드 객체에서 구현해야 하는 인터페이스(Interface)
// 모든 명령은 execute() 메소드 호출을 통해 수행되며, 이 메소드에서는 Receiver에 특정 작업을 처리하라는 지시를 전달한다.
// Command : 모든 커맨드 객체에서 구현해야 하는 인터페이스이다. Receiver에게 시킬 모든 명령은 execute() 메소드 호출을 통해 수행되며, 이 메소드에서는 Receiver에 특정 작업을 처리하라는 지시를 전달한다.
public interface Command {

	public void execute();

	public void undo();

}
