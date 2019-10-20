public class Solution {

    public boolean isNumber(String s) {
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