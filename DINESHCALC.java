package calculator;

import java.util.Scanner;
public class DINESHCALC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        double n1,n2,choice;
		        double cal;
		        char ch;
		        choice =1;
		        
		        while(choice==1) {
		        	System.out.println("Enter two numbers:-");
			        Scanner r= new Scanner(System.in);
			         n1=r.nextInt();
			         n2=r.nextInt();
			         System.out.println("Enter an operator +,-,/,*");
			         ch=r.next().charAt(0);
			         
			         if(ch=='+')
			         {
			             cal=n1+n2;
			             System.out.println("Your answer is "+cal);
			         }
			         else if (ch=='-')
			         {
			             cal=n1-n2;
			             System.out.println("Your answer is "+cal);
			         }
			         else if(ch=='/')
			         {
			              cal=(double)(n1/n2);
			             System.out.println("Your answer is "+cal);
			         }
			         else if(ch=='*')
			         {
			            cal=n1*n2;
			            System.out.println("Your answer is "+cal);
			         }
			         else
			         {
			             cal=n1%n2;
			             System.out.println("Your answer is "+cal);
			         }

		        	
		        	
		        	
		        	
		        	
		        }
		        
		        		         
		    }   
		
	

}