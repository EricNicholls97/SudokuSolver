package mypackage;

import java.util.ArrayList;
import java.util.List;


public class Sudoku {
	
	ArrayList<ArrayList<Integer>> board_param;
	ArrayList<ArrayList<Square>> board;
	
	public Sudoku(ArrayList<ArrayList<Integer>> board_param) {
		this.board_param = board_param;
		this.board = init_board();
		
		print_board();
		
		
		
	}
	
	public ArrayList<ArrayList<Integer>> solve() {
		
		
		
		
		return new ArrayList<ArrayList<Integer>>(); 
		
	}
	
	private ArrayList<ArrayList<Square>> init_board() {
		ArrayList<ArrayList<Square>> arr = new ArrayList<>();
		for(int i=0; i<9; i++) {
			ArrayList<Square> ar = new ArrayList<>();
			for(int j=0; j<9; j++) {
				Square sq = new Square(board_param.get(i).get(j));
				ar.add(sq);
			}
			arr.add(ar);
		}
		return arr;
	}
	
	private void print_board() {
		int i = 0;
		for (List<Square> arr : board) {
			int j = 0;
			for(Square sq : arr) {
				System.out.print(sq + " ");
				if(j%3==2)
					System.out.print("  ");
				j++;
			}
			if(i%3==2)
				System.out.println();
			i++;
			System.out.println();
		}
		
	}
	 
//	private void print_array() {
//		int j = 0;
//		for(List<Integer> arr : board_param) {
//			for(int i=0; i<arr.size(); i++) {
//				System.out.print(arr.get(i));
//				if(i%3==2)
//					System.out.print(" ");
//			}
//			System.out.println();
//			if(j%3==2)
//				System.out.println();
//			j++;
//		}
//	}
	 

}
