class Solution {
    
    static List<String> myList = new ArrayList<>();
    
    public void letterCaseHelper(StringBuilder s, int ptr)
    {
        if(ptr<s.length())
        {
            if(Character.isLetter(s.charAt(ptr)))
            {
               s.setCharAt(ptr,Character.toLowerCase(s.charAt(ptr)));
                if(!myList.contains(s.toString()))
                    myList.add(s.toString());
               letterCaseHelper(s,ptr+1);
               s.setCharAt(ptr,Character.toUpperCase(s.charAt(ptr)));
                if(!myList.contains(s.toString()))
                    myList.add(s.toString());
               letterCaseHelper(s,ptr+1);
           }
            else
            {
            letterCaseHelper(s,ptr+1);
            }
        }
    }
    
    
    public List<String> letterCasePermutation(String S) {
        myList.clear();
        StringBuilder st = new StringBuilder(S);
        myList.add(S);
        letterCaseHelper(st,0);
        return myList;
    }
}
