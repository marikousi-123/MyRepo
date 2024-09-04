package mari;

import java.io.*;

public class input {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b= new BufferedReader(a);
System.out.println("Enter your Name : ");
String Name=b.readLine();
System.out.println("Enter your class : ");
String clas=b.readLine();
System.out.println("Welcome " + Name);
}

}
