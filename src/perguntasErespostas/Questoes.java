package perguntasErespostas;

//Autor: Andr� Henrique Sousa 

import java.util.Scanner;

public class Questoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Vamos testar seus conhecimentos de rock and roll");
		int perguntas = 0;
		int acertou = 0;
	    
		
		String resposta;

		 while(true) 
		    {
	            System.out.println("Deseja iniciar? digite s: ");
	            resposta = scan.next();
	            if (resposta.equals("s")) break;

	            System.out.println("Digite s para iniciar as perguntas: ");
	            resposta = scan.next();
	        }
		 
	        System.out.println("\nVamos iniciar as perguntas, boa sorte!");
	        
	        while(perguntas<4)
	        {
	        	
	        	System.out.println("1�) De que banda � a musica Love of my life?");
	        	System.out.println("\na) Kiss");
	        	System.out.println("b) Metallica");
	        	System.out.println("c) Iron Maiden");
	        	System.out.println("d) Queen");
	        	resposta = scan.next();
	        	if(resposta.equals("d")) acertou++ ;
	        	perguntas++;
	        	
	        	System.out.println("\n2�) De que banda � a musica Forever?");
	        	System.out.println("\na) Kiss");
	        	System.out.println("b) Metallica");
	        	System.out.println("c) Iron Maiden");
	        	System.out.println("d) Queen");
	        	resposta = scan.next();
	        	if(resposta.equals("a")) acertou++ ;
	        	perguntas++;
	        	
	        	System.out.println("\n3�) De que banda � a musica Number of the beast?");
	        	System.out.println("\na) Kiss");
	        	System.out.println("b) Metallica");
	        	System.out.println("c) Iron Maiden");
	        	System.out.println("d) Queen");
	        	resposta = scan.next();
	        	if(resposta.equals("c")) acertou++ ;
	        	perguntas++;
	        	
	        	System.out.println("\n4�) De que banda � a musica Nothing Else Matters?\n"
	        			+ "");
	        	System.out.println("\na) Kiss");
	        	System.out.println("b) Metallica");
	        	System.out.println("c) Iron Maiden");
	        	System.out.println("d) Queen");
	        	resposta = scan.next();
	        	if(resposta.equals("b")) acertou++ ;
	        	perguntas++;
	        	
	        		        	    
	        	
	        }
	        scan.close();
	        System.out.println("\nVoc� acertou: "+acertou+" resposta(s)");
	        if(acertou==4) 
	        {
	        	System.out.println("\nIncrivel!! Voc� sabe tudo sobre Rock!");
	        } else if(acertou==3) 
	        {
	        	System.out.println("\nMuito bem! Voc� sabe quase tudo Rock");
	        } else if(acertou<3) 
	        {
	        	System.out.println("\nVoc� precisa aprender mais sobre Rock and Roll");
	        }
	        
	        System.out.println("\n\nDesenvolvido por: Andr� Henrique Sousa");
	        	
	        }
	}


