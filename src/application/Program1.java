package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		// Integer pos = position(list, idsalary); // VER ABAIXO A O ENTENDIMENTO DESSA
		// FUN��O
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent); // ACESSAR NA LISTA A POSI��O DO FUNCIONARIO QUE ACESSA O FUNCIONARIO
											// NA POSI��O POS QUE AUMENTA O SAL�RIO DELE
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee e : list) {
			System.out.println(e);
		}
		sc.close();

	}

	// Essa � a parte mais dif�cil de entender
	/*
	 * O professor criou uma fun��o auxiliar paraa encontrar a posi��o do elemento
	 * na lista
	 */
	public static Integer position(List<Employee> list, int id) { // recebe a lista de funcionario e um ID para retornar
																	// a posi��o do funcionario na lista
		for (int i = 0; i < list.size(); i++) { //
			if (list.get(i).getId() == id) { // se o elemento da posi��o i de ID for igual a iD, ent�o a posi��o dele �
												// i
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
