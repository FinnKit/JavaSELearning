/*
	��ȡ���������ֵ
*/
import java.util.Scanner;
class ArrayDemo4{
	public static void main(String[] args){
		String[] weekArr = {"����һ","���ڶ�","������","������","������","������","������"};
		//�������̼����ַ�������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ڣ�");
		String weekStr = sc.nextLine();
		//���÷�����ȡ����ֵ
		if(getWeekStrIndex(weekArr, weekStr) == -1){
			System.out.println("�������������");
		}else{
			int indexReal = getWeekStrIndex(weekArr, weekStr) + 1;
			System.out.println("��������������ڵ�" + indexReal + "��");
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