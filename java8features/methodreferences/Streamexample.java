package bct.java8features.methodreferences;

import java.util.ArrayList;
import java.util.List;

public class Streamexample {

	public static void main(String[] args) {
		// create a collection
		List<String> names=new ArrayList<String>();
		
		//add the elements to the list
		names.add("sachin");//0
		names.add("abi");//1
		names.add("ahi");//2
		names.add("sarah");//3
		names.add("sangee");//4
		
		int count=0;
		for(String ele:names) {
			if(ele.length()<6)
				count++;
			}
		System.out.println("there are:"+count+"strings with length less than 6");
		System.out.println("--------------------------------------------------");
		int number=(int)names.stream().filter(ele->ele.length()<6).count();		
		System.out.println("there are:"+number+"strings with length less than 6");
				}

}
