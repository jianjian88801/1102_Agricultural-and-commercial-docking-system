package com.entity.view;

import com.entity.ShouhouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 售后信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-01 12:56:25
 */
@TableName("shouhouxinxi")
public class ShouhouxinxiView  extends ShouhouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouhouxinxiView(){
	}
 
 	public ShouhouxinxiView(ShouhouxinxiEntity shouhouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shouhouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
