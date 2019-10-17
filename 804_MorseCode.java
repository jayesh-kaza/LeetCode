class Solution {
    public int uniqueMorseRepresentations(String[] words)
    {
        if(words.length<=1)
            return words.length;
   String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs=new HashSet();
        StringBuilder temp=null;
        for(String w:words)
        {
            temp=new StringBuilder();
            for(char c:w.toCharArray())
            {
                temp.append(arr[c-97]);
            }
            hs.add(temp.toString());
        }
        return hs.size();
    }
}
