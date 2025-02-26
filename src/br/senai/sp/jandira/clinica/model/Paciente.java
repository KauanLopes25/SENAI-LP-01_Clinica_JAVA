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
	private double imc;
	
	public void setName(String name) {
		if (name.trim().length() > 3) {
			this.name = name.toUpperCase();
		} else {
			System.out.println("O nome "+name+ ", não é válido!\nO nome deve conter pelo menos 3 caracteres!");
		}
	}
	public void setHeight(double height) {
		if (height >= 0) {
			this.height = height;
		} else {
			System.out.println("Altura do(a) paciente "+name+"\ndeve ser um valor maior ou igual a zero");
		}
	}
	
	public void calcularIdade() {
		
	}
	//Assim o calculo é realizado mas não retorna
	//public void calcularImc() {
		//imc = weight/ Math.pow(height, 2);
	//}
	
	private double calcularImc() {
		imc = weight/ Math.pow(height, 2);
		return imc;
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
		System.out.println("IMC:" + String.format("%.1f",calcularImc()));
		System.out.println("Telefone:" + phone);
		System.out.println("==================");
		
	}
	
	
}
