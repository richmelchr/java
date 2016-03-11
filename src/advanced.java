import java.lang.Number;
import java.math.BigDecimal;

public class Advanced {

    public int instanceVar;
    static boolean outsideBool;
    public static int outsideInt;

    public static void helperClass() {
        // convert data types
        int intValue = 156;
        double doubleValue = intValue + 2.12;

        Double Temp = doubleValue; //convert primitive data type to Object so a method can be used on it
        int intAgain = Temp.intValue(); //use ".intValue()" method on Object to convert
        System.out.println("int: " + (intAgain));

        String stringValue = Double.toString(intValue); //convert primitive data type to Object and use method
        System.out.println("String: " + stringValue);
    }

    public static void floatingPointError() {
        double value = 0.012;

        double pSum = value + value + value;
        System.out.println(pSum); //0.036000000000000004

        String strValue = Double.toString(value);
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue); // adds twice more
        System.out.println(bSum); //0.36
    }

    public static void convertDataType() {
        double intValue1 = 56.2;

        int intValue2 = (int) intValue1; //note: IntelliJ will suggest a fix if you goof this
        System.out.println(intValue2);
    }

    public static void objectStuff() {
        Advanced Demo = new Advanced();
        Demo.instanceVar = 3; //cannot set the global instanceVar to value without this

        String string1 = new String("hello");   //these two lines
        String string2 = "hello";               //are the same
    }

    public static void charToString() {
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s = new String(chars);
        System.out.println(s);
    }

    public static void forEach() {
        char[] chars = {'a', 'b', 'c'};

        for (char c: chars) {
            System.out.print(c + " ");
        }
    }

}




/*
public      = method is available to entire application
static      = this method can be called directly from the class definition rather
              than from an instance of the class
void        = does not return a value

sout        = intellij shortcut for System.out.println();
Ctrl + q    = class documentation

!static     = instance variable, not a member of the class itself.
              member of an instance of the class

String      = strings are Objects. They are instances of java.lang.String
              imported class

              they cannot be changed. the JRE makes it look like you can change
              a String but it's really just creating a new instance. This will
              cause massive memory problems if you are not careful.
*/


/*
--Java Essential Training-------------------------------

06. Working with Objects
    1 Working with object data types
    2 Using the String class
    3 Converting primitive values to strings
    4 Building a string from multiple values
    5 Comparing string values
    6 Formatting numeric values as strings
    7 Parsing string values
    8 Working with dates and times
    9 Challenge Creating a simple calculator application
    10 Solution Creating a simple calculator application
07. Exception Handling and Debugging
    1 Understanding syntax errors vs. runtime exceptions
    2 Debugging with IntelliJ IDEA
    3 Handling exceptions with trycatch
    4 Creating multiple catch blocks
    5 Throwing custom exceptions
08. Managing Program Flow
    1 Programming conditional logic
    2 Using the switch statement
    3 Creating looping code blocks
    4 Creating reusable code with methods
    5 Overloading methods with different signatures
    6 Passing arguments by reference or by value
    7 Challenge Creating a more complex calculator application
    8 Solution Creating a more complex calculator application
09. Using Data Collections
    1 Using simple arrays
    2 Using twodimensional arrays
    3 Managing resizable arrays with ArrayList
    4 Managing unordered data with HashMap
    5 Looping through collections with iterators and foreach
10. Creating Custom Classes
    1 Understanding encapsulation
    2 Creating and instantiating custom classes
    3 Creating nested and anonymous classes
    4 Visualizing class relationships
    5 Storing data in instance variables
    6 Declaring instance and static methods
    7 Using constructor methods
    8 Using static variables as constants
    9 Declaring and using enum types
11. Working with Inheritance
    1 Understanding inheritance and polymorphism
    2 Extending classes and overriding methods
    3 Creating and implementing interfaces
    4 Using abstract classes and methods
12. Using Common Java Libraries
    1 Managing files with the original File class
    2 Managing files with Java 7s new IO library
    3 Managing files with Apache Commons FileUtils
    4 Reading a text file over the Internet
13. Preparing a Java Application for Deployment
    1 Documenting code with Javadoc
    2 Packaging classes in JAR files
14. Conclusion
    1 Next steps


--Java Advanced Training--------------------------------
02 Java 7 New Features
    An overview of Java 7 new features
    Exploring the simplified use of generics
    Using underscores in numeric literals
    Using strings in switch statements
03 Using Advanced Class Structures
    Using static initializer
    Using instance field initializer
    Using member classes
    Using local inner classes
    Using anonymous inner classes
    Creating and using enumeration classes
04 Using the Reflection API
    Using the Class class
    Instantiating classes dynamically
    Navigating inheritance trees
05 More of the Collections Framework
    Managing orders sets with TreeSet
    Controlling list order with LinkedList
    Navigating inheritance trees
    Peeking and polling with queues
    hashset
06 Testing and Advanced Exception Handling
    Exploring test-driven development with the assert keyword
    Using the finally keyword
    Using try-with-resources in Java 7
    Defining and throwing a custom exception
07 Managing Files and Directories in Java 7
    Using the Path class
    Managing files and directories
    Reading and writing text files
    Walking the directory tree
    Finding files
    Watching a directory for file changes
08 Working with IO Streams
    Reading and writing byte streams one
    Reading and writing byte streams two
    Using buffered streams
    Scanning tokenized text
09 Working with Multi-threading
    Extending the Thread class
    Implementing the Runnable interface
    Interrupting a thread
    Synchronizing threads
10 Conclusion
    Where to go from here
*/