class Solution {
    public boolean checkRecord(String s) {
        int acount=0;
        boolean lateflag = false;
        for(int i=0;i<s.length();i++)
        {
            if(lateflag && s.charAt(i)=='L')
                return false;
            else
                lateflag =false;
            if(acount==2)
                return false;
            if(s.charAt(i)=='A')
                acount++;
            if(s.charAt(i)=='L' && i+1<s.length() && s.charAt(i+1)=='L'){
                i+=1;
                lateflag = true;
            }
        }
        if(acount==2)
            return false;
        return true;
    }
}
