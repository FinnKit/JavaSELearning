/*
	�ж��������Ƿ����
*/
import java.util.Scanner;

class MethodDemo3{
	public static void main(String[] args){
		//���̼���������
		Scanner sc =  new Scanner(System.in);
		System.out.print("�������һ������");
		int num1 = sc.nextInt();
		System.out.print("������ڶ�������");
		int num2 = sc.nextInt();
		//��ֵ���÷���
		boolean result = getEqual(num1, num2);
		System.out.println("�����������Ƿ���ȣ�" + result);
	}
	public static boolean getEqual(int a, int b){
		return a == b;
	}
}
