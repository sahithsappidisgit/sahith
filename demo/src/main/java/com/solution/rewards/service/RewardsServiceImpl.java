package com.solution.rewards.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.solution.rewards.dto.PointsSummary;
import com.solution.rewards.dto.Transaction;

public class RewardsServiceImpl implements RewardsService {

	@Override
	public PointsSummary calculatePoints(List<Transaction> transactions) {

		Map<String, Integer> monthlyPoints = new HashMap<>();
		Integer totalPoints = 0;

		for (Transaction transaction : transactions) {
			Integer points = 0;
			for (Integer value : transaction.getTransactionValueList()) {
				points = points + calculatePointsPerTransaction(value);
			}
			totalPoints = totalPoints + points;
			monthlyPoints.put(transaction.getMonth(), points);
		}

		PointsSummary pointsSummary = new PointsSummary();
		pointsSummary.setMonthlyRewards(monthlyPoints);
		pointsSummary.setTotalRewards(totalPoints);

		return pointsSummary;
	}

	public Integer calculatePointsPerTransaction(Integer transactionValue) {
		Integer points = 0;
		if (transactionValue >= 50 && transactionValue <= 100) {
			points = transactionValue;
		}
		if (transactionValue >= 100) {
			points = transactionValue * 2;
		}
		return points;
	}

}
