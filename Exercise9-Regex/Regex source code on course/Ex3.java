//We check the functionality of split method
import java.util.regex.*;
public class Ex3{
public static void main(String args[]){
     Pattern pattern1 = Pattern.compile(":");
     String[] result1 = pattern1.split("testing:pattern:split");


     System.out.println("--------------\n"+"pattern 1\n"+"--------------");
     for(String data:result1){
        System.out.println(data);}
    // System.out.println("--------------\n");



    Pattern pattern2 = Pattern.compile("\\s");
    String[] result2 = pattern2.split("We want the tokens in this sentence");

    System.out.println("--------------\n"+"pattern 2\n"+"--------------");
    for(String data:result2){
        System.out.println(data);}
    //System.out.println("--------------\n");



    Pattern pattern3 = Pattern.compile("\\.");
    String[] result3 = pattern3.split("Java.util.regex");


    System.out.println("--------------\n"+"pattern 3\n"+"--------------");
    for(String data:result3){
        System.out.println(data);}
    //System.out.println("--------------\n");



    Pattern pattern4 = Pattern.compile("o");
    String[] result4 = pattern4.split("boo:and:foo");


    System.out.println("--------------\n"+"pattern 4\n"+"--------------");
    for(String data:result4){
        System.out.println("substring:"+data);}
    //System.out.println("--------------\n");




    Pattern pattern5 = Pattern.compile("o");
    String[] result5 = pattern5.split("boo:and:foo",3);




    System.out.println("--------------\n"+"pattern 5\n"+"--------------");
    for(String data:result5){
        System.out.println("substring:"+data);}
    //System.out.println("--------------\n");


    Pattern pattern6 = Pattern.compile("\\.");
    String[] result6 = pattern6.split("testing.pattern.split");


    System.out.println("--------------\n"+"pattern 6\n"+"--------------");
    for(String data:result6){
       System.out.println(data);}
    //System.out.println("--------------\n");

  }
}
