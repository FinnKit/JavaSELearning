/*
	利用方法求两个数之和
*/
class MethodDemo1{
	public static void main(String[] args){
		int x = 10, y = 20;
		// 单独调用
		sumMethod(x, y);
		// 输出调用
		System.out.println(sumMethod(x, y));
		// 赋值调用
		int sum = sumMethod(x, y);
		System.out.println("The sum is "+ sum);
	}
	public static int sumMethod(int a, int b){
		return a + b;
	}
}