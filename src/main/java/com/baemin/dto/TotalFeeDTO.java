package com.baemin.dto;

public class TotalFeeDTO {
	private Long totalFeeId;

	private int totalFeeYear;
	
	private int totalFeeSem;
	
	private Long totalFeeIncome;
	
	private Long totalFeeExpend;
	
	private Long predictFee;

	public TotalFeeDTO() {
		super();
	}

	public TotalFeeDTO(Long totalFeeId, int totalFeeYear, int totalFeeSem, Long totalFeeIncome, Long totalFeeExpend,
			Long predictFee) {
		super();
		this.totalFeeId = totalFeeId;
		this.totalFeeYear = totalFeeYear;
		this.totalFeeSem = totalFeeSem;
		this.totalFeeIncome = totalFeeIncome;
		this.totalFeeExpend = totalFeeExpend;
		this.predictFee = predictFee;
	}

	public Long getTotalFeeId() {
		return totalFeeId;
	}

	public void setTotalFeeId(Long totalFeeId) {
		this.totalFeeId = totalFeeId;
	}

	public int getTotalFeeYear() {
		return totalFeeYear;
	}

	public void setTotalFeeYear(int totalFeeYear) {
		this.totalFeeYear = totalFeeYear;
	}

	public int getTotalFeeSem() {
		return totalFeeSem;
	}

	public void setTotalFeeSem(int totalFeeSem) {
		this.totalFeeSem = totalFeeSem;
	}

	public Long getTotalFeeIncome() {
		return totalFeeIncome;
	}

	public void setTotalFeeIncome(Long totalFeeIncome) {
		this.totalFeeIncome = totalFeeIncome;
	}

	public Long getTotalFeeExpend() {
		return totalFeeExpend;
	}

	public void setTotalFeeExpend(Long totalFeeExpend) {
		this.totalFeeExpend = totalFeeExpend;
	}

	public Long getPredictFee() {
		return predictFee;
	}

	public void setPredictFee(Long predictFee) {
		this.predictFee = predictFee;
	}
}
