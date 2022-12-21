import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        Scanner kb = new Scanner(System.in);
        int N=kb.nextInt();
        int[][] arr=new int[N][2];
        for(int i=0; i<N; i++){
            arr[i][0]=kb.nextInt();
            arr[i][1]=kb.nextInt();
        }

        for(int i=0; i<N; i++){
            int rank=1;
            for(int j=0; j<N; j++){
                if(i==j) continue;
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) rank++;
            }
            System.out.print(rank+" ");
        }

    }
}