package farm;

public class IdleState implements State {
private String stateName = "IDLE_STATE";
	
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
}
	}
