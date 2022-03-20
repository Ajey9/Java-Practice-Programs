package Java_programs;

public class textBlock {
    public static void main(String[] args) {
        String greeting = """
                Hello All,
                My Name is Ajay Gathadi""";

        System.out.println(greeting);

        String html = """
                <div class = "Warning">
                    Beware of your awareness
                 </div>
                 """;
        System.out.println(html);

        String string = """
                Hey There.\
                Will you not tell me your name?""";
        System.out.println(string);
    }
}
