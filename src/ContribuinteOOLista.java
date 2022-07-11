import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class ContribuinteOOLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer>list =  new ArrayList<>();
		
		System.out.print("Quantos Contribuintes você vai digiar? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Digite os dados do "+(i+1)+"º contribuinte");
			System.out.print("Renda anual com Salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com Serviços: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double healtSpending = sc.nextDouble();
			System.out.print("Gastos educaionais: ");
			double educationSpending = sc.nextDouble();
			
			TaxPayer  payer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healtSpending, educationSpending);
			list.add(payer);
		}
	    for(int i=0;i<n; i++) {
	    	System.out.println();
	    	System.out.println("Resumo os dados do "+(i+1)+"º contribuinte");
	    	System.out.printf("Imposto Bruto Total: %.2f%n",list.get(i).grossTax());
	    	System.out.printf("Abatimento.........: %.2f%n",list.get(i).taxRebate());
	    	System.out.printf("Imposto Devido.....: %.2f%n",list.get(i).netTax());
	    }
		sc.close();

	}

}
