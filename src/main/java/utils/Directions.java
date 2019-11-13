package utils;

public class Directions {

	public static final int[][] four() {
		int[][] dir = new int[4][2]; // matrix of rows & cols
		dir[0] = new int[] { 1, 0 }; // down : row
		dir[1] = new int[] { -1, 0 }; // up : row
		dir[2] = new int[] { 0, 1 }; // right : col
		dir[3] = new int[] { 0, -1 }; // left : col
		return dir;
	}

	public static final int[][] rightDown() {
		int[][] dir = new int[2][2]; // in a matrix
		dir[0] = new int[] { 0, 1 }; // right
		dir[1] = new int[] { 1, 0 }; // down
		return dir;
	}

}
