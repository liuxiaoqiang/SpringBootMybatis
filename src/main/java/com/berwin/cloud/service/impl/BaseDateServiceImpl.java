package com.berwin.cloud.service.impl;

import org.apache.log4j.Logger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berwin.cloud.dao.BaseDateMapper;
import com.berwin.cloud.model.BaseDate;
import com.berwin.cloud.service.BaseDateService;

@Service("BaseDateService")
public class BaseDateServiceImpl implements BaseDateService {
	
	private static final Logger logger = Logger.getLogger(BaseDateServiceImpl.class);
	
	@Autowired
	private BaseDateMapper baseDateMapper;

	@Override
	public List<BaseDate> find() {
		logger.info("service get data is : " + baseDateMapper.find());
		return baseDateMapper.find();
	}

	
}
