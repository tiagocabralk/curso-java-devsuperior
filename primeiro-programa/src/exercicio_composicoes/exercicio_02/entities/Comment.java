package exercicio_composicoes.exercicio_02.entities;

public class Comment {
    private String text;

    public Comment() {
    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void status() {
        System.out.println(getText());
    }

    @Override
    public String toString() {
        return text;
    }
}
