package KG_coding_Stream;

import java.util.List;
import java.util.Optional;

public class Methods2 {
public static void main(String[] args) {
	List<Integer> list=List.of(1, 6,67,32,9);
	//1.filter
	System.out.println("filtering list of even nums");
	list.stream().filter(a->a%2==0).forEach(e->System.out.print(e+" "));
	
	//2.reduce 
	System.out.println("sum using reduce");
	int sum = list.stream().reduce(0,(a,b)->a+b);
	System.out.println(sum);
	
	System.out.println("max value in list");
	int reduce = list.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
	System.out.println(reduce);
}
}
