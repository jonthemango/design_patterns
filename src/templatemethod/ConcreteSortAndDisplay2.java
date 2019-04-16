package templatemethod;

import java.util.ArrayList;
import java.util.Collections;

public class ConcreteSortAndDisplay2 extends AbstractSortAndDisplay {
    @Override
    public ArrayList<String> sort(ArrayList<String> list) {
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }

    @Override
    public void display(ArrayList<String> list) {
        for (int i=0; i<list.size();i++) System.out.println(i + ": " + list.get(i));
    }
}
