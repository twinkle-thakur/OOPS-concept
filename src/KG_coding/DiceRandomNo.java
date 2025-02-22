package KG_coding;

public class DiceRandomNo {

	public static void main(String[] args) {
for(int i=1;i<=10;i++) {
double randomNo=Math.random()*6;//generate random no b/n 0-6
//but we dont want 0 therefor we use ceil which will round up			
System.out.println((int)Math.ceil(randomNo));
		}
	}

}
