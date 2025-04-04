package KG_coding_Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Challenge115 {

	public static void main(String[] args) {
List<String> list=List.of("1","2","5");
List<Integer> collect = list.stream().map(str->Integer.parseInt(str)).map(num->(int)Math.pow(num,2)).collect(Collectors.toList());
System.out.println(collect);
	}

}
