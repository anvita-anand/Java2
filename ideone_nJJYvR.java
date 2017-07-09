import java.util.*;
import java.lang.*;
import java.io.*;
class guvi
{
 public static void main(String[ ] arg)
	{
	int i=0;
	System.out.println("Enter a character : ");
	char ch = 'p';	 
	//char ch=sc.nextChar();
	switch(ch)
	{
	 case  'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :i++;
	}
	if(i==1)
	System.out.println("Entered character "+ch+" is  Vowel");
	else 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Entered character "+ch+" is Consonant");
		else
		System.out.println("Not an alphabet");		
	}
}