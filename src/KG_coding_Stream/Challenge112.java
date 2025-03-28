package KG_coding_Stream;

import java.util.Optional;

public class Challenge112 {
	public static Optional<String> optional(String str){
		if(str==null||str.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(str.toUpperCase());
	}
public static void main(String[] args) {
	System.out.println(optional(null));
	System.out.println(optional(""));
	System.out.println(optional("khushi"));
}
}
