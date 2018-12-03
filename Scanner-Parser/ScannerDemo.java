public class ScannerDemo {

	private static String file1 = "C:\\\\Users\\\\Krutika Wadhwa\\\\Desktop\\\\ParserScannerTests(1) (1)\\\\ParserScannerTests\\\\SCANNER\\\\prog1.jay";
    //need to change the filepath
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			// TO BE COMPLETEDs
            // How to get token here?
            System.out.println("Token " + counter + ":" + ts.nextToken().toString()+"\n");
            
            // how to write token1 token2 token3?
            counter = counter + 1;
            
		}
	}
}
