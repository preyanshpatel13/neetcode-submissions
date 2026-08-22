class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int maxf =0;
        int ans = 0;

        for(int right = 0; right< s.length(); right++){
            int index = s.charAt(right)- 'A';
            freq[index]++;

            maxf = Math.max(maxf,freq[index]);

            while( (right-left+1) - maxf > k ){
                int leftindex =  s.charAt(left)- 'A';
                freq[leftindex]--;
                left++;
            }

            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
