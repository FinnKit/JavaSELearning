/*
	打印九九乘法表
*/

class Demo1{
	public static void main(String[] args){
		// 初始化乘积的结果
		int num = 0;
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				num = j * i;
				System.out.print(j+"*"+i+"="+num+'\t');
			}
			System.out.print('\n');
		}
	}
}