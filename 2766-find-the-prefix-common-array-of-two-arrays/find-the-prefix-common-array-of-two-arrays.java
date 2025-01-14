class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        int commonCount = 0;

        boolean[] seen = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            if (seen[A[i]]) {
                commonCount++;
            } else {
                seen[A[i]] = true;
            }

            if (seen[B[i]]) {
                commonCount++;
            } else {
                seen[B[i]] = true;
            }

            C[i] = commonCount;
        }

        return C;
    }
}
