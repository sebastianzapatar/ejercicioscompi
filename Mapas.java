import java.util.HashMap;
import java.util.Map;
public class Mapas {
    public static String caracter(String texto){
        char[] chars=texto.toCharArray();
        Map<Character,Integer> valores=new HashMap<>();
        for(int i=0;i<chars.length;i++){
            if(valores.containsKey(chars[i])){
                valores.put(chars[i],valores.get(chars[i])+1);
            }
            else{
                valores.put(chars[i],1);
            }
        }
        int valor=0;

        return "";
    }
    public static void main(String[] args) {
        Map<Character,Integer> repetido=new HashMap<>();


    }
}
