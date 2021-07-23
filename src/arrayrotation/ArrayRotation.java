package arrayrotation;

import java.util.Arrays;

public class ArrayRotation {
	int temp=0;
	public static int[]  rotateArray(int[] num, int k) {
		int inc=1;
		while(inc<=k) {
		int lastValue=num[num.length-1];
		for(int i=num.length-1;i>0;i--) {
			num[i]=num[i-1];
			
		}
		num[0]=lastValue;	
		inc++;
	}
		return num;
	}
	
	public static void main(String[] args) {
		int[] num= {1,2,3,4};
		int[] result=rotateArray(num, 2);
		System.out.println(Arrays.toString(result));
		
	}
}
