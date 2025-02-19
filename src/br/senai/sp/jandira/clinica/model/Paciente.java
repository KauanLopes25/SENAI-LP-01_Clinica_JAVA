package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	public String name;
	public LocalDate birthDate;
	public int weight;
	public double height;
	public String phone;
	
	public void calcularIdade() {
		
	}
	
	public void calcularImc() {
		
	}
	
	public void classificarImc() {
		
	}
	
	public void mostrarFichaDoPaciente() {
		System.out.println("==================");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("==================");
		System.out.println("Nome:" + name);
		System.out.println("Altura:" + height);
		System.out.println("Peso:" + weight);
		System.out.println("Telefone:" + phone);
		System.out.println("==================");
		
	}
	
	
}
