package tutorial1;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


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

public class Main {
  public static void main(String[] args) {

    Set<Integer> t = new HashSet<Integer>();
    // add things to a set
    t.add(5);
    t.add(7);
    t.add(5);
    t.add(9);
    t.add(-8);

    t.contains(5);

    System.out.println(t);

  }
}

