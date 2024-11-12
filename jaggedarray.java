public class jaggedarray {
    public static void main(String[] args) {
        int[][] graph = new int[6][];
        
        graph[0] = new int[]{4, 3, 6, 2}; 
        graph[1] = new int[]{1, 5, 3};    
        graph[2] = new int[]{3, 8, 2, 5}; 
        graph[3] = new int[]{2, 1};       
        graph[4] = new int[]{6, 3, 2, 4}; 
        graph[5] = new int[]{4, 2, 1, 5}; 

        
        for (int i = 0; i < graph.length; i++) {
            System.out.print((i + 1) + " : ");
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}

