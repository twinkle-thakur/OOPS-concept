package KG_coding_Stream;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
	
	//3) IntStream.range(int start,int end)
	//it will print num from 0 to 5 bec0z 6 is exclusive
	IntStream.range(0, 6).forEach(e->System.out.print(e+" "));
	
	//4)IntStream.rangeClosed(int start,int end)
	//it will print num from 0 to 6
	IntStream.rangeClosed(0, 6).forEach(e->System.out.print(e+" "));
	
	//5) max()=gives max element from stream
	Optional<Integer> max = list.stream().max(Integer::compareTo);
	max.ifPresent(System.out::println);
	
	//6) min()=gives min element from stream
	Optional<Integer> min = list.stream().min(Integer::compareTo);
	min.ifPresent(System.out::println);
	
	//7) collect()=convert stream to list/map/set etc
	List<Integer> collect=list.stream().collect(Collectors.toList());
	System.out.println(collect);
	
	//8)sorted()=sorts the list in natural ordering
	List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedList);
	
	//9)distinct()=removes duplicates from the list
	List<String> fruits=List.of("apple","apple","banana","mango","mango");
	List<String> distinctFruits = fruits.stream().distinct().collect(Collectors.toList());
	System.out.println(distinctFruits);
	
	//10) map()=applies a fn to each element of a stream and transforms into new stream
	List<String> upperCase = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
     System.out.println(upperCase);
}
}
