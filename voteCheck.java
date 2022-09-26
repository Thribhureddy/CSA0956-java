import java.io.*; 
import java.util.*; 
class voteCheck 
{ 
        public static void main(String args[]) 
        { 
             Scanner sc=new Scanner(System.in); 
             System.out.println("Enter the age:"); 
             int age=sc.nextInt(); 
             if(age>=18) 
                   System.out.println("You are eligible for voting"); 
             else  
                   System.out.println("You are not eligible for voting"); 
        } 
}