package command;

public class PowerButton {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		System.out.println("Executing command");
		this.command.execute();
	}
	}
