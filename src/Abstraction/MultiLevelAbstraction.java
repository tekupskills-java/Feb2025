package Abstraction;

class GrandParentAb {
    void test(){

    }
}

abstract class ParentAb extends GrandParentAb{
    abstract void dummy();

    void show(){

    }
}

class ChildAb extends ParentAb{
    @Override
    void dummy() {

    }
}
public class MultiLevelAbstraction {
}
