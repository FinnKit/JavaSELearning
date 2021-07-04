/*
	求数组的逆序
*/
class ArrayReverse{
	public static void main(String[] args){
		int[] arr1 = {2,5,7,1,0,9,12,8};
		printArray(arr1);
		System.out.println(arr1);
		printArray(getArrayReverse(arr1));
		System.out.println(getArrayReverse(arr1));
	}
	//显示数组的方法
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int index = 0; index < arr.length; index++){
			if(index < arr.length - 1){
				System.out.print(arr[index] + ", ");
			}else{
				System.out.print(arr[index] + "]");
			}
		}
		System.out.print("\n");
	}
	//得到数组逆序的方法
	public static int[] getArrayReverse(int[] arr){
		int temp = 0;
		for(int start = 0, end = arr.length - 1; start <= end; start++, end--){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		return arr;
	}
	
}