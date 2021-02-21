public class Regex {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        String [] punctuation = s.split("['? ,.]+");

        for ( String item : punctuation){
            System.out.println(item);
        }
    }
}
