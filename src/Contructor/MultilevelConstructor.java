package Contructor;

class ConstructorGp{
    ConstructorGp(){
        System.out.println("Constructor of ConstructorGp class == 5 ");
    }
}

class ConstructorParent extends MultilevelConstructor{
    ConstructorParent(){
        System.out.println("Constructor of ConstructorParent class == 11 ");
    }
}

public class MultilevelConstructor extends ConstructorGp{
    MultilevelConstructor(){
        System.out.println("Constructor of MultilevelConstructor class == 17 ");
    }

    public static void main(String[] args) {
        //ConstructorParent parent = new ConstructorParent();
        MultilevelConstructor child = new MultilevelConstructor();
    }
}
//ConstructorGp   => MultilevelConstructor  => ConstructorParent