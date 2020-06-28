package 策略者设计模式.model;

import 策略者设计模式.behavior.FlyNoWings;
import 策略者设计模式.behavior.Squeak;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWings();
	}
}
