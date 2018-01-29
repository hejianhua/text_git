package com.study.tag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo2 extends SimpleTagSupport{

	
	
	@Override
	public void doTag() throws JspException, IOException {
		
		JspFragment jspBody = this.getJspBody();
		 //将标签体的内容写入到sw流中
		StringWriter sw=new StringWriter();
		jspBody.invoke(sw);
		String str = sw.getBuffer().toString();
		str+="123654";
		PageContext pageContext=(PageContext)this.getJspContext();
		//将修改后的数据输出到浏览器
		for (int i = 0; i < 5; i++) {
			
			pageContext.getOut().write(str);
		}
		
		
	}
}
