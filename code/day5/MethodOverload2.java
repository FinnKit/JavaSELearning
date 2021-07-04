/*
	方法重载：参数个数不同
*/
class MethodOverload2{
	public static void main(String[] args){
		byte x1 = 1, y1 = 2;
		long x2 = 10L, y2 = 10L;
		System.out.println(getEqual(x1,y1));
		System.out.println(getEqual(x2,y2));
	}
	public static boolean getEqual(byte a, byte b){
		return a == b;
	}
	public static boolean getEqual(long a, long b){
		return a == b;
	}
}