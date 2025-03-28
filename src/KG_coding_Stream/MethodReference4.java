package KG_coding_Stream;

import java.util.List;

public class MethodReference4 {
public static void main(String[] args) {
	List<Integer> list2=List.of(3,4,5,8,9);
	list2.forEach(System.out::println);
	Integer sum = list2.stream().reduce(0,Integer::sum);
	System.out.println(sum);
	
}
}
 