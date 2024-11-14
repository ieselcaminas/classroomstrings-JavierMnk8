public class Longitud2 {
    public static void main(String[] args) {

        String cadena = "Hola buenas tardes mongolo";
        String[] palabra = cadena.split(" ");
        int longitud = 6;
        boolean longo = false;

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() == longitud) {
                longo = true;
                break;}
    }
        if (longo) {
            System.out.println("Hay una palabra con " + longitud + " carácteres");

        }else System.out.println("No hay ninguna palabra con " + longitud + " carácteres");
    }
}

