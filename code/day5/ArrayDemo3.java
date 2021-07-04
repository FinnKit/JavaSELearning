/*
	求数组的逆序
*/
class ArrayDemo3{
	public static void main(String[] args){
		int[] arr1 = {2,5,7,1,0,9,12,2};
		printArray(arr1);
		System.out.println(arr1);
		int[] arr2 = getArrayReverse(arr1);
		printArray(arr2);
		System.out.println(arr2);
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
		int[] arrayReverse = new int[arr.length];
		System.out.println(arrayReverse);
		for(int index = 0; index < arr.length; index++){	
			arrayReverse[index] = arr[arr.length - 1 - index];
		}
		return arrayReverse;
	}
	
}