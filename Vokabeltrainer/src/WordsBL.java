
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class WordsBL extends AbstractListModel {

    private static ArrayList<Words> word = new ArrayList<>();
    private static ArrayList<Words> filtered = new ArrayList<>();

    public void add(Words w) {
        word.add(w);
        filtered.add(w);
        this.fireIntervalAdded(this, filtered.size() - 1, filtered.size() - 1);
    }

    public void remove(Words w) {
        filtered.remove(w);
        this.fireContentsChanged(this, 0, filtered.size() - 1);
    }

    public static void load(File f) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    word.add(new Words(line));
                } catch (Exception e) {
                }
            }
            filtered.addAll(word);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(word);
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
