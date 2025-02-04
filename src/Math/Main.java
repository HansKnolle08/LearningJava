package Math;

import Math.mathutils.Add;
import  Math.mathutils.Sub;
import Math.mathutils.Mul;
import Math.mathutils.Div;

public class Main {

    public static void addFuncs() {
        System.out.println(Add.add(10, 20));
        System.out.println(Add.add(10.6, 20));
        System.out.println(Add.add(10, 20.2));
        System.out.println(Add.add(0.6, 0.2) + "\n");
    }

    public static void subFuncs() {
        System.out.println(Sub.sub(10, 20));
        System.out.println(Sub.sub(10.6, 20));
        System.out.println(Sub.sub(10, 20.2));
        System.out.println(Sub.sub(0.6, 0.2) + "\n");
    }

    public static void mulFuncs() {
        System.out.println(Mul.mul(10, 20));
        System.out.println(Mul.mul(10.6, 20));
        System.out.println(Mul.mul(10, 20.2));
        System.out.println(Mul.mul(0.6, 0.2) + "\n");
    }

    public static void divFuncs() {
        System.out.println(Div.div(10, 20));
        System.out.println(Div.div(10.6, 20));
        System.out.println(Div.div(10, 20.2));
        System.out.println(Div.div(0.6, 0.2) + "\n");
    }

    public static void main(String[] args) {
        System.out.println("AddFuncs:");
        addFuncs();
        System.out.println("SubFuncs:");
        subFuncs();
        System.out.println("MulFuncs:");
        mulFuncs();
        System.out.println("DivFuncs:");
        divFuncs();
    }
}