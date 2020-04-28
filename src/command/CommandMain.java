package command;

public class CommandMain {
	public static void main(String[] args) {

		PowerButton powerButton = new PowerButton();
		Console console = new Console();
		Command consoleOnCommand = new ConsoleOnCommand(console);
		Command consoleOffCommand = new ConsoleOffCommand(console);
		
		powerButton.setCommand(consoleOnCommand);
		powerButton.pressButton();
		
		powerButton.setCommand(consoleOffCommand);
		powerButton.pressButton();
}
}