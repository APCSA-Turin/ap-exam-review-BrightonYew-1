import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(10);
        nums.add(3);
        nums.add(8);
        nums.add(6);
        nums.add(9);

        // WRITE CODE HERE
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
            nums.add(i, 2);
            i++;
        }
        }
        System.out.println(nums);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(3);
        nums2.add(5);
        nums2.add(2);
        nums2.add(7);
        nums2.add(9);
        nums2.add(6);
        nums2.add(1);


        // WRITE CODE HERE
        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i) % 2 != 0) {
            nums2.remove(i);
            i--;
        }
        }
        System.out.println(nums2);

        String[][] words = new String[2][3];
        words[0][1] = "hello";
        words[0][2] = "echo";
        words[1][0] = "eek";
        words[1][2] = "plea";


        // WRITE CODE HERE
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[0].length; j++) {
            if (words[i][j] != null && words[i][j].substring(0,1).equals("e")) {
            words[i][j] = "CSA";
        }
        }
        }
        for (String[] row : words) {
            for (String word : row) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
        

    }
}
