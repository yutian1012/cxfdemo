package org.sjq.test.cxfdemo.jaxswfactory;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class JaxWsCXFWebServicePublish {

	public static void main(String[] args){
        String url="http://localhost:7777/hello/jaxws";
        //获取CXF发表的服务类，
        JaxWsServerFactoryBean bean=new JaxWsServerFactoryBean();
        //设置发布路径
        bean.setAddress(url);
        //设置实现类
        bean.setServiceBean(new JaxWsHelloServiceImpl());
        //发表
        bean.create();
    }
}
