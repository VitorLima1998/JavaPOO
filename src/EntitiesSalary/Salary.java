package EntitiesSalary;import jdk.jfr.Percentage;

public class Salary {
	
	public String name;
	public double grossSalary;
	public double tax;
	

	public double NetSalary() {
		return grossSalary - tax;
	}

	public double IncreaseSalary(double percentage) {
		return grossSalary * (percentage/100) + NetSalary();
	}
	
	
	public String toString () { 
		return name
				+ ", $ "
				+ String.format("%.2f", NetSalary());
	}
}