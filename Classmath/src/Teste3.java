public class Teste3 {
    public static void main(String[] args){
        float[] a = {5.15f, 10.5f, -32.5f, -0.1f, -0.9f, 3.9f, 3.1f};

            System.out.println(" Números antes do processo: \n |5.15| |10.5| |-32.5| |-0.1| |-0.9| |3.9| |3.1| ");

            System.out.println("\n Números absolutos: ");
                for (int i=0; i < a.length; i++){
                    System.out.print(" |" + (Math.abs( a[i])) + "|");
                }

            System.out.println("\n \n Números decimais mais baixos: ");
                for (int i=0; i < a.length; i++){ 
                    System.out.print(" |" + (Math.floor( a[i]))+ "|");
                }

            System.out.println("\n \n Números decimais mais altos: ");
                for (int i=0; i < a.length; i++){ 
                    System.out.print(" |" + (Math.ceil( a[i]))+ "|");
                }

            System.out.println("\n \n Números decimais mais próximos: ");
                for (int i=0; i < a.length; i++){ 
                    System.out.print(" |" + (Math.rint( a[i]))+ "|");
                }

            System.out.println("\n \n Números arredondados: ");
                for (int i=0; i < a.length; i++){ 
                    System.out.print(" |" + (Math.round( a[i]))+ "|");
                }
    }
}

/* Comandos matemáticos:
Math.abs = valor absoluto
Math.ceil = decimal mais alto
Math.floor = decimal mais baixo
Math.rint = double mais próximo
Math.round = arredondamento mais próximo
Math.cbrt = Raíz cúbica
 */
