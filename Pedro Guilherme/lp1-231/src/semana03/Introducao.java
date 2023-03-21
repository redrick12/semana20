package semana03;

import java.util.Scanner;

public class Introducao {
    public static void main(String[] args) {
        // Comentário de linha

        /*
         * Comentários de múltiplas linhas
         */

         // Tipos Primitivos

         // Inteiros
         // byte, short, int, long

         byte n1 = 100; // -128 a 127
         short n2 = 3000; // -32768 a 32767
         int n3 = 4000000; // 2 bilhoes
         long n4 = 3232323232323L; // 8 bytes

         // Ponto flutuante
         // float, double
         float nota1 = 9.5f; // 4 bytes
         double nota2 = 9.5; // 8 bytes

         // char
         char letra = 'A';

         // boolean
         boolean ligado = true;
         boolean teste = false;

         // String
         String palavra = "Olá mundo";
         System.out.println(palavra);
         System.out.println(palavra.toLowerCase());
         System.out.println(palavra.toUpperCase());

         // Variáveis e constantes
         // tipo nome = valor;
         // tipo nome;
         // nome = valor;

         short idade = 30;

         short idade2;
         idade2 = 30;

         // Java 10 - Inferência de tipos
         var sobrenome = "Santos";
         var idade3 = 25;

         // Constantes
         final double TESTE = 30.4;

         // Entrada e saída de dados
         // Instancia um objeto para receber dados do usuario
         Scanner sc = new Scanner(System.in);


         System.out.println("Entre com o seu nome");
         String nomeInformado = sc.nextLine();


         System.out.println("Entre com a sua idade");
         short idadeInformada = sc.nextShort();

         System.out.println(nomeInformado + " " + idadeInformada);

         // Fecha o objeto Scanner liberando os recursos alocados

         sc.close();



    
    }
}
