public class Identifier {
    /** IMPLEMENTATION PROVIDED TO ENABLE TESTING */
    public static int encodeToNumber(String str) {
        if (str.equals("tree")) {
          return 80;
        } else if (str.equals("book")) {
          return 10;
        } else if (str.equals("door")) {
          return 40;
        } else if (str.equals("desk")) {
          return 50;
        } else if (str.equals("lion")) {
          return 20;
        } else {
          return 0;
        }
    }

    /** Returns an identifier string based on an input string, as described
      * in part (a)
      *
      * Precondition: input is not null.
      */
    public static String generateID(String input) {
      if (input.length() % 2 != 0) {
        return "error";
     }
     int sum = 0;
     String originalStr = input;
     while(input.length() > 0) {
        sum += encodeToNumber(input.substring(0, 4));
        input = input.substring(4);
     }
     if (sum > 100) {
        return originalStr + "3";
     } else {
        return originalStr + "X";
     }
     
    }
}
