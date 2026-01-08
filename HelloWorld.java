/***Notes: 
 
 1.Class Definition - every Java progran  must have atleast one class defined.
 2.If the class is public, the filename must match the class name HelloWorld.java
 3.Every application should have a main method and it is the entry point of the application.
 4. public(allow JVM to access this method from anywhere) static ( this method can run without creating a object) void ( no return type ) main( entry point) ( String[] args) ( accepts command line arguments as array of strings)
 5. System ( built in class ).out (static member of System class).println( a method that prints to console and moves to next line )()
 
***/

public class HelloWorld {
     public static void main(String[] args){
        System.out.println("Hello, World!");
     }
}


/*
 1. Java is a platform independent language.
 2. Compilation - source code(.java)  ---> bytecode(.class). javac HelloWorld.java
    Execution - bytecode(.class)  ---> machine code ( by JVM ) java HelloWorld
 3. Execution -> Class Loader ( loads main class and other dependencies in memory )  ---> Bytecode Verifier ( checks if bytecode is safe to execute ) ---> Interpreter/JIT Compiler ( Just in time - Converts to machine code ) ---> Runtime Environment
 */
