


public class LinearSearch {
	
	public static int LinerSearch(int[] arr, int key){
		int length = arr.length;
		for(int i = 0; i< length; i++){
			if(arr[i] == key){
				System.out.println("The key was found at the: " + i + "element" );
				return i;
			}
		}
		return -1;
	
	}
}
