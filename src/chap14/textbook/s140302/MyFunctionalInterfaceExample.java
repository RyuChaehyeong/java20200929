package chap14.textbook.s140302;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyfunctionalInterface fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
	}
}
