package Sort;

/**
 * Created by PVer on 2017/2/28.
 */
public class TestSelectSort {
    public static void main(String[] args){
        int[] adj={9,1,5,8,3,7,4,6,2};
        SelectSort(adj);
        for(int i : adj){
            System.out.print(i);
        }

    }
    private static void SelectSort(int[] adj){
        int min=0;
        int temp=0;
        for(int i=0;i<adj.length;i++){
            min=i;
            for(int j=i+1;j<adj.length;j++){
                if(adj[min]>adj[j]){
                    min=j;
                }
            }
            if(i!=min){
                temp=adj[i];
                adj[i]=adj[min];
                adj[min]=temp;
            }
        }
    }
}
