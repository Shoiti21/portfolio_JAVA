package br.com.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {
	@RequestMapping
	public String home() {
		return "home";
	}
	@RequestMapping("/projetos")
	public String projetos() {
		return "projetos";
	}
	@RequestMapping("/skills")
	public String skills() {
		return "skills";
	}
	@RequestMapping("/contatos")
	public String contatos() {
		return "contatos";
	}
}
