package Data_Structures;

// best resource for Java linked list implementation below
// https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html

public class Link {

    String bookName;
    private int millionsSold;

    Link next;
    Link(String bookName, int millionsSold) {
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    void display() {
        System.out.println(bookName + ": " + millionsSold + ",000,000");
    }

    public String toString() {
        return bookName;
    }

    public static void main(String[] args) {

        LinkList theLinkedList = new LinkList();

        theLinkedList.insertFirstLink("Don Quixote", 500);
        theLinkedList.insertFirstLink("A tale of two cities", 200);
        theLinkedList.insertFirstLink("The lord of the rings", 150);

        theLinkedList.display();

        System.out.println(theLinkedList.find("The lord of the rings").bookName + " was found");
    }
}

class LinkList {

    private Link firstLink;

    LinkList() {
        firstLink = null;
    } // by default objects get a value of null. this constructor is just for demonstration

    boolean isEmpty() {
        return (firstLink == null);
    }

    void insertFirstLink(String bookName, int millionsSold) {
        Link newLink = new Link(bookName, millionsSold);
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public Link removeFirst() {
        Link linkReference = firstLink;
        if (!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty LinkedList!");
        }
        return linkReference;
    }

    void display() {
        Link theLink = firstLink;

        while (theLink != null) {
            theLink.display();
            System.out.println("Next Data_Structures.Link: " + theLink.next);
            theLink = theLink.next;
            System.out.println();

        }
    }

    Link find(String bookName) {
        Link theLink = firstLink;
        if (!isEmpty()) {
            while (theLink.bookName != bookName) {
                if (theLink.next == null) {
                    return null;
                } else {
                    theLink = theLink.next;
                }
            }
        } else {
            System.out.println("Empty LinkedList");
        }
        return theLink;
    }

    public Link removeLink(String bookName) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        while(currentLink.bookName != bookName) {
            if (currentLink.next == null) {
                return null;
            } else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }
        if (currentLink == firstLink) {
            firstLink = firstLink.next;
        } else {
            previousLink.next = currentLink.next;
        }
        return currentLink;
    }
}

