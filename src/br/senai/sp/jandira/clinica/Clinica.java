package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		System.out.println("Hello World");
		//Creating a object pacient
		Paciente p1 = new Paciente();
		p1.name = "Ana Maria";
		p1.height = 1.65;
		p1.weight = 55;
		p1.phone = "(11)99999-8888";
		p1.birthDate = LocalDate.of(2003, 07, 15);
		
		Paciente p2 = new Paciente();
		p2.name = "Kauan";
		p2.birthDate = LocalDate.of(2002, 12, 02);
		p2.height = 1.75;
		p2.weight = 68;
		p2.phone = "(11)92513-2925";
		
		//Exibindo a referência dos objetos
		System.out.println(p1);
		System.out.println(p2);
		
		Paciente p3 = p1;
		
		System.out.println(p3);
		
		//Exibindo os dados dos objetos
		System.out.println(p1.name);
		System.out.println(p1.phone);
		
		System.out.println(p2.name);
		System.out.println(p2.phone);
		
		p1.mostrarFichaDoPaciente();
	}
}
