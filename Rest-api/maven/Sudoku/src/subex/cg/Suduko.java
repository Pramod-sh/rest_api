package subex.cg;

/**
	 * We define a simple grid to solve. Grid is stored  in 2D array
	 * intialize the Array with Array volume
 * @author Pramod Hiremath
 *
 */

public class Suduko {
	
	public static int[][] SUDUKO_SOLVE = {
			{9,0,0,1,0,0,0,0,5},
			{0,0,5,0,9,0,2,0,1},
			{8,0,0,0,4,0,0,0,0},
			{0,0,0,0,8,0,0,0,0},
			{0,0,0,7,0,0,0,0,0},
			{0,0,0,0,2,6,0,0,9},
			{2,0,0,3,0,0,0,0,6},
			{0,0,0,2,0,0,9,0,0},
			{0,0,1,9,0,4,5,7,0},
	};
	
	private int[][] board;
	public static final int EMPTY=0;//intialize Empty Cell
	public static final int SIZE=9; // intialize Size of the puzzle Grids
	/**
	 * User defined methods to check the Array 
	 * @param board
	 */
	public void sudoku(int[][] board) {
		this.board=new int[SIZE][SIZE];
		
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				this.board[i][j]=board[i][j];
			}
		}
	}
	//Check if possible number is already in row in a array
	private boolean isInRow(int row, int number) {
		for(int i=0;i<SIZE;i++)
			
		if(board[row][i] == number)
			return true;
		return false;
		
	}
	//Check if possible number is already in Column in a array
	private boolean isInCol(int col,int number) {
		for(int i=0;i<SIZE;i++)
			
			if(board[i][col] == number)
				return true;
		return false;
	}
	//Check if a possible number is in the 3*3 Box in a Grid
	private boolean isInBox(int row,int col,int number) {
		int r=row-row%3;
		int c=col-col%3;
		
		for(int i=r;i<r+3;i++)
			for(int j=c;j<c+3;j++)
				
				if(board[i][j] == number)
					return true;
		return false;
	}
	//Combined method to check if a number possible  to a row,column position is ok
	private boolean isOk(int row,int col,int number) {
		return !isInRow(row,number) && !isInCol(col,number) && !isInBox(row,col,number);
	}
	
	/*
	 * Solve method. We will  use a recursive  BackTracking alg.
	 * solving problems recursively by trying to build a solution incrementally, 
	 * one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point in time.
	 * 
	 */
	public boolean solve() {
		for(int row=0;row<SIZE;row++) {
			for(int col=0;col<SIZE;col++) {
				//Search an Empty cell
				if(board[row][col] == EMPTY) {
					//try possible numbers
					for(int number=1;number<=SIZE;number++) {
						if(isOk(row,col,number)) {
							//numbers.it respects suduko constraints
							board [row][col]=number;
							
							if(solve()) { //Now start Backtracking recursevely
								return true;
							}else { //if not a solution, we empty the cell and w continue 
								board[row][col]=EMPTY;
							}
					 }
				}
					
				return false; //return false in this codition
			}
		}
	}
		return true;// Suduko solved sucesfully
	}
	public void display() {
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				System.out.print("  "+board[i][j]);
			}
			
		    System.out.println();
		    
		}
		
		System.out.println();
}
	/**
	 * This is the main method to test all other methods in the class Suduko
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println("Sudoku Puzzle to Solve");
		Suduko suduko=new Suduko();
		System.out.println("Sudoku grid to Solve");
		suduko.display();
		if(suduko.solve()) {
			System.out.println("Solve with simple puzzle");
			suduko.display();
		}else {
			System.out.println("It is Unsolvable");
		}
	 }
}

