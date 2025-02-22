package KG_coding;
/*
 * math methods are static & accessed directly
 * constants include Pi & E for pie
 *   #key methods:-
 * 1)abs():Absolute value= Absolute value means positive values
 *            if you pass -ve no. it will convert to +ve no. -2-->2
 * 2)ceil():Rounds up= . ke phele ke int ko new closest int mai kr dega
 *                     irrespective of value after . 
 *                     eg: 99.4/99.9/99.5...--->100
 *  3)floor():Round down=it will remove decimal part and will give only int
 *                     eg:99.5/99.9/99.7...--->99 
 *  4)round():round to nearest integer 
 *           9.6-->10or 9.4-->9
 *  5)max(),min():give maximum or minimum of 2 no.
 *  6)pow():for power calculation
 *  7)sqrt():give Square root
 *  8)random():RAndom no. generation
 *  9)exp(),log():exponenetial & logarithmic  f/n 
 *  10)Trigonometric f/n:sin(),cos()..are in built                 
 * */
public class MathClassInJava {
public static void main(String[] args) {
	System.out.println(Math.abs(-15));
	System.out.println(Math.ceil(99.05));
	System.out.println(Math.floor(99.45));
	System.out.println(Math.round(9.4));
	System.out.println(Math.round(9.6));
	System.out.println(Math.max(10, 20));
	System.out.println(Math.min(-2, 0));
	System.out.println(Math.pow(2, 0));
	System.out.println(Math.pow(2, 2));
	System.out.println(Math.sqrt(36));
	System.out.println(Math.random());//generates any no b/n 0-1 
	//where 0 is exclusive and 1 is not included 0.223..,0.001..
	//or0.99999.....in decimal
	//but if i want randon no b/n 0-100 then just multipy 
	System.out.println(Math.random()*100);//multipy acc to your range
	System.out.println(Math.PI);
}
}
