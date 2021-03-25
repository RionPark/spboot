package com.spboot.test.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer_info")
public class CustomerInfo {
	@Id
	@Column(name="cui_num")
	@SequenceGenerator(name = "seqCuiNum", sequenceName = "seq_cui_num", allocationSize = 1)
	@GeneratedValue(generator = "seqCuiNum", strategy = GenerationType.SEQUENCE)
	private Integer cuiNum;
	@Column(name="cui_name")
	private String cuiName;

	@Column(name="cui_id")
	private String cuiId;

	@Column(name="cui_pwd")
	private String cuiPwd;

}
