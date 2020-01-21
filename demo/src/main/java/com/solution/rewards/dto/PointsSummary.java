package com.solution.rewards.dto;

import java.util.Map;

import lombok.Data;

@Data
public class PointsSummary {
	@SuppressWarnings("unused")
	private Map<String,Integer> monthlyRewards;
	@SuppressWarnings("unused")
	private Integer totalRewards;
	
	public Map<String, Integer> getMonthlyRewards() {
		return monthlyRewards;
	}
	public void setMonthlyRewards(Map<String, Integer> monthlyRewards) {
		this.monthlyRewards = monthlyRewards;
	}
	public Integer getTotalRewards() {
		return totalRewards;
	}
	public void setTotalRewards(Integer totalRewards) {
		this.totalRewards = totalRewards;
	}

	
}
