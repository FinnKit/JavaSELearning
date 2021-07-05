/*
	某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全。
	在传递过程中需要加密，加密规则如下：
	A：将数据倒序
	B：将每位数字都加上5，在用和除以10的余数代替该数字
	C：将第一位和最后一位数字交换
	请任意给定一个小于8位的整数，然后将加密的数据打印出来
*/
import java.util.Scanner;
class Encryption{
	public static void main(String[] args){
		//创建键盘键入对象
		Scanner sc =  new Scanner(System.in);
		System.out.println("请输入小于8位的整数");
		int data = sc.nextInt();
		//调用加密方法，返回为字符串
		String dataEncryption = encryption(data);
		System.out.println(dataEncryption);
	}
	public static String encryption(int dataNum){
		//将数据存入一维数组中
		int[] dataArray = new int[8]; //由于小于8位，则直接定义数组中保存8个元素		
		//使用while循环语句进行存储
		int dataLength = 0;//统计数据位数
		while(dataNum > 0){	//while结束条件为dataNum为0
			dataArray[dataLength] = dataNum % 10;	//最小位存数据的最小位
			dataLength++;
			dataNum /= 10;
		}
		System.out.println(dataLength);
		for(int index = dataLength - 1; index >= 0; index--){
			System.out.print(dataArray[index]);//输出从最高位开始输出
		}
		System.out.println();
		//加密1
		int temp = 0;
		for(int start = 0, end = dataLength - 1; start < end; start++, end--){
			temp = dataArray[start];
			dataArray[start] = dataArray[end];
			dataArray[end] = temp;
		}
		for(int index = dataLength - 1; index >= 0; index--){
			System.out.print(dataArray[index]);
		}
		System.out.println();
		//加密2
		for(int index = 0; index < dataLength; index++){
			dataArray[index] += 5;
			dataArray[index] %= 10;
		}
		for(int index = dataLength - 1; index >= 0; index--){
			System.out.print(dataArray[index]);
		}
		System.out.println();
		//加密3
		temp = dataArray[0];
		dataArray[0] = dataArray[dataLength - 1];
		dataArray[dataLength - 1] = temp;
		for(int index = dataLength - 1; index >= 0; index--){
			System.out.print(dataArray[index]);
		}
		System.out.println();
		//形成字符串
		String str = "";//字符串初始化
		for(int index = dataLength - 1; index >= 0; index--){
			str += dataArray[index];//注意从高位开始拼接
		}
		return str;
	}
}