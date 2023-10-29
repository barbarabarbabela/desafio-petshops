package desafiopetshops;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static boolean validarData(String data) {	
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		formataData.setLenient(false);
		
		try {
			formataData.parse(data);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}	
		
	public static boolean validarDiaSemana(String data) throws ParseException {		
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();			
			
		Date dataDate = formataData.parse(data);
		cal.setTime(dataDate);			
		if ((cal.get(Calendar.DAY_OF_WEEK)) > 1 && (cal.get(Calendar.DAY_OF_WEEK) < 7) ) {
			return true;			
		} else {
			return false;
		}			
	}
	
	public static Petshops[] CreatePetshops(String data) throws ParseException{
		Petshops[] petshops = new Petshops[3];			
		petshops[0] = new Petshops(30, 45, "Chow Chawgas", 0.8);
        
        if (validarData(data)) {  	
    			
    		if(validarDiaSemana(data)) {
    			petshops[1] = new Petshops(15, 50, "Vai Rex", 1.7);
        		petshops[2] = new Petshops(20, 40, "Meu Canino Feliz", 2.0);

    		} else {
    			petshops[1] = new Petshops(15, 50, "Vai Rex", 1.7);
        		petshops[2] = new Petshops(20 * 1.2, 40 * 1.2, "Meu Canino Feliz", 2.0);
    				
    		}
    	}
        else {
        	System.out.println("Data inválida. Programa finalizado.");
        }
		return petshops;
	}
		
	public static void main(String[] args) throws ParseException { 
		
		double menorValor = Double.MAX_VALUE;
		String nomePetshop = "";

        Scanner inputData = new Scanner(System.in);
        System.out.println("Informe a quantidade de cães pequenos");
        int caesPequenos = inputData.nextInt();        
        System.out.println("Informe a quantidade de cães grandes");
        int caesGrandes = inputData.nextInt();     
        System.out.println("Informe a data desejada no formato dd/MM/YYYY: ");
        String dataString = inputData.next();     
        
 
        var petshops = CreatePetshops(dataString);
        
        for(var petShop : petshops) {
        	double valor = petShop.valorTotal(caesPequenos, caesGrandes, petShop.ValorCaoPequeno, petShop.ValorCaoGrande);
        	
        	if (valor < menorValor) {
        		menorValor = valor;
        		nomePetshop = petShop.Nome;
        	}
        	
        }
        System.out.println("O petshop com o melhor preço é o " + nomePetshop + " e o valor total será R$" + menorValor);
	}

}
