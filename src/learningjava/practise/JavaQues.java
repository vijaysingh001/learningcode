package learningjava.practise;


public class JavaQues implements InterfaceA,InterfaceB{

	public static void main(String[] args) {
		
		JavaQues j=new JavaQues();
		
		j.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		InterfaceA.super.show();
		InterfaceB.super.show();
	}
	
	

//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		InterfaceA.show();
//	}

}
