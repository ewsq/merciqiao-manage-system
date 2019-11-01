package com.carloan.service.admin.mayi.service;

import com.carloan.common.web.annotation.Page;
import com.carloan.service.admin.mayi.dao.MayiDao;
import com.carloan.service.admin.mayi.entity.MayiEntity;
import com.carloan.service.admin.mayi.vo.MayiVO;
import com.carloan.service.admin.mayi.vo.ZanzhuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mayiService")
public class MayiService{
	@Autowired
	private MayiDao mayiDao;

	public List<ZanzhuVo> queryZanZhu(){
		return mayiDao.queryZanZhu();
	}

	public MayiVO queryObject(String ip){
	 	MayiVO vo=mayiDao.queryObject(ip);
		return vo;
	}

	@Page
	public Object queryList(MayiEntity mayi){

		return mayiDao.queryList(mayi);
	}

	public Boolean save(MayiEntity mayi){
		mayiDao.save(mayi);
		return true;
	}
	public Boolean update(MayiEntity mayi){
		mayiDao.update(mayi);
		return true;
	}

	
}
