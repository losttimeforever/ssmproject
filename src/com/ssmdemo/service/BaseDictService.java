package com.ssmdemo.service;

import java.util.List;

import com.ssmdemo.pojo.BaseDict;

public interface BaseDictService {

	
	//查询
	public List<BaseDict> selectBaseDictListByCode(String code);
}
