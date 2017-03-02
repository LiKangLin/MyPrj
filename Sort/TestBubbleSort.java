package Sort;

/**
 * Created by LKL on 2017/2/28.
 */
public class TestBubbleSort {

    public static void main(String[] args){
        int[] adj ={9,1,5,8,3,7,4,6,2};
        BubbleSort3(adj);
        for(int i:adj){
            System.out.print(i);
        }
    }
    private static void BubbleSort1(int[] adj){
        int i=0;
        int j=0;
        int temp=0;
        for(i=0;i<adj.length;i++){
            for(j=i+1;j<adj.length;j++){
                if(adj[i]>adj[j]){
                    temp=adj[i];
                    adj[i]=adj[j];
                    adj[j]=temp;
                }
            }
        }
    }
    //真正的冒泡排序，由下往上，一个个比较，当数据量达到十万级别，优势明显
    private static void BubbleSort2(int[] adj){
        int temp=0;
        for(int i=0;i<adj.length;i++){
            for(int j=adj.length-2;j>=i;j--){
                if(adj[j]>adj[j+1]){
                    temp=adj[j];
                    adj[j]=adj[j+1];
                    adj[j+1]=temp;
                }
            }
        }
    }
    //冒泡排序优化,应对一些特殊情况，比如说{2,1,3,4,5,6,7,8,9}
    private static void BubbleSort3(int[] adj){
        int i=0;
        int j=0;
        int temp=0;
        boolean flag=true;
        for(i=0;i<adj.length && flag;i++){
            flag=false;
            for(j=adj.length-2;j>=i;j--){
                if(adj[j]>adj[j+1]){
                    temp=adj[j];
                    adj[j]=adj[j+1];
                    adj[j+1]=temp;
                    flag=true;
                }
            }
        }
    }
}
