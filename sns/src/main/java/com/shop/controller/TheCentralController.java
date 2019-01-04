package com.shop.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String mainMenu(@PathVariable("type")String type,@PathVariable("mid")String mid,Integer currentPageNo,Model model) {
		
		//判断是否需要分页处理数据
		getMapper(type+"/"+mid,model,currentPageNo);
		
		return type+"/"+mid;
	}
	
	
	

	/**
	 * 反射到指定映射获得值再添加到model
	 * @param mapper 获得值的方法
	 * @param model 接收值
	 */
	private void getMapper(String mapper,Model model,Object...objects) {
		for (Object controll : list) {
			Class controCls = controll.getClass();
		
			
			Method[] methods = controCls.getMethods();
			for (Method method : methods) {
				if(method.isAnnotationPresent(JSPMapper.class)) {
					if(method.getAnnotation(JSPMapper.class).value().equals(mapper)) {
						try {
							
							if(objects == null && foreach(objects))
								model.addAttribute("data", method.invoke(controll));
							else 
								model.addAttribute("data", method.invoke(controll,objects));
							
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
	private boolean foreach(Object[] objects) {
		for (Object object : objects) {
			if(object == null) {
				return false;
			}
		}
		
		return true;
	}
}
