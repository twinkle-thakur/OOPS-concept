package array2d;

public class Memory_re {

	public static void main(String[] args) {
		int[][] arr=new int[4][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[0]);
		System.out.println(arr);
		arr[2][1]=100;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			
			}
		}
	}

}
