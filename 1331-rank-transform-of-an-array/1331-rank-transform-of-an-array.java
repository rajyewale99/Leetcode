class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arr1[] = arr.clone();
        Arrays.sort(arr1);
        HashMap<Integer, Integer>map = new HashMap<>();
        int count = 1;
        for(int i=0; i<arr1.length; i++){
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], count);
                count++;
            }
        }
        int res[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}