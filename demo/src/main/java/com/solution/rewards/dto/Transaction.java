package com.solution.rewards.dto;

import java.util.List;

public class Transaction {

	private List<Integer> transactionValueList;

	private String month;

	public List<Integer> getTransactionValueList() {
		return transactionValueList;
	}

	public void setTransactionValueList(List<Integer> transactionValueList) {
		this.transactionValueList = transactionValueList;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Transaction [transactionValueList=" + transactionValueList + ", month=" + month + "]";
	}
}
