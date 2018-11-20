package com.biz.interfaces;

public class AnimalExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZooKeper zooKeper = new ZooKeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		AnimalInterface tigerImp = new Tiger();
		AnimalInterface lionImp = new Lion();
	
		zooKeper.food(lion); // ZooKeper에 있는 food(Lion lion) 메소드 호출
		zooKeper.food(tiger); // ZooKeper에 있는 food(Tiger tiger) 메소드 호출
		
		zooKeper.add(3, 4);
		zooKeper.add(3f, 4f);

	}

}
