import java.util.HashMap;

public class FirstRepeatedIdFinder {

    public static int findFirstRepeated(int[] giftIds) {

        HashMap<Integer, Integer> seen = new HashMap<>();

        // Recorremos el arreglo
        for (int i = 0; i < giftIds.length; i++) {
            int id = giftIds[i];

            if (seen.containsKey(id)) {
                return id;
            }

            seen.put(id, i);
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] giftIds1 = {2, 1, 3, 5, 3, 2};
        System.out.println(findFirstRepeated(giftIds1)); // Debería imprimir 3

        int[] giftIds2 = {1, 2, 3, 4};
        System.out.println(findFirstRepeated(giftIds2)); // Debería imprimir -1

        int[] giftIds3 = {5, 1, 5, 1};
        System.out.println(findFirstRepeated(giftIds3)); // Debería imprimir 5
    }
}
