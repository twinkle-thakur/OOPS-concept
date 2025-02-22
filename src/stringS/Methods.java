package stringS;

public class Methods {
	public static void main(String[] args) {
		String name="KHUsshi";
		int value=name.length();
		System.out.println(value);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.substring(3));
		System.out.println(name.substring(2,4));
		System.out.println(name.replace('s', 'h'));
		System.out.println(name.startsWith("KH"));
		System.out.println(name.endsWith("sd"));
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('s'));
		System.out.println(name.lastIndexOf('s'));
		System.out.println(name.equals("KHUsshi"));
		System.out.println(name.equalsIgnoreCase("khusshi"));
		//using escape seq
		String s="my,\n\t name is,\n\t khushi";
		System.out.println(s);
	}
	

}
