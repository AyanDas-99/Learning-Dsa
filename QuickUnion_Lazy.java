
class LazyUnionFind {
    private int[] id;

    public LazyUnionFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int root(int i) {
        while (id[i] != i)
            i = id[i];
        return i;
    }

    public void Union(int p, int q) {
        int p_root = root(p);
        int q_root = root(q);
        id[q_root] = p_root;
    }

    public boolean Connected(int p, int q) {
        return root(p) == root(q);
    }
}

public class QuickUnion_Lazy {
    public static void main(String[] args) {
        unionFind a = new unionFind(10);
        a.Union(9, 2);
        a.Union(4, 3);
        a.Union(6, 5);
        a.Union(9, 4);
        System.out.println(a.Connected(3, 2));
    }
}