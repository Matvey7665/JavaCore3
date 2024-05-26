package lesson5;

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) throws IOException {
        int[] array = {1,2,3,4,5,6,7,8,9};
        //writeToFile(writeZero(array));
        int[] arr = (readFile("src/main/resources/text.txt"));
        for(int val : arr){
            System.out.println(val);
        }

    }
    public static void writeToFile(String arr) throws IOException {
        try(FileWriter writer = new FileWriter("src/main/resources/text.txt")) {
            //String data = arr.toString();
           // writer.write(Arrays.toString(arr));
            writer.write(arr);
        }
    }
    public static String writeZero(int[] arr){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <arr.length ; i++) {
            sb.append(arr[i]).append("0");
        }

        return sb.toString();
    }
    public static int[] readFile(String path) throws IOException,FileNotFoundException {
        ArrayList<Integer> arr = new ArrayList<>();
        try( FileReader reader = new FileReader("src/main/resources/text.txt")) {
            int n;
            while ((n = reader.read()) != -1){
                char temp = (char) n;
                if (temp != '0' ) {
                    try {
                        arr.add(Integer.parseInt(String.valueOf(temp)));
                    } catch (NumberFormatException e) {
                       e.printStackTrace();
                    }
                }
            }
            int[] result = new int[arr.size()];
            int index = 0;
            for (Integer integer : result) {
                result[index++] = integer.intValue();
            }
            return result;
        }

    }
}
