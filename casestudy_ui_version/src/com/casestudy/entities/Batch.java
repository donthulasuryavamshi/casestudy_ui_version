package com.casestudy.entities;

import java.sql.Date;

public class Batch {
	private String batch_id;
	private String batch_name;
	private int batch_capacity;
	private String batch_mentor_id;
	private String batch_start_id;
	private Date batch_start_date;
	private Date batch_end_date;
	public String getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(String batch_id) {
		this.batch_id = batch_id;
	}
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public int getBatch_capacity() {
		return batch_capacity;
	}
	public void setBatch_capacity(int batch_capacity) {
		this.batch_capacity = batch_capacity;
	}
	public String getBatch_mentor_id() {
		return batch_mentor_id;
	}
	public void setBatch_mentor_id(String batch_mentor_id) {
		this.batch_mentor_id = batch_mentor_id;
	}
	public String getBatch_start_id() {
		return batch_start_id;
	}
	public void setBatch_start_id(String batch_start_id) {
		this.batch_start_id = batch_start_id;
	}
	public Date getBatch_start_date() {
		return batch_start_date;
	}
	public void setBatch_start_date(Date batch_start_date) {
		this.batch_start_date = batch_start_date;
	}
	public Date getBatch_end_date() {
		return batch_end_date;
	}
	public void setBatch_end_date(Date batch_end_date) {
		this.batch_end_date = batch_end_date;
	}
	
}
