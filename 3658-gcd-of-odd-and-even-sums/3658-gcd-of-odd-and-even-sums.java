class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0;
        int even = 0;
        for(int i=1; i<=n*2; i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        System.out.println(odd);
        System.out.println(even);

        while(n>0){
            if(even%n==0 && odd%n==0){
                return n;
            }
            n--;
        }
        return 1;
    }
}