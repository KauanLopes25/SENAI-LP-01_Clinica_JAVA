/*
 * PROGRAMADOR: Kauan Lopes
 * Data: 26/02/2025
 * Local: SENAI
 */

package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	private String name;
	public LocalDate birthDate;
	public int weight;
	private double height;
	public String phone;
	
	public void setName(String name) {
		if (name.trim().length() > 3) {
			this.name = name.toUpperCase();
		} else {
			System.out.println("O nome "+name+ ", não é válido!\nO nome deve conter pelo menos 3 caracteres!");
		}
	}
	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		} else {
			System.out.println("Altura inválida");
		}
	}
	
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
