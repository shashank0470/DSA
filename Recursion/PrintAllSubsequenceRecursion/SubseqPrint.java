package Recursion.PrintAllSubsequenceRecursion;


// here we are going to learn about the pattern called subsequence
public class SubseqPrint {
    public static void main(String[] args) {
        String s = "abc";
        printSubSeq(s, 0, "");
    }
    static void printSubSeq(String s, int index, String current){
        if(index == s.length()){
            System.out.print(current + ",");
            return;
        }
        printSubSeq(s, index+1, current+s.charAt(index));
        printSubSeq(s, index+1, current);
    }

    static int countSubSeq(String s, int index, String current ){
        if(index == s.length()){
            return 1;
        }
        int pick = countSubSeq(s, index+1, current+s.charAt(index));
        int noPick = countSubSeq(s, index+1, current);
        return pick+noPick;
    }
}
