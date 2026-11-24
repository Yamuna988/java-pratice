package corejava;

public class Caluculator {
        public static int add(int a,int b)
        {
        	return a+b;
        }
        public static int sub(int a,int b)
        {
        	return a-b;
        }
        public static int mul(int a,int b)
        {
        	return a*b;
        }
        public static int div(int a,int b)
        {
        		return a/b;
        }
        public static int mod(int a,int b)
        {
        	return a%b;
        }
        public static void main(String[] args)
        {
        	System.out.println(add(10,20));
        	System.out.println(sub(20,10));
        	System.out.println(mul(10,20));
        	System.out.println(div(20,10));
        	System.out.println(mod(20,10));
        	
        }
}
