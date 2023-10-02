import java.util.Arrays;
public class ObjectRenderer {
    public int solution(int[] D, int[] C, int P){
        int n = D.length;
        int maxObjects = 0;

        // Create a 2D array to store objects with their distances and processing power costs
        int[][] objects = new int[n][2];
        for (int i = 0; i < n; i++) {
            objects[i][0] = D[i];  // Store distance
            objects[i][1] = C[i];  // Store processing power cost
        }

        // Sort objects by distance in ascending order
        Arrays.sort(objects, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            int totalCost = 0;
            for (int j = i; j < n; j++) {
                totalCost += objects[j][1];  // Accumulate processing power cost
                if (totalCost > P) {
                    break;  // Stop rendering if exceeding processing power
                }
                maxObjects = Math.max(maxObjects, j - i + 1);  // Update max objects
            }
        }

        return maxObjects;
    }
}
