package 装饰者设计模式;
/**
 * 黄豆 - 调料装饰类
 ******************************************
 * @author ctzeng  [2020年6月28日 下午3:43:09]
 * @version 1.0.0
 ******************************************
 */
public class Soy extends CondimentDecoator{
	
	Beverage beverage;
	public Soy(Beverage beverage) {
		this.beverage  = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Soy";
	}

	@Override
	public double cost() {
		return 0.3+beverage.cost();
	}

}
