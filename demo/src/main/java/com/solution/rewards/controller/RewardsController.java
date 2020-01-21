package com.solution.rewards.controller;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solution.rewards.service.RewardsService;
import com.solution.rewards.service.RewardsServiceImpl;

@RestController
public class RewardsController {

	@RequestMapping("/calculate")
	public ResponseEntity<?> calculatePoints(Map<String,Integer> transactions) {
		
		if (transactions == null || transactions.isEmpty()) {
			RewardsService rewardsService = new RewardsServiceImpl();
			return ResponseEntity.status(HttpStatus.OK).body(rewardsService.calculatePoints(transactions));
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("transactions null or empty");
	}
}
