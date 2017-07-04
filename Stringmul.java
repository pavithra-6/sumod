package sumave1;
import java.util.Scanner;
public class Stringmul {

	public static void main(String[] args) {
String p;
String q;
Scanner s=new Scanner(System.in);
p=s.next();
q=s.next();
int c=Integer.parseInt(p);	
int d=Integer.parseInt(q);	
int f=c*d;
String s1=String.valueOf(f);
System.out.println(s1);
	}

}
