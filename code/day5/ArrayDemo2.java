/*
	��ȡ��������ֵ
*/
class ArrayDemo2{
	public static void main(String[] args){
		int[] arr1 = {2,5,7,1,0,9,12,2};
		System.out.println(getArrayMax(arr1));
	}
	//��ȡ�������ֵ�ķ���
	public static int getArrayMax(int[] arr){
		//���������һ��Ԫ�����
		int max = arr[0];
		for(int index = 1; index < arr.length; index++){
			if(max < arr[index]){
				max = arr[index];
			}
		}
		return max;
	}
}