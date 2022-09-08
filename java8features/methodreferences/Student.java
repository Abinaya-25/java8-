package bct.java8features.methodreferences;

import java.util.function.BiFunction;

interface MyInterface{
	//a method--abstract method
	public void display();
}

/*
 * method references is the short hand notation of Lambda expression to call a method.
 * str->System.out.println(str);
 * System.out::println 
 */
//Method references to an instance method of an object-object::instanceMethod
class Addition{
	static int add(int numberone,int numbertwo) {
		return numberone+numbertwo;
		
	}
}


public class Student {
	public void myMethod() {
		System.out.println("Instance Method");
		System.out.println("----------I have been referenced by the abstract---------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student object=new Student();
		
		//method reference using the object of the class
		MyInterface ref=object::myMethod;
		//calling the method of functional Interface
		ref.display();
		//create an object to the class Addition
		BiFunction<Integer,Integer,Integer> addition=Addition::add;
		int sum=addition.apply(11, 5);
		System.out.println("Addition of two numbers:"+sum);
		

	}

}
