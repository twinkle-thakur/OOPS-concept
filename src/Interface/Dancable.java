package Interface;

public interface Dancable {
void mydance();
public default void bollywoodDance() {
	System.out.println("bollywood dance");
}
}
