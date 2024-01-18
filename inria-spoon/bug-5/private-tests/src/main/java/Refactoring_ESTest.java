import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.reflect.declaration.CtClass;
import spoon.support.compiler.VirtualFile;
import spoon.refactoring.Refactoring;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Refactoring_ESTest {
    @Test
    public void test000() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class i {\n  class qWPnb {\n    class SU {\n      class ub {\n        class RB {\n          class F {\n            class Ws {\n              class l {\n                class h {\n                  class G{}\n                  class Qs {\n\n                    i K = new i();\n                  }\n                  class G2p {\n\n                    ub.RB.F a = new SU.ub.RB.F();\n                  }\n                  class zl4{}\n                  qWPnb.SU.ub f = new qWPnb.SU.ub();\n                }\n                class R{}\n                class fGk {\n\n                  i.qWPnb CWrNsk8r = new i.qWPnb();\n                  ub.RB.F hyYgU = new ub.RB.F();\n                  Ws oj9T = new i.qWPnb.SU.ub.RB.F.Ws();\n                  ub H = new qWPnb.SU.ub();\n                  F Btn = new F();\n                  qWPnb VKa = new qWPnb();\n                }\n                \n              }\n              SU Gmn = new SU();\n            }\n            static class zUc2{}\n            SU b3sm = new qWPnb.SU();\n          }\n          static class z{}\n          class o {\n\n            qWPnb.SU.ub Ry = new SU.ub();\n            RB.o X = new ub.RB.o();\n            i.qWPnb.SU.ub.RB.o i6 = new i.qWPnb.SU.ub.RB.o();\n            SU qvp = new SU();\n          }\n          static class I{}\n          \n        }\n        class K6J {\n\n          i.qWPnb.SU.ub.K6J cy = new SU.ub.K6J();\n        }\n        class y{}\n        class V {\n\n          V e = new ub.V();\n          i s = new i();\n        }\n        i ah = new i();\n      }\n      i.qWPnb k = new qWPnb();\n      ub JEn = new SU.ub();\n      SU uue = new SU();\n    }\n    \n  }\n  qWPnb txrWP = new qWPnb();\n  qWPnb uY = new i.qWPnb();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "vN");
        assertTrue(clazz.prettyprint().contains("class vN "));
        assertFalse(clazz.prettyprint().contains("class i "));
    }

    @Test
    public void test001() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Mopr {\n  class UOW {\n    class g {\n      class G {\n        class l {\n          class uT {\n            class i {\n              class I {\n                class X5 {\n                  class lIT {\n                    class q {\n                      class Zq{}\n                      class Iz {\n\n                        G.l.uT.i.I.X5.lIT.q e = new Mopr.UOW.g.G.l.uT.i.I.X5.lIT.q();\n                      }\n                      class kb {\n\n                        G.l.uT.i.I.X5 t = new l.uT.i.I.X5();\n                      }\n                      class A {\n\n                        A D = new A();\n                      }\n                      \n                    }\n                    class bw{}\n                    \n                  }\n                  class Lq {\n\n                    G.l K = new UOW.g.G.l();\n                  }\n                  G.l.uT k = new l.uT();\n                }\n                \n              }\n              class rzfau {\n\n                Mopr.UOW.g.G.l V = new g.G.l();\n              }\n              G.l.uT.i.I Z = new i.I();\n              g.G.l.uT.i.rzfau nM = new rzfau();\n            }\n            class P{}\n            class R {\n\n              Mopr.UOW.g.G Hb_ = new UOW.g.G();\n            }\n            Mopr.UOW C = new UOW();\n          }\n          class oF{}\n          \n        }\n        class o {\n\n          Mopr ng = new Mopr();\n          Mopr.UOW.g.G.o s = new o();\n        }\n        \n      }\n      UOW.g RHhCIY = new g();\n    }\n    class v {\n\n      UOW Jr = new Mopr.UOW();\n    }\n    \n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "HV");
        assertTrue(clazz.prettyprint().contains("class HV "));
        assertFalse(clazz.prettyprint().contains("class Mopr "));
    }

    @Test
    public void test002() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class t {\n  class N {\n    class RB {\n      class F {\n        class OU {\n          class Yl {\n            class w {\n              class R {\n                class D {\n\n                  RB.F.OU.Yl.w WrO = new F.OU.Yl.w();\n                }\n                class FGGLwCG{}\n                \n              }\n              class k{}\n              class z {\n\n                F.OU ki = new OU();\n                F.OU h = new N.RB.F.OU();\n              }\n              class r {\n\n                t.N ug = new N();\n                t U = new t();\n              }\n              t.N oFWosLC = new t.N();\n              t.N.RB.F a = new t.N.RB.F();\n            }\n            OU.Yl.w m4 = new RB.F.OU.Yl.w();\n          }\n          class n{}\n          class p {\n\n            N.RB.F KiP = new t.N.RB.F();\n          }\n          class rS {\n\n            t Bbi = new t();\n          }\n          \n        }\n        static class H{}\n        class J {\n\n          N.RB Od = new RB();\n        }\n        H d = new H();\n      }\n      \n    }\n    \n  }\n  class P{}\n  static class JN{}\n  class zYNoN {\n\n    t.zYNoN l = new zYNoN();\n    t GxuIQz = new t();\n  }\n  t f3UVYh = new t();\n  t v = new t();\n  t L = new t();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(9);
        Refactoring.changeTypeName(clazz, "Vxuwe0");
        assertTrue(clazz.prettyprint().contains("class Vxuwe0 "));
        assertFalse(clazz.prettyprint().contains("class FGGLwCG "));
    }

    @Test
    public void test003() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class ItrV {\n  class Hu {\n    class K_D {\n      class f {\n        class iF {\n          class YK {\n            class Z {\n              class t_Gjo {\n\n                iF.YK.Z e4 = new f.iF.YK.Z();\n              }\n              class hA {\n\n                f.iF.YK m = new ItrV.Hu.K_D.f.iF.YK();\n              }\n              class Ng{}\n              class Rge{}\n              \n            }\n            class H{}\n            class e{}\n            iF.YK s = new iF.YK();\n          }\n          class n{}\n          class l{}\n          K_D.f.iF tC = new f.iF();\n        }\n        \n      }\n      class Bx {\n\n        ItrV xs = new ItrV();\n      }\n      class F{}\n      class sm{}\n      \n    }\n    class pR6{}\n    class U1 {\n\n      Hu O = new Hu();\n      Hu Zwjl = new Hu();\n      ItrV q = new ItrV();\n      Hu v = new Hu();\n      Hu.U1 Te9UqX = new Hu.U1();\n      ItrV.Hu.U1 f9 = new ItrV.Hu.U1();\n    }\n    \n  }\n  ItrV.Hu RE = new Hu();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "h");
        assertTrue(clazz.prettyprint().contains("class h "));
        assertFalse(clazz.prettyprint().contains("class ItrV "));
    }

    @Test
    public void test004() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class s {\n  class z2j5 {\n    class A {\n      class F {\n        class Y {\n          class FW {\n            class TI {\n              class W {\n\n                s.z2j5.A.F.Y.FW.TI vhXKegpdfzU = new s.z2j5.A.F.Y.FW.TI();\n                A.F.Y.FW G = new s.z2j5.A.F.Y.FW();\n              }\n              class grpiA {\n\n                A zK = new z2j5.A();\n              }\n              class M{}\n              \n            }\n            class d {\n\n              z2j5 hn = new s.z2j5();\n              s Hig = new s();\n              A.F.Y J = new Y();\n            }\n            class AE{}\n            z2j5.A.F e = new z2j5.A.F();\n            A.F s2 = new A.F();\n          }\n          class rFEl {\n\n            z2j5.A.F.Y Z = new A.F.Y();\n          }\n          class l{}\n          z2j5 DB = new s.z2j5();\n          F dXT = new F();\n        }\n        class L{}\n        \n      }\n      class IGSW{}\n      class nFhi{}\n      \n    }\n    static class oI{}\n    static class o{}\n    \n  }\n  class Q {\n\n    s.Q g = new s.Q();\n    s T4 = new s();\n    s yW = new s();\n    s v = new s();\n  }\n  class a {\n\n    a L5O = new s.a();\n    s VF = new s();\n  }\n  class NVR{}\n  s iyZe = new s();\n  s.NVR H = new s.NVR();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "z");
        assertTrue(clazz.prettyprint().contains("class z "));
        assertFalse(clazz.prettyprint().contains("class s "));
    }

    @Test
    public void test005() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class T {\n  class I {\n    class B {\n      class v {\n        class X {\n          class lb {\n            class p {\n              class S {\n                class pDPf {\n                  class c{}\n                  class b {\n\n                    v.X.lb.p RMI = new v.X.lb.p();\n                  }\n                  class tUMJ{}\n                  class u {\n\n                    v V = new B.v();\n                    I.B IG = new I.B();\n                    T.I.B.v.X.lb.p.S Z = new X.lb.p.S();\n                  }\n                  \n                }\n                \n              }\n              class OG {\n\n                T k = new T();\n              }\n              \n            }\n            class Jz {\n\n              v.X.lb.Jz Ln = new lb.Jz();\n              I.B.v.X.lb Q = new v.X.lb();\n              X.lb Uh = new B.v.X.lb();\n            }\n            class Z07Kl{}\n            class Nxjqr{}\n            \n          }\n          class ai {\n\n            T A = new T();\n          }\n          T.I.B.v l = new I.B.v();\n          I.B.v U = new v();\n        }\n        \n      }\n      class oZ {\n\n        T m = new T();\n      }\n      T.I.B x = new T.I.B();\n    }\n    class NB{}\n    \n  }\n  class JTO {\n\n    T Nj = new T();\n  }\n  T.I Y = new I();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "r");
        assertTrue(clazz.prettyprint().contains("class r "));
        assertFalse(clazz.prettyprint().contains("class T "));
    }

    @Test
    public void test006() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class E {\n  class J {\n    class BVj {\n      class e {\n        class AH {\n          class c {\n            class g {\n              class x {\n                class OeOIG {\n                  class k {\n                    class nLg3 {\n                      class v{}\n                      class MTOY_s {\n\n                        OeOIG.k l = new g.x.OeOIG.k();\n                        E.J Um = new E.J();\n                        c.g.x o = new c.g.x();\n                      }\n                      class NT7 {\n\n                        E.J.BVj.e.AH.c.g.x q = new BVj.e.AH.c.g.x();\n                        E.J.BVj.e msGz = new J.BVj.e();\n                        BVj.e.AH.c.g.x.OeOIG.k R = new e.AH.c.g.x.OeOIG.k();\n                      }\n                      \n                    }\n                    class As{}\n                    class PnUV {\n\n                      E.J.BVj.e.AH.c.g.x Q = new J.BVj.e.AH.c.g.x();\n                    }\n                    \n                  }\n                  E.J.BVj.e.AH.c AG = new c();\n                }\n                \n              }\n              class Y{}\n              class n{}\n              \n            }\n            e.AH r = new J.BVj.e.AH();\n          }\n          \n        }\n        class HC{}\n        class Z{}\n        E D = new E();\n        J S = new J();\n        E Vyv4 = new E();\n      }\n      class b {\n\n        E PX = new E();\n      }\n      class A{}\n      J s7 = new J();\n      J Mp = new E.J();\n      J.BVj.b U = new J.BVj.b();\n    }\n    \n  }\n  J Rxv = new E.J();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "MPJ");
        assertTrue(clazz.prettyprint().contains("class MPJ "));
        assertFalse(clazz.prettyprint().contains("class E "));
    }

    @Test
    public void test007() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Bt {\n  class h {\n    class BoM {\n      class id {\n        class ndT {\n          class dIYa {\n            class mL {\n              class oz {\n                class J{}\n                class cAKOllZYU1os {\n\n                  h I_ = new h();\n                }\n                BoM.id.ndT.dIYa z = new BoM.id.ndT.dIYa();\n              }\n              class d {\n\n                h.BoM.id.ndT KJ = new BoM.id.ndT();\n                BoM.id.ndT.dIYa.mL.d kNw = new BoM.id.ndT.dIYa.mL.d();\n                ndT.dIYa.mL.d Bw = new h.BoM.id.ndT.dIYa.mL.d();\n              }\n              class Co{}\n              \n            }\n            class hd {\n\n              h c = new Bt.h();\n              BoM G = new h.BoM();\n              hd O = new ndT.dIYa.hd();\n              Bt.h.BoM.id.ndT.dIYa yr = new h.BoM.id.ndT.dIYa();\n            }\n            class hY{}\n            class o {\n\n              o u = new BoM.id.ndT.dIYa.o();\n              Bt.h.BoM.id.ndT.dIYa.o s = new h.BoM.id.ndT.dIYa.o();\n              Bt x = new Bt();\n              Bt.h t = new Bt.h();\n            }\n            \n          }\n          \n        }\n        \n      }\n      class TB{}\n      \n    }\n    class Uq {\n\n      h.Uq meo = new Bt.h.Uq();\n      Bt Fd = new Bt();\n      Bt C = new Bt();\n      Bt.h nE = new Bt.h();\n    }\n    class uD{}\n    Bt GV = new Bt();\n  }\n  class Q {\n\n    Bt.Q veQ = new Q();\n    Bt u0t = new Bt();\n    Bt Oh7 = new Bt();\n    Q RjzV = new Q();\n  }\n  class RB {\n\n    Bt.RB SU = new RB();\n    Bt Ku = new Bt();\n  }\n  class F{}\n  h L = new Bt.h();\n  RB S = new Bt.RB();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(14);
        Refactoring.changeTypeName(clazz, "W");
        assertTrue(clazz.prettyprint().contains("class W "));
        assertFalse(clazz.prettyprint().contains("class o "));
    }

    @Test
    public void test008() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class mC {\n  class x {\n    class Ka {\n      class C {\n        class z {\n          class ukl {\n            class o {\n              class DJH {\n                class L {\n                  class s {\n\n                    mC AGz = new mC();\n                    DJH.L.s jw = new L.s();\n                  }\n                  class R_BP {\n\n                    C Bj = new x.Ka.C();\n                  }\n                  \n                }\n                class l {\n\n                  C.z.ukl.o CTL2 = new ukl.o();\n                  Ka.C.z.ukl.o.DJH jIu0R = new DJH();\n                }\n                class CI1f{}\n                ukl.o.DJH SI = new DJH();\n                x.Ka.C XN = new mC.x.Ka.C();\n                Ka.C.z.ukl M = new Ka.C.z.ukl();\n              }\n              class g {\n\n                x.Ka.C.z y = new Ka.C.z();\n                ukl.o N = new Ka.C.z.ukl.o();\n                x n = new x();\n                mC.x.Ka.C.z.ukl.o wA = new o();\n                x.Ka yI = new mC.x.Ka();\n              }\n              class ilH{}\n              class c {\n\n                x.Ka.C k = new x.Ka.C();\n                mC.x.Ka Bv = new x.Ka();\n              }\n              \n            }\n            class Lyw{}\n            class rXd {\n\n              x.Ka.C.z.ukl.rXd p = new x.Ka.C.z.ukl.rXd();\n            }\n            mC K = new mC();\n            x eb = new x();\n          }\n          \n        }\n        class e {\n\n          mC r = new mC();\n          mC vT = new mC();\n        }\n        \n      }\n      x PWBJ = new x();\n      mC.x D = new mC.x();\n      mC cYi = new mC();\n    }\n    class J2v{}\n    \n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "d");
        assertTrue(clazz.prettyprint().contains("class d "));
        assertFalse(clazz.prettyprint().contains("class mC "));
    }

    @Test
    public void test009() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class i {\n  class Lh {\n    class B {\n      class ibbW {\n        class fM {\n          class I {\n            class P {\n              class p {\n\n                fM ii = new B.ibbW.fM();\n              }\n              class H1 {\n\n                fM.I a = new B.ibbW.fM.I();\n              }\n              class Cn{}\n              class Sg4 {\n\n                fM.I.P.Sg4 P9 = new i.Lh.B.ibbW.fM.I.P.Sg4();\n                i.Lh.B.ibbW.fM.I.P RN = new i.Lh.B.ibbW.fM.I.P();\n              }\n              \n            }\n            class h {\n\n              ibbW.fM v = new fM();\n            }\n            class LG9td {\n\n              i t = new i();\n              Lh.B.ibbW.fM nw = new Lh.B.ibbW.fM();\n            }\n            class JOM6 {\n\n              Lh.B.ibbW.fM K = new B.ibbW.fM();\n              B.ibbW.fM b9E1 = new i.Lh.B.ibbW.fM();\n              I.JOM6 O = new i.Lh.B.ibbW.fM.I.JOM6();\n            }\n            \n          }\n          class C6 {\n\n            B l = new i.Lh.B();\n            i Cnj = new i();\n          }\n          \n        }\n        class u {\n\n          i.Lh.B.ibbW.u tY = new ibbW.u();\n        }\n        class Edl{}\n        class CL{}\n        \n      }\n      class Q9 {\n\n        i iF = new i();\n      }\n      class A{}\n      i.Lh.B phw = new i.Lh.B();\n    }\n    \n  }\n  static class J{}\n  class Obj0 {\n\n    i.Obj0 jdNgrB1 = new Obj0();\n    i g = new i();\n    i ZT = new i();\n    i Z = new i();\n    i DNXe = new i();\n  }\n  Lh XOHMp = new Lh();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "LEQ");
        assertTrue(clazz.prettyprint().contains("class LEQ "));
        assertFalse(clazz.prettyprint().contains("class i "));
    }

    @Test
    public void test010() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class j {\n  class fm0 {\n    class uTcz {\n      class XO_ {\n        class ve {\n          class H0 {\n            class M {\n              class B {\n                class an {\n                  class twda{}\n                  class CeQp{}\n                  class hm{}\n                  \n                }\n                class i {\n\n                  XO_.ve HKI = new uTcz.XO_.ve();\n                }\n                XO_ d = new fm0.uTcz.XO_();\n                j c = new j();\n                XO_ Qov = new j.fm0.uTcz.XO_();\n                M L88y = new M();\n              }\n              class R {\n\n                j.fm0 e4 = new fm0();\n                fm0.uTcz.XO_.ve.H0.M.R Df = new XO_.ve.H0.M.R();\n              }\n              class bUo {\n\n                fm0.uTcz.XO_.ve.H0 kt = new ve.H0();\n              }\n              class l {\n\n                j.fm0.uTcz.XO_.ve.H0.M qqfG = new ve.H0.M();\n                j.fm0 x0 = new fm0();\n                fm0.uTcz.XO_.ve.H0.M.l KQbrIT = new l();\n                fm0.uTcz.XO_.ve.H0 w = new fm0.uTcz.XO_.ve.H0();\n              }\n              XO_ lzuI = new fm0.uTcz.XO_();\n            }\n            fm0 m = new fm0();\n          }\n          \n        }\n        class aeiKIzrIz {\n\n          XO_.aeiKIzrIz C7E = new uTcz.XO_.aeiKIzrIz();\n        }\n        class IfE {\n\n          fm0.uTcz.XO_ r = new fm0.uTcz.XO_();\n        }\n        class n {\n\n          uTcz z = new fm0.uTcz();\n          uTcz Z = new uTcz();\n        }\n        j kX = new j();\n        fm0 oyeJ = new j.fm0();\n        j HV = new j();\n        j y = new j();\n        fm0 B5 = new fm0();\n        j.fm0 v = new j.fm0();\n      }\n      class Huu41 {\n\n        uTcz OnTN = new j.fm0.uTcz();\n      }\n      class G {\n\n        fm0 Vzw = new j.fm0();\n        j p6G = new j();\n        fm0.uTcz f = new fm0.uTcz();\n        fm0 fbm = new j.fm0();\n        uTcz q = new uTcz();\n      }\n      \n    }\n    uTcz b = new fm0.uTcz();\n    fm0 S = new j.fm0();\n    fm0.uTcz Y8 = new uTcz();\n    uTcz gVK = new uTcz();\n    j.fm0 V7 = new fm0();\n    j.fm0.uTcz E = new uTcz();\n  }\n  static class e{}\n  fm0 uz = new j.fm0();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Q5");
        assertTrue(clazz.prettyprint().contains("class Q5 "));
        assertFalse(clazz.prettyprint().contains("class j "));
    }

    @Test
    public void test011() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class M {\n  class qUO {\n    class yq {\n      class D {\n        class p {\n          class o0 {\n            class L {\n              class q0d {\n                class Y{}\n                class oK_{}\n                class kMG{}\n                class K {\n\n                  qUO.yq.D.p.o0.L.q0d rq = new L.q0d();\n                  yq NT = new M.qUO.yq();\n                  qUO.yq vNqs = new yq();\n                  qUO.yq.D y3F = new qUO.yq.D();\n                  qUO.yq.D.p.o0.L.q0d gBh = new p.o0.L.q0d();\n                }\n                \n              }\n              \n            }\n            yq w = new qUO.yq();\n          }\n          qUO.yq Ib = new yq();\n        }\n        class u {\n\n          qUO ex = new M.qUO();\n          M.qUO zv = new M.qUO();\n          yq.D.u W = new D.u();\n        }\n        class e{}\n        class Z{}\n        \n      }\n      qUO.yq bH = new yq();\n      yq.D z = new D();\n      qUO F6 = new qUO();\n    }\n    static class a{}\n    class C3{}\n    M.qUO.a s = new qUO.a();\n    qUO.C3 iHrG = new qUO.C3();\n  }\n  class J7 {\n\n    M.J7 q = new J7();\n    M RQ = new M();\n    M f = new M();\n  }\n  class qh {\n\n    M.qh YN = new qh();\n    M NB = new M();\n    M b = new M();\n    M.qh cy = new qh();\n  }\n  class t{}\n  M.qh vKn = new M.qh();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "OP88");
        assertTrue(clazz.prettyprint().contains("class OP88 "));
        assertFalse(clazz.prettyprint().contains("class M "));
    }

    @Test
    public void test012() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class F {\n  class Rq {\n    class XNC {\n      class Yl {\n        class c {\n          class a {\n            class k {\n              static class X{}\n              class y{}\n              \n            }\n            class o {\n\n              F Tx = new F();\n            }\n            class QA {\n\n              Yl.c.a.QA B = new F.Rq.XNC.Yl.c.a.QA();\n              Rq l = new Rq();\n              F GX = new F();\n              Rq.XNC.Yl Gp = new F.Rq.XNC.Yl();\n              F.Rq.XNC.Yl.c x17Re = new F.Rq.XNC.Yl.c();\n            }\n            F MY2MFe = new F();\n            c Je = new Rq.XNC.Yl.c();\n          }\n          class d{}\n          class PkNIQ {\n\n            F EJ = new F();\n          }\n          c Y = new F.Rq.XNC.Yl.c();\n        }\n        class Mys {\n\n          Yl Q = new XNC.Yl();\n          F D = new F();\n          Rq.XNC.Yl Ino1 = new Yl();\n        }\n        \n      }\n      static class TOL{}\n      static class m{}\n      F O = new F();\n      Rq WAgd = new F.Rq();\n    }\n    static class nVk{}\n    class oqqXj {\n\n      Rq J = new Rq();\n      oqqXj Bp = new oqqXj();\n      F.Rq.oqqXj u2 = new oqqXj();\n      F.Rq.oqqXj jGf = new Rq.oqqXj();\n      Rq nAE = new Rq();\n      F E = new F();\n    }\n    \n  }\n  static class t{}\n  class N62NLyqF3ra {\n\n    F NY = new F();\n    F I8 = new F();\n    N62NLyqF3ra zZzsw9 = new F.N62NLyqF3ra();\n    N62NLyqF3ra Pv = new F.N62NLyqF3ra();\n    F TDTZ = new F();\n  }\n  class Bx {\n\n    F i = new F();\n    Bx ySpLqZXW = new F.Bx();\n    F.Bx JiN = new F.Bx();\n  }\n  F Mr51ZTziWC4_t2d = new F();\n  F TV = new F();\n  F f = new F();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(2);
        Refactoring.changeTypeName(clazz, "h");
        assertTrue(clazz.prettyprint().contains("class h "));
        assertFalse(clazz.prettyprint().contains("class XNC "));
    }

    @Test
    public void test013() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Jv {\n  class Y {\n    class kgl {\n      class DeOz {\n        class B {\n          class m {\n            class H {\n              class Sv9Q {\n                class mG {\n\n                  Jv oUq = new Jv();\n                  Jv c = new Jv();\n                  DeOz.B Ys = new kgl.DeOz.B();\n                }\n                class k{}\n                Jv.Y.kgl.DeOz.B.m.H h = new Y.kgl.DeOz.B.m.H();\n                kgl.DeOz sDJ = new Y.kgl.DeOz();\n              }\n              class tQO{}\n              class l {\n\n                Jv U = new Jv();\n                DeOz.B P = new Y.kgl.DeOz.B();\n              }\n              DeOz.B.m.H.l Fr5 = new DeOz.B.m.H.l();\n              Jv.Y yd = new Y();\n            }\n            class J6Dj9s{}\n            class f{}\n            Y.kgl.DeOz.B G = new Jv.Y.kgl.DeOz.B();\n            B.m.H U7ETQ = new B.m.H();\n            Jv.Y.kgl n = new Y.kgl();\n          }\n          B.m sC86 = new DeOz.B.m();\n        }\n        class i{}\n        class S{}\n        \n      }\n      \n    }\n    class BL{}\n    class I {\n\n      Jv A = new Jv();\n    }\n    Jv D = new Jv();\n    Y ajBQA = new Y();\n  }\n  class nwT{}\n  class JYo {\n\n    Jv w = new Jv();\n    JYo wO9 = new Jv.JYo();\n    JYo S_uZs9I = new Jv.JYo();\n  }\n  class d {\n\n    Jv.d gK = new d();\n  }\n  Jv.nwT E = new nwT();\n  Jv qGC = new Jv();\n  Jv mxMQ8ukfYL = new Jv();\n  d ZR = new d();\n  Jv.nwT z = new Jv.nwT();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "RrQ");
        assertTrue(clazz.prettyprint().contains("class RrQ "));
        assertFalse(clazz.prettyprint().contains("class Jv "));
    }

    @Test
    public void test014() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class y7YnyRTjX {\n  class vM {\n    class Q {\n      class eb {\n        class i {\n          class n {\n            class v {\n              class m {\n                class Ah17a{}\n                class dX {\n\n                  eb It0 = new Q.eb();\n                }\n                eb O = new eb();\n                y7YnyRTjX.vM.Q.eb.i.n.v.m SxE = new i.n.v.m();\n              }\n              class Te{}\n              class k4{}\n              \n            }\n            class u{}\n            class Nt {\n\n              n To1xcv = new vM.Q.eb.i.n();\n              eb.i.n.Nt M = new n.Nt();\n            }\n            class Csb {\n\n              y7YnyRTjX H = new y7YnyRTjX();\n              eb.i.n.Csb m1V = new Csb();\n              eb.i.n t = new vM.Q.eb.i.n();\n              Q.eb.i.n.Csb p = new vM.Q.eb.i.n.Csb();\n              n.Csb h = new n.Csb();\n              vM D = new vM();\n            }\n            Q.eb.i fmVL69 = new y7YnyRTjX.vM.Q.eb.i();\n            Q V = new vM.Q();\n          }\n          y7YnyRTjX r1 = new y7YnyRTjX();\n          Q.eb V4 = new eb();\n        }\n        Q.eb uh = new vM.Q.eb();\n        vM.Q.eb.i q930jic6 = new y7YnyRTjX.vM.Q.eb.i();\n      }\n      class b{}\n      class qq{}\n      class Km {\n\n        vM.Q g = new vM.Q();\n        y7YnyRTjX.vM.Q.Km MqGIu = new Q.Km();\n        vM.Q.Km H_ = new y7YnyRTjX.vM.Q.Km();\n        vM NsJif = new vM();\n      }\n      \n    }\n    \n  }\n  class ib {\n\n    y7YnyRTjX B = new y7YnyRTjX();\n    ib x = new ib();\n    ib N = new ib();\n    y7YnyRTjX qKdZFj = new y7YnyRTjX();\n  }\n  static class X{}\n  class Ng0x {\n\n    y7YnyRTjX R = new y7YnyRTjX();\n  }\n  Ng0x o = new Ng0x();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "f");
        assertTrue(clazz.prettyprint().contains("class f "));
        assertFalse(clazz.prettyprint().contains("class y7YnyRTjX "));
    }

    @Test
    public void test015() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class F {\n  class cF {\n    class Vh {\n      class E {\n        class HF {\n          class m {\n            class P {\n              class sf8{}\n              class z {\n\n                m.P.z B88g = new P.z();\n              }\n              class pBC{}\n              class R{}\n              cF FD = new cF();\n              F.cF f = new cF();\n            }\n            class h{}\n            class c {\n\n              HF.m jR = new cF.Vh.E.HF.m();\n            }\n            F.cF.Vh L = new Vh();\n            F.cF.Vh.E PV = new E();\n          }\n          E gO = new E();\n          F a = new F();\n          E B = new F.cF.Vh.E();\n          F p = new F();\n        }\n        class n{}\n        class L0{}\n        class b9z {\n\n          cF.Vh.E.b9z K = new b9z();\n        }\n        \n      }\n      class s{}\n      \n    }\n    class xd4u{}\n    \n  }\n  static class D{}\n  class j3sP {\n\n    j3sP Oa = new j3sP();\n  }\n  class d{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "b");
        assertTrue(clazz.prettyprint().contains("class b "));
        assertFalse(clazz.prettyprint().contains("class F "));
    }

    @Test
    public void test016() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class uG {\n  class B4 {\n    class q {\n      class TC6 {\n        class Fb {\n          class u {\n            class bTEjV {\n              class OE {\n                class ls{}\n                class I{}\n                class D{}\n                \n              }\n              class pEmekZ{}\n              u.bTEjV.OE C = new uG.B4.q.TC6.Fb.u.bTEjV.OE();\n              q HhFu = new q();\n            }\n            \n          }\n          class L {\n\n            TC6.Fb.L ha = new q.TC6.Fb.L();\n          }\n          class t {\n\n            uG.B4 bb = new uG.B4();\n            Fb.t Ffw = new t();\n            uG.B4.q m = new B4.q();\n            q fgUxL = new q();\n            B4 Z = new B4();\n          }\n          class l7f{}\n          uG.B4 eKtG = new B4();\n        }\n        class YwY {\n\n          uG.B4.q.TC6 QE = new uG.B4.q.TC6();\n          B4 O8 = new uG.B4();\n        }\n        class N {\n\n          q.TC6 Zixu = new q.TC6();\n          B4.q.TC6 F = new TC6();\n          B4.q j_vWAX0 = new q();\n        }\n        class s {\n\n          B4 z = new B4();\n        }\n        B4 y = new B4();\n        Fb b = new q.TC6.Fb();\n      }\n      uG.B4.q h = new B4.q();\n      uG.B4.q.TC6 o = new uG.B4.q.TC6();\n    }\n    class jq{}\n    static class mO{}\n    \n  }\n  class PDH{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "qAo");
        assertTrue(clazz.prettyprint().contains("class qAo "));
        assertFalse(clazz.prettyprint().contains("class uG "));
    }

    @Test
    public void test017() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class z {\n  class pj {\n    class Xd {\n      class w {\n        class y6 {\n          class fZ {\n            class eQT {\n              class B {\n                class TvWZ{}\n                class p {\n\n                  pj Y = new z.pj();\n                  Xd Ba = new pj.Xd();\n                }\n                class gxKC1 {\n\n                  pj o = new z.pj();\n                }\n                z.pj.Xd.w.y6.fZ.eQT v = new pj.Xd.w.y6.fZ.eQT();\n              }\n              class S{}\n              class y{}\n              w e6 = new w();\n              pj a = new z.pj();\n              z.pj A = new z.pj();\n            }\n            static class J{}\n            class GfJt {\n\n              z.pj.Xd.w.y6.fZ.GfJt FxhI = new pj.Xd.w.y6.fZ.GfJt();\n              y6.fZ jz1 = new w.y6.fZ();\n              GfJt T = new Xd.w.y6.fZ.GfJt();\n            }\n            \n          }\n          static class mfR{}\n          class M_ {\n\n            z.pj N = new z.pj();\n          }\n          \n        }\n        class AmG{}\n        z.pj.Xd m = new Xd();\n      }\n      static class K{}\n      class cp {\n\n        Xd R4x = new Xd();\n        pj.Xd.cp yb6 = new pj.Xd.cp();\n        z.pj Q = new pj();\n        z.pj.Xd.cp L = new pj.Xd.cp();\n      }\n      z.pj.Xd l = new Xd();\n    }\n    z.pj XwK = new pj();\n  }\n  z.pj V = new pj();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "D");
        assertTrue(clazz.prettyprint().contains("class D "));
        assertFalse(clazz.prettyprint().contains("class z "));
    }

    @Test
    public void test018() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class H {\n  class ojIA {\n    class g {\n      class I {\n        class W_O {\n          class u {\n            class Q {\n              class moRoq {\n\n                H.ojIA w = new H.ojIA();\n              }\n              class z7n6j {\n\n                Q.z7n6j UdEl = new I.W_O.u.Q.z7n6j();\n              }\n              \n            }\n            class V {\n\n              H a = new H();\n              H y5it = new H();\n              u.V Zn = new g.I.W_O.u.V();\n            }\n            class R_ {\n\n              g.I Qc = new g.I();\n              ojIA.g.I tSw_ = new g.I();\n            }\n            class CtuDVL{}\n            \n          }\n          class Z {\n\n            H.ojIA.g.I q = new ojIA.g.I();\n          }\n          class i4G {\n\n            g bF = new ojIA.g();\n            ojIA.g.I J = new g.I();\n            I.W_O p = new H.ojIA.g.I.W_O();\n          }\n          H kx2 = new H();\n        }\n        static class W_u{}\n        static class n{}\n        class N {\n\n          I XzponQF = new I();\n        }\n        ojIA YL = new ojIA();\n        ojIA G = new ojIA();\n      }\n      class OnZ {\n\n        H hwi = new H();\n      }\n      ojIA.g.OnZ D = new H.ojIA.g.OnZ();\n      ojIA.g.I It = new I();\n    }\n    class y{}\n    class U{}\n    static class W{}\n    \n  }\n  H K = new H();\n  ojIA Jx = new ojIA();\n  ojIA WNs = new ojIA();\n  H.ojIA R = new H.ojIA();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "d");
        assertTrue(clazz.prettyprint().contains("class d "));
        assertFalse(clazz.prettyprint().contains("class H "));
    }

    @Test
    public void test019() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class He {\n  class L {\n    class O {\n      class M {\n        class a {\n          class y {\n            class kBd {\n              class x1 {\n                class g {\n                  class Op{}\n                  class J2{}\n                  class yGzz1M7jjAXxx{}\n                  class Y{}\n                  \n                }\n                class i{}\n                He.L.O.M.a.y o = new O.M.a.y();\n                O W = new L.O();\n                L.O.M S = new M();\n              }\n              \n            }\n            class c{}\n            \n          }\n          He.L.O.M.a.y ZF = new a.y();\n          L V = new He.L();\n          a.y R7 = new O.M.a.y();\n          L.O.M.a Q = new L.O.M.a();\n        }\n        class d {\n\n          He H = new He();\n        }\n        L.O flKzQjw = new L.O();\n      }\n      class ci_{}\n      \n    }\n    static class CxY{}\n    static class K8{}\n    static class js{}\n    \n  }\n  class e {\n\n    He.e KC = new He.e();\n  }\n  He.e L1Q = new e();\n  He Qh = new He();\n  He.L Rc = new L();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "qiFA");
        assertTrue(clazz.prettyprint().contains("class qiFA "));
        assertFalse(clazz.prettyprint().contains("class He "));
    }

    @Test
    public void test020() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class G {\n  class BK {\n    class i {\n      class dP {\n        class a0_ {\n          class Un {\n            class v {\n              class rt{}\n              class X {\n\n                G eRE = new G();\n              }\n              class JNL{}\n              class phIS {\n\n                dP.a0_ yT = new dP.a0_();\n              }\n              G.BK.i.dP mzZXVX = new dP();\n            }\n            class u{}\n            class Yo{}\n            class Yh{}\n            \n          }\n          class f {\n\n            G D = new G();\n            i.dP.a0_.f sHc7O = new a0_.f();\n          }\n          BK.i AX = new G.BK.i();\n          G.BK g = new G.BK();\n          a0_ EK = new a0_();\n          G.BK.i.dP.a0_ J9 = new dP.a0_();\n        }\n        class q{}\n        class t{}\n        class R{}\n        BK.i.dP.R B = new BK.i.dP.R();\n        G.BK.i E3 = new BK.i();\n      }\n      class pG{}\n      class eq1{}\n      class K {\n\n        G P = new G();\n      }\n      G.BK w5 = new BK();\n      dP V9 = new dP();\n    }\n    class Ty{}\n    BK w = new G.BK();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(13);
        Refactoring.changeTypeName(clazz, "p");
        assertTrue(clazz.prettyprint().contains("class p "));
        assertFalse(clazz.prettyprint().contains("class Yh "));
    }

    @Test
    public void test021() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class S7 {\n  class T8 {\n    class c {\n      class HQa {\n        class DxiC {\n          class G {\n            class ZQh {\n              class O {\n                class ls {\n                  class d{}\n                  \n                }\n                class nSZ {\n\n                  HQa.DxiC.G.ZQh.O.nSZ l3 = new O.nSZ();\n                  T8.c.HQa xY = new S7.T8.c.HQa();\n                  HQa.DxiC.G.ZQh.O.nSZ w = new DxiC.G.ZQh.O.nSZ();\n                }\n                \n              }\n              \n            }\n            class C {\n\n              S7.T8 vl = new S7.T8();\n              c.HQa.DxiC b = new DxiC();\n            }\n            class Nj {\n\n              S7.T8.c.HQa zC = new T8.c.HQa();\n            }\n            class x {\n\n              DxiC W = new T8.c.HQa.DxiC();\n              T8.c.HQa.DxiC.G l = new G();\n            }\n            \n          }\n          S7 r = new S7();\n          T8.c.HQa.DxiC czOwmEX = new HQa.DxiC();\n          c.HQa.DxiC.G U = new HQa.DxiC.G();\n        }\n        class g{}\n        \n      }\n      class N {\n\n        c Lg = new c();\n        N oH = new N();\n      }\n      class vC {\n\n        S7 z = new S7();\n        c.vC I = new vC();\n        S7 y1kg = new S7();\n        S7.T8.c s = new S7.T8.c();\n        S7 kLu = new S7();\n        T8.c.vC Mv = new c.vC();\n        S7.T8.c.vC L = new c.vC();\n      }\n      T8.c yuq = new c();\n    }\n    class kq4 {\n\n      S7.T8 EC = new T8();\n    }\n    class eM {\n\n      T8 V = new T8();\n      eM Q = new S7.T8.eM();\n    }\n    S7 q = new S7();\n  }\n  class p{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Z");
        assertTrue(clazz.prettyprint().contains("class Z "));
        assertFalse(clazz.prettyprint().contains("class S7 "));
    }

    @Test
    public void test022() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class e {\n  class V {\n    class Q {\n      class c {\n        class k {\n          class m {\n            class G {\n              class RX {\n                class H {\n                  class Quc {\n                    class t6yEPd {\n                      class q {\n\n                        e BG = new e();\n                      }\n                      class bE0{}\n                      class Uo{}\n                      e n = new e();\n                    }\n                    class N {\n\n                      V.Q.c.k.m.G s = new k.m.G();\n                      Q.c.k.m.G.RX.H.Quc.N KZ = new Quc.N();\n                    }\n                    class AL{}\n                    class Uc {\n\n                      V.Q.c.k.m.G.RX.H.Quc.Uc hY = new H.Quc.Uc();\n                      e ru = new e();\n                      c.k i2LPB8w = new e.V.Q.c.k();\n                    }\n                    \n                  }\n                  class zT {\n\n                    H.zT DL = new G.RX.H.zT();\n                    e WC = new e();\n                    k j0f = new Q.c.k();\n                    e.V.Q ZX = new V.Q();\n                  }\n                  m X = new e.V.Q.c.k.m();\n                }\n                class a {\n\n                  e.V.Q.c.k o = new e.V.Q.c.k();\n                  e R = new e();\n                  RX.a Oxo = new G.RX.a();\n                }\n                \n              }\n              \n            }\n            \n          }\n          class Y2 {\n\n            Q.c.k WdwG9 = new e.V.Q.c.k();\n            V.Q p = new V.Q();\n          }\n          V ENBX = new V();\n          V.Q.c NOwZ = new V.Q.c();\n        }\n        \n      }\n      class vPue_{}\n      V.Q RDv = new e.V.Q();\n    }\n    \n  }\n  e NaT = new e();\n  e U = new e();\n  e.V D = new e.V();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "d");
        assertTrue(clazz.prettyprint().contains("class d "));
        assertFalse(clazz.prettyprint().contains("class e "));
    }

    @Test
    public void test023() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class ZWmy {\n  class RzMr {\n    class h {\n      class sM {\n        class H2v {\n          class t {\n            class kg {\n              class SB {\n                class G {\n                  class tdA8N {\n\n                    ZWmy y = new ZWmy();\n                    ZWmy lUh = new ZWmy();\n                    ZWmy j = new ZWmy();\n                    ZWmy.RzMr i = new RzMr();\n                    SB.G.tdA8N K = new t.kg.SB.G.tdA8N();\n                  }\n                  class Ppx {\n\n                    RzMr a = new ZWmy.RzMr();\n                  }\n                  class s0 {\n\n                    H2v.t.kg.SB.G.s0 k = new G.s0();\n                  }\n                  \n                }\n                class g{}\n                class Z{}\n                \n              }\n              class v{}\n              \n            }\n            static class whD{}\n            class d {\n\n              h.sM o = new sM();\n              H2v.t Tw3 = new H2v.t();\n            }\n            ZWmy.RzMr.h.sM.H2v.t W = new sM.H2v.t();\n          }\n          class tMp{}\n          \n        }\n        \n      }\n      static class oi{}\n      class L {\n\n        ZWmy lDlT0 = new ZWmy();\n        ZWmy.RzMr QM = new ZWmy.RzMr();\n      }\n      \n    }\n    class w {\n\n      RzMr Yr = new ZWmy.RzMr();\n    }\n    \n  }\n  class dV {\n\n    ZWmy nl1vmy = new ZWmy();\n    ZWmy.dV rbpx = new ZWmy.dV();\n  }\n  ZWmy eT = new ZWmy();\n  ZWmy ZHtEKb9MyZ = new ZWmy();\n  dV G18 = new dV();\n  RzMr T = new RzMr();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Rj");
        assertTrue(clazz.prettyprint().contains("class Rj "));
        assertFalse(clazz.prettyprint().contains("class ZWmy "));
    }

    @Test
    public void test024() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class V {\n  class Gz {\n    class S {\n      class L {\n        class N {\n          class s {\n            class jWY {\n              class U{}\n              \n            }\n            class d {\n\n              Gz.S.L.N.s.d kd = new V.Gz.S.L.N.s.d();\n            }\n            class eFyRk_DG {\n\n              V T = new V();\n            }\n            N.s.jWY jIP = new V.Gz.S.L.N.s.jWY();\n          }\n          class PO {\n\n            L.N Fk = new V.Gz.S.L.N();\n            V.Gz k = new V.Gz();\n            Gz.S.L.N.PO VW = new Gz.S.L.N.PO();\n          }\n          class ny{}\n          Gz.S.L.N eId = new L.N();\n        }\n        class Wx2u {\n\n          V m = new V();\n          S W = new S();\n        }\n        class dD {\n\n          S.L.dD G = new S.L.dD();\n          V t = new V();\n          S.L Kj = new S.L();\n        }\n        \n      }\n      class f{}\n      class F{}\n      class gN{}\n      S.F l7 = new S.F();\n      Gz.S uhV = new V.Gz.S();\n    }\n    static class MHY{}\n    class JU {\n\n      V.Gz g = new Gz();\n    }\n    V.Gz dB = new V.Gz();\n    V.Gz.JU j = new Gz.JU();\n  }\n  static class v4{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "l");
        assertTrue(clazz.prettyprint().contains("class l "));
        assertFalse(clazz.prettyprint().contains("class V "));
    }

    @Test
    public void test025() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class W {\n  class R {\n    class z {\n      class p {\n        class KR {\n          class m3j7w {\n            class Bk {\n              class Vqd {\n                class U{}\n                class Z {\n\n                  Vqd KaAh = new W.R.z.p.KR.m3j7w.Bk.Vqd();\n                }\n                \n              }\n              class A {\n\n                W.R.z.p.KR T = new W.R.z.p.KR();\n                m3j7w n = new W.R.z.p.KR.m3j7w();\n              }\n              W P2 = new W();\n              Vqd h = new z.p.KR.m3j7w.Bk.Vqd();\n              R l = new W.R();\n            }\n            static class a{}\n            z.p.KR.m3j7w S = new z.p.KR.m3j7w();\n            R lVhZ = new W.R();\n            R CH = new W.R();\n            W MyyyO = new W();\n            W.R.z.p UG = new W.R.z.p();\n            W.R.z.p.KR V = new p.KR();\n          }\n          class b {\n\n            p.KR.b G = new W.R.z.p.KR.b();\n          }\n          class CdtX0 {\n\n            p K = new p();\n          }\n          \n        }\n        class Ii {\n\n          R.z.p niU = new z.p();\n        }\n        class uZ {\n\n          W.R.z.p c = new z.p();\n        }\n        R wqL = new R();\n      }\n      static class QIaK{}\n      \n    }\n    static class j{}\n    W WAXv = new W();\n    W.R.j x = new W.R.j();\n    z PLpr = new R.z();\n  }\n  static class Q{}\n  static class k{}\n  static class GQ{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Kib");
        assertTrue(clazz.prettyprint().contains("class Kib "));
        assertFalse(clazz.prettyprint().contains("class W "));
    }

    @Test
    public void test026() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class g {\n  class J {\n    class UFr {\n      class h {\n        class OB {\n          class H {\n            class S {\n              class n {\n                class w {\n\n                  J.UFr.h Uoz = new UFr.h();\n                  h.OB.H.S.n D = new J.UFr.h.OB.H.S.n();\n                  UFr.h pz = new UFr.h();\n                }\n                \n              }\n              class iwV {\n\n                H.S.iwV CM = new g.J.UFr.h.OB.H.S.iwV();\n              }\n              class g_p {\n\n                g.J.UFr.h.OB DP = new OB();\n              }\n              J.UFr.h.OB t = new OB();\n            }\n            g Z = new g();\n            g S_ = new g();\n            UFr.h Mz4 = new UFr.h();\n          }\n          class ev {\n\n            h T = new g.J.UFr.h();\n            J.UFr.h.OB.ev mc = new UFr.h.OB.ev();\n          }\n          g.J.UFr Gm = new UFr();\n        }\n        class Ux{}\n        class R{}\n        g Vi = new g();\n      }\n      class Wv{}\n      class v{}\n      class HGk1n {\n\n        UFr W0Ve = new UFr();\n        g L = new g();\n        g.J.UFr K9 = new UFr();\n        g W6FY = new g();\n      }\n      \n    }\n    class Ut {\n\n      J Uvaigt = new J();\n      g U = new g();\n      Ut EC = new g.J.Ut();\n      J.Ut FCOreSI = new J.Ut();\n    }\n    class g5{}\n    class a{}\n    g nf = new g();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Kw");
        assertTrue(clazz.prettyprint().contains("class Kw "));
        assertFalse(clazz.prettyprint().contains("class g "));
    }

    @Test
    public void test027() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class J {\n  class l {\n    class g {\n      class z {\n        class MuY {\n          class tL {\n            class d {\n              class Iz {\n\n                z O3 = new J.l.g.z();\n              }\n              static class Am{}\n              class j {\n\n                J nhWr = new J();\n                d.j Z = new tL.d.j();\n              }\n              class nrGwRA{}\n              g Ls = new g();\n            }\n            class O {\n\n              g.z.MuY.tL q = new J.l.g.z.MuY.tL();\n              MuY B = new l.g.z.MuY();\n              z kJ = new l.g.z();\n            }\n            class cUzATi {\n\n              J.l T = new l();\n            }\n            J i_ = new J();\n          }\n          l sEL_WD = new l();\n        }\n        class R2 {\n\n          l.g.z.R2 i = new J.l.g.z.R2();\n          J T3Z = new J();\n        }\n        J.l Q = new l();\n        J zq = new J();\n        J FO2 = new J();\n        J.l mr = new l();\n      }\n      class BWd {\n\n        J lDay = new J();\n      }\n      class wW{}\n      \n    }\n    class sl3{}\n    class bl{}\n    class SOIu{}\n    \n  }\n  static class b5{}\n  b5 lm = new b5();\n  J Dm = new J();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "b");
        assertTrue(clazz.prettyprint().contains("class b "));
        assertFalse(clazz.prettyprint().contains("class J "));
    }

    @Test
    public void test028() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Vo {\n  class W {\n    class Ocb {\n      class bl {\n        class MXm {\n          class xYg7 {\n            class T {\n              class Bw{}\n              class eo{}\n              class OG {\n\n                xYg7.T xyFR = new T();\n              }\n              W.Ocb.bl.MXm.xYg7 y = new W.Ocb.bl.MXm.xYg7();\n            }\n            class u{}\n            class w {\n\n              W.Ocb.bl.MXm q = new W.Ocb.bl.MXm();\n            }\n            \n          }\n          static class tm{}\n          static class J{}\n          bl uefZ = new Vo.W.Ocb.bl();\n          MXm.tm m = new MXm.tm();\n          Vo.W.Ocb.bl.MXm.tm bIg = new tm();\n          W.Ocb.bl.MXm.tm be = new tm();\n          W.Ocb.bl.MXm r8 = new bl.MXm();\n        }\n        class Am {\n\n          Vo.W.Ocb.bl x = new Vo.W.Ocb.bl();\n        }\n        class mE1i {\n\n          bl n = new bl();\n        }\n        class uyO {\n\n          Vo.W K = new Vo.W();\n        }\n        \n      }\n      class qy {\n\n        W.Ocb f = new W.Ocb();\n      }\n      static class N{}\n      class D{}\n      Vo.W H2 = new W();\n      W vI_ = new Vo.W();\n    }\n    static class aF{}\n    \n  }\n  class z {\n\n    Vo c = new Vo();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "s");
        assertTrue(clazz.prettyprint().contains("class s "));
        assertFalse(clazz.prettyprint().contains("class Vo "));
    }

    @Test
    public void test029() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class z {\n  class qb {\n    class e {\n      class d {\n        class n6soz {\n          class X {\n            class bD {\n              class V {\n\n                qb.e.d.n6soz.X xUV = new d.n6soz.X();\n                z mGWvgjV = new z();\n              }\n              class n {\n\n                e.d.n6soz K = new qb.e.d.n6soz();\n              }\n              class O8K{}\n              class JHn{}\n              z.qb H = new z.qb();\n            }\n            class hc {\n\n              z.qb Y = new z.qb();\n            }\n            class COH{}\n            z I = new z();\n            z.qb.e.d.n6soz.X.bD Kl = new z.qb.e.d.n6soz.X.bD();\n          }\n          class o{}\n          class vwp {\n\n            vwp tkd = new vwp();\n            qb.e.d.n6soz a = new qb.e.d.n6soz();\n          }\n          class Lq {\n\n            qb D = new qb();\n          }\n          d.n6soz p = new d.n6soz();\n        }\n        class rF{}\n        class rd {\n\n          d mg = new z.qb.e.d();\n          qb C = new z.qb();\n          z.qb E = new qb();\n        }\n        \n      }\n      \n    }\n    class F_{}\n    class myK{}\n    \n  }\n  static class P{}\n  static class C5{}\n  P qNF0 = new P();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "J");
        assertTrue(clazz.prettyprint().contains("class J "));
        assertFalse(clazz.prettyprint().contains("class z "));
    }

    @Test
    public void test030() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class k {\n  class C7e {\n    class Q {\n      class v {\n        class Wnc {\n          class m {\n            class bl5FhLN4fa {\n              class m5{}\n              class O {\n\n                C7e.Q s = new Q();\n              }\n              class YF1{}\n              C7e.Q.v J = new k.C7e.Q.v();\n              Wnc m4 = new k.C7e.Q.v.Wnc();\n              Q mo = new k.C7e.Q();\n            }\n            class geR {\n\n              C7e.Q.v.Wnc.m T = new C7e.Q.v.Wnc.m();\n              Wnc o = new v.Wnc();\n            }\n            class req {\n\n              m L = new m();\n            }\n            class bl {\n\n              C7e.Q.v K = new k.C7e.Q.v();\n            }\n            \n          }\n          class h {\n\n            C7e u = new k.C7e();\n            C7e.Q.v zY = new v();\n          }\n          class zsH6Non {\n\n            k.C7e NcC = new C7e();\n            C7e.Q.v n = new v();\n            Q p2E = new k.C7e.Q();\n          }\n          class yKyN{}\n          k.C7e.Q.v XI = new v();\n          k ho = new k();\n        }\n        class n8lE7h {\n\n          k KO = new k();\n        }\n        \n      }\n      class du5 {\n\n        C7e.Q.du5 x = new k.C7e.Q.du5();\n        C7e kP_e4 = new k.C7e();\n        k jm = new k();\n      }\n      class A0 {\n\n        Q.A0 AWyfX = new C7e.Q.A0();\n        k FV4UmB3W = new k();\n      }\n      \n    }\n    class r {\n\n      r dVnJ = new r();\n      k P = new k();\n    }\n    \n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "R");
        assertTrue(clazz.prettyprint().contains("class R "));
        assertFalse(clazz.prettyprint().contains("class k "));
    }

    @Test
    public void test031() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class CO {\n  class obBjH {\n    class Z {\n      class E {\n        class Sk {\n          class PgL {\n            class JK {\n              class i {\n                class O {\n                  class X {\n\n                    CO chc = new CO();\n                    i.O.X V2G = new Sk.PgL.JK.i.O.X();\n                  }\n                  \n                }\n                class m2 {\n\n                  JK.i.m2 bK = new i.m2();\n                  JK enaV = new obBjH.Z.E.Sk.PgL.JK();\n                }\n                class e{}\n                \n              }\n              \n            }\n            class dd {\n\n              CO.obBjH n = new obBjH();\n            }\n            class il {\n\n              E zXm = new obBjH.Z.E();\n            }\n            class j {\n\n              Z SK0H = new Z();\n            }\n            obBjH P = new obBjH();\n            obBjH.Z PMA = new CO.obBjH.Z();\n          }\n          class l{}\n          class u{}\n          \n        }\n        class p{}\n        \n      }\n      class xdd {\n\n        CO o49A = new CO();\n        CO.obBjH.Z.xdd T = new Z.xdd();\n        Z gsXRDY = new Z();\n        obBjH Hk = new CO.obBjH();\n        CO.obBjH Y0 = new obBjH();\n        Z c = new CO.obBjH.Z();\n      }\n      CO NMiq = new CO();\n    }\n    \n  }\n  static class W{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "PK");
        assertTrue(clazz.prettyprint().contains("class PK "));
        assertFalse(clazz.prettyprint().contains("class CO "));
    }

    @Test
    public void test032() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class cBJ {\n  class i {\n    class WvwOyN {\n      class a {\n        class yT {\n          class B {\n            class C9L {\n\n              i.WvwOyN v = new cBJ.i.WvwOyN();\n            }\n            class EefR{}\n            class Hl{}\n            class X {\n\n              WvwOyN S = new i.WvwOyN();\n            }\n            \n          }\n          class e{}\n          class bX{}\n          class K0D2hO{}\n          i c = new i();\n        }\n        class E9K7 {\n\n          WvwOyN.a QcH = new i.WvwOyN.a();\n        }\n        \n      }\n      class KceCxx60{}\n      class t{}\n      \n    }\n    class AR {\n\n      i PKc = new i();\n    }\n    static class h4{}\n    static class i3{}\n    \n  }\n  static class sWx{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "d");
        assertTrue(clazz.prettyprint().contains("class d "));
        assertFalse(clazz.prettyprint().contains("class cBJ "));
    }

    @Test
    public void test033() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class R19 {\n  class tI {\n    class Y3 {\n      class Wckm {\n        class EJ {\n          class XBL {\n            class g {\n              class ehn {\n                class D2XxD {\n\n                  XBL.g.ehn Zf = new R19.tI.Y3.Wckm.EJ.XBL.g.ehn();\n                }\n                class Q {\n\n                  R19 a = new R19();\n                  EJ.XBL p = new XBL();\n                }\n                ehn a5 = new g.ehn();\n                Y3.Wckm.EJ W = new Y3.Wckm.EJ();\n                tI.Y3.Wckm.EJ.XBL.g BKa_B = new EJ.XBL.g();\n              }\n              class C{}\n              class z {\n\n                R19.tI K = new tI();\n              }\n              \n            }\n            class UJ {\n\n              XBL J = new tI.Y3.Wckm.EJ.XBL();\n            }\n            class PF{}\n            tI.Y3 K0m3 = new Y3();\n            R19.tI O = new tI();\n            Y3.Wckm.EJ.XBL m = new tI.Y3.Wckm.EJ.XBL();\n          }\n          \n        }\n        class ad {\n\n          R19 mjdQ2 = new R19();\n          tI.Y3.Wckm.ad Y = new ad();\n        }\n        class pd {\n\n          tI.Y3 mrw = new R19.tI.Y3();\n          tI.Y3 q5 = new tI.Y3();\n          tI U = new R19.tI();\n        }\n        class yH{}\n        \n      }\n      \n    }\n    class P {\n\n      R19.tI KBaE7p = new R19.tI();\n      R19 t1 = new R19();\n    }\n    tI G = new tI();\n  }\n  class c {\n\n    R19 ygy_N = new R19();\n  }\n  class n{}\n  class L {\n\n    L h = new R19.L();\n  }\n  tI UP = new R19.tI();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "d");
        assertTrue(clazz.prettyprint().contains("class d "));
        assertFalse(clazz.prettyprint().contains("class R19 "));
    }

    @Test
    public void test034() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class YY {\n  class TMo2XV {\n    class Tg {\n      class o {\n        class BC {\n          class M4 {\n            class a {\n              class c{}\n              class z{}\n              class PvNq {\n\n                Tg.o t0PloQx = new o();\n                o.BC.M4 x = new YY.TMo2XV.Tg.o.BC.M4();\n                YY.TMo2XV.Tg.o.BC.M4.a.PvNq e = new PvNq();\n              }\n              class B{}\n              \n            }\n            class F {\n\n              YY pH = new YY();\n              TMo2XV.Tg.o Y0 = new o();\n              o.BC J = new o.BC();\n              Tg.o.BC.M4.F fMFox = new BC.M4.F();\n              YY Do = new YY();\n              BC.M4 Si = new YY.TMo2XV.Tg.o.BC.M4();\n            }\n            class k{}\n            class L6RzdNn{}\n            \n          }\n          class C {\n\n            TMo2XV UI = new TMo2XV();\n            YY q = new YY();\n            Tg.o.BC.C H9n = new YY.TMo2XV.Tg.o.BC.C();\n            Tg.o.BC TM = new YY.TMo2XV.Tg.o.BC();\n          }\n          class m {\n\n            TMo2XV.Tg cGNQ = new TMo2XV.Tg();\n          }\n          class hB{}\n          YY.TMo2XV.Tg.o.BC.C PQ75F = new C();\n          YY.TMo2XV zp = new TMo2XV();\n          TMo2XV.Tg.o L = new TMo2XV.Tg.o();\n          YY E = new YY();\n        }\n        YY G7l = new YY();\n      }\n      class A {\n\n        YY d3C = new YY();\n        YY.TMo2XV j1 = new TMo2XV();\n      }\n      class t {\n\n        YY.TMo2XV.Tg vt = new YY.TMo2XV.Tg();\n        YY s_ = new YY();\n      }\n      class prp {\n\n        TMo2XV.Tg.prp Ugc = new YY.TMo2XV.Tg.prp();\n      }\n      YY.TMo2XV.Tg.prp PY = new Tg.prp();\n    }\n    TMo2XV.Tg W = new Tg();\n    YY.TMo2XV.Tg X = new TMo2XV.Tg();\n    YY vX = new YY();\n    YY CH = new YY();\n  }\n  static class aZ6{}\n  class i5 {\n\n    YY kt = new YY();\n    YY Y = new YY();\n    YY G3y = new YY();\n    YY.i5 aZ = new YY.i5();\n  }\n  YY G = new YY();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Me0_c");
        assertTrue(clazz.prettyprint().contains("class Me0_c "));
        assertFalse(clazz.prettyprint().contains("class YY "));
    }

    @Test
    public void test035() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class a {\n  class aj {\n    class skzsR {\n      class r {\n        class W {\n          class wYAF {\n            class pd {\n              class L{}\n              class B{}\n              class QQw{}\n              class vXKi {\n\n                a.aj.skzsR.r M9 = new skzsR.r();\n              }\n              skzsR.r.W.wYAF.pd.B m = new aj.skzsR.r.W.wYAF.pd.B();\n              aj.skzsR.r Q = new r();\n            }\n            class v{}\n            a ve = new a();\n            W.wYAF.pd hvk = new skzsR.r.W.wYAF.pd();\n            a k = new a();\n          }\n          r.W.wYAF kOEQA0x = new r.W.wYAF();\n          a.aj kRp = new a.aj();\n        }\n        class b{}\n        class z {\n\n          skzsR.r.z j = new z();\n          z EYOD = new skzsR.r.z();\n          a V = new a();\n          aj zt6 = new a.aj();\n        }\n        class fY {\n\n          a.aj Ff6 = new a.aj();\n          a.aj G = new a.aj();\n          a.aj.skzsR.r vx = new skzsR.r();\n        }\n        \n      }\n      class y{}\n      class e {\n\n        a.aj.skzsR.e yjP = new skzsR.e();\n        a.aj P = new a.aj();\n      }\n      class vd{}\n      a.aj r0lt = new a.aj();\n      aj t = new a.aj();\n    }\n    a iX = new a();\n    a n = new a();\n    a.aj.skzsR AN = new a.aj.skzsR();\n  }\n  class TsR {\n\n    TsR mO = new a.TsR();\n    a unzIBiO7S = new a();\n  }\n  static class Z{}\n  class aJ {\n\n    a Mt = new a();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "S");
        assertTrue(clazz.prettyprint().contains("class S "));
        assertFalse(clazz.prettyprint().contains("class a "));
    }

    @Test
    public void test036() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class T {\n  class z {\n    class b {\n      class i4bSm_ {\n        class G {\n          class n {\n            class h_ {\n\n              z.b.i4bSm_.G w = new T.z.b.i4bSm_.G();\n              z.b.i4bSm_ N5 = new i4bSm_();\n              z.b.i4bSm_ M = new b.i4bSm_();\n            }\n            class q{}\n            class Y {\n\n              T.z kVN = new T.z();\n              T.z.b.i4bSm_.G Z = new i4bSm_.G();\n            }\n            n Il = new T.z.b.i4bSm_.G.n();\n          }\n          class I {\n\n            T D = new T();\n            z.b.i4bSm_.G dU = new z.b.i4bSm_.G();\n          }\n          class rQ{}\n          class u{}\n          T K = new T();\n        }\n        class b80{}\n        class Q {\n\n          b.i4bSm_ y = new i4bSm_();\n          z.b.i4bSm_.Q Ynkp73 = new i4bSm_.Q();\n          z.b Dl = new b();\n        }\n        \n      }\n      class C {\n\n        T.z.b mBeF = new T.z.b();\n        T j = new T();\n        z.b HD85g = new T.z.b();\n        T o = new T();\n      }\n      class JG {\n\n        z gs = new T.z();\n        b.JG r = new JG();\n        z e = new z();\n      }\n      b b4u4L = new b();\n      T L7 = new T();\n    }\n    class yYU{}\n    b t = new T.z.b();\n  }\n  class IiNO{}\n  static class TCe{}\n  static class jd{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "A");
        assertTrue(clazz.prettyprint().contains("class A "));
        assertFalse(clazz.prettyprint().contains("class T "));
    }

    @Test
    public void test037() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class aL6d {\n  class Fn {\n    class w1oF {\n      class L {\n        class i {\n          class Tfm {\n            class Y {\n              class m {\n                class x {\n                  class b3{}\n                  class Pv{}\n                  \n                }\n                class gs{}\n                \n              }\n              class Z_{}\n              \n            }\n            class n {\n\n              Fn.w1oF lc = new w1oF();\n              L.i.Tfm.n v = new w1oF.L.i.Tfm.n();\n            }\n            class OT {\n\n              Fn.w1oF.L au = new aL6d.Fn.w1oF.L();\n              aL6d.Fn W = new aL6d.Fn();\n              Fn O = new Fn();\n              OT dhQ = new Fn.w1oF.L.i.Tfm.OT();\n              L.i dE = new w1oF.L.i();\n            }\n            class S3td_ {\n\n              S3td_ p = new L.i.Tfm.S3td_();\n            }\n            \n          }\n          class u {\n\n            Fn.w1oF.L BBgIk = new w1oF.L();\n            aL6d B = new aL6d();\n            w1oF.L b = new Fn.w1oF.L();\n          }\n          \n        }\n        class YA {\n\n          aL6d.Fn.w1oF.L N = new L();\n          Fn.w1oF.L Q = new L();\n        }\n        \n      }\n      aL6d J = new aL6d();\n    }\n    \n  }\n  static class j{}\n  class l {\n\n    l fm = new aL6d.l();\n  }\n  class Mf {\n\n    aL6d k = new aL6d();\n    aL6d NY = new aL6d();\n    aL6d.Mf Pe = new aL6d.Mf();\n    aL6d.Mf Zf = new aL6d.Mf();\n  }\n  aL6d O1 = new aL6d();\n  aL6d Rk = new aL6d();\n  aL6d.l f = new l();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Cd");
        assertTrue(clazz.prettyprint().contains("class Cd "));
        assertFalse(clazz.prettyprint().contains("class aL6d "));
    }

    @Test
    public void test038() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class e {\n  class mt {\n    class s {\n      class GC {\n        class BbVQ {\n          class G {\n            class k {\n              class AG {\n                class b{}\n                class ai{}\n                class p {\n\n                  BbVQ.G.k Qj = new G.k();\n                }\n                e BA = new e();\n                k.AG.p mD = new GC.BbVQ.G.k.AG.p();\n              }\n              mt h6z = new e.mt();\n              GC GQq = new e.mt.s.GC();\n            }\n            class m2m {\n\n              e.mt.s Z = new mt.s();\n              BbVQ.G WQ = new e.mt.s.GC.BbVQ.G();\n            }\n            class i {\n\n              s z52u = new mt.s();\n            }\n            class iI7 {\n\n              e Q = new e();\n              mt.s.GC A = new s.GC();\n            }\n            s D = new mt.s();\n          }\n          class L{}\n          e.mt I5U = new mt();\n          GC.BbVQ.G UA80 = new GC.BbVQ.G();\n        }\n        class E {\n\n          e.mt E6 = new e.mt();\n        }\n        class d {\n\n          GC.d z2 = new mt.s.GC.d();\n        }\n        class DJ{}\n        \n      }\n      class S{}\n      class n {\n\n        mt.s S4V629 = new e.mt.s();\n      }\n      \n    }\n    class x {\n\n      e.mt W = new mt();\n    }\n    \n  }\n  class O {\n\n    e X = new e();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "E_h");
        assertTrue(clazz.prettyprint().contains("class E_h "));
        assertFalse(clazz.prettyprint().contains("class e "));
    }

    @Test
    public void test039() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Oz {\n  class x {\n    class G8 {\n      class hV {\n        class T {\n          class S {\n            class dKvD {\n\n              Oz.x.G8.hV.T.S.dKvD weA = new G8.hV.T.S.dKvD();\n              hV.T i = new T();\n              hV N = new x.G8.hV();\n            }\n            class YzV {\n\n              S.YzV boA = new Oz.x.G8.hV.T.S.YzV();\n            }\n            class v {\n\n              Oz.x kR3 = new x();\n              G8.hV E = new G8.hV();\n              S ED = new x.G8.hV.T.S();\n            }\n            class n1aS {\n\n              x.G8.hV.T.S j = new x.G8.hV.T.S();\n              x.G8 Og = new x.G8();\n              hV.T.S.n1aS C = new hV.T.S.n1aS();\n            }\n            G8.hV kt = new x.G8.hV();\n          }\n          class sW {\n\n            x.G8 EfJQU = new G8();\n          }\n          class n8V {\n\n            x.G8.hV.T.n8V y3 = new G8.hV.T.n8V();\n            n8V U = new n8V();\n            G8.hV a = new Oz.x.G8.hV();\n            Oz cT = new Oz();\n            G8.hV G = new hV();\n            Oz.x.G8.hV.T o_m = new hV.T();\n            Oz.x Qt = new Oz.x();\n          }\n          class b{}\n          Oz.x.G8.hV R = new G8.hV();\n        }\n        class p7{}\n        \n      }\n      class H {\n\n        Oz.x.G8 ADXj = new x.G8();\n        Oz BQz = new Oz();\n        x.G8 x7E = new G8();\n      }\n      Oz.x lWA = new x();\n    }\n    static class c{}\n    static class P_{}\n    x.c tE = new x.c();\n  }\n  class uPJ {\n\n    Oz.uPJ n = new uPJ();\n  }\n  class UVF8JsUzF{}\n  class m {\n\n    Oz y = new Oz();\n  }\n  Oz sx9C2 = new Oz();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(12);
        Refactoring.changeTypeName(clazz, "Zn");
        assertTrue(clazz.prettyprint().contains("class Zn "));
        assertFalse(clazz.prettyprint().contains("class b "));
    }

    @Test
    public void test040() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class D {\n  class h2EdcS {\n    class Y {\n      class s {\n        class iV {\n          class YD {\n            class e {\n              class w {\n                class qN {\n                  class D2A7{}\n                  class aRdC8 {\n\n                    h2EdcS.Y.s.iV.YD.e W = new s.iV.YD.e();\n                    Y.s.iV.YD.e.w.qN.aRdC8 T = new w.qN.aRdC8();\n                  }\n                  \n                }\n                D uw = new D();\n                h2EdcS Q5 = new h2EdcS();\n              }\n              class n{}\n              class Di{}\n              class g {\n\n                s sIdFPt = new Y.s();\n                Y OP8h = new h2EdcS.Y();\n                D.h2EdcS.Y.s.iV.YD.e PLL = new iV.YD.e();\n              }\n              D.h2EdcS.Y.s JM = new h2EdcS.Y.s();\n            }\n            h2EdcS.Y iuD = new D.h2EdcS.Y();\n            D.h2EdcS.Y u = new h2EdcS.Y();\n            D.h2EdcS.Y.s.iV.YD Hd = new Y.s.iV.YD();\n          }\n          class b{}\n          D.h2EdcS hi = new h2EdcS();\n          Y d = new D.h2EdcS.Y();\n          h2EdcS.Y rsV = new D.h2EdcS.Y();\n          D o_m = new D();\n          Y h5 = new D.h2EdcS.Y();\n        }\n        class Q{}\n        class R{}\n        class H {\n\n          h2EdcS.Y.s Va = new D.h2EdcS.Y.s();\n        }\n        \n      }\n      \n    }\n    D.h2EdcS YIt = new h2EdcS();\n  }\n  static class bDN{}\n  class a{}\n  class V {\n\n    D.V xGm = new V();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "M");
        assertTrue(clazz.prettyprint().contains("class M "));
        assertFalse(clazz.prettyprint().contains("class D "));
    }

    @Test
    public void test041() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class By {\n  class s {\n    class qAx {\n      class Ax {\n        class kjm5 {\n          class g {\n            class my {\n              class l {\n                class y{}\n                class oh{}\n                class Be {\n\n                  kjm5.g qGgV = new g();\n                }\n                my.l X = new my.l();\n              }\n              class j{}\n              class e{}\n              class C_yI {\n\n                kjm5 mZ = new Ax.kjm5();\n                s.qAx rY = new qAx();\n              }\n              kjm5 K2t = new kjm5();\n              qAx.Ax f3 = new s.qAx.Ax();\n            }\n            class J{}\n            class v {\n\n              s nn = new By.s();\n              Ax wSWXzn = new By.s.qAx.Ax();\n              v B = new kjm5.g.v();\n            }\n            \n          }\n          By.s.qAx.Ax.kjm5 b = new qAx.Ax.kjm5();\n        }\n        class q{}\n        \n      }\n      class ho8iJH{}\n      static class c{}\n      \n    }\n    class m{}\n    By ZWY = new By();\n  }\n  class HF{}\n  By o = new By();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "D5J");
        assertTrue(clazz.prettyprint().contains("class D5J "));
        assertFalse(clazz.prettyprint().contains("class By "));
    }

    @Test
    public void test042() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class ls {\n  class V {\n    class fX {\n      class c {\n        class kA07 {\n          class fnu {\n            class TQ5cYcYWl {\n              class P {\n                class kQK {\n\n                  ls.V.fX.c.kA07 Z = new V.fX.c.kA07();\n                }\n                class vg {\n\n                  TQ5cYcYWl.P Nn = new fnu.TQ5cYcYWl.P();\n                }\n                class Udk{}\n                \n              }\n              class K {\n\n                fnu.TQ5cYcYWl.K gN9 = new TQ5cYcYWl.K();\n              }\n              class Xc {\n\n                ls.V.fX.c.kA07.fnu.TQ5cYcYWl wg = new V.fX.c.kA07.fnu.TQ5cYcYWl();\n              }\n              \n            }\n            class GR{}\n            \n          }\n          class w{}\n          class J {\n\n            V.fX.c.kA07 Py9h = new c.kA07();\n            V jd = new V();\n            ls.V iU = new V();\n            ls.V.fX g9 = new ls.V.fX();\n          }\n          \n        }\n        class Q {\n\n          ls o = new ls();\n        }\n        ls.V.fX Y = new ls.V.fX();\n        fX L = new V.fX();\n        V.fX e = new fX();\n        V Zo5K = new V();\n        ls.V.fX.c u8 = new c();\n        fX.c M = new c();\n      }\n      class it{}\n      \n    }\n    class dG{}\n    class h2ejY {\n\n      ls.V q21TE = new V();\n      ls.V.h2ejY R = new V.h2ejY();\n      ls G = new ls();\n      ls W = new ls();\n      ls.V l = new ls.V();\n      ls.V P3bR = new ls.V();\n      ls.V D6L = new V();\n    }\n    \n  }\n  ls.V dPA = new V();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "M0");
        assertTrue(clazz.prettyprint().contains("class M0 "));
        assertFalse(clazz.prettyprint().contains("class ls "));
    }

    @Test
    public void test043() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class r {\n  class nNpfuMC6 {\n    class a {\n      class h {\n        class D {\n          class fG {\n            class Y {\n              class Yc {\n                class T{}\n                class N{}\n                Y q24 = new h.D.fG.Y();\n                r.nNpfuMC6.a.h.D.fG l = new fG();\n                a.h.D.fG Pm = new fG();\n              }\n              class xDIG {\n\n                Y.xDIG b = new nNpfuMC6.a.h.D.fG.Y.xDIG();\n                nNpfuMC6.a.h en = new a.h();\n                r.nNpfuMC6.a.h.D U = new nNpfuMC6.a.h.D();\n              }\n              r.nNpfuMC6 S = new nNpfuMC6();\n              r.nNpfuMC6.a.h.D.fG.Y OHq = new Y();\n              D.fG E = new a.h.D.fG();\n              r y = new r();\n              D ZPI = new nNpfuMC6.a.h.D();\n              nNpfuMC6.a.h.D XBxt = new D();\n            }\n            class t{}\n            \n          }\n          \n        }\n        class O {\n\n          r.nNpfuMC6.a.h.O BX = new h.O();\n          O o = new nNpfuMC6.a.h.O();\n          a f = new a();\n        }\n        class D_{}\n        class m{}\n        h i = new r.nNpfuMC6.a.h();\n      }\n      nNpfuMC6 Q = new r.nNpfuMC6();\n    }\n    class q {\n\n      q OWr = new r.nNpfuMC6.q();\n      r.nNpfuMC6.q Iu9ynsA = new nNpfuMC6.q();\n      r EX = new r();\n    }\n    class u {\n\n      r.nNpfuMC6.u llX = new r.nNpfuMC6.u();\n      r hD9 = new r();\n    }\n    class GfA {\n\n      r XV = new r();\n      r WcO = new r();\n    }\n    nNpfuMC6 e = new nNpfuMC6();\n  }\n  static class c{}\n  static class uEgOH{}\n  r OHX = new r();\n  r sT = new r();\n  r.nNpfuMC6 MjrZV = new nNpfuMC6();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "s");
        assertTrue(clazz.prettyprint().contains("class s "));
        assertFalse(clazz.prettyprint().contains("class r "));
    }

    @Test
    public void test044() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class s6vaVy {\n  class Hh {\n    class hW {\n      class Kt {\n        class J {\n          class V90 {\n            class j {\n              class kT{}\n              class T4p_Ky {\n\n                s6vaVy.Hh UK = new Hh();\n              }\n              class Zj{}\n              class JxE {\n\n                Kt e = new Kt();\n                J.V90 u = new s6vaVy.Hh.hW.Kt.J.V90();\n              }\n              \n            }\n            class rZ{}\n            class C{}\n            class vx{}\n            Hh.hW.Kt H = new hW.Kt();\n          }\n          class G{}\n          class h0U {\n\n            s6vaVy.Hh.hW.Kt N9q = new s6vaVy.Hh.hW.Kt();\n            J.h0U y = new Hh.hW.Kt.J.h0U();\n          }\n          \n        }\n        class o{}\n        \n      }\n      s6vaVy n = new s6vaVy();\n      hW VL = new hW();\n    }\n    class t{}\n    class iy {\n\n      s6vaVy owzH57nw = new s6vaVy();\n      s6vaVy i = new s6vaVy();\n      iy MLs = new s6vaVy.Hh.iy();\n    }\n    class h{}\n    \n  }\n  class m {\n\n    m s = new m();\n  }\n  s6vaVy ETkLH = new s6vaVy();\n  s6vaVy qL = new s6vaVy();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "dn");
        assertTrue(clazz.prettyprint().contains("class dn "));
        assertFalse(clazz.prettyprint().contains("class s6vaVy "));
    }

    @Test
    public void test045() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class J {\n  class y {\n    class K2 {\n      class t {\n        class S {\n          class z5 {\n            class l {\n              class xl1 {\n                class AR4hln8P {\n\n                  K2.t vd = new y.K2.t();\n                  t.S.z5.l.xl1 B = new t.S.z5.l.xl1();\n                }\n                class I {\n\n                  J.y.K2.t.S.z5.l.xl1 m = new xl1();\n                  y.K2.t.S nf = new t.S();\n                }\n                class a{}\n                y.K2.t CK = new J.y.K2.t();\n                K2.t.S.z5.l.xl1.a o = new y.K2.t.S.z5.l.xl1.a();\n              }\n              \n            }\n            class Otn{}\n            \n          }\n          J AU = new J();\n        }\n        class G{}\n        static class VX8{}\n        \n      }\n      static class zDJqQ{}\n      class U{}\n      static class R5{}\n      zDJqQ z = new zDJqQ();\n    }\n    class KV {\n\n      y Xe = new y();\n      J.y.KV Q = new y.KV();\n      KV zC = new KV();\n      J.y Ue = new J.y();\n    }\n    class Vb {\n\n      J X7V = new J();\n      J uLk5q = new J();\n      y.Vb G_1d = new J.y.Vb();\n    }\n    class KX8{}\n    \n  }\n  static class N{}\n  static class Iblr{}\n  N kM = new N();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "TY");
        assertTrue(clazz.prettyprint().contains("class TY "));
        assertFalse(clazz.prettyprint().contains("class J "));
    }

    @Test
    public void test046() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class T {\n  class btzHDo {\n    class B {\n      class Ynp {\n        class wARlQPE {\n          class tN {\n            class f {\n              class j {\n                class gJ {\n                  class X{}\n                  class L {\n\n                    T.btzHDo.B.Ynp.wARlQPE.tN.f.j.gJ.L o3 = new btzHDo.B.Ynp.wARlQPE.tN.f.j.gJ.L();\n                  }\n                  class c{}\n                  T.btzHDo.B Q = new B();\n                }\n                j wc = new B.Ynp.wARlQPE.tN.f.j();\n              }\n              \n            }\n            \n          }\n          \n        }\n        class oi{}\n        class i {\n\n          btzHDo.B xr = new B();\n        }\n        class pE20 {\n\n          T.btzHDo.B.Ynp.pE20 vC = new btzHDo.B.Ynp.pE20();\n        }\n        \n      }\n      class v{}\n      class aW {\n\n        aW bLv = new btzHDo.B.aW();\n        T y = new T();\n        T.btzHDo.B.aW N = new aW();\n      }\n      \n    }\n    \n  }\n  static class q{}\n  class Z {\n\n    Z Ev = new T.Z();\n  }\n  class Sz{}\n  T I = new T();\n  T Gu = new T();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "b");
        assertTrue(clazz.prettyprint().contains("class b "));
        assertFalse(clazz.prettyprint().contains("class T "));
    }

    @Test
    public void test047() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class JQ {\n  class R {\n    class x {\n      class xa {\n        class L {\n          class gN {\n            class tj1 {\n              class Oy{}\n              class W{}\n              class S{}\n              class pzP {\n\n                JQ.R.x.xa KPTHAbyJh = new R.x.xa();\n              }\n              JQ K9 = new JQ();\n            }\n            \n          }\n          class p{}\n          class vWho {\n\n            xa.L q = new L();\n            JQ h = new JQ();\n            JQ.R rV = new JQ.R();\n          }\n          class o {\n\n            xa E = new x.xa();\n          }\n          \n        }\n        class o1D{}\n        class m{}\n        class i{}\n        xa.L UI = new xa.L();\n      }\n      class xn {\n\n        JQ.R.x.xn a8gI_ = new R.x.xn();\n        JQ.R.x Ou = new JQ.R.x();\n        x.xn GQ = new R.x.xn();\n      }\n      JQ.R nr = new JQ.R();\n    }\n    class g{}\n    class P{}\n    class c {\n\n      JQ tn2 = new JQ();\n      R SCsc = new JQ.R();\n    }\n    g J = new JQ.R.g();\n    JQ jc = new JQ();\n    JQ Lw = new JQ();\n  }\n  R H0 = new JQ.R();\n  JQ B = new JQ();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "KFZ");
        assertTrue(clazz.prettyprint().contains("class KFZ "));
        assertFalse(clazz.prettyprint().contains("class JQ "));
    }

    @Test
    public void test048() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class uS {\n  class yD {\n    class p {\n      class kKViv_n {\n        class l {\n          class Nv {\n            class v6 {\n              class r{}\n              class l4t{}\n              class F{}\n              \n            }\n            class wAP {\n\n              yD S = new yD();\n              uS W = new uS();\n              p.kKViv_n mvl = new uS.yD.p.kKViv_n();\n              p.kKViv_n.l.Nv hu = new p.kKViv_n.l.Nv();\n              p.kKViv_n.l.Nv asj = new l.Nv();\n            }\n            class l00 {\n\n              uS.yD.p.kKViv_n h = new yD.p.kKViv_n();\n              uS.yD oi = new yD();\n            }\n            class OP {\n\n              yD.p A = new yD.p();\n            }\n            \n          }\n          class pX{}\n          class m{}\n          \n        }\n        \n      }\n      class U{}\n      class bb{}\n      class T {\n\n        uS.yD C = new uS.yD();\n      }\n      yD.p.bb X = new yD.p.bb();\n    }\n    static class w{}\n    static class XeIm{}\n    \n  }\n  uS.yD s = new uS.yD();\n  uS H = new uS();\n  yD Pe = new yD();\n  uS.yD jLN = new uS.yD();\n  uS.yD g = new yD();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(12);
        Refactoring.changeTypeName(clazz, "n");
        assertTrue(clazz.prettyprint().contains("class n "));
        assertFalse(clazz.prettyprint().contains("class OP "));
    }

    @Test
    public void test049() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class eB {\n  class D {\n    class w {\n      class xyN1Ue {\n        class ck {\n          class O {\n            class j {\n              class NEKqy{}\n              class OPOTM{}\n              class g{}\n              class L{}\n              \n            }\n            class b{}\n            ck.O d9 = new ck.O();\n          }\n          class EO{}\n          \n        }\n        class T3{}\n        class F{}\n        class vD{}\n        eB J = new eB();\n      }\n      class k {\n\n        w VQ = new eB.D.w();\n        eB l = new eB();\n        k yTA = new eB.D.w.k();\n      }\n      \n    }\n    \n  }\n  static class u{}\n  static class c{}\n  class sd {\n\n    eB YT = new eB();\n    sd Cf = new eB.sd();\n  }\n  eB qaA = new eB();\n  eB.c dGTK3l = new eB.c();\n  sd y = new sd();\n  u sc = new u();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(8);
        Refactoring.changeTypeName(clazz, "fY");
        assertTrue(clazz.prettyprint().contains("class fY "));
        assertFalse(clazz.prettyprint().contains("class OPOTM "));
    }

    @Test
    public void test050() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class x {\n  class F {\n    class c {\n      class nyi {\n        class V {\n          class N {\n            class w {\n              class T {\n                class AN {\n\n                  N WiU = new c.nyi.V.N();\n                }\n                class J{}\n                class Q{}\n                F.c.nyi.V.N.w M = new V.N.w();\n              }\n              class p {\n\n                x AY = new x();\n                x.F.c.nyi NzF = new x.F.c.nyi();\n                N.w.p LhugkwAX = new nyi.V.N.w.p();\n                nyi hX = new c.nyi();\n                c.nyi.V.N.w fJ = new x.F.c.nyi.V.N.w();\n              }\n              class bla {\n\n                F WLvn = new F();\n              }\n              \n            }\n            class O{}\n            class D {\n\n              x.F.c DQmC = new x.F.c();\n            }\n            class e{}\n            \n          }\n          x r = new x();\n        }\n        \n      }\n      \n    }\n    class o {\n\n      x.F Lbt = new x.F();\n    }\n    class kJA {\n\n      x.F.kJA hH = new x.F.kJA();\n    }\n    \n  }\n  class po9oOR {\n\n    po9oOR Z6 = new x.po9oOR();\n    x OD = new x();\n    x Rg = new x();\n  }\n  static class sII{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "k");
        assertTrue(clazz.prettyprint().contains("class k "));
        assertFalse(clazz.prettyprint().contains("class x "));
    }

    @Test
    public void test051() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class f {\n  class Sc {\n    class p {\n      class b {\n        class Fp {\n          class wJ {\n            class X1G {\n              class n2I {\n                class q {\n\n                  p.b.Fp.wJ g = new f.Sc.p.b.Fp.wJ();\n                  n2I mI8p = new b.Fp.wJ.X1G.n2I();\n                }\n                class R {\n\n                  wJ.X1G.n2I.R Js = new Sc.p.b.Fp.wJ.X1G.n2I.R();\n                }\n                f v = new f();\n                p.b.Fp.wJ E2 = new Fp.wJ();\n                Sc.p.b.Fp n = new f.Sc.p.b.Fp();\n              }\n              class VZm {\n\n                Sc.p.b.Fp.wJ.X1G.VZm rb = new VZm();\n              }\n              class fK34C6zg {\n\n                Sc.p JJ = new f.Sc.p();\n              }\n              \n            }\n            f CB = new f();\n            Sc x8_F = new f.Sc();\n            f H = new f();\n            p.b O = new p.b();\n            f w = new f();\n            p YroLPw = new Sc.p();\n            Sc wck = new f.Sc();\n          }\n          class c {\n\n            f o = new f();\n          }\n          \n        }\n        class AI{}\n        class u5kc8V{}\n        class BHYqzPa4 {\n\n          Sc.p Yu = new p();\n          f.Sc CA = new Sc();\n          f K = new f();\n          f.Sc.p.b tAT = new p.b();\n          Sc.p.b N = new p.b();\n          f.Sc.p tX = new Sc.p();\n        }\n        Sc.p.b.u5kc8V zJD = new b.u5kc8V();\n        f Tx = new f();\n        p.b o_ = new f.Sc.p.b();\n        f.Sc.p.b nB = new b();\n      }\n      class h{}\n      f J = new f();\n      Sc.p vZ = new f.Sc.p();\n    }\n    class l {\n\n      f.Sc EF = new Sc();\n    }\n    f A = new f();\n    Sc T = new Sc();\n  }\n  class Vv {\n\n    f.Vv pn = new f.Vv();\n    f cm = new f();\n  }\n  class vdF {\n\n    f.vdF yW_4S = new vdF();\n    f.vdF Q = new vdF();\n    f y = new f();\n  }\n  static class F{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "JlRZxxNU");
        assertTrue(clazz.prettyprint().contains("class JlRZxxNU "));
        assertFalse(clazz.prettyprint().contains("class f "));
    }

    @Test
    public void test052() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Q {\n  class tjn {\n    class T {\n      class wi {\n        class B {\n          class ydrHXn {\n            class f9p {\n              class hL {\n                class N {\n                  class p {\n\n                    T.wi W9 = new tjn.T.wi();\n                    wi.B ln = new T.wi.B();\n                  }\n                  class t{}\n                  class XH {\n\n                    Q M = new Q();\n                    Q.tjn.T.wi.B TK = new B();\n                  }\n                  \n                }\n                class w {\n\n                  hL.w Z = new hL.w();\n                }\n                \n              }\n              class m4H {\n\n                Q.tjn.T.wi Fp = new wi();\n                Q.tjn.T.wi.B.ydrHXn.f9p H = new tjn.T.wi.B.ydrHXn.f9p();\n              }\n              class NYR{}\n              class fon{}\n              \n            }\n            tjn A2n_P8 = new Q.tjn();\n            B.ydrHXn.f9p Cv = new B.ydrHXn.f9p();\n            Q d = new Q();\n            T s = new tjn.T();\n          }\n          Q.tjn HR3 = new tjn();\n          ydrHXn tA = new wi.B.ydrHXn();\n          Q UBU = new Q();\n        }\n        \n      }\n      \n    }\n    static class S{}\n    class mb {\n\n      mb FCSM = new tjn.mb();\n    }\n    static class xn{}\n    \n  }\n  class k{}\n  static class Pv{}\n  class b {\n\n    Q h = new Q();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(19);
        Refactoring.changeTypeName(clazz, "sdu");
        assertTrue(clazz.prettyprint().contains("class sdu "));
        assertFalse(clazz.prettyprint().contains("class k "));
    }

    @Test
    public void test053() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class W {\n  class aN {\n    class Mu {\n      class fFk {\n        class wO {\n          class g {\n            class jd7U7 {\n              class p {\n                class lgQ {\n                  class E {\n                    class D {\n                      class x {\n\n                        E.D.x bIL = new aN.Mu.fFk.wO.g.jd7U7.p.lgQ.E.D.x();\n                      }\n                      class j {\n\n                        p L = new Mu.fFk.wO.g.jd7U7.p();\n                      }\n                      \n                    }\n                    class Y {\n\n                      fFk.wO.g.jd7U7.p.lgQ.E u = new g.jd7U7.p.lgQ.E();\n                    }\n                    Mu.fFk.wO.g.jd7U7.p yL9 = new wO.g.jd7U7.p();\n                  }\n                  \n                }\n                Mu T = new Mu();\n              }\n              aN.Mu t = new aN.Mu();\n              W qG = new W();\n            }\n            W.aN.Mu.fFk.wO.g.jd7U7 gFwz = new fFk.wO.g.jd7U7();\n            wO jIM = new aN.Mu.fFk.wO();\n          }\n          class z{}\n          W.aN.Mu WH = new W.aN.Mu();\n        }\n        fFk.wO InT = new wO();\n      }\n      class A {\n\n        Mu.A k = new A();\n      }\n      \n    }\n    class AYx {\n\n      W MWm = new W();\n    }\n    class i {\n\n      W Q = new W();\n      aN R = new aN();\n      W m = new W();\n      W S = new W();\n    }\n    \n  }\n  class qH {\n\n    W w = new W();\n  }\n  class I{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Cg48m");
        assertTrue(clazz.prettyprint().contains("class Cg48m "));
        assertFalse(clazz.prettyprint().contains("class W "));
    }

    @Test
    public void test054() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class p {\n  class G3rfBcr {\n    class N {\n      class o {\n        class Z {\n          class e {\n            class C {\n              class A {\n\n                e.C hY = new Z.e.C();\n                G3rfBcr n = new G3rfBcr();\n              }\n              class G{}\n              class D {\n\n                C F4s = new C();\n                o.Z H = new N.o.Z();\n              }\n              class B {\n\n                N.o.Z.e.C YZ = new G3rfBcr.N.o.Z.e.C();\n                N.o.Z.e WF = new G3rfBcr.N.o.Z.e();\n                N.o YKg = new p.G3rfBcr.N.o();\n              }\n              \n            }\n            p.G3rfBcr.N.o rs9 = new N.o();\n          }\n          class a {\n\n            G3rfBcr.N.o.Z E = new o.Z();\n            G3rfBcr.N.o.Z V = new Z();\n            p.G3rfBcr eh = new p.G3rfBcr();\n            p.G3rfBcr q7 = new G3rfBcr();\n          }\n          class ek{}\n          class h{}\n          G3rfBcr Std3BB4 = new p.G3rfBcr();\n        }\n        class T{}\n        \n      }\n      class mO{}\n      class Q{}\n      \n    }\n    class Lr {\n\n      Lr W = new G3rfBcr.Lr();\n      G3rfBcr.Lr d = new Lr();\n      p rJ_ = new p();\n    }\n    class I {\n\n      G3rfBcr.I BiX = new G3rfBcr.I();\n    }\n    class R{}\n    G3rfBcr.N LRez = new N();\n    p.G3rfBcr.Lr ez = new p.G3rfBcr.Lr();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "y");
        assertTrue(clazz.prettyprint().contains("class y "));
        assertFalse(clazz.prettyprint().contains("class p "));
    }

    @Test
    public void test055() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Pskuk {\n  class t {\n    class f {\n      class D8PT {\n        class h8 {\n          class KY {\n            class qa {\n              class ftt4x {\n                class ifdK{}\n                class F{}\n                class MO {\n\n                  qa L = new h8.KY.qa();\n                }\n                Pskuk.t.f.D8PT.h8 zYhIvE = new t.f.D8PT.h8();\n              }\n              \n            }\n            class z {\n\n              KY P = new Pskuk.t.f.D8PT.h8.KY();\n              Pskuk oj = new Pskuk();\n              KY h = new t.f.D8PT.h8.KY();\n              D8PT.h8.KY.z Yg0 = new z();\n            }\n            class oy {\n\n              Pskuk.t x = new t();\n            }\n            class bn {\n\n              f.D8PT.h8.KY im = new KY();\n              Pskuk uu = new Pskuk();\n              f.D8PT B = new D8PT();\n              t p = new t();\n            }\n            \n          }\n          class gJ {\n\n            gJ YvP3S1 = new t.f.D8PT.h8.gJ();\n          }\n          class nKq9gWRh{}\n          class o{}\n          t.f.D8PT.h8.KY TI = new f.D8PT.h8.KY();\n          Pskuk W = new Pskuk();\n        }\n        class s{}\n        t.f oo = new Pskuk.t.f();\n        h8 g = new h8();\n        f.D8PT Q = new Pskuk.t.f.D8PT();\n        t tq = new Pskuk.t();\n      }\n      class l{}\n      class Nt {\n\n        Pskuk lH = new Pskuk();\n        Nt g1 = new t.f.Nt();\n      }\n      \n    }\n    static class ep{}\n    Pskuk Ec = new Pskuk();\n  }\n  class Or {\n\n    Pskuk.Or u = new Pskuk.Or();\n  }\n  t m = new Pskuk.t();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "zx_");
        assertTrue(clazz.prettyprint().contains("class zx_ "));
        assertFalse(clazz.prettyprint().contains("class Pskuk "));
    }

    @Test
    public void test056() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class WI29F {\n  class G {\n    class jbB {\n      class Q7g {\n        class qny {\n          class F {\n            class Li {\n              class jY{}\n              class rw{}\n              class E{}\n              class Ym {\n\n                G.jbB v = new WI29F.G.jbB();\n              }\n              \n            }\n            WI29F M = new WI29F();\n            jbB.Q7g.qny.F JLp = new G.jbB.Q7g.qny.F();\n            jbB.Q7g.qny.F.Li PO = new G.jbB.Q7g.qny.F.Li();\n            WI29F.G d = new WI29F.G();\n          }\n          class b{}\n          \n        }\n        class Z {\n\n          Q7g.Z fCG_ = new WI29F.G.jbB.Q7g.Z();\n          WI29F tzc = new WI29F();\n        }\n        class hM {\n\n          WI29F W = new WI29F();\n          G.jbB.Q7g.hM eQ = new Q7g.hM();\n          WI29F T = new WI29F();\n          WI29F Dw = new WI29F();\n        }\n        class i{}\n        \n      }\n      class V{}\n      class e {\n\n        G.jbB X = new jbB();\n        WI29F.G k = new G();\n        WI29F vC = new WI29F();\n        WI29F S = new WI29F();\n        WI29F D = new WI29F();\n        WI29F.G.jbB y = new WI29F.G.jbB();\n      }\n      class cSY{}\n      \n    }\n    class du {\n\n      WI29F.G FfO = new G();\n    }\n    WI29F dd = new WI29F();\n  }\n  class BdpB {\n\n    WI29F.BdpB K = new WI29F.BdpB();\n    WI29F.BdpB p = new WI29F.BdpB();\n    WI29F z = new WI29F();\n  }\n  class Pm {\n\n    WI29F n = new WI29F();\n  }\n  static class alB{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "FB");
        assertTrue(clazz.prettyprint().contains("class FB "));
        assertFalse(clazz.prettyprint().contains("class WI29F "));
    }

    @Test
    public void test057() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Z {\n  class Mf3 {\n    class N8 {\n      class u {\n        class C {\n          class HTZV3 {\n            class aNh7 {\n              class FF {\n                class M4{}\n                class d{}\n                HTZV3 yGJ = new u.C.HTZV3();\n                Z.Mf3.N8.u.C pXh_rZ = new Mf3.N8.u.C();\n                Z.Mf3.N8.u.C.HTZV3.aNh7 n = new Z.Mf3.N8.u.C.HTZV3.aNh7();\n                u zp = new N8.u();\n              }\n              class U{}\n              class zXT {\n\n                aNh7.zXT rX = new N8.u.C.HTZV3.aNh7.zXT();\n                u.C.HTZV3.aNh7 M = new C.HTZV3.aNh7();\n                N8.u s3u = new Z.Mf3.N8.u();\n              }\n              class b{}\n              Mf3 or = new Mf3();\n              Mf3.N8.u zeE7 = new N8.u();\n            }\n            class nGGP {\n\n              Z Mr = new Z();\n            }\n            class T{}\n            Z S = new Z();\n            Z.Mf3 fL = new Mf3();\n            Mf3 rK = new Mf3();\n          }\n          Z.Mf3.N8.u.C MOe = new u.C();\n          Z D = new Z();\n          Z.Mf3.N8.u.C my = new Mf3.N8.u.C();\n        }\n        class Yb {\n\n          N8.u R9 = new u();\n          Mf3 r = new Mf3();\n          u xg = new Mf3.N8.u();\n          Mf3.N8 m = new Z.Mf3.N8();\n        }\n        class q {\n\n          N8 DHUI = new Z.Mf3.N8();\n        }\n        Mf3.N8 Wl = new N8();\n        N8 P = new Z.Mf3.N8();\n      }\n      class g{}\n      class IqZ {\n\n        Z.Mf3.N8.IqZ XS2 = new IqZ();\n      }\n      class fHo65 {\n\n        Z.Mf3 YkCm_B = new Mf3();\n        Mf3 Os = new Mf3();\n      }\n      \n    }\n    N8 mqc = new N8();\n    Z l = new Z();\n    Z yB5 = new Z();\n  }\n  class xpT {\n\n    Z K = new Z();\n    Z p = new Z();\n    xpT Geezv = new Z.xpT();\n  }\n  Z B = new Z();\n  Z mW = new Z();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "W");
        assertTrue(clazz.prettyprint().contains("class W "));
        assertFalse(clazz.prettyprint().contains("class Z "));
    }

    @Test
    public void test058() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class mQ {\n  class PfgJ {\n    class u {\n      class U {\n        class aBb {\n          class mj5aYYZmUp {\n\n            mQ.PfgJ.u b = new u();\n          }\n          class K{}\n          class w8G {\n\n            mQ.PfgJ.u D = new PfgJ.u();\n            PfgJ mro = new mQ.PfgJ();\n          }\n          \n        }\n        class E8kiY{}\n        class V {\n\n          u EW = new u();\n          mQ.PfgJ.u.U.V p = new U.V();\n        }\n        class xpj9G{}\n        PfgJ.u.U.V J = new u.U.V();\n      }\n      class Me{}\n      class yf {\n\n        mQ.PfgJ.u rLE8zVo = new u();\n      }\n      class M {\n\n        PfgJ AbZ = new PfgJ();\n      }\n      \n    }\n    class gl{}\n    class joU {\n\n      mQ r = new mQ();\n      PfgJ Kv = new mQ.PfgJ();\n      mQ.PfgJ.joU S = new mQ.PfgJ.joU();\n      PfgJ.joU MrS = new joU();\n    }\n    class O{}\n    \n  }\n  class e{}\n  class G227Q8Y {\n\n    mQ.G227Q8Y alb = new mQ.G227Q8Y();\n  }\n  class G {\n\n    mQ ZM = new mQ();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "IQ");
        assertTrue(clazz.prettyprint().contains("class IQ "));
        assertFalse(clazz.prettyprint().contains("class mQ "));
    }

    @Test
    public void test059() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class w {\n  class E {\n    class cp {\n      class pBB_B {\n        class n {\n          class N {\n            class zGs {\n              class Q {\n\n                E.cp CLS = new w.E.cp();\n              }\n              class g{}\n              class A {\n\n                E.cp.pBB_B Qs = new cp.pBB_B();\n              }\n              \n            }\n            class fF {\n\n              cp.pBB_B.n B = new pBB_B.n();\n            }\n            class gyh{}\n            class x{}\n            pBB_B mn = new E.cp.pBB_B();\n          }\n          class Z6 {\n\n            n A3Z = new w.E.cp.pBB_B.n();\n            pBB_B.n GHw_ = new cp.pBB_B.n();\n          }\n          class hlChx {\n\n            E.cp A5O = new cp();\n          }\n          class O{}\n          w.E oo7KDOp8 = new E();\n          w.E.cp R = new cp();\n          w.E.cp.pBB_B BWlAy = new E.cp.pBB_B();\n        }\n        class Kh {\n\n          pBB_B iq = new w.E.cp.pBB_B();\n        }\n        w.E L = new w.E();\n      }\n      \n    }\n    class M {\n\n      E TJ = new w.E();\n      w H = new w();\n      E d = new w.E();\n      E.M Ny = new M();\n      w a4 = new w();\n    }\n    static class tr{}\n    static class D{}\n    w.E i = new E();\n  }\n  class pL00{}\n  class teNpFUyEN6{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "r2");
        assertTrue(clazz.prettyprint().contains("class r2 "));
        assertFalse(clazz.prettyprint().contains("class w "));
    }

    @Test
    public void test060() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class G {\n  class yf7 {\n    class gz {\n      class L {\n        class te {\n          class us {\n            class ImWcC {\n              class bq {\n                class e {\n                  class F {\n\n                    e nF = new te.us.ImWcC.bq.e();\n                  }\n                  class Vokw{}\n                  class R{}\n                  class k {\n\n                    yf7.gz.L.te.us fbx = new L.te.us();\n                    bq O = new te.us.ImWcC.bq();\n                  }\n                  \n                }\n                class m{}\n                e nSsIpSM = new us.ImWcC.bq.e();\n              }\n              te qH = new G.yf7.gz.L.te();\n            }\n            \n          }\n          class p{}\n          gz.L.te AAe0GH = new te();\n        }\n        class T {\n\n          yf7 h = new yf7();\n          G.yf7.gz SR = new yf7.gz();\n        }\n        G.yf7 fn = new yf7();\n      }\n      static class KwfS{}\n      class n {\n\n        G OX = new G();\n      }\n      class GolSq54{}\n      \n    }\n    class g {\n\n      yf7 NMExN = new yf7();\n      G JAQ = new G();\n      G q = new G();\n      G.yf7 t = new yf7();\n      yf7 R04d8 = new yf7();\n    }\n    class dW {\n\n      yf7 K8xZw = new yf7();\n      G I = new G();\n      G l = new G();\n    }\n    static class tA2{}\n    G.yf7.tA2 yo = new yf7.tA2();\n    yf7.g z = new yf7.g();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "hFr");
        assertTrue(clazz.prettyprint().contains("class hFr "));
        assertFalse(clazz.prettyprint().contains("class G "));
    }

    @Test
    public void test061() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class roP2 {\n  class I {\n    class Wp {\n      class N {\n        class WL {\n          class a {\n            class Jb {\n              class ETPg {\n                class c {\n                  class r {\n\n                    roP2.I Ob = new I();\n                  }\n                  class EV{}\n                  \n                }\n                \n              }\n              roP2 kf = new roP2();\n            }\n            class fVS{}\n            class ai {\n\n              roP2.I.Wp.N.WL.a gr5gm = new I.Wp.N.WL.a();\n              ai DD = new roP2.I.Wp.N.WL.a.ai();\n            }\n            Wp uk = new roP2.I.Wp();\n            I.Wp z = new roP2.I.Wp();\n          }\n          class aRL1CV {\n\n            roP2.I utj1s8y = new roP2.I();\n            N cX = new I.Wp.N();\n            roP2.I.Wp.N tT = new I.Wp.N();\n          }\n          class P {\n\n            Wp MPt = new roP2.I.Wp();\n            roP2.I.Wp R = new Wp();\n          }\n          class D {\n\n            N.WL.D h8 = new N.WL.D();\n            roP2.I.Wp.N S = new Wp.N();\n            roP2.I LG = new roP2.I();\n          }\n          I.Wp.N RuFLg = new roP2.I.Wp.N();\n        }\n        Wp.N V6fikR_K = new I.Wp.N();\n        I.Wp J = new roP2.I.Wp();\n        Wp.N w = new roP2.I.Wp.N();\n      }\n      class C{}\n      static class U{}\n      I s = new roP2.I();\n      U p0 = new Wp.U();\n      roP2.I l = new I();\n    }\n    roP2.I A4U = new I();\n  }\n  static class t{}\n  class HY {\n\n    roP2 oOw = new roP2();\n  }\n  class f {\n\n    roP2 A = new roP2();\n  }\n  roP2 KoAy = new roP2();\n  roP2 jq = new roP2();\n  roP2 n = new roP2();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Q");
        assertTrue(clazz.prettyprint().contains("class Q "));
        assertFalse(clazz.prettyprint().contains("class roP2 "));
    }

    @Test
    public void test062() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class tKK {\n  class b {\n    class ar {\n      class Z {\n        class rZf {\n          class R {\n            class d {\n              class bgS {\n                class z {\n                  class E{}\n                  class mtJ7{}\n                  \n                }\n                class DM{}\n                class u {\n\n                  b.ar.Z.rZf x = new rZf();\n                  R.d.bgS qcR = new tKK.b.ar.Z.rZf.R.d.bgS();\n                  tKK.b.ar.Z.rZf.R.d P = new Z.rZf.R.d();\n                }\n                \n              }\n              class YzI{}\n              tKK.b K = new b();\n              ar.Z OzR = new b.ar.Z();\n            }\n            class h{}\n            b.ar.Z ly1Qu2_L = new ar.Z();\n          }\n          rZf.R hPW_ = new ar.Z.rZf.R();\n        }\n        b g = new tKK.b();\n        ar.Z.rZf PF3 = new rZf();\n      }\n      \n    }\n    class MZF{}\n    class qt {\n\n      tKK.b o = new b();\n      b.qt wG = new tKK.b.qt();\n    }\n    class c {\n\n      b A = new b();\n      tKK.b.c y = new c();\n    }\n    \n  }\n  class MATD {\n\n    tKK V = new tKK();\n    MATD p = new tKK.MATD();\n  }\n  static class tU{}\n  class nM {\n\n    tKK v = new tKK();\n  }\n  tKK CI = new tKK();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Vi");
        assertTrue(clazz.prettyprint().contains("class Vi "));
        assertFalse(clazz.prettyprint().contains("class tKK "));
    }

    @Test
    public void test063() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class N {\n  class H {\n    class L {\n      class cQa {\n        class PV {\n          class D {\n            class u {\n              class Rd {\n                class O {\n                  class Pb {\n\n                    H.L.cQa.PV.D.u.Rd j = new cQa.PV.D.u.Rd();\n                  }\n                  class F0L{}\n                  class VL {\n\n                    O AvP = new cQa.PV.D.u.Rd.O();\n                    N.H.L.cQa.PV.D.u.Rd.O q = new L.cQa.PV.D.u.Rd.O();\n                  }\n                  L.cQa.PV.D.u a = new D.u();\n                }\n                class m {\n\n                  L.cQa.PV mA = new H.L.cQa.PV();\n                  D.u.Rd fA9 = new D.u.Rd();\n                }\n                class fi{}\n                \n              }\n              class d {\n\n                cQa mQf2v = new L.cQa();\n              }\n              H.L k1 = new H.L();\n            }\n            class Y {\n\n              N.H.L.cQa wS_ = new N.H.L.cQa();\n              H kz = new H();\n            }\n            \n          }\n          L.cQa.PV G = new cQa.PV();\n          N KIgq = new N();\n        }\n        H.L.cQa Yp = new cQa();\n        N.H.L ey = new N.H.L();\n        N.H ZG = new N.H();\n        PV i = new L.cQa.PV();\n        L w = new H.L();\n      }\n      class f{}\n      class E{}\n      class b{}\n      \n    }\n    \n  }\n  class M0r {\n\n    N.M0r Y9z = new N.M0r();\n    N oC = new N();\n    M0r s = new N.M0r();\n  }\n  class v {\n\n    N B = new N();\n    N.v gZ5 = new N.v();\n  }\n  class U {\n\n    N P = new N();\n    N OhG = new N();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Bf");
        assertTrue(clazz.prettyprint().contains("class Bf "));
        assertFalse(clazz.prettyprint().contains("class N "));
    }

    @Test
    public void test064() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class a {\n  class DL {\n    class J {\n      class bx {\n        class jP {\n          class g4zx7 {\n            class f9 {\n              class Zs {\n                class i{}\n                class h {\n\n                  a P8 = new a();\n                  DL.J.bx.jP.g4zx7.f9.Zs T = new f9.Zs();\n                }\n                class SPl {\n\n                  DL.J.bx.jP QG76O = new J.bx.jP();\n                  f9 IJ = new g4zx7.f9();\n                }\n                class GO{}\n                DL.J Owhe = new J();\n                jP.g4zx7.f9 mgD = new f9();\n              }\n              class e {\n\n                a zL = new a();\n              }\n              class Okxob{}\n              class N{}\n              \n            }\n            DL.J s = new a.DL.J();\n          }\n          class Yl6{}\n          class I {\n\n            a.DL.J.bx.jP W = new a.DL.J.bx.jP();\n            a.DL.J m = new J();\n          }\n          a UA = new a();\n        }\n        J v = new J();\n        DL.J.bx jawNz = new a.DL.J.bx();\n      }\n      class p {\n\n        a o = new a();\n      }\n      class RdA {\n\n        a lL = new a();\n      }\n      static class TS1{}\n      a C = new a();\n      a u = new a();\n      DL tfS = new DL();\n      a Z1FcY7 = new a();\n      DL c = new a.DL();\n    }\n    class F {\n\n      a gC = new a();\n    }\n    \n  }\n  class Hf6zIhG {\n\n    Hf6zIhG O = new Hf6zIhG();\n    a.Hf6zIhG tvz = new a.Hf6zIhG();\n  }\n  class X{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "d");
        assertTrue(clazz.prettyprint().contains("class d "));
        assertFalse(clazz.prettyprint().contains("class a "));
    }

    @Test
    public void test065() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class qT {\n  class z {\n    class O {\n      class Q {\n        class V {\n          class R {\n            class E {\n              class G {\n                class a{}\n                class c{}\n                qT.z.O.Q.V X = new O.Q.V();\n              }\n              class s{}\n              class zKPU {\n\n                qT PVB = new qT();\n              }\n              class Nt {\n\n                V.R.E.Nt K = new V.R.E.Nt();\n              }\n              z.O J = new O();\n            }\n            qT.z j = new qT.z();\n          }\n          class t {\n\n            O.Q fto = new O.Q();\n            z fvD = new z();\n            z A = new z();\n            qT.z m6KT60 = new z();\n            qT.z.O.Q.V.t v = new O.Q.V.t();\n            qT Rw = new qT();\n          }\n          O.Q.V J1 = new qT.z.O.Q.V();\n        }\n        class oO{}\n        class Oz{}\n        class x {\n\n          Q kI = new Q();\n          Q gD_Vts = new O.Q();\n        }\n        \n      }\n      class GK {\n\n        qT.z YG = new z();\n        z.O.GK iAR = new z.O.GK();\n      }\n      class W_{}\n      class K5{}\n      qT.z oUe = new z();\n    }\n    class zbctYw05{}\n    \n  }\n  qT.z oB = new z();\n  z cZf3 = new z();\n  qT.z ysM = new z();\n  qT Kl = new qT();\n  qT Wy = new qT();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "YjEqu");
        assertTrue(clazz.prettyprint().contains("class YjEqu "));
        assertFalse(clazz.prettyprint().contains("class qT "));
    }

    @Test
    public void test066() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class D {\n  class U {\n    class s {\n      class PdB {\n        class x {\n          class p {\n            class h {\n              class fCY {\n                class H {\n\n                  PdB Q = new PdB();\n                  D zQB = new D();\n                }\n                class W6u {\n\n                  U.s FZ = new s();\n                  h i = new x.p.h();\n                  h.fCY.W6u u = new W6u();\n                  x.p W = new PdB.x.p();\n                  fCY.W6u JC = new h.fCY.W6u();\n                  D S = new D();\n                }\n                class A{}\n                U.s aBeL = new s();\n                D.U ZE = new D.U();\n              }\n              s IO = new U.s();\n              D.U.s.PdB cS6zFM = new U.s.PdB();\n              D.U.s.PdB.x wvgkD = new s.PdB.x();\n              PdB.x.p.h.fCY F = new U.s.PdB.x.p.h.fCY();\n              h Li = new U.s.PdB.x.p.h();\n            }\n            \n          }\n          class a {\n\n            U.s.PdB q99 = new s.PdB();\n          }\n          class o{}\n          x K6S = new D.U.s.PdB.x();\n        }\n        class R {\n\n          s n = new D.U.s();\n        }\n        class P3jRL {\n\n          D oJx7s = new D();\n          D M = new D();\n          s.PdB Y = new PdB();\n        }\n        class j {\n\n          s BY = new U.s();\n          U.s tdf = new U.s();\n        }\n        PdB.P3jRL Gq = new s.PdB.P3jRL();\n        U gYF = new U();\n      }\n      class Az8opI {\n\n        U AD = new D.U();\n        D B = new D();\n        D L = new D();\n        Az8opI su = new Az8opI();\n        s J = new D.U.s();\n        U c = new D.U();\n      }\n      class O{}\n      \n    }\n    class E {\n\n      E l = new E();\n    }\n    D.U w7 = new U();\n  }\n  static class f{}\n  class e5v{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(5);
        Refactoring.changeTypeName(clazz, "q");
        assertTrue(clazz.prettyprint().contains("class q "));
        assertFalse(clazz.prettyprint().contains("class p "));
    }

    @Test
    public void test067() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class l {\n  class mF8 {\n    class XR {\n      class B {\n        class D {\n          class u {\n            class ja {\n              class Q {\n                class Zd{}\n                class m{}\n                \n              }\n              class xV8 {\n\n                l.mF8 eu = new l.mF8();\n                l h = new l();\n              }\n              class JZ {\n\n                B.D K = new D();\n              }\n              \n            }\n            class Gb{}\n            class U {\n\n              B.D sI = new D();\n              XR.B.D.u iIo = new XR.B.D.u();\n              U GVL = new u.U();\n              l vzv = new l();\n            }\n            l.mF8 to = new mF8();\n            Gb j = new mF8.XR.B.D.u.Gb();\n          }\n          class I7{}\n          class pIlIN{}\n          \n        }\n        \n      }\n      static class t{}\n      class Yoj{}\n      mF8.XR.B sHn = new XR.B();\n      l hv = new l();\n    }\n    class e9 {\n\n      l.mF8 c = new l.mF8();\n      l Vm = new l();\n    }\n    l i = new l();\n    l.mF8.e9 ke = new e9();\n    XR S = new XR();\n    l.mF8 p = new mF8();\n  }\n  class W {\n\n    l te6 = new l();\n  }\n  class sPOf {\n\n    l eKaD6 = new l();\n    sPOf N = new sPOf();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "bc");
        assertTrue(clazz.prettyprint().contains("class bc "));
        assertFalse(clazz.prettyprint().contains("class l "));
    }

    @Test
    public void test068() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class r {\n  class g {\n    class kceNd {\n      class p {\n        class Vd {\n          class W {\n            class kSH {\n              class a {\n                class D {\n\n                  r.g.kceNd.p.Vd.W.kSH F2 = new p.Vd.W.kSH();\n                }\n                class tW3J {\n\n                  p.Vd cp = new kceNd.p.Vd();\n                }\n                class ws {\n\n                  p.Vd w = new kceNd.p.Vd();\n                  W.kSH vYspuE = new kceNd.p.Vd.W.kSH();\n                }\n                class T7w{}\n                g.kceNd.p.Vd rsR = new Vd();\n              }\n              p.Vd.W.kSH.a Jre6 = new Vd.W.kSH.a();\n              g.kceNd.p.Vd.W Y = new r.g.kceNd.p.Vd.W();\n            }\n            class JT{}\n            class P{}\n            g N = new g();\n          }\n          class Jvqg {\n\n            r V = new r();\n            g eY = new r.g();\n            r X = new r();\n          }\n          \n        }\n        class Vn4_{}\n        class PT{}\n        r.g.kceNd.p nt = new r.g.kceNd.p();\n        g.kceNd vP = new r.g.kceNd();\n      }\n      r.g.kceNd.p XP = new kceNd.p();\n      g.kceNd M = new g.kceNd();\n    }\n    class f {\n\n      r.g xKer = new g();\n    }\n    \n  }\n  class F0{}\n  class YI {\n\n    YI fhK_ = new r.YI();\n    r o = new r();\n  }\n  static class JGP{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "dEd5dT");
        assertTrue(clazz.prettyprint().contains("class dEd5dT "));
        assertFalse(clazz.prettyprint().contains("class r "));
    }

    @Test
    public void test069() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Wu {\n  class q {\n    class e {\n      class m {\n        class kHvQJ {\n          class Y {\n            class VD {\n\n              Wu NI = new Wu();\n              kHvQJ.Y tGOJV = new e.m.kHvQJ.Y();\n            }\n            class dwe{}\n            class pw {\n\n              Wu tq = new Wu();\n              q.e wV = new Wu.q.e();\n              q.e Mq8P = new Wu.q.e();\n            }\n            Wu.q A = new Wu.q();\n          }\n          class C{}\n          class x {\n\n            q.e.m PshTF = new Wu.q.e.m();\n          }\n          class Tx{}\n          q p = new q();\n          kHvQJ n = new q.e.m.kHvQJ();\n        }\n        class Zl {\n\n          Wu.q O4zr = new q();\n        }\n        class Yl{}\n        static class M{}\n        Wu.q N = new Wu.q();\n      }\n      static class u{}\n      static class pXaF{}\n      q.e S8Mv = new e();\n      q B = new Wu.q();\n    }\n    class l{}\n    class g {\n\n      Wu j_E8 = new Wu();\n    }\n    class y {\n\n      Wu F9Sj2PI = new Wu();\n      Wu.q.y hV1 = new Wu.q.y();\n    }\n    e K = new Wu.q.e();\n  }\n  class k{}\n  Wu l8aM = new Wu();\n  k aO = new k();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "C07");
        assertTrue(clazz.prettyprint().contains("class C07 "));
        assertFalse(clazz.prettyprint().contains("class Wu "));
    }

    @Test
    public void test070() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class H1tR {\n  class X {\n    class b {\n      class puWY_17 {\n        class op {\n          class h {\n            class qQ {\n              class Tn {\n                class n {\n                  class Z {\n\n                    H1tR.X.b.puWY_17 Uw = new H1tR.X.b.puWY_17();\n                    H1tR.X F = new H1tR.X();\n                    b d = new b();\n                    op.h Fw9jHx = new op.h();\n                  }\n                  class lSn{}\n                  class E {\n\n                    puWY_17.op.h.qQ.Tn Y = new op.h.qQ.Tn();\n                  }\n                  \n                }\n                class u{}\n                class dDGrZ{}\n                class oy {\n\n                  puWY_17.op.h iA = new puWY_17.op.h();\n                }\n                \n              }\n              class W{}\n              \n            }\n            h.qQ B7 = new qQ();\n            X j4N = new X();\n          }\n          H1tR s = new H1tR();\n        }\n        b.puWY_17.op V = new op();\n      }\n      class N{}\n      \n    }\n    \n  }\n  class I {\n\n    H1tR JFz1PyG = new H1tR();\n    H1tR.I ox = new I();\n    H1tR Ys = new H1tR();\n    H1tR Ip_C = new H1tR();\n  }\n  class Q5 {\n\n    H1tR i7s = new H1tR();\n  }\n  class C {\n\n    H1tR.C VMYI = new C();\n    H1tR.C D = new H1tR.C();\n    H1tR C0H = new H1tR();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "H");
        assertTrue(clazz.prettyprint().contains("class H "));
        assertFalse(clazz.prettyprint().contains("class H1tR "));
    }

    @Test
    public void test071() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class E {\n  class S {\n    class g {\n      class mO {\n        class CvS {\n          class O {\n            class u {\n              class WI {\n                class IkKRWr {\n\n                  g N = new g();\n                  mO.CvS.O.u z = new mO.CvS.O.u();\n                  E.S.g.mO.CvS.O.u.WI aL0EP = new g.mO.CvS.O.u.WI();\n                  E k9 = new E();\n                  g.mO e = new S.g.mO();\n                  S.g.mO.CvS xx = new E.S.g.mO.CvS();\n                }\n                class Jr {\n\n                  S I = new S();\n                  E.S.g.mO.CvS.O.u.WI pM = new g.mO.CvS.O.u.WI();\n                }\n                g DM = new E.S.g();\n                E.S v = new S();\n                g.mO.CvS.O.u.WI wRm = new E.S.g.mO.CvS.O.u.WI();\n              }\n              class KY {\n\n                E a48qS = new E();\n              }\n              E.S.g Z = new g();\n            }\n            class v2d {\n\n              S.g k = new S.g();\n            }\n            class r {\n\n              E.S.g j_ = new g();\n              E a3K1z = new E();\n              r sa_ = new g.mO.CvS.O.r();\n            }\n            \n          }\n          class R {\n\n            S a = new S();\n          }\n          \n        }\n        class h{}\n        class R5e{}\n        g NL = new S.g();\n      }\n      class Hm {\n\n        E.S.g.Hm F = new g.Hm();\n      }\n      class n {\n\n        S.g.n IhQ = new n();\n      }\n      \n    }\n    S X8PPy4oo4 = new E.S();\n    E.S.g LT = new S.g();\n    S.g ZsOjg = new E.S.g();\n  }\n  class f {\n\n    E.f jX = new f();\n  }\n  class MLfy {\n\n    E.MLfy I3 = new E.MLfy();\n  }\n  class H_V {\n\n    E.H_V s = new E.H_V();\n  }\n  E r2_ = new E();\n  S oD = new E.S();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "j");
        assertTrue(clazz.prettyprint().contains("class j "));
        assertFalse(clazz.prettyprint().contains("class E "));
    }

    @Test
    public void test072() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class NH {\n  class cVN {\n    class d {\n      class yt {\n        class I {\n          class O {\n            class R {\n              class F48{}\n              \n            }\n            class C {\n\n              cVN on = new cVN();\n              NH UDJf3 = new NH();\n            }\n            \n          }\n          class GQ{}\n          class P{}\n          class GjS{}\n          cVN.d.yt.I G82J = new NH.cVN.d.yt.I();\n          O msR = new d.yt.I.O();\n          NH.cVN E = new NH.cVN();\n          cVN q = new NH.cVN();\n        }\n        class No{}\n        class zg{}\n        cVN.d.yt.zg y = new yt.zg();\n        NH k = new NH();\n        NH.cVN.d.yt X = new yt();\n      }\n      class rNR {\n\n        NH L = new NH();\n        cVN.d.rNR PV = new cVN.d.rNR();\n        cVN.d FB = new NH.cVN.d();\n      }\n      class z{}\n      class V9 {\n\n        NH Wi = new NH();\n        cVN Qyb = new NH.cVN();\n        cVN U = new NH.cVN();\n        NH e = new NH();\n      }\n      \n    }\n    class BjD{}\n    class eT_{}\n    \n  }\n  static class j{}\n  NH Cj = new NH();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "i");
        assertTrue(clazz.prettyprint().contains("class i "));
        assertFalse(clazz.prettyprint().contains("class NH "));
    }

    @Test
    public void test073() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class GpW7v {\n  class e {\n    class f8eC {\n      class zFT {\n        class yl {\n          class FDH {\n            class G {\n              class k {\n                class zT{}\n                class Z{}\n                class Ouk {\n\n                  e w = new e();\n                  e.f8eC.zFT.yl.FDH GMx = new yl.FDH();\n                  f8eC v3Yl = new f8eC();\n                }\n                class xS {\n\n                  e.f8eC.zFT.yl.FDH.G.k iDIBS6 = new k();\n                }\n                \n              }\n              class HyN3B {\n\n                yl.FDH QQC = new FDH();\n              }\n              class oCMF {\n\n                oCMF ES = new yl.FDH.G.oCMF();\n              }\n              \n            }\n            \n          }\n          class l {\n\n            GpW7v.e.f8eC KI = new e.f8eC();\n          }\n          e.f8eC.zFT.yl.FDH zIqnK = new FDH();\n        }\n        class SM{}\n        class a{}\n        class FePUH{}\n        FePUH IK = new FePUH();\n        GpW7v.e d = new e();\n        GpW7v.e.f8eC JhI = new e.f8eC();\n        GpW7v O = new GpW7v();\n      }\n      \n    }\n    class c2SdV {\n\n      GpW7v.e S = new e();\n    }\n    class qx {\n\n      GpW7v.e Hg4 = new e();\n    }\n    GpW7v C = new GpW7v();\n  }\n  class I {\n\n    GpW7v Pjerx = new GpW7v();\n    GpW7v t = new GpW7v();\n  }\n  static class u{}\n  GpW7v.e Yfaf = new e();\n  GpW7v ZpT = new GpW7v();\n  GpW7v ckc = new GpW7v();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(6);
        Refactoring.changeTypeName(clazz, "mPLn");
        assertTrue(clazz.prettyprint().contains("class mPLn "));
        assertFalse(clazz.prettyprint().contains("class G "));
    }

    @Test
    public void test074() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class F {\n  class lJu3 {\n    class k {\n      class OGywk {\n        class Tk {\n          class v {\n            class L {\n              class j {\n                class u{}\n                class NJp {\n\n                  OGywk.Tk.v.L.j JxiDG = new j();\n                }\n                class l {\n\n                  lJu3.k.OGywk.Tk.v i = new v();\n                  Tk.v.L.j.l Jc = new v.L.j.l();\n                }\n                j.u cK = new L.j.u();\n                F.lJu3 QF = new F.lJu3();\n              }\n              class W{}\n              \n            }\n            class yUnadINOiM{}\n            \n          }\n          static class a{}\n          class y {\n\n            k qx3nI = new lJu3.k();\n            F.lJu3 E4 = new lJu3();\n          }\n          class DU {\n\n            F s = new F();\n            F.lJu3.k jz = new k();\n            lJu3.k.OGywk A = new F.lJu3.k.OGywk();\n          }\n          F.lJu3.k.OGywk.Tk ZK = new lJu3.k.OGywk.Tk();\n          F jTB = new F();\n          F.lJu3.k j7B = new lJu3.k();\n          F p7gaRp = new F();\n        }\n        \n      }\n      \n    }\n    class w {\n\n      w O = new F.lJu3.w();\n      F.lJu3 Gg = new F.lJu3();\n      lJu3 bRY = new F.lJu3();\n    }\n    class S {\n\n      lJu3 K = new lJu3();\n      F.lJu3.S SU = new S();\n      F WH = new F();\n      F E5W = new F();\n      S QX6SG = new S();\n      lJu3.S TG = new F.lJu3.S();\n    }\n    F.lJu3 M = new lJu3();\n    F J = new F();\n    F B_ = new F();\n  }\n  static class oi{}\n  class c {\n\n    F zJC8 = new F();\n    F tH = new F();\n    F gH0 = new F();\n  }\n  class n5{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "ys");
        assertTrue(clazz.prettyprint().contains("class ys "));
        assertFalse(clazz.prettyprint().contains("class F "));
    }

    @Test
    public void test075() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class pD84 {\n  class DmlJ {\n    class A {\n      class z {\n        class YomP {\n          class r {\n            class u {\n              class n {\n\n                pD84.DmlJ.A HY = new A();\n                DmlJ h = new pD84.DmlJ();\n              }\n              class DFj {\n\n                A.z.YomP.r dd = new YomP.r();\n              }\n              class K0{}\n              class Cd{}\n              \n            }\n            class sj {\n\n              DmlJ.A jyN = new A();\n              A.z G = new DmlJ.A.z();\n              pD84.DmlJ.A.z.YomP OZ = new A.z.YomP();\n            }\n            class x{}\n            class U{}\n            \n          }\n          class O {\n\n            pD84.DmlJ.A.z C = new pD84.DmlJ.A.z();\n            DmlJ.A uy = new pD84.DmlJ.A();\n          }\n          \n        }\n        class t {\n\n          A P6 = new A();\n        }\n        class MNz{}\n        \n      }\n      class Sb8 {\n\n        DmlJ.A PjO = new A();\n      }\n      class o{}\n      DmlJ Ep0 = new DmlJ();\n      pD84 b = new pD84();\n      DmlJ.A EIm = new DmlJ.A();\n    }\n    \n  }\n  class w2k0 {\n\n    pD84 vL = new pD84();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "a");
        assertTrue(clazz.prettyprint().contains("class a "));
        assertFalse(clazz.prettyprint().contains("class pD84 "));
    }

    @Test
    public void test076() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Z {\n  class zS {\n    class y {\n      class He {\n        class AV {\n          class l {\n            class uIq {\n\n              Z.zS cD = new Z.zS();\n              Z x4l = new Z();\n            }\n            class P{}\n            \n          }\n          class xK{}\n          class V {\n\n            Z.zS.y h_ = new Z.zS.y();\n          }\n          class BfC{}\n          \n        }\n        class i {\n\n          Z.zS.y.He.i b = new i();\n        }\n        class R6MHO {\n\n          Z.zS.y.He.R6MHO s = new R6MHO();\n          zS.y.He.R6MHO J = new zS.y.He.R6MHO();\n        }\n        \n      }\n      static class NZ{}\n      class d {\n\n        Z c = new Z();\n      }\n      class G{}\n      Z.zS i8 = new Z.zS();\n      Z z = new Z();\n      Z L = new Z();\n      Z.zS.y.G WCz = new zS.y.G();\n    }\n    static class X3_{}\n    class O {\n\n      zS.O bpL = new O();\n      Z.zS.O g = new O();\n      Z K = new Z();\n    }\n    static class BT{}\n    Z S = new Z();\n    zS v2 = new Z.zS();\n    zS T = new zS();\n    Z.zS n = new zS();\n    BT Ar = new Z.zS.BT();\n  }\n  static class a{}\n  Z.zS XI = new zS();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "HftR_U");
        assertTrue(clazz.prettyprint().contains("class HftR_U "));
        assertFalse(clazz.prettyprint().contains("class Z "));
    }

    @Test
    public void test077() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class NM {\n  class pev {\n    class Ri {\n      class pglj7 {\n        class h {\n          class n {\n            class fo {\n              class p {\n                class fkoIVI {\n\n                  fo.p Yy = new fo.p();\n                }\n                class V{}\n                class yD05l{}\n                \n              }\n              class Z {\n\n                NM.pev.Ri.pglj7.h.n a = new pglj7.h.n();\n              }\n              \n            }\n            class i{}\n            \n          }\n          class U{}\n          pglj7 mMA = new pglj7();\n        }\n        class J{}\n        \n      }\n      class B{}\n      pev F = new pev();\n    }\n    class W{}\n    static class L{}\n    \n  }\n  class XV {\n\n    XV tN = new XV();\n  }\n  class M {\n\n    M Is = new M();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "q");
        assertTrue(clazz.prettyprint().contains("class q "));
        assertFalse(clazz.prettyprint().contains("class NM "));
    }

    @Test
    public void test078() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class xZf {\n  class AR {\n    class eFKA7sb {\n      class b {\n        class F {\n          class R {\n            class eFYD {\n              class j6 {\n                class ww {\n                  class J {\n\n                    xZf.AR I = new AR();\n                  }\n                  \n                }\n                class G {\n\n                  AR c = new AR();\n                }\n                xZf maK = new xZf();\n              }\n              class oSd{}\n              class Op {\n\n                xZf FY = new xZf();\n              }\n              \n            }\n            class Zl {\n\n              xZf.AR.eFKA7sb.b n = new AR.eFKA7sb.b();\n            }\n            class gj {\n\n              gj rm = new R.gj();\n              xZf.AR.eFKA7sb t = new AR.eFKA7sb();\n            }\n            class u{}\n            AR.eFKA7sb.b.F a = new AR.eFKA7sb.b.F();\n          }\n          class o{}\n          \n        }\n        eFKA7sb e = new AR.eFKA7sb();\n      }\n      static class CA{}\n      class Ui{}\n      \n    }\n    AR d = new xZf.AR();\n  }\n  class jqcR0B {\n\n    xZf pu = new xZf();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(11);
        Refactoring.changeTypeName(clazz, "AF");
        assertTrue(clazz.prettyprint().contains("class AF "));
        assertFalse(clazz.prettyprint().contains("class oSd "));
    }

    @Test
    public void test079() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class j {\n  class HB {\n    class h1 {\n      class os {\n        class c {\n          class y {\n            class n {\n              class Z {\n                class qG {\n                  class m{}\n                  class d {\n\n                    h1.os.c.y w = new h1.os.c.y();\n                    h1.os.c zl = new os.c();\n                    HB.h1 er = new h1();\n                    y.n.Z.qG g = new os.c.y.n.Z.qG();\n                  }\n                  class TF{}\n                  \n                }\n                class G{}\n                class uK {\n\n                  c AaSlNaV = new j.HB.h1.os.c();\n                  os.c.y.n s3rDO = new c.y.n();\n                }\n                os.c.y.n.Z.G v47jw = new os.c.y.n.Z.G();\n                c p = new os.c();\n              }\n              class MsPY {\n\n                HB.h1.os.c.y.n u_ = new os.c.y.n();\n              }\n              \n            }\n            \n          }\n          class s{}\n          class D {\n\n            HB F = new j.HB();\n          }\n          c.s Ok = new HB.h1.os.c.s();\n        }\n        class x{}\n        class OzV {\n\n          h1 RR3 = new h1();\n        }\n        j b = new j();\n        j.HB j3vm = new HB();\n        HB.h1.os.x CYYN = new HB.h1.os.x();\n        j.HB.h1.os TVw = new j.HB.h1.os();\n        j.HB.h1.os.x v = new os.x();\n        h1 K = new j.HB.h1();\n        j a1M = new j();\n      }\n      class R{}\n      class RF{}\n      HB blL = new j.HB();\n    }\n    j.HB.h1 Pb5T = new HB.h1();\n  }\n  static class Gj{}\n  j.Gj q = new j.Gj();\n  HB hO = new j.HB();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "r");
        assertTrue(clazz.prettyprint().contains("class r "));
        assertFalse(clazz.prettyprint().contains("class j "));
    }

    @Test
    public void test080() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class qcR {\n  class V {\n    class kGzQkTk {\n      class v {\n        class e {\n          class e50T5o {\n            class s {\n              class h {\n\n                qcR.V.kGzQkTk.v j = new qcR.V.kGzQkTk.v();\n                qcR t = new qcR();\n              }\n              class OPQua{}\n              class X {\n\n                e.e50T5o.s Z = new kGzQkTk.v.e.e50T5o.s();\n                qcR.V.kGzQkTk.v.e.e50T5o.s Yf = new e.e50T5o.s();\n                qcR.V r = new qcR.V();\n              }\n              class Lw{}\n              \n            }\n            class Ia{}\n            \n          }\n          class x{}\n          class y{}\n          \n        }\n        class D{}\n        class J {\n\n          qcR bO = new qcR();\n        }\n        \n      }\n      static class c{}\n      static class O{}\n      class I{}\n      V HG = new qcR.V();\n    }\n    static class HP{}\n    \n  }\n  V E = new qcR.V();\n  V WIUNz3 = new qcR.V();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "iX");
        assertTrue(clazz.prettyprint().contains("class iX "));
        assertFalse(clazz.prettyprint().contains("class qcR "));
    }

    @Test
    public void test081() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class n {\n  class vymHWOs {\n    class LItuf {\n      class y {\n        class jm {\n          class x {\n            class ReAH {\n              class EkA {\n                class w {\n\n                  LItuf.y.jm.x.ReAH.EkA.w v38X = new w();\n                  x.ReAH.EkA o = new vymHWOs.LItuf.y.jm.x.ReAH.EkA();\n                  LItuf.y da = new LItuf.y();\n                }\n                class L {\n\n                  vymHWOs YYD = new n.vymHWOs();\n                  LItuf.y.jm lF = new y.jm();\n                  n.vymHWOs.LItuf l = new LItuf();\n                  LItuf.y.jm.x.ReAH u = new y.jm.x.ReAH();\n                }\n                class Cx {\n\n                  vymHWOs.LItuf.y.jm lk = new y.jm();\n                }\n                \n              }\n              class egKrR{}\n              class H{}\n              \n            }\n            class k{}\n            ReAH Cj = new ReAH();\n            x.ReAH WRq = new jm.x.ReAH();\n            n.vymHWOs fIT = new n.vymHWOs();\n          }\n          class G{}\n          class YC{}\n          y.jm A = new n.vymHWOs.LItuf.y.jm();\n        }\n        class d {\n\n          n WL = new n();\n          vymHWOs K = new vymHWOs();\n        }\n        n K8_ = new n();\n        n.vymHWOs O = new n.vymHWOs();\n        jm bdk = new y.jm();\n        n IxTN = new n();\n        vymHWOs Bg = new vymHWOs();\n      }\n      static class mjo{}\n      class D{}\n      class lD{}\n      \n    }\n    static class VTSon{}\n    \n  }\n  class Be {\n\n    n h = new n();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "C");
        assertTrue(clazz.prettyprint().contains("class C "));
        assertFalse(clazz.prettyprint().contains("class n "));
    }

    @Test
    public void test082() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Mgb {\n  class cI {\n    class ub {\n      class J {\n        class PE {\n          class xSH {\n            class Y {\n              class s{}\n              class fMxWyD {\n\n                xSH O = new Mgb.cI.ub.J.PE.xSH();\n                cI i = new cI();\n                cI.ub.J b = new ub.J();\n              }\n              \n            }\n            class p{}\n            \n          }\n          class NJ0{}\n          class CKG{}\n          class A{}\n          Mgb.cI fko = new cI();\n        }\n        class hK {\n\n          cI Ac = new Mgb.cI();\n        }\n        \n      }\n      class s4r {\n\n        Mgb UX = new Mgb();\n      }\n      class T{}\n      \n    }\n    class ck {\n\n      Mgb Ug = new Mgb();\n      Mgb N = new Mgb();\n    }\n    Mgb.cI q6B = new Mgb.cI();\n  }\n  class oqb {\n\n    Mgb.oqb Dq = new oqb();\n  }\n  class f{}\n  static class W6{}\n  Mgb K2c = new Mgb();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "FA");
        assertTrue(clazz.prettyprint().contains("class FA "));
        assertFalse(clazz.prettyprint().contains("class Mgb "));
    }

    @Test
    public void test083() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class FA {\n  class KA {\n    class k {\n      class K {\n        class XG_ {\n          class Z {\n            class xF0h {\n              class Ea {\n                class BZ {\n\n                  FA.KA.k.K.XG_.Z Sz = new FA.KA.k.K.XG_.Z();\n                }\n                \n              }\n              class HPtDj{}\n              class OY {\n\n                XG_.Z L4 = new K.XG_.Z();\n              }\n              class X{}\n              \n            }\n            class N{}\n            class WgaHjz{}\n            \n          }\n          class QR {\n\n            K w = new k.K();\n            QR D = new KA.k.K.XG_.QR();\n            XG_ JoAhvpQ4 = new K.XG_();\n            FA.KA.k.K.XG_.QR y = new k.K.XG_.QR();\n            FA.KA u = new KA();\n            KA.k qH = new k();\n            K m = new FA.KA.k.K();\n          }\n          class a{}\n          KA.k z8L = new FA.KA.k();\n          FA.KA.k p = new KA.k();\n        }\n        class byU{}\n        static class e{}\n        static class jG{}\n        K ypG2R = new KA.k.K();\n        KA UAvjf = new FA.KA();\n      }\n      \n    }\n    \n  }\n  class Hkk{}\n  Hkk C = new FA.Hkk();\n  FA QB = new FA();\n  FA.Hkk S = new FA.Hkk();\n  FA P = new FA();\n  FA MO = new FA();\n  Hkk c = new FA.Hkk();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "EAn");
        assertTrue(clazz.prettyprint().contains("class EAn "));
        assertFalse(clazz.prettyprint().contains("class FA "));
    }

    @Test
    public void test084() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class n {\n  class D3 {\n    class fo {\n      class l {\n        class pcQ2 {\n          class e {\n            class Ht {\n              class G{}\n              class F1 {\n\n                fo.l.pcQ2 W = new n.D3.fo.l.pcQ2();\n              }\n              class wu{}\n              \n            }\n            class LAx {\n\n              n.D3.fo.l.pcQ2 Mz = new fo.l.pcQ2();\n            }\n            class E {\n\n              D3.fo.l ak = new fo.l();\n              fo H = new D3.fo();\n              n v = new n();\n              D3.fo.l.pcQ2 fq0 = new D3.fo.l.pcQ2();\n              n xv = new n();\n            }\n            class k {\n\n              D3.fo.l.pcQ2.e c = new l.pcQ2.e();\n              D3.fo GW = new n.D3.fo();\n              k b = new D3.fo.l.pcQ2.e.k();\n              n S = new n();\n            }\n            n JW = new n();\n            n.D3 r0 = new n.D3();\n          }\n          class B{}\n          class KN{}\n          class CQqVpi{}\n          fo.l R = new l();\n        }\n        \n      }\n      class g {\n\n        D3 N00 = new D3();\n      }\n      class A{}\n      n.D3.fo dz = new n.D3.fo();\n    }\n    \n  }\n  class f {\n\n    f r = new f();\n  }\n  static class i1e{}\n  class N{}\n  n.D3 n6iI = new n.D3();\n  n.f XJC = new f();\n  f h79f = new f();\n  f zp5 = new f();\n  n.D3 dSb = new D3();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "GS");
        assertTrue(clazz.prettyprint().contains("class GS "));
        assertFalse(clazz.prettyprint().contains("class n "));
    }

    @Test
    public void test085() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class S {\n  class m {\n    class t {\n      class X {\n        class a4 {\n          class l {\n            class u {\n              class QWo {\n                class FtR {\n\n                  t Dd = new S.m.t();\n                }\n                \n              }\n              class VQ6 {\n\n                X otbb = new X();\n                m.t.X.a4.l.u x = new t.X.a4.l.u();\n                S.m.t i = new m.t();\n              }\n              class Q{}\n              \n            }\n            class SC {\n\n              l p6XkHZx = new t.X.a4.l();\n            }\n            class U{}\n            t.X.a4.l.U X6 = new t.X.a4.l.U();\n            S ZY = new S();\n          }\n          class W8{}\n          class Di{}\n          S.m.t s = new t();\n          S.m.t.X.a4.Di a = new Di();\n          t Ek = new t();\n        }\n        class E{}\n        class j {\n\n          m.t eWZJ = new S.m.t();\n          m.t V = new S.m.t();\n        }\n        S.m d = new S.m();\n        t cRxp = new t();\n        m.t.X s0CLe = new S.m.t.X();\n        S.m.t.X Cf = new m.t.X();\n      }\n      class z{}\n      class x8pF {\n\n        S.m.t.x8pF mIdEha = new S.m.t.x8pF();\n      }\n      class R {\n\n        S Gz = new S();\n        m.t.R P = new t.R();\n      }\n      S.m.t.X Uw = new X();\n      S wvj = new S();\n    }\n    m f = new m();\n  }\n  S.m N = new S.m();\n  S pW = new S();\n  m djI = new S.m();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Lgv");
        assertTrue(clazz.prettyprint().contains("class Lgv "));
        assertFalse(clazz.prettyprint().contains("class S "));
    }

    @Test
    public void test086() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class Q {\n  class gM {\n    class V {\n      class x {\n        class B {\n          class YE64j5a {\n            class yz {\n              class kJ0{}\n              class z {\n\n                gM.V RFw = new V();\n              }\n              class NO{}\n              x.B LQ = new B();\n              B J = new x.B();\n            }\n            class S {\n\n              S w = new Q.gM.V.x.B.YE64j5a.S();\n            }\n            class h {\n\n              Q aS = new Q();\n            }\n            class r{}\n            Q.gM.V.x.B u = new x.B();\n          }\n          class U {\n\n            Q.gM qmT_f = new Q.gM();\n            V.x.B.U n5 = new U();\n            Q.gM.V Dp = new gM.V();\n          }\n          \n        }\n        class e0 {\n\n          Q wZ = new Q();\n        }\n        class R {\n\n          Q.gM.V.x L = new Q.gM.V.x();\n        }\n        class qf{}\n        \n      }\n      class Ej{}\n      \n    }\n    class n {\n\n      gM X = new gM();\n    }\n    class Y{}\n    Q.gM Rl = new gM();\n    Q xhVxF = new Q();\n    gM.n E = new gM.n();\n  }\n  class Pw {\n\n    Pw F = new Q.Pw();\n  }\n  class P {\n\n    P a = new P();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "K");
        assertTrue(clazz.prettyprint().contains("class K "));
        assertFalse(clazz.prettyprint().contains("class Q "));
    }

    @Test
    public void test087() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class B {\n  class ta {\n    class t {\n      class S {\n        class d8L {\n          class lp {\n            class EW {\n              class Rb {\n                class opv6{}\n                class b {\n\n                  S.d8L Mnn = new d8L();\n                  B.ta.t JFJ = new B.ta.t();\n                  ta SP = new B.ta();\n                  t.S.d8L.lp.EW y = new B.ta.t.S.d8L.lp.EW();\n                  EW.Rb U = new EW.Rb();\n                  S c = new S();\n                }\n                class H{}\n                class qL{}\n                \n              }\n              class I570 {\n\n                B.ta.t U0kOzQ6CYe = new B.ta.t();\n                B.ta.t.S pVI = new S();\n                ta.t yd = new ta.t();\n                B.ta spGsO = new B.ta();\n              }\n              class TcT {\n\n                B.ta.t.S.d8L.lp.EW vU = new EW();\n              }\n              \n            }\n            class lL {\n\n              t tG = new ta.t();\n              t.S E = new S();\n            }\n            class lvz{}\n            t.S.d8L.lp g = new t.S.d8L.lp();\n            B.ta DX0t = new ta();\n            B.ta.t.S.d8L Y = new d8L();\n            B.ta.t.S.d8L.lp eV = new t.S.d8L.lp();\n          }\n          class a {\n\n            ta.t d = new t();\n            ta.t.S.d8L hIlTQK = new ta.t.S.d8L();\n          }\n          t.S.d8L s = new d8L();\n          ta gU = new ta();\n          S E6SIGFqs = new B.ta.t.S();\n        }\n        \n      }\n      class kVIK {\n\n        ta F = new B.ta();\n        B G = new B();\n      }\n      class h_ {\n\n        h_ MZ = new ta.t.h_();\n      }\n      class q{}\n      kVIK Z = new ta.t.kVIK();\n      h_ XSv = new ta.t.h_();\n    }\n    class X1Ib{}\n    class bx {\n\n      ta n = new ta();\n    }\n    B.ta C = new ta();\n    B Iu8 = new B();\n    B.ta v = new B.ta();\n    X1Ib w = new B.ta.X1Ib();\n    ta.bx MrV = new B.ta.bx();\n  }\n  class sP {\n\n    B NLOd = new B();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "HHt8");
        assertTrue(clazz.prettyprint().contains("class HHt8 "));
        assertFalse(clazz.prettyprint().contains("class B "));
    }

    @Test
    public void test088() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class n {\n  class MBGhk {\n    class j {\n      class MLcBj8E {\n        class CU {\n          class i {\n            class A {\n              class dk {\n                class vGGNI {\n                  class M3JGw {\n\n                    CU.i.A.dk.vGGNI l0 = new j.MLcBj8E.CU.i.A.dk.vGGNI();\n                    n.MBGhk.j C = new n.MBGhk.j();\n                    n.MBGhk.j.MLcBj8E.CU.i.A.dk.vGGNI D = new n.MBGhk.j.MLcBj8E.CU.i.A.dk.vGGNI();\n                    A.dk u = new dk();\n                    n.MBGhk M = new MBGhk();\n                    CU.i.A.dk.vGGNI.M3JGw pzk_ = new CU.i.A.dk.vGGNI.M3JGw();\n                    n T = new n();\n                    n.MBGhk.j.MLcBj8E.CU.i.A.dk.vGGNI U = new n.MBGhk.j.MLcBj8E.CU.i.A.dk.vGGNI();\n                    MLcBj8E.CU.i o5 = new CU.i();\n                  }\n                  class HCC {\n\n                    MBGhk.j.MLcBj8E.CU k = new MLcBj8E.CU();\n                    MBGhk UBG = new MBGhk();\n                    CU.i.A.dk.vGGNI.HCC K7Nn = new HCC();\n                  }\n                  class Z{}\n                  i vdt2 = new n.MBGhk.j.MLcBj8E.CU.i();\n                }\n                class z {\n\n                  CU.i.A G = new CU.i.A();\n                }\n                MBGhk.j.MLcBj8E.CU.i.A YT = new i.A();\n                vGGNI O = new i.A.dk.vGGNI();\n              }\n              class J8P {\n\n                j.MLcBj8E.CU l = new MLcBj8E.CU();\n              }\n              n v = new n();\n              j.MLcBj8E.CU.i.A.dk cfN = new CU.i.A.dk();\n            }\n            class IS8 {\n\n              j Lx = new n.MBGhk.j();\n              i x = new i();\n              MBGhk tch0eA4mH = new n.MBGhk();\n            }\n            class ZU7 {\n\n              n.MBGhk.j Uo = new n.MBGhk.j();\n              MLcBj8E.CU.i g = new i();\n              n.MBGhk.j EwI = new n.MBGhk.j();\n              MLcBj8E lBj2 = new MLcBj8E();\n              ZU7 W9 = new MLcBj8E.CU.i.ZU7();\n              CU Dnm = new MLcBj8E.CU();\n            }\n            \n          }\n          \n        }\n        class rN{}\n        \n      }\n      n y_ = new n();\n    }\n    static class P{}\n    class UU {\n\n      UU s8 = new UU();\n    }\n    static class V{}\n    MBGhk.P YQ = new n.MBGhk.P();\n    MBGhk.UU y = new MBGhk.UU();\n    MBGhk Sk = new n.MBGhk();\n  }\n  class tx {\n\n    tx rw8E = new n.tx();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "h");
        assertTrue(clazz.prettyprint().contains("class h "));
        assertFalse(clazz.prettyprint().contains("class n "));
    }

    @Test
    public void test089() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class q {\n  class D {\n    class VC0HW2E3 {\n      class E {\n        class RZ {\n          class cUO {\n            class Rh91x {\n              class Tnn8 {\n                class c {\n\n                  VC0HW2E3.E.RZ.cUO.Rh91x.Tnn8 NK = new RZ.cUO.Rh91x.Tnn8();\n                }\n                class xX {\n\n                  D h = new D();\n                }\n                \n              }\n              class hTVq{}\n              \n            }\n            \n          }\n          class fa {\n\n            VC0HW2E3.E.RZ Ear = new RZ();\n          }\n          class n3{}\n          class CB {\n\n            D fi = new q.D();\n          }\n          \n        }\n        class MU{}\n        class k {\n\n          D.VC0HW2E3 bc = new q.D.VC0HW2E3();\n        }\n        \n      }\n      class G{}\n      class O {\n\n        q.D.VC0HW2E3.O N = new VC0HW2E3.O();\n      }\n      \n    }\n    class x{}\n    \n  }\n  static class gs{}\n  gs C = new q.gs();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "hJFEqXO");
        assertTrue(clazz.prettyprint().contains("class hJFEqXO "));
        assertFalse(clazz.prettyprint().contains("class q "));
    }

    @Test
    public void test090() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class aBoI {\n  class ew {\n    class m_f {\n      class ka {\n        class d {\n          class qv {\n            class N {\n              class J {\n                class WY {\n                  class X {\n\n                    aBoI IdZs = new aBoI();\n                    m_f.ka.d.qv.N.J.WY.X y = new ka.d.qv.N.J.WY.X();\n                  }\n                  class H {\n\n                    m_f.ka.d a = new m_f.ka.d();\n                    N yy = new d.qv.N();\n                    aBoI.ew.m_f.ka.d.qv.N.J.WY.H B = new aBoI.ew.m_f.ka.d.qv.N.J.WY.H();\n                    m_f.ka.d.qv x = new ka.d.qv();\n                    ew.m_f.ka.d.qv.N k = new aBoI.ew.m_f.ka.d.qv.N();\n                  }\n                  class vT{}\n                  class E {\n\n                    aBoI L = new aBoI();\n                  }\n                  WY.E AU = new N.J.WY.E();\n                  ka.d.qv SEpy = new ew.m_f.ka.d.qv();\n                }\n                class g5558F{}\n                \n              }\n              class V {\n\n                aBoI R0D = new aBoI();\n                ew.m_f.ka.d XuUlA = new ka.d();\n                ew.m_f.ka.d.qv.N kJ3 = new ka.d.qv.N();\n              }\n              \n            }\n            class YLTn {\n\n              d.qv.YLTn Io = new d.qv.YLTn();\n            }\n            m_f.ka h = new ew.m_f.ka();\n          }\n          \n        }\n        ew.m_f M7r = new aBoI.ew.m_f();\n        aBoI.ew S = new ew();\n        aBoI syk = new aBoI();\n      }\n      class GC{}\n      class D{}\n      \n    }\n    class sg {\n\n      aBoI.ew v = new aBoI.ew();\n    }\n    \n  }\n  static class bC9ufD{}\n  class gBW{}\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "ci");
        assertTrue(clazz.prettyprint().contains("class ci "));
        assertFalse(clazz.prettyprint().contains("class aBoI "));
    }

    @Test
    public void test091() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class g {\n  class hxF {\n    class hE {\n      class m {\n        class t {\n          class T6 {\n            class V {\n              class CnS {\n                class P5 {\n                  class sq4 {\n\n                    g.hxF.hE.m.t.T6.V.CnS.P5.sq4 U = new CnS.P5.sq4();\n                    hE.m.t.T6 Gv = new g.hxF.hE.m.t.T6();\n                  }\n                  class X{}\n                  class je7Q {\n\n                    hxF.hE.m.t.T6.V.CnS dp = new t.T6.V.CnS();\n                    m.t.T6.V.CnS.P5 aHQP = new g.hxF.hE.m.t.T6.V.CnS.P5();\n                  }\n                  \n                }\n                \n              }\n              g.hxF.hE.m n = new hxF.hE.m();\n            }\n            class O{}\n            class qV {\n\n              hE.m S = new hxF.hE.m();\n              hE.m.t w = new g.hxF.hE.m.t();\n              hxF U6 = new g.hxF();\n            }\n            m.t i = new hxF.hE.m.t();\n          }\n          static class C3{}\n          class l {\n\n            m.t.l nP = new m.t.l();\n            g F = new g();\n          }\n          static class bfb{}\n          \n        }\n        class Q {\n\n          g.hxF.hE.m c7 = new g.hxF.hE.m();\n        }\n        g.hxF.hE.m dBn = new g.hxF.hE.m();\n        hxF H8kD = new g.hxF();\n      }\n      hE H = new hxF.hE();\n      hxF.hE.m pVsah = new hxF.hE.m();\n      g n_ = new g();\n    }\n    static class Vw8{}\n    class b {\n\n      hxF WX = new hxF();\n    }\n    g Z = new g();\n    hE k = new g.hxF.hE();\n    b b1 = new g.hxF.b();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Y");
        assertTrue(clazz.prettyprint().contains("class Y "));
        assertFalse(clazz.prettyprint().contains("class g "));
    }

    @Test
    public void test092() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class D {\n  class PY9KR {\n    class yQW {\n      class pPs {\n        class x0 {\n          class i {\n            class myvE {\n              class se53Ye {\n                class oG {\n                  class E{}\n                  class r{}\n                  D.PY9KR.yQW.pPs.x0.i Bn9 = new D.PY9KR.yQW.pPs.x0.i();\n                  PY9KR.yQW.pPs.x0.i.myvE.se53Ye.oG V_JKk = new i.myvE.se53Ye.oG();\n                }\n                D V = new D();\n                D.PY9KR.yQW.pPs Rqg = new yQW.pPs();\n              }\n              yQW HI = new D.PY9KR.yQW();\n              pPs.x0.i.myvE.se53Ye w = new i.myvE.se53Ye();\n              D A = new D();\n              D.PY9KR.yQW.pPs.x0 g = new D.PY9KR.yQW.pPs.x0();\n              D.PY9KR.yQW.pPs.x0.i UL = new pPs.x0.i();\n              D.PY9KR.yQW.pPs.x0.i.myvE.se53Ye h = new myvE.se53Ye();\n              D thD = new D();\n            }\n            \n          }\n          class vHa{}\n          \n        }\n        class Ka{}\n        PY9KR K7 = new D.PY9KR();\n        D z = new D();\n        yQW srkYkg = new yQW();\n      }\n      class S9Cnl {\n\n        yQW R29 = new PY9KR.yQW();\n      }\n      class ym{}\n      class K {\n\n        PY9KR.yQW j = new D.PY9KR.yQW();\n      }\n      \n    }\n    class v {\n\n      v p = new D.PY9KR.v();\n    }\n    class B1Az {\n\n      D.PY9KR m1S = new PY9KR();\n    }\n    class J {\n\n      D.PY9KR.J h_ = new PY9KR.J();\n    }\n    yQW wTF = new D.PY9KR.yQW();\n    D fOV = new D();\n  }\n  class n{}\n  n Xb = new D.n();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "f");
        assertTrue(clazz.prettyprint().contains("class f "));
        assertFalse(clazz.prettyprint().contains("class D "));
    }

    @Test
    public void test093() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class nF {\n  class BempS {\n    class b {\n      class jt {\n        class B {\n          class Q {\n            class R {\n\n              nF.BempS.b op66 = new nF.BempS.b();\n              nF.BempS Yp = new nF.BempS();\n              BempS.b.jt I = new nF.BempS.b.jt();\n              b.jt OW = new nF.BempS.b.jt();\n              BempS.b Y = new nF.BempS.b();\n            }\n            class wX{}\n            class rj {\n\n              rj ic = new rj();\n              B.Q gRV = new b.jt.B.Q();\n              nF.BempS N = new BempS();\n            }\n            class YB{}\n            nF.BempS.b d = new b();\n            nF.BempS.b.jt.B WE = new b.jt.B();\n          }\n          class p{}\n          class jX{}\n          BempS.b.jt.B.p k = new B.p();\n          jt.B dNKhH = new B();\n          nF.BempS.b.jt.B.p IVhjmohaxIKj = new p();\n        }\n        class tK{}\n        class c4{}\n        \n      }\n      class Z0kH {\n\n        BempS RFI = new nF.BempS();\n        nF.BempS.b Ga = new nF.BempS.b();\n      }\n      class U{}\n      class aO{}\n      \n    }\n    class q {\n\n      q Z8ycF = new nF.BempS.q();\n    }\n    class A4{}\n    class lR53{}\n    nF.BempS UE = new nF.BempS();\n  }\n  class Bt {\n\n    nF P = new nF();\n  }\n  class G {\n\n    G eXD5 = new G();\n    nF Pt = new nF();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Pii");
        assertTrue(clazz.prettyprint().contains("class Pii "));
        assertFalse(clazz.prettyprint().contains("class nF "));
    }

    @Test
    public void test094() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class OD {\n  class X26 {\n    class D {\n      class aus {\n        class NEokVAo {\n          class S {\n            class pY {\n              class yys4F {\n\n                OD.X26.D.aus v = new aus();\n              }\n              class g{}\n              class lV {\n\n                aus.NEokVAo r = new OD.X26.D.aus.NEokVAo();\n                OD c = new OD();\n              }\n              class F{}\n              \n            }\n            class wJTl {\n\n              aus.NEokVAo w = new NEokVAo();\n              OD.X26.D.aus.NEokVAo.S X9dQ = new NEokVAo.S();\n              X26.D.aus.NEokVAo t4_ = new D.aus.NEokVAo();\n              OD M = new OD();\n            }\n            class wW{}\n            X26.D.aus.NEokVAo xP3rI0e = new X26.D.aus.NEokVAo();\n          }\n          class l0{}\n          class b {\n\n            aus.NEokVAo RCU = new D.aus.NEokVAo();\n            D.aus.NEokVAo.b MF = new OD.X26.D.aus.NEokVAo.b();\n          }\n          class Qmp {\n\n            aus.NEokVAo.Qmp z = new X26.D.aus.NEokVAo.Qmp();\n            D.aus kX = new OD.X26.D.aus();\n          }\n          \n        }\n        class r_ {\n\n          X26.D.aus d = new OD.X26.D.aus();\n          X26 yQsnE = new X26();\n          D.aus V = new OD.X26.D.aus();\n          OD.X26 R = new OD.X26();\n          OD m = new OD();\n          X26.D U = new D();\n        }\n        class B{}\n        \n      }\n      class K{}\n      class j{}\n      class t{}\n      \n    }\n    class IQR5{}\n    \n  }\n  OD HIREm = new OD();\n  X26 J = new OD.X26();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "xO6tYtl8");
        assertTrue(clazz.prettyprint().contains("class xO6tYtl8 "));
        assertFalse(clazz.prettyprint().contains("class OD "));
    }

    @Test
    public void test095() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class H1Lnr {\n  class W {\n    class qvxE {\n      class Qz {\n        class O {\n          class Ma_f4 {\n            class Kz {\n              class BT {\n                class L {\n                  class ieN {\n                    class LK {\n                      class Sv4nR {\n\n                        qvxE.Qz.O.Ma_f4 OP = new Qz.O.Ma_f4();\n                        W e = new H1Lnr.W();\n                      }\n                      class Qb {\n\n                        W D = new H1Lnr.W();\n                      }\n                      class lq67{}\n                      class l{}\n                      Ma_f4.Kz.BT.L.ieN.LK jAN70Q9 = new O.Ma_f4.Kz.BT.L.ieN.LK();\n                      H1Lnr.W.qvxE.Qz.O.Ma_f4.Kz.BT.L.ieN v = new H1Lnr.W.qvxE.Qz.O.Ma_f4.Kz.BT.L.ieN();\n                    }\n                    class IF{}\n                    W.qvxE.Qz.O.Ma_f4.Kz Ceo = new Ma_f4.Kz();\n                    qvxE.Qz.O.Ma_f4.Kz.BT.L h = new H1Lnr.W.qvxE.Qz.O.Ma_f4.Kz.BT.L();\n                  }\n                  class K{}\n                  \n                }\n                \n              }\n              class N{}\n              O zv = new W.qvxE.Qz.O();\n            }\n            class J{}\n            W KW = new H1Lnr.W();\n            W.qvxE.Qz.O cIie = new O();\n          }\n          class wU {\n\n            qvxE.Qz.O oT = new O();\n          }\n          \n        }\n        class L_C{}\n        \n      }\n      \n    }\n    H1Lnr.W M = new H1Lnr.W();\n    qvxE kt = new H1Lnr.W.qvxE();\n    W WSD = new W();\n    W G = new H1Lnr.W();\n    H1Lnr UQ6Qq = new H1Lnr();\n  }\n  class Bh1Bl {\n\n    H1Lnr VUe = new H1Lnr();\n  }\n  class cjrl{}\n  H1Lnr.Bh1Bl Zzu = new H1Lnr.Bh1Bl();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "y");
        assertTrue(clazz.prettyprint().contains("class y "));
        assertFalse(clazz.prettyprint().contains("class H1Lnr "));
    }

    @Test
    public void test096() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class S7 {\n  class cG {\n    class h {\n      class mf {\n        class Rxo {\n          class T {\n            class P {\n              class GR {\n                class fnuTn{}\n                class iT{}\n                Rxo N = new Rxo();\n              }\n              class dS{}\n              \n            }\n            class x{}\n            S7 KS = new S7();\n            S7 IoK = new S7();\n            h.mf BwT = new cG.h.mf();\n          }\n          class k {\n\n            mf.Rxo o3 = new h.mf.Rxo();\n            S7.cG.h N7 = new S7.cG.h();\n            S7.cG.h.mf.Rxo w4 = new Rxo();\n            S7.cG B = new S7.cG();\n          }\n          class z {\n\n            cG.h f = new h();\n            h.mf.Rxo.z w = new Rxo.z();\n          }\n          S7 E = new S7();\n          h.mf C = new S7.cG.h.mf();\n          S7.cG CL = new S7.cG();\n          cG pw = new cG();\n        }\n        class Q {\n\n          h A8O = new S7.cG.h();\n          S7.cG.h.mf.Q g = new cG.h.mf.Q();\n          h.mf.Q ceb = new S7.cG.h.mf.Q();\n          S7.cG l = new cG();\n          Q c7_eg = new S7.cG.h.mf.Q();\n        }\n        class X6 {\n\n          S7 TqVL = new S7();\n        }\n        \n      }\n      class t{}\n      \n    }\n    class bw {\n\n      bw H = new bw();\n    }\n    \n  }\n  class R {\n\n    S7.R A = new S7.R();\n  }\n  class F {\n\n    S7 Jn = new S7();\n    S7.F fW = new F();\n  }\n  class o {\n\n    S7.o m = new S7.o();\n  }\n  S7 V = new S7();\n  S7 u = new S7();\n  R e = new R();\n  S7 G = new S7();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(6);
        Refactoring.changeTypeName(clazz, "ERm");
        assertTrue(clazz.prettyprint().contains("class ERm "));
        assertFalse(clazz.prettyprint().contains("class P "));
    }

    @Test
    public void test097() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class s {\n  class hq {\n    class H {\n      class G {\n        class I {\n          class d6 {\n            class uXH7o {\n              class eTf {\n                class r4 {\n                  class oOZDy{}\n                  class U{}\n                  class O8 {\n\n                    s nyG = new s();\n                    H.G.I.d6.uXH7o.eTf.r4.O8 r = new G.I.d6.uXH7o.eTf.r4.O8();\n                  }\n                  class K8 {\n\n                    hq.H Iv = new H();\n                    hq.H.G.I.d6.uXH7o.eTf.r4 eM = new r4();\n                  }\n                  \n                }\n                class V {\n\n                  G.I Gj = new H.G.I();\n                  I.d6.uXH7o f = new H.G.I.d6.uXH7o();\n                }\n                class S {\n\n                  hq.H.G.I lsC = new s.hq.H.G.I();\n                }\n                class kx{}\n                \n              }\n              class O{}\n              \n            }\n            class gUb {\n\n              d6.gUb JUQK = new H.G.I.d6.gUb();\n              s.hq.H.G.I.d6 d = new H.G.I.d6();\n              s.hq.H D2 = new H();\n            }\n            class w{}\n            class j91Z {\n\n              d6 X = new H.G.I.d6();\n              hq dR = new s.hq();\n              s.hq.H.G.I DC = new G.I();\n              s.hq z = new s.hq();\n              I R = new G.I();\n              G.I qbh = new I();\n              H.G t = new s.hq.H.G();\n            }\n            H.G Xu = new G();\n            hq C9e = new hq();\n          }\n          d6 g = new d6();\n          hq.H P = new H();\n          s.hq.H x = new H();\n          H.G.I.d6 jy = new d6();\n        }\n        class F7{}\n        hq F = new s.hq();\n      }\n      \n    }\n    class E {\n\n      hq.E o = new s.hq.E();\n      s Y = new s();\n      E h = new hq.E();\n      s WD = new s();\n    }\n    \n  }\n  class LO {\n\n    LO cr = new LO();\n  }\n  hq X3G = new s.hq();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Mjyz");
        assertTrue(clazz.prettyprint().contains("class Mjyz "));
        assertFalse(clazz.prettyprint().contains("class s "));
    }

    @Test
    public void test098() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class L {\n  class A {\n    class f {\n      class i {\n        class V13 {\n          class Z {\n            class Q {\n              class b {\n                class lK {\n                  class MVl{}\n                  class S{}\n                  class PKvl9 {\n\n                    i.V13.Z c = new L.A.f.i.V13.Z();\n                    i.V13.Z.Q YW = new f.i.V13.Z.Q();\n                    lK.PKvl9 u = new Q.b.lK.PKvl9();\n                  }\n                  \n                }\n                A.f.i.V13 n = new L.A.f.i.V13();\n                i.V13.Z.Q.b.lK y = new Z.Q.b.lK();\n                L.A.f.i bZzD = new i();\n              }\n              i P4 = new A.f.i();\n              f.i.V13.Z C = new f.i.V13.Z();\n            }\n            class T{}\n            class sFohy {\n\n              L.A.f.i.V13.Z M = new A.f.i.V13.Z();\n              f.i sm = new A.f.i();\n              A.f.i rf = new f.i();\n              A.f.i.V13 Ix = new A.f.i.V13();\n            }\n            L.A.f v = new A.f();\n          }\n          static class q{}\n          static class U7pX{}\n          class W {\n\n            L BS = new L();\n            f.i.V13 U5 = new f.i.V13();\n            A.f.i.V13 LiG = new A.f.i.V13();\n          }\n          \n        }\n        A g = new A();\n        f.i.V13 Xn = new V13();\n        L rx62 = new L();\n      }\n      static class o{}\n      class Y {\n\n        A.f DZf = new f();\n        f.Y WUoXv0xH = new L.A.f.Y();\n      }\n      \n    }\n    L.A OJ = new A();\n  }\n  class N {\n\n    L.N Ppj = new N();\n    L lQ9rq = new L();\n  }\n  class p {\n\n    L.p K9FAH = new L.p();\n    L.p CEB = new L.p();\n    L.p N9 = new L.p();\n    L.p H2Dts = new p();\n    L ei = new L();\n    L P = new L();\n    L aK_N1 = new L();\n    p beE = new p();\n  }\n  \n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "z");
        assertTrue(clazz.prettyprint().contains("class z "));
        assertFalse(clazz.prettyprint().contains("class L "));
    }

    @Test
    public void test099() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("class y {\n  class E {\n    class G {\n      class tSaZ {\n        class S6Yc {\n          class T {\n            class m {\n              class ug{}\n              class Z{}\n              class wZ3{}\n              E.G.tSaZ Q = new G.tSaZ();\n              E Y = new E();\n              tSaZ.S6Yc Np7j = new G.tSaZ.S6Yc();\n            }\n            y.E.G.tSaZ.S6Yc h = new G.tSaZ.S6Yc();\n          }\n          static class g2{}\n          class W {\n\n            G.tSaZ d = new G.tSaZ();\n            E vN = new E();\n            E.G.tSaZ j = new E.G.tSaZ();\n          }\n          \n        }\n        class p{}\n        class P {\n\n          G.tSaZ.P R = new y.E.G.tSaZ.P();\n          E M = new E();\n          y rkno = new y();\n          P OK = new G.tSaZ.P();\n        }\n        static class o{}\n        \n      }\n      class n {\n\n        G f = new E.G();\n        y B = new y();\n      }\n      class MR{}\n      y.E q = new y.E();\n    }\n    class zp {\n\n      E.zp Li5 = new E.zp();\n      y.E Q2 = new y.E();\n    }\n    \n  }\n  static class U{}\n  class t9 {\n\n    t9 xr = new t9();\n  }\n  static class iZh{}\n  y Tv = new y();\n}"));
        CtModel model = launcher.buildModel();
        CtClass<?> clazz = model.getElements(new TypeFilter<>(CtClass.class)).get(0);
        Refactoring.changeTypeName(clazz, "Dg3");
        assertTrue(clazz.prettyprint().contains("class Dg3 "));
        assertFalse(clazz.prettyprint().contains("class y "));
    }
}

