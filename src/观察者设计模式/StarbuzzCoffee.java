package 观察者设计模式;
/**
 * 测试类 - 供应咖啡
 ******************************************
 * @author ctzeng  [2020年6月28日 下午4:03:19]
 * @version 1.0.0
 ******************************************
 */
public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		
		Beverage beverage2 = new Espresso();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		beverage3 = new Soy(beverage3);
		System.out.println(beverage3.getDescription()+"$"+beverage3.cost());
		
	}
}
