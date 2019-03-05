package io.javabrains.springbootstarter.topic;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TopicSpRepository {
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Topic> getTopicsfromsp(){
		return em.createStoredProcedureQuery("get_topic_tbl").getResultList();
	}
}
