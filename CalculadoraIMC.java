/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.imc;

import java.util.Scanner;

public class CalculadoraIMC {
    
    private float estatura;
    private float peso;
    private float ims;
    private Scanner entrada;

    public CalculadoraIMC() {
        estatura = 0;
        peso = 0;
        ims = 0;
        entrada = new Scanner(System.in);
    }

    public void calcularIms() {
        System.out.print("Ingrese su peso (kg): ");
        while (!entrada.hasNextFloat()) {
            System.out.println("Por favor, ingrese un número válido para el peso.");
            entrada.next(); // Limpiar la entrada inválida
        }
        peso = entrada.nextFloat();

        System.out.print("Ingrese su estatura (m): ");
        while (!entrada.hasNextFloat()) {
            System.out.println("Por favor, ingrese un número válido para la estatura.");
            entrada.next(); // Limpiar la entrada inválida
        }
        estatura = entrada.nextFloat();

        if (estatura > 0) {
            ims = peso / (estatura * estatura);
            System.out.printf("Su IMC es: %.2f%n", ims);
            clasificarImc(ims);
        } else {
            System.out.println("La estatura debe ser mayor que cero.");
        }
    }

    private void clasificarImc(float ims) {
        if (ims < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (ims < 24.9) {
            System.out.println("Clasificación: Peso normal");
        } else if (ims < 29) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }
    }

    public static void main(String[] args) {
        CalculadoraIMC calculadora = new CalculadoraIMC();
        calculadora.calcularIms();
    }
}