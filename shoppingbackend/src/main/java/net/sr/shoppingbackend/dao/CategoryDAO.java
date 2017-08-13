package net.sr.shoppingbackend.dao;

import java.util.List;

import net.srj.shoppingbackend.dto.Category;

public interface CategoryDAO 
{
	List<Category> list(); 
	
	Category get(int id);
}
