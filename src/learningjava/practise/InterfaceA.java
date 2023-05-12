package learningjava.practise;

public interface InterfaceA {
	 default void show() {
		System.out.println("Interface static methods");
	}
}
