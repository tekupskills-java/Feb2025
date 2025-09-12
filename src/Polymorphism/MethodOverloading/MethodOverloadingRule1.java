package Polymorphism.MethodOverloading;

public class MethodOverloadingRule1 {

    int addition(int a, int b){
        return 0;
    }

    int addition(int rrr, int oob, int name){  //Number of parameters: Different quantities of parameters.
        return 100;
    }

    long addition(long rrr, int oob, long name){  //Types of parameters: Parameters of varying data types.
        System.out.println("Types of parameters: Parameters of varying data types");
        return rrr+oob+name; ///
    }

    int addition(long rrr, long oob, int name){  //Order of parameters: Sequence of data types of parameters differing.
        return 100;
    }

    public static void main(String[] args) {
        MethodOverloadingRule1 obj = new MethodOverloadingRule1();
        obj.addition(1000l, 1000, 1000l);
    }

    long addition(long rrr, long oob, int name, int l){  //Order of parameters: Sequence of data types of parameters differing.
        return 100l;
    }

    /*public long addition(long rrr, long oob, int name, int l){  //Order of parameters: Sequence of data types of parameters differing.
        return 100l;
    }*/



}
