class Solution {
    public int countSegments(String s) {
        
        if(s.length() == 0) return 0;
        String words[]=s.split(" ");
        int cnt=0;
        for(String str : words)
        {
            if(!str.isEmpty())
            cnt++;
        }
        return cnt;
        
    }
}