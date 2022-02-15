// EXAMPLE OF HOW TO CHANGE WORDS IN A LINE. JAVA LENGUAGE BY DANI95RICO

import java.util.*;
public class CambioPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String palabraBuscar;
		String palabraSustituye;
		String frase;
		boolean salir=false;
		int cuenta=0;
		
		System.out.print("Escriba palabra a buscar: ");
		palabraBuscar=sc.nextLine();
		System.out.print("Escriba palabra por la que se sustituye: ");
		palabraSustituye=sc.nextLine();
		System.out.println("Ahora escriba líneas de texto. El programa acabará cuando no haya nada escrito y pulse intro.");

		while(!salir)
		{
			System.out.print("\nEscriba una línea de texto: ");
			frase=sc.nextLine();
			if(frase.isEmpty())
			{
				salir=true;
			}else
			{
				if(frase.contains(palabraBuscar))
				{
					System.out.println(frase.replace(palabraBuscar, palabraSustituye));
					cuenta++;
				}
			}
		}
		System.out.println("Fin del programa. Se han leido "+cuenta+" líneas en las que aparecia la palabra "+palabraBuscar+".");
		sc.close();
	}
