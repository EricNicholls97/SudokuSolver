package mypackage;

import java.util.ArrayList;
import java.util.List;


public class Sudoku {
	
	ArrayList<ArrayList<Integer>> board_param;
	ArrayList<ArrayList<Square>> board;
	
	public Sudoku(ArrayList<ArrayList<Integer>> board_param) {
		this.board_param = board_param;
		this.board = init_board();
		
//		print_board();
		
		for(int i=0; i<4; i++) {
			pre_run_through();
//			print_board();
		}
		
	}
	
	public void pre_run_through() {
		// horizontal
		for(int r=0; r<9; r++) {
			boolean [] bools = new boolean[] {false, true, true, true, true, true, true, true, true, true};
			
			for(int c=0; c<9; c++) {
				int x = board.get(r).get(c).getValue();
				if( x != 0 ) {
					bools[x] = false;
				}
			}
			for(int c=0; c<9; c++) {
				Square sq = board.get(r).get(c);
				if(sq.getValue() == 0) {					
					for(int i=1; i<= 9; i++) {
						if(bools[i] == false) {
							if (board.get(r).get(c).removePoss(i))
								;
//								System.out.println("Set value at " + r + ", " + c);
						}
					}
				}
			}
		}
		// vertical
		for(int c=0; c<9; c++) {
			boolean [] bools = new boolean[] {false, true, true, true, true, true, true, true, true, true};
			for(int r=0; r<9; r++) {
				int x = board.get(r).get(c).getValue();
				if( x != 0 ) {
					bools[x] = false;
				}
			}
			for(int r=0; r<9; r++) {
				Square sq = board.get(r).get(c);
				if(sq.getValue() == 0) {
					for(int i=1; i<= 9; i++) {
						if(bools[i] == false) {
							if (board.get(r).get(c).removePoss(i))
								;
//								System.out.println("Set value at " + r + ", " + c);
						}
					}
				}
			}
		}
		
		// boxes - 3x3
		for(int row=0; row<3; row++) {
			for(int col=0; col<3; col++) {
				boolean [] bools = new boolean[] {false, true, true, true, true, true, true, true, true, true};
				for(int r=0; r<3; r++) {
					for(int c=0; c<3; c++) {
						int r_ = row*3 + r;
						int c_ = col * 3 + c;
//						System.out.println("R: " + (row*3 + r) + ",  C: " + (col * 3 + c));
						int x = board.get(r_).get(c_).getValue();
						if( x != 0 ) {
							bools[x] = false;
						}
					}
				}
				for(int r=0; r<3; r++) {
					for(int c=0; c<3; c++) {
						int r_ = row*3 + r;
						int c_ = col * 3 + c;
						Square sq = board.get(r_).get(c_);
						if(sq.getValue()==0) {
							for(int i=1; i<= 9; i++) {
								if(bools[i] == false) {
									if (board.get(r_).get(c_).removePoss(i))
										;
//										System.out.println("Set value at " + r_ + ", " + c_);
								}
							}
						}
					}
				}
			}
		}
		
		// end		
	}
	
	public ArrayList<ArrayList<Integer>> solve() {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		
		
		for (List<Square> arr : board) {
			ArrayList<Integer> a = new ArrayList<>();
			for(Square sq : arr) {
				a.add(sq.getValue());
			}
			ans.add(a);
		}
		return ans;
		
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
