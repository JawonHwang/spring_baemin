package com.baemin.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TOTAL_FEES")
public class TotalFee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TOTAL_FEE_ID")
	private Long totalFeeId;

	@Column(name = "TOTAL_FEE_YEAR")
	private int totalFeeYear;
	
	@Column(name = "TOTAL_FEE_SEM")
	private int totalFeeSem;
	
	@Column(name = "TOTAL_INCOME")
	private Long totalFeeIncome;
	
	@Column(name = "TOTAL_EXPEND")
	private Long totalFeeExpend;
	
	@Column(name = "PREDICT_FEE")
	private Long predictFee;

	public TotalFee() {
		super();
	}

	public TotalFee(Long totalFeeId, int totalFeeYear, int totalFeeSem, Long totalFeeIncome, Long totalFeeExpend,
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
