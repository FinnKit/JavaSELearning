/*
	�����������������ֵ
*/
import java.util.Scanner;

class MethodDemo2{
	public static void main(String[] args){
		//��������������
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ�����֣�");
		int num1 = sc.nextInt();
		System.out.print("������ڶ������֣�");
		int num2 = sc.nextInt();
		//��ֵ���������ֵ�ķ���
		int max = getMaxNum(num1, num2);
		System.out.println("���ֵΪ��"+ max);
	}
	public static int getMaxNum(int a, int b){
		return (a > b) ? a : b;
	}
}