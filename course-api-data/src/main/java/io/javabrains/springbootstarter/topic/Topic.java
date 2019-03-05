package io.javabrains.springbootstarter.topic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;


@Entity
@Table(name = "topic_tbl")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "get_topic_tbl", procedureName = "get_topic_tbl", parameters = {
			@StoredProcedureParameter(mode = ParameterMode.IN, name = "ID", type = String.class),
			@StoredProcedureParameter(mode = ParameterMode.OUT,  type = Topic.class)
			 })
		})
public class Topic {

	@Id
	private String id;
	@Column
	private String name;
	@Column
	private String description;
	
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
