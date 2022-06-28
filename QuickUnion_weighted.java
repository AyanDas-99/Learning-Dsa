
class unionFind {
    private int[] id;
    private int[] size;
    public unionFind(int N) {
        id = new int[N];
        size = new int[N];
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
        if(size[q_root]<size[p_root])
        id[q_root] = p_root;
        else id[p_root] = q_root;
    }

    public boolean Connected(int p, int q) {
        return root(p) == root(q);
    }
}

public class QuickUnion_weighted{
    public static void main(String[] args) {
        unionFind a = new unionFind(10);
        a.Union(9, 2);
        a.Union(4, 3);
        a.Union(6, 5);
        a.Union(9, 4);
        System.out.println(a.Connected(3, 2));
    }
}