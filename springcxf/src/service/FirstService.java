package service;

import javax.jws.WebService;

@WebService
public class FirstService {
	
	public String print(){
		return"aa";
	}
	
	public int sum(int x,int y){
		return x+y;
	}
	
	
}
