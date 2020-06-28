package 策略者设计模式.behavior;

/**
 * 木头鸭子叫
 ******************************************
 * @author ctzeng  [2020年5月25日 下午4:04:08]
 * @version 1.0.0
 ******************************************
 */
public class MuteQuack implements QuackBehavior{

	@Override
	public void Quack() {
		System.out.println("MuteQuack");
		
	}

}
