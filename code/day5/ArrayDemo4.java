/*
	获取数组的索引值
*/
import java.util.Scanner;
class ArrayDemo4{
	public static void main(String[] args){
		String[] weekArr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		//创建键盘键入字符串对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个星期：");
		String weekStr = sc.nextLine();
		//调用方法获取索引值
		if(getWeekStrIndex(weekArr, weekStr) == -1){
			System.out.println("输入的数据有误");
		}else{
			int indexReal = getWeekStrIndex(weekArr, weekStr) + 1;
			System.out.println("您所输入的星期在第" + indexReal + "个");
		}	
	}
	public static int getWeekStrIndex(String[] strArray, String str){
		for(int index = 0; index < strArray.length; index++){
			if(strArray[index].equals(str)){
				return index;
			}
		}
		return -1;
	}
}