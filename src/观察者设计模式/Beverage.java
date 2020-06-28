package 观察者设计模式;
/**
 * 饮料基类
 ******************************************
 * @author ctzeng  [2020年6月28日 下午3:05:57]
 * @version 1.0.0
 ******************************************
 */
public abstract class Beverage {
	String description = "Unkown Beverage";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
