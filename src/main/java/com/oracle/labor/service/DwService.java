package com.oracle.labor.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.labor.dao.ZjDwzpdjbMapper;

@Service
public class DwService {
	
	@Autowired
	ZjDwzpdjbMapper dwDao;
	
	//查询符合条件的单位
	public List<Map<String,Object>> getDw(String bio_id,String bio_name){
		return dwDao.getDw(bio_id, bio_name);
	}

}
