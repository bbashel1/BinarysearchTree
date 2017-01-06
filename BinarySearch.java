
class BinarySearch 
{
	public static int searchIndexBinary(int numList[], int toSearch){
		int startIndex = -1;
		int endIndex = numList.length-1;
		int midIndex = (startIndex + endIndex) / 2;
		int midElement = numList[midIndex];
		int founIndex = 0;
		
		while (startIndex <= endIndex){
			if(midElement < toSearch){
				startIndex = midIndex + 1;
				midIndex = (startIndex = endIndex) / 2;
				midElement = numList[midIndex];
				
			}else if(midElement > toSearch){
				endIndex = midIndex - 1;
				midIndex = (startIndex + endIndex) / 2;
				midElement = numList[midIndex];
			}else{
				founIndex = midIndex;
				break;
				
			}return -1;
		}
		return founIndex;
	}
	}
