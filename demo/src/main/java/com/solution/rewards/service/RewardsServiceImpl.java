package com.solution.rewards.service;

import java.util.HashMap;
import java.util.Map;

import com.solution.rewards.dto.PointsSummary;

public class RewardsServiceImpl implements RewardsService {

	@Override
	public PointsSummary calculatePoints(Map<String, Integer> transactions) {
		
		Map<String,Integer> monthlyPoints = new HashMap<>();
		Integer totalPoints = 0;
		for (Map.Entry<String,Integer> entry : transactions.entrySet()) {
			 System.out.println("Key = " + entry.getKey() + 
                     ", Value = " + entry.getValue());
			 if(monthlyPoints.containsKey(entry.getKey())) {
				Integer points= calculatePointsPerTransaction(entry.getValue());
				points=points + monthlyPoints.get(entry.getKey());
				monthlyPoints.put(entry.getKey(),points);
			 }
			 else {
				 monthlyPoints.put(entry.getKey(),calculatePointsPerTransaction(entry.getValue()));
			 }
			 totalPoints = totalPoints + entry.getValue();
		 }
		PointsSummary  pointsSummary= new PointsSummary();
		pointsSummary.setMonthlyRewards(monthlyPoints);
		pointsSummary.setTotalRewards(0);       
		 
		return pointsSummary;
	}
	
	public Integer calculatePointsPerTransaction(Integer transactionValue) {
		Integer points = 0;
		if(transactionValue >= 50 && transactionValue <= 100) {
			points = transactionValue;
		}
		if(transactionValue >= 100) {
			points = transactionValue * 2;
		}
		return points;
	}

}
