package com.forrest;

public class Git0804 {

	public static void main(String[] args) {
		
		String myName = "Nix";
		String myEmail = "mddasmarinas@gmail.com"; 
		String myAddress = "Caloocan,Philippines";
		int zipcode = 456;
		int  myNum = 0324;
		int age = 22;
		System.out.println(myName);
		System.out.println(myEmail);
		System.out.println(myAddress);
		System.out.println(zipcode);
		System.out.println(myNum);		
		System.out.println(age);	
		for(int i=0; i<5; i++) {
<<<<<<< HEAD
			
			System.out.println(i);
			System.out.println(i);
			System.out.println("BranchTwo");
=======
			System.out.println("Two");
>>>>>>> refs/heads/Two
			System.out.println("BranchThree");
			System.out.println("One");
		}
		System.out.print(1+1);
	}

}


