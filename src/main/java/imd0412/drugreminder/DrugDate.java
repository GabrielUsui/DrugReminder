package imd0412.drugreminder;

import java.util.ArrayList;
import java.util.List;

/**
 * 	My own API for Date.	
 * 
 * @author julianabs, GabrielUsui
 *
 */
public class DrugDate 
{

	public DrugDate() 
	{
	
	}
	
	/**
	 * Metodo converte String no formato "dd/mm/aa hh:mm" em uma lista de inteiros.
	 *
	 * 
	 */
	
	
	public List<Integer> convertDate(String startTime)
	{
		String[] parts;
		List<Integer> result = new ArrayList<Integer>();
		
		try
		{
			parts = startTime.split(" ");
			
			if(parts.length == 2)
			{
				String data = parts[0];
				String hora = parts[1];
				
				String[] partData = data.split("/");
				String[] partHora = hora.split(":");
				
				if(partData.length == 3)
				{
					for(int i = 0; i < partData.length; i++)
					{
						
						result.add(Integer.parseInt(partData[i]));
					}
				}
				else {
					throw new IllegalArgumentException("Argumento inválido");
				}
				
				if(partHora.length == 2)
				{
					for(int i = 0; i < partHora.length; i++)
					{
						result.add(Integer.parseInt(partData[i]));
					}
				}
				else 
				{
					throw new IllegalArgumentException("Argumento inválido");
				}
			}
			else 
			{
				throw new IllegalArgumentException("Argumento inválido");
			}
			
		}
		catch(IllegalArgumentException e){
			System.out.println("Argumento inválido");
		}
		
		return result;
	}
}