class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], i);
        }
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            if(map.containsKey(curr*2) && map.get(curr*2)!=i){
                return true;
            }
        }
        return false;
    }
}