package entities;

public class TaxPayer {
	
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healtSpending;
	private double educationSpending;
	
	public TaxPayer() {
		
	}
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healtSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healtSpending = healtSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealtSpending() {
		return healtSpending;
	}

	public void setHealtSpending(double healtSpending) {
		this.healtSpending = healtSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double salario = this.salaryIncome / 12.0;
		double pImposto = 0 ;
		double irSalario =0 ;
		
		if (salario < 3000.0) {
			pImposto = 0;
		}else if(salario < 5000.0) {
			pImposto = 10;
		}else {
			pImposto = 20;
		}
		irSalario = this.salaryIncome * pImposto / 100;
		return irSalario;
	}
	
	public double servicesTax() {
		double irServicos = this.servicesIncome * 0.15;
		return irServicos;
	}
	
	public double capitalTax() {
		double irCapital = this.capitalIncome * 0.20;
		return irCapital;
	}
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public double taxRebate() {
		double deducoes = this.healtSpending + this.educationSpending;
		double maximoDedutivel =  this.grossTax() * 0.30;
		double abatimentos = 0;
		if(deducoes < maximoDedutivel) {
			abatimentos = deducoes;
		}else {
			abatimentos = maximoDedutivel;
		}
		return abatimentos;
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
}
