/*
	����ͨ�����̼������֣������жϸ������Ƿ�Ϊż��
*/
//����
import java.util.Scanner;
class DataEven{
	public static void main(String[] args){
		//�½�һ���¶���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����֣�");
		//���ö���洢��������
		int DataScanner = sc.nextInt();
		if(DataScanner % 2 == 0){
			System.out.println(DataScanner + "��һ��ż��");
		}else{
			System.out.println(DataScanner + "����һ��ż��");
		}
	}
}