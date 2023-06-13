package com.devsuperior.desafio01;

import com.devsuperior.desafio01.entities.Order;
import com.devsuperior.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior.desafio01"})
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	public void run(String... args) throws Exception{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("informe o código do pedido: ");
		int code = sc.nextInt();

		System.out.print("informe o valor do pedido: ");
		double basic = sc.nextDouble();

		System.out.print("informe o Desconto do pedido: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.println("Pedido: " + order.getCode());
		System.out.println("Valor Total: " + orderService.total(order));


	}
}
