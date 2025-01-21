package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class BasicArrayListOperation {
    public static void main(String[] args) {
        //  create an arraylist(AL)
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        // adding element to AL
        intArray.add(12);
        intArray.add(1, 20);
        intArray.add(80);
        intArray.add(72);
        intArray.add(4, 60);
        intArray.add(78);
        System.out.println(intArray);
        traverseArrayListUsingIterator(intArray);

        // other way we can insert element in array List too:
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Arjun", "Balabhadra", "Chandra", "Drona", "Eswar", "Faith"));
        removeElementInArrayListUsingIndex(stringList);
    }

    /**
     * Using For Loop ArrayList Traverse
     * TC: O(N)
     * SC: O(1) as not required any additional memory for traversing in Array List
     *
     * @param arrayList
     */
    public static void traverseArrayListUsingForLoop(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            // add 1  to all element of arrayList
            System.out.println(arrayList.get(i) + 1);
        }
    }

    /**
     * TC: O(N)
     * SC: O(1) as not required any additional memory for traversing in Array List
     * Using For each, for ArrayList Traverse
     *
     * @param arrayList
     */
    public static void traverseArrayListUsingForEach(ArrayList<Integer> arrayList) {
        for (int i : arrayList) {
            // -1  to all element of arrayList
            System.out.println(i - 1);
        }
    }

    /**
     * TC: O(N)
     * SC: O(1) as not required any additional memory for traversing in Array List
     * Using Iterator for ArrayList Traverse
     *
     * @param arrayList
     */
    public static void traverseArrayListUsingIterator(ArrayList<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * TC: O(N) Note: searching an element is O(N) but accessing an element is O(1) as we access at the specific location.
     * SC: O(1) as not required any additional memory for searching in Array List.
     * Using for each Search an element in ArrayList
     *
     * @param stringList
     */
    public static void SearchElementInArrayListUsingForEach(ArrayList<String> stringList) {
        for(String s : stringList){
            if(s.equals("Fa")){
                System.out.println("Found the element.");
            }else System.out.println("Element is not present.");
        }
    }

    /**
     * TC: O(N) Note: searching an element is O(N) but accessing an element is O(1) as we access at the specific location.
     * SC: O(1) as not required any additional memory for searching in Array List.
     * Using indexOf() Search an element in ArrayList
     *
     * @param stringList
     */
    public static void searchElementInArrayListUsingIndexOf(ArrayList<String> stringList) {
        System.out.println("Element is present at the index: " +stringList.indexOf("Faith"));
        }

    /**
     * In the worst case, this operation will take o n time, where n is the number of the elements in the
     *
     * array list as the object might be located at the last position or not be present in the list.
     *
     * If the object is found, the remove method with the element parameter is called.
     *
     * So this will also take and this one also will take o n time complexity in the worst case.
     * TC: O(N) Note:
     * SC: O(1) as not required any additional memory for searching in Array List.
     * Using remove(element) remove an element from the ArrayList
     *
     * @param stringList
     */
    public static void removeElementInArrayListUsingElement(ArrayList<String> stringList) {
        System.out.println("Elements in Array list before removing: " +stringList);
        System.out.println("Remove the element: " +stringList.remove("Faith"));
        System.out.println("Elements in Array list before removing: " +stringList);
    }
    /**
     *
     * In the worst case, this operation will take o n time, where n is the number of the elements in the
     *
     * array list as the object might be located at the last position or not be present in the list.
     *
     * If the object is found, the remove method with the index parameter is called.
     *
     * So this will also take and this one also will take o n time complexity in the worst case.
     * TC: O(N) Note:
     * SC: O(1) as not required any additional memory for searching in Array List.
     * Using remove(index) remove an element from the ArrayList
     *
     * @param stringList
     */
    public static void removeElementInArrayListUsingIndex(ArrayList<String> stringList) {
        System.out.println("Elements in Array list before removing: " +stringList);
        System.out.println("Remove the element: " +stringList.remove(4));
        System.out.println("Elements in Array list before removing: " +stringList);
    }

}
