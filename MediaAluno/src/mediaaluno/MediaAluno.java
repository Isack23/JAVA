/*
 */
package mediaaluno;

import java.util.Scanner;


public class Main
{
    public void acao(){				// aqui vai fazer a função de pegar as notas calcular a media e dizer se foi ou não aprovado
        
        Scanner med = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        float nota1 = med.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = med.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = med.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float nota4 = med.nextFloat();
        float media = (nota1+nota2+nota3+nota4)/4;
        
        if(media>=7)System.out.println("Passou com "+media+" pontos");
        
        else if(media<4)System.out.println("Ficou reprovado "+media+" pontos");
        else System.out.println("Ficou de AF "+media+" pontos");
		
    }
	public static void main(String[] args) {
	    	Main a = new Main();					//criando um objeto "a" da classe "Main"
	    	Scanner med = new Scanner(System.in);	
		a.acao();								//chamando o metodo que faz a media
	    
	    	boolean teste = true;					//boleano para saber quando parar o programa
	    	while(teste){							// enquanto teste for true o programa executa em um laço
	        System.out.println("Digite 1 se deseja realizar outra media e 0 se deseja encerrar");
	        int r = med.nextInt();
	        
	        if(r==1){								//se 1 ele repete o metodo da media
	            a.acao();
	        }if(r==0) {								//se 0 ele para o programa transformando o boleano em false
	            System.out.println("Programa encerrado");
	            teste = false;
	        }else System.out.println("Opção invalida!");	//se for diferente de 0 ou 1 ele da uma mensagem de erro
	    }
	}
}

         
        
                
                
               
        
        
       
