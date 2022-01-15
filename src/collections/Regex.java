package collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
	
	public static void main(String args[]) 
    { 
		System.out.println("9876543210 : " + Pattern.matches("\\d{10}", "9876543210"));
		System.out.println("Girija0428 : " + Pattern.matches("[A-Z][a-z]+\\d{3}+[a-z0-9]+", "Girija0428"));
		System.out.println("girijareddy7@gmail.com : " + Pattern.matches( "[a-z]+[@][a-z]+.com", "girijareddy7@gmail.com"));
		System.out.println( "virendra@gmail.com : " +Pattern.matches("[a-z]+[@][a-z]+.com", "virendra@gmail.com"));
		System.out.println("test123prepare.edu.com :" +Pattern.matches("[a-z]+\\d{3}+[a-z]+.[a-z]+.com", "test123prepare.edu.com"));
	
}
}