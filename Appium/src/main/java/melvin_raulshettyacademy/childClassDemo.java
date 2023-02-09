package melvin_raulshettyacademy;

//Para heredar de una clase Padre, se utiliza la palabra
//Para utilizar una Interface se utiliza la palabra "implements"
public class childClassDemo extends parentClassdemo {
	
	public void engine() {
		System.out.println("new engine");
	}
	public void colour() {
		System.out.println(colour);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childClassDemo ccd = new childClassDemo();
		ccd.engine();
		ccd.colour();
	}

}
