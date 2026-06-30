class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        int longest = 0;
        for(int n : set){

            if(!set.contains(n-1)){
                int cur = n;
                int len = 1;

                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }
                longest = Math.max(longest,len);    
            }
        }
        return longest;

        
    }
}
