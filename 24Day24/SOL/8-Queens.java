// This program solves the classic "8 queens" problem using recursive 
// backtracking.

import java.util.*;
public class Queens {
    public static void main(String[] args) {
        giveIntro();
        Scanner console = new Scanner(System.in);
        System.out.print("What size board do you want to use? ");
        int size = console.nextInt();
        System.out.println();
        Board b = new Board(size);
        solve(b);
    }
