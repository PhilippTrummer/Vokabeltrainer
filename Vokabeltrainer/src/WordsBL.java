
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class WordsBL extends AbstractListModel {

    private ArrayList<Words> word = new ArrayList<>();
    private ArrayList<Words> filtered = new ArrayList<>();

    public void add(Words w) {
        word.add(w);
        filtered.add(w);
        this.fireIntervalAdded(this, filtered.size() - 1, filtered.size() - 1);
    }

    @Override
    public int getSize() {
        return filtered.size();
    }

    @Override
    public Object getElementAt(int index) {
        return filtered.get(index);
    }

}
