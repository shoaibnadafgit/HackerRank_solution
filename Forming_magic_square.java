import java.util.Scanner;

//https://www.hackerrank.com/challenges/magic-square-forming/problem
public class Forming_magic_square {
	public static void main(String[] args) {
	//predefined justed coppied fro internet 
	//we can form this also 
	   int[][][] possiblePermutations = {
	            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},// 1

	            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},// 2

	            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},// 3

	            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},// 4

	            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},// 5

	            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},// 6

	            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},// 7

	            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},// 8
	        };
	
		Scanner in =new Scanner (System.in);
		int [][]a=new int[3][3];
		int n =3;
		for (int i =0;i<n;i++) {for (int j =0;j<n;j++) 
		{
			a[i][j]=in.nextInt();
		}}
		
		int mincost=Integer.MAX_VALUE;
		for (int permutation =0;permutation<8;permutation++) 
		{int cost =0;for (int i =0;i<n;i++) 
		{for (int j =0;j<n;j++) 
			cost+=Math.abs(a[i][j]-possiblePermutations[permutation][i][j]);
		}mincost=Math.min(mincost, cost);}
		
		System.out.println(mincost);
	}

}
