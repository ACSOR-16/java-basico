
public class tipoVariable {
    public static void main(String[] args) {
        System.out.println("hello world!!!");

        // valores enteros solo soporta estos valores 2 a 31
        int number = 25;
        long prueba = 2222222222222222222l;
        short numeroNoTanChico = 12345;
        byte numeroChico = 123;
        float numeroSuperChico = 2.5F;
        
        System.out.println(number);
        System.out.println(prueba);
        System.out.println(numeroNoTanChico);
        System.out.println(numeroChico);
        System.out.println(numeroSuperChico);
        
        // sustiyendo 
        number = 25 + 45;
        System.out.println("Mi numero favorito es " + number);

        int division = 15 / 4;
        System.out.println(division);

        // valores decimales con double
        double salario = 2500.78;
        System.out.println(salario);
        
        double salarioquincenal = 2500.78 / 2;
        System.out.println(salarioquincenal);
        // conversion explicita
        int salarioNeto = (int)salarioquincenal;
        System.out.println(salarioNeto);
    }
}
