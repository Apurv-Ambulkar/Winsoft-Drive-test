public class Que2 {

    // Function to return max path sum in two arrays
    public static int maxPathSum(int[] X, int[] Y) {
        int i = 0, j = 0;
        
        // sums
        int result = 0, sum1 = 0, sum2 = 0;
        
        while (i < X.length && j < Y.length) {
            // Add elements of X[] to sum1
            if (X[i] < Y[j])
                sum1 += X[i++];
                
            // Add elements of Y[] to sum2
            else if (X[i] > Y[j])
                sum2 += Y[j++];
                
            // We found a common element
            else {
                // Take the maximum of two sums and add to result
                result += Math.max(sum1, sum2);
                
                // Update sum1 and sum2 for elements after this intersection point
                sum1 = 0;
                sum2 = 0;
                
                // Keep updating result while there are more common elements
                while (i < X.length && j < Y.length && X[i] == Y[j]) {
                    result = result + X[i];
                    i++;
                    j++;
                }
            }
        }
        
        // Add remaining elements of X[]
        while (i < X.length)
            sum1 += X[i++];
            
        // Add remaining elements of Y[]
        while (j < Y.length)
            sum2 += Y[j++];
            
        // Add maximum of two sums of remaining elements
        result += Math.max(sum1, sum2);
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] X = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] Y = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        
        System.out.println("The maximum sum path is " + maxPathSum(X, Y));
    }
}