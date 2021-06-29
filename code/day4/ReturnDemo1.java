/*
	≤‚ ‘return
*/

class ReturnDemo1{
	public static void main(String[] args){
		for(int x = 0; x < 10; x++){
			if(x == 3){
				System.out.print("ÕÀ≥ˆ");
				return;
			}
			System.out.println(x);
		}
		System.out.println("over");
	}
}