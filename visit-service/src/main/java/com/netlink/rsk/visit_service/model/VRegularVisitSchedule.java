package com.netlink.rsk.visit_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name="VRegularVisitSchedule", catalog = "Visit")
public class VRegularVisitSchedule implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long scheduleid;

	private Long createdby;

	@CreatedDate
	private Date createdon;

	private Date scheduleddate;

	private int schoolallocationid;

	private int status;

	private Long updatedby;

	@LastModifiedDate
	private Date updatedon;
}