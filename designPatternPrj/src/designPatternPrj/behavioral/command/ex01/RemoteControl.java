package designPatternPrj.behavioral.command.ex01;

import java.util.Arrays;

// Invoker : 명령(Command)이 들어있으며, execute() 메소드를 호출함으로써 커맨드 객체에게 특정 작업을 수행해 달라는 요구를 한다.
public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public RemoteControl() {

		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	// setCommand() 메소드로 리모컨의 각 슬롯에 특정 명령을 지정해놓는다.
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	// 특정 슬롯의 ON 버튼이 눌러지면, 해당 슬롯의 ONCommand의 execute() 메소드를 호출한다.
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	@Override
	public String toString() {
		return "RemoteControl [onCommands=" + Arrays.toString(onCommands) + ", offCommands="
				+ Arrays.toString(offCommands) + ", undoCommand=" + undoCommand + "]";
	}

	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

}
