/*
	需求：通过键盘键入数字，并且判断该数字是否为偶数
*/
//导包
import java.util.Scanner;
class DataEven{
	public static void main(String[] args){
		//新建一个新对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		//利用对象存储到变量中
		int DataScanner = sc.nextInt();
		if(DataScanner % 2 == 0){
			System.out.println(DataScanner + "是一个偶数");
		}else{
			System.out.println(DataScanner + "不是一个偶数");
		}
	}
}