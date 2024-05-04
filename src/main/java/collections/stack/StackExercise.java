package collections.stack;

/*
* -Dada una cadena `s` que sólo contiene los caracteres `'('`, `')'`, `'{'`, `'}'`, `'['` y `']'`, determine si la cadena de entrada es válida.
* Una cadena de entrada es válida si:
    1. Los corchetes abiertos deben estar cerrados por el mismo tipo de corchetes.
    2. Los corchetes abiertos deben cerrarse en el orden correcto.
    3. Cada corchete cerrado tiene su correspondiente corchete abierto del mismo tipo.

Ejemplos:

Input: s = "()"
Output: true


Example 2:
Input: s = "()[]{}"
Output: true


Example 3:
Input: s = "(]"
Output: false
* */

import java.util.Stack;

public class StackExercise {
    public static boolean validateParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            } else if (character == ')' || character == '}' || character == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char openingCharacter = stack.pop();

                if ((character == ')' && openingCharacter != '(') ||
                        (character == '}' && openingCharacter != '{') ||
                        (character == ']' && openingCharacter != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(validateParenthesis("()"));              // true
        System.out.println(validateParenthesis(")()"));             // false
        System.out.println(validateParenthesis("("));               // false
        System.out.println(validateParenthesis("())("));            // false
        System.out.println(validateParenthesis("(())((()())())"));  // true
        System.out.println(validateParenthesis("()[]{}"));          // true
        System.out.println(validateParenthesis("(]"));              // false
    }
}
