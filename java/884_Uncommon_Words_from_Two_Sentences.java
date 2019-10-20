class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> lst = new ArrayList<String>();
        Map<String,Integer> map = new HashMap<String,Integer>();

        for (String a:A.split(" ")) {
            if (!map.containsKey(a)) {
                map.put(a,1);
                lst.add(a);
            } else {
                int val = map.get(a);
                if (val==1) {
                    lst.remove(a);
                }
                map.put(a,val+1);
            }
        }
        for (String b:B.split(" ")) {
            if (!map.containsKey(b)) {
                map.put(b,1);
                lst.add(b);
            } else {
                int val = map.get(b);
                if (val==1) {
                    lst.remove(b);
                }
                map.put(b,val+1);
            }
        }
        String [] ret = new String[lst.size()];
        return lst.toArray(ret);
    }
}