package com.kang.ssm.dao;

import java.util.List;

import com.kang.ssm.entity.Category;

public interface CategoryDao {
	  
    public int add(Category category);  
        
    public void delete(int id);  
        
    public Category get(int id);  
      
    public int update(Category category);   
        
    public List<Category> list();
     
    public int count();  
     
}
