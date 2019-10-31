class Solution {

    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        while (num > 0) {
            if (num >= 1000) {
                int n = num / 1000;
                appendNtimes(roman, "M", n);
                num = num % 1000;
            }
            if (num >= 500) {
                int n = num / 500;
                appendNtimes(roman, "D", n);
                num = num % 500;
            }
            if (num >= 100) {
                int n = num / 100;
                appendNtimes(roman, "C", n);
                num = num % 100;
            }
            if (num >= 50) {
                int n = num / 50;
                appendNtimes(roman, "L", n);
                num = num % 50;
            }
            if (num >= 10) {
                int n = num / 10;
                appendNtimes(roman, "X", n);
                num = num % 10;
            }
            if (num >= 5) {
                int n = num / 5;
                appendNtimes(roman, "V", n);
                num = num % 5;
            }
            if (num == 4) {
                roman.append("IIII");
                num = 0;
            }
            if (num == 3) {
                roman.append("III");
                num = 0;
            }
            if (num == 2) {
                roman.append("II");
                num = 0;
            }
            if (num == 1) {
                roman.append("I");
                num = 0;
            }
        }

        return fixInteger(roman.toString());
    }

    private StringBuilder appendNtimes(StringBuilder roman, String s, int n) {
        for (int i = 0; i < n; i++) {
            roman.append(s);
        }

        return roman;
    }

    private String fixInteger(String value) {
        return value.replace("DCCCC", "CM")
                .replace("CCCC", "CD")
                .replace("LXXXX", "XC")
                .replace("XXXX", "XL")
                .replace("VIIII", "IX")
                .replace("IIII", "IV");
    }
}
