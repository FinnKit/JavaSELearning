/*
	���÷�����������֮��
*/
class MethodDemo1{
	public static void main(String[] args){
		int x = 10, y = 20;
		// ��������
		sumMethod(x, y);
		// �������
		System.out.println(sumMethod(x, y));
		// ��ֵ����
		int sum = sumMethod(x, y);
		System.out.println("The sum is "+ sum);
	}
	public static int sumMethod(int a, int b){
		return a + b;
	}
}