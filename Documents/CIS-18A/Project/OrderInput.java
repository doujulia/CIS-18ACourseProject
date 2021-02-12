class OrderInput {
public static void main(String args[])
throws java.io.IOException {
	String order;
	System.out.print("Press any key followed by ENTER: ");
	order = (String) System.in.read();	// read character from keyboard
	System.out.println("Your key is: " + order);
	}
}