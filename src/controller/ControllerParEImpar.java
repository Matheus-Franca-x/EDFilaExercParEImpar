package controller;

import controllerFila.FilaInt;
import libPilhaInt.PilhaInt;

public class ControllerParEImpar 
{
	PilhaInt pilha = new PilhaInt();
	FilaInt filaA = new FilaInt();
	FilaInt filaB = new FilaInt();
	
	public ControllerParEImpar()
	{
		super();
	}
	
	public void preparaPilha(int[] valor)
	{
		
		for(int array: valor)
		{
			pilha.push(array);
		}
	}
	
	public void organizaParEImpar()
	{
		
		while(!pilha.isEmpty())
		{
			try {
				int test = pilha.pop();
				if(test % 2 == 0)
				{
					filaA.insert(test);
				}
				else
				{
					filaB.insert(test);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void contaFila()
	{
		try {
			while(!filaA.filaVazia())
			{
					System.out.println(filaA.remove());
			}
			System.out.println();
			while(!filaB.filaVazia())
			{
				System.out.println(filaB.remove());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
