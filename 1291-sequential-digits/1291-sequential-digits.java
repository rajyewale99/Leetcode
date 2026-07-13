class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>list = new ArrayList<>();

        String str = new String("123456789");
        for(int i=0; i<9; i++){
            for(int j=i+1; j<=9; j++){
                String res = str.substring(i,j);
                int num = 0;
               if (!res.isEmpty()) {
                    num = Integer.parseInt(res);
                }
                if(num>=low && num<=high){
                    list.add(num);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}