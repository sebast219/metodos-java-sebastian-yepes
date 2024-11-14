import java.util.Arrays;
import java.util.List;

public class  js_metodos{
    
    public static  int countpais4letras(List<String> paises){
        return (int) paises.stream()
        .filter(pais -> pais.length() == 4)
        .count();
    }

    public static void main(String[] args) {
        List<String> paises = Arrays.asList("CUBA", "PERU", "COLOMBIA", "ARGENTINA", "MEXICO", "BRASIL","belice", "bolivia", "chile","costa rica","ecuador", "el salvador", "guatemala", "guyana", "honduras", "nicaragua", "paraguay", "republica dominicana", "uruguay", "venezuela");
        int count = countpais4letras(paises);
        System.out.println("numero de paises con 4 letras en su nombre : "+ count);
    }
}

