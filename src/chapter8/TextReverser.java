package chapter8;

/***
 * Write a method that prints a given String backwards.
 * For example, if given camel, it prints lemac.
 */

public class TextReverser {

    public static void main(String[] args){
        reverseString("Hello Salut!");
    }

    public static void reverseString(String text){
        for(int i=text.length()-1; i>0; i--)
            System.out.print(text.charAt(i));
    }
}
