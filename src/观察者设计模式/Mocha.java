package 观察者设计模式;

/**
 * 摩卡  - 调料装饰类
 ******************************************
 * @author ctzeng  [2020年6月28日 下午3:37:41]
 * @version 1.0.0
 ******************************************
 */
public class Mocha extends CondimentDecoator{
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + ",Mocha";
	}

	@Override
	public double cost() {
		
		return 0.2+beverage.cost() ;
	}

}
