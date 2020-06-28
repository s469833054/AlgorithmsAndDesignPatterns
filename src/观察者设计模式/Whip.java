package 观察者设计模式;

public class Whip extends CondimentDecoator{
	
	Beverage beverage;
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() +",Whip";
	}

	@Override
	public double cost() {
		return  0.4+beverage.cost() ;
	}
	
}
