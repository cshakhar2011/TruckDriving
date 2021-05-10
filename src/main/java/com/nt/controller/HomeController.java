package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.StudentEntity;
import com.nt.entity.TimeSheet;
import com.nt.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	
	// Show All Data from Database 
	
	@GetMapping("/students")
	public List<StudentEntity> getAllData()
	{
		return this.homeService.getAllDataInDataBade();
	}
	
	
	//Save Data in the Database from Post Data
	
	@PostMapping("/students")
	public StudentEntity postDataIn(@RequestBody StudentEntity studentEntity)
	{
		return this.homeService.postData(studentEntity);
	}
	
	//API To create Time Sheet
	
	
	@PostMapping("times/students/{id}")
	public TimeSheet updateTimeSheet(@RequestBody TimeSheet timeSheet ,@RequestParam(name="id") int timeSheetId)
	{
		return this.homeService.getUpdateTinmeSheet(timeSheet,timeSheetId);
				
		
	}
	@GetMapping("times/students")
	public List<TimeSheet> getTimeSheet()
	{
		return this.homeService.getTimeShet();
	}
	
	
}
