import spoon.Launcher;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.support.compiler.VirtualFile;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TypeAdapter_ESTest {

    public void checkOverride(CtModel model) {

        List<CtType<?>> types = new ArrayList<CtType<?>>(model.getAllTypes());

        CtType<?> outer1 = types.get(0);
        CtType<?> outer2 = types.get(1);

        CtType<?> inner1 = outer1;
        while (true) {
            Set<CtType<?>> nested = inner1.getNestedTypes();
            if (nested.isEmpty()) {
                break;
            }
            inner1 = (CtType<?>) nested.iterator().next();
        }

        CtType<?> inner2 = outer2;
        while (true) {
            Set<CtType<?>> nested = inner2.getNestedTypes();
            if (nested.isEmpty()) {
                break;
            }
            inner2 = (CtType<?>) nested.iterator().next();
        }

        for (Object o : inner1.getMethods()) {
          CtMethod<?> m = (CtMethod<?>) o;
          CtMethod<?> m2 = (CtMethod<?>) inner2.getMethodsByName(m.getSimpleName()).get(0);
          assertTrue(m2.isOverriding(m));
          assertFalse(m.isOverriding(m2));
        }
    }

    public void check(String program) {
        Launcher launcher = new Launcher();
        launcher.getEnvironment().setComplianceLevel(17);
        launcher.getEnvironment().setAutoImports(true);
        launcher.getEnvironment().setShouldCompile(true);
        launcher.addInputResource(new VirtualFile(program));
        checkOverride(launcher.buildModel());
    }

    @Test
    public void test000() {
        check("public class cG6 {\n  public static class t {\n    public static class w {\n      public static class n<T> {\n        public class sg<Q> {\n          public void BO(T KZ, T fu, Q FJh) {}\n          public void J3(T IZ, Q Lf, Q ypm) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class q {\n  public static class I extends cG6.t {\n    public static class Z extends w {\n      public static class jU2 extends n<Boolean> {\n        public class E extends sg<String> {\n          @Override public void BO(Boolean KZ, Boolean fu, String FJh) {}\n          @Override public void J3(Boolean IZ, String Lf, String ypm) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test001() {
        check("public class S {\n  public class I<CP> {\n    public void R(CP NL, CP mUTYB) {}\n\n  }\n}\n\npublic class T {\n  public class H extends S.I<String> {\n    @Override public void R(String NL, String mUTYB) {}\n\n  }\n}");
    }


    @Test
    public void test002() {
        check("public class bm {\n  public class Kf_M9<tlDg> {\n    public void Ig(tlDg w, tlDg E) {}\n\n  }\n}\n\npublic class Tn {\n  public class d extends bm.Kf_M9<Integer> {\n    @Override public void Ig(Integer w, Integer E) {}\n\n  }\n}");
    }


    @Test
    public void test003() {
        check("public class P1 {\n  public class j<TCSH> {\n    public class afc<J> {\n      public class i9Nw<a> {\n        public void T(a m, a UaRaT) {}\n        public void K(TCSH R, a gM) {}\n\n      }\n    }\n  }\n}\n\npublic class O {\n  public class i extends P1.j<Boolean> {\n    public class y extends afc<Integer> {\n      public class PMvo extends i9Nw<Boolean> {\n        @Override public void T(Boolean m, Boolean UaRaT) {}\n        @Override public void K(Boolean R, Boolean gM) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test004() {
        check("public class Or {\n  public static class Z<p> {\n    public static class qH<tH> {\n      public static class P32cq<tvg6v> {\n        public class x<ZEFtR> {\n          public void X(ZEFtR m) {}\n          public void cj(tvg6v dgH6L, tvg6v nxq, tvg6v kw0) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class c {\n  public static class S extends Or.Z<Double> {\n    public static class F extends qH<Integer> {\n      public static class D extends P32cq<String> {\n        public class lLivx extends x<String> {\n          @Override public void X(String m) {}\n          @Override public void cj(String dgH6L, String nxq, String kw0) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test005() {
        check("public class gy0M {\n  public class j<q> {\n    public class O<LT> {\n      public void a9(q H) {}\n\n    }\n  }\n}\n\npublic class H6 {\n  public class F extends gy0M.j<String> {\n    public class m extends O<String> {\n      @Override public void a9(String H) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test006() {
        check("public class v {\n  public class ZPx<iU> {\n    public class H<d> {\n      public class KY<EF> {\n        public class W<M> {\n          public void Z4lKeq(iU c, d ygjM, EF OS) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class e {\n  public class WI extends v.ZPx<Integer> {\n    public class A extends H<Double> {\n      public class E extends KY<Double> {\n        public class y extends W<Boolean> {\n          @Override public void Z4lKeq(Integer c, Double ygjM, Double OS) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test007() {
        check("public class N {\n  public class v<nX> {\n    public class R<O> {\n      public class s<S> {\n        public class i<Gh5> {\n          public void x(O A) {}\n          public void DOc(O U, O YRF) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class y {\n  public class V extends N.v<Boolean> {\n    public class h extends R<Boolean> {\n      public class Y extends s<Boolean> {\n        public class c extends i<String> {\n          @Override public void x(Boolean A) {}\n          @Override public void DOc(Boolean U, Boolean YRF) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test008() {
        check("public class Vx {\n  public class MjhT<Wxc> {\n    public void OL(Wxc LOpx, Wxc HA9, Wxc uxEl) {}\n    public void g(Wxc rM, Wxc Y, Wxc zAp) {}\n    public void t5i(Wxc v, Wxc jO) {}\n\n  }\n}\n\npublic class inE {\n  public class s extends Vx.MjhT<Double> {\n    @Override public void OL(Double LOpx, Double HA9, Double uxEl) {}\n    @Override public void g(Double rM, Double Y, Double zAp) {}\n    @Override public void t5i(Double v, Double jO) {}\n\n  }\n}");
    }


    @Test
    public void test009() {
        check("public class B {\n  public class EF<qv36> {\n    public class o<esi> {\n      public void g(esi COh, esi yDQOAF, qv36 u9tFNw4) {}\n      public void wW(qv36 H, qv36 R, qv36 QxNr) {}\n\n    }\n  }\n}\n\npublic class z_r {\n  public class cz extends B.EF<Integer> {\n    public class L extends o<Boolean> {\n      @Override public void g(Boolean COh, Boolean yDQOAF, Integer u9tFNw4) {}\n      @Override public void wW(Integer H, Integer R, Integer QxNr) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test010() {
        check("public class gTkP {\n  public static class B7<H> {\n    public class Hn<P> {\n      public void RNf(P vcwPe, P RM6mg, P f) {}\n      public void G(P u, H uHx3) {}\n\n    }\n  }\n}\n\npublic class C_ZUmn {\n  public static class d extends gTkP.B7<Integer> {\n    public class cf extends Hn<Integer> {\n      @Override public void RNf(Integer vcwPe, Integer RM6mg, Integer f) {}\n      @Override public void G(Integer u, Integer uHx3) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test011() {
        check("public class t {\n  public class yw<l> {\n    public class p7<p4> {\n      public class aU6<QI> {\n        public void s(QI KR) {}\n        public void G(p4 o, l pt) {}\n        public void I(p4 oEka) {}\n\n      }\n    }\n  }\n}\n\npublic class FhpW4 {\n  public class C extends t.yw<Boolean> {\n    public class B extends p7<String> {\n      public class zlo3wB5I extends aU6<Boolean> {\n        @Override public void s(Boolean KR) {}\n        @Override public void G(String o, Boolean pt) {}\n        @Override public void I(String oEka) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test012() {
        check("public class i {\n  public class Y<O61MD9P49> {\n    public void Uo(O61MD9P49 Tu, O61MD9P49 y, O61MD9P49 nU) {}\n\n  }\n}\n\npublic class F {\n  public class S extends i.Y<Integer> {\n    @Override public void Uo(Integer Tu, Integer y, Integer nU) {}\n\n  }\n}");
    }


    @Test
    public void test013() {
        check("public class qkw {\n  public class d<yG3> {\n    public class jF<U> {\n      public void Y(U Z) {}\n      public void y5I(yG3 V) {}\n      public void R(yG3 T7) {}\n\n    }\n  }\n}\n\npublic class baP0_ {\n  public class i extends qkw.d<String> {\n    public class njl extends jF<Double> {\n      @Override public void Y(Double Z) {}\n      @Override public void y5I(String V) {}\n      @Override public void R(String T7) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test014() {
        check("public class v {\n  public class UO<v1> {\n    public class cwjGV<n_9> {\n      public class vF<p> {\n        public void R(n_9 a, n_9 d, p wOF) {}\n        public void S(v1 Mkj) {}\n\n      }\n    }\n  }\n}\n\npublic class a5E {\n  public class X extends v.UO<Double> {\n    public class JRz extends cwjGV<Boolean> {\n      public class zdV extends vF<Integer> {\n        @Override public void R(Boolean a, Boolean d, Integer wOF) {}\n        @Override public void S(Double Mkj) {}\n\n      }\n    }\n  }\n}");
    }


    // @Test
    // public void test015() {
    //     check("public class V {\n  public static class e<x> {\n    public static class B1kOh<k> {\n      public class O<OSU> {\n        public void S(x TG, OSU Z, x m7B) {}\n        public void KD(x r4, k w) {}\n        public void J(x fFqzX, k R4) {}\n\n      }\n    }\n  }\n}\n\npublic class MBsX {\n  public static class Tq extends V.e<Double> {\n    public static class JvYj extends B1kOh<Integer> {\n      public class W extends O<Boolean> {\n        @Override public void S(Double TG, Boolean Z, Double m7B) {}\n        @Override public void KD(Double r4, Integer w) {}\n        @Override public void J(Double fFqzX, Integer R4) {}\n\n      }\n    }\n  }\n}");
    // }


    @Test
    public void test016() {
        check("public class c3aTIu {\n  public static class b5W<Y765jLGW8P> {\n    public class A<ND> {\n      public void S(ND gw, Y765jLGW8P v, ND G1) {}\n      public void OlL(Y765jLGW8P h7Uv, Y765jLGW8P mPt, ND d) {}\n      public void f(Y765jLGW8P Y) {}\n\n    }\n  }\n}\n\npublic class M3d5E {\n  public static class T extends c3aTIu.b5W<Boolean> {\n    public class c extends A<String> {\n      @Override public void S(String gw, Boolean v, String G1) {}\n      @Override public void OlL(Boolean h7Uv, Boolean mPt, String d) {}\n      @Override public void f(Boolean Y) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test017() {
        check("public class R2 {\n  public class AD<j> {\n    public class m<O> {\n      public class ehbN {\n        public void b(O J) {}\n        public void g(j k6R4, O v) {}\n\n      }\n    }\n  }\n}\n\npublic class aY {\n  public class Sf extends R2.AD<Double> {\n    public class I extends m<Double> {\n      public class Y extends ehbN {\n        @Override public void b(Double J) {}\n        @Override public void g(Double k6R4, Double v) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test018() {
        check("public class K {\n  public static class k<I> {\n    public class a<dzA> {\n      public class T<zg> {\n        public class j0aX<MkA6> {\n          public void x(dzA qLy, zg s) {}\n          public void M(MkA6 c, zg rniwB) {}\n          public void E(dzA DT, MkA6 e) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class XYbK {\n  public static class v extends K.k<Integer> {\n    public class in extends a<Integer> {\n      public class eK extends T<Integer> {\n        public class gByzELq extends j0aX<Integer> {\n          @Override public void x(Integer qLy, Integer s) {}\n          @Override public void M(Integer c, Integer rniwB) {}\n          @Override public void E(Integer DT, Integer e) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    // @Test
    // public void test019() {
    //     check("public class N {\n  public static class T<a> {\n    public static class R9<O> {\n      public class A<HX> {\n        public void p(a r) {}\n        public void y8t(a Nf, a ax, O ERL) {}\n\n      }\n    }\n  }\n}\n\npublic class q {\n  public static class v extends N.T<Integer> {\n    public static class j extends R9<Double> {\n      public class V extends A<Integer> {\n        @Override public void p(Integer r) {}\n        @Override public void y8t(Integer Nf, Integer ax, Double ERL) {}\n\n      }\n    }\n  }\n}");
    // }


    @Test
    public void test020() {
        check("public class X {\n  public class kP<f> {\n    public void C(f G, f cgGPqIt) {}\n\n  }\n}\n\npublic class HQT {\n  public class qi extends X.kP<Integer> {\n    @Override public void C(Integer G, Integer cgGPqIt) {}\n\n  }\n}");
    }


    @Test
    public void test021() {
        check("public class z {\n  public static class A<hG> {\n    public class q0jg3QJc<x> {\n      public class J<ww> {\n        public class MSE<X> {\n          public void Ws(x jp, X vh) {}\n          public void V(x yD, X K) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class Xg {\n  public static class p1 extends z.A<Boolean> {\n    public class rF9 extends q0jg3QJc<Integer> {\n      public class vt extends J<Double> {\n        public class o extends MSE<Double> {\n          @Override public void Ws(Integer jp, Double vh) {}\n          @Override public void V(Integer yD, Double K) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test022() {
        check("public class fz {\n  public class o<V25> {\n    public void fUhSo(V25 AZnW9Lx, V25 Ri) {}\n    public void aa0(V25 fg) {}\n\n  }\n}\n\npublic class B {\n  public class K extends fz.o<Boolean> {\n    @Override public void fUhSo(Boolean AZnW9Lx, Boolean Ri) {}\n    @Override public void aa0(Boolean fg) {}\n\n  }\n}");
    }


    @Test
    public void test023() {
        check("public class n {\n  public static class QA {\n    public class h<v3> {\n      public class S<k> {\n        public class CD<Dmmd> {\n          public void H(k m, k l) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class iyG0 {\n  public static class DE extends n.QA {\n    public class AU extends h<Integer> {\n      public class JW extends S<Double> {\n        public class oqjsF extends CD<Double> {\n          @Override public void H(Double m, Double l) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test024() {
        check("public class ai3 {\n  public class o {\n    public class g<D> {\n      public void F(D nA) {}\n      public void k1CQDo(D Yn, D QP, D tIM) {}\n\n    }\n  }\n}\n\npublic class W {\n  public class P extends ai3.o {\n    public class s extends g<Double> {\n      @Override public void F(Double nA) {}\n      @Override public void k1CQDo(Double Yn, Double QP, Double tIM) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test025() {
        check("public class N {\n  public static class b<Tc> {\n    public class GDL4<qwN> {\n      public void BU(qwN F) {}\n      public void hQ(qwN O, qwN vg) {}\n\n    }\n  }\n}\n\npublic class oV {\n  public static class vLfu extends N.b<String> {\n    public class K9 extends GDL4<Double> {\n      @Override public void BU(Double F) {}\n      @Override public void hQ(Double O, Double vg) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test026() {
        check("public class F1 {\n  public static class w1<I> {\n    public class l<h_up> {\n      public void m1iQ(I u, h_up P, h_up d) {}\n      public void a03(I p) {}\n      public void uNZTm(I S) {}\n\n    }\n  }\n}\n\npublic class oM {\n  public static class Cr extends F1.w1<String> {\n    public class w extends l<Boolean> {\n      @Override public void m1iQ(String u, Boolean P, Boolean d) {}\n      @Override public void a03(String p) {}\n      @Override public void uNZTm(String S) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test027() {
        check("public class C {\n  public static class BHT<VX3> {\n    public class yf0i<T> {\n      public class a<U5> {\n        public class x<dy> {\n          public void Io(dy f) {}\n          public void U4(dy fV, VX3 VRA, T QUWp) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class h {\n  public static class FzS extends C.BHT<String> {\n    public class d4 extends yf0i<String> {\n      public class wjt extends a<String> {\n        public class l extends x<Double> {\n          @Override public void Io(Double f) {}\n          @Override public void U4(Double fV, String VRA, String QUWp) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test028() {
        check("public class M {\n  public static class GMQ1<mq> {\n    public class G<GM> {\n      public void w(mq P, mq Y, mq qeMq) {}\n      public void ML5(mq a, mq n) {}\n\n    }\n  }\n}\n\npublic class qE {\n  public static class m extends M.GMQ1<Integer> {\n    public class vC0Z extends G<Integer> {\n      @Override public void w(Integer P, Integer Y, Integer qeMq) {}\n      @Override public void ML5(Integer a, Integer n) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test029() {
        check("public class R {\n  public class b6<w> {\n    public void f(w F, w A) {}\n    public void Yb(w o) {}\n\n  }\n}\n\npublic class t {\n  public class pF extends R.b6<String> {\n    @Override public void f(String F, String A) {}\n    @Override public void Yb(String o) {}\n\n  }\n}");
    }


    @Test
    public void test030() {
        check("public class Gt6 {\n  public class Ndi_<h> {\n    public class rE<V> {\n      public void Ck(V c, h X) {}\n      public void A(h hY, V b0SL) {}\n      public void R(h oA, V bYJ, V t5) {}\n\n    }\n  }\n}\n\npublic class vPZ {\n  public class g extends Gt6.Ndi_<Double> {\n    public class J extends rE<String> {\n      @Override public void Ck(String c, Double X) {}\n      @Override public void A(Double hY, String b0SL) {}\n      @Override public void R(Double oA, String bYJ, String t5) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test031() {
        check("public class P9f {\n  public static class sna {\n    public class d<z> {\n      public void v0jWxCFHuXE(z jy, z h, z HtQ) {}\n\n    }\n  }\n}\n\npublic class Xa {\n  public static class j extends P9f.sna {\n    public class W extends d<Double> {\n      @Override public void v0jWxCFHuXE(Double jy, Double h, Double HtQ) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test032() {
        check("public class GX {\n  public static class U_Y<y> {\n    public class p<Eb> {\n      public class EB<N> {\n        public class H {\n          public void R(Eb B, y OBxp9L, N x) {}\n          public void Y(y u2, N JT) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class c {\n  public static class lF6 extends GX.U_Y<Double> {\n    public class AP extends p<String> {\n      public class P extends EB<Double> {\n        public class V extends H {\n          @Override public void R(String B, Double OBxp9L, Double x) {}\n          @Override public void Y(Double u2, Double JT) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test033() {
        check("public class Inr {\n  public class w<V> {\n    public void Jq(V dk, V N, V C56o) {}\n\n  }\n}\n\npublic class u {\n  public class cm extends Inr.w<String> {\n    @Override public void Jq(String dk, String N, String C56o) {}\n\n  }\n}");
    }


    @Test
    public void test034() {
        check("public class Q {\n  public class v<sl> {\n    public void tL(sl j) {}\n    public void T5(sl ri) {}\n    public void N(sl Q83, sl w) {}\n\n  }\n}\n\npublic class M {\n  public class Kc extends Q.v<Double> {\n    @Override public void tL(Double j) {}\n    @Override public void T5(Double ri) {}\n    @Override public void N(Double Q83, Double w) {}\n\n  }\n}");
    }


    @Test
    public void test035() {
        check("public class f {\n  public class S<Dq> {\n    public class Y<IYe_G1> {\n      public class oj<JT> {\n        public void r(IYe_G1 DfzRPmg, Dq A1, IYe_G1 HF7) {}\n        public void mFI(Dq Gm, JT H) {}\n        public void sJl9(Dq B, JT P, IYe_G1 R) {}\n\n      }\n    }\n  }\n}\n\npublic class V {\n  public class ajc extends f.S<Boolean> {\n    public class o extends Y<String> {\n      public class D48 extends oj<Boolean> {\n        @Override public void r(String DfzRPmg, Boolean A1, String HF7) {}\n        @Override public void mFI(Boolean Gm, Boolean H) {}\n        @Override public void sJl9(Boolean B, Boolean P, String R) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test036() {
        check("public class CRaDMPv {\n  public class Q<uU5> {\n    public class t<ms> {\n      public void p(ms CO, ms HMj) {}\n      public void FH(uU5 KV8C) {}\n\n    }\n  }\n}\n\npublic class f {\n  public class FN extends CRaDMPv.Q<Double> {\n    public class o extends t<Integer> {\n      @Override public void p(Integer CO, Integer HMj) {}\n      @Override public void FH(Double KV8C) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test037() {
        check("public class R7FcT {\n  public class L0LJ<O> {\n    public void k(O c, O j, O CvAb) {}\n    public void P(O PXU3, O C3qH) {}\n    public void pj(O i, O T, O I) {}\n\n  }\n}\n\npublic class kh {\n  public class L extends R7FcT.L0LJ<Integer> {\n    @Override public void k(Integer c, Integer j, Integer CvAb) {}\n    @Override public void P(Integer PXU3, Integer C3qH) {}\n    @Override public void pj(Integer i, Integer T, Integer I) {}\n\n  }\n}");
    }


    @Test
    public void test038() {
        check("public class fC9 {\n  public static class d<BLf> {\n    public class XN<Ca> {\n      public class D<H> {\n        public void tU(Ca O, BLf A1kHQ) {}\n        public void v7Pw(BLf a) {}\n\n      }\n    }\n  }\n}\n\npublic class K {\n  public static class ma1q4GM8 extends fC9.d<String> {\n    public class SvT extends XN<Boolean> {\n      public class g extends D<String> {\n        @Override public void tU(Boolean O, String A1kHQ) {}\n        @Override public void v7Pw(String a) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test039() {
        check("public class x {\n  public class KICgv {\n    public class t<su2> {\n      public void yhf(su2 u, su2 xY) {}\n      public void yUD(su2 s, su2 b) {}\n      public void xO(su2 D) {}\n\n    }\n  }\n}\n\npublic class G {\n  public class fNd1kk5 extends x.KICgv {\n    public class k1 extends t<Integer> {\n      @Override public void yhf(Integer u, Integer xY) {}\n      @Override public void yUD(Integer s, Integer b) {}\n      @Override public void xO(Integer D) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test040() {
        check("public class JFD {\n  public class Cm<PY> {\n    public class ei<W> {\n      public class U<o_a> {\n        public void as(PY L, W tx0, PY P) {}\n        public void X(PY wC) {}\n        public void C(PY to, PY oNl, W F) {}\n\n      }\n    }\n  }\n}\n\npublic class Q {\n  public class z extends JFD.Cm<Integer> {\n    public class nb extends ei<String> {\n      public class T extends U<String> {\n        @Override public void as(Integer L, String tx0, Integer P) {}\n        @Override public void X(Integer wC) {}\n        @Override public void C(Integer to, Integer oNl, String F) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test041() {
        check("public class RBz9 {\n  public class k5<O74c7adN3> {\n    public void z0Wd(O74c7adN3 V) {}\n    public void T(O74c7adN3 YTX, O74c7adN3 m, O74c7adN3 Fh3G) {}\n\n  }\n}\n\npublic class Q0 {\n  public class U extends RBz9.k5<Integer> {\n    @Override public void z0Wd(Integer V) {}\n    @Override public void T(Integer YTX, Integer m, Integer Fh3G) {}\n\n  }\n}");
    }


    @Test
    public void test042() {
        check("public class GO {\n  public static class c<cQVOYOm> {\n    public static class JU<N> {\n      public static class y<pz> {\n        public class H<r> {\n          public void h(r OzWr, pz k) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class J {\n  public static class ItSMX extends GO.c<Boolean> {\n    public static class Vw extends JU<Boolean> {\n      public static class bjR extends y<String> {\n        public class P extends H<String> {\n          @Override public void h(String OzWr, String k) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    // @Test
    // public void test043() {
    //     check("public class o {\n  public static class X<L> {\n    public static class q8<v> {\n      public class OFK<wX> {\n        public void P(wX E, L U) {}\n\n      }\n    }\n  }\n}\n\npublic class e0 {\n  public static class cb extends o.X<Double> {\n    public static class k4L extends q8<Integer> {\n      public class m extends OFK<String> {\n        @Override public void P(String E, Double U) {}\n\n      }\n    }\n  }\n}");
    // }


    // @Test
    // public void test044() {
    //     check("public class C {\n  public static class V<E> {\n    public static class Ve<J> {\n      public class k {\n        public class aVjz5<T> {\n          public void Ubf(J BgMi, T FC, J j9) {}\n          public void r(E FH, J o, E x) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class u {\n  public static class BhuUM extends C.V<Double> {\n    public static class F extends Ve<Boolean> {\n      public class G extends k {\n        public class mU extends aVjz5<String> {\n          @Override public void Ubf(Boolean BgMi, String FC, Boolean j9) {}\n          @Override public void r(Double FH, Boolean o, Double x) {}\n\n        }\n      }\n    }\n  }\n}");
    // }


    @Test
    public void test045() {
        check("public class e {\n  public class mFK<Tog> {\n    public class Kqw {\n      public void QyZB(Tog kw, Tog hu, Tog tW) {}\n      public void mZuZ(Tog m) {}\n\n    }\n  }\n}\n\npublic class D {\n  public class c4RQLXWz extends e.mFK<Boolean> {\n    public class fr extends Kqw {\n      @Override public void QyZB(Boolean kw, Boolean hu, Boolean tW) {}\n      @Override public void mZuZ(Boolean m) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test046() {
        check("public class E {\n  public static class f<Hr> {\n    public class q {\n      public void M(Hr UO, Hr XV5, Hr fB) {}\n      public void sL2(Hr tdl7i) {}\n\n    }\n  }\n}\n\npublic class gVDj {\n  public static class d extends E.f<Double> {\n    public class j extends q {\n      @Override public void M(Double UO, Double XV5, Double fB) {}\n      @Override public void sL2(Double tdl7i) {}\n\n    }\n  }\n}");
    }


    // @Test
    // public void test047() {
    //     check("public class v {\n  public static class O<iJ> {\n    public static class G<i> {\n      public static class r {\n        public class b<h6m> {\n          public void y(iJ x, iJ nc, h6m o) {}\n          public void u(i C) {}\n          public void vv(h6m AmO6, h6m s) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class N {\n  public static class rJ extends v.O<Double> {\n    public static class hlD extends G<Boolean> {\n      public static class H extends r {\n        public class K extends b<Double> {\n          @Override public void y(Double x, Double nc, Double o) {}\n          @Override public void u(Boolean C) {}\n          @Override public void vv(Double AmO6, Double s) {}\n\n        }\n      }\n    }\n  }\n}");
    // }


    // @Test
    // public void test048() {
    //     check("public class C {\n  public static class vv<n> {\n    public static class WS1<xyv> {\n      public class D<Ho> {\n        public void l(xyv m, Ho iSY, xyv kTg) {}\n        public void hpl8c(n zm4v) {}\n        public void f(n LeFy, Ho dk) {}\n\n      }\n    }\n  }\n}\n\npublic class zV {\n  public static class R9m extends C.vv<Boolean> {\n    public static class k extends WS1<Double> {\n      public class m71 extends D<String> {\n        @Override public void l(Double m, String iSY, Double kTg) {}\n        @Override public void hpl8c(Boolean zm4v) {}\n        @Override public void f(Boolean LeFy, String dk) {}\n\n      }\n    }\n  }\n}");
    // }

    @Test
    public void test049() {
        check("public class R {\n  public static class Sy<m5> {\n    public static class rbb<P> {\n      public class D<b> {\n        public void I(b C, b V) {}\n        public void v7(P cC2W, b E0) {}\n\n      }\n    }\n  }\n}\n\npublic class i {\n  public static class tMZMjbl extends R.Sy<Double> {\n    public static class Z extends rbb<Integer> {\n      public class fW extends D<Boolean> {\n        @Override public void I(Boolean C, Boolean V) {}\n        @Override public void v7(Integer cC2W, Boolean E0) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test050() {
        check("public class w {\n  public class jq<KeVJ> {\n    public void l(KeVJ Z) {}\n\n  }\n}\n\npublic class N {\n  public class z8 extends w.jq<String> {\n    @Override public void l(String Z) {}\n\n  }\n}");
    }


    @Test
    public void test051() {
        check("public class F {\n  public class m<wa> {\n    public class K<M> {\n      public void LKer(M o, wa K0S) {}\n\n    }\n  }\n}\n\npublic class Kx {\n  public class Z extends F.m<String> {\n    public class Nt extends K<String> {\n      @Override public void LKer(String o, String K0S) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test052() {
        check("public class b {\n  public class zsyu<K> {\n    public void mUmmWUjUd(K YWJ, K N) {}\n\n  }\n}\n\npublic class HG {\n  public class McG extends b.zsyu<Boolean> {\n    @Override public void mUmmWUjUd(Boolean YWJ, Boolean N) {}\n\n  }\n}");
    }


    @Test
    public void test053() {
        check("public class n {\n  public static class FUhkuN<sv_> {\n    public class H<m> {\n      public void WrQ1x(sv_ Q9zI) {}\n\n    }\n  }\n}\n\npublic class l {\n  public static class qYc extends n.FUhkuN<String> {\n    public class TNA extends H<Double> {\n      @Override public void WrQ1x(String Q9zI) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test054() {
        check("public class V9_Jj {\n  public static class s<h> {\n    public class s58<jF> {\n      public class I<B> {\n        public void b(jF ju, B pV, h E) {}\n        public void z(jF S) {}\n        public void A(h F4) {}\n\n      }\n    }\n  }\n}\n\npublic class pZBu {\n  public static class g extends V9_Jj.s<String> {\n    public class iOiXX0 extends s58<Double> {\n      public class EcZLWzO8 extends I<Integer> {\n        @Override public void b(Double ju, Integer pV, String E) {}\n        @Override public void z(Double S) {}\n        @Override public void A(String F4) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test055() {
        check("public class L {\n  public class q<O> {\n    public class V<tM2> {\n      public void TWCUp(O i6, tM2 m) {}\n      public void Uw(O xKo) {}\n\n    }\n  }\n}\n\npublic class e {\n  public class C extends L.q<Boolean> {\n    public class c extends V<Boolean> {\n      @Override public void TWCUp(Boolean i6, Boolean m) {}\n      @Override public void Uw(Boolean xKo) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test056() {
        check("public class k {\n  public class C3K<M> {\n    public class dXo<L> {\n      public void F(L Jz, L WK, L zQh) {}\n      public void N(M K, L q) {}\n      public void Xi(M GCL, M Tv, L Z9) {}\n\n    }\n  }\n}\n\npublic class FK {\n  public class V extends k.C3K<Boolean> {\n    public class u extends dXo<String> {\n      @Override public void F(String Jz, String WK, String zQh) {}\n      @Override public void N(Boolean K, String q) {}\n      @Override public void Xi(Boolean GCL, Boolean Tv, String Z9) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test057() {
        check("public class bVH {\n  public class bp6<jq> {\n    public void MEa(jq E7, jq l) {}\n    public void M(jq X9, jq xQ_EG7N, jq e) {}\n\n  }\n}\n\npublic class Y {\n  public class m extends bVH.bp6<Boolean> {\n    @Override public void MEa(Boolean E7, Boolean l) {}\n    @Override public void M(Boolean X9, Boolean xQ_EG7N, Boolean e) {}\n\n  }\n}");
    }


    // @Test
    // public void test058() {
    //     check("public class Fk93 {\n  public static class yy<u_> {\n    public static class M<T> {\n      public class uaqlS<J0> {\n        public void E(u_ F, J0 Bqx) {}\n        public void qd(J0 Vra4) {}\n\n      }\n    }\n  }\n}\n\npublic class z {\n  public static class qdB extends Fk93.yy<String> {\n    public static class X extends M<Integer> {\n      public class s extends uaqlS<Boolean> {\n        @Override public void E(String F, Boolean Bqx) {}\n        @Override public void qd(Boolean Vra4) {}\n\n      }\n    }\n  }\n}");
    // }


    @Test
    public void test059() {
        check("public class Lilbw {\n  public class WL {\n    public class x<L> {\n      public void Hi(L qCAu2, L vfxQjnLMY, L p) {}\n\n    }\n  }\n}\n\npublic class xK {\n  public class xA8 extends Lilbw.WL {\n    public class q extends x<Boolean> {\n      @Override public void Hi(Boolean qCAu2, Boolean vfxQjnLMY, Boolean p) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test060() {
        check("public class d {\n  public class s<b> {\n    public void dk(b K, b F) {}\n    public void uNK(b ra, b NUaY) {}\n\n  }\n}\n\npublic class m3 {\n  public class o88B extends d.s<Integer> {\n    @Override public void dk(Integer K, Integer F) {}\n    @Override public void uNK(Integer ra, Integer NUaY) {}\n\n  }\n}");
    }


    @Test
    public void test061() {
        check("public class Xy {\n  public class Q {\n    public class V5<l8V> {\n      public void wjFT(l8V rWin, l8V L, l8V d7sd8) {}\n      public void p(l8V gv, l8V J, l8V q) {}\n\n    }\n  }\n}\n\npublic class RT {\n  public class b extends Xy.Q {\n    public class z extends V5<String> {\n      @Override public void wjFT(String rWin, String L, String d7sd8) {}\n      @Override public void p(String gv, String J, String q) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test062() {
        check("public class YQ {\n  public static class oA<fU> {\n    public class f<i7> {\n      public class q<k2m> {\n        public class IU<a> {\n          public void hJu(k2m Ld, fU QB) {}\n          public void z4(i7 YuNgYKz6ic, a dJ, a B) {}\n          public void c(fU n, k2m gTC8) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class jix {\n  public static class x extends YQ.oA<Double> {\n    public class H extends f<Boolean> {\n      public class Z extends q<Double> {\n        public class I extends IU<Integer> {\n          @Override public void hJu(Double Ld, Double QB) {}\n          @Override public void z4(Boolean YuNgYKz6ic, Integer dJ, Integer B) {}\n          @Override public void c(Double n, Double gTC8) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test063() {
        check("public class Z52 {\n  public class a3<ZdZ> {\n    public void Y(ZdZ lj, ZdZ oM, ZdZ zH) {}\n    public void Yd9(ZdZ e, ZdZ i7, ZdZ e3) {}\n    public void Cb(ZdZ h3, ZdZ AZc) {}\n\n  }\n}\n\npublic class ns {\n  public class bcU extends Z52.a3<Double> {\n    @Override public void Y(Double lj, Double oM, Double zH) {}\n    @Override public void Yd9(Double e, Double i7, Double e3) {}\n    @Override public void Cb(Double h3, Double AZc) {}\n\n  }\n}");
    }


    @Test
    public void test064() {
        check("public class tE {\n  public class M<Gs> {\n    public void I(Gs tpInD, Gs p838Rk) {}\n    public void v(Gs Z) {}\n\n  }\n}\n\npublic class AO {\n  public class o extends tE.M<Boolean> {\n    @Override public void I(Boolean tpInD, Boolean p838Rk) {}\n    @Override public void v(Boolean Z) {}\n\n  }\n}");
    }


    @Test
    public void test065() {
        check("public class BB {\n  public static class y78<h> {\n    public static class a {\n      public static class cN<Hn> {\n        public class p3<T> {\n          public void U(T M9, T r, T M) {}\n          public void q(Hn ZD) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class Bs {\n  public static class FeNiTrHD extends BB.y78<Double> {\n    public static class X extends a {\n      public static class c3z_ extends cN<Boolean> {\n        public class b extends p3<Boolean> {\n          @Override public void U(Boolean M9, Boolean r, Boolean M) {}\n          @Override public void q(Boolean ZD) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test066() {
        check("public class t {\n  public static class I<n> {\n    public class dK<Uw3> {\n      public void Ph(n K, Uw3 Ae, n UOV3) {}\n\n    }\n  }\n}\n\npublic class Q {\n  public static class ZZ extends t.I<String> {\n    public class NHx extends dK<Boolean> {\n      @Override public void Ph(String K, Boolean Ae, String UOV3) {}\n\n    }\n  }\n}");
    }


    // @Test
    // public void test067() {
    //     check("public class I {\n  public static class Z<Wz> {\n    public static class J<KfQz> {\n      public static class Q<WL> {\n        public class c<Ypk> {\n          public void ym(Ypk zO, Wz j) {}\n          public void naB(Ypk T) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class C {\n  public static class O extends I.Z<Boolean> {\n    public static class i extends J<Boolean> {\n      public static class s extends Q<Integer> {\n        public class qx extends c<String> {\n          @Override public void ym(String zO, Boolean j) {}\n          @Override public void naB(String T) {}\n\n        }\n      }\n    }\n  }\n}");
    // }


    @Test
    public void test068() {
        check("public class f {\n  public class xLgD<QX> {\n    public class tg {\n      public class e<P> {\n        public void UK(P E) {}\n        public void NNF(P PW, P AC) {}\n\n      }\n    }\n  }\n}\n\npublic class MmF {\n  public class R extends f.xLgD<Double> {\n    public class Hka extends tg {\n      public class O extends e<Boolean> {\n        @Override public void UK(Boolean E) {}\n        @Override public void NNF(Boolean PW, Boolean AC) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test069() {
        check("public class LQ {\n  public static class PUJ<Mr> {\n    public class X<ldq> {\n      public void wd(ldq d, ldq FP3) {}\n      public void cB(ldq O3XaZ) {}\n\n    }\n  }\n}\n\npublic class I {\n  public static class Z extends LQ.PUJ<String> {\n    public class r0 extends X<Integer> {\n      @Override public void wd(Integer d, Integer FP3) {}\n      @Override public void cB(Integer O3XaZ) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test070() {
        check("public class I {\n  public static class Z {\n    public class n<p> {\n      public void dJr(p b0O) {}\n\n    }\n  }\n}\n\npublic class t {\n  public static class keA extends I.Z {\n    public class Gj90 extends n<String> {\n      @Override public void dJr(String b0O) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test071() {
        check("public class o5 {\n  public class M<B> {\n    public class R {\n      public class i<P> {\n        public class xYxAZ3<ux2> {\n          public void g(ux2 Znd2, P P2M) {}\n          public void m3(ux2 ckA7, P uk, P RDI) {}\n          public void v(B wb, B Twn6NSO, B O) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class ioBQl {\n  public class o extends o5.M<String> {\n    public class fT extends R {\n      public class XOD extends i<Double> {\n        public class m extends xYxAZ3<Double> {\n          @Override public void g(Double Znd2, Double P2M) {}\n          @Override public void m3(Double ckA7, Double uk, Double RDI) {}\n          @Override public void v(String wb, String Twn6NSO, String O) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test072() {
        check("public class wt {\n  public static class RNkU<g2K> {\n    public class J {\n      public void xDa(g2K Kk, g2K D, g2K CG) {}\n\n    }\n  }\n}\n\npublic class j {\n  public static class E extends wt.RNkU<Double> {\n    public class Q extends J {\n      @Override public void xDa(Double Kk, Double D, Double CG) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test073() {
        check("public class v {\n  public static class I<x> {\n    public class g<j> {\n      public class K<R> {\n        public class U<A> {\n          public void YI(x X0, R aDfy) {}\n          public void B(R AB, R P) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class CEo {\n  public static class c7 extends v.I<Double> {\n    public class up extends g<String> {\n      public class b extends K<String> {\n        public class m extends U<Boolean> {\n          @Override public void YI(Double X0, String aDfy) {}\n          @Override public void B(String AB, String P) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test074() {
        check("public class O5 {\n  public static class kHWP<Nv> {\n    public class aC<PhC> {\n      public class m<A> {\n        public class I<z> {\n          public void F5(PhC t, Nv II, PhC RzdvR) {}\n          public void Fdx(z j, z b, A Z) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class O {\n  public static class R extends O5.kHWP<Double> {\n    public class tX9 extends aC<Double> {\n      public class w2Mq extends m<Boolean> {\n        public class P extends I<Boolean> {\n          @Override public void F5(Double t, Double II, Double RzdvR) {}\n          @Override public void Fdx(Boolean j, Boolean b, Boolean Z) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test075() {
        check("public class Vp {\n  public class r<w> {\n    public class m<Ii> {\n      public class Te<eq5> {\n        public class N<P> {\n          public void OzI(eq5 VV, w T) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class y {\n  public class F extends Vp.r<Integer> {\n    public class NVTbf extends m<String> {\n      public class syR extends Te<Double> {\n        public class H extends N<Double> {\n          @Override public void OzI(Double VV, Integer T) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test076() {
        check("public class g {\n  public static class vt<RG> {\n    public class FO<kh> {\n      public void UWj(kh F, kh M) {}\n      public void dC0P(RG f, RG D) {}\n\n    }\n  }\n}\n\npublic class Q {\n  public static class s extends g.vt<String> {\n    public class E extends FO<Boolean> {\n      @Override public void UWj(Boolean F, Boolean M) {}\n      @Override public void dC0P(String f, String D) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test077() {
        check("public class g {\n  public class xX<RB5yA> {\n    public class l<G> {\n      public class Q<RhH_> {\n        public void nK(G q, RB5yA L, G jQK) {}\n        public void KBkXF(G oWU) {}\n\n      }\n    }\n  }\n}\n\npublic class v {\n  public class ov extends g.xX<Integer> {\n    public class T extends l<Integer> {\n      public class av extends Q<Boolean> {\n        @Override public void nK(Integer q, Integer L, Integer jQK) {}\n        @Override public void KBkXF(Integer oWU) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test078() {
        check("public class ELYg {\n  public class Bn<Jh> {\n    public class tmCQr<LTWt> {\n      public class e<R6> {\n        public class FN<td> {\n          public void WznmN(td h) {}\n          public void dZUzm(Jh N, R6 om0) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class Qh {\n  public class ES extends ELYg.Bn<Boolean> {\n    public class Gpo extends tmCQr<Double> {\n      public class W extends e<String> {\n        public class Y extends FN<Integer> {\n          @Override public void WznmN(Integer h) {}\n          @Override public void dZUzm(Boolean N, String om0) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test079() {
        check("public class L {\n  public class Sx<N> {\n    public class IT<t> {\n      public void c(t S) {}\n      public void mk0(t Ct, N a, t wfb) {}\n\n    }\n  }\n}\n\npublic class wF {\n  public class d extends L.Sx<Integer> {\n    public class M extends IT<String> {\n      @Override public void c(String S) {}\n      @Override public void mk0(String Ct, Integer a, String wfb) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test080() {
        check("public class Ue {\n  public static class o {\n    public static class N1<ta> {\n      public class u1<qc> {\n        public void p1Ad(ta N, qc vz, qc XEqx) {}\n\n      }\n    }\n  }\n}\n\npublic class D1 {\n  public static class M extends Ue.o {\n    public static class U extends N1<Integer> {\n      public class s extends u1<Boolean> {\n        @Override public void p1Ad(Integer N, Boolean vz, Boolean XEqx) {}\n\n      }\n    }\n  }\n}");
    }


    // @Test
    // public void test081() {
    //     check("public class ySm {\n  public static class l<u> {\n    public static class R<fU4> {\n      public class r<t> {\n        public void L(t IOKp, t o, fU4 sv) {}\n        public void be(u wyAc1, fU4 h) {}\n\n      }\n    }\n  }\n}\n\npublic class P {\n  public static class HC extends ySm.l<Boolean> {\n    public static class XX extends R<Integer> {\n      public class vn extends r<Boolean> {\n        @Override public void L(Boolean IOKp, Boolean o, Integer sv) {}\n        @Override public void be(Boolean wyAc1, Integer h) {}\n\n      }\n    }\n  }\n}");
    // }


    // @Test
    // public void test082() {
    //     check("public class lgo4 {\n  public static class x<RZor> {\n    public static class o3<tmiY> {\n      public class W<GBnti> {\n        public void QLc(GBnti q, GBnti VE) {}\n        public void F(RZor dM, tmiY bq, RZor e) {}\n\n      }\n    }\n  }\n}\n\npublic class Rsf {\n  public static class a extends lgo4.x<Boolean> {\n    public static class L extends o3<String> {\n      public class iJU0 extends W<Boolean> {\n        @Override public void QLc(Boolean q, Boolean VE) {}\n        @Override public void F(Boolean dM, String bq, Boolean e) {}\n\n      }\n    }\n  }\n}");
    // }


    @Test
    public void test083() {
        check("public class yv {\n  public class S<i> {\n    public void j(i L2, i m) {}\n    public void g(i xE0y) {}\n    public void s2YIGRKe(i oUA, i Ufj) {}\n\n  }\n}\n\npublic class Y3 {\n  public class yC extends yv.S<Integer> {\n    @Override public void j(Integer L2, Integer m) {}\n    @Override public void g(Integer xE0y) {}\n    @Override public void s2YIGRKe(Integer oUA, Integer Ufj) {}\n\n  }\n}");
    }


    @Test
    public void test084() {
        check("public class w {\n  public static class t<ts> {\n    public static class v<Ep_Y> {\n      public class uOe<d_3> {\n        public void I(d_3 d) {}\n\n      }\n    }\n  }\n}\n\npublic class F {\n  public static class Ow extends w.t<Boolean> {\n    public static class g extends v<Boolean> {\n      public class h extends uOe<Integer> {\n        @Override public void I(Integer d) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test085() {
        check("public class nC {\n  public class Tq<Ht> {\n    public class U<C> {\n      public void m(Ht J0, C r) {}\n      public void b(Ht So) {}\n      public void Z(C NM, C Wj) {}\n\n    }\n  }\n}\n\npublic class y {\n  public class RO extends nC.Tq<Integer> {\n    public class v extends U<String> {\n      @Override public void m(Integer J0, String r) {}\n      @Override public void b(Integer So) {}\n      @Override public void Z(String NM, String Wj) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test086() {
        check("public class Ppv6x {\n  public class u<gjv> {\n    public void pAL(gjv V) {}\n    public void D(gjv Ss) {}\n    public void S(gjv SMTd, gjv F) {}\n\n  }\n}\n\npublic class yudT4x {\n  public class sQm extends Ppv6x.u<String> {\n    @Override public void pAL(String V) {}\n    @Override public void D(String Ss) {}\n    @Override public void S(String SMTd, String F) {}\n\n  }\n}");
    }


    @Test
    public void test087() {
        check("public class TsZ {\n  public class U9<q> {\n    public class AR<M> {\n      public void hdy(q EMnq5) {}\n      public void NCM(M oR, M B) {}\n      public void G(M t) {}\n\n    }\n  }\n}\n\npublic class TVYJA {\n  public class nfv extends TsZ.U9<Double> {\n    public class i extends AR<Integer> {\n      @Override public void hdy(Double EMnq5) {}\n      @Override public void NCM(Integer oR, Integer B) {}\n      @Override public void G(Integer t) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test088() {
        check("public class Q {\n  public class b<K> {\n    public class eATB3<K8> {\n      public void zX(K sQ) {}\n\n    }\n  }\n}\n\npublic class Ft9 {\n  public class rj extends Q.b<Double> {\n    public class bcMD extends eATB3<Boolean> {\n      @Override public void zX(Double sQ) {}\n\n    }\n  }\n}");
    }


    // @Test
    // public void test089() {
        // check("public class BB {\n  public static class F2mM {\n    public static class tV {\n      public class Ux<p8> {\n        public void jfZ(p8 FvqtVL) {}\n        public void Ojzg9O(p8 f, p8 if, p8 L) {}\n\n      }\n    }\n  }\n}\n\npublic class U {\n  public static class n5g extends BB.F2mM {\n    public static class S extends tV {\n      public class PAo9 extends Ux<Boolean> {\n        @Override public void jfZ(Boolean FvqtVL) {}\n        @Override public void Ojzg9O(Boolean f, Boolean if, Boolean L) {}\n\n      }\n    }\n  }\n}");
    // }


    @Test
    public void test090() {
        check("public class A {\n  public static class p61<tg> {\n    public static class vnXvg<p> {\n      public class JDx<CLPIX> {\n        public class ca<QJ> {\n          public void f(CLPIX EgDTXSt) {}\n          public void w(QJ l) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class xQ {\n  public static class t extends A.p61<Integer> {\n    public static class v9sC2B extends vnXvg<String> {\n      public class PfR extends JDx<Double> {\n        public class oL extends ca<Double> {\n          @Override public void f(Double EgDTXSt) {}\n          @Override public void w(Double l) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test091() {
        check("public class Kx {\n  public static class yfobbvt<fG5> {\n    public class g<k> {\n      public class D<p> {\n        public class Vq {\n          public void ScP5q(p H, p NTj1, p G) {}\n          public void mu(k RK) {}\n          public void c(fG5 kNA, fG5 x) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class qL {\n  public static class t extends Kx.yfobbvt<Double> {\n    public class ET extends g<Double> {\n      public class Qil8 extends D<Boolean> {\n        public class sum extends Vq {\n          @Override public void ScP5q(Boolean H, Boolean NTj1, Boolean G) {}\n          @Override public void mu(Double RK) {}\n          @Override public void c(Double kNA, Double x) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test092() {
        check("public class Ua {\n  public static class LcX<V> {\n    public class u<wY> {\n      public void VfKtf(V MiF, V Q) {}\n      public void ci(wY z0, V LW, wY c) {}\n\n    }\n  }\n}\n\npublic class O {\n  public static class W extends Ua.LcX<String> {\n    public class H0s extends u<Integer> {\n      @Override public void VfKtf(String MiF, String Q) {}\n      @Override public void ci(Integer z0, String LW, Integer c) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test093() {
        check("public class HS {\n  public class kn8WoAk<c0P> {\n    public void s(c0P Hl, c0P E, c0P j) {}\n    public void ncv(c0P Mi1, c0P R) {}\n\n  }\n}\n\npublic class US {\n  public class x3mO extends HS.kn8WoAk<Integer> {\n    @Override public void s(Integer Hl, Integer E, Integer j) {}\n    @Override public void ncv(Integer Mi1, Integer R) {}\n\n  }\n}");
    }


    @Test
    public void test094() {
        check("public class q0 {\n  public class E<oe1moHF> {\n    public void U(oe1moHF F, oe1moHF euW) {}\n    public void f(oe1moHF G) {}\n    public void Xhv(oe1moHF RI) {}\n\n  }\n}\n\npublic class FSS {\n  public class wQm extends q0.E<Boolean> {\n    @Override public void U(Boolean F, Boolean euW) {}\n    @Override public void f(Boolean G) {}\n    @Override public void Xhv(Boolean RI) {}\n\n  }\n}");
    }


    @Test
    public void test095() {
        check("public class bQ {\n  public class zE<d3> {\n    public class lV<k> {\n      public class G<L9y8> {\n        public void g(k q7) {}\n        public void yzw(L9y8 RH, d3 u) {}\n        public void m(k MV, k pGT) {}\n\n      }\n    }\n  }\n}\n\npublic class Nr {\n  public class Dr extends bQ.zE<Boolean> {\n    public class Sorw extends lV<Boolean> {\n      public class jS62Kq extends G<Integer> {\n        @Override public void g(Boolean q7) {}\n        @Override public void yzw(Integer RH, Boolean u) {}\n        @Override public void m(Boolean MV, Boolean pGT) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test096() {
        check("public class v {\n  public static class zo<nW> {\n    public class Sr<ZtY> {\n      public class j<BnYm> {\n        public void KD(BnYm p, ZtY Y) {}\n\n      }\n    }\n  }\n}\n\npublic class I2nrb8xMQd0K {\n  public static class r extends v.zo<Integer> {\n    public class b extends Sr<Integer> {\n      public class X extends j<Boolean> {\n        @Override public void KD(Boolean p, Integer Y) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test097() {
        check("public class N {\n  public class S<x> {\n    public class pw<G> {\n      public void X(x V, x q93) {}\n      public void w(G FcP, G YJ) {}\n\n    }\n  }\n}\n\npublic class a {\n  public class t extends N.S<Double> {\n    public class nP extends pw<Double> {\n      @Override public void X(Double V, Double q93) {}\n      @Override public void w(Double FcP, Double YJ) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test098() {
        check("public class xqMih {\n  public class fwg<B> {\n    public void mu(B SE, B x, B N) {}\n\n  }\n}\n\npublic class Ly {\n  public class qk extends xqMih.fwg<String> {\n    @Override public void mu(String SE, String x, String N) {}\n\n  }\n}");
    }


    @Test
    public void test099() {
        check("public class kSk {\n  public class D<i> {\n    public class g<K> {\n      public void H1vQ(i c, K HGbBTc, K E) {}\n      public void OD9EWl(i L, i P, K B) {}\n\n    }\n  }\n}\n\npublic class w {\n  public class NO extends kSk.D<String> {\n    public class uH extends g<Boolean> {\n      @Override public void H1vQ(String c, Boolean HGbBTc, Boolean E) {}\n      @Override public void OD9EWl(String L, String P, Boolean B) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test100() {
        check("public class Ip {\n  public static class b<f> {\n    public class azj<tb> {\n      public void kw(f M, tb G3f, f L) {}\n      public void N(tb d) {}\n      public void Kyu(tb Je, tb UjO) {}\n\n    }\n  }\n}\n\npublic class SW {\n  public static class hy extends Ip.b<String> {\n    public class S2u extends azj<Integer> {\n      @Override public void kw(String M, Integer G3f, String L) {}\n      @Override public void N(Integer d) {}\n      @Override public void Kyu(Integer Je, Integer UjO) {}\n\n    }\n  }\n}");
    }


    // @Test
    // public void test101() {
    //     check("public class q {\n  public static class w8HyNA<hnZQ> {\n    public static class zcNl<Xo> {\n      public class DNTt<p> {\n        public class x<W> {\n          public void D5m(p X, W c, Xo R) {}\n          public void QO(W Gy2Dt) {}\n          public void y(hnZQ Ne, hnZQ E, W ps) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class FD {\n  public static class raN extends q.w8HyNA<Double> {\n    public static class hY extends zcNl<Double> {\n      public class tA extends DNTt<Boolean> {\n        public class N extends x<Double> {\n          @Override public void D5m(Boolean X, Double c, Double R) {}\n          @Override public void QO(Double Gy2Dt) {}\n          @Override public void y(Double Ne, Double E, Double ps) {}\n\n        }\n      }\n    }\n  }\n}");
    // }


    @Test
    public void test102() {
        check("public class t {\n  public class j<JZ> {\n    public class nDh8<S> {\n      public class E<P> {\n        public void g(S rfs4A, P m, JZ j0) {}\n        public void f(P z, JZ Sg) {}\n\n      }\n    }\n  }\n}\n\npublic class c {\n  public class MR extends t.j<Boolean> {\n    public class Oa extends nDh8<String> {\n      public class LQ extends E<Integer> {\n        @Override public void g(String rfs4A, Integer m, Boolean j0) {}\n        @Override public void f(Integer z, Boolean Sg) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test103() {
        check("public class H {\n  public class fGTr<XK0> {\n    public class Ca<p> {\n      public class A<f> {\n        public class w<RN> {\n          public void FSvc(RN j) {}\n          public void Cvv6(RN VTmZ, RN cJ) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class d_w {\n  public class c extends H.fGTr<Integer> {\n    public class J extends Ca<Integer> {\n      public class Kf extends A<String> {\n        public class Wg extends w<String> {\n          @Override public void FSvc(String j) {}\n          @Override public void Cvv6(String VTmZ, String cJ) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test104() {
        check("public class S {\n  public class Tzb<F7G509> {\n    public class C<BspF_> {\n      public class lmDY<Q9N> {\n        public class y<E> {\n          public void V(E jQ) {}\n          public void w(Q9N X0P_, E Y, Q9N Dj) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class Ry {\n  public class U extends S.Tzb<Integer> {\n    public class B9 extends C<Integer> {\n      public class JP extends lmDY<Double> {\n        public class h extends y<Integer> {\n          @Override public void V(Integer jQ) {}\n          @Override public void w(Double X0P_, Integer Y, Double Dj) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test105() {
        check("public class Lq {\n  public class ZZ<tj> {\n    public class H<M5Y> {\n      public class eI<mOm> {\n        public void F(tj ZQb, M5Y C) {}\n        public void TYbp(M5Y UA) {}\n        public void W6(M5Y cZW6Ia) {}\n\n      }\n    }\n  }\n}\n\npublic class bAx5 {\n  public class U extends Lq.ZZ<Boolean> {\n    public class r extends H<String> {\n      public class Rs1T1 extends eI<Boolean> {\n        @Override public void F(Boolean ZQb, String C) {}\n        @Override public void TYbp(String UA) {}\n        @Override public void W6(String cZW6Ia) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test106() {
        check("public class t9 {\n  public class F<KKeyQ8> {\n    public class W5O<Mn> {\n      public class d3<oazeTQr> {\n        public void Goi(KKeyQ8 y, KKeyQ8 e) {}\n        public void Wkp(Mn P, oazeTQr qCT, oazeTQr q) {}\n        public void g(KKeyQ8 W, KKeyQ8 I, oazeTQr J) {}\n\n      }\n    }\n  }\n}\n\npublic class u {\n  public class y6 extends t9.F<Double> {\n    public class l extends W5O<Boolean> {\n      public class pY extends d3<String> {\n        @Override public void Goi(Double y, Double e) {}\n        @Override public void Wkp(Boolean P, String qCT, String q) {}\n        @Override public void g(Double W, Double I, String J) {}\n\n      }\n    }\n  }\n}");
    }


    // @Test
    // public void test107() {
    //     check("public class c {\n  public static class XV<rK> {\n    public static class bxn<l> {\n      public class n<M2o6> {\n        public void B(rK sg, M2o6 drP, rK m) {}\n\n      }\n    }\n  }\n}\n\npublic class L {\n  public static class w extends c.XV<Double> {\n    public static class rg extends bxn<String> {\n      public class F extends n<String> {\n        @Override public void B(Double sg, String drP, Double m) {}\n\n      }\n    }\n  }\n}");
    // }


    @Test
    public void test108() {
        check("public class oAr1b {\n  public class f<yl7X> {\n    public void Zj(yl7X G, yl7X ry) {}\n    public void h(yl7X P) {}\n\n  }\n}\n\npublic class g2 {\n  public class KkA extends oAr1b.f<Boolean> {\n    @Override public void Zj(Boolean G, Boolean ry) {}\n    @Override public void h(Boolean P) {}\n\n  }\n}");
    }


    @Test
    public void test109() {
        check("public class xR {\n  public class R<m> {\n    public class f9V<Z80> {\n      public class pPRqq<D> {\n        public void hl(Z80 y7h, D V, m Utx) {}\n        public void u(m o, D bci) {}\n        public void k(Z80 C) {}\n\n      }\n    }\n  }\n}\n\npublic class g {\n  public class KI extends xR.R<Integer> {\n    public class nDy extends f9V<Boolean> {\n      public class h extends pPRqq<Integer> {\n        @Override public void hl(Boolean y7h, Integer V, Integer Utx) {}\n        @Override public void u(Integer o, Integer bci) {}\n        @Override public void k(Boolean C) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test110() {
        check("public class Tu {\n  public static class J<Ap> {\n    public class R<aQ> {\n      public class m<X> {\n        public void gKcy(Ap T) {}\n        public void N(X U, Ap NyEu) {}\n\n      }\n    }\n  }\n}\n\npublic class A {\n  public static class M extends Tu.J<Integer> {\n    public class Vs extends R<String> {\n      public class VAOz7 extends m<Integer> {\n        @Override public void gKcy(Integer T) {}\n        @Override public void N(Integer U, Integer NyEu) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test111() {
        check("public class V {\n  public class F<Lu> {\n    public class Q<v> {\n      public void gZ(v x, Lu m) {}\n      public void M(Lu c1, Lu O) {}\n\n    }\n  }\n}\n\npublic class J {\n  public class cublp extends V.F<Boolean> {\n    public class uX extends Q<Boolean> {\n      @Override public void gZ(Boolean x, Boolean m) {}\n      @Override public void M(Boolean c1, Boolean O) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test112() {
        check("public class ir {\n  public static class s<g0> {\n    public class Ii<ZRcb> {\n      public class h<tuAQ> {\n        public void Wnyq(g0 g, ZRcb S, g0 B) {}\n        public void M(tuAQ BCz, tuAQ Ki7) {}\n        public void q5(g0 o, tuAQ xs) {}\n\n      }\n    }\n  }\n}\n\npublic class Id53YK {\n  public static class Xq extends ir.s<Boolean> {\n    public class P extends Ii<Double> {\n      public class p extends h<String> {\n        @Override public void Wnyq(Boolean g, Double S, Boolean B) {}\n        @Override public void M(String BCz, String Ki7) {}\n        @Override public void q5(Boolean o, String xs) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test113() {
        check("public class s {\n  public static class Pb<VP> {\n    public class f<RBLPmehuk> {\n      public void ua0(VP vl, VP jt) {}\n\n    }\n  }\n}\n\npublic class o {\n  public static class q extends s.Pb<Integer> {\n    public class LThaZFsXPF extends f<Boolean> {\n      @Override public void ua0(Integer vl, Integer jt) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test114() {
        check("public class N {\n  public class aT<rOU> {\n    public void U(rOU STv) {}\n    public void H(rOU FGs) {}\n\n  }\n}\n\npublic class AC {\n  public class C extends N.aT<String> {\n    @Override public void U(String STv) {}\n    @Override public void H(String FGs) {}\n\n  }\n}");
    }


    @Test
    public void test115() {
        check("public class uqoE {\n  public static class u3<l> {\n    public class j {\n      public class o<k4> {\n        public void f(k4 rX, k4 Afn, k4 Qu) {}\n        public void no(k4 HIN) {}\n\n      }\n    }\n  }\n}\n\npublic class U {\n  public static class X extends uqoE.u3<Double> {\n    public class YQ extends j {\n      public class A extends o<Double> {\n        @Override public void f(Double rX, Double Afn, Double Qu) {}\n        @Override public void no(Double HIN) {}\n\n      }\n    }\n  }\n}");
    }


    @Test
    public void test116() {
        check("public class K {\n  public class p<AekV> {\n    public class L<T> {\n      public class I<g> {\n        public class d<HP2> {\n          public void x(AekV k, HP2 F) {}\n          public void Q7(HP2 i5) {}\n          public void zZry(g o, HP2 WPhCV) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class cM {\n  public class EuR extends K.p<Integer> {\n    public class Y0gNTS extends L<Boolean> {\n      public class V extends I<Integer> {\n        public class B extends d<String> {\n          @Override public void x(Integer k, String F) {}\n          @Override public void Q7(String i5) {}\n          @Override public void zZry(Integer o, String WPhCV) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test117() {
        check("public class uj {\n  public class o<Y> {\n    public class d<mA> {\n      public void y(Y L, mA QIE, mA apt) {}\n\n    }\n  }\n}\n\npublic class a {\n  public class e extends uj.o<Integer> {\n    public class B extends d<String> {\n      @Override public void y(Integer L, String QIE, String apt) {}\n\n    }\n  }\n}");
    }


    @Test
    public void test118() {
        check("public class A {\n  public class a<Ut> {\n    public class kYJ<t> {\n      public class Q9 {\n        public class Zoi<d> {\n          public void v3(Ut SL, t C, Ut S) {}\n          public void e(d fkv, d aP) {}\n          public void g(d T) {}\n\n        }\n      }\n    }\n  }\n}\n\npublic class N {\n  public class Bs extends A.a<Double> {\n    public class r extends kYJ<String> {\n      public class R extends Q9 {\n        public class z extends Zoi<Boolean> {\n          @Override public void v3(Double SL, String C, Double S) {}\n          @Override public void e(Boolean fkv, Boolean aP) {}\n          @Override public void g(Boolean T) {}\n\n        }\n      }\n    }\n  }\n}");
    }


    @Test
    public void test119() {
        check("public class jX {\n  public static class S<ySg> {\n    public class R<Lz> {\n      public class CUE<T> {\n        public void v(ySg Wqg, T C) {}\n        public void E(Lz mSR, Lz w) {}\n        public void a(ySg d, Lz pI, Lz bu) {}\n\n      }\n    }\n  }\n}\n\npublic class U {\n  public static class Pnb1M3 extends jX.S<String> {\n    public class ni extends R<Double> {\n      public class AW extends CUE<Double> {\n        @Override public void v(String Wqg, Double C) {}\n        @Override public void E(Double mSR, Double w) {}\n        @Override public void a(String d, Double pI, Double bu) {}\n\n      }\n    }\n  }\n}");
    }
}
