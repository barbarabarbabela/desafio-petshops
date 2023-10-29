package desafiopetshops;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Principal {

	public static Date validarData(String data) throws Exception {	
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		formataData.setLenient(false);
		
		try {			
			return formataData.parse(data);
		} catch (Exception e) {
			throw new Exception("Data inválida. Programa finalizado.");
		}
	}	
		
	public static boolean validarDiaSemana(Date data) {		
		Calendar cal = Calendar.getInstance();		

		cal.setTime(data);			
		if ((cal.get(Calendar.DAY_OF_WEEK)) > 1 && (cal.get(Calendar.DAY_OF_WEEK) < 7) ) {
			return true;			
		} else {
			return false;
		}			
	}
	
	public static List<Petshops> CreatePetshops(String data) throws Exception{
		
		List<Petshops> petshops = new ArrayList<Petshops>();
		
		petshops.add(new Petshops(30, 45, "Chow Chawgas", 0.8));
    			
    		if(validarDiaSemana(validarData(data))) {
    			petshops.add(new Petshops(15, 50, "Vai Rex", 1.7));
        		petshops.add(new Petshops(20, 40, "Meu Canino Feliz", 2.0));

    		} else {
    			petshops.add(new Petshops(15, 50, "Vai Rex", 1.7));
        		petshops.add( new Petshops(20 * 1.2, 40 * 1.2, "Meu Canino Feliz", 2.0));    				
    		}

		return petshops;
	}
		
	public static void main(String[] args) throws Exception { 
		
		double menorValor = Double.MAX_VALUE;
		String nomePetshop = "";

        Scanner inputData = new Scanner(System.in);
        System.out.println("Olá. \nEsse programa escolhe o petshop mais barato, considerando o dia da semana e a quantidade de cães pequenos e cães grandes que você digitar. \nCaso haja empate nos valores, o critério de desempate será a distância.");
        System.out.println("Para começar, informe a quantidade de cães pequenos:");
        int caesPequenos = inputData.nextInt();        
        System.out.println("Informe a quantidade de cães grandes:");
        int caesGrandes = inputData.nextInt();     
        System.out.println("Informe a data desejada no formato dd/MM/aaaa: ");
        String dataString = inputData.next();     

 
        var petshops = CreatePetshops(dataString);
        
        for(var petShop : petshops) {
        	double valor = petShop.valorTotal(caesPequenos, caesGrandes, petShop.ValorCaoPequeno, petShop.ValorCaoGrande);
            System.out.println("Petshop " + petShop.Nome + " - " + "Valor: " + valor);

        	if (valor < menorValor) {
        		menorValor = valor;
        		nomePetshop = petShop.Nome;
        	}
        	
        }
        System.out.println("\nO petshop com o melhor custo benefício é o " + nomePetshop + " e o valor total será R$" + menorValor);
        
        inputData.next();
        inputData.close();
	}
}
