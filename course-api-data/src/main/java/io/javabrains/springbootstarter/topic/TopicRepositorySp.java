package io.javabrains.springbootstarter.topic;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TopicRepositorySp {
	@Autowired
	private EntityManager em;
	
	
	public List<Topic> getTopicsfromsp(){
		return em.createStoredProcedureQuery("get_topic_tbl").getResultList();
	}
}
