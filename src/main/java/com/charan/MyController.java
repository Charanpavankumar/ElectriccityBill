package com.charan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController
{
	@RequestMapping("/")
	public String home() {
		return "reg";
	}
	@RequestMapping("/req2")
	public String homepage(@RequestParam String cid,@RequestParam String cnme,@RequestParam double crd,@RequestParam double prd,ModelMap m)
	{	
		double units=crd-prd;
		double totalbill=0.0;
		
		
		if(units<200) {
			
		
			totalbill=units*1.75;	
		}
		else if(units>=200 && units<500){
			
			totalbill=units*5.00;
			
		}
		else {
			
			totalbill=units*7.25;		 
		}
		m.put("k1",cid);
		m.put("k2",cnme);
		m.put("k3",crd);
		m.put("k4",prd);
		m.put("k5",units);
		m.put("k6",totalbill);
			
	  return "result";
	}
}
