package promedios;

public class Promedios {

    public static void main(String[] args) {

        long Producto = 1;
        int i;

        for (i = 1; i <= 20; i += 2)
        {
            Producto = Producto * i;
            System.out.println(i+"X"+Producto);
        }
        System.out.println("La multiplicacion es : " + Producto);
    }

}
