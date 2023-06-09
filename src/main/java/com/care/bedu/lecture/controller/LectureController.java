package com.care.bedu.lecture.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.care.bedu.lecture.dto.LectureDetailDto;
import com.care.bedu.lecture.dto.LectureDto;
import com.care.bedu.lecture.service.LectureService;

@RestController
@RequestMapping("/api")
public class LectureController {
	
	@Autowired
	private LectureService service;
	
	@RequestMapping("/lectureList")
	public HashMap<String, ArrayList<LectureDto>> getLectureList(String category, int page){
		ArrayList<LectureDto> list = new ArrayList<>();
		HashMap<String, ArrayList<LectureDto>> map = new HashMap<>();
		
		list = service.getLectureList(category, page);
		
		map.put("item", list);
		return map;
		
	}
	
	@RequestMapping("/lectureDetail")
	public LectureDto getLectureDetail(int num) {
		LectureDto dto = new LectureDto();
		
		dto = service.getLectureDetail(num);
		
		return dto;
	}
	
	@RequestMapping("/getLectureField")
	public HashMap<String,ArrayList<LectureDto>> getLectureField(){
		HashMap<String,ArrayList<LectureDto>> map = new HashMap<>();
		map = service.getLectureField();
		return map;
	}
	
	@RequestMapping("/getVideoList")
	public ArrayList<LectureDetailDto> getVideoList(int num){
		ArrayList<LectureDetailDto> list = new ArrayList<>();
		
		list = service.getVideoList(num);
		
		return list;
	}
	

}
