/*
	ʵ���������ݽ���
*/

class DataExchange{
	public static void main(String[] Args){
		//����һ��
		int a1 = 3, b1 = 4;
		int c = a1;
		a1 = b1;
		b1 = c;
		System.out.println("a1:"+a1);
		System.out.println("b1:"+b1);

		//��������
		int a2 = 3, b2 = 4;
		a2 = a2 ^ b2;
		b2 = a2 ^ b2;
		a2 = a2 ^ b2;
		System.out.println("a2:"+a2);
		System.out.println("b2:"+b2);

		//��������
		int a3 = 3, b3 = 4;
		a3 = a3 + b3;
		b3 = a3 - b3;
		a3 = a3 - b3;
		System.out.println("a3:"+a3);
		System.out.println("b3:"+b3);

		//�����ģ�
		int a4 = 3, b4 = 4;
		b4 = (a4+b4) - (a4=b4);
		System.out.println("a4:"+a4);
		System.out.println("b4:"+b4);
	}
}