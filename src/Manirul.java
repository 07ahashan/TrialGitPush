public class Manirul {
    public static void main(String[] args) {
        int a=2,b=14;

        while(b!=0)
        {
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }

        System.out.println(a);
    }
}
