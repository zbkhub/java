package com.qf.biz.infter;

import java.util.List;

import com.qf.mod.Suppliers;
/**
 * 供应商综合查询接口
 * @author Administrator
 *
 */
public interface SupplierCxInfter {
	public List<Suppliers> suppCx(String name,String des);
}
