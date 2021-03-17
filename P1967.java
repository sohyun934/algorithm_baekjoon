package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1967 {
	private static boolean[] visit = null;
	private static ArrayList<ArrayList<Node>> tree = null;
	private static int maxIndex = 0;
	private static int max = 0;

	public static class Node {
		private int value = 0;
		private int weight = 0;

		public Node(int value, int weight) {
			this.value = value;
			this.weight = weight;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		tree = new ArrayList<>();
		visit = new boolean[num+1];

		for (int i=0; i<=num; i++) {
			tree.add(new ArrayList<Node>());
		}

		StringTokenizer st = null;
		for (int i=1; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			int parent = Integer.parseInt(st.nextToken());
			int child = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());

			tree.get(parent).add(new Node(child, weight));
			tree.get(child).add(new Node(parent, weight));
		}

        dfs(1,0);

        int start = maxIndex;
        maxIndex = 0;
        max = 0;
        visit = new boolean[num+1];
        dfs(start,0);

        System.out.print(max);
	}

	public static void dfs(int seq, int weight) {
		visit[seq] = true;

		for (Node child : tree.get(seq)) {
			if (visit[child.value] == false) {
                if(max<weight+child.weight){
                    max = weight+child.weight;
                    maxIndex = child.value;
                }
                dfs(child.value, weight+child.weight);
			}
		}
	}
}