/*
	实现1-100的求和
*/

class ForDemo{
	public static void main(String[] args){
		int sum = 0;
		for(int x = 1; x <= 100; x++){
			sum += x;
		}
		System.out.println("The sum is " + sum);
	}
}