import entities.Comments;
import entities.Post;

import javax.xml.stream.events.Comment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comments c1 = new Comments("Have a nice trip!");
        Comments c2 = new Comments("Wow that's awesome!");

        Comments c3 = new Comments("Good night");
        Comments c4 = new Comments("May the force be with you");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                        "Travelling to New Zealand",
                        "Im going to visit this wonderful country",
                        12);

        p1.addComments(c1);
        p1.addComments(c2);

        Post p2 = new Post(
                sdf.parse("15/02/2010 13:05:44"),
                "Good night guys",
                "See you tomorrow",
                5);

        p2.addComments(c3);
        p2.addComments(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}