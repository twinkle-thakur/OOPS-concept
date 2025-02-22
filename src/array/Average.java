package array;

public class Average {

	public static void main(String[] args) {
	//1:int arr[3]=1,2,3-->10=sum
	//:avg=sum/3	
		int arr[]= {1,2,3,4,9,8};
		double sum=0;
		double avg;
        for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
				}
      avg=sum/arr.length;
        System.out.println(sum);
        System.out.println(avg);
	}

}
