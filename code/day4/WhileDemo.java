/*
	现有一张纸，厚度为0.01m,请问折叠多少次，可以保证厚度不低于珠穆朗玛峰的高度（8848m）
*/

class WhileDemo{
	public static void main(String[] args){
		int height = 1, num = 0;
		while(height < 884800){
			height *= 2;
			num++;
		}
		System.out.println("一共需要折"+num+"次");
		
	}
}