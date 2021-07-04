/*
	求输入两个数的最大值
*/
import java.util.Scanner;

class MethodDemo2{
	public static void main(String[] args){
		//键盘输入两个数
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		int num1 = sc.nextInt();
		System.out.print("请输入第二个数字：");
		int num2 = sc.nextInt();
		//赋值调用求最大值的方法
		int max = getMaxNum(num1, num2);
		System.out.println("最大值为："+ max);
	}
	public static int getMaxNum(int a, int b){
		return (a > b) ? a : b;
	}
}