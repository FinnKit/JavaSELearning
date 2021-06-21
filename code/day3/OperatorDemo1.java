/*
	测试算术运算符自加与自减
*/

class OperatorDemo1{
	public static void main(String[] Args){
		int x = 1, y = 2;
		x++;
		++y;
		System.out.println("x:"+x);
		System.out.println("y:"+y);

		int a = 4, b = 3;
		int z1 = a++;
		int z2 = --b;
		System.out.println("z1:"+z1);
		System.out.println("z2:"+z2);

		int x1 = 4;
		int y1 = (x1++) + (++x1) + (x1*10);
		System.out.println("x1:"+x1);
		System.out.println("y1:"+y1);
	}
}