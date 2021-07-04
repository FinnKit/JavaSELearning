/*
	遍历数组
*/

class ArrayDemo1{
	public static void main(String[] args){
		//初始化数组
		int[] arr1 = {1,2,34,5,67,8,9,4,35};
		printArray(arr1);
		
	}
	//遍历数组的方法
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int index = 0; index < arr.length; index++){
			if(index < arr.length - 1){
				System.out.print(arr[index] + ", ");
			}else{
				System.out.print(arr[index]);
			}
		}
		System.out.print("]");
		System.out.print("\n");
	}
}