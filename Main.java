package tutorial1;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;



//public class Main {
//	public static void main(string[] args) {


//		// TODO Auto-generated method stub 
//		int hello_world = 5; // _ is a space 
//		double num2 = 5.0;
//		boolean b = true;
//		char c = 't';
//		String str = 'tim';
//		
//		int tim = hello_world;
//		
//		System.out.println(hello_world);
//		
//	}
//}


//public class Main {
//	public static void main(String[] args) {


//		int x = 5;
//		int y = 7;
//		int z = 56;
//		int sum = x + y + z;
//		
//		System.out.println(sum);
//	}
//}



//public class Main {
//	public static void main(String[] args) {


//		int x = 5;
//		double y = 7;
//		int z = 57;
//		int u = x * z;
//		double d = Math.pow(x, y);
//		
//		System.out.println(d);
//	}
//}


// public class Main {
// 	public static void main(string[] args) {


// 		Scanner sc = new Scanner(System.in); // getting imput from user, get input, do something
// 		string scanned = sc.next();
// 		int x = Integer.parseInt(scanned);
		
// 		System.out.println();
// 	}
// }




// // IF ELSE/IF


// public class Main {
// 	public static void main(String[] args) {


// 		Scanner sc = new Scanner(System.in);
// 		String s = sc.nextLine();
		
// 		if(s.equals("tim")) {
// 			System.out.println("You typed tim");
			
// 		}
// 		else if (s.equals("hello")) {
// 			System.out.println("Hi!");
			
// 		} else if(s.equals("hello")) {
// 			System.out.println("hello!");
// 		}
// 	}
// }


// // Nested statements

// public class Main {
// 	public static void main(String[] args) {


// 		System.out.print("Input your age");
// 		Scanner sc = new Scanner(System.ln); // want to get users age
// 		String s = sc.nextLine();
// 		int age = Integer.parseInt(s);
		
// 		if (age >= 18) {
// 			System.out.println("You are an adult");
			
// 		}
// 		else of(age >= 13){
// 			System.out.println("You are a teenager");
// 		}
// 	}
// }



// public class Main {
// 	public static void main(String[] args) {


// 		System.out.print("Input your age");
// 		Scanner sc = new Scanner(System.in);
// 		String s = sc.nextLine();
// 		int age = Integer.parseInt(s);
		
// 		if (age >= 18) {
// 			System.out.print("Input your fav food: ");
// 			String food = sc.nextLine();
			
// 			if (food.equals("Pizza")) {
// 				System.out.println("Mine too");
				
// 			} else {
// 				System.out.println("Not mine");
				
// 			}
// 		} else if(age >= 13) {
// 			System.out.println("You are a teenager");
// 		} else {
// 			System.out.println("You are not a teenager or an adult");
// 		}
// 	}
// }


// // Arrays - collections of elements that are a set size 

// public class Main {
// 	public static void main(String[] args) {


// 		String[] newArr = new String[5];
// 		newArr[0] = "hello";
// 		newArr[1] = "hi";
// 		newArr[2] = "tim";
// 		newArr[3] = "bill";
// 		newArr[4] = "joe";
		
// 		int[] nums = {2,3,54,6,6};
		
// 		int x = nums[4];
// 		System.out.println(x);
		
// 	}
// }



// public class Main {
// 	public static void main(String[] args) {
		
		
// 		for (int i = 0; i <= 10; i++) {
// 			if (arr[i] == 5) {
// 				System.out.println("Found a 5! at index" + i); 
// 			}
			
// 			}
// 		}
		
// 	}



// // Loops

// public class Main {
// 	public static void main(String[] args) {


// 		int[] arr = {1,5,7,3,4,5};
// 		String[] names = new String[5];
		
		
// 		int count = 0;
// 		for (int element:arr) {
// 			System.out.println(element + "" + count);
// 			count++;
// 		}
// 	}
// }


// public class Main {
// 	public static void main(String[] args) {


// 		int[] arr = {1,5,7,3,4,5};
// 		String[] names = new String[5];
// 		Scanner sc = new Scanner(System.in);
		
		
// 		for(int i =0; i < names.length; i++) {
// 			System.out.print("Input: ");
// 			String input = sc.nextLine();
// 			name[i] = input; // whatever value of i is going to be equal to whatever typed in
// 		}
		
// 		for(String n:names) {
// 			System.out.println(n);
// 			if(n.equals("tim")) {
// 				break; // when name encountered, break out of loop
// 			}
			
// 		}
// 	}
// }

// // loop not yet met condition, want to break out of loop (media res)



// // while loop 
// public class Main {
// 	public static void main(String[] args) {


// 		Scanner sc = new Scanner(System.in);
// 		int x;

// 		do {
//         System.out.print("Type a number: ");
//         x = sc.nextInt();

//       }	while(x != 10); 

// 	}
// }


// Sets and Lists -- review data structures  
// Set cannot be created twice, just knows that it exists, can only be unique things



// Sets

// public class Main {
//   public static void main(String[] args) {

//     // Hashset 
//     Set<Integer> t = new HashSet<Integer>();
//     // add things to a set
//     t.add(5);
//     t.add(7);
//     t.add(5);
//     t.add(9);
//     t.add(-8);
//     t.remove(9); // remove something from set
//     t.clear(); // removes everything from set 
//     t.isEmpty(); // to see if a set is empty 
//     t.size(); // show size of a set 

//     int x = t.size();

//     System.out.println(t);

//   }
// }


// public class Main {
//   public static void main(String[] args) {

//     // TreeSet -- gives us an order in tree functionality 
//     Set<Integer> t = new TreeSet<Integer>();
//       t.add(5);
//       t.add(7);
//       t.add(5);
//       t.add(9);
//       t.add(-8);
//       t.remove(9);
//       t.size();

//       int x = t.size();


//       System.out.println(x);

//   }
// }

// HashSet, TreeSet, LinkedHashSet 
// LinkedHashSet -- similar to basic set, just faster speed/time complexity 




// Lists -- same as array but it is slower, but can change sizes 

// public class Main {
//   public static void main(String[] args) {
//     ArrayList<Integer> t = new ArrayList<Integer>(); // changing ArrayList to LinkedList will make it faster 
//     t.add(1);
//     t.add(2);
//     t.add(1);
//     t.add(2);
//     t.add(1);
//     t.add(2);
//     t.get(0);
//     t.set(1, 5); // change an already existing index
//     t.subList(1, 3); // get from certain indexes, within certain range 
//     System.out.println(t.subList(1, 4));
//   }
// }

// if you don't know how long you want something to be you should use ArrayList, can change easily 
// Use set -- you don't care where or how many times it exists you just care that it exists -- simpler and a lot fast to do operations on 


// JavaMaps / HashMaps / LinkedHashMap (speed)
// Known as a key-value pair, also known as dictionary 


// public class Main {
//   public static void main(String[] args) {
//     Map m = new HashMap(); // does not keep in sorted order 
//     m.put("tim", 5);
//     m.put("joe", "x");
//     m.put(11, 999);
//     m.put(11, 998);
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     Map m = new TreeMap(); // keeps in sorted order 
//     m.put("tim", 5);
//     m.put("joe", "x"); // joe will show before tim
//     m.put("a", "b");

//     m.containsValue("b");
//     m.containsKey(5);
//     // m.clear(); // removes everything from map 
//     // m.isEmpty(); // tells if map is empty 

//     System.out.println(m.get(5));
//     // System.out.println(m.values()); // gives x, b, 5
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     int[] x = {-99, 5, 6, 3, 2, 1, 7, 8, 0};

//     Arrays.sort(x, 1, 7);

//     for(int i:x) 
//     {
//       System.out.println(i + ",");
//     }
//   }
// }

// sorts existing arrays, rather than making a new array 



// Objects - you have a variable and making it equal to something, making it an object 

// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     sc.next();
//     int x = 5;
    
//   }
// }

// method - anything you call on an object, or instance of an object 


// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     // sc.next();
//     String h = "hello";
//     h.length();

//     time();

//   }

//   public static void tim() {
//     System.out.println("Tim!");

//   }
// }



// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String h = "hello";
//     h.length();

//     System.out.println(str("Hii"));

//   }

//   public static void tim(String str, int x) {
//     for(int i = 0; i < x; i++) {
//       System.out.println(str);
//     }
//   }

//   public static int add2(int x) {
//     return x + 2;
//   }

//   public static String str(String x) {
//     return x + "!";
//   }
// }



// Classes 


public class Dog {
  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void speak() {
    System.out.println("I am" + this.name + "and I am" + this.age + "years old");
  }

      public int getAge() {
        return this.age;
      }

      public void setAge(int age) {
        this.age = age;
      }
}

