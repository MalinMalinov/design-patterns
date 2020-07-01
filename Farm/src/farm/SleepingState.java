package farm;

public class SleepingState implements State {
private String stateName = "SLEEPING_STATE";
	
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
}
}

