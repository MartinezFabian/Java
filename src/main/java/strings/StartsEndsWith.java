package strings;

public class StartsEndsWith {

    public static void main(String[] args) {
        String word = "hello world my name is fabian";

        System.out.println(word.startsWith("hello")); // true
        System.out.println(word.startsWith("world")); // false
        System.out.println(word.endsWith("fabian")); // true
        System.out.println(word.endsWith("hello")); // false
    }
}
