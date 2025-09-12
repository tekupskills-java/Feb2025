package Polymorphism.MethodOverriding;


/*4) The access level cannot be more restrictive than the parent class method’s access level.
For example: if the super class method is declared public,
then the over-ridding*/

class  Rule4Parent {
     void test(){
        System.out.println("default method of Parent class ");
    }

}

public class Rule4Class extends Rule4Parent{

    @Override
    public void test() {
        System.out.println("default method of child ");
    }
}
