package Sort;

/**
 * Created by LKL on 2017/2/28.
 */
public class TestInsertSort {
    public static void main(String[] args ){
        int[] adj={9,1,5,8,3,7,4,6,2};
        InsertSort(adj);
        for(int i : adj){
            System.out.print(i);
        }
    }
   private static void InsertSort(int[] adj){
       int temp=0;
       for (int i = 1; i < adj.length; i++) {
           for (int j = i-1; j >= 0 &&adj[j]>adj[j+1]; j--) {
                   temp = adj[j +1];
                   adj[j + 1] = adj[j];
                   adj[j] = temp;
               }
           }
       }
   }


