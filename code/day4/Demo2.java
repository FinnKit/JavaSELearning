/*
	С��������ÿ�����2.5ԪǮ�������������������
	ÿ����һ���Ǵ�Ǯ�ĵ��������5�ı����Ļ��������Ứȥ6ԪǮ
	���ʣ����������죬С���ſ��Դ浽100ԪǮ
*/
class Demo2{
	public static void main(String[] args){
		double money = 0;
		int day = 0;
		while(money < 100){
			money += 2.5;
			day++;
			if(day % 5 == 0){
				money -= 6;
			}
		}
		System.out.println("����"+day+"�죬С���ſ��Դ浽100ԪǮ");
	}
}