public class loops {
    public static void main(String[] args) {
        //WHILE 
        int contador = 0;
        while (contador <= 10) {
            // contador = contador + 1;
            System.out.println(contador);
            contador ++;
        }

        int count = 0;
        int total = 0;

        while (count <= 10) {
            total = total + count;
            count ++;
        }
        System.out.println(total);
    }
}
