
public class Words {

    private String germanWord;
    private String otherWord;
    private String explanation;

    public Words(String line) {
        String parts[] = line.split(",");
        germanWord = parts[0];
        otherWord = parts[1];
        explanation = parts[2];
    }

    public void setGermanWord(String germanWord) {
        this.germanWord = germanWord;
    }

    public void setOtherWord(String otherWord) {
        this.otherWord = otherWord;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getGermanWord() {
        return germanWord;
    }

    public String getOtherWord() {
        return otherWord;
    }

    public String getExplanation() {
        return explanation;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", germanWord, otherWord, explanation);
    }
}
