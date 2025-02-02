package Hands_on_Lecture_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        List<List<Integer>> list = new ArrayList<>();

        System.out.print("Please enter number of Rows: ");
        int n = s.nextInt();

        for (int i = 0; i < n; ++i){
            List<Integer> currRow = new ArrayList<>();
            for (int j = 0; j <= i; ++j){
                if (j == 0 || j == i){
                    currRow.add(1); // Set ends of row to 1
                }else{
                    currRow.add(list.get(i-1).get(j) + list.get(i-1).get(j-1)); // Add above left and right terms
                }
            }
            list.add(currRow);
        }

        // Return List
        System.out.println(list);
    }
}
