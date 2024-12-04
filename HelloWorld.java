

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



class HelloWorld {
  public static void main(String[] args) {
    String literalString1 = "abc";
    String literalString2 = "abc";


    String objectString1 = new String("xyz");
    String objectString2 = new String("xyz");


    System.out.println(literalString1 == literalString2);
    // System.out.println(objectString1 == objectString2);
  }
}