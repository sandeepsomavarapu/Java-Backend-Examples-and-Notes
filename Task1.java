import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task1 
{
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your username :");
	String user=sc.next();
	System.out.println("Enter Your password :");
	String pass=sc.next();
	FileReader fr=new FileReader("fiserv.txt");
	BufferedReader br=new BufferedReader(fr);
 if (user.equals(br.readLine())&& pass.equals(br.readLine()))
	{
		System.out.println("Login Success !");
		System.out.println("Welcome ");
	}	
	else {
		System.out.println("Login Failed !");
		System.out.println("please enter valid username and password");
	}
}}
	