package command;

public class ConsoleOffCommand implements Command {

	private Console console;
	
	public ConsoleOffCommand(Console console) {
		this.console = console;
	}
	@Override
	public void execute() {
		this.console.switchOff();{
		}
	}
}
