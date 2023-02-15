package com.onesoft.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseLaptop {

	public static void main(String[] args) {
//		Laptop l1 = new Laptop("dell",25000,"black",false);
//		Laptop l2 = new Laptop("macbook",80000,"silver");
//		Laptop l3 = new Laptop();
//		Laptop l4 = new Laptop();
//		Laptop l5 = new Laptop();
		ArrayList<Laptop>laps=new ArrayList<>();
		laps.add(new Laptop("dell",25000,"black",false));
		laps.add(new Laptop("macbook",80000,"silver",false));
		laps.add(new Laptop("lenovo",98000,"blue",true));
		laps.add(new Laptop("hp",55000,"grey",false));
		
//		laps.stream().map(x->x.getBrand()).forEach(x->System.out.println(x));
//		laps.stream().filter(x->x.getPrice()>=35000&&x.getColor().contains("l")).forEach(x->System.out.println(x));
//		laps.stream().filter(x->x.isTouchScreen()==true).map(y->y.getBrand()).forEach(y->System.out.println(y));
		
		long count = laps.stream().count();
		//System.out.println(count);
		long a = laps.stream().filter(z->z.getPrice()>78000).count();
		System.out.println(a);
		
		List<Laptop>touchLap=laps.stream().filter(x->x.isTouchScreen()).collect(Collectors.toList());
		//		System.out.println(touchLap);
		List<Laptop>nonTouchLap=laps.stream().filter(x->x.isTouchScreen()==false).collect(Collectors.toList());
		//System.out.println(nonTouchLap);
		List<String>b=laps.stream().filter(c->c.getBrand().contains("e")).map(c->c.getBrand()).collect(Collectors.toList());
		//System.out.println(b);	
		
		Map<String, Laptop>l=laps.stream().collect(Collectors.toMap(i->i.getBrand(),j->j));
		//l.keySet().forEach(x->System.out.println(x+" "+l.get(x)));
		
		System.out.println("check for git");
		
				
		
	}

}
