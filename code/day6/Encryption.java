/*
	ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
	�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
	A�������ݵ���
	B����ÿλ���ֶ�����5�����úͳ���10���������������
	C������һλ�����һλ���ֽ���
	���������һ��С��8λ��������Ȼ�󽫼��ܵ����ݴ�ӡ����
*/
import java.util.Scanner;
class Encryption{
	public static void main(String[] args){
		//�������̼������
		Scanner sc =  new Scanner(System.in);
		System.out.println("������С��8λ������");
		int data = sc.nextInt();
		//���ü��ܷ���������Ϊ�ַ���
		String dataEncryption = encryption(data);
		System.out.println(dataEncryption);
	}
	public static String encryption(int dataNum){
		//�����ݴ���һά������
		int[] dataArray = new int[8]; //����С��8λ����ֱ�Ӷ��������б���8��Ԫ��		
		//ʹ��whileѭ�������д洢
		int dataLength = 0;//ͳ������λ��
		while(dataNum > 0){	//while��������ΪdataNumΪ0
			dataArray[dataLength] = dataNum % 10;	//��Сλ�����ݵ���Сλ
			dataLength++;
			dataNum /= 10;
		}
		System.out.println(dataLength);
		for(int index = dataLength - 1; index >= 0; index--){
			System.out.print(dataArray[index]);//��������λ��ʼ���
		}
		System.out.println();
		//����1
		int temp = 0;
		for(int start = 0, end = dataLength - 1; start < end; start++, end--){
			temp = dataArray[start];
			dataArray[start] = dataArray[end];
			dataArray[end] = temp;
		}
		for(int index = dataLength - 1; index >= 0; index--){
			System.out.print(dataArray[index]);
		}
		System.out.println();
		//����2
		for(int index = 0; index < dataLength; index++){
			dataArray[index] += 5;
			dataArray[index] %= 10;
		}
		for(int index = dataLength - 1; index >= 0; index--){
			System.out.print(dataArray[index]);
		}
		System.out.println();
		//����3
		temp = dataArray[0];
		dataArray[0] = dataArray[dataLength - 1];
		dataArray[dataLength - 1] = temp;
		for(int index = dataLength - 1; index >= 0; index--){
			System.out.print(dataArray[index]);
		}
		System.out.println();
		//�γ��ַ���
		String str = "";//�ַ�����ʼ��
		for(int index = dataLength - 1; index >= 0; index--){
			str += dataArray[index];//ע��Ӹ�λ��ʼƴ��
		}
		return str;
	}
}