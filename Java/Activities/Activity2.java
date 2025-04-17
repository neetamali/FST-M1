package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {10,77,10,54,-11,10};
System.out.println("Original Array is: "+Arrays.toString(arr));

 int num=10;
 int sumnum=30;
 boolean result=checkSum(arr,num,sumnum);
 System.out.println(result);
 
	}
	
	public static boolean checkSum(int[] numarr, int num, int sumnum) {
		int tempsum=0;
		
		for(int eachnum:numarr) {
			if(eachnum==num) {
				tempsum=tempsum+eachnum;
				
			}
			
			if(tempsum>sumnum) {
				break;
				
			}
			
		}
		return tempsum==sumnum;
		
	}

}
