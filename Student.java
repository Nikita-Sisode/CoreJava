/*Build a class Student which contains details about the Student and compile and run its 
instance. */
 
class Student{  
  
    String name;  
    int age;
    long mobileNo;
    int RollNo;
    
    public Student()  //constructor of student class
    {  
      
    }
    
    public Student(String name, int age, long mobileNo, int RollNo){   //Parameter constructor
    
      this.name = name;      //use this variable for properties of class
      this.age = age;
      this.mobileNo = mobileNo;
      this.RollNo = RollNo;
    }
    
    
    void displayStudent(){        //method to Display the details of student
      System.out.println("Name: "+this.name);      //print students details
      System.out.println("Age: "+this.age);
      System.out.println("Mobile No: "+this.mobileNo);
      System.out.println("RollNo: "+this.RollNo);
    }
    

    public static void main(String args[]){   //main method inside the Student class
      
     
     Student s1=new Student("Nikita",26,1234567891,10);  //object or instance  of students
     Student s2=new Student("Snehal",26,1987654321,11);
     Student s3=new Student("Mrudula",25,1986657321,12);
     Student s4=new Student("Nikhil",25,1987859321,13);
     Student s5=new Student("Mitesh",27,1985658321,14);
     
     
     
     s1.displayStudent();  //Call displayStudent() method
     s2.displayStudent();
     s3.displayStudent();
     s4.displayStudent();
     s5.displayStudent();
    }  
   }  