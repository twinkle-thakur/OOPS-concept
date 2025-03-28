package KG_coding_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Print1 {
	public static void main(String[] args) {
		List<String> list=List.of("twinkle","khushi","om");
		//normal way to print
		for(String i:list) {
			System.out.print(i+" ");
		}
		
		//printing with stream
//		list.stream().forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});
		//using lambda expresion same thing can be written as
		list.stream().forEach(s->System.out.print(s+" "));
	}

}
