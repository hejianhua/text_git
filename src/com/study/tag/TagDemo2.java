package com.study.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class TagDemo2 extends TagSupport{
	private int i=0;
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return Tag.EVAL_BODY_INCLUDE;
	}
	
	public int doAfterBody() throws JspException {
		System.out.println("执行这里吗");
		if(i<3){
			i++;
			return IterationTag.EVAL_BODY_AGAIN;
			
		}else{
			return IterationTag.SKIP_BODY;
		}
		}

}
