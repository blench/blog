package com.lizewu.blog.action;

import java.util.Map;

import com.lizewu.blog.po.Critique;
import com.lizewu.blog.service.CritiqueService;
import com.lizewu.blog.service.impl.CritiqueServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddCritique extends ActionSupport {

	private Critique critique;
	private CritiqueService critiqueService;
	
	public Critique getCritique() {
		return critique;
	}

	public CritiqueService getCritiqueService() {
		return critiqueService;
	}

	public void setCritique(Critique critique) {
		this.critique = critique;
	}

	public void setCritiqueService(CritiqueService critiqueService) {
		this.critiqueService = critiqueService;
	}

	public String execute() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		String username = (String) session.get("username");
		if(username==null && "".equals(username))
		{
			username = "ÄäÃû";
		}
		//Ìí¼ÓÆÀÂÛ
		this.critiqueService.addCritique(critique);
		return this.SUCCESS;
		
	}
}
