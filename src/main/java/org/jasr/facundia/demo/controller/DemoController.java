package org.jasr.facundia.demo.controller;

import java.util.List;

import org.jasr.facundia.Facundia;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	Facundia facundia  = new Facundia();
	
	@RequestMapping(path = "cardinal")
	public @ResponseBody String cardinal(String number) {
		return facundia.cardinal(number);
	}
	
	@RequestMapping(path = "plural")
	public @ResponseBody String plural(String word) {
		return facundia.inflectWord(word);
	}
	
	@RequestMapping(path = "syllabicate")
	public @ResponseBody List<String> syllabicate(String word) {
		return facundia.syllabicate(word);
	}
	
	@RequestMapping(path = "conjugate")
	public @ResponseBody String[] conjugate(String infinitive) {
		return facundia.conjugate(infinitive);
	}
}
