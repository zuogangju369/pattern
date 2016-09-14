package com.pattern.createtype.abfactory;
/**
 * 
* @ClassName: Client
* @Description: 创建型-->抽象工厂模式
* @author zuozuo
* @date 2016年9月14日 上午11:43:29
 */
public class Client {
	public static void main(String[] args) {
		//A车厂
		CarFactory factoryA = new AFactory();
		factoryA.createTire().tire();
		factoryA.createEngine().engine();
		factoryA.createBrake().brake();
		System.out.println("---------------");
		//B车厂
		CarFactory factoryB = new BFactory();
		factoryB.createTire().tire();
		factoryB.createEngine().engine();
		factoryB.createBrake().brake();
	}
}
