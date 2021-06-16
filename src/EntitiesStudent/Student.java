package EntitiesStudent;

public class Student {
	public String name;
	public double n1, n2, n3, soma;

	public double FinalGrade() {
		soma = n1 + n2 + n3;
		if (soma >= 60.0) {
			//System.out.println("FINAL GRADE= " + soma);
			System.out.println("PASS");
		} else {
			//System.out.println("FINAL GRADE= " + soma);
			System.out.println("FAILED");
			System.out.println("MISSING= " + (60 - soma) + " POINTS");
		}
		return soma;
	}
}