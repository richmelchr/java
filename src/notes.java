import java.util.Date; //used by: printDate()
import java.util.Scanner; //used by: doSomeMath()

import java.util.*; //unused
import java.io.BufferedReader; //used by: getInput()
import java.io.*; //used by: getInput()
import java.util.ArrayList; //used by arrayList()
import java.util.HashMap; //used by hashMap()
import java.util.Set; //used by hashIterator()

public class Notes {
	Scanner scan = new Scanner(System.in);

	enum Season {winter, spring, summer, fall}

	private String welcome = "hello";
	String outSideVar = new String("this type of var is called a field");
	String string1 = "hello";
	String string2 = "hello";
	double doubleValue = 3.99d;
	double beforeConvert = 100d; //best practive to add d for double after primative var's (double, long, float)
	int intValue = 120;
	boolean isTrue = true;
	boolean isFalse = false;
	char singleCharOnly = 'k'; //literal char value uses single quotes, never double.
	char dollarSign = '\u0024'; //escape sequence
	Date myDate = new Date();
	int[] intArray = {1,2,3}; //used by printArray()
	int intArray2[] = {3,2,1}; //also valid array, does same exact thing



	public static void cleanScanner() { //the most simple scanner for integers
		Scanner scan = new Scanner(System.in);//must be inside a static context to be refrenced by a static contex

		int input = scan.nextInt();

		System.out.println(input);
	}
	public static void hashIterator() {
		HashMap<String, String> thisMap = new HashMap<String, String>(); //<key, Value>

		thisMap.put("Arizona", "Phoenix");
		thisMap.put("Oregon", "Salem");
		thisMap.put("Washington", "Olympia");

		Set<String> keys = thisMap.keySet();
		for (String value : keys) {
			System.out.println(value + " : " + thisMap.get(value));
		}
	}
	public static void ArrayIterator() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("California");
		list.add("Oregon");
		list.add("Arizona");
		System.out.println(list);

		for (String value : list) {
			System.out.println(value);
		}
	}
	public static void hashMap() {
		HashMap<String, String> thisMap = new HashMap<String, String>(); //<key, Value>

		thisMap.put("Arizona", "Phoenix");
		thisMap.put("Oregon", "Salem");
		thisMap.put("Washington", "Olympia");

		System.out.println(thisMap);

		thisMap.put("Alaska", "Juneau"); //can take input at runtime
		System.out.println(thisMap);

		String capitol = thisMap.get("Oregon");
		System.out.println("The capitol of Oregon is: " + capitol);

		thisMap.remove("California");
		System.out.println(thisMap);
	}
	public static void arrayList() {
		ArrayList<String> list = new ArrayList<String>(); //ArrayList of strings

		list.add("California");
		list.add("Oregon");
		list.add("Arizona");

		System.out.println(list);

		list.add("Alaska");
		System.out.println(list);

		list.remove(0);
		System.out.println(list);

		String state = list.get(1);
		System.out.println(state);

		int pos = list.indexOf("Alaska");
		System.out.println("Alaska is at position: " + pos);
	}
	public static void playArray() {
		String[][] states = new String[3][2];

		states[0][0] = "Arizona";
		states[0][1] = "Phoenix";
		states[1][0] = "Oregon";
		states[1][1] = "Salem";
		states[2][0] = "Washington";
		states[2][1] = "Olympia";

		for (String[] state : states) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < state.length; j++) {
				if (j == 0) {
					sb.append("the capitol of ");
				} else {
					sb.append(" is ");
				}
				sb.append(state[j]);
			}
			System.out.println(sb);
		}
	}
	public void exceptions() { //line em up like a rock filter, (most specific smallest filters first)
		String[] strings = {"first"};
		try {
			System.out.println(strings[1]); //calling an array position that does not exist
		} catch ( StringIndexOutOfBoundsException e ) { //specific exceptions like this come first.
		  	System.out.println("String index error!");
		  	e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) { //this is the exception that will catch
			System.out.println("Attempted to call array that doesn't exist");
			e.printStackTrace();
		} catch ( RuntimeException e ) { //least specific exceptions always come last, like a rock filter. this is the most general exception
		  	System.out.println("runtime exception!");
		  	e.printStackTrace();
		}
	}
	private static double addValues(double d1, double d2) throws NumberFormatException { //used by //newCalc()
		return d1 + d2;
	}
	public void stringMethods() {
		System.out.println("length of string: " + outSideVar.length());

		int position = outSideVar.indexOf(" is "); //take note of spaces
		System.out.println("position of \"is\": " + position);

		String sub = outSideVar.substring(position + 1, position + 3);
		System.out.println(sub);
	}
	public static void stringBuilder() {
		String newString = "some strings";
		StringBuilder sb = new StringBuilder(newString); //create fewer objects, conserve memory.

		sb.append(", some more strings");
		System.out.println(sb);
	}
	public static void newCalc() {
		String s1 = getInput("enter num1: ");
		String s2 = getInput("enter num2: ");
		String operation = getInput("enter 1=add, 2=sub: ");

		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		int operatingInt = Integer.parseInt(operation);

		double result = 0d; //declared for use inside switch

		switch (operatingInt) {
			case 1:
				result = addValues(d1, d2);
				break;
			case 2:
				result = d1 - d2;
				break;
			default:
				System.out.println("input not defined");
				break;
		}
		System.out.println("num1 + num2 = " + result);
	}
	void printArray() { //bear minimum
		for (int anIntArray : intArray) {
			System.out.print(anIntArray + " ");
		}
	}
	public static double manyValues(double ... values) { //used by callManyValues() | pass in much as you want of type double
		double result = 0d; //0 of type double
		for (double d : values) {
			result += d;
		}
		return result;
	}
	public static void callManyValues() { //calling manyValues()
		double fin = manyValues(1,2,3);
		System.out.println(fin);
	}
	public static void doSomeThing() {
		System.out.println("this method has been called");
	}
	public void loops() { //all posible loops through arrays. only preference
		for (String loopMonth : loopMonths) {
			System.out.print(loopMonth + " ");
		}
		//---------------------------------------------
		for (String month : loopMonths) { //for each month in the loopMonths array
			System.out.print(month + " ");
		}
		//--------------------------------------------
		int counter = 0;
		while (counter < loopMonths.length) {
			System.out.print(loopMonths[counter] + " ");
			counter++;
		}
		//----------------------------------------------
		int counter2 = 0;
		do {
			System.out.print(loopMonths[counter2] + " ");
			counter2++;
		} while (counter2 < loopMonths.length);
	}
	static private String[] loopMonths = {"jan", "feb", "mar"}; //used by loops()

	public enum month { //being used by: moreEnumStuff()
		jan, feb, march; //note, these are not Strings
	}
	public void moreEnumStuff() {
		month monthSelect2 = month.feb; //call from another file
		month monthSelect = Notes.month.feb; //call from same file

		switch(monthSelect2) {
			case jan:
				System.out.println("month is jan");
				break;
			case feb:
				System.out.println("month is feb");
				break;
			default:
				System.out.println("month is not");
				break;
		}
	}
	public void switchPractice() {
		String input = getInput("enter a num 1 to 12: ");
        int month = Integer.parseInt(input);
		switch(month) {
			case 1: //could be String
				System.out.println("month is Jan");
				break; //break out of code block. without break, all lines after true case statement will execute as true.
			case 2:
				System.out.println("month is Feb");
				break;
			default:
				System.out.println("no case for num");
				break;
		}
	}
	private static String getInput(String prompt) {//used by: switchPractce(), newCalc()
        BufferedReader stdin = new BufferedReader(
            new InputStreamReader(System.in));//black box for now 04_09

        System.out.print(prompt);
        System.out.flush();

        try {
            return stdin.readLine();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
	public void doSomeMath() {
		System.out.print("enter a num: ");
        String num0 = scan.nextLine();
		double num1 = Double.parseDouble(num0);
		double output = num1 + 6;
		System.out.println(output);
	}
	public void printDate() {
		System.out.println("the date: " + myDate);
	}
	public void outSideVar() {
        System.out.println(outSideVar);
    }
    public void convert() {
    	Double converted = beforeConvert;
    	System.out.println(converted);
    }
    public void anotherConvert() {
    	double newDoubleValue = intValue; //implicit conversion
    	int newIntValue = (int)doubleValue; //downward conversion, added code tells compiler: "trust me, i know what im doing"
    	System.out.println(newDoubleValue);
    	System.out.println(newIntValue);
    }
    public void incrementing() {
    	System.out.println(intValue ++); //print then increment
    	System.out.println(++ intValue); //increment then print
    }
    public void compareStrings() {
    	if (string1.equals(string2)) {
    		System.out.println("they match");
    	}
    }
    public void reverseLogic() {
    	if (!isFalse) { //normal checks if True, adding "!" reverses the value
    		System.out.println(isFalse);
    		boolean reverseIsTrue = !isTrue;
    		System.out.println(reverseIsTrue);
    	}
    }
    public void moreLogic() {
    	int x = 1;
    	boolean trueThat = (x != 0); //value of trueThat is now "true"

    	String balls = "true"; //caps irrelevant, anything but true will cause .parseBoolean to evaluate false
    	boolean boolean1 = Boolean.parseBoolean(balls); //boolean1 value set to true

    	System.out.println(trueThat);
    }
    public void makeUpperCase() {
    	System.out.println(Character.toUpperCase(singleCharOnly));
    }
}