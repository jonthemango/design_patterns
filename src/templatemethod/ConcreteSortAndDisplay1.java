package templatemethod;

import java.util.ArrayList;
import java.util.Collections;

public class ConcreteSortAndDisplay1 extends AbstractSortAndDisplay {
    @Override
    public ArrayList<String> sort(ArrayList<String> list) {
        Collections.sort(list);
        return list;
    }

    @Override
    public void display(ArrayList<String> list) {
        for (int i=0; i<list.size();i++) System.out.println(list.get(i));
    }
}
