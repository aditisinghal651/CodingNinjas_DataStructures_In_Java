package graphs;

import java.util.Scanner;

public class DijkstraAlgorithm {

    private static void dijkstraAlgorithm(int[][] adjMatrix) {
        int n = adjMatrix.length;
        boolean visited[] = new boolean[n];
        int distance[] = new int[n];
        distance[0] = 0;
        for(int i = 1; i < n; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n-1; i++){
            int minVertex = findMinVertex(visited, distance);
            visited[minVertex] = true;
            for(int j = 0; j < n; j++){
                if (adjMatrix[minVertex][j] > 0 && !visited[j] && adjMatrix[minVertex][j] != Integer.MAX_VALUE) {
                    //'j' is Unvisited neighbor of minVertex
                    //Calculate distance to reach j from source via minVertex
                    int newDist = distance[minVertex] + adjMatrix[minVertex][j];
                    if(newDist < distance[j]){
                        distance[j] = newDist;
                    }
                }
            }
        }
        //Print distance values for all vertices
        for(int i = 0; i < n; i++){
            System.out.println(i + " "+distance[i]);
        }
    }

    private static int findMinVertex(boolean[] visited, int[] distance) {
        int minVertex = -1;
        for(int i = 0 ; i < visited.length; i++){
            if(!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int adjMatrix[][] = new int[n][n];
        for(int i = 0; i < e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight;
        }
        dijkstraAlgorithm(adjMatrix);
    }
}
