package people;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> listPersons = new ArrayList<>();
		
		System.out.print("Enter the number of taxpayers: ");
		int numberTaxpayers = sc.nextInt();

		for (int i = 0; i < numberTaxpayers; i++) {
			System.out.println("Taxpayer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char typePerson = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if(typePerson == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				listPersons.add(new Individual(anualIncome ,name ,healthExpenditures));
			}
			if(typePerson == 'c') {
				System.out.print("Number of employees: ");
				double numberEmployees = sc.nextDouble();
				listPersons.add(new Individual(anualIncome ,name ,numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Person person : listPersons) {
			System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
		}
		
		System.out.println();
		double sum = 0.0;
		for (Person person : listPersons) {
			sum += person.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}
}
