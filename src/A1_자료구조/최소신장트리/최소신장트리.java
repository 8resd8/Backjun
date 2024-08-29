package A1_자료구조.최소신장트리;

public class 최소신장트리 {
    static int[] parent, rank;
    static int N;
    public static void main(String[] args) {
        // 1. 사이클 존재 확인해야함 -> union find
        N = 4;
        parent = new int[N];
        rank = new int[N];
        // makeSet
        for (int i = 0; i < N; i++) {
            parent[i] = i;
            rank[i] = 0;
        }


    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b) return;
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }
    static void union2(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b) return;

        if (rank[a] < rank[b]) {
            parent[b] = a;
        } else if (rank[a] > rank[b]) {
            parent[a] = b;
        } else {
            parent[b] = a;
            rank[a]++;
        }
    }

    private static int find(int a) {
        if (a == parent[a]) return a;
        return parent[a] = find(a);
    }
}
