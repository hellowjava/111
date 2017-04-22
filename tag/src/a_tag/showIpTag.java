package a_tag;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class showIpTag extends SimpleTagSupport{
	
	@Override
	public void doTag() throws JspException, IOException {
			
		PageContext pagecontext = (PageContext)this.getJspContext();
		ServletRequest request = pagecontext.getRequest();
		String ip = request.getRemoteHost();
		JspWriter out = pagecontext.getOut();
		out.write("使用自定义客户端"+ip);
	}
	
	
}
