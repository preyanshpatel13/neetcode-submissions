class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];

        for(int i =0; i< temperatures.length; i++){
            int count = 1;
            int j = i+1;

            while(j != temperatures.length){

                if(temperatures[i] < temperatures[j]){
                    ans[i] = count;
                    break; 
                }else{
                    j++;
                    count++;
                }

            } 
        }
        return ans;
        
    }
}
