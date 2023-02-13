import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int columnNumber = 701;
        System.out.println(Solution.convertToTitle(columnNumber));

    }

    public static class Solution{
        public static String convertToTitle(int n) {
//            List<String> alphabet = List.of("A","B", "C", "D", "E", "F", "G", "H", "I","J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
//            HashMap<Integer, String> map = new HashMap<>();
//            int k  = 1;
//
//            for (String s : alphabet) {
//                map.put(k, s);
//                k++;
//            }
//            for (String s : alphabet) {
//                for (String c : alphabet) {
//                        map.put(k, s + c);
//                        k++;
//                }
//            }
//            for (String s : alphabet) {
//                for (String c : alphabet) {
//                    for (String v : alphabet) {
//                        map.put(k, s + c + v);
//                        k++;
//                    }
//                }
//            }
//            System.out.println(map);
//            return map.get(columnNumber);
//        }
            if (n <= 0) {
                return "";
            }

            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                int remainder = (n - 1) % 26;
                sb.insert(0, (char)('A' + remainder));
                n = (n - 1) / 26;
            }

            return sb.toString();
        }
    }
}
