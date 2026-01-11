package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(PathCount(3, 3));
//        PrintCount("", 3,3);
//        System.out.println(obstabcle("", 3,3));
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    //Count the path
    static int PathCount(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = PathCount(row - 1, col);
        int right = PathCount(row, col - 1);
        return left + right;
    }

    //Print the path
    static void PrintCount(String P, int row, int col) {
        if (row == 1 && col == 1){
            System.out.println(P);
            return;
        }
        if(row>1){
            PrintCount(P + "D", row-1, col);
        }
        if(col>1){
            PrintCount(P+"R", row, col-1);
        }

    }

    //Maze with diagonal direction
    static ArrayList<String> ThreeDMaaze(String P ,int row, int col){
        if(row==1 && col==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(P);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1&&col>1){
            list.addAll(ThreeDMaaze(P + "D", row - 1, col-1));
        }
        if(row>1){
            list.addAll(ThreeDMaaze(P + "V", row - 1, col));
        };
        if(col>1){
            list.addAll(ThreeDMaaze(P +  "H", row, col - 1));
        };

        return list;
    }

    static ArrayList<String> obstabcle(String p, int row, int col){
        if(row==1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
         }
        if( row == 2 && col==2){
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();

        if(row>1){
                list.addAll(obstabcle(p + "D", row-1, col));

        }
        if(col>1){
                list.addAll(obstabcle(p + "R", row, col-1));

        }


        return list;
    }

}
