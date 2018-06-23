package org.sjq.test.cxfdemo.factory;

import org.apache.cxf.frontend.ServerFactoryBean;

public class CXFWebServicePublish {
	
	public static void main(String[] args) {
		String url="http://localhost:7777/hello";
        //获取CXF发表的服务类，
        //不支持注解的方式，但是这样就不能通过注解来修改wsdl文件
        ServerFactoryBean bean=new ServerFactoryBean();
        //设置发布路径
        bean.setAddress(url);
        //设置实现类
        bean.setServiceBean(new HelloServiceImpl());
        //发表
        bean.create();
	}
}
