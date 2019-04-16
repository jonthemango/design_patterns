package templatemethod;

import java.util.ArrayList;

public abstract class AbstractSortAndDisplay {

    public abstract ArrayList<String> sort(ArrayList<String> list);
    public abstract void display(ArrayList<String> list);

    public void sortAndDisplay(ArrayList<String> list){
        ArrayList<String> sorted = this.sort(list);
        System.out.println("Sorted List");
        display(sorted);
    }
}
