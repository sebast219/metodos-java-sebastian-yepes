import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;;



public class lista_numeros_primos {
    
    public static boolean esprimo(int numero) 
    {
        if (numero <= 1) { return false; }
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0) { return false; }
        }
        return true;
    }

    public static List<Integer> filternumeros(List<Integer> numeros) {
        return numeros.stream()
        .filter(lista_numeros_primos::esprimo)
        .collect(Collectors.toList());
    }

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Integer> primos = filternumeros(numeros);
        System.out.println("los numeros primos de la lista son : "+ primos);
    }
    }