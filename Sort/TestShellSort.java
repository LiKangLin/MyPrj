package Sort;

/**
 * Created by LKL on 2017/3/2.
 */
public class TestShellSort {
    public static void main(String[] args){
        int[] adj={5,4,8,1,0,9,2,6,3,7};
        ShellSort(adj);
        for(int i : adj){
            System.out.print(i);
        }
    }
    private static void ShellSort(int[] adj){
        int out=0;
        int in=0;
        int temp=0;
        int len = adj.length;
        int increment = 1;
        while(increment < len / 3) // 增量序列
            increment = increment * 3 + 1;
        while(increment > 0){
            for(out = increment; out < len; out++) {
                temp = adj[out];
                in = out;
                while (in > increment - 1 && adj[in - increment] >= temp) {
                    adj[in] = adj[in - increment];
                    //第一次比较的是adj[0]和adj[4],比较大小，进行数据交换
                    in -= increment;
                }
                adj[in] = temp;
            }
            //缩小增量间距
            increment = (increment - 1) / 3;
        }
    }
}


