package com.example.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CalculatePoints;
import com.example.service.CalculatePointsServiceImpl;

@RestController("/service")
public class Controller {

	@RequestMapping("/calculate")
	public PointSummary calculatePoints(Map<String,Integer> transactions) {
		
		CalculatePoints calculatePoints = new CalculatePointsServiceImpl();
		Map<String, String> result = calculatePoints.calculate(transactions);
		return result;
	}
}
