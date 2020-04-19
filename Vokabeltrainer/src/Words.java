public class Words {
    private String germanWord;
    private String otherWord;
    private String explanation;

    public Words(String germanWord, String otherWord, String explanation) {
        this.germanWord = germanWord;
        this.otherWord = otherWord;
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
    public String toString(){
        return String.format("%s %s %s", germanWord, otherWord, explanation);
    }
}
