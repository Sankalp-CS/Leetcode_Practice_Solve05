class MagicDictionary {
    HashSet<String> set;

    public MagicDictionary() {
        set=new HashSet<>();
    }
    
    public void buildDict(String[] dictionary) {
        for(String word:dictionary){
            set.add(word);
        }
    }
    
    public boolean search(String searchWord) {
        for (String word : set) {

            if (word.length() != searchWord.length()) {
                continue;
            }

            int diff = 0;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != searchWord.charAt(i)) {
                    diff++;
                }
            }

            if (diff == 1) {
                return true;
            }
        }

        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */