package HW_24_09_20;

public class Task3 {
    public static void main(String[] args) {
        String sentence ="The separatist movement in the Rhineland went so far that some leading German politicians came out in favour of it, suggesting that if the Rhineland were thus ceded it might be possible for the German Republic to strike a bargain with the French in regard to Reparations.";
        System.out.println(sentence.substring(0,(sentence.length()/2)));
        System.out.println(sentence.substring(sentence.length()/2));
    }
}
