package com.solution.rewards.service;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.solution.rewards.dto.PointsSummary;
import static org.junit.Assert.*;

class RewardServiceImplTest {

	
	@Test
	public void calculatePoints() {
		
		Map<String, Integer> request = new HashMap<String, Integer> ();
		request.put("January",110);
		request.put("February", 90);

		RewardsServiceImpl rewardsServiceImpl = new RewardsServiceImpl();
		PointsSummary result = rewardsServiceImpl.calculatePoints(request);
		System.out.println(result);
		
		assertNotNull(result);
	}

}

