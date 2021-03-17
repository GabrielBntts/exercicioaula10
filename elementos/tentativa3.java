package elementos;


import java.util.Scanner;
import java.util.ArrayList;
public class tentativa3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        
        System.out.println("Digite a quantidade de nº que deseja: ");
        int numero = ler.nextInt();
        int somaNum=0;
        int num = 0;
        
        do {
           
            System.out.println("Digite o nº :");
            num = ler.nextInt();
             somaNum += num;
           
           
            listaNumeros.add(num);
            System.out.println("Lista de Numeros digitados: " + listaNumeros);
            System.out.println("A soma dos numeros digitados é " + somaNum);
        
        }while (num > 0);
         listaNumeros.size();

  
        
        
    }
    
}


