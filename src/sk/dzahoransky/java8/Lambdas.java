package sk.dzahoransky.java8;

public class Lambdas {
	
	@FunctionalInterface
	interface Function<F, T> {
	    T calculate(F from);
	}

	public static void main(String[] args) {
		final int one = 1;
		Function<Integer, String> f =
		        (num) -> "result = " + String.valueOf(one + num);
		
		String res = f.calculate(2);
		System.out.println(res);
	}
}
