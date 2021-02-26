/*

The class keyword begins the class definition for a class named HelloWorld. Every Java application contains at least
one class definition (Further information about classes).

public: meaning that the method can be called from anywhere mean from outside the program as well. See
Visibility for more information on this.

static: meaning it exists and can be run by itself (at the class level without creating an object).

void: meaning it returns no value. Note: This is unlike C and C++ where a return code such as int is expected
(Java's way is System.exit()).

*/

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
    }
}

/*
In Java, System.out.println() is a statement which prints the argument passed to it. 
The println() method display results on the monitor. Usually, a method is invoked by objectname.methodname().

PrintStream obj.print("Hello");  

But you cannot create the object to PrintStream class directly as above.
So, Java provides an alternative way to create the object of PrintStream class that is System.out.

Where System is the class name, it is declared as final.
The out is an instance of the System class and is of type PrintStream. Its access specifiers are public and final. 
It is an instance of java.io.PrintStream. When we call the member, a PrintStream class object creates internally.

System.out.println()

It creates the PrintStream class object. This object, by default, represents the output device, i.e., the monitor.
*/
