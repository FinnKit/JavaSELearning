/*
	��ӡ�žų˷���
*/

class Demo1{
	public static void main(String[] args){
		// ��ʼ���˻��Ľ��
		int num = 0;
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				num = j * i;
				System.out.print(j+"*"+i+"="+num+'\t');
			}
			System.out.print('\n');
		}
	}
}