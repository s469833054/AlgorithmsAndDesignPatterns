package 装饰者设计模式;
/**
 * 星巴克咖啡-饮料类
 ******************************************
 * @author ctzeng  [2020年6月28日 下午3:27:02]
 * @version 1.0.0
 ******************************************
 */
public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}
	
}
