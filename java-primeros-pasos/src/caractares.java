public class caractares {
    public static void main(String[] args) {
        
        char caracter = 'a'; // soportar un solo caracter o un numero represando en la tabla ASCII
        System.out.println(caracter);

        char segundoCaracter = (char) (caracter + 1);// es necesario una conversion porque java interpreta que caracter es un entero a diferencia de mutarlo
        System.out.println(segundoCaracter);
        
        String word = "Oscar Aguirre Tarazona";//string es un objeto
        System.out.println(word);

    }
}
