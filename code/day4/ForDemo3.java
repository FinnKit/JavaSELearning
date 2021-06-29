/*
	求水仙花数
*/
class ForDemo3{
	public static void main(String[] args){
		//初始化
		double sum = 0;
		// 判断水仙花
		System.out.println("水仙花数有：");
		for(int num = 100; num <= 999; num++){
			double onesDigit = num % 10;
			double tensDigit = num / 10 % 10;
			double hundredsDigit = num / 100;
			sum = Math.pow(onesDigit, 3) + Math.pow(tensDigit, 3) + Math.pow(hundredsDigit, 3);
			if(sum == num){
				System.out.println(num);
			}
		}
	}
}