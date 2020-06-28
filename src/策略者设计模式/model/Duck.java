package 策略者设计模式.model;

import 策略者设计模式.behavior.FlyBehavior;
import 策略者设计模式.behavior.QuackBehavior;

public class Duck {
	
	FlyBehavior flyBehavior;
	
	QuackBehavior quackBehavior;

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performQuack() {
		quackBehavior.Quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
}
