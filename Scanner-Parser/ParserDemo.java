public class ParserDemo {

	public static void main(String[] args) {
		TokenStream tStream = new TokenStream(args[0]);
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}
