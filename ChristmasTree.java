public class ChristmasTree {

    public static String createChristmasTree(String ornaments, int height) {
        // StringBuilder para construir el árbol
        StringBuilder tree = new StringBuilder();

        // Longitud de los adornos
        int ornamentLength = ornaments.length();

        // Construimos cada nivel del árbol
        for (int i = 1; i <= height; i++) {
            // Añadimos espacios para centrar el nivel
            int spaces = height - i;
            tree.append(" ".repeat(spaces));

            // Añadimos los adornos del nivel
            for (int j = 0; j < i; j++) {
                tree.append(ornaments.charAt(j % ornamentLength));
                if (j < i - 1) {
                    tree.append(" "); // Espacio entre adornos
                }
            }

            // Salto de línea al final del nivel
            tree.append("\n");
        }

        // Añadimos el tronco del árbol
        tree.append(" ".repeat(height - 1)).append("|\n");

        return tree.toString();
    }

    public static void main(String[] args) {
        // Ejemplo 1
        System.out.println(createChristmasTree("1243", 4));
        // Salida esperada:
        //    1
        //   2 3
        //  1 2 3
        // 1 2 3 1
        //    |

        // Ejemplo 2
        System.out.println(createChristmasTree("*o", 5));
        // Salida esperada:
        //     *
        //    o *
        //   o * o
        //  * o * o
        // * o * o *
        //     |
    }
}