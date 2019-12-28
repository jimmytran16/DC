/*Good morning! Here's your coding interview problem for today.
This problem was asked by Stripe.
Given an integer n, return the length of the longest consecutive run of 1s in its binary representation.
For example, given 156, you should return 3.*/

import java.util.HashMap;
import java.lang.Integer;

public class daily214{
	public static void main(String args[]){
		System.out.println(getBinaryConsecutives(156)); //10011100 ~ 3
		System.out.println(getBinaryConsecutives(1700)); //11010100100 ~ 2
		System.out.println(getBinaryConsecutives(1700)); //11010100100 ~ 2
		System.out.println(getBinaryConsecutives(222)); //11011110 ~ 4
	}
	/*convert integer to binary string, and split into array, keep count of consecs of '1', return longest consecs*/
	public static int getBinaryConsecutives(int i){
		String NUMBER_IN_BINARY = Integer.toBinaryString(i);
		String KEY_BINARY = "1";
		int COUNTER = 0;
		String[] BINARY_SPLIT = NUMBER_IN_BINARY.split(""); 
		HashMap<String,Integer> KeepTrackOneOccuranceMap= new HashMap<>();
		KeepTrackOneOccuranceMap.put(KEY_BINARY,0);
		for(String bin : BINARY_SPLIT){
			if(bin.equals(KEY_BINARY)){
				COUNTER++;
				if(COUNTER>KeepTrackOneOccuranceMap.get(KEY_BINARY)){
				KeepTrackOneOccuranceMap.put(KEY_BINARY,COUNTER);
				}
			}
			else{
				COUNTER = 0;
			}
		}
		return KeepTrackOneOccuranceMap.get(KEY_BINARY);
		
	}
}