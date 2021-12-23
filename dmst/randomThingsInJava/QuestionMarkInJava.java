package aueb.dmst.randomThingsInJava;
/**
 * <h1>? in Java</h1>
 * <h2>Author Details</h2>
 * <p>
 * @file QuestionMarkInJava.java
 * @author Gavrilaki Marina
 * github username MarinaGavrilaki
 * @version 1.0
 * @since 23/12/2021
 * </p>
 * <h3>
 * In this example you will understand how a question mark is used in Java.
 * <b></b>
 * We are referring to this symbol: ?
 * </h3>
 */
public class QuestionMarkInJava {
    /** <h4>Use:</h4>
     * <h5>
     * We are using the question mark to "replace" an if-else statement as its usage is almost the same.
     * For example rather than writing:
     * {@code
     * String str1 = "Marina";
     * String str2 = "Maria";
     * if (str1.length() > str2.length() ) {
     *     System.out.println("String 1 is longer.");
     * } else {
     *     System.out.println("String 2 is longer.");
     * }
     * }
     *
     * @param str1Length is the length of str1
     * @param str2Length is the length of str2
     *
     * we will write:
     *                   {
     * @code
     * int maxStrLength = (str1Length > str2Length) ? str1Length : str2Length;
     * System.out.println("maxStrLength");
     *                   }
     *
     *</h5>
     *<h4>
     *     <p>
     *         Method questionMarkAsTernaryOperatorNotUsed(int,int) don't use
         *     the question mark.
     *     </p>
     *     <p>
     *         Method questionMarkAsTernaryOperatorUsed(int, int) uses
     *         the question mark rather than the if-else statement.
     *     </p>
     *</h4>
     *
     *
     *
     * Method: questionMarkAsTernaryOperatorNotUsed
     * that doesn't use the question mark.
     */
    public static void questionMarkAsTernaryOperatorNotUsed(int str1Length,
                                                      int str2Length) {
        /*
        if (str1Length > str2Length) {
            //It could be written simplier as: (str1.length() > str2.length())
            // but it's better to be clear.
            System.out.println(str1Length);
        } else {
            System.out.println(str2Length);
        }

         */
        int maxStrLength = Math.max(str1Length,str2Length);
        System.out.println(maxStrLength);


    }

    /**
     *
     * @param str1Length describes the length of String no1
     * @param str2Length describes the length of String no2
     * Method: questionMarkAsTernaryOperatorUsed that uses the
     */
    public static void questionMarkAsTernaryOperatorUsed(int str1Length,
                                                            int str2Length) {
        /**
         * @param maxStrLength finds the largestest character string between
         *                     str1 and str2.
         */
        int maxStrLength = (str1Length > str2Length) ? str1Length : str2Length;
        System.out.println(maxStrLength);
    }

    public static void main(String[] args) {
        String str1 = "Marina";
        String str2 = "Maria";
        int str1Length = str1.length();
        int str2Length = str2.length();
        /**
         * Without using the question mark:
         */
        questionMarkAsTernaryOperatorNotUsed(str1Length, str2Length);
        /**
         * After using the question mark in a condition:
         */
        questionMarkAsTernaryOperatorUsed(str1Length, str2Length);
    }
}
