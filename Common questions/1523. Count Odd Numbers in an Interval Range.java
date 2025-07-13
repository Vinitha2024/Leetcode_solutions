class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int n=(high-low)+1;
        if(n%2==0)
           count=n/2;
        else{
            if(high%2!=0 || low%2!=0){
                count=n/2+1;
            }
            else
             count=n/2;
        }
        return count;
    }
}
