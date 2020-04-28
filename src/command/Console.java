package command;

public class Console {

	
	private Boolean consoleOn;
	
	public void switchOn() {
		System.out.println("Console is on");
		this.consoleOn = true;
	}
	
	public void switchOff() {
		System.out.println("Console is off");
		this.consoleOn = false;
}
}