/*
	����һ��ֽ�����Ϊ0.01m,�����۵����ٴΣ����Ա�֤��Ȳ��������������ĸ߶ȣ�8848m��
*/

class WhileDemo{
	public static void main(String[] args){
		int height = 1, num = 0;
		while(height < 884800){
			height *= 2;
			num++;
		}
		System.out.println("һ����Ҫ��"+num+"��");
		
	}
}