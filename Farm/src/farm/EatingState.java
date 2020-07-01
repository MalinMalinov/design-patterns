package farm;

public class EatingState implements State {
private String stateName = "EATING_STATE";
	
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.stateName;
}
}
