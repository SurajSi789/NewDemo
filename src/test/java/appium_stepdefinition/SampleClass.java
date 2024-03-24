package appium_stepdefinition;

public class SampleClass {

	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		
		String name = System.console().reader().toString();
		
		System.out.println("Hello " + name);
		
		}

}
