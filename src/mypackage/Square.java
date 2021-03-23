package mypackage;

import java.util.ArrayList;

public class Square {
	
	int value;
	
	boolean[] poss_arr = null;	// each index stores if it's possible for that index to be the Squares value. 0 is always false.
	int arr_size;				// array is size 10, but 
	
	public Square (int value) {
		this.value = value;
		
		if(this.value == 0) {
			poss_arr = new boolean[] {false, true, true, true, true, true, true, true, true, true};
			arr_size = 9;
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isPoss(int val) {
		return poss_arr[val] == true;
	}
	
	// @return	true if it sets the value, false ow
	public boolean removePoss(int val) {
		if(!poss_arr[val])
			return false;
		poss_arr[val] = false;
		arr_size--;
		if(arr_size==1) {
			for(int i=1; i<=9; i++) {
				if(poss_arr[i]) {
					value = i;
					return true;
				}
			}
			System.out.println();
		}
		return false;
	}
	
	
	public String toString() {
		if(value != 0)
			return value + "            "; // (12)
		
		String s = "(";
		for(int i=1; i<=9; i++) {
			if(poss_arr[i])
				s += i;
			else
				s += "_";
		}
		s += ")  ";
		return s;
	}
}
