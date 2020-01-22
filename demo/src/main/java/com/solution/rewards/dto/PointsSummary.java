package com.solution.rewards.dto;

import java.util.Map;

public class PointsSummary {
	private Map<String, Integer> monthlyRewards;
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

	@Override
	public String toString() {
		return "PointsSummary [monthlyRewards=" + monthlyRewards + ", totalRewards=" + totalRewards + "]";
	}
}
