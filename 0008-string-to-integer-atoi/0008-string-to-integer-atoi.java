class Solution {
    public int myAtoi(String s) {
        String s1 = s.trim();
        if (s1.length() == 0)
            return 0;
        long res = 0;
        int sign = 1;
        int i = 0;
        if(s1.charAt(0)=='-'){
            sign = -1;
            i++;
        }else if(s1.charAt(0)=='+'){
            i++;
        }

        while(i<s1.length() && Character.isDigit(s1.charAt(i))){
                res*=10;
                res+=(s1.charAt(i)-'0');
           if(sign ==1 && res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
           }else if(sign == -1 && -res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
           }  
           i++;
        }
        return (int)(res*sign);
    }
}