/*
	��ӡ��������Σ����̼���������
*/
import java.util.Scanner;
class Array2Demo{
	public static void main(String[] args){
		//�������̼������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ��������ε�����");
		int rows = sc.nextInt();
		if(rows <= 0){
			System.out.println("�������ݴ���");
		}else{
			printYangHuiTriangle(rows);
		}

	}
	public static void printYangHuiTriangle(int row){
		//�������������
		int[][] arr = new int[row][row];
		for(int i = 0; i < row; i++){
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		for(int i = 2; i < row; i++){
			for(int j = 1; j < i; j++){
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		//��ӡ���������
		for(int i = 0; i < row; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}