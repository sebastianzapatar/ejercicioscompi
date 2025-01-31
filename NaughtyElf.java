public class NaughtyElf {

    public static String findNaughtyStep(String original, String modified) {
        // Convertimos las cadenas en arreglos de caracteres
        char[] originalArray = original.toCharArray();
        char[] modifiedArray = modified.toCharArray();

        // Determinamos la longitud menor entre las dos cadenas
        int minLength = Math.min(originalArray.length,
                modifiedArray.length);

        // Comparamos los caracteres uno por uno
        for (int i = 0; i < minLength; i++) {
            if (originalArray[i] != modifiedArray[i]) {
                // Retornamos el primer carácter diferente
                return String.valueOf(modifiedArray[i]);
            }
        }

        // Si una cadena es más larga, el paso extra está al final
        if (originalArray.length < modifiedArray.length) {
            return String.valueOf(modifiedArray[modifiedArray.length - 1]);
        } else if (originalArray.length > modifiedArray.length) {
            return String.valueOf(originalArray[originalArray.length - 1]);
        }

        // Si no hay diferencia, retornamos una cadena vacía
        return "";
    }

    public static void main(String[] args) {
        // Pruebas
        System.out.println(findNaughtyStep("abcd", "abcde")); // Debería imprimir "e"
        System.out.println(findNaughtyStep("stepfor", "stepor")); // Debería imprimir "f"
        System.out.println(findNaughtyStep("abcde", "abcde")); // Debería imprimir ""
        System.out.println(findNaughtyStep("", "a")); // Debería imprimir "a"
        System.out.println(findNaughtyStep("a", "")); // Debería imprimir "a"
    }
}
