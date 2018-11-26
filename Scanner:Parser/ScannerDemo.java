/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "C:\\Users\\cscharff\\Desktop\\TESTSCANNERPARSER2010\\GIVEN\\PARSER\\prog2.jay";
    //need to change the filepath
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			// TO BE COMPLETEDs
            // How to get token here?
            System.out.println("Token " + counter + ":" + ts.nextToken().toString());
            // how to write token1 token2 token3?
            counter = counter + 1;
            
		}
	}
}
