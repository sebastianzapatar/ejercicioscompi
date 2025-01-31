public class ReverseandAdd {
    public static void main(String[] args) {
        StringBuilder l1=new StringBuilder("123");
        //System.out.println(l1.reverse());
        StringBuilder l2=
                new StringBuilder(l1.toString());
        System.out.println(l2.hashCode());
        System.out.println(l1.hashCode());
        l2=l2.reverse();
        System.out.println(l1);
    }
}
