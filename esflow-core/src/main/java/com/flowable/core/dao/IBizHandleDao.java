package com.flowable.core.dao;

import java.util.List;
import java.util.Map;

import com.flowable.core.common.dao.IBaseDao;
import com.flowable.core.common.utils.PageHelper;

public interface IBizHandleDao extends IBaseDao<Map<String,Object>>{

	/**
	 * 获取工单发起人列表
	 * @param page
	 * @param params
	 * @return
	 */
	public PageHelper<Map<String, Object>> findMember(PageHelper<Map<String, Object>> page,Map<String,Object> params);
	
	/**
	 * 获取部门选项列表
	 * @param params
	 * @return
	 */
	public List<Map<String, Object>> findSector(Map<String,Object> params);

}
