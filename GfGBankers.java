public class GfGBankers {
    int n;
    int m;
    int need[][];
    int [][]max;
    int [][]alloc;
    int []avail;
    int safeSequence[];

    void initializeValues() {
        n = 5;
        m = 3;

        alloc = new int[][] {
            { 0, 1, 0 },
            { 2, 0, 0 },
            { 3, 0, 2 },
            { 2, 1, 1 },
            { 0, 0, 2 }
        };

        max = new int[][] {
            { 7, 5, 3 },
            { 3, 2, 2 },
            { 9, 0, 2 },
            { 2, 2, 2 },
            { 4, 3, 3 }
        };

        avail = new int[] { 3, 3, 2 };

        need = new int[n][m];
        safeSequence = new int[n];
    }

    void isSafe() {
        int count = 0;
        boolean visited[] = new boolean[n]; 
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }

        int work[] = new int[m];    
        for (int i = 0; i < m; i++) {
            work[i] = avail[i];
        }

        while (count < n) {
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    int j;
                    for (j = 0; j < m; j++) {
                        if (need[i][j] > work[j])
                            break;
                    }
                    if (j == m) {
                        safeSequence[count++] = i;
                        visited[i] = true;
                        flag = true;
                        for (j = 0; j < m; j++) {
                            work[j] += alloc[i][j];
                        }
                    }
                }
            }
            if (!flag) {
                break;
            }
        }
        if (count < n) {
            System.out.println("The System is UnSafe!");
        } else {
            System.out.println("Following is the SAFE Sequence:");
            for (int i = 0; i < n; i++) {
                System.out.print("P" + safeSequence[i]);
                if (i != n - 1)
                    System.out.print(" -> ");
            }
        }
    }

    void calculateNeed() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                need[i][j] = max[i][j] - alloc[i][j];
            }
        }
    }

    void printNeedMatrix() {
        System.out.println("Need Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(need[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GfGBankers gfg = new GfGBankers();
        gfg.initializeValues();
        gfg.calculateNeed();
        gfg.printNeedMatrix();
        gfg.isSafe();
    }
}
