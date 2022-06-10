package day23.arraydemo;

public class ArrayDemo1 {

	public static void main(String[] args) {
// <data type> [] <array name> = new <data type [size of an array's element];
		int [] arr = new int [3];
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);
		
		System.out.println("==================");
		
		arr[0] = 12;
		arr[1] = 23;
		arr[2] = 34;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}

}

//array : is a collection of elements of same type arranged in a
//sequential manner