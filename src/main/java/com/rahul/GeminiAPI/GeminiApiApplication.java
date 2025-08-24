package com.rahul.GeminiAPI;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class GeminiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeminiApiApplication.class, args);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the prompt : ");
//		String prompt = sc.next();
//
//
//		Client client = new Client();
//
//		GenerateContentResponse response =
//				client.models.generateContent(
//						"gemini-2.5-flash",
//						prompt,
//						null);
//
//		System.out.println(response.text());
	}

}
