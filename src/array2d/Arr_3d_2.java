package array2d;

public class Arr_3d_2 {

	public static void main(String[] args) {
		int[][][] a= {
				{{10,20,30},{40},{50,60,70}},
				{{1,2,3},{4,5},{9}},
				{{-5},{-6,-7},{-10}},
				{{-20,-30,-40}},
		};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
			}
			
		}
		}

}
