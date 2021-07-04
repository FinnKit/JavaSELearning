/*
	获取数组的最大值
*/
class ArrayDemo2{
	public static void main(String[] args){
		int[] arr1 = {2,5,7,1,0,9,12,2};
		System.out.println(getArrayMax(arr1));
	}
	//获取数组最大值的方法
	public static int getArrayMax(int[] arr){
		//假设数组第一个元素最大
		int max = arr[0];
		for(int index = 1; index < arr.length; index++){
			if(max < arr[index]){
				max = arr[index];
			}
		}
		return max;
	}
}