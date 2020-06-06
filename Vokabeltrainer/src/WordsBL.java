
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JFileChooser;

public class WordsBL extends AbstractListModel {

    private ArrayList<Words> word = new ArrayList<>();
    JFileChooser chooser = new JFileChooser();

    public void add(Words w) {
        word.add(w);
        this.fireIntervalAdded(this, word.size() - 1, word.size() - 1);
    }

    public void remove(Words w) {
        word.remove(w);
        this.fireContentsChanged(this, 0, word.size() - 1);
    }

    public void loadLearn(File f) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    word.add(new Words(line));
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadEdit(File f) {
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    word.add(new Words(line));
                    this.fireIntervalAdded(this, 0, word.size() - 1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.fireIntervalAdded(this, 0, word.size() - 1);
    }

    public void saveFile() {
        int i = chooser.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("" + chooser.getSelectedFile())))) {
                for (Words w : word) {
                    bw.write(w.toCSV());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getSize() {
        return word.size();
    }

    @Override
    public Object getElementAt(int index) {
        return word.get(index);
    }

}
