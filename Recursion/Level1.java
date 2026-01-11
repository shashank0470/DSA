package Recursion;

public class Level1 {
    public static void main(String[] args) {
//        System.out.println(fact(4));
        System.out.println(Zero(203056001));
    }
    //Counting Zeros using recursion
    static int Zero(int n){
        return helper(n,0);
    }
    private static int helper(int n, int c) {
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return helper((n/10),++c);
        }
        return helper(n/10, c);
    }

    //Reverse a number using recursion
//    static int Reverse(int n){
//        if(n==0){
//            return 0;
//        }
//        int last =
//        return (n)
//    }

    //Product of digit with recursion
    static int Pdigit(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * Pdigit(n/10);
    }

    //Sum of digits with recursion
    public static int Sdigit(int n){
        if(n==0){
            return 0;
        }
        int LastD = n%10;
        n = n/10;
        return LastD + Sdigit(n);
    }

    //1 to n number with recursion
    static void oneTon(int m){
        if(m==0){
            return;
        }
        oneTon(m-1);
        System.out.print(m + ",");
    }

    //factorial with recursion
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    //n to 1 number with recursion
    static int nToOne(int n){
        if(n==0||n==1){
            return 1;
        }
        System.out.print(n + ",");
        return nToOne(n-1);
    }

}
