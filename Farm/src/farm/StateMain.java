package farm;

public class StateMain {
	public static void main(String[] args)
	{	
	IdleState idleState = new IdleState();
	EatingState eatingState = new EatingState();
	SleepingState sleepingState = new SleepingState();
	
Context horse = new Context("Marko");

Context cow = new Context("Polo");

idleState.applyState(horse);
eatingState.applyState(horse);
sleepingState.applyState(horse);
idleState.applyState(cow);
eatingState.applyState(cow);
sleepingState.applyState(cow);

	}

}
