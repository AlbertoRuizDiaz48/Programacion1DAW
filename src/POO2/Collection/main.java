package POO2.Collection;

import java.util.*;


public class main {
    public static void main(String[] args) {
        String s = "Cadena de ejemplo!!\nHoy es miércoles día 29 de marzo de 2023\n\nFIN";
// Utilizamos HashMap para almacenar los caracteres y sus frecuencias
        Map<Character, Integer> letras = new HashMap<>();
// Convertimos la cadena de entrada a minúsculas y la recorremos
        for (char letra : s.toLowerCase().toCharArray()) {
            // Verificamos si el carácter es una letra
            if (Character.isLetter(letra)) {
                // Incrementamos la frecuencia del carácter en el mapa, o lo iniciamos a 0
                letras.put(letra, letras.getOrDefault(letra, 0) + 1);
            }
        }
// Mostramos los resultados
        System.out.println("Frecuencia de caracteres en la cadena de entrada:");
        for (Map.Entry<Character, Integer> claveValor : letras.entrySet()) {
            System.out.println(claveValor.getKey() + ": " + claveValor.getValue());
        }
    }
}