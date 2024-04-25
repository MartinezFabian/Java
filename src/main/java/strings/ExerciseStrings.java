package strings;

/*
* Desarrolla una función que reciba una palabra como entrada y determine si es un palíndromo o no.
* Un palíndromo es una palabra que se lee igual de izquierda a derecha que de derecha a izquierda.
* Por ejemplo, 'radar' es un palíndromo, ya que se lee igual en ambas direcciones.
* La función debe devolver verdadero si la palabra es un palíndromo y falso si no lo es.
* */

public class ExerciseStrings {

    public static void main(String[] args) {
        System.out.println(isPalindrome("radar")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome("kayak")); // true
    }

    public static boolean isPalindrome(String word) {
        int j = word.length() - 1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }

            j--;
        }

        return true;
    }
}
