/*
	打印杨辉三角形（键盘键入行数）
*/
import java.util.Scanner;
class Array2Demo{
	public static void main(String[] args){
		//创建键盘键入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要打印杨辉三角形的行数");
		int rows = sc.nextInt();
		if(rows <= 0){
			System.out.println("输入数据错误");
		}else{
			printYangHuiTriangle(rows);
		}

	}
	public static void printYangHuiTriangle(int row){
		//创建杨辉三角形
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
		//打印杨辉三角形
		for(int i = 0; i < row; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}