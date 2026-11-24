package OOPS;

public class Test {
              static int a ;    //static variable
              static String s;  //static variable
              public static void main(String[] args)
              {
            	  //Directly
            	  System.out.println(a);  //default value 0
            	  System.out.println(s);  //default value null
            	  //Using class name
            	  System.out.println(Test.a);
            	  System.out.println(Test.s);
              }
}
