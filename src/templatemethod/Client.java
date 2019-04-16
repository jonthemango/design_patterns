package templatemethod;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Last");
        AbstractSortAndDisplay sorterDisplayer;

        // first subclass
        sorterDisplayer = new ConcreteSortAndDisplay1();
        sorterDisplayer.sortAndDisplay(list);

        System.out.println("============ SEPERATOR =============");
        // second subclass
        sorterDisplayer = new ConcreteSortAndDisplay2();
        sorterDisplayer.sortAndDisplay(list);
    }
}
