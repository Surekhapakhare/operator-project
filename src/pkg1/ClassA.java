package pkg1;

public class ClassA {

	public static void main(String[] args) {
		//Operators
		
		//Arithmatic operators
		int a = 10;
		int b = 20;
		//1)addition
		int c = a + b;
		System.out.println("Addition is" + c);
		
		//2)subtraction
		c = a - b;
		System.out.println("Subtraction is" + c);
		
		//3)multiplication
		c = a*b;
		System.out.println("Multiplication is" + c);
		
		//4)division
		c = a/b;
		System.out.println("Division is" + c);
		
		//5)Mod%
		c = a%b;
		System.out.println("reminder" + c);   //0.5
		
		//6)Increment (++)
		a++;     //a = a + 1;
		System.out.println(a);  //11
        ++a;   //a = a + 1;
        System.out.println(a);   //12
        
        int k = a++;         //a = a+1; 13; k=12;  pre-increment assignment
        System.out.println(a);
        System.out.println(k);
        
        k = ++a;                     // a =a -1; 11; k=14;  post-increment assignmemt
        System.out.println(a);
        System.out.println(k);
        
        //7)Decrement
        a--;     //a = a -1;
        System.out.println(a);   //13
        
        --a;   //a = a-1;
        System.out.println(a);   //12
        
        k=a--;                 //a = a-1; 11; k=12;  pre-increment assignment
        System.out.println(a);
        System.out.println(k);
        
        k=--a;               //post-increment assignment
        System.out.println(a);
        System.out.println(k);
        
        
        
		
		
	}

}
