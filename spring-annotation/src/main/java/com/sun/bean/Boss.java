package com.sun.bean;

import org.springframework.stereotype.Component;

//??????ioc?????��?????????????????????��?????????????????��????????????
@Component
public class Boss {


	private Car car;

	//?????????????????????????��??
	public Boss(Car car){
		this.car = car;
		System.out.println("Boss...?�Ӧ�?????");
	}



	public Car getCar() {
		return car;
	}


	//@Autowired
	//??????????Spring???????????????????��????????????
	//??????????????????????????ioc?????��??
	public void setCar(Car car) {
		this.car = car;
	}



	@Override
	public String toString() {
		return "Boss [car=" + car + "]";
	}
	
	

}