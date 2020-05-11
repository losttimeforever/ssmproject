package com.ssmdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssmdemo.mapper.BaseDictDao;
import com.ssmdemo.pojo.BaseDict;

@Service
//@Transactional
public class BaseDictServiceImpl implements BaseDictService {

	
	@Autowired
	private BaseDictDao baseDictDao;

	public List<BaseDict> selectBaseDictListByCode(String code) {
		// TODO Auto-generated method stub
		return baseDictDao.selectBaseDictListByCode(code);
	}
	
	
	
	
}
