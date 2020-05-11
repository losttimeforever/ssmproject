package com.ssmdemo.mapper;

import java.util.List;

import com.ssmdemo.pojo.BaseDict;

public interface BaseDictDao {

	
	//查询
	public List<BaseDict> selectBaseDictListByCode(String code);
}
