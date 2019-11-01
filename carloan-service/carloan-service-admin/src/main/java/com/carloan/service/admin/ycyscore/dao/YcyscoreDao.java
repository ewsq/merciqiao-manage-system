package com.carloan.service.admin.ycyscore.dao;

import com.carloan.service.admin.ycyscore.entity.YcyscoreEntity;
import com.carloan.service.admin.ycyscore.entity.YcyscoreListEntity;
import com.carloan.service.admin.ycyscore.entity.YcyscoretotalEntity;
import com.carloan.service.admin.ycyscore.vo.YcyscoreVO;
import com.carloan.service.admin.ycyscore.vo.YcyscoretotalVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * 
 * @author qlx
 * @email qiaolixue@yingu.com
 * @date 2019-03-09 14:21:07
 */
@Repository
public interface YcyscoreDao  {

	public YcyscoreVO queryObject( String ip);

	public YcyscoretotalVO queryObjectTotal(String ip);

	public YcyscoreVO queryObjectToday( String ip);

	public List<YcyscoreVO> queryList(YcyscoreEntity ycyscore);

	public List<YcyscoreVO> queryListTotal(YcyscoretotalEntity ycyscore);

	public List<YcyscoreVO> querySpeedList(YcyscoreEntity ycyscore);

	public List<YcyscoreVO> queryToday(YcyscoreEntity ycyscore);

	public int queryRank(YcyscoreEntity ycyscore);

	public int queryRankTotal(YcyscoretotalEntity ycyscore);

	public YcyscoreVO querySpeedRank(YcyscoreEntity ycyscore);

	public YcyscoreVO queryRankToday(YcyscoreEntity ycyscore);
	
	public void save(YcyscoreEntity ycyscore);

	public void saveTotal(YcyscoretotalEntity ycyscore);

	public void update(YcyscoreEntity ycyscore);

	public void updateTotal(YcyscoretotalEntity ycyscore);
	
	public void delete(Integer id);
	
	public void deleteBatch(Integer[] ids);

	public Integer queryTotal();

	public Integer queryTotalTotal();
	
}