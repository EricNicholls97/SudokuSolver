package mypackage;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

class ProgramTest {
	
	
	public static void main(String[] args) {
		
          
         
		ArrayList<int[][]> input_expected_arr = getTestCases();
	        
		String[] diffs = new String[] {"easy", "easy", "intermediate", "intermediate", "hard"};
		
	       
		for(int i = 0; i< input_expected_arr.size()/2; i++) {
			new ProgramTest().TestCase(i, input_expected_arr.get(i*2), input_expected_arr.get(i*2+1), diffs[i]);
		}
	  
	}

	public void TestCase(int num, int [][] inputValues, int [][] expectedValues, String diff) {
	
		var input = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < inputValues.length; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < inputValues[i].length; j++) {
				row.add(inputValues[i][j]);
			}
			input.add(row);
		}
		var expected = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < expectedValues.length; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < expectedValues[i].length; j++) {
				row.add(expectedValues[i][j]);
			}
			expected.add(row);
		}
		
		Sudoku sud = new Sudoku(input);
		
		var actual = sud.solve();
		boolean ans = expected.equals(actual);
		System.out.println("Test " + num + ": " + ans + "\t(" + diff + ")");
		
 		if(!ans) {
			System.out.println("  Expected: " + expected + "\n  Actual:   " + actual);
		}
		System.out.println();
	}
	
	
	public static ArrayList<int[][]> getTestCases(){
		
		ArrayList<int[][]> arr = new ArrayList<>();
		
		int[][] inputValues1 = new int[][] {
          {7, 8, 0, 4, 0, 0, 1, 2, 0},
          {6, 0, 0, 0, 7, 5, 0, 0, 9},
          {0, 0, 0, 6, 0, 1, 0, 7, 8},
          {0, 0, 7, 0, 4, 0, 2, 6, 0},
          {0, 0, 1, 0, 5, 0, 9, 3, 0},
          {9, 0, 4, 0, 6, 0, 0, 0, 5},
          {0, 7, 0, 3, 0, 0, 0, 1, 2},
          {1, 2, 0, 0, 0, 7, 4, 0, 0},
          {0, 4, 9, 2, 0, 6, 0, 0, 7}
        };
	    int[][] expectedValues1 = new int[][] {
          {7, 8, 5, 4, 3, 9, 1, 2, 6},
          {6, 1, 2, 8, 7, 5, 3, 4, 9},
          {4, 9, 3, 6, 2, 1, 5, 7, 8},
          {8, 5, 7, 9, 4, 3, 2, 6, 1},
          {2, 6, 1, 7, 5, 8, 9, 3, 4},
          {9, 3, 4, 1, 6, 2, 7, 8, 5},
          {5, 7, 8, 3, 9, 4, 6, 1, 2},
          {1, 2, 6, 5, 8, 7, 4, 9, 3},
          {3, 4, 9, 2, 1, 6, 8, 5, 7}
        };
	    
        int[][] inputValues2 = new int[][] {
          {0, 0, 0, 2, 6, 0, 7, 0, 1},
          {6, 8, 0, 0, 7, 0, 0, 9, 0},
          {1, 9, 0, 0, 0, 4, 5, 0, 0},
          {8, 2, 0, 1, 0, 0, 0, 4, 0},
          {0, 0, 4, 6, 0, 2, 9, 0, 0},
          {0, 5, 0, 0, 0, 3, 0, 2, 8},
          {0, 0, 9, 3, 0, 0, 0, 7, 4},
          {0, 4, 0, 0, 5, 0, 0, 3, 6},
          {7, 0, 3, 0, 1, 8, 0, 0, 0}
        };        
        int[][] expectedValues2 = new int[][] {
	        {4, 3, 5, 2, 6, 9, 7, 8, 1},
	        {6, 8, 2, 5, 7, 1, 4, 9, 3},
	        {1, 9, 7, 8, 3, 4, 5, 6, 2},
	        {8, 2, 6, 1, 9, 5, 3, 4, 7},
	        {3, 7, 4, 6, 8, 2, 9, 1, 5},
	        {9, 5, 1, 7, 4, 3, 6, 2, 8},
	        {5, 1, 9, 3, 2, 6, 8, 7, 4},
	        {2, 4, 8, 9, 5, 7, 1, 3, 6},
	        {7, 6, 3, 4, 1, 8, 2, 5, 9}
        };
        
        int[][] inputValues3 = new int[][] {
        	{0, 2, 0, 6, 0, 8, 0, 0, 0},
        	{5, 8, 0, 0, 0, 9, 7, 0, 0},
        	{0, 0, 0, 0, 4, 0, 0, 0, 0},
        	{3, 7, 0, 0, 0, 0, 5, 0, 0},
        	{6, 0, 0, 0, 0, 0, 0, 0, 4},
        	{0, 0, 8, 0, 0, 0, 0, 1, 3},
        	{0, 0, 0, 0, 2, 0, 0, 0, 0},
        	{0, 0, 9, 8, 0, 0, 0, 3, 6},
        	{0, 0, 0, 3, 0, 6, 0, 9, 0}
        };
          
        int[][] expectedValues3 = new int[][] {
	        {1, 2, 3, 6, 7, 8, 9, 4, 5},
	    	{5, 8, 4, 2, 3, 9, 7, 6, 1},
	    	{9, 6, 7, 1, 4, 5, 3, 2, 8},
	    	{3, 7, 2, 4, 6, 1, 5, 8, 9},
	    	{6, 9, 1, 5, 8, 3, 2, 7, 4},
	    	{4, 5, 8, 7, 9, 2, 6, 1, 3},
	    	{8, 3, 6, 9, 2, 4, 1, 5, 7},
	    	{2, 1, 9, 8, 5, 7, 4, 3, 6},
	    	{7, 4, 5, 3, 1, 6, 8, 9, 2}
	    };
	    
	    int[][] inputValues4 = new int[][] {
			{0, 2, 4, 3, 8, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 6, 0, 0, 7},
			{0, 5, 8, 0, 0, 0, 4, 0, 0},
			{4, 0, 0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 7, 0, 5, 0, 0, 0},
			{0, 0, 0, 0, 2, 0, 0, 0, 8},
			{0, 0, 1, 0, 0, 0, 6, 7, 0},
			{3, 0, 0, 5, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 4, 9, 2, 1, 0}
		};
		
		int[][] expectedValues4 = new int[][] {
			{6, 2, 4, 3, 8, 7, 5, 9, 1},
			{1, 3, 9, 4, 5, 6, 8, 2, 7},
			{7, 5, 8, 1, 9, 2, 4, 3, 6},
			{4, 9, 6, 8, 1, 3, 7, 5, 2},
			{2, 8, 3, 7, 6, 5, 1, 4, 9},
			{5, 1, 7, 9, 2, 4, 3, 6, 8},
			{9, 4, 1, 2, 3, 8, 6, 7, 5},
			{3, 6, 2, 5, 7, 1, 9, 8, 4},
			{8, 7, 5, 6, 4, 9, 2, 1, 3}
		};
	    
	    int[][] inputValues5 = new int[][] {
	    	{0, 0, 0, 6, 0, 0, 4, 0, 0},
	    	{7, 0, 0, 0, 0, 3, 6, 0, 0},
	    	{0, 0, 0, 0, 9, 1, 0, 8, 0},
	    	{0, 0, 0, 0, 0, 0, 0, 0, 0},
	    	{0, 5, 0, 1, 8, 0, 0, 0, 3},
	    	{0, 0, 0, 3, 0, 6, 0, 4, 5},
	    	{0, 4, 0, 2, 0, 0, 0, 6, 0},
	    	{9, 0, 3, 0, 0, 0, 0, 0, 0},
	    	{0, 2, 0, 0, 0, 0, 1, 0, 0}
    	};
    	
    	int[][] expectedValues5 = new int[][] {
    		{5, 8, 1, 6, 7, 2, 4, 3, 9},
    		{7, 9, 2, 8, 4, 3, 6, 5, 1},
    		{3, 6, 4, 5, 9, 1, 7, 8, 2},
    		{4, 3, 8, 9, 5, 7, 2, 1, 6},
    		{2, 5, 6, 1, 8, 4, 9, 7, 3},
    		{1, 7, 9, 3, 2, 6, 8, 4, 5},
    		{8, 4, 5, 2, 1, 9, 3, 6, 7},
    		{9, 1, 3, 7, 6, 8, 5, 2, 4},
    		{6, 2, 7, 4, 3, 5, 1, 9, 8}
		};
		
		
		arr.add(inputValues1);
		arr.add(expectedValues1);
		arr.add(inputValues2);
		arr.add(expectedValues2);
		arr.add(inputValues3);
		arr.add(expectedValues3);
		arr.add(inputValues4);
		arr.add(expectedValues4);
		arr.add(inputValues5);
		arr.add(expectedValues5);
		
		return arr;
		
		
	}
}
