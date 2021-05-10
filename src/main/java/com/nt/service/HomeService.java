package com.nt.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.StudentEntity;
import com.nt.entity.TimeSheet;
import com.nt.repository.HomeReposetory;

@Service
@Transactional
public class HomeService {

	@Autowired
	private HomeReposetory homeReposetory;
	
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<StudentEntity> getAllDataInDataBade() {
		
		return this.homeReposetory.findAll();
	}



	public StudentEntity postData(StudentEntity studentEntity) {
		entityManager.persist(studentEntity);
		return studentEntity;
	}



	public TimeSheet getUpdateTinmeSheet(TimeSheet timeSheet , int timeSheetId) {
	
		TimeSheet entity = entityManager.find(TimeSheet.class, timeSheetId);
		if (entity != null) {
			entity.setTimeSheetId(timeSheetId);
			return entityManager.merge(timeSheet);
		} else {
			return null;
		}
//		
//		String updatedata=null;
//		
//		
//		int courceId = timeSheet.getCourceId();
//		int studId = timeSheet.getStudId();
//		float timeSheetHours = timeSheet.getTimeSheetHours();
//		int timeSheetId = timeSheet.getTimeSheetId();
//		float timeSheetPandingHours = timeSheet.getTimeSheetPandingHours();
//		
//		if(timeSheetId==id)
//		{
//		Query createQuery = entityManager.createNativeQuery(" update time_Sheet set studId=:studId,timeSheetHours=:timeSheetHours, timeSheetPandingHours=:timeSheetPandingHours,courceId=:courceId where timeSheetId=:timeSheetId");
//		createQuery.setParameter("courceId",courceId);
//		createQuery.setParameter("studId",studId);
//		createQuery.setParameter("timeSheetHours",timeSheetHours);
//		createQuery.setParameter("timeSheetId",updatedata);
//		createQuery.setParameter("timeSheetPandingHours",timeSheetPandingHours);
//		 createQuery.executeUpdate();
//		 updatedata="Successfully Updated...";
//		}
//		else
//		{
//			updatedata="Panding Updated...";
//		}
//		return updatedata;
//		
		
		
		
		
//	this.entityManager.persist(timeSheet);
//				return timeSheet;
	}



	public List<TimeSheet> getTimeShet() {
		
		return entityManager.createQuery("from TimeSheet").getResultList();
	}

}
