package AlgoCasts;

import java.util.HashSet;
import java.util.Set;

/**
 * 这个题目说的是，给你一个非空的整数数组，这个数组中有一个整数只出现了一次，其它的整数都出现两次，你要找出这个只出现一次的整数。

比如说，给你的数组是：

5, 7, 5, 6, 6

这里 7 只出现了一次，因此你要返回的就是 7。
 ******************************************
 * @author ctzeng  [2020年3月23日 上午9:43:12]
 * @version 1.0.0
 ******************************************
 */
public class 单身数字 {
	
	public int singleNum(int [] arr) {
		Set<Integer> set =new HashSet<>();
		int sum = 0;
		int uniqeSum = 0;
		for (int num : arr) {
			if(set.contains(num)) {
				uniqeSum  +=sum ;
				set.add(uniqeSum);
			}
			sum += num;
		}
		return 2*uniqeSum -sum;
	}
}
