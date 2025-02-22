package inheritanceSirM;
//benefit of inheritance :Code reusability
//grand father--->father--->child (unidirectional relation it is also known as (is a relation) )
//How we can represent above r/l in java?
//with the help of inheritance concept
//son extends parent extends grandparent
 class GrandParent extends Object{
private int money=100000;

public int getGrandParentMoney() {
	return money;
}

}
class Parent extends GrandParent{
private	int money=50000;

public int getParentMoney() {
//	return money+super.getMoney();
	return money;
}

}
class Son extends Parent{
 public int getTotalMoney() {
	//System.out.println(super.money);
	//System.out.println(super.super.money); this is invalid syntax
	
   return getParentMoney()+getGrandParentMoney();//benefit of inheritance(code reusability)
	
	}
}
class Animal{
	
}
class Dog extends Animal{
	// a dog is an animal
	//animal is a dog (this is not valid)
}
class Employee{
	
}
class Developer extends Employee{
	//a developer is an employee
	//an employee is a developer
	//an employee is a HR
	//an employee is a manager
}





