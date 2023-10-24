public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int count=0;
        int num=n;
        while(num>0)
        {
            int rem=num%10;
            if( rem!=0 && n%rem==0)
            {
                count++;
            }
            num=num/10;
        }
        return count;
    }
}

