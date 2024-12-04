

// can have one top level public class -- needs to match the java file
// if you have multiple classes, java has individual bytecodes for each class 
// top-level class (same name) as the entry point 




// class Main {
//   // entry point
//   public static void main(String[] args) {
//     System.out.println("Hello, World!");
//     // prints string, semicolon mandatory 

//   }
// }


class HelloWorld {
  public static void main(String[] args) {
    int age = 27;

    age = 28;

    System.out.println("I am" + age + "years old.");
  }
  
}


