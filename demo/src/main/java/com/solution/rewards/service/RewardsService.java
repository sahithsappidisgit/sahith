package com.solution.rewards.service;

import java.util.List;

import com.solution.rewards.dto.PointsSummary;
import com.solution.rewards.dto.Transaction;

public interface RewardsService {

	public PointsSummary calculatePoints(List<Transaction> transactions);

}
