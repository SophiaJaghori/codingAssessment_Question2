package cogent.infotech.Q2;

public class JavaLang extends Thread implements Language {

	@Override
	public void showMessage() {
		for(int i = 0; i<100; i++) {
			System.out.println("this is java language ");
		}
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		showMessage();
	}

}
