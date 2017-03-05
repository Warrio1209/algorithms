package binarysearch;

public class binarysearch {
	//returns index of target in array, if target is not present in array returns -1
	public int binarySearch(Comparable array[],Comparable target, int min, int max){
		int midPoint = (min + max)/2;
		int comp = target.compareTo(midPoint);
		if(min == max || midPoint < min){
			if(comp == 0)
				return midPoint;
			else
				return -1;
		}
		if(comp < 0)
			return binarySearch(array,target,min,midPoint-1);
		else if(comp > 0)
			return binarySearch(array,target,midPoint+1,max);
		return midPoint;
	}
}
