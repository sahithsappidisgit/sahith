package com.solution.rewards.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.solution.rewards.dto.Transaction;
import com.solution.rewards.service.RewardsService;
import com.solution.rewards.service.RewardsServiceImpl;

@RestController("/calculate")
public class RewardsController {

	@PostMapping("/rewards")
	public ResponseEntity<?> calculatePoints(@RequestBody List<Transaction> transactions) {

		if (transactions == null || transactions.isEmpty()) {
			RewardsService rewardsService = new RewardsServiceImpl();
			return ResponseEntity.status(HttpStatus.OK).body(rewardsService.calculatePoints(transactions));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("transactions null or empty");
	}
}
