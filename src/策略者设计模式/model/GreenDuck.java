package 策略者设计模式.model;

import 策略者设计模式.behavior.FlyWithWings;
import 策略者设计模式.behavior.NormalQuack;

public class GreenDuck extends Duck{
	
	public GreenDuck() {
		quackBehavior = new NormalQuack();
		flyBehavior = new FlyWithWings();
	}
}
