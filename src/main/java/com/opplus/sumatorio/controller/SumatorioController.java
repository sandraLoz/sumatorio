package com.opplus.sumatorio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Sumatorio API")
@RestController
public class SumatorioController {
	
	@GetMapping(path = "/")
	@Operation(summary = "Sumatorio", tags = "Sumatorio")
	public String greeting(@RequestParam(value = "sumando1", defaultValue = "0") Long sumando1, @RequestParam(value = "sumando2", defaultValue = "0") Long sumando2) {
		return String.format("Resultado de la operación %s + %s = %s", sumando1, sumando2, sumando1+sumando2);
	}

}
