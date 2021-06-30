package day57_abstraction_polymorphism.absExample;

import day57_abstraction_polymorphism.absExample.ConcreteA;
import day57_abstraction_polymorphism.absExample.InterfaceA;

public class Runner {
        public static void main(String[] args) {


                /**
                 * We cannot create object(instantiate) neither of them.
                 AbstractA absA = new AbstractA();
                 InterfaceA iA = new InterfaceA();
                 */
                InterfaceA.staticMethodE("wooden spoon");
                //ConcreteA.staticMethodE("hello"); -> staticMethodE only works with interface.staticMethodE
                ConcreteA.staticMethodC();
        }
}

