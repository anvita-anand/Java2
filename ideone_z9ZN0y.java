import java.util.*;
import java.lang.*;
import java.io.*;
class guvi
{
 public static void main(String[ ] arg)
	{
	System.out.println("Enter Number1: ");
	System.out.println("Enter Number2: ");
	System.out.println("Enter Number3: ");
    int Number1=7;
    int Number2=8;
    int Number3=9;
    int large;
    large=Number1;
    if (Number2>large)
    large=Number2;
    if (Number3>large)
    large=Number3;
    System.out.println("\n\n Largest Number= " +large);
	}
}
