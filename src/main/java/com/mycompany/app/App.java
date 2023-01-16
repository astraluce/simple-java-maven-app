package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";
	// purposely inject different message
	//private static final String MESSAGE = "Hello World!Wrong";

    public App() {}

    public static void main(String[] args) {
        /*System.out.println(MESSAGE); */
		System.out.println("Changing message");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
