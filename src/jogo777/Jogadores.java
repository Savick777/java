
package jogo777;

 import java.util.Random;
import java.util.Scanner;

public class Jogadores {
   

    
    public static void usuario (int a){
        Scanner jogador = new Scanner (System.in);
        Scanner iniciar = new Scanner (System.in);
        Scanner desafiante = new Scanner (System.in);
        
        String nomeDesafiante;
        String nome;
        String jogar; 
        int vitoriaUsuario = 0;
        int vitoriaUsuario2 = 0;
        int desempate = 0;
        
        
        System.out.println("Digite seu nickname:");
        nome = jogador.nextLine();
        System.out.println("Obrigado " + nome + " aguarde seu desafiante entrar no jogo...");
        System.out.println("");
        System.out.println("Por favor desafiante digite seu nickname:");
        nomeDesafiante = desafiante.nextLine();
        System.out.println("");
        System.out.println("Sejam bem-vindos " + nome + " e " + nomeDesafiante);
        System.out.println("");
        System.out.println("Esse é um jogo melhor de 3, vence aquele que ganhar duas!");
        System.out.println("");
        System.out.println("A partida irá iniciar... Que a sorte esteja ao seu lado! Bom jogo!!!");
        System.out.println("");       
          
         while (vitoriaUsuario < 2 & vitoriaUsuario2 < 2){     
        System.out.println("Por favor " + nome + " aperte enter para jogar os dados!");
        jogar = iniciar.nextLine();
        System.out.println("");
        
        System.out.println(nome +" jogou:");
    
        Random dado = new Random();
        int x = dado.nextInt(1, 7) + Habilidades.vantagemP1(nome)&
        Habilidades.tirarPontosP2(nomeDesafiante);
        x += Habilidades.probabilidadeP1(nome);
        
        
        System.out.println("O resultado é: " + x);
        
        System.out.println("");
        System.out.println("É a vez de " + nomeDesafiante + " jogar:");
        System.out.println("Por favor " + nomeDesafiante + " aperte enter para jogar os dados!");
        jogar = iniciar.nextLine();
        
        int y = dado.nextInt(1, 7) + Habilidades.vantagemP2(nomeDesafiante)&
        Habilidades.tirarPontosP1(nome);
        y += Habilidades.probabilidadeP2(nomeDesafiante);
        
        System.out.println(nomeDesafiante +" jogou:");
        System.out.println("O resultado é: " + y);
        System.out.println("");
        if (x > y){
            System.out.println(nome + " Venceu");
            vitoriaUsuario++;
        }else if (x < y){
            System.out.println(nomeDesafiante + " venceu");
            vitoriaUsuario2++;
        }else{
            System.out.println("Rodada empatada");
            desempate++;
        }
        
        }
         System.out.println("Parabéns ao vencedor!!");
         
          if (desempate > 1){
              System.out.println("Houve um empate na partida, iniciando rodada de desempate...");
              System.out.println("");
              System.out.println("Por favor " + nome + " aperte enter para jogar os dados!");
        jogar = iniciar.nextLine();
        System.out.println("");
        
        System.out.println(nome +" jogou:");
    
        Random dado = new Random();
        int x = dado.nextInt(1, 7) + Habilidades.vantagemP1(nome)&
        Habilidades.tirarPontosP2(nomeDesafiante);
        
        
        System.out.println("O resultado é: " + x);
        
        System.out.println("");
        System.out.println("É a vez de " + nomeDesafiante + " jogar:");
        System.out.println("Por favor " + nomeDesafiante + " aperte enter para jogar os dados!");
        jogar = iniciar.nextLine();
        
        int y = dado.nextInt(1, 7) + Habilidades.vantagemP2(nomeDesafiante)&
        Habilidades.tirarPontosP1(nome);
        
        
        System.out.println(nomeDesafiante +" jogou:");
        System.out.println("O resultado é: " + y);
        System.out.println("");
        System.out.println("Parabéns ao vencedor!!!");
          }
          
    }
        
           
}

