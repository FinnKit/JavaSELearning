/*
	�Ƚ��������Ĵ�С
*/

//����
import java.util.Scanner;

class DataCompare{
	public static void main(String[] args){
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������1������");
		//���ö���¼������
		int x = sc.nextInt();
		System.out.println("�������2������");
		int y = sc.nextInt();
		System.out.println("�������3������");
		int z = sc.nextInt();
		int max = (x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("max:"+max);
	}
}