package corejava;

public class Alphabet {
    public static void main(String[] args)
    {
    	char c ='Y';
    	String result = (c >= 'a' && c <='z' || c >= 'A' && c <='Z' ? c + " is a Alphabet" : c + " is not a alphabet");
    	System.out.println(result);
    			
    }
}
