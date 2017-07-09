import java.util.*;
import java.lang.*;
import java.io.*;
class guvi
{
 public static void main(String[ ] arg)
	{
	System.out.println("Enter a character : ");
	char ch = 'C';	 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is an Alphabet");
		else
		System.out.println("Entered character "+ch+" is not an Alphabet");		
	}
}