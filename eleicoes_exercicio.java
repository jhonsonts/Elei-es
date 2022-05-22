package jojopose;
import java.util.Scanner;
public class eleicoes_exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner ler = new Scanner(System.in); // nosso Scanner que fara a leitura do codigo
		
				int vt, pt, pdt, pl, psdb, vnulo, vbranco; // nossas variaveis 
				int contPt=0, contPdt=0, contPl=0, contPsdb=0, contVnulo=0, contVbranco=0; // nossas variaveis
				int i=0; // nossas variaveis
				System.out.print("- 1 - (13) PT;\r\n" // interface que ira aparecer ao usuario, para imputar os dados 
						+ "- 2 - (12) PDT;\r\n"
						+ "- 3 - (22) PL;\r\n"
						+ "- 4 - (45) PSDB;\r\n"
						+ "- 5 - voto nulo;\r\n"
						+ "- 6 - voto em branco;\n");
				
				for (i = 0; i < 5; i++) { // nosso sistema de repeticao
					System.out.print("Selecione seu voto: "); // interface que ira aparecer ao usuario, para imputar os dados 
					vt = ler.nextInt();// fara a leitura d sting
					
					switch (vt) { // Nossa estrura de decisao
					case 1: // caso 1 
						System.out.println("(13) PT!"); // interface que ira aparecer ao usuario
						pt = contPt;
						contPt++; // contador
						break; // condicao de parada 
					case 2: // caso 2
						System.out.println("(12) PDT!"); // interface que ira aparecer ao usuario
						pdt = contPdt;
						contPdt++; // contador 
						break; // condicao de parada 
					case 3: // caso 3
						System.out.println("(22) PL!"); // interface que ira aparecer ao usuario
						pl = contPl;
						contPl++; // contador 
						break; // condicao de parada 
					case 4: // caso 4 
						System.out.println("(45) PSDB!"); // interface que ira aparecer ao usuario
						psdb = contPsdb;
						contPsdb++; // contador 
						break; // condicao de parada 
					case 5: // caso 5
						System.out.println("Voto Nulo!"); // interface que ira aparecer ao usuario
						vnulo = contVnulo;
						contVnulo++; // contador 
						break; // condicao de parada 
					case 6: // caso 6
						System.out.println("Voto em Branco!"); // interface que ira aparecer ao usuario
						vbranco = contVbranco;
						contVbranco++; // contador 
						break; // condicao de parada 
					default: 
						System.out.println(" Voto invalido!!!");
						break;
					}
				}

				pt = contPt; // contador 
				pdt = contPdt; // contador 
				pl = contPl; // contador 
				psdb = contPsdb; // contador 
				vnulo= contVnulo; // contador 
				vbranco = contVbranco; // contador 
				
				System.out.printf("Candidatos Votos: PT: %d\n",+pt); // interface que ira aparecer ao usuario
				System.out.printf("PDT: %d\n",+pdt); // interface que ira aparecer ao usuario
				System.out.printf("PL: %d\n",+pdt); // interface que ira aparecer ao usuario
				System.out.printf("PSDB: %d\n",+pdt); // interface que ira aparecer ao usuario
				System.out.printf("Voto Nulo: %d\n",+vnulo); // interface que ira aparecer ao usuario
				System.out.printf("Voto em Branco :%d\n",+pdt); // interface que ira aparecer ao usuario
				
			}

		}