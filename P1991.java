package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1991 {
	private static HashMap<String, TreeNode> tree = new HashMap<String, TreeNode>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		TreeNode node = null;

		for (int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());

			node = new TreeNode(st.nextToken());
			node.leftChild = new TreeNode(st.nextToken());
			node.rightChild = new TreeNode(st.nextToken());

			tree.put(node.value, node);
		}

		TreeNode root = tree.get("A");
		preOrderTraversal(root);
		System.out.println();
		inOrderTraversal(root);
		System.out.println();
		postOrderTraversal(root);
		br.close();
	}

	public static class TreeNode {
		String value = "";
		TreeNode leftChild = null;
		TreeNode rightChild = null;

		public TreeNode(String value) {
			this.value = value;
		}
	}

	public static void preOrderTraversal(TreeNode node) {
		if (node.value.equals(".")) return;

		System.out.print(node.value);

		if (tree.get(node.leftChild.value) != null)	{
			preOrderTraversal(tree.get(node.leftChild.value));
		}

		if (tree.get(node.rightChild.value) != null) {
			preOrderTraversal(tree.get(node.rightChild.value));
		}
	}

	public static void inOrderTraversal(TreeNode node) {
		if (node.value.equals(".")) return;

		if (tree.get(node.leftChild.value) != null)	{
			inOrderTraversal(tree.get(node.leftChild.value));
		}

		System.out.print(node.value);

		if (tree.get(node.rightChild.value) != null) {
			inOrderTraversal(tree.get(node.rightChild.value));
		}
	}

	public static void postOrderTraversal(TreeNode node) {
		if (node.value.equals(".")) return;

		if (tree.get(node.leftChild.value) != null)	{
			postOrderTraversal(tree.get(node.leftChild.value));
		}

		if (tree.get(node.rightChild.value) != null) {
			postOrderTraversal(tree.get(node.rightChild.value));
		}

		System.out.print(node.value);
	}
}