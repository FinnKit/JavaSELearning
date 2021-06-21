/*
	测试：Java中系统默认的数据类型转换
	byte,short,char -> int -> long -> float -> double
	byte,short,char在运算过程中会自动转化为int（系统默认）
	但注意最好不要这样，会损失精度
*/

class DataTypeDemo{
		public static void main(String [] args){
			byte a = 1;
			int b = 10;
			byte c = a + b;
			System.out.println(c);
		}
}
