package Hands_on_Lecture_2;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowStart = 0;
        int columnStart = 0;
        int rowEnd = matrix[0].length - 1;
        int columnEnd = matrix.length - 1;

        // Repeat Spiral
        while(rowStart <= rowEnd && columnStart <= columnEnd){
            // Left to Right
            for(int i = rowStart; i <= rowEnd; ++i){
                result.add(matrix[columnStart][i]);
            }
            ++columnStart;

            // End loop if start is > than end
            if(columnStart > columnEnd) break;

            // Up to Down
            for(int i = columnStart; i <= columnEnd; ++i){
                result.add(matrix[i][rowEnd]);
            }
            --rowEnd;

            // End loop if start > end
            if(rowStart > rowEnd) break;

            // Right to Left
            if(rowStart < rowEnd){
                for(int i = rowEnd; i >= rowStart; --i){
                    result.add(matrix[columnEnd][i]);
                }
                --columnEnd;
            }

            // End loop if start > end
            if(columnStart > columnEnd) break;

            // Down to Up
            if(columnStart < columnEnd){
                for(int i = columnEnd; i >= columnStart; --i){
                    result.add(matrix[i][rowStart]);
                }
                ++rowStart;
            }

            // End loop if start > end
            if(rowStart > rowEnd) break;

        }

        // Return List
        return result;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter number of rows: ");
        int rows = s.nextInt();

        System.out.print("Please enter number of columns: ");
        int columns = s.nextInt();

        int[][] matrix = new int[rows][columns];

        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < columns; ++j){
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        System.out.println();
        System.out.println("Generating Random Matrix: ");

        System.out.println("Matrix: ");
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < columns; ++j){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(spiralOrder(matrix));
    }
}
