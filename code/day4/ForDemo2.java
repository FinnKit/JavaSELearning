/*
	���������ݵĽ׳ˣ�10���ڣ�
*/
import java.util.Scanner;

class ForDemo2{
	public static void main(String[] args){
		//�Ӽ����е���һ������
		Scanner sc = new Scanner(System.in);
		System.out.println("������10���ڵ�����");
		int num = sc.nextInt();
		//�ж������Ƿ�������ȷ
		if(num >= 1 && num <= 10){
			//������׳�
			int data  = num;
			for(int x = num - 1; x >= 1; x--){
				data *= x;
			}
			System.out.println("���������" + num + "�Ľ׳�Ϊ��" + data);
		}
		else{
			System.out.println("�������������");
		}
		
		
	}
}