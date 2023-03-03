package assignment.calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator
{
    private Calculator()
    {
        
    }
    public static void calculator()
    {
    double num1;
    double num2;
    double result;
    char option;

    String s="Enter Number:";
    Scanner scan;
    scan=new Scanner(System.in);
    
    Logger l=Logger.getLogger("hi");
    
    l.info("Enter The First Element:");
    num1=scan.nextDouble();
    result=num1;
    boolean ans=true;
    while(ans){
    l.info("Choose the operation (+)   (-)   (*)    (/)  e.exit");
    option=scan.next().charAt(0);
    
    switch(option) 
    {
    case '+':
    	l.info(s);
        num2=scan.nextDouble();
    	Addition obj=new Addition(result,num2);//creating object and call the constructor,passing the values...
    	obj.perform();
    	result=obj.result;

    	break;
    	
    case '-':
    	l.info(s);
        num2=scan.nextDouble();
    	Substraction sub=new Substraction(result,num2);
    	sub.perform();
    	result=sub.result;
    	break;
    	
    case '*':
    	l.info(s);
        num2=scan.nextDouble();
    	Multiplication mul=new Multiplication(result,num2);
    	mul.perform();
    	result=mul.result;
    	break;
    
    case '/':
    	l.info(s);
        num2=scan.nextDouble();
    	Divison div=new Divison(result,num2);
    	div.perform();
    	result=div.result;
    	break;
    case 'e':
    	ans=false;
    	break;
    
    default:
    	l.info("Invalid option:");
    	break;
    }
    
    String results=String.valueOf(result);
    l.info(results);
    }
    }
  
}

