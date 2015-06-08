package sk.dzahoransky.java8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

public class Annotations {

	@Target(value=ElementType.METHOD)
	@interface UsellesCodeWhichCouldHaveBeenOmitted{
		RepeatableAnnotation[] value();
	}
	
	@Repeatable(UsellesCodeWhichCouldHaveBeenOmitted.class)
//	@Target(value=ElementType.TYPE)
	@interface RepeatableAnnotation{
		String value();
	}
	
	@RepeatableAnnotation("foo")
	@RepeatableAnnotation("bar")
	void test(){}
	
}
