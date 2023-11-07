public class recursividad {
    public static void imprimirCaracteresIndividuales(String cadena) {
        imprimirCaracteresIndividualesRecursivo(cadena, 0);
    }

    private static void imprimirCaracteresIndividualesRecursivo(String cadena, int indice) {
        if (indice < cadena.length()) {
            System.out.println(cadena.charAt(indice)); // Imprime el caracter actual en una nueva línea
            imprimirCaracteresIndividualesRecursivo(cadena, indice + 1); // Llamada recursiva para el siguiente caracter
        }
    }

    public static void main(String[] args) {
        String cadena = "Oliver Garces";     //cadena que se imprimira en pantalla caracter por acaracter 
        System.out.println("Caracteres de la cadena  '" + cadena + "'  De forma independiente :");
        imprimirCaracteresIndividuales(cadena);
    }
}
