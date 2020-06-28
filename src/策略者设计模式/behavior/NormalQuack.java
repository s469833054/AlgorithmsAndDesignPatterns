package 策略者设计模式.behavior;

/**
 * 正常鸭子叫
 ******************************************
 * @author ctzeng  [2020年5月25日 下午4:04:46]
 * @version 1.0.0
 ******************************************
 */
public class NormalQuack implements QuackBehavior{

	@Override
	public void Quack() {
		System.out.println("NormalQuack");
		
	}

}
