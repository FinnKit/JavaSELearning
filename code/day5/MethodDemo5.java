/*
	����¼��һ������n(1<=n<=9)�������Ӧ��nn�˷���
*/
import java.util.Scanner;

class MethodDemo5{
	public static void main(String[] args){
		//��������
		Scanner sc = new Scanner(System.in);
		System.out.print("�����һ����1��9����������:");
		int num = sc.nextInt();
		//�ж������Ƿ���ȷ
		if(num >=1 && num <=9){
			printNN(num);
		}else{
			System.out.println("�����������");
		}
	}
	
	//��ӡn*n�˷���
	public static void printNN(int a){
		for(int i = 1; i <= a; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.print("\n");
		}
	}
}