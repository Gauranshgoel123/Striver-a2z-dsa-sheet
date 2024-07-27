class Solution {
public:
    bool isPalindrome(int x) {
        int rem;
        int t=x;
        long int rev=0;
        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x/=10;
        }
        return (rev==t) ? true:false;
    }
};
