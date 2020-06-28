package 策略者设计模式.behavior;

/**
 * 橡皮鸭子叫
 ******************************************
 * @author ctzeng  [2020年5月25日 下午4:03:51]
 * @version 1.0.0
 ******************************************
 */
public class Squeak implements QuackBehavior {

	@Override
	public void Quack() {
		System.out.println("Squeak");
	}

}
