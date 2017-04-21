package com.kang.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kang.ssm.dao.CategoryDao;
import com.kang.ssm.entity.Category;
import com.kang.ssm.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
    @Autowired
    CategoryDao categoryDao;
     
    public List<Category> list(){
        return categoryDao.list();
    }
 
}
