package EJ5_ARRAY;

import java.util.Arrays;

public class EJ_ARRAYLIST {

    public static void main(String[] args) {

        String my_array[] = {"FirstWord", "SecondWord", "THIRDWORD"};

        String string = Arrays.toString(my_array)
                .replace(",", " ")
                .replace("[","")
                .replace("]","").toLowerCase();

        System.out.println(string);
    }
}
