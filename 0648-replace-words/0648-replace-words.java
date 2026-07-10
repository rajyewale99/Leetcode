class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String sent[] = sentence.split(" ");
        for(int i=0; i<dictionary.size(); i++){
            int len = dictionary.get(i).length();
            for(int j=0; j<sent.length; j++){
                if(dictionary.get(i).length()<=sent[j].length() 
                && sent[j].substring(0,len).equals(dictionary.get(i))){
                    sent[j] = dictionary.get(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sent.length; i++){
            sb.append(sent[i]);
            if(i<sent.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}