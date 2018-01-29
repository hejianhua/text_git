package com.study.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class TagDemo1 extends TagSupport{
		@Override
		public int doStartTag() throws JspException {
			
			
			//return Tag.EVAL_BODY_INCLUDE;
		//	return Tag.SKIP_BODY;
			return 0; //默认不显示
		}
		
		
		@Override
		public int doEndTag() throws JspException {
		
		//return Tag.EVAL_PAGE;	//执行后面的代码
		//return Tag.SKIP_PAGE;  //不执行后面的代码了
		return 0;				 //默认执行后面的代码
		}
}
