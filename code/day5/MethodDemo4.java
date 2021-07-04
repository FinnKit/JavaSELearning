/*
	判断三个数中最大值
*/
import java.util.Scanner;

class MethodDemo4{
	public static void main(String[] args){
		//键盘键入三个数
		Scanner sc =  new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int num1 = sc.nextInt();
		System.out.print("请输入第二个数：");
		int num2 = sc.nextInt();
		System.out.print("请输入第三个数：");
		int num3 = sc.nextInt();
		//赋值调用方法
		int maxNum = getMaxNum(num1, num2, num3);
		System.out.println("三个数最大值为：" + maxNum);
	}
	public static int getMaxNum(int a, int b, int c){
		return (a>b) ? (a>c?a:c) : (b>c?b:c);
	}
}
