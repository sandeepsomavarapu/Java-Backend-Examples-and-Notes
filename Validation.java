import java.util.*;
import java.io.*;
class Validation
{
	public static void main(String args[]) throws IOException
	{
	Scanner  sc=new Scanner(System.in);	
	System.out.println("Enter your username :");
	String user=sc.next();
	System.out.println("Enter your password :");
	String pass=sc.next();
	FileReader fr=new FileReader("welcome.txt");
	BufferedReader br=new BufferedReader(fr);
				String user1=br.readLine();
				String pass1=br.readLine();
		if(user.equals(user1)&& pass.equals(pass1))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("please enter valid username and password");
		}
	
	
		
	}
}