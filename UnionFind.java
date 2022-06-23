class QuickUnion {
    private int[] id;

    public QuickUnion(int N){
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }
    public boolean Connected(int p, int q){
        return id[p] == id[p];
    }
    public void Union(int p, int q){
        int idp = id[p];
        int idq = id[q];
        for (int i = 0; i <id.length; i++) {
            if(id[i]==idp) id[i] = idq;
        }
    }
}


public class UnionFind {
    public static void main(String[] args) {

    }
}
