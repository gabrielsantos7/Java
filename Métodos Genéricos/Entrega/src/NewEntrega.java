import java.util.Scanner;

public class NewEntrega {

	public static < T extends Number & Comparable<T> > int qtdViagens(T[] valores) {
	 
        // Verifica se está em ordem crescente entre 0 e 1000
     	if((valores[0].compareTo(valores[1]) < 0) && (valores[1].compareTo(valores[2]) <= 0) && (valores[2].compareTo(valores[3]) <= 0) && (valores[3].compareTo(valores[4]) < 0)){

            // Se os três forem iguais
        	if(valores[1].compareTo(valores[2]) == 0 && valores[2].compareTo(valores[3]) == 0)
            	return 3;

            // Se os três forem diferentes
        	else if((valores[1].compareTo(valores[2]) < 0) && (valores[1].compareTo(valores[3]) < 0) && (valores[2].compareTo(valores[3]) < 0))
            	return 1;
            
            // Se a soma de dois for maior que o terceiro
        	else if((valores[1].doubleValue() + valores[2].doubleValue()) >= valores[3].doubleValue())
            	return 2;

        	else
            	return 1;

    	}else
        	return -1;
    	 
	}

	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	Double[] valores = new Double[5];
   	 
    	for(int i = 1; i <= 3; i++)
        	valores[i] = input.nextDouble();

    	valores[0] = 0.0;
    	valores[4] = 1001.0;
   	 
    	System.out.println(qtdViagens(valores));
   	 
    	input.close();
	}
}

