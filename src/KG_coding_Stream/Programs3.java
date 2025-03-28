package KG_coding_Stream;

import java.util.List;

public class Programs3 {
public static void main(String[] args) {
	List<String> list=List.of("khushihjadsk","my name twinkle","chirag","om");
	List<Integer> list2=List.of(3,4,5,8,9);
	//after filtering concate
	String reduce = list.stream().filter(s->s.length()>=10).reduce("",(a,b)->a+" "+b);
	System.out.println(reduce);
	
	//find odd num
	list2.stream().filter(a->a%2!=0).forEach(e->System.out.print(e+" "));
	
}
}
