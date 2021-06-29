/*
	求输入数据的阶乘（10以内）
*/
import java.util.Scanner;

class ForDemo2{
	public static void main(String[] args){
		//从键盘中导入一个数字
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入10以内的数字");
		int num = sc.nextInt();
		//判断数字是否输入正确
		if(num >= 1 && num <= 10){
			//计算其阶乘
			int data  = num;
			for(int x = num - 1; x >= 1; x--){
				data *= x;
			}
			System.out.println("输入的数字" + num + "的阶乘为：" + data);
		}
		else{
			System.out.println("输入的数字有误");
		}
		
		
	}
}