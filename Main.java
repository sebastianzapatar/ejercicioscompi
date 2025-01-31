import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Optional<?> optional;
        Set<Persona> numeros=new HashSet<>();
        Persona paulina=new Persona(
                "Paulina",
                1,
                "Medina"
        );
        Persona victor=new Persona(
                "Victor",
                2,
                "Restrepo"
        );
        Persona juanFe=new Persona(
                "Juanfe",
                4,
                "Gómez"
        );
        Persona sofia=new Persona(
                "Sofia",
                3,
                "Aristizabal"
        );
        numeros.add(paulina);
        numeros.add(victor);
        numeros.add(juanFe);
        numeros.add(sofia);
        System.out.println(juanFe.hashCode());
        System.out.println(paulina.hashCode());
        System.out.println(numeros.toString());
        List<String> strings=Arrays.asList(
                "apple","banana","cherry","dete"
        );
        List<Integer> primos=Arrays.
                asList(2,3,5,7,11,13);
        int doble=
                primos.stream().map(
                        s->s=s*s
                ).reduce(100,Integer::sum);
        System.out.println(doble);
        List<Persona> persona=
            numeros.stream().filter(
                    loquesa->loquesa.cedula%2==0
            ).collect(Collectors.toList());
        System.out.println(persona);

    }
}