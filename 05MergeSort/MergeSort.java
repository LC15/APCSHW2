import java.util*;

public class MergeSort{

    public static int[] AddEnd(int[] a, int[] b, int aCount, int bCount, int end, int[] E){
	if(aCount>= a.length){
	      for(int i = bCount; i < b.length; i++){
				end[i+endCount-bCount] = b[i];
	    	}
	    	return end;
		}
		if(bCount >= b.length){
		    for(int i = aCount; i < a.length; i++){
				end[i+endCount-aCount] = a[i];
	    	}
	    	return end;
		}
