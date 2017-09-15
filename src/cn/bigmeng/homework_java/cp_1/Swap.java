package cn.bigmeng.homework_java.cp_1;

import java.lang.reflect.InvocationTargetException;

public class Swap {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MyClass a = new MyClass();
        MyClass b = new MyClass();

        a.setElem(1);
        b.setElem(2);
        System.out.println("before swap: a = " + a.getElem() + ", b = " + b.getElem());
        swap(a,b);
        System.out.println("after swap: a = " + a.getElem() + ", b = " + b.getElem());
    }

    private static void swap(MyClass a, MyClass b){
        MyClass temp = new MyClass();
        temp.setElem(a.getElem());
        a.setElem(b.getElem());
        b.setElem(temp.getElem());
    }
}

class MyClass {
    public Object getElem() {
        return elem;
    }

    public void setElem(Object elem) {
        this.elem = elem;
    }

    Object elem;

}