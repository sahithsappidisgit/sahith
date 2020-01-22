package com.solution.rewards.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.solution.rewards.dto.PointsSummary;
import com.solution.rewards.dto.Transaction;

class RewardServiceImplTest {

	@Test
	public void calculatePoints() {

		RewardsServiceImpl rewardsServiceImpl = new RewardsServiceImpl();
		PointsSummary result = rewardsServiceImpl.calculatePoints(getRequest());
		System.out.println("Response :"+result);

		Integer totalRewards = 540;
		Integer januaryRewards = 280;
		Integer febRewards = 260;

		assertEquals(result.getTotalRewards(), totalRewards);
		assertEquals(result.getMonthlyRewards().get("January"), januaryRewards);
		assertEquals(result.getMonthlyRewards().get("February"), febRewards);
	}

	public List<Transaction> getRequest() {
		Transaction transaction1 = new Transaction();
		transaction1.setMonth("January");

		List<Integer> values1 = new ArrayList<>();
		values1.add(60);
		values1.add(110);

		transaction1.setTransactionValueList(values1);

		Transaction transaction2 = new Transaction();
		transaction2.setMonth("February");

		List<Integer> values2 = new ArrayList<>();
		values2.add(100);
		values2.add(60);

		transaction2.setTransactionValueList(values2);

		List<Transaction> transactions = new ArrayList<>();
		transactions.add(transaction1);
		transactions.add(transaction2);
		
		System.out.println("Request :" +transactions);

		
		return transactions;
	}

}
