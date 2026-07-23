class Solution {
    public String[] findWords(String[] words) {
        List<String>res = new ArrayList<>();
        HashSet<Character>set1 = new HashSet<>();
        HashSet<Character>set2 = new HashSet<>();
        HashSet<Character>set3 = new HashSet<>();
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";
        for(int i=0; i<str1.length(); i++){
            set1.add(str1.charAt(i));
        }
        for(int i=0; i<str2.length(); i++){
            set2.add(str2.charAt(i));
        }
        for(int i=0; i<str3.length(); i++){
            set3.add(str3.charAt(i));
        }


        for(int j=0; j<words.length; j++){
            String str = words[j].toLowerCase();
            boolean flag = true;
            if(set1.contains(str.charAt(0))){
                for(int i=0; i<str.length(); i++){
                    if(set1.contains(str.charAt(i))){
                        continue;
                    }else{
                        flag = false;
                    }
                }
            }

            if(set2.contains(str.charAt(0))){
                for(int i=0; i<str.length(); i++){
                    if(set2.contains(str.charAt(i))){
                        continue;
                    }else{
                        flag = false;
                    }
                }
            }

            if(set3.contains(str.charAt(0))){
                for(int i=0; i<str.length(); i++){
                    if(set3.contains(str.charAt(i))){
                        continue;
                    }else{
                        flag = false;
                    }
                }
            }
            if(flag == true) res.add(words[j]);
        }
        String ans[] = new String[res.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}