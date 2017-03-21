package com.qf.biz;

import java.util.ArrayList;
import java.util.List;

import com.qf.biz.infter.SupplierCxInfter;
import com.qf.dao.DaoSuppers;
import com.qf.mod.Suppliers;

public class SupplierCx implements SupplierCxInfter {
	
	@Override
	public List<Suppliers> suppCx(String name, String des) {
		List<Suppliers> al=new DaoSuppers().allSup();
		List<Suppliers> ral=new ArrayList<>();
		for(Suppliers sup:al){
			if(name==""){
				if(sup.getDescribe().contains(des)){
					ral.add(sup);
				}
			}
			else if(des==""){
				if(sup.getName().contains(name)){
					ral.add(sup);
				}
			}else{
			if(sup.getName().contains(name) || sup.getDescribe().contains(des)){
				ral.add(sup);
			}
			}
		}
		
		return ral;
	}

}
