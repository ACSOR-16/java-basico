public class scope {
    public static void main(String[] args) {
       
        int edad = 20;
        int cantidadPersonas = 3;
        boolean acompañado;//inicializada

        if (cantidadPersonas >= 2) {
            acompañado = true;//declarada
        } else {
            acompañado = false;
        }

        if (edad >= 18 || acompañado) {
            System.out.println ("Bienvenido");
        } else {
            System.out.println ("desafortunadamente no puedes ingresar");
        }
    }
}
