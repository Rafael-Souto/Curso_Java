package ex06iniciante;

import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre: 
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. 
b) a �rea do c�rculo de raio C. (pi = 3.14159) 
c) a �rea do trap�zio que tem A e B por bases e C por altura. 
d) a �rea do quadrado que tem lado B. 
e) a �rea do ret�ngulo que tem lados A e B. */
public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		double triangulo = A * C / 2;
		double circulo = pi * C * C;
		double trapezio = (A + B) * C / 2;
		double quadrado = B * B;
		double retangulo = A * B;
		
		System.out.printf("Tri�ngulo: %.3f\n", triangulo);
		System.out.printf("C�rculo: %.3f\n", circulo);
		System.out.printf("Trap�zio: %.3f\n", trapezio);
		System.out.printf("Quadrado: %.3f\n", quadrado);
		System.out.printf("Ret�ngulo: %.3f\n", retangulo);
		
		sc.close();
	}
}