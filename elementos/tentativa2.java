package elementos;

import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;

import java.util.ArrayList;
public class tentativa2 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> lista;
        lista = new ArrayList<>();
          int i;

        
        System.out.println("Quantos numero serão cadastrados?");
        i = ler.nextInt();
        lista.add(i);
        if (i <= 0) {
        System.out.println("Consulta invalida");
        }else {
        
        
       int []tel= new int [i];
        
       
        for (int x = 0; x < i; x ++){
   
        
            System.out.println("Cadastre o número de telefones "+(1 + x));
            tel [x] = ler.nextInt();
            
        }
        
       
        Integer  buscadenumero;
        System.out.println("Digite o numero cadastrado.");
        buscadenumero = ler.nextInt();
        
        boolean semcadastro = true;
        
       while (semcadastro){
           int x=0;
            if (buscadenumero.equals (tel[x])){
                System.out.println(tel [x]);
                System.out.println("Total de Cadstros no ArrayList "+lista.size());
                semcadastro = false;
            }
            
               else {
            System.out.println("Numero não cadastrado");
            
        }
       }
 
               
     
    }
    }
}