//Different ways of pattern matching
import java.util.regex.*;
public class Ex2{
public static void main(String args[]){
//Pattern matching 1
Pattern p = Pattern.compile("https://.*");
Matcher m = p.matcher("https://learnit.itu.dk");
boolean b = m.matches();

//Pattern matching 2
boolean b2=Pattern.compile("https://.*").matcher("https://learnit.itu.dk").matches();

//Pattern matching 3
boolean b3 = Pattern.matches("https://.*", "https://learnit.itu.dk");

System.out.println(b+" "+b2+" "+b3);
}}
