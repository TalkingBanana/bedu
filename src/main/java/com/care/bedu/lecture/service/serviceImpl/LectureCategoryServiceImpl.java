package com.care.bedu.lecture.service.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.bedu.lecture.dao.LectureCategoryDAO;
import com.care.bedu.lecture.service.LectureCategoryService;
import com.care.bedu.lecture.vo.LectureCategoriesVO;

@Service
public class LectureCategoryServiceImpl implements LectureCategoryService{

    @Autowired
    LectureCategoryDAO dao;

    @Override
    public ArrayList<LectureCategoriesVO> getCategory() {
        ArrayList<LectureCategoriesVO> list = new ArrayList<>();
        list = dao.getCategories();
        return list;
    }

    @Override
    public ArrayList<LectureCategoriesVO> getTop() {
        ArrayList<LectureCategoriesVO> tops = new ArrayList<>();

        tops = dao.getTop();

        return tops;
    }
    
}