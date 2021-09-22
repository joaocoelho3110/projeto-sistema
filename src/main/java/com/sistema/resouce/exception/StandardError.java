package com.sistema.resouce.exception;

public class StandardError {

	private Long timesTemp;
	private Integer status;
	private String error;

	public StandardError() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public StandardError(Long timesTemp, Integer status, String error) {
		super();
		this.timesTemp = timesTemp;
		this.status = status;
		this.error = error;
	}



	public Long getTimesTemp() {
		return timesTemp;
	}

	public void setTimesTemp(Long timesTemp) {
		this.timesTemp = timesTemp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
