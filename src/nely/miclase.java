package nely;

import java.util.Scanner;

public class miclase
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		Scanner mi_Scanner=new Scanner(System.in);
//		
//		for(int i=0 ; i < 5 ; i++)
//		{
//			int x= mi_Scanner.nextInt();	
//			if (x==10) 
//			{
//				System.out.print("Es igual a 10");
//			}
//			else
//			{
//				System.out.print("Es diferente a 10");
//			}
//		}
		Scanner mi_Scanner=new Scanner(System.in);

		for(int i=0 ; i<3 ; i=i+1)
		{
			System.out.print("ingrese nota");
			int nota = mi_Scanner.nextInt();
			if (nota >=90)
			{
				System.out.print("exelencia");
			}
			else if (nota >=80)
			{
				System.out.print("sobresaliente");
			}
			else if (nota>=60)
			{
				System.out.print("aprobado");
			}else
			{
				System.out.print("reprobado");
			}
		}		
	}
}
