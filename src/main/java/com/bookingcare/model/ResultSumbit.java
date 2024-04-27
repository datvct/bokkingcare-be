package com.bookingcare.model;

import java.io.Serializable;

public class ResultSumbit implements Serializable {
	private int totalScore;
	private String depressionLevel;

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public String getDepressionLevel() {
		return depressionLevel;
	}

	public void setDepressionLevel(String depressionLevel) {
		this.depressionLevel = depressionLevel;
	}

	public ResultSumbit(int totalScore, String depressionLevel) {
		super();
		this.totalScore = totalScore;
		this.depressionLevel = depressionLevel;
	}

	public ResultSumbit() {
		super();
		// TODO Auto-generated constructor stub
	}

}
