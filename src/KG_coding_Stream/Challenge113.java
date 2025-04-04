package KG_coding_Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Challenge113 {
	public static void main(String[] args) {
		List<Integer> list=List.of(1,1,3,2,2,2,1,8,5);
		List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
	}
}
