class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new ArrayList<>();
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;
        int top = 0;
        List<Integer> spiralOrderList = new ArrayList<>();

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                spiralOrderList.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiralOrderList.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralOrderList.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralOrderList.add(matrix[i][left]);
                }
                left++;
            }

        }

        return spiralOrderList;
    }
}
