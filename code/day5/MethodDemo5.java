/*
	键盘录入一个数据n(1<=n<=9)，输入对应的nn乘法表
*/
import java.util.Scanner;

class MethodDemo5{
	public static void main(String[] args){
		//键入数据
		Scanner sc = new Scanner(System.in);
		System.out.print("请输出一个在1到9的整数数据:");
		int num = sc.nextInt();
		//判断数据是否正确
		if(num >=1 && num <=9){
			printNN(num);
		}else{
			System.out.println("数据输入错误");
		}
	}
	
	//打印n*n乘法表
	public static void printNN(int a){
		for(int i = 1; i <= a; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.print("\n");
		}
	}
}