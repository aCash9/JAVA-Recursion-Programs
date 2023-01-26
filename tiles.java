package JavaRecursionPrograms;

public class tiles {
    public static int ways(int n,int m){
        if(n<m){
            return 1;
        }
        if(n==m){
            return 2;
        }
        //placing the tiles vertically
        int vertically=ways(n-m, m);
        //placing the tiles horizontally
        int horizontally=ways(n-1, m);
         return vertically+horizontally;
    }
    public static void main(String[] args) {
        int n=4 ,m=2;
        System.out.println(ways(n, m)); 
    }
}
