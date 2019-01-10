package com.shop.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;

import org.junit.Test;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import com.shop.node.JSPMapper;

/**
 * 中央控制器类
 * 菜单提交的请求在此处理
 * @author Administrator
 *
 */
@Controller
public class TheCentralController {

	public TheCentralController() {
		TheCentralController.CentralController = this;
	}
	
	private static TheCentralController CentralController;

	public static TheCentralController getCentralController() {
		
		return CentralController;
	}

	private List<Object> list = new ArrayList<>();
	
	//添加控制器到中央控制器
	public void addController(Object con) {
		if(con.getClass().isAnnotationPresent(Controller.class)) {
			list.add(con);
		}
	} 
	

	@RequestMapping(value="/home/{type}/{mid}",method=RequestMethod.GET)
	public String mainMenu(@PathVariable("type")String type,@PathVariable("mid")String mid,ServletRequest request,Model model) {
		Map<String,Object> map = WebUtils.getParametersStartingWith(request, "");
		
		getMapper(type+"/"+mid,model,map);
		
		return type+"/"+mid;
	}
	/**
	 * 反射到指定映射获得值再添加到model
	 * @param mapper 获得值的方法
	 * @param model 接收值
	 */
	private void getMapper(String mapper,Model model,Map map) {
		for (Object controll : list) {
			Class controCls = controll.getClass();
		
			
			Method[] methods = controCls.getMethods();
			
			//扫描查找指定参数并执行对应的方法来添加数据到客户端
			for (Method method : methods) {
				if(method.isAnnotationPresent(JSPMapper.class)) {
					if(method.getAnnotation(JSPMapper.class).value().equals(mapper)) {
						try {
							
							if(map == null)
								model.addAttribute("data", method.invoke(controll));
							else {
								
								model.addAttribute("data", method.invoke(controll,map));
								
							}
								
							return;//仅映射一次,不额外添加数据
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	/**
	 * 1.10 废弃方法
	 */
	@Deprecated
	public String mainMenu(@PathVariable("type")String type,@PathVariable("mid")String mid,Integer currentPageNo,
			Integer findId,String starTime,String endTime,Model model) {
		
		
        
		
		
		//判断是否需要分页处理数据
		getMapper(type+"/"+mid,model,currentPageNo);
		
		
		// 向客户端添加数据
		if(currentPageNo == null) {
			getMapper(type+"/"+mid,model);
		}else if(findId == null && starTime == null && endTime == null){
			getMapper(type+"/"+mid,model,currentPageNo);
		}else if(findId != null || (starTime != null || endTime != null)) {
			if(findId != null && starTime == null && endTime == null) {
				getMapper(type+"/"+mid,model,currentPageNo,findId);
			} else {
				getMapper(type+"/"+mid,model,currentPageNo,findId,starTime,endTime);
			}
			
		}
		
		//返回页面
		return type+"/"+mid;
	}
	
	
	
	

	/**
	 * 1.10 废弃方法
	 */
	@Deprecated
	private void getMapper(String mapper,Model model,Object...objects) {
		for (Object controll : list) {
			Class controCls = controll.getClass();
		
			
			Method[] methods = controCls.getMethods();
			
			//扫描查找指定参数并执行对应的方法来添加数据到客户端
			for (Method method : methods) {
				if(method.isAnnotationPresent(JSPMapper.class)) {
					if(method.getAnnotation(JSPMapper.class).value().equals(mapper)) {
						try {
							
							if(objects == null || arrIsNull(objects))
								model.addAttribute("data", method.invoke(controll));
							else {
								
								model.addAttribute("data", method.invoke(controll,(Object)objects));
								
							}
								
							return;//仅映射一次,不额外添加数据
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	
	
	/**
	 * 遍历数组是否有空值
	 * @param objects
	 * @return
	 */
	private boolean arrIsNull(Object[] objects) {
		
		int arrLen = objects.length;
		int nullObj = 0;
		
		for (Object object : objects) {
			
			if(object == null) {
				nullObj++;
				
			}
			if(arrLen <= nullObj) {
				return true;
			}
		}
		
		return false;
	}
}
