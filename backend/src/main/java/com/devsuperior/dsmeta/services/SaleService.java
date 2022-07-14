package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;

	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
//hora do sistema do pc ou usuario Zone Id indica o fuso horario ou seja criar uma data com o dia de hoje
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate); // Usando expressão condicional alternaria diminuindo -365 dias
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate); // Usando expressão condicional alternaria
		
		return repository.findSales(min, max, pageable);
	}
}
