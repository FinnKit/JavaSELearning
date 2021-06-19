/*
	需求：在系统控制台输出显示所指定的内容
	分析：
		A：要写一个Java程序，就必须写一个类
		B：要把内容能够输出，说明程序能独立运行，而程序独立运行，就必须定义main方法
		C：要把数据输出控制台，就必须使用输出语句
	实现：
		A：写一个类，利用class+类名{}
		B：定义main方法有固定格式：public static void main(String[] arges){}
		C:输出语句也有固定格式：System.out.println("xxx");
*/

//这是我们定义的类，用来输出指定内容
class NoteDemo{
	/*
		为了程序能够独立运行，定义main方法
		main方法是程序的入口，被JVM自动调用
	*/
		public static void main(String [] args){
			//为了输出内容，需要调用输出语句
			System.out.println("This is the NoteDemo");
		}
}