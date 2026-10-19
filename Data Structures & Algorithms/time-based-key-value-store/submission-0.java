class TimeMap {
    HashMap<String, List<Integer>> timestamps;
    HashMap<String, List<String>> values;
    

    public TimeMap() {
        timestamps = new HashMap<>();
        values = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        timestamps.putIfAbsent(key, new ArrayList<>());
        values.putIfAbsent(key, new ArrayList<>());

        timestamps.get(key).add(timestamp);
        values.get(key).add(value);
        
    }
    
    public String get(String key, int timestamp) {
        if (!timestamps.containsKey(key)) {
            return "";
        }

        List<Integer> times = timestamps.get(key);
        List<String> vals = values.get(key);

        int l =0;
        int r = times.size()-1;
        String ans = "";

        while(l <= r){
            int m = l + (r - l)/2;

            if(times.get(m) <= timestamp){
                ans = vals.get(m);
                l = m+1;
            }else{
                r = m-1;
            }

        }
        return ans;
        
    }
}
