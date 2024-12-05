import java.util.Scanner;



// class HelloWorld {
//   // int age = 27; // if do this the variable will be available within entire class
//   public static void main(String[] args) {
//     // static method will only work with static variables
//     int age = 27;

//     System.out.println("I am " + age + " years old.");
//   }
  
// }


// class HelloWorld {
//   public static void main(String[] args) {
//     double number1 = 5.8;
//     // int number2 = (int)number1; // use int if dont mind losing fractional part
//     double number2 = number1; // will preserve the fractional

//     System.out.println(number2);
//   }

// }


// class HelloWorld {
//   public static void main(String[] args) {
//     int number1 = 12;
//     int number2 = 15;
//     // number = number + 5;

//     // System.out.println(number);
//     System.out.println(number1 == number2);
//   }
  
// }


// class HelloWorld {
//   public static void main(String[] args) {
//     boolean isStudent = false;
//     boolean isLibraryMember = false;

//     System.out.println(!isStudent);
//   }
// }





// class HelloWorld {
//   public static void main(String[] args) {
//     int score = 0;
//     int turns = 10;

//     score ++;
//     turns --; // subtracts by 1

//     System.out.println(turns);
//   }
// }



// class HelloWorld {
//   public static void main(String[] args) {
//     String literalString1 = "abc";
//     String literalString2 = "abc";


//     String objectString1 = new String("xyz");
//     String objectString2 = new String("xyz");


//     System.out.println(literalString1 == literalString2);
//     // System.out.println(objectString1 == objectString2);
//   }
// }


// class HelloWorld {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     System.out.print("Hello, what is your name?");
//     String name = scanner.nextLine();

//     System.out.println(name);

//     scanner.close(); // scans up until this line

//   }
// }


// user inputs & responses 

// class HelloWorld {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     System.out.print("What is your name?");
//     String name = scanner.nextLine();

//     System.out.printf("Hello %s. How old are you? ", name);
//     int age = Integer.parseInt(scanner.nextLine());

//     System.out.printf("%d is an excellent age to start programming.%n", age);
//     String language = scanner.nextLine();

//     System.out.printf("%s is a very popular programming language.", language);
    
//     scanner.close();
//   }
// }