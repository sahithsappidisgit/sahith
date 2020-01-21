package com.solution.rewards.service;

import java.util.Map;

import com.solution.rewards.dto.PointsSummary;

public interface RewardsService {
	
	public PointsSummary calculatePoints(Map<String,Integer> transactions); 

}
