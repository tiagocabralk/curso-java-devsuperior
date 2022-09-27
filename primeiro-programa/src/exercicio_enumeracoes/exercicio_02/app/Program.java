package exercicio_enumeracoes.exercicio_02.app;

import exercicio_enumeracoes.exercicio_02.entities.Comment;
import exercicio_enumeracoes.exercicio_02.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        Comment c01 = new Comment("Have a nice trip");
        Comment c02 = new Comment("Wow that's awesome!");
        Comment c03 = new Comment("Good night!");
        Comment c04 = new Comment("May the Force br with you");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        LocalDateTime momento = LocalDateTime.now();

        Post post01 = new Post(momento, "Traveling to New Zelland", "I'm going to visit this wonderful country!", 12);
        post01.addComment(c01);
        post01.addComment(c02);
        System.out.println(post01);

        Post post02 = new Post(momento, "Good night guys", "See you tomorrow", 5);
        post02.addComment(c03);
        post02.addComment(c04);
        System.out.println(post02);
    }
}
