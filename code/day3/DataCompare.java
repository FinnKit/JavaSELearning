/*
	比较三个数的大小
*/

//导包
import java.util.Scanner;

class DataCompare{
	public static void main(String[] args){
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第1个数字");
		//利用对象录入数据
		int x = sc.nextInt();
		System.out.println("请输入第2个数字");
		int y = sc.nextInt();
		System.out.println("请输入第3个数字");
		int z = sc.nextInt();
		int max = (x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("max:"+max);
	}
}