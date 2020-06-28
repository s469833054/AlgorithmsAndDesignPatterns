package AlgoCasts;
/**
 * 这个题目说的是，给你两个整数，在不使用 +/- 这两个运算符的前提下，求它们的和。
 ******************************************
 * @author ctzeng  [2020年1月17日 下午1:57:42]
 * @version 1.0.0
 ******************************************
 */
public class 不用加号减号求两数之和 {
	
	//按位与& 从高位开始两个都为1 为1，否则 为0
	//按位或| 从高位开始只要1个为1 为1，否则 为0
	//异或^= 从高位开始相同为0，否则 为1
	//左移位<<1 向左移位1位，最低位补0，原来的第二高位现在成为最高位
	//右移位>>1 向右移位1位，最高位补上符号位，且不变
	public int getSumRecursive(int a,int b) {
		return b == 0? a:getSumRecursive(a^b, (a&b)<<1);
	}
	
	public int getSumIterative(int a ,int b) {
		while(b != 0) {
			int sum = a^b;
			int carry = (a&b)<<1;
			a=sum;
			b=carry;
		}
		return a;
	}
	
	public static void main(String[] args) {
		不用加号减号求两数之和 s = new 不用加号减号求两数之和();
		s.getSumIterative(9, 11);
	}
}
