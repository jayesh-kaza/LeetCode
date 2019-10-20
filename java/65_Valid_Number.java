public class Problem65ValidNumber {

    public static void main(String[] args) {
        String[] inputNumbers = {"0", " 0.1 ", "abc", "1 a", "2e10", " -90e3  ", " 1e", "e3", " 6e-1", " 99e2.5 ", "53.5e93", " --6 ", "-+3", "95a54e53", "+0", "-0", "e-1", "-e-1", "1e+10", "1+10", "1e+10+1", "1.e+101", "1e1.5", "1.e1.5", "1.e15", "1e-1", ".", "e", "+", "-", "9", "1", "1e.5", " ", "a", ".1", "1+", "1-", "3.", "0.001", ".e1", "+.8", "-.8", "-0.6e2", ".8+", ".8-", "6ee69", "6..69"};
        boolean[] expectedStrings = {true, true, false, false, true, true, false, false, true, false, true, false, false, false, true, true, false, false, true, false, false, true, false, false, true, true, false, false, false, false, true, true, false, false, false, true, false, false, true, true, false, true, true, true, false, false, false, false};

        for (int i = 0; i < inputNumbers.length; i++) {
            boolean s2 = expectedStrings[i];
            System.out.println("TEST: " + (i + 1));
            System.out.println("Input: " + inputNumbers[i]);
            System.out.println("Expected: " + s2);
            boolean s1 = isNumber(inputNumbers[i]);
            System.out.println("Output: " + s1);
            if (!(s1 == s2)) {
                System.out.println("CASE " + (i + 1) + " WRONG!");
            }
            System.out.println();
        }
    }

    private static boolean isNumber(String s) {
        s = s.trim();

        int len = s.length();
        boolean exponentMode = false;
        boolean dotMode = false;
        boolean operationMode = false;
        int numberCounter = 0;
        char c = ' ';
        for (int i = 0; i < len; i++) {
            c = s.charAt(i);

            switch (c) {
                case '+':
                case '-':
                    if (operationMode || (!exponentMode && i != 0)) {
                        return false;
                    }

                    operationMode = true;

                    break;
                case 'e':
                    if (i == 0 || operationMode || (numberCounter == 0 && dotMode) || exponentMode) {
                        return false;
                    }

                    exponentMode = true;

                    break;
                case '.':
                    if (dotMode || exponentMode) {
                        return false;
                    }

                    dotMode = true;

                    break;
                default:
                    if (c < 48 || c > 57) {
                        return false;
                    }

                    operationMode = exponentMode & operationMode;
                    numberCounter++;
            }
        }

        return len != 0 && c != 'e' && c != '+' && c != '-' && (c != '.' || numberCounter != 0);
    }
}