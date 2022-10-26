public class ex9 {
    static void abs(float [] a){
        
        for (int i=0; i < a.length; i++){
            float x = (Math.abs( a[i]));
            System.out.print(" |" +x+ "| ");
        }
    }

    static void floor(float [] a){
        
        for (int i=0; i < a.length; i++){
            float x = (float) (Math.floor( a[i]));
            System.out.print(" |" +x+ "| ");
        }
    }

    static void ceil(float [] a){
        
        for (int i=0; i < a.length; i++){
            float x = (float) (Math.ceil( a[i]));
            System.out.print(" |" +x+ "| ");
        }
    }

    static void rint(float [] a){
        
        for (int i=0; i < a.length; i++){
            float x = (float) (Math.rint( a[i]));
            System.out.print(" |" +x+ "| ");
        }
    }

    static void round(float [] a){
        
        for (int i=0; i < a.length; i++){
            float x = (Math.round( a[i]));
            System.out.print(" |" +x+ "| ");
        }
    }

    public static void main(String[] args){
        float[] a = {5.15f, 10.5f, -32.5f, -0.1f, -0.9f, 3.9f, 3.1f};

            System.out.println(" Números antes do processo: \n |5.15| |10.5| |-32.5| |-0.1| |-0.9| |3.9| |3.1| ");

            System.out.println("\n Números absolutos: ");
                abs(a);

            System.out.println("\n \n Números decimais mais baixos: ");
                floor(a);

            System.out.println("\n \n Números decimais mais altos: ");
                ceil(a);

            System.out.println("\n \n Números decimais mais próximos: ");
                rint(a);
                    
            System.out.println("\n \n Números arredondados: ");
                round(a);

                //código executado com sucesso! Gabriel é o cara!
                
    }
}
