package command;

public class ConsoleOnCommand implements Command {

	private Console console;
	
	public ConsoleOnCommand(Console console) {
		this.console = console;
	}

	@Override
	public void execute() {
		this.console.switchOn();
	}
	}