import java.util.*;

public class Que1 {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if (X[i] == 0)
                cnt++;
        }
        
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k--] = X[i];
            }
        }
        
        int i = k + 1;
        int j = 0;
        k = 0;
        
        while (i < m && j < n) {
            if (X[i] < Y[j])
                X[k++] = X[i++];
            else
                X[k++] = Y[j++];
        }
        
        while (j < n)
            X[k++] = Y[j++];
    }
    
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        mergeArrays(X, Y);
        
        System.out.print("X[] = { ");
        for (int i = 0; i < X.length; i++) {
            if (i != X.length - 1)
                System.out.print(X[i] + ", ");
            else
                System.out.println(X[i] + " }");
        }
    }
}