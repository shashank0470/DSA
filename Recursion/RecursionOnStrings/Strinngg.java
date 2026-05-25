package Recursion.RecursionOnStrings;

public class Strinngg {
    public static void main(String[] args) {
        String s = "xvPInnmsPI";
//        PrintString(s,0);
//        System.out.println(checkPalindrome(s,0,s.length()-1));
//        System.out.println(removeChar(s,0,'a',""));
        System.out.println(replacePI(s,0));
    }

    static void PrintString(String s,int index){
        if(index == s.length()){
            return;
        }
        System.out.print(s.charAt(index) + " ");
        PrintString(s, index+1);
    }
    static void PrintStringR(String s,int index){
        if(index == s.length()){
            return;
        }
        PrintString(s, index+1);
        System.out.print(s.charAt(index) + " ");
    }

    public static boolean checkPalindrome(String s, int i, int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i) != s.charAt(j)) return false;
        return checkPalindrome(s,i+1,j-1);

    }

    static String removeChar(String s, int index, char c, String ss){
        if(index == s.length()){
            return ss;
        }
        if(s.charAt(index) != c) {
            ss = ss + s.charAt(index);
        }
        return removeChar(s,index+1, c, ss);
    }

    //replace pi with 3.14
    static String replacePI(String s, int index){
        int n = s.length();
        if(index == s.length()) return "";

        if(index<n-1 && s.charAt(index) == 'P' && s.charAt(index+1) =='I'){
            return ("3.14" + replacePI(s, index + 2));
        }else{
            return (s.charAt(index) + replacePI(s, index+1));
        }
    }
}
