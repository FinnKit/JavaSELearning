/*
	�ж������������ֵ
*/
import java.util.Scanner;

class MethodDemo4{
	public static void main(String[] args){
		//���̼���������
		Scanner sc =  new Scanner(System.in);
		System.out.print("�������һ������");
		int num1 = sc.nextInt();
		System.out.print("������ڶ�������");
		int num2 = sc.nextInt();
		System.out.print("���������������");
		int num3 = sc.nextInt();
		//��ֵ���÷���
		int maxNum = getMaxNum(num1, num2, num3);
		System.out.println("���������ֵΪ��" + maxNum);
	}
	public static int getMaxNum(int a, int b, int c){
		return (a>b) ? (a>c?a:c) : (b>c?b:c);
	}
}
