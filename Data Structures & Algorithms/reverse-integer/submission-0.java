class Solution {
    public int reverse(int x) {
        int n=x;
        int ld;
        int rev_no=0;
        while(n!=0){
            ld=n%10;
              // Overflow check
            if (rev_no > Integer.MAX_VALUE / 10 ||
                (rev_no == Integer.MAX_VALUE / 10 && ld > 7))
                return 0;

            // Underflow check
            if (rev_no < Integer.MIN_VALUE / 10 ||
                (rev_no == Integer.MIN_VALUE / 10 && ld < -8))
                return 0;
            rev_no=(rev_no*10)+ld; 
            n=n/10;
           
        }

    return rev_no;}
}
