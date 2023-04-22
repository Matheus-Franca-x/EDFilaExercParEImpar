package view;

import controller.ControllerParEImpar;

public class Main {

	public static void main(String[] args) 
	{
		
		int[] vet = {75, 315, 481, 200, 557, 74, 245, 222, 269, 82, 469, 448, 584, 163, 186, 539, 389};
		ControllerParEImpar controll = new ControllerParEImpar();
		
		controll.preparaPilha(vet);
		
		controll.organizaParEImpar();
		
		controll.contaFila();
	}
	//aaaa
}
