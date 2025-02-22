package array2d;

public class Array_3d {

	public static void main(String[] args) {
		int[][][] a=new int[4][3][2];
		System.out.println(a.length);
		System.out.println(a);
		System.out.println(a[0].length);
		System.out.println(a[0]);
		System.out.println(a[0][1].length);
		System.out.println(a[0][0]);
		a[2][0][1]=140;
		a[2][1][0]=150;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				for(int k=0;k<a[0][0].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
			}
		}
	}

}
