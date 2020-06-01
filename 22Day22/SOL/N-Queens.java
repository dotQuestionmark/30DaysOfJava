/* Java program to solve N Queen Problem using 
   backtracking */
public class NQueenProblem { 
    final int N = 4; 
 /* A utility function to print solution */
    void printSolution(int board[][]) 
    { 
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) 
                System.out.print(" " + board[i][j] 
                                 + " "); 
            System.out.println(); 
        } 
    }  
