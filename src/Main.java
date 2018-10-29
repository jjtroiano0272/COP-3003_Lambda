public class Main {
	
	public static void main(String[] args) {
		//
		MyInterfaceImplementation obj1 = new MyInterfaceImplementation();
		obj1.printIt("Hello, jah punks.");
		
		// X. EXAMPLE OF ANONYMOUS INTEFACE.
		// This is allowing us to define printIt right HERE.
		// It's anonymous because we haven't created a concrete class interface.
		// Because the interface only had one method, we can use anon interface here.
		MyInterface obj2 = new MyInterface() {
			@Override
			public void printIt(String text) {
				System.out.println(text);
			}
		}
		
		// X. Here's how you do it the anonymous style.
		obj2.printIt("This is the anonymous güey.");
		
		// X. When there's an anon interface imple, it's a siogn that you can instead use  LAMBDA EXPRESSION
		// This TYPE of lambda expression is called a 'statement lambda'.
		MyInterface obj3 = (String text) ->
				System.out.println("And this is the ______ lambda güey."); // statement or expression λ
		
		//	X. EXPRESSION LAMBDA
		MyInterface obj4 = (String text) ->
				System.out
						.println("And again, thiis the STATEMENT LAMBDA way...it gets rid of the braces.");
		
		//	X.
	}
}
