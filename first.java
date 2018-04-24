package pksoft;
import java.util.*;
public class first  { 
public static void main(String[] args) { 
	
	String list1[] = {"Hello", " Image", " ArrayList"};
	String list2[] = {" Hello2 ","Image2 ","ArrayList2"};
	ArrayList<String> x = new ArrayList<String>(); // making arrayList as x();
	ArrayList<String> x2 = new ArrayList<String>(); // making arrayList as x2();
	for(String z: list1) { // This type is called inhanced for loop.
		x.add(z);// adding z into x;
	}
	for(String str: list2) {
		x2.add(str);
	}
	for(int c =0; c<x.size(); c++) {// this is important to get all list1[] array
		System.out.printf("%s", x.get(c)); // to get print in format = printf
	}
	for(int c2 =0; c2<x2.size(); c2++) {
		System.out.printf("%s", x2.get(c2));
	}
}
 
}
