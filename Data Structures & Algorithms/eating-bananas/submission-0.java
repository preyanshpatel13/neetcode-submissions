class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for(int pile : piles){
            r = Math.max(r,pile);
        }
        int ans = r;

        while(l <= r){
            int k = l + (r - l)/2;
            int hours = 0;

            for(int pile : piles){
                hours += (pile + k - 1) /k;
            }

            if(hours <= h){
                ans = k;
                r = k-1;
            }else{
                l = k+1;
            }
        }
        return ans;   
    }
}
