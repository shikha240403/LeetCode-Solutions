class Solution {
    public int hammingDistance(int x, int y) {
        int result=x^y,cnt=0;
        while(result!=0) {
            cnt+=(result & 1)!=0 ? 1:0;
            result=result>>1;
        }
        return cnt;
    }
}