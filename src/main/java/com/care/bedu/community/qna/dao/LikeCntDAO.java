package com.care.bedu.community.qna.dao;

import org.apache.ibatis.annotations.Mapper;

import com.care.bedu.community.qna.vo.LikeCntVO;

@Mapper
public interface LikeCntDAO {
	
	public int likeCntSave(LikeCntVO likeCntVO);
	public String getlike(int qsNum, String userId);
}
