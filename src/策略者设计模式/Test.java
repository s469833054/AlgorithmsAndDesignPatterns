package 策略者设计模式;

import 策略者设计模式.behavior.FlyNoWings;
import 策略者设计模式.behavior.MuteQuack;
import 策略者设计模式.model.Duck;
import 策略者设计模式.model.GreenDuck;

public class Test {
	public static void main(String[] args) {
		Duck duck = new GreenDuck();
		duck.performQuack();
		duck.performFly();
		duck.setQuackBehavior(new MuteQuack());
		duck.setFlyBehavior(new FlyNoWings());
		duck.performFly();
		duck.performQuack();
	}
}
