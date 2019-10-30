/**
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
 */
class Solution {

    public String fixRoman(String value) {
        return value.replace("IV", "IIII")
                .replace("IX", "VIIII")
                .replace("XL", "XXXX")
                .replace("XC", "LXXXX")
                .replace("XC", "LXXXX")
                .replace("CD", "CCCC")
                .replace("CM", "DCCCC");
    }

    public Map<String, Integer> createRomanMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        return map;
    }

    public int romanToInteger(String romanNumber) {
        int num = 0;
        Map<String, Integer> map = createRomanMap();

        for (int i = 0; i < romanNumber.length(); i++) {
            num += map.get("" + romanNumber.charAt(i));
        }

        return num;
    }
}
