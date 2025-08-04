package LinearSearch;
//leetcode problem 1672
public class Account {
    public static void main(String[] args) {
        
    }

    static int maximumWealth(int[][] accounts) {
            int maxsum = 0;
            for(int row =0; row<accounts.length ; row++){
                int sum = 0;
                //here the first loop when the row is 0 it will be for the first row and then as the col runs till the lenght of the row , then the row lenght increases and now the loop runs for second row and soo on.
                for(int col=0; col< accounts[row].length; col++){
                    sum = sum + accounts[row][col];
                }
                if(sum>maxsum){
                    maxsum = sum;
                }
            }
            return maxsum;
    }
}
