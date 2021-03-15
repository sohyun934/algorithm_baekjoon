package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11725 {
	static boolean[] visit = null;
	static ArrayList<ArrayList<Integer>> graph = null;
	static int[] parent = null;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		graph = new ArrayList<>();
		visit = new boolean[num+1];
		parent = new int[num+1];

		for (int i=0; i<=num; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i=1; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());

			graph.get(node1).add(node2);
			graph.get(node2).add(node1);
		}

		dfs(1);

		for (int i=2; i<parent.length; i++) {
			bw.write(String.valueOf(parent[i]) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	public static void dfs(int seq) {
		visit[seq] = true;

		for (int node : graph.get(seq)) {
			if (visit[node] == false) {
				parent[node] = seq;
				dfs(node);
			}
		}
	}
}