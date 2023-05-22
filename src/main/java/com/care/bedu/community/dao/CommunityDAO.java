package com.care.bedu.community.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.care.bedu.community.dto.CommunityDTO;

@Mapper
public interface CommunityDAO {
	
	public ArrayList<CommunityDTO> viewlist(CommunityDTO communityDTO);
	public int viewwriter(CommunityDTO communityDTO);
	public CommunityDTO viewone(int num);
	public int viewdelete(int num);
	public int viewupdate(CommunityDTO communityDTO);
//	public String viewsearch(CommunityDTO communityDTO);

}