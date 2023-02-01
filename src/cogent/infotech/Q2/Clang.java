package cogent.infotech.Q2;

public class Clang extends Thread implements Language{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		for(int i = 0; i<=100;i++) {
			System.out.println("This is the C programming Language! ");
		}
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		showMessage();
	}
}
