public class Digitos1 {
    public static void main(String[] args) {

        String cadenas = "123 aa 203 sadds 2";
        int contador = 0;

        for (int i = 0; i < cadenas.length(); i++) {
            if (Character.isDigit(cadenas.charAt(i))) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " numeros digitos");
    }
}
