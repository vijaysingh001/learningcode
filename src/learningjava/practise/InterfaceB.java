package learningjava.practise;

//@FunctionalInterface
public interface InterfaceB {

	default void show() {
		System.out.println("deafult method of class B");
	}
}

//class FunctionalCheck {
//	
//	public static void main(String[] args) {
//		
//		InterfaceB B=()->{
//			System.out.println("this functional interfcae");
//		};
//		B.show();
//		
//	}
//}
