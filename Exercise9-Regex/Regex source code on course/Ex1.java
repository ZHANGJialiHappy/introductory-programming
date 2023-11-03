import java.util.regex.*;
public class Ex1{
public static void main(String args[]){

Pattern pattern = Pattern.compile("https://.*");

Matcher matcher = pattern.matcher("https://learnit.itu.dk");
boolean result1 = matcher.matches();
System.out.println("result1: "+result1);


Matcher matcher2=pattern.matcher("http://regexnew.com");
boolean result2 = matcher2.matches();
System.out.println("result1: "+result2);






Pattern pattern2 = Pattern.compile("(\\d\\d\\.0[1-6]\\.(\\d\\d){1,2})*");

Matcher matcher3 = pattern2.matcher("12.01.2020");
boolean result3 = matcher3.matches();
System.out.println("result3: "+result3);



Matcher matcher4 = pattern2.matcher("09.07.1612");
boolean result4 = matcher4.matches();
System.out.println("result4: "+result4);


Pattern pattern3 = Pattern.compile("a*b");

Matcher matcher5 = pattern3.matcher("aaaab");
boolean result5 = matcher5.matches();
System.out.println("result5: "+result5);


   }

}
















