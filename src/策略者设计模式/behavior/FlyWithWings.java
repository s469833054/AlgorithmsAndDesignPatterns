package 策略者设计模式.behavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I am flying");
	}

}
