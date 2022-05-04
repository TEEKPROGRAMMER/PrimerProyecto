package proyectoprogramacion;

import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		
		Scanner ing = new Scanner(System.in);
		int edh[];
		edh=new int[10];
		
		
		
		String u="nino",c="1234",u1,c1,nomap,prof;
		
		
		
		char gen='A';
		
		int con1,con2,con3=0,prom=0,ed=0,h,op=1;
		
		double sal,tot;
		boolean vgen=false,ved=false,vus=true;
		System.out.println("Nombres");nomap=ing.nextLine();
		while (!ved)
		{
			System.out.println("Edad");
			ed=ing.nextInt();
			if (ed<=70)
				ved=true;
			else
				System.out.println("Ingrese edad entre 1 y 70");
		}
		System.out.println("Profesión");
		ing.nextLine();prof=ing.nextLine();
		System.out.println("N�mero de hijos/hermanos");h=ing.nextInt();
		while(op!=4)
		{	
			System.out.println("Elija una opción");
			System.out.println("1. Ingresar al Sistema");
			System.out.println("2. Entrega de Bono");
			System.out.println("3. Promedio de edad");
			System.out.println("4. Salir");
			op=ing.nextInt();con1=1;
			switch (op)
			{
				case 1:
					if(vus)
					{
						while (con1<=3)
						{
							ing.nextLine();
							System.out.println("Usuario: ");u1=ing.nextLine();
							System.out.println("Contrase�a: ");c1=ing.nextLine();
							if (u1.equals(u) && c1.equals(c))
							{
								con1=4;vus=false;
								System.out.println("Bienvenido "+nomap+" al Sistema");
								System.out.println("Edad: "+ed+" a�os");
								System.out.println("Profesi�n: "+prof);
								System.out.println("N�mero de hijo/hermanos: "+h);
								
							}
							else
							{	
								System.out.println("Usuario y Clave Incorresta ("+con1+"/3)");
								con1++;
							}
						}
					
					break;
					}
					
					else
						System.out.println("Usuario ya ingres� al Sistema");
        		break;
        		
        	case 2:
        		if(!vus)
        		{
        			while(!vgen)
        			{
        				System.out.println("Entrega de Bono");
        				System.out.println("Ingrese G�nero (M/F)");
        				gen=ing.next().charAt(0);
        				if (gen=='F'||gen=='M'||gen=='f'||gen=='m')
        					vgen=true;
        				else
        					System.out.println("Ingrese (F)(M) or (f)(m)");
        			}	
        			System.out.println("Ingrese Salario Mensual");
        			sal=ing.nextDouble();		
        			if(ed>=20&&ed<=25&&(gen=='F'||gen=='f'))
        				tot=sal+sal*0.15;
        			else
        				tot=sal+sal*0.05;
        			if(ed>=26&&ed<=35)
        				tot=sal+sal*0.25;
        			if(ed>=36&&ed<=50)
        				tot=sal;
        			if(ed>=51&&ed<=70)
        				tot=sal+sal*0.30;
        			System.out.println("");
        			System.out.println("Nombres: "+nomap);
        			System.out.println("Edad: "+ed+" a�os");
        			System.out.println("Profesi�n: "+prof);
        			System.out.println("N�mero de hijo/hermanos: "+h);
        			System.out.println("Salario: "+tot);
        			System.out.println("Bono: "+tot);
        			System.out.println("Salario + Bono: "+tot);
        			vus=false;
        			break;
        		}
        		else
        			System.out.println("Ingrese al sistema mediante la opci�n 1");
        		break;
        		
        	
        	case 3:
        		if(!vus)
        		{	
        			System.out.println("Promedio de Edad");
        			for(con2=0;con2<h;con2++)
        			{
        				System.out.println("Ingrese edad de "+con2+" hijo/hermano");
        				edh[con2]=ing.nextInt();
        				prom=prom+edh[con2];
        				if(edh[con2]>5)
        					con3++;
        			}
        			prom=prom/h;
        			System.out.println("El promedio de edades de los hijos/hermanos es: "+prom);
        			System.out.println("N�mero de hijos/hermanos mayores de 5 a�os: "+con3);
        			vus=false;
        			break;
        		}
        		else
        			System.out.println("Ingrese al sistema mediante la opci�n 1");
        		break;
        	case 4:
        		System.out.println("Usted est� saliendo del Sistema");
        		break;
        	default:
        		System.out.println("Ingresar opci�n de 1 a 4");
        		break;
			}
		}
	}
}