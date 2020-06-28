package 观察者设计模式;
/**
 * 调料抽象类  也就是装饰类
 ******************************************
 * @author ctzeng  [2020年6月28日 下午3:11:45]
 * @version 1.0.0
 ******************************************
 */
public abstract class CondimentDecoator extends Beverage{
	
	public abstract String getDescription();
	
}
