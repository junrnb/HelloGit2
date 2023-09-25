package helloGit2;

public class HelloGit2 {

	public static void main(String[] args) {

		String[] names = {"Coke", "Pepsi", "Sprite", "Cream Soda", "Dr Pepper"};
		
		//print greetings
		for (int i = 0; i <names.length; i++){
			System.out.format("Hello, %s!\n", names[i]);
		}

	}

}
