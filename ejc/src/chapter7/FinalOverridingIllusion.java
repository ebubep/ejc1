/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author OMOBOLAJI JR
 */

class WithFinals {
// Identical to "private" alone:
void f() {System.out.println("WithFinals.f()"); }
// Also automatically "final":
void g() { System.out.println("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
@Override  void f() {
    super.f();
System.out.println("OverridingPrivate.f()");
}
@Override
 void g() {
     super.g();
System.out.println("OverridingPrivate.g()");
}
}
class OverridingPrivate2 extends OverridingPrivate {
public final void f() {
    super.f();
System.out.println("OverridingPrivate2.f()");
}
public void g() {
    super.g();
System.out.println("OverridingPrivate2.g()");
}
}
public class FinalOverridingIllusion {
public static void main(String[] args) {
OverridingPrivate2 op2 = new OverridingPrivate2();
op2.f();
op2.g();
// You can upcast:
OverridingPrivate op = op2;
// But you can’t call the methods:
//! op.f();
//! op.g();
// Same here:
WithFinals wf = op2;
//! wf.f();
//! wf.g();
}
}

   
