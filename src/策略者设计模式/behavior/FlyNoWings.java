package 策略者设计模式.behavior;

public class FlyNoWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}

}
