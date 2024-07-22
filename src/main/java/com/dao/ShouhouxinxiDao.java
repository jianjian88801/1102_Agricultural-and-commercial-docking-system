package com.dao;

import com.entity.ShouhouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouhouxinxiVO;
import com.entity.view.ShouhouxinxiView;


/**
 * 售后信息
 * 
 * @author 
 * @email 
 * @date 2022-04-01 12:56:25
 */
public interface ShouhouxinxiDao extends BaseMapper<ShouhouxinxiEntity> {
	
	List<ShouhouxinxiVO> selectListVO(@Param("ew") Wrapper<ShouhouxinxiEntity> wrapper);
	
	ShouhouxinxiVO selectVO(@Param("ew") Wrapper<ShouhouxinxiEntity> wrapper);
	
	List<ShouhouxinxiView> selectListView(@Param("ew") Wrapper<ShouhouxinxiEntity> wrapper);

	List<ShouhouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShouhouxinxiEntity> wrapper);
	
	ShouhouxinxiView selectView(@Param("ew") Wrapper<ShouhouxinxiEntity> wrapper);
	

}
