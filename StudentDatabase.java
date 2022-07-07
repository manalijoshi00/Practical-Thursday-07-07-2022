import java.util.Scanner;
class StudentDatabase 
{
    public static void main(String[]args)  
    {
         
         String Name,Address;
         char Gender,YearofStudy,Scolar,TuitionGrant;
         String DegreePursued;
         Long PhoneNo,DateofBirth,Id,Height, Weight;
         double GPA;
         System.out.println(" STUDENT INFORMATION ");
         Scanner attributes = new Scanner(System.in);
         System.out.println("Please Enter Student Name :");
         Name = attributes.next();
         System.out.println("Enter the Student Address :");
         Address = attributes.next();
         System.out.println("Enter the Student ID :");
         Id = attributes.nextLong();
         System.out.println("Enter the Student Phone No :");
         PhoneNo = attributes.nextLong();
         System.out.println("Enter the Student Gender(M/F) :");
         Gender = attributes.next().charAt(0);
         System.out.println("Enter the Student Date of Birth :");
         DateofBirth = attributes.nextLong();
         System.out.println("Enter the Student Height :");
         Height = attributes.nextLong();
         System.out.println("Enter the Student Weight :");
         Weight = attributes.nextLong();
         System.out.println("Enter the Student Degree Pursued(B.Sc/B.A) :");
         DegreePursued = attributes.next();
         System.out.println("Enter the Student Year of Study :");
         YearofStudy = attributes.next().charAt(0);
         System.out.println("Enter the Student GPA :");
         GPA = attributes.nextDouble();
         System.out.println("Enter the Student with/without Tuition Grant(Y/N) :");
         TuitionGrant = attributes.next().charAt(0);
         System.out.println("Enter the Student is/is not Scolar(Y/N) :");
         Scolar = attributes.next().charAt(0);
         System.out.println("Name    : " + Name);
         System.out.println("Address : " + Address);
         System.out.println("ID No   : " + Id);
         System.out.println("Phone No : " + PhoneNo);
         System.out.println("Gender  : " + Gender);
         System.out.println("Date of Birth : " + DateofBirth);
         System.out.println("Height  : " + Height);
         System.out.println("Weight  : " + Weight);
         System.out.println("Degree Pursued : " + DegreePursued);
         System.out.println("Year of Study : " + YearofStudy);
         System.out.println("GPA : " + GPA);
         System.out.println("Tuition Grant : " + TuitionGrant);
         System.out.println("Scolar : " + Scolar);
    }
}