package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java-poo")

public class JavaPooController {
	@GetMapping
	public String JavaPooController() {
	 return "estudos para melhor compreesão de programação orientada a objetos, com 30 minutos de estudos de segunda à sabado";
}}
