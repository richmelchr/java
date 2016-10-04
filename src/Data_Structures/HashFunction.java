package Data_Structures;

import java.util.Arrays;

public class HashFunction {

    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

    public static void main(String[] args) {

        HashFunction theFunc = new HashFunction(30);

        //String[] elementsToAdd = {"1", "9", "4", "7", "2"}; // must be limited to 29 based on value of "HashFunction(30)"
                                                            // theArray[] has a size of 29 | and also the values added to
                                                            // it must be less than 29 because its a hash table

        //theFunc.hashFunction1(elementsToAdd, theFunc.theArray);

        String[] elementsToAdd2 = {"100", "373", "227", "383", "731", "392", "939", "91", "892", "92", "911"};
        theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);

        theFunc.displayTheStack();
    }

    public void hashFunction1(String[] stringsForArray, String[] theArray) { // note: this is an extremely bad basic hash table
        for (int n=0; n < stringsForArray.length; n++) {
            String newElementVal = stringsForArray[n];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }

    public void hashFunction2(String[] stringsForArray, String[] theArray) { // note: this table suffers from collisions
        for (int n=0; n < stringsForArray.length; n++) {
            String newElementVal = stringsForArray[n];
            int arrayIndex = Integer.parseInt(newElementVal) % 29; // 29 is based on the size of "theFunc" object array
            System.out.println("Modulus Index: " + arrayIndex + " for value: " + newElementVal);

            while (theArray[arrayIndex] != "-1") {
                ++arrayIndex;
                System.out.println("Collision Try " + arrayIndex+ " Instead");
                arrayIndex %= arraySize;
            }
            theArray[arrayIndex] = newElementVal;
        }
    }

    HashFunction(int size) { // constructor for new HashFunction array objects
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }

    public void displayTheStack() { // for displaying your Hash table in a easy to view and understand format.
                                    // not necessary at all. is setup to work with array size of 30
        int increment = 0;
        for (int m = 0; m < 3; m++) {
            increment += 10;

            for (int n = 0; n < 71; n++) { System.out.print("-"); }

            System.out.println();

            for (int n = increment - 10; n < increment; n++) { System.out.format("| %3s " + " ", n); }

            System.out.println("|");

            for (int n = 0; n < 71; n++) { System.out.print("-"); }

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {
                if (theArray[n].equals("-1")) {
                    System.out.print("|      ");
                } else {
                    System.out.print(String.format("| %3s " + " ", theArray[n]));
                }
            }

            System.out.println("|");

            for (int n = 0; n < 71; n++) { System.out.print("-"); }

            System.out.println();
        }
    }

}
