package com.qf.biz;

import java.util.List;

import com.qf.biz.infter.SuppAddId;
import com.qf.dao.DaoSuppers;
import com.qf.mod.Suppliers;

/**
 * 供应商编号操作
 * 
 * @author Administrator
 *
 */
public class SuppAddIdBiz implements SuppAddId {

	@Override
	public int suppIdCx(String id) {
		int iid = Integer.parseInt(id);
		List<Suppliers> al = new DaoSuppers().allSup();
		if (al.size() == 0) {
			return 0;
		} else {
			for (Suppliers sup : al) {
				
				if (sup.getId() == iid) {
					return 1;
				} 
			}
		}
		return 0;
	}
}
