class QuickUnion {
    private int[] id;

    public QuickUnion(int N){
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }
    public boolean Connected(int p, int q){
        return id[p] == id[q];
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
        QuickUnion a = new QuickUnion(9);
        a.Union(0,5);
        a.Union(5,3);
        a.Union(5,8);
        a.Union(7,4);
        a.Union(4,3);
        System.out.println(a.Connected(7,0));
    }
}
