/*
	判断两个数是否相等
*/
import java.util.Scanner;

class MethodDemo3{
	public static void main(String[] args){
		//键盘键入两个数
		Scanner sc =  new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int num1 = sc.nextInt();
		System.out.print("请输入第二个数：");
		int num2 = sc.nextInt();
		//赋值调用方法
		boolean result = getEqual(num1, num2);
		System.out.println("以上两个数是否相等：" + result);
	}
	public static boolean getEqual(int a, int b){
		return a == b;
	}
}
