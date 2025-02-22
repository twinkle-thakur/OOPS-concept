package ArraySirM;
/*1)i/p size of array
 *2)initialize array with size+1 
 *3)i/p index at which we want to add data
 *4)start loop from last index upto given index and do right shifting
 *5)transfer value of data to array index
  */ 
 public class Add {
    static void add(int index,int data) {
    	int size=5;
    	int[] a=new int[size+1];
    	a[0]=10; a[1]=20; a[2]=30; a[3]=40; a[4]=50;
    	System.out.println("array before add");
    	for(int i=0;i<a.length-1;i++) {
    		System.out.print(a[i]+" ");
    	}
    	System.out.println("\narray after  add");
    	
    	for(int i=a.length-1;i>index;i--) {
    		a[i]=a[i-1];
    	}
        a[index]=data;
        
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+" ");
        }
    }
	public static void main(String[] args) {
		add(3,100);
	}

}
