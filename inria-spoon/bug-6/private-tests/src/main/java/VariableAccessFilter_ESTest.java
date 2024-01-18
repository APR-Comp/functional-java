import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.VariableAccessFilter;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.code.CtVariableAccess;
import spoon.support.compiler.VirtualFile;
import spoon.refactoring.Refactoring;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariableAccessFilter_ESTest {
    @Test
    public void test000() {
        CtClass<?> clazz = Launcher.parseClass("public class Z<T> {\n    T hCy;\n    T g5;\n    T B;\n    T XCZ8ub;\n        public static void Uo {\n            Z<Boolean> y = new Z<>();\n            y.XCZ8ub = true;\n            System.out.println(y.XCZ8ub);\n            y.XCZ8ub = true;\n            y.XCZ8ub = !y.XCZ8ub;\n            System.out.println(y.XCZ8ub);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("XCZ8ub").getReference()));
        assertEquals(6, accesses.size());
    }

    @Test
    public void test001() {
        CtClass<?> clazz = Launcher.parseClass("public class U<T> {\n    T VU;\n    T G;\n        public static void G2p {\n            U<Boolean> Qs = new U<>();\n            Qs.G = true;\n            Qs.G = !Qs.G;\n            System.out.println(Qs.G);\n            Qs.G = !Qs.G;\n        }\n        public static void F {\n            U<Boolean> H = new U<>();\n            System.out.println(H.G);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("G").getReference()));
        assertEquals(7, accesses.size());
    }

    @Test
    public void test002() {
        CtClass<?> clazz = Launcher.parseClass("public class I<T> {\n    T z;\n    T K6J;\n    T UY;\n        public static void X {\n            I<Integer> G = new I<>();\n            System.out.println(G.K6J);\n        }\n        public static void vb {\n            I<Integer> JG0wI = new I<>();\n            JG0wI.UY = 4023;\n            JG0wI.UY += 4028;\n        }\n        public static void ebW {\n            I<Integer> c = new I<>();\n            c.z += -1976;\n            c.z = -244;\n            System.out.println(c.z);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("UY").getReference()));
        assertEquals(2, accesses.size());
    }

    // @Test
    // public void test003() {
    //     CtClass<?> clazz = Launcher.parseClass("public class q5<T> {\n    T M_bc;\n    T kG;\n    T I;\n        public static void o {\n            q5<Boolean> Z = new q5<>();\n            System.out.println(Z.M_bc);\n            Z.M_bc = !Z.M_bc;\n            Z.M_bc = !Z.M_bc;\n            Z.M_bc = !Z.M_bc;\n        }\n        public static void L {\n            q5<String> te8kqJ = new q5<>();\n            System.out.println(te8kqJ.I);\n            te8kqJ.I += \"N\";\n            te8kqJ.I += \"mn\";\n            te8kqJ.I += \"Lg\";\n        }\n        public static void u {\n            q5<String> s = new q5<>();\n            s.kG += \"b2K\";\n            s.kG += \"BRy\";\n            System.out.println(s.kG);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("I").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    @Test
    public void test004() {
        CtClass<?> clazz = Launcher.parseClass("public class fk<T> {\n    T r;\n    T M;\n    T qvp;\n        public static void i {\n            fk<Boolean> X = new fk<>();\n            X.r = true;\n            X.r = true;\n            X.r = !X.r;\n        }\n        public static void o {\n            fk<Boolean> vL = new fk<>();\n            System.out.println(vL.M);\n            vL.M = true;\n            vL.M = !vL.M;\n        }\n        public static void p {\n            fk<String> YsQA4 = new fk<>();\n            YsQA4.qvp = \"kk\";\n            YsQA4.qvp += \"V\";\n            System.out.println(YsQA4.qvp);\n            System.out.println(YsQA4.qvp);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("r").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test005() {
        CtClass<?> clazz = Launcher.parseClass("public class U<T> {\n    T zeu;\n    T Dn;\n    T X;\n    T I;\n    T E;\n        public static void mf {\n            U<Boolean> l = new U<>();\n            System.out.println(l.zeu);\n            l.zeu = !l.zeu;\n            l.zeu = false;\n            l.zeu = true;\n        }\n        public static void pI {\n            U<Boolean> l2 = new U<>();\n            l2.E = !l2.E;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("zeu").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test006() {
        CtClass<?> clazz = Launcher.parseClass("public class jX<T> {\n    T G;\n    T lj;\n        public static void sn6 {\n            jX<Integer> tG = new jX<>();\n            tG.lj = 4059;\n            System.out.println(tG.lj);\n            System.out.println(tG.lj);\n            tG.lj = -949;\n            System.out.println(tG.lj);\n        }\n        public static void D1qY {\n            jX<Integer> q = new jX<>();\n            System.out.println(q.lj);\n            q.lj = 815;\n            q.lj = 4724;\n            q.lj += -464;\n            q.lj = 4241;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("lj").getReference()));
        assertEquals(10, accesses.size());
    }

    @Test
    public void test007() {
        CtClass<?> clazz = Launcher.parseClass("public class G<T> {\n    T R;\n    T oF;\n    T o;\n    T v;\n    T U;\n        public static void k {\n            G<Boolean> P6G = new G<>();\n            System.out.println(P6G.oF);\n            System.out.println(P6G.oF);\n            P6G.oF = !P6G.oF;\n        }\n        public static void Mh {\n            G<Boolean> S = new G<>();\n            S.U = !S.U;\n            S.U = true;\n            S.U = !S.U;\n            S.U = true;\n            System.out.println(S.U);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("oF").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test008() {
        CtClass<?> clazz = Launcher.parseClass("public class k<T> {\n    T H;\n    T Zg6_X;\n        public static void p {\n            k<Boolean> R = new k<>();\n            R.Zg6_X = !R.Zg6_X;\n            R.Zg6_X = false;\n            System.out.println(R.Zg6_X);\n            R.Zg6_X = !R.Zg6_X;\n        }\n        public static void pJm {\n            k<Boolean> hIh = new k<>();\n            hIh.H = true;\n        }\n        public static void t {\n            k<Boolean> nj = new k<>();\n            nj.Zg6_X = !nj.Zg6_X;\n            nj.Zg6_X = false;\n            nj.Zg6_X = !nj.Zg6_X;\n            System.out.println(nj.Zg6_X);\n            nj.Zg6_X = !nj.Zg6_X;\n            nj.Zg6_X = !nj.Zg6_X;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Zg6_X").getReference()));
        assertEquals(16, accesses.size());
    }

    // @Test
    // public void test009() {
    //     CtClass<?> clazz = Launcher.parseClass("public class a<T> {\n    T e;\n    T K;\n    T B;\n        public static void hCIY {\n            a<String> W = new a<>();\n            System.out.println(W.B);\n            System.out.println(W.B);\n            W.B += \"m\";\n            W.B += \"M\";\n        }\n        public static void N {\n            a<Boolean> t = new a<>();\n            System.out.println(t.e);\n            System.out.println(t.e);\n            t.e = false;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("B").getReference()));
    //     assertEquals(2, accesses.size());
    // }

    @Test
    public void test010() {
        CtClass<?> clazz = Launcher.parseClass("public class U<T> {\n    T F;\n    T p;\n        public static void O {\n            U<Boolean> s = new U<>();\n            s.p = !s.p;\n            s.p = true;\n            System.out.println(s.p);\n        }\n        public static void t1kcg {\n            U<Integer> A = new U<>();\n            System.out.println(A.p);\n        }\n        public static void SO {\n            U<String> CG = new U<>();\n            System.out.println(CG.p);\n            CG.p = \"xJ\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("p").getReference()));
        assertEquals(7, accesses.size());
    }

    // @Test
    // public void test011() {
    //     CtClass<?> clazz = Launcher.parseClass("public class JN<T> {\n    T JE;\n    T NoN;\n    T Q5;\n    T zB;\n    T p;\n        public static void L6 {\n            JN<String> e = new JN<>();\n            e.NoN += \"qki\";\n            e.NoN = \"xzTRgug\";\n            e.NoN = \"d\";\n            System.out.println(e.NoN);\n            e.NoN = \"C1N\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("NoN").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test012() {
    //     CtClass<?> clazz = Launcher.parseClass("public class p<T> {\n    T J;\n    T nqLn;\n    T ca;\n    T u;\n    T Lm4;\n        public static void a4 {\n            p<String> j = new p<>();\n            j.J = \"yf1ad\";\n            j.J = \"c\";\n            System.out.println(j.J);\n            j.J += \"m\";\n            j.J += \"v\";\n        }\n        public static void d {\n            p<String> P = new p<>();\n            System.out.println(P.Lm4);\n            System.out.println(P.Lm4);\n        }\n        public static void TN {\n            p<String> B = new p<>();\n            B.J = \"l\";\n            B.J += \"GxuIQz\";\n            B.J += \"b\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("J").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test013() {
    //     CtClass<?> clazz = Launcher.parseClass("public class f3UVYh<T> {\n    T gp;\n    T nv;\n    T z;\n    T Li;\n        public static void L {\n            f3UVYh<Integer> H = new f3UVYh<>();\n            H.gp += -1724;\n            H.gp += 3537;\n            H.gp += 1709;\n        }\n        public static void t {\n            f3UVYh<String> i = new f3UVYh<>();\n            i.z = \"trV\";\n            i.z += \"Hu\";\n            i.z = \"Yer6V\";\n            i.z += \"iF\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("z").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test014() {
        CtClass<?> clazz = Launcher.parseClass("public class v8<T> {\n    T zM;\n    T I;\n    T bRi;\n    T l;\n        public static void r {\n            v8<Integer> Ng = new v8<>();\n            System.out.println(Ng.I);\n            Ng.I = -3714;\n            Ng.I += 3380;\n        }\n        public static void T {\n            v8<Boolean> b = new v8<>();\n            b.I = !b.I;\n            b.I = false;\n        }\n        public static void U1 {\n            v8<Boolean> R6 = new v8<>();\n            R6.bRi = !R6.bRi;\n            System.out.println(R6.bRi);\n            R6.bRi = !R6.bRi;\n            System.out.println(R6.bRi);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("I").getReference()));
        assertEquals(6, accesses.size());
    }

    @Test
    public void test015() {
        CtClass<?> clazz = Launcher.parseClass("public class It<T> {\n    T X;\n    T K;\n    T s;\n    T I;\n        public static void ti {\n            It<Integer> A = new It<>();\n            System.out.println(A.K);\n            System.out.println(A.K);\n            A.K += -4407;\n            A.K += 1588;\n            A.K = -4700;\n        }\n        public static void yhjb {\n            It<Boolean> aDYV = new It<>();\n            System.out.println(aDYV.s);\n            aDYV.s = false;\n            System.out.println(aDYV.s);\n        }\n        public static void n {\n            It<Boolean> Sv = new It<>();\n            Sv.I = !Sv.I;\n            Sv.I = !Sv.I;\n            Sv.I = !Sv.I;\n            System.out.println(Sv.I);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("I").getReference()));
        assertEquals(7, accesses.size());
    }

    @Test
    public void test016() {
        CtClass<?> clazz = Launcher.parseClass("public class gUaN<T> {\n    T JB8;\n    T g;\n        public static void h {\n            gUaN<Integer> A = new gUaN<>();\n            A.g = 2859;\n            A.g = -3572;\n        }\n        public static void Ey {\n            gUaN<Boolean> QR = new gUaN<>();\n            QR.JB8 = false;\n            QR.JB8 = false;\n        }\n        public static void n {\n            gUaN<Integer> O = new gUaN<>();\n            System.out.println(O.g);\n            O.g = 683;\n            O.g += 2213;\n            System.out.println(O.g);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("JB8").getReference()));
        assertEquals(2, accesses.size());
    }

    // @Test
    // public void test017() {
    //     CtClass<?> clazz = Launcher.parseClass("public class AqJ<T> {\n    T I;\n    T GAE;\n        public static void vW4 {\n            AqJ<String> Fx = new AqJ<>();\n            Fx.GAE = \"ju\";\n            Fx.GAE = \"P\";\n            Fx.GAE += \"u\";\n            System.out.println(Fx.GAE);\n            System.out.println(Fx.GAE);\n        }\n        public static void ta {\n            AqJ<Integer> hm = new AqJ<>();\n            System.out.println(hm.GAE);\n            System.out.println(hm.GAE);\n            System.out.println(hm.GAE);\n            hm.GAE = 3493;\n            hm.GAE += 404;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("GAE").getReference()));
    //     assertEquals(5, accesses.size());
    // }

    @Test
    public void test018() {
        CtClass<?> clazz = Launcher.parseClass("public class pvG<T> {\n    T w;\n    T Y;\n        public static void zK {\n            pvG<Boolean> M = new pvG<>();\n            System.out.println(M.Y);\n            M.Y = false;\n            System.out.println(M.Y);\n            System.out.println(M.Y);\n            M.Y = !M.Y;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Y").getReference()));
        assertEquals(6, accesses.size());
    }

    @Test
    public void test019() {
        CtClass<?> clazz = Launcher.parseClass("public class e<T> {\n    T I;\n    T Z;\n    T R;\n    T NRe;\n        public static void x {\n            e<Boolean> nZ = new e<>();\n            nZ.Z = false;\n            nZ.Z = !nZ.Z;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Z").getReference()));
        assertEquals(3, accesses.size());
    }

    @Test
    public void test020() {
        CtClass<?> clazz = Launcher.parseClass("public class M<T> {\n    T PV;\n    T gXR7z;\n        public static void a {\n            M<Integer> gc = new M<>();\n            System.out.println(gc.PV);\n            gc.PV += 4028;\n            gc.PV += 839;\n            gc.PV = -984;\n            gc.PV = 4213;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("PV").getReference()));
        assertEquals(5, accesses.size());
    }

    // @Test
    // public void test021() {
    //     CtClass<?> clazz = Launcher.parseClass("public class q<T> {\n    T NyW;\n    T C;\n        public static void dh {\n            q<String> O = new q<>();\n            O.NyW += \"P\";\n            System.out.println(O.NyW);\n            O.NyW += \"bn1\";\n            O.NyW += \"Tp_p\";\n            System.out.println(O.NyW);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("NyW").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test022() {
        CtClass<?> clazz = Launcher.parseClass("public class iyZe<T> {\n    T XG;\n    T s;\n    T j;\n    T g;\n    T bZ;\n        public static void Sa {\n            iyZe<Integer> Y = new iyZe<>();\n            Y.s += -2067;\n            System.out.println(Y.s);\n            Y.s = 4139;\n            Y.s = 1155;\n        }\n        public static void UG {\n            iyZe<Integer> Gp = new iyZe<>();\n            Gp.bZ += 1523;\n        }\n        public static void yg {\n            iyZe<String> h = new iyZe<>();\n            h.g = \"Ha2r\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("s").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test023() {
        CtClass<?> clazz = Launcher.parseClass("public class T<T> {\n    T G;\n    T Jz;\n    T Z07Kl;\n    T Nxjqr;\n    T ai;\n        public static void I3i {\n            T<String> mL = new T<>();\n            mL.Nxjqr = \"m7Y\";\n            System.out.println(mL.Nxjqr);\n            mL.Nxjqr = \"MI\";\n            mL.Nxjqr += \"ym\";\n            mL.Nxjqr = \"w\";\n            mL.Nxjqr = \"ojIG\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Nxjqr").getReference()));
        assertEquals(0, accesses.size());
    }

    // @Test
    // public void test024() {
    //     CtClass<?> clazz = Launcher.parseClass("public class g<T> {\n    T q;\n    T d;\n    T ui;\n    T O;\n    T h;\n        public static void T87 {\n            g<Boolean> Ln = new g<>();\n            System.out.println(Ln.h);\n            Ln.h = !Ln.h;\n            System.out.println(Ln.h);\n        }\n        public static void rk {\n            g<String> E = new g<>();\n            E.h += \"o\";\n            E.h += \"X\";\n            E.h = \"rQ\";\n            E.h += \"l\";\n            E.h += \"WnU\";\n        }\n        public static void Cl {\n            g<Boolean> pR = new g<>();\n            System.out.println(pR.d);\n            pR.d = !pR.d;\n            pR.d = true;\n            pR.d = true;\n            pR.d = true;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("h").getReference()));
    //     assertEquals(4, accesses.size());
    // }

    @Test
    public void test025() {
        CtClass<?> clazz = Launcher.parseClass("public class sL<T> {\n    T f;\n    T Y;\n    T K;\n    T zw78;\n    T Et;\n        public static void e {\n            sL<Boolean> YL = new sL<>();\n            System.out.println(YL.K);\n            System.out.println(YL.K);\n            YL.K = !YL.K;\n            YL.K = !YL.K;\n        }\n        public static void OeOIG {\n            sL<String> vx = new sL<>();\n            vx.Et += \"k\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Et").getReference()));
        assertEquals(1, accesses.size());
    }

    @Test
    public void test026() {
        CtClass<?> clazz = Launcher.parseClass("public class zGx<T> {\n    T MTOY_s;\n    T NT7;\n    T As;\n    T PnUV;\n        public static void cx {\n            zGx<String> Ius = new zGx<>();\n            Ius.MTOY_s = \"uk\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("MTOY_s").getReference()));
        assertEquals(1, accesses.size());
    }

    // @Test
    // public void test027() {
    //     CtClass<?> clazz = Launcher.parseClass("public class mLL<T> {\n    T DdD9;\n    T w7;\n    T a;\n    T c5;\n        public static void H {\n            mLL<String> o = new mLL<>();\n            o.DdD9 = \"msGz\";\n            o.DdD9 = \"m\";\n            System.out.println(o.DdD9);\n            o.DdD9 += \"B\";\n            System.out.println(o.DdD9);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("DdD9").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test028() {
    //     CtClass<?> clazz = Launcher.parseClass("public class vAG<T> {\n    T M;\n    T K;\n    T XEr;\n    T HW;\n    T qM;\n        public static void GSv {\n            vAG<String> D = new vAG<>();\n            D.K += \"BhY\";\n            D.K = \"W\";\n            D.K = \"tuL\";\n            D.K += \"n\";\n        }\n        public static void eSA {\n            vAG<Integer> h = new vAG<>();\n            System.out.println(h.K);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("K").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    @Test
    public void test029() {
        CtClass<?> clazz = Launcher.parseClass("public class D<T> {\n    T mo;\n    T NozNt;\n        public static void tk {\n            D<Integer> a = new D<>();\n            a.mo += 4075;\n            a.mo += 3023;\n            System.out.println(a.mo);\n        }\n        public static void WFo {\n            D<Boolean> PJ = new D<>();\n            PJ.NozNt = !PJ.NozNt;\n            PJ.NozNt = !PJ.NozNt;\n            PJ.NozNt = !PJ.NozNt;\n            PJ.NozNt = !PJ.NozNt;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("NozNt").getReference()));
        assertEquals(8, accesses.size());
    }

    // @Test
    // public void test030() {
    //     CtClass<?> clazz = Launcher.parseClass("public class ec<T> {\n    T Ya;\n    T Es;\n    T Hoz;\n    T p;\n        public static void OllZYU1os {\n            ec<Integer> Cub = new ec<>();\n            Cub.Ya = -3538;\n            Cub.Ya = -1268;\n            Cub.Ya = -4059;\n            System.out.println(Cub.Ya);\n            System.out.println(Cub.Ya);\n        }\n        public static void Uq {\n            ec<String> q = new ec<>();\n            System.out.println(q.Hoz);\n            q.Hoz += \"y\";\n            q.Hoz += \"fp\";\n        }\n        public static void Pe {\n            ec<Integer> v = new ec<>();\n            v.p += -23;\n            v.p += 1705;\n            v.p += 765;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("Hoz").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    @Test
    public void test031() {
        CtClass<?> clazz = Launcher.parseClass("public class xki<T> {\n    T kOkNw;\n    T kEBw;\n    T g;\n        public static void m {\n            xki<Integer> ulc = new xki<>();\n            System.out.println(ulc.g);\n            System.out.println(ulc.g);\n            ulc.g += -1975;\n        }\n        public static void T {\n            xki<Integer> c = new xki<>();\n            c.kOkNw += -13;\n        }\n        public static void s {\n            xki<String> Kx = new xki<>();\n            System.out.println(Kx.kOkNw);\n            System.out.println(Kx.kOkNw);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("g").getReference()));
        assertEquals(3, accesses.size());
    }

    // @Test
    // public void test032() {
    //     CtClass<?> clazz = Launcher.parseClass("public class E3B<T> {\n    T njnFd;\n    T f;\n    T R;\n    T nP;\n        public static void T {\n            E3B<Integer> vS = new E3B<>();\n            System.out.println(vS.njnFd);\n            vS.njnFd += -4142;\n        }\n        public static void Fu {\n            E3B<String> F = new E3B<>();\n            System.out.println(F.R);\n            F.R += \"fA\";\n            System.out.println(F.R);\n            F.R = \"ul\";\n            F.R += \"u0t\";\n        }\n        public static void w {\n            E3B<Boolean> aOh7 = new E3B<>();\n            System.out.println(aOh7.nP);\n            System.out.println(aOh7.nP);\n            aOh7.nP = true;\n            aOh7.nP = true;\n            aOh7.nP = true;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("R").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    @Test
    public void test033() {
        CtClass<?> clazz = Launcher.parseClass("public class S<T> {\n    T CE;\n    T pOVH;\n    T Ku;\n    T YTaU;\n    T VL;\n        public static void t {\n            S<Integer> UwS = new S<>();\n            UwS.YTaU = -1802;\n            UwS.YTaU += -4262;\n            UwS.YTaU = 4295;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("YTaU").getReference()));
        assertEquals(3, accesses.size());
    }

    @Test
    public void test034() {
        CtClass<?> clazz = Launcher.parseClass("public class NPn<T> {\n    T hi;\n    T vZ;\n    T N;\n    T o;\n    T BG;\n        public static void L {\n            NPn<Boolean> H = new NPn<>();\n            System.out.println(H.vZ);\n            H.vZ = true;\n            H.vZ = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("vZ").getReference()));
        assertEquals(3, accesses.size());
    }

    @Test
    public void test035() {
        CtClass<?> clazz = Launcher.parseClass("public class V40<T> {\n    T nUICE2;\n    T L_;\n    T F6WM4;\n    T JQ7;\n        public static void d {\n            V40<Boolean> u4 = new V40<>();\n            u4.F6WM4 = false;\n            u4.F6WM4 = !u4.F6WM4;\n            System.out.println(u4.F6WM4);\n            System.out.println(u4.F6WM4);\n        }\n        public static void jw {\n            V40<Integer> V = new V40<>();\n            System.out.println(V.L_);\n            System.out.println(V.L_);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("F6WM4").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test036() {
        CtClass<?> clazz = Launcher.parseClass("public class JryCTL2<T> {\n    T gCg;\n    T I0R;\n    T OLL;\n        public static void nIM {\n            JryCTL2<Integer> F = new JryCTL2<>();\n            F.gCg += 378;\n            F.gCg += 640;\n            System.out.println(F.gCg);\n        }\n        public static void Y {\n            JryCTL2<String> Q = new JryCTL2<>();\n            Q.I0R += \"uSXy\";\n            System.out.println(Q.I0R);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("gCg").getReference()));
        assertEquals(3, accesses.size());
    }

    @Test
    public void test037() {
        CtClass<?> clazz = Launcher.parseClass("public class sa<T> {\n    T ZjY;\n    T l;\n        public static void H {\n            sa<Integer> yI = new sa<>();\n            System.out.println(yI.ZjY);\n            yI.ZjY = -2371;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("ZjY").getReference()));
        assertEquals(2, accesses.size());
    }

    // @Test
    // public void test038() {
    //     CtClass<?> clazz = Launcher.parseClass("public class Bv<T> {\n    T Mw;\n    T oF;\n    T c;\n    T fE;\n        public static void US {\n            Bv<String> niVeb = new Bv<>();\n            niVeb.Mw = \"Sr\";\n            niVeb.Mw = \"e\";\n            System.out.println(niVeb.Mw);\n            niVeb.Mw += \"H\";\n            niVeb.Mw += \"QBw\";\n            niVeb.Mw = \"A9\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("Mw").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test039() {
        CtClass<?> clazz = Launcher.parseClass("public class Kl<T> {\n    T cYi;\n    T S;\n        public static void VD6 {\n            Kl<Integer> A = new Kl<>();\n            System.out.println(A.cYi);\n            A.cYi = -2960;\n            A.cYi = -4688;\n        }\n        public static void e {\n            Kl<Boolean> jE = new Kl<>();\n            System.out.println(jE.S);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("cYi").getReference()));
        assertEquals(3, accesses.size());
    }

    @Test
    public void test040() {
        CtClass<?> clazz = Launcher.parseClass("public class R<T> {\n    T P;\n    T AH1;\n    T Cn;\n    T Sg4;\n    T h;\n        public static void fNB {\n            R<String> fB = new R<>();\n            fB.Sg4 = \"c\";\n            fB.Sg4 += \"r\";\n            fB.Sg4 += \"C6\";\n            fB.Sg4 += \"X\";\n            fB.Sg4 += \"C\";\n            fB.Sg4 = \"GTs\";\n        }\n        public static void z {\n            R<Integer> u = new R<>();\n            u.Sg4 += 4779;\n            u.Sg4 += -1385;\n            u.Sg4 = -4720;\n            u.Sg4 += -3103;\n            System.out.println(u.Sg4);\n            u.Sg4 = -36;\n        }\n        public static void cU {\n            R<Boolean> G = new R<>();\n            G.Cn = !G.Cn;\n            System.out.println(G.Cn);\n            G.Cn = true;\n            G.Cn = true;\n            G.Cn = !G.Cn;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Cn").getReference()));
        assertEquals(7, accesses.size());
    }

    @Test
    public void test041() {
        CtClass<?> clazz = Launcher.parseClass("public class SzRN<T> {\n    T f;\n    T H3;\n    T mNcHYI3GS;\n    T BiZ2;\n    T d;\n        public static void E1 {\n            SzRN<Boolean> B = new SzRN<>();\n            System.out.println(B.H3);\n            B.H3 = false;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("H3").getReference()));
        assertEquals(2, accesses.size());
    }

    @Test
    public void test042() {
        CtClass<?> clazz = Launcher.parseClass("public class j<T> {\n    T o;\n    T d30q5;\n    T HE;\n        public static void s {\n            j<Integer> aq = new j<>();\n            aq.o += -4427;\n            aq.o = 2488;\n        }\n        public static void S {\n            j<Boolean> iF = new j<>();\n            iF.o = !iF.o;\n            iF.o = !iF.o;\n            System.out.println(iF.o);\n            iF.o = !iF.o;\n            iF.o = false;\n        }\n        public static void O {\n            j<Integer> T = new j<>();\n            T.d30q5 = 4070;\n            T.d30q5 += -2682;\n            T.d30q5 += -4007;\n            System.out.println(T.d30q5);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("d30q5").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test043() {
        CtClass<?> clazz = Launcher.parseClass("public class E<T> {\n    T G;\n    T g8T;\n    T q;\n    T RQ;\n        public static void i {\n            E<Boolean> Xq = new E<>();\n            Xq.RQ = !Xq.RQ;\n            System.out.println(Xq.RQ);\n            System.out.println(Xq.RQ);\n            Xq.RQ = false;\n            System.out.println(Xq.RQ);\n            Xq.RQ = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("RQ").getReference()));
        assertEquals(7, accesses.size());
    }

    @Test
    public void test044() {
        CtClass<?> clazz = Launcher.parseClass("public class p<T> {\n    T fcc0tf;\n    T Nu;\n    T k;\n    T w;\n    T po;\n        public static void t {\n            p<Boolean> X = new p<>();\n            System.out.println(X.k);\n            System.out.println(X.k);\n            X.k = false;\n            X.k = !X.k;\n            X.k = !X.k;\n            X.k = true;\n        }\n        public static void e6 {\n            p<Integer> zk = new p<>();\n            zk.Nu += -1461;\n        }\n        public static void G {\n            p<Boolean> Y5o = new p<>();\n            Y5o.w = !Y5o.w;\n            Y5o.w = !Y5o.w;\n            System.out.println(Y5o.w);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("k").getReference()));
        assertEquals(8, accesses.size());
    }

    @Test
    public void test045() {
        CtClass<?> clazz = Launcher.parseClass("public class D8B<T> {\n    T an;\n    T s;\n    T q;\n        public static void cutR {\n            D8B<Boolean> s3X = new D8B<>();\n            System.out.println(s3X.an);\n        }\n        public static void Q {\n            D8B<Integer> i = new D8B<>();\n            i.s = -4529;\n            System.out.println(i.s);\n            i.s = -4856;\n            i.s = -3973;\n            i.s = 248;\n            i.s += 3833;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("s").getReference()));
        assertEquals(6, accesses.size());
    }

    @Test
    public void test046() {
        CtClass<?> clazz = Launcher.parseClass("public class IfE<T> {\n    T Nb;\n    T uu41;\n    T G;\n        public static void Jy {\n            IfE<String> Z = new IfE<>();\n            Z.G = \"nTt\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("G").getReference()));
        assertEquals(1, accesses.size());
    }

    // @Test
    // public void test047() {
    //     CtClass<?> clazz = Launcher.parseClass("public class V<T> {\n    T oEQ;\n    T sZ8L90D;\n    T g;\n        public static void iEQ0 {\n            V<String> z = new V<>();\n            z.oEQ += \"q\";\n            System.out.println(z.oEQ);\n            z.oEQ = \"oN\";\n            System.out.println(z.oEQ);\n        }\n        public static void O {\n            V<String> ZbL_ = new V<>();\n            ZbL_.oEQ += \"w\";\n            System.out.println(ZbL_.oEQ);\n            System.out.println(ZbL_.oEQ);\n            ZbL_.oEQ = \"pyGsKO\";\n        }\n        public static void Z {\n            V<Boolean> ofx0 = new V<>();\n            System.out.println(ofx0.g);\n            System.out.println(ofx0.g);\n            System.out.println(ofx0.g);\n            ofx0.g = !ofx0.g;\n            ofx0.g = true;\n            ofx0.g = true;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("oEQ").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test048() {
        CtClass<?> clazz = Launcher.parseClass("public class N<T> {\n    T bv9V;\n    T TC;\n    T zlzuI;\n    T H10;\n        public static void m {\n            N<Boolean> H = new N<>();\n            System.out.println(H.H10);\n            H.H10 = false;\n            H.H10 = false;\n            H.H10 = !H.H10;\n        }\n        public static void ABI {\n            N<Integer> E = new N<>();\n            E.TC += 2885;\n            E.TC += 2482;\n            E.TC += 1169;\n        }\n        public static void T {\n            N<Integer> pI = new N<>();\n            System.out.println(pI.zlzuI);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("H10").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test049() {
        CtClass<?> clazz = Launcher.parseClass("public class qk<T> {\n    T oyeJ;\n    T D;\n        public static void nC5y {\n            qk<Integer> rE = new qk<>();\n            System.out.println(rE.D);\n            rE.D += 4191;\n            System.out.println(rE.D);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("D").getReference()));
        assertEquals(3, accesses.size());
    }

    @Test
    public void test050() {
        CtClass<?> clazz = Launcher.parseClass("public class v<T> {\n    T e;\n    T Y;\n    T K;\n    T lU;\n    T OnTN;\n        public static void zw {\n            v<Integer> Tn2 = new v<>();\n            Tn2.e += -4601;\n            Tn2.e = -924;\n            System.out.println(Tn2.e);\n            Tn2.e += -532;\n            Tn2.e += 537;\n        }\n        public static void VlerDI {\n            v<Integer> vNi = new v<>();\n            System.out.println(vNi.K);\n            vNi.K = 1476;\n            vNi.K = -3834;\n            System.out.println(vNi.K);\n            vNi.K += -4077;\n        }\n        public static void S {\n            v<String> w = new v<>();\n            w.K += \"a\";\n            System.out.println(w.K);\n            System.out.println(w.K);\n            w.K = \"RR\";\n            w.K = \"Bh\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("e").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test051() {
        CtClass<?> clazz = Launcher.parseClass("public class A<T> {\n    T lc8;\n    T H;\n    T k;\n    T E;\n        public static void V {\n            A<Boolean> Z = new A<>();\n            Z.E = !Z.E;\n            Z.E = !Z.E;\n            Z.E = false;\n            System.out.println(Z.E);\n            System.out.println(Z.E);\n        }\n        public static void qUO {\n            A<Boolean> L = new A<>();\n            L.H = false;\n            L.H = !L.H;\n            L.H = !L.H;\n            System.out.println(L.H);\n            L.H = true;\n            L.H = true;\n        }\n        public static void o0 {\n            A<String> p = new A<>();\n            p.lc8 += \"Qq0d\";\n            p.lc8 = \"Y\";\n            p.lc8 = \"F\";\n            p.lc8 += \"w\";\n            System.out.println(p.lc8);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("H").getReference()));
        assertEquals(8, accesses.size());
    }

    // @Test
    // public void test052() {
    //     CtClass<?> clazz = Launcher.parseClass("public class d<T> {\n    T ga;\n    T J7;\n    T W;\n    T DZ;\n        public static void G {\n            d<String> t = new d<>();\n            t.ga = \"TB\";\n            t.ga = \"rq\";\n            t.ga = \"v\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("ga").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test053() {
    //     CtClass<?> clazz = Launcher.parseClass("public class w<T> {\n    T Q5;\n    T hHG_1;\n    T y3F;\n    T iEZ;\n    T gBh;\n        public static void kx {\n            w<String> Q = new w<>();\n            System.out.println(Q.y3F);\n            Q.y3F = \"Ib\";\n            Q.y3F = \"SP\";\n        }\n        public static void x {\n            w<Integer> B = new w<>();\n            B.hHG_1 += 1427;\n        }\n        public static void z {\n            w<Boolean> KYL = new w<>();\n            KYL.y3F = true;\n            System.out.println(KYL.y3F);\n            KYL.y3F = false;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("y3F").getReference()));
    //     assertEquals(4, accesses.size());
    // }

    // @Test
    // public void test054() {
    //     CtClass<?> clazz = Launcher.parseClass("public class dW4<T> {\n    T Baj;\n    T n;\n    T E;\n    T zA;\n        public static void Ft {\n            dW4<Integer> k = new dW4<>();\n            k.Baj += -2726;\n            k.Baj += -22;\n            k.Baj += 2150;\n        }\n        public static void sqq {\n            dW4<Integer> HrG = new dW4<>();\n            System.out.println(HrG.E);\n            System.out.println(HrG.E);\n        }\n        public static void A {\n            dW4<String> yL7H = new dW4<>();\n            yL7H.E = \"aNB\";\n            System.out.println(yL7H.E);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("E").getReference()));
    //     assertEquals(2, accesses.size());
    // }

    @Test
    public void test055() {
        CtClass<?> clazz = Launcher.parseClass("public class n<T> {\n    T s;\n    T cy;\n    T I;\n    T Qs6oL;\n    T MG;\n        public static void l {\n            n<Integer> Y = new n<>();\n            System.out.println(Y.cy);\n            Y.cy = 1865;\n            Y.cy += -4975;\n            Y.cy = -4467;\n            Y.cy += -861;\n        }\n        public static void a {\n            n<Boolean> Sgd0nRa = new n<>();\n            Sgd0nRa.I = !Sgd0nRa.I;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("I").getReference()));
        assertEquals(2, accesses.size());
    }

    @Test
    public void test056() {
        CtClass<?> clazz = Launcher.parseClass("public class PK<T> {\n    T z;\n    T QA;\n    T Z;\n        public static void PkNIQ {\n            PK<Boolean> d = new PK<>();\n            d.z = false;\n            System.out.println(d.z);\n            System.out.println(d.z);\n            System.out.println(d.z);\n            System.out.println(d.z);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("z").getReference()));
        assertEquals(5, accesses.size());
    }

    // @Test
    // public void test057() {
    //     CtClass<?> clazz = Launcher.parseClass("public class r<T> {\n    T X;\n    T I;\n    T gk;\n        public static void MqOc {\n            r<String> k = new r<>();\n            k.X += \"F\";\n            k.X += \"x2mr\";\n            System.out.println(k.X);\n            k.X = \"wde\";\n            k.X = \"D\";\n            System.out.println(k.X);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("X").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test058() {
    //     CtClass<?> clazz = Launcher.parseClass("public class B<T> {\n    T WB;\n    T s;\n    T f;\n    T k;\n    T x;\n        public static void o {\n            B<String> y3B = new B<>();\n            y3B.k = \"l\";\n            y3B.k = \"NwC\";\n            y3B.k += \"y\";\n            y3B.k = \"K\";\n        }\n        public static void r {\n            B<String> Gp = new B<>();\n            Gp.x = \"a1\";\n        }\n        public static void ik {\n            B<String> t = new B<>();\n            t.f = \"e\";\n            t.f = \"MY2MFe\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("x").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test059() {
    //     CtClass<?> clazz = Launcher.parseClass("public class j<T> {\n    T X;\n    T K;\n        public static void Q {\n            j<String> w = new j<>();\n            System.out.println(w.K);\n            w.K += \"L4BC\";\n            w.K = \"v\";\n            w.K = \"d\";\n            w.K += \"x\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("K").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    @Test
    public void test060() {
        CtClass<?> clazz = Launcher.parseClass("public class KjIs<T> {\n    T Mg;\n    T f;\n    T B;\n        public static void VnWAgd {\n            KjIs<Boolean> tdO = new KjIs<>();\n            tdO.Mg = false;\n        }\n        public static void b {\n            KjIs<Boolean> x = new KjIs<>();\n            x.B = false;\n            System.out.println(x.B);\n            System.out.println(x.B);\n            System.out.println(x.B);\n            System.out.println(x.B);\n            x.B = !x.B;\n        }\n        public static void S {\n            KjIs<String> iSjGf = new KjIs<>();\n            iSjGf.f = \"nAE\";\n            System.out.println(iSjGf.f);\n            System.out.println(iSjGf.f);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("B").getReference()));
        assertEquals(7, accesses.size());
    }

    @Test
    public void test061() {
        CtClass<?> clazz = Launcher.parseClass("public class W<T> {\n    T sX;\n    T a;\n    T NY;\n        public static void UI8 {\n            W<Boolean> D = new W<>();\n            D.sX = false;\n            D.sX = true;\n            D.sX = !D.sX;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("sX").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test062() {
        CtClass<?> clazz = Launcher.parseClass("public class x<T> {\n    T g1;\n    T t;\n        public static void o {\n            x<Integer> V = new x<>();\n            V.t = -4330;\n            V.t += 4848;\n        }\n        public static void r {\n            x<String> u = new x<>();\n            u.t = \"T\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("t").getReference()));
        assertEquals(3, accesses.size());
    }

    // @Test
    // public void test063() {
    //     CtClass<?> clazz = Launcher.parseClass("public class FhA<T> {\n    T H;\n    T Ka;\n    T XW;\n        public static void J {\n            FhA<String> wM = new FhA<>();\n            wM.XW += \"iN\";\n            wM.XW = \"mM\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("XW").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test064() {
    //     CtClass<?> clazz = Launcher.parseClass("public class wj<T> {\n    T e;\n    T TziWC4_t2d;\n        public static void Y {\n            wj<String> M = new wj<>();\n            System.out.println(M.e);\n            M.e = \"N\";\n            System.out.println(M.e);\n            M.e += \"rn4\";\n            System.out.println(M.e);\n            M.e += \"oY\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("e").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    @Test
    public void test065() {
        CtClass<?> clazz = Launcher.parseClass("public class kgl<T> {\n    T NDeOz;\n    T LH;\n    T P5H;\n    T w;\n    T Co;\n        public static void mG {\n            kgl<String> Q = new kgl<>();\n            Q.LH = \"tQO\";\n            Q.LH += \"T\";\n            Q.LH += \"K\";\n            Q.LH += \"BF\";\n            System.out.println(Q.LH);\n        }\n        public static void FU {\n            kgl<Boolean> BS = new kgl<>();\n            BS.P5H = !BS.P5H;\n            BS.P5H = !BS.P5H;\n            BS.P5H = true;\n            BS.P5H = !BS.P5H;\n            System.out.println(BS.P5H);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("P5H").getReference()));
        assertEquals(8, accesses.size());
    }

    @Test
    public void test066() {
        CtClass<?> clazz = Launcher.parseClass("public class aG<T> {\n    T PJbrv;\n    T i4;\n        public static void d {\n            aG<Integer> M = new aG<>();\n            M.i4 += 101;\n        }\n        public static void t {\n            aG<Boolean> R = new aG<>();\n            System.out.println(R.i4);\n            System.out.println(R.i4);\n            R.i4 = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("i4").getReference()));
        assertEquals(4, accesses.size());
    }

    // @Test
    // public void test067() {
    //     CtClass<?> clazz = Launcher.parseClass("public class n<T> {\n    T DJ;\n    T GDU9NU6l;\n    T Q2;\n    T D6sF;\n        public static void yd {\n            n<String> WU = new n<>();\n            WU.GDU9NU6l = \"Rx\";\n            WU.GDU9NU6l = \"G\";\n            System.out.println(WU.GDU9NU6l);\n            WU.GDU9NU6l += \"I\";\n            WU.GDU9NU6l += \"P\";\n            WU.GDU9NU6l += \"ETQ\";\n        }\n        public static void X {\n            n<String> B = new n<>();\n            B.GDU9NU6l += \"D\";\n            System.out.println(B.GDU9NU6l);\n            B.GDU9NU6l += \"A3h\";\n            B.GDU9NU6l += \"R\";\n            B.GDU9NU6l = \"H\";\n            B.GDU9NU6l += \"uk4\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("GDU9NU6l").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test068() {
    //     CtClass<?> clazz = Launcher.parseClass("public class Y<T> {\n    T s;\n    T rjBQA;\n    T Q;\n        public static void HBdut {\n            Y<String> g = new Y<>();\n            System.out.println(g.s);\n            g.s += \"b0XN\";\n            g.s += \"gK\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("s").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    @Test
    public void test069() {
        CtClass<?> clazz = Launcher.parseClass("public class w<T> {\n    T E;\n    T uaEO;\n    T AHf46;\n    T Z;\n    T mxMQ8ukfYL;\n        public static void H {\n            w<Integer> KGx = new w<>();\n            KGx.uaEO = -2665;\n            System.out.println(KGx.uaEO);\n            KGx.uaEO = -2543;\n            KGx.uaEO = -1005;\n            System.out.println(KGx.uaEO);\n            KGx.uaEO += 1382;\n        }\n        public static void I {\n            w<Boolean> N = new w<>();\n            N.mxMQ8ukfYL = false;\n            N.mxMQ8ukfYL = false;\n            System.out.println(N.mxMQ8ukfYL);\n            N.mxMQ8ukfYL = true;\n            N.mxMQ8ukfYL = true;\n            N.mxMQ8ukfYL = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("mxMQ8ukfYL").getReference()));
        assertEquals(6, accesses.size());
    }

    @Test
    public void test070() {
        CtClass<?> clazz = Launcher.parseClass("public class C<T> {\n    T w;\n    T QL;\n        public static void e {\n            C<Integer> XvM = new C<>();\n            XvM.QL = -3802;\n            XvM.QL = -4508;\n            XvM.QL += 3984;\n            XvM.QL += -1586;\n            System.out.println(XvM.QL);\n            System.out.println(XvM.QL);\n        }\n        public static void g {\n            C<Integer> kwC = new C<>();\n            System.out.println(kwC.w);\n            kwC.w = -1542;\n        }\n        public static void GS {\n            C<Boolean> Q = new C<>();\n            Q.QL = !Q.QL;\n            Q.QL = !Q.QL;\n            Q.QL = true;\n            Q.QL = !Q.QL;\n            Q.QL = !Q.QL;\n            Q.QL = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("QL").getReference()));
        assertEquals(16, accesses.size());
    }

    @Test
    public void test071() {
        CtClass<?> clazz = Launcher.parseClass("public class Km<T> {\n    T s;\n    T P;\n    T k;\n        public static void g0x {\n            Km<Boolean> p = new Km<>();\n            p.s = !p.s;\n            p.s = !p.s;\n            p.s = false;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("s").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test072() {
        CtClass<?> clazz = Launcher.parseClass("public class I<T> {\n    T HWz;\n    T gZ9;\n    T s;\n    T En3;\n        public static void PB {\n            I<Integer> H = new I<>();\n            H.gZ9 = 974;\n            H.gZ9 = -4204;\n            System.out.println(H.gZ9);\n            H.gZ9 += -1518;\n            H.gZ9 += 1668;\n            System.out.println(H.gZ9);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("gZ9").getReference()));
        assertEquals(6, accesses.size());
    }

    @Test
    public void test073() {
        CtClass<?> clazz = Launcher.parseClass("public class i<T> {\n    T Y;\n    T A;\n        public static void P8 {\n            i<Integer> g = new i<>();\n            System.out.println(g.A);\n            g.A = 1134;\n        }\n        public static void Ml {\n            i<String> R = new i<>();\n            R.Y = \"w\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Y").getReference()));
        assertEquals(1, accesses.size());
    }

    @Test
    public void test074() {
        CtClass<?> clazz = Launcher.parseClass("public class h<T> {\n    T dki;\n    T z;\n    T f2;\n    T Z;\n        public static void x {\n            h<Boolean> wx = new h<>();\n            wx.dki = false;\n        }\n        public static void ru {\n            h<Boolean> r1 = new h<>();\n            System.out.println(r1.Z);\n            r1.Z = !r1.Z;\n            r1.Z = true;\n            r1.Z = !r1.Z;\n            r1.Z = !r1.Z;\n            System.out.println(r1.Z);\n        }\n        public static void Ug {\n            h<Integer> kKUq930jic6 = new h<>();\n            System.out.println(kKUq930jic6.f2);\n            kKUq930jic6.f2 += 2000;\n            System.out.println(kKUq930jic6.f2);\n            kKUq930jic6.f2 += -227;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Z").getReference()));
        assertEquals(9, accesses.size());
    }

    // @Test
    // public void test075() {
    //     CtClass<?> clazz = Launcher.parseClass("public class kA<T> {\n    T f;\n    T F;\n    T Hx;\n        public static void M {\n            kA<String> YNsJif = new kA<>();\n            YNsJif.Hx = \"E\";\n            System.out.println(YNsJif.Hx);\n            YNsJif.Hx += \"Zq\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("Hx").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test076() {
        CtClass<?> clazz = Launcher.parseClass("public class SZE5<T> {\n    T KdZFj;\n    T S2oe;\n    T K;\n    T xA;\n    T tNPf;\n        public static void h {\n            SZE5<String> U0qjn = new SZE5<>();\n            U0qjn.K += \"E\";\n            U0qjn.K = \"HF\";\n        }\n        public static void P {\n            SZE5<Boolean> m = new SZE5<>();\n            m.xA = true;\n            m.xA = !m.xA;\n            System.out.println(m.xA);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("xA").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test077() {
        CtClass<?> clazz = Launcher.parseClass("public class pBC<T> {\n    T h;\n    T c;\n    T n;\n    T L0;\n        public static void hDrFy {\n            pBC<Boolean> q = new pBC<>();\n            System.out.println(q.n);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("n").getReference()));
        assertEquals(1, accesses.size());
    }

    @Test
    public void test078() {
        CtClass<?> clazz = Launcher.parseClass("public class wX<T> {\n    T N;\n    T Mr;\n    T Dxe;\n        public static void g {\n            wX<Boolean> w = new wX<>();\n            w.Dxe = false;\n            w.Dxe = !w.Dxe;\n            w.Dxe = true;\n            w.Dxe = false;\n            w.Dxe = false;\n            System.out.println(w.Dxe);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Dxe").getReference()));
        assertEquals(7, accesses.size());
    }

    @Test
    public void test079() {
        CtClass<?> clazz = Launcher.parseClass("public class U<T> {\n    T T;\n    T i;\n        public static void B {\n            U<String> V5 = new U<>();\n            System.out.println(V5.T);\n            V5.T = \"h\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("T").getReference()));
        assertEquals(2, accesses.size());
    }

    @Test
    public void test080() {
        CtClass<?> clazz = Launcher.parseClass("public class PRA<T> {\n    T t;\n    T B;\n    T z;\n    T MM3r;\n    T jQX;\n        public static void zRb9 {\n            PRA<String> Q4cC = new PRA<>();\n            Q4cC.MM3r = \"y\";\n            System.out.println(Q4cC.MM3r);\n            System.out.println(Q4cC.MM3r);\n            System.out.println(Q4cC.MM3r);\n            Q4cC.MM3r = \"p\";\n            Q4cC.MM3r = \"b\";\n        }\n        public static void YOa {\n            PRA<Boolean> F = new PRA<>();\n            F.B = false;\n            System.out.println(F.B);\n            F.B = !F.B;\n            F.B = true;\n            F.B = !F.B;\n            System.out.println(F.B);\n        }\n        public static void h {\n            PRA<Boolean> W = new PRA<>();\n            W.t = false;\n            W.t = false;\n            System.out.println(W.t);\n            W.t = false;\n            System.out.println(W.t);\n            W.t = !W.t;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("t").getReference()));
        assertEquals(7, accesses.size());
    }

    @Test
    public void test081() {
        CtClass<?> clazz = Launcher.parseClass("public class ge<T> {\n    T hD;\n    T er;\n    T S;\n    T ls;\n    T I;\n        public static void Z {\n            ge<Integer> MpEmekZ = new ge<>();\n            MpEmekZ.er += -3468;\n            MpEmekZ.er = 4889;\n            System.out.println(MpEmekZ.er);\n            System.out.println(MpEmekZ.er);\n        }\n        public static void jq {\n            ge<Boolean> i = new ge<>();\n            i.er = !i.er;\n            i.er = !i.er;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("er").getReference()));
        assertEquals(8, accesses.size());
    }

    // @Test
    // public void test082() {
    //     CtClass<?> clazz = Launcher.parseClass("public class Pe<T> {\n    T l;\n    T BC;\n    T dGs;\n        public static void hFu {\n            Pe<String> N = new Pe<>();\n            N.dGs += \"jAb\";\n            System.out.println(N.dGs);\n            N.dGs = \"Ffw\";\n        }\n        public static void ppt {\n            Pe<String> YxDw = new Pe<>();\n            YxDw.l += \"L\";\n        }\n        public static void t {\n            Pe<Integer> p = new Pe<>();\n            p.l += -1531;\n            p.l = -2763;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("dGs").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test083() {
        CtClass<?> clazz = Launcher.parseClass("public class K<T> {\n    T hQE;\n    T z;\n    T Lj;\n    T u;\n    T m;\n        public static void ixu {\n            K<Integer> Qu = new K<>();\n            Qu.hQE += -2803;\n            Qu.hQE = 3174;\n            System.out.println(Qu.hQE);\n            Qu.hQE = -2444;\n            Qu.hQE += -1338;\n            Qu.hQE = 122;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("hQE").getReference()));
        assertEquals(6, accesses.size());
    }

    // @Test
    // public void test084() {
    //     CtClass<?> clazz = Launcher.parseClass("public class IyiN<T> {\n    T MQ9;\n    T o;\n    T my;\n    T u_;\n    T H;\n        public static void b {\n            IyiN<Boolean> V = new IyiN<>();\n            V.H = !V.H;\n            V.H = !V.H;\n            V.H = !V.H;\n            V.H = false;\n        }\n        public static void v {\n            IyiN<String> d8 = new IyiN<>();\n            d8.H += \"Q\";\n            d8.H += \"w\";\n            d8.H = \"p\";\n            System.out.println(d8.H);\n            d8.H = \"vg\";\n            d8.H += \"AGI\";\n        }\n        public static void Xo {\n            IyiN<Boolean> B = new IyiN<>();\n            System.out.println(B.u_);\n            B.u_ = !B.u_;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("H").getReference()));
    //     assertEquals(7, accesses.size());
    // }

    @Test
    public void test085() {
        CtClass<?> clazz = Launcher.parseClass("public class AqD<T> {\n    T T;\n    T a;\n    T H7w;\n    T ZH;\n        public static void Y {\n            AqD<String> Z = new AqD<>();\n            System.out.println(Z.a);\n            System.out.println(Z.a);\n            Z.a = \"KGfJt\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("a").getReference()));
        assertEquals(3, accesses.size());
    }

    @Test
    public void test086() {
        CtClass<?> clazz = Launcher.parseClass("public class mfR<T> {\n    T s;\n    T F;\n    T fSh;\n    T w;\n        public static void cp {\n            mfR<String> W = new mfR<>();\n            W.s = \"cf\";\n            W.s = \"Y\";\n        }\n        public static void M {\n            mfR<String> FFsq = new mfR<>();\n            System.out.println(FFsq.fSh);\n        }\n        public static void cQZ {\n            mfR<Boolean> Jb = new mfR<>();\n            Jb.w = !Jb.w;\n            Jb.w = false;\n            Jb.w = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("fSh").getReference()));
        assertEquals(1, accesses.size());
    }

    @Test
    public void test087() {
        CtClass<?> clazz = Launcher.parseClass("public class g0K_P<T> {\n    T e2;\n    T J;\n    T G;\n        public static void O {\n            g0K_P<Boolean> FxhI = new g0K_P<>();\n            FxhI.J = true;\n            FxhI.J = false;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("J").getReference()));
        assertEquals(2, accesses.size());
    }

    @Test
    public void test088() {
        CtClass<?> clazz = Launcher.parseClass("public class L<T> {\n    T T;\n    T X;\n    T N;\n    T boRB;\n        public static void p {\n            L<Boolean> fo = new L<>();\n            System.out.println(fo.X);\n            System.out.println(fo.X);\n            fo.X = !fo.X;\n            System.out.println(fo.X);\n            System.out.println(fo.X);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("X").getReference()));
        assertEquals(6, accesses.size());
    }

    @Test
    public void test089() {
        CtClass<?> clazz = Launcher.parseClass("public class iaq0<T> {\n    T QpQ;\n    T A;\n    T c1OdJxL;\n    T kG;\n    T jPCXwK;\n        public static void p {\n            iaq0<Boolean> o = new iaq0<>();\n            System.out.println(o.kG);\n            o.kG = true;\n            o.kG = false;\n            o.kG = true;\n            o.kG = !o.kG;\n            o.kG = !o.kG;\n        }\n        public static void B {\n            iaq0<Boolean> Ih = new iaq0<>();\n            Ih.jPCXwK = !Ih.jPCXwK;\n            Ih.jPCXwK = true;\n            System.out.println(Ih.jPCXwK);\n            Ih.jPCXwK = true;\n        }\n        public static void T {\n            iaq0<Integer> H = new iaq0<>();\n            System.out.println(H.jPCXwK);\n            System.out.println(H.jPCXwK);\n            H.jPCXwK += 3324;\n            H.jPCXwK += -2120;\n            H.jPCXwK = 3891;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("kG").getReference()));
        assertEquals(8, accesses.size());
    }

    @Test
    public void test090() {
        CtClass<?> clazz = Launcher.parseClass("public class z7n6j<T> {\n    T N;\n    T CtuDVL;\n    T Z;\n    T g;\n        public static void W_u {\n            z7n6j<Boolean> pj = new z7n6j<>();\n            pj.Z = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Z").getReference()));
        assertEquals(1, accesses.size());
    }

    @Test
    public void test091() {
        CtClass<?> clazz = Launcher.parseClass("public class JOnZ<T> {\n    T y;\n    T L;\n        public static void fa {\n            JOnZ<Integer> D = new JOnZ<>();\n            D.y += -2764;\n            System.out.println(D.y);\n            D.y = -1907;\n            D.y += -1778;\n            System.out.println(D.y);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("y").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test092() {
        CtClass<?> clazz = Launcher.parseClass("public class Hda<T> {\n    T SPs;\n    T jk;\n    T GZ;\n    T Zn;\n    T SM_y;\n        public static void w_ {\n            Hda<Boolean> zF5c = new Hda<>();\n            zF5c.SM_y = !zF5c.SM_y;\n            System.out.println(zF5c.SM_y);\n        }\n        public static void t {\n            Hda<Boolean> e = new Hda<>();\n            e.Zn = !e.Zn;\n            System.out.println(e.Zn);\n            e.Zn = !e.Zn;\n        }\n        public static void Z {\n            Hda<Boolean> blS3 = new Hda<>();\n            blS3.SPs = false;\n            blS3.SPs = false;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("SPs").getReference()));
        assertEquals(2, accesses.size());
    }

    @Test
    public void test093() {
        CtClass<?> clazz = Launcher.parseClass("public class d<T> {\n    T kx2;\n    T P;\n    T c_D;\n    T XzponQF;\n        public static void rt {\n            d<String> h = new d<>();\n            System.out.println(h.c_D);\n        }\n        public static void DBcS {\n            d<Boolean> o = new d<>();\n            o.c_D = false;\n            o.c_D = !o.c_D;\n            o.c_D = false;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("c_D").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test094() {
        CtClass<?> clazz = Launcher.parseClass("public class h5<T> {\n    T k;\n    T Bi;\n    T b;\n    T IM;\n    T pI;\n        public static void Dw {\n            h5<Integer> Z = new h5<>();\n            Z.pI = 4287;\n            Z.pI += -1353;\n            System.out.println(Z.pI);\n        }\n        public static void Ns {\n            h5<String> V = new h5<>();\n            System.out.println(V.k);\n            System.out.println(V.k);\n            V.k += \"mL\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("k").getReference()));
        assertEquals(3, accesses.size());
    }

    @Test
    public void test095() {
        CtClass<?> clazz = Launcher.parseClass("public class L<T> {\n    T R;\n    T O;\n    T u;\n        public static void Q {\n            L<Boolean> m = new L<>();\n            m.R = !m.R;\n        }\n        public static void i {\n            L<Integer> bYB10pzx = new L<>();\n            bYB10pzx.u += 215;\n            bYB10pzx.u = -4938;\n            bYB10pzx.u = 1614;\n            System.out.println(bYB10pzx.u);\n            bYB10pzx.u += -4688;\n            bYB10pzx.u = 3432;\n        }\n        public static void c {\n            L<Boolean> zz1M7jjAXxx = new L<>();\n            zz1M7jjAXxx.R = false;\n            zz1M7jjAXxx.R = !zz1M7jjAXxx.R;\n            zz1M7jjAXxx.R = !zz1M7jjAXxx.R;\n            zz1M7jjAXxx.R = !zz1M7jjAXxx.R;\n            zz1M7jjAXxx.R = !zz1M7jjAXxx.R;\n            zz1M7jjAXxx.R = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("u").getReference()));
        assertEquals(6, accesses.size());
    }

    @Test
    public void test096() {
        CtClass<?> clazz = Launcher.parseClass("public class lK8<T> {\n    T VQW59;\n    T G;\n        public static void E {\n            lK8<Integer> B = new lK8<>();\n            System.out.println(B.G);\n            B.G += -3258;\n            B.G = -1245;\n            B.G = -3100;\n            System.out.println(B.G);\n            B.G = -2890;\n        }\n        public static void S {\n            lK8<Boolean> J = new lK8<>();\n            J.VQW59 = true;\n            J.VQW59 = false;\n            System.out.println(J.VQW59);\n            System.out.println(J.VQW59);\n            J.VQW59 = !J.VQW59;\n            System.out.println(J.VQW59);\n        }\n        public static void q {\n            lK8<String> sMV = new lK8<>();\n            System.out.println(sMV.G);\n            System.out.println(sMV.G);\n            sMV.G += \"iXIe\";\n            System.out.println(sMV.G);\n            System.out.println(sMV.G);\n            System.out.println(sMV.G);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("VQW59").getReference()));
        assertEquals(7, accesses.size());
    }

    @Test
    public void test097() {
        CtClass<?> clazz = Launcher.parseClass("public class o<T> {\n    T h2;\n    T F;\n    T U;\n    T I;\n    T G;\n        public static void u {\n            o<Integer> t7 = new o<>();\n            t7.G += -275;\n            t7.G += 3295;\n            System.out.println(t7.G);\n            System.out.println(t7.G);\n            System.out.println(t7.G);\n            System.out.println(t7.G);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("G").getReference()));
        assertEquals(6, accesses.size());
    }

    // @Test
    // public void test098() {
    //     CtClass<?> clazz = Launcher.parseClass("public class X<T> {\n    T Qh;\n    T By;\n    T eiRp6g_Df;\n    T D;\n        public static void N {\n            X<Boolean> mK = new X<>();\n            mK.By = !mK.By;\n            System.out.println(mK.By);\n        }\n        public static void w {\n            X<String> d = new X<>();\n            System.out.println(d.D);\n            d.D = \"C\";\n            d.D += \"Qy8\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("D").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    // @Test
    // public void test099() {
    //     CtClass<?> clazz = Launcher.parseClass("public class M<T> {\n    T K;\n    T phIS;\n    T u;\n    T Yo;\n    T Yh;\n        public static void v {\n            M<String> EG = new M<>();\n            EG.Yo += \"BKE\";\n            System.out.println(EG.Yo);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("Yo").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test100() {
        CtClass<?> clazz = Launcher.parseClass("public class rcw_<T> {\n    T V;\n    T PcRCRiz1;\n    T Tz;\n    T BrcAMm;\n    T s;\n        public static void sHc7O {\n            rcw_<Integer> JT_c = new rcw_<>();\n            JT_c.s += -677;\n            JT_c.s = -4632;\n            JT_c.s += -4196;\n            JT_c.s = -1732;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("s").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test101() {
        CtClass<?> clazz = Launcher.parseClass("public class cjF<T> {\n    T bIV;\n    T J;\n    T gyJ2;\n    T A;\n    T O;\n        public static void K05F {\n            cjF<String> B = new cjF<>();\n            System.out.println(B.O);\n            System.out.println(B.O);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("O").getReference()));
        assertEquals(2, accesses.size());
    }

    @Test
    public void test102() {
        CtClass<?> clazz = Launcher.parseClass("public class N<T> {\n    T X;\n    T O;\n    T di;\n    T NVC3;\n        public static void P {\n            N<Boolean> JQ = new N<>();\n            JQ.di = true;\n            JQ.di = !JQ.di;\n            JQ.di = !JQ.di;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("di").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test103() {
        CtClass<?> clazz = Launcher.parseClass("public class weR<T> {\n    T c;\n    T w;\n    T HQa;\n    T Kge;\n        public static void Qh {\n            weR<Boolean> lM6E = new weR<>();\n            lM6E.c = !lM6E.c;\n            lM6E.c = !lM6E.c;\n            lM6E.c = !lM6E.c;\n            System.out.println(lM6E.c);\n            lM6E.c = !lM6E.c;\n            lM6E.c = !lM6E.c;\n        }\n        public static void Sy2N4 {\n            weR<Boolean> Z = new weR<>();\n            Z.w = true;\n            System.out.println(Z.w);\n            Z.w = !Z.w;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("c").getReference()));
        assertEquals(11, accesses.size());
    }

    @Test
    public void test104() {
        CtClass<?> clazz = Launcher.parseClass("public class f7<T> {\n    T p;\n    T T;\n    T x;\n        public static void c {\n            f7<Boolean> K = new f7<>();\n            System.out.println(K.p);\n            System.out.println(K.p);\n            K.p = !K.p;\n            K.p = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("p").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test105() {
        CtClass<?> clazz = Launcher.parseClass("public class kIw<T> {\n    T s;\n    T g;\n    T vl;\n        public static void b {\n            kIw<Integer> u = new kIw<>();\n            u.vl += 210;\n            u.vl += -1647;\n        }\n        public static void F {\n            kIw<Boolean> T = new kIw<>();\n            System.out.println(T.s);\n            System.out.println(T.s);\n            System.out.println(T.s);\n            System.out.println(T.s);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("s").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test106() {
        CtClass<?> clazz = Launcher.parseClass("public class ym<T> {\n    T O;\n    T Xjy;\n    T zdo;\n    T D;\n        public static void m0 {\n            ym<Integer> c = new ym<>();\n            c.zdo += -2426;\n            System.out.println(c.zdo);\n            c.zdo += 4581;\n            c.zdo += 891;\n        }\n        public static void MG {\n            ym<Boolean> G0gM6g3rRQ = new ym<>();\n            G0gM6g3rRQ.O = false;\n            System.out.println(G0gM6g3rRQ.O);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("O").getReference()));
        assertEquals(2, accesses.size());
    }

    @Test
    public void test107() {
        CtClass<?> clazz = Launcher.parseClass("public class l<T> {\n    T K1;\n    T Xs1;\n    T MmQt;\n    T Y1;\n        public static void m {\n            l<String> v = new l<>();\n            System.out.println(v.Y1);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Y1").getReference()));
        assertEquals(1, accesses.size());
    }

    // @Test
    // public void test108() {
    //     CtClass<?> clazz = Launcher.parseClass("public class GIeir<T> {\n    T DEC;\n    T J8A;\n    T V;\n        public static void Q {\n            GIeir<String> w = new GIeir<>();\n            w.V = \"I\";\n            System.out.println(w.V);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("V").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test109() {
    //     CtClass<?> clazz = Launcher.parseClass("public class Z<T> {\n    T YV;\n    T q;\n        public static void M {\n            Z<String> d = new Z<>();\n            d.YV = \"w\";\n            d.YV = \"k\";\n            System.out.println(d.YV);\n            System.out.println(d.YV);\n            d.YV = \"O\";\n            System.out.println(d.YV);\n        }\n        public static void Quc {\n            Z<String> p = new Z<>();\n            p.q = \"wDCw\";\n            p.q += \"BS\";\n            p.q += \"KymI\";\n        }\n        public static void AL {\n            Z<String> ld = new Z<>();\n            ld.YV += \"c\";\n            System.out.println(ld.YV);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("YV").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test110() {
        CtClass<?> clazz = Launcher.parseClass("public class Y2<T> {\n    T ny;\n    T c;\n    T m8;\n    T SB;\n        public static void k {\n            Y2<Integer> BG = new Y2<>();\n            BG.c = -4794;\n            BG.c = 2139;\n            BG.c = 2192;\n            System.out.println(BG.c);\n            System.out.println(BG.c);\n            System.out.println(BG.c);\n        }\n        public static void s8 {\n            Y2<Integer> KZ = new Y2<>();\n            KZ.ny += 4101;\n            KZ.ny = 824;\n            KZ.ny += 2602;\n            KZ.ny += 4477;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("ny").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test111() {
        CtClass<?> clazz = Launcher.parseClass("public class Ds<T> {\n    T Y;\n    T PB8w;\n        public static void F {\n            Ds<Boolean> k = new Ds<>();\n            k.PB8w = false;\n            k.PB8w = !k.PB8w;\n            k.PB8w = !k.PB8w;\n        }\n        public static void a {\n            Ds<Integer> d = new Ds<>();\n            d.PB8w += -1586;\n            d.PB8w = 3938;\n            System.out.println(d.PB8w);\n            d.PB8w = -3522;\n            d.PB8w = 1673;\n            d.PB8w += -858;\n        }\n        public static void o {\n            Ds<Integer> X = new Ds<>();\n            X.PB8w = -4813;\n            X.PB8w = -209;\n            X.PB8w += -4503;\n            System.out.println(X.PB8w);\n            System.out.println(X.PB8w);\n            System.out.println(X.PB8w);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("PB8w").getReference()));
        assertEquals(17, accesses.size());
    }

    // @Test
    // public void test112() {
    //     CtClass<?> clazz = Launcher.parseClass("public class Oxo<T> {\n    T T;\n    T J;\n    T h;\n    T sO;\n    T dfh;\n        public static void d {\n            Oxo<String> r = new Oxo<>();\n            r.h += \"wr\";\n            r.h = \"q\";\n            r.h = \"oENBX\";\n        }\n        public static void mNOwZ {\n            Oxo<Boolean> V = new Oxo<>();\n            V.T = true;\n            V.T = !V.T;\n            V.T = false;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("h").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test113() {
        CtClass<?> clazz = Launcher.parseClass("public class Y<T> {\n    T T;\n    T r;\n        public static void x {\n            Y<Integer> j = new Y<>();\n            System.out.println(j.r);\n        }\n        public static void m {\n            Y<String> UQ9 = new Y<>();\n            UQ9.T += \"A\";\n        }\n        public static void d {\n            Y<String> a1 = new Y<>();\n            a1.T = \"Wmy\";\n            a1.T += \"RzMr\";\n            a1.T = \"oV\";\n            System.out.println(a1.T);\n            a1.T = \"Ld\";\n            System.out.println(a1.T);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("r").getReference()));
        assertEquals(1, accesses.size());
    }

    @Test
    public void test114() {
        CtClass<?> clazz = Launcher.parseClass("public class sIj<T> {\n    T Qt7;\n    T q;\n    T N;\n        public static void exQ {\n            sIj<Integer> PtdA8N = new sIj<>();\n            System.out.println(PtdA8N.Qt7);\n            System.out.println(PtdA8N.Qt7);\n            PtdA8N.Qt7 = -1197;\n        }\n        public static void FGd {\n            sIj<String> d = new sIj<>();\n            System.out.println(d.Qt7);\n        }\n        public static void i {\n            sIj<Boolean> oi = new sIj<>();\n            oi.N = true;\n            oi.N = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Qt7").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test115() {
        CtClass<?> clazz = Launcher.parseClass("public class QfTiPdHo<T> {\n    T HKc;\n    T E53Y;\n    T RZv;\n    T ZX;\n        public static void UJ {\n            QfTiPdHo<String> a = new QfTiPdHo<>();\n            a.HKc += \"I\";\n            System.out.println(a.HKc);\n            System.out.println(a.HKc);\n            a.HKc += \"Y\";\n            a.HKc += \"S\";\n            a.HKc += \"F\";\n        }\n        public static void Tw3 {\n            QfTiPdHo<Integer> Ae0uS = new QfTiPdHo<>();\n            Ae0uS.ZX += -4163;\n            System.out.println(Ae0uS.ZX);\n            System.out.println(Ae0uS.ZX);\n            Ae0uS.ZX += -3306;\n        }\n        public static void G {\n            QfTiPdHo<String> lDlT0 = new QfTiPdHo<>();\n            System.out.println(lDlT0.E53Y);\n            System.out.println(lDlT0.E53Y);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("ZX").getReference()));
        assertEquals(4, accesses.size());
    }

    // @Test
    // public void test116() {
    //     CtClass<?> clazz = Launcher.parseClass("public class f2Yr<T> {\n    T CnbO;\n    T CRfx7;\n    T D;\n        public static void CT {\n            f2Yr<Integer> Srbpx = new f2Yr<>();\n            System.out.println(Srbpx.D);\n        }\n        public static void BQ {\n            f2Yr<String> n = new f2Yr<>();\n            System.out.println(n.CnbO);\n            n.CnbO += \"j\";\n            n.CnbO += \"HtEKb9MyZ\";\n        }\n        public static void Cw {\n            f2Yr<Boolean> Q = new f2Yr<>();\n            System.out.println(Q.CnbO);\n            System.out.println(Q.CnbO);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("CnbO").getReference()));
    //     assertEquals(3, accesses.size());
    // }

    @Test
    public void test117() {
        CtClass<?> clazz = Launcher.parseClass("public class T<T> {\n    T f7;\n    T d_;\n        public static void z {\n            T<Integer> l = new T<>();\n            l.d_ = 4626;\n            l.d_ += 4721;\n            l.d_ += 4680;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("d_").getReference()));
        assertEquals(0, accesses.size());
    }

    // @Test
    // public void test118() {
    //     CtClass<?> clazz = Launcher.parseClass("public class SG<T> {\n    T jWY;\n    T h;\n    T fPiN7;\n    T A6;\n        public static void n {\n            SG<String> c5 = new SG<>();\n            c5.h += \"iOWx2u\";\n            c5.h = \"O93\";\n        }\n        public static void R {\n            SG<Boolean> a = new SG<>();\n            System.out.println(a.jWY);\n            System.out.println(a.jWY);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("h").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test119() {
        CtClass<?> clazz = Launcher.parseClass("public class c<T> {\n    T na;\n    T sv4;\n    T zM;\n    T rnC;\n    T N;\n        public static void Q {\n            c<Integer> S2k = new c<>();\n            S2k.na = 3989;\n        }\n        public static void L {\n            c<Integer> oc = new c<>();\n            oc.sv4 += -3233;\n            oc.sv4 = 1109;\n            oc.sv4 = -1516;\n            System.out.println(oc.sv4);\n            oc.sv4 = -67;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("na").getReference()));
        assertEquals(1, accesses.size());
    }

    @Test
    public void test120() {
        CtClass<?> clazz = Launcher.parseClass("public class e_<T> {\n    T xl;\n    T px;\n    T l;\n    T X;\n        public static void V {\n            e_<Integer> r = new e_<>();\n            r.X = -1855;\n            System.out.println(r.X);\n            System.out.println(r.X);\n            r.X = 4877;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("X").getReference()));
        assertEquals(4, accesses.size());
    }

    // @Test
    // public void test121() {
    //     CtClass<?> clazz = Launcher.parseClass("public class F<T> {\n    T h3;\n    T t;\n    T A;\n    T xf;\n    T J;\n        public static void q {\n            F<String> C = new F<>();\n            C.A = \"th\";\n            C.A += \"CE\";\n            System.out.println(C.A);\n            C.A += \"fK_g\";\n            C.A = \"pv1\";\n            C.A += \"B\";\n        }\n        public static void O {\n            F<String> Vw7 = new F<>();\n            Vw7.h3 += \"X\";\n            Vw7.h3 = \"qn2\";\n        }\n        public static void N {\n            F<String> p = new F<>();\n            p.J += \"KR\";\n            p.J += \"I\";\n            p.J += \"m3j7w\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("h3").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test122() {
        CtClass<?> clazz = Launcher.parseClass("public class w<T> {\n    T TvHj;\n    T U;\n        public static void O {\n            w<Boolean> d = new w<>();\n            d.TvHj = !d.TvHj;\n        }\n        public static void K {\n            w<String> bn6T6J = new w<>();\n            System.out.println(bn6T6J.U);\n            bn6T6J.U += \"T\";\n            System.out.println(bn6T6J.U);\n            System.out.println(bn6T6J.U);\n            bn6T6J.U += \"FED5\";\n        }\n        public static void TD {\n            w<String> A = new w<>();\n            A.U += \"Pb\";\n            System.out.println(A.U);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("TvHj").getReference()));
        assertEquals(2, accesses.size());
    }

    // @Test
    // public void test123() {
    //     CtClass<?> clazz = Launcher.parseClass("public class tEj<T> {\n    T Mpy;\n    T I;\n    T L;\n    T a;\n    T p;\n        public static void n {\n            tEj<Boolean> OO9N = new tEj<>();\n            System.out.println(OO9N.p);\n        }\n        public static void zdMh {\n            tEj<String> Nc = new tEj<>();\n            Nc.L = \"dD7D\";\n            Nc.L += \"TxS\";\n        }\n        public static void pys {\n            tEj<String> Et = new tEj<>();\n            Et.Mpy = \"QW\";\n            Et.Mpy += \"CH\";\n            Et.Mpy += \"LH\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("Mpy").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test124() {
    //     CtClass<?> clazz = Launcher.parseClass("public class Sl<T> {\n    T B;\n    T f;\n    T R;\n    T vWPV;\n    T Ht;\n        public static void BXz {\n            Sl<String> G = new Sl<>();\n            System.out.println(G.B);\n            G.B += \"JXY7F\";\n            System.out.println(G.B);\n            G.B += \"gT\";\n            G.B = \"b\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("B").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    // @Test
    // public void test125() {
    //     CtClass<?> clazz = Launcher.parseClass("public class n<T> {\n    T MhR;\n    T H;\n        public static void RP {\n            n<Integer> W = new n<>();\n            W.MhR = 4153;\n            System.out.println(W.MhR);\n            W.MhR += -4345;\n            System.out.println(W.MhR);\n            W.MhR += -2581;\n        }\n        public static void L {\n            n<Integer> p = new n<>();\n            System.out.println(p.H);\n            p.H += -1009;\n            System.out.println(p.H);\n            System.out.println(p.H);\n            p.H += 3215;\n            System.out.println(p.H);\n        }\n        public static void Dk3d1 {\n            n<String> e = new n<>();\n            System.out.println(e.MhR);\n            e.MhR += \"b\";\n            e.MhR += \"sy15\";\n            System.out.println(e.MhR);\n            e.MhR = \"s7Wok\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("MhR").getReference()));
    //     assertEquals(6, accesses.size());
    // }

    // @Test
    // public void test126() {
    //     CtClass<?> clazz = Launcher.parseClass("public class m0<T> {\n    T v;\n    T Ux;\n        public static void Gk1n {\n            m0<String> TDRR = new m0<>();\n            TDRR.Ux = \"Og5\";\n            System.out.println(TDRR.Ux);\n            TDRR.Ux += \"u\";\n        }\n        public static void w {\n            m0<Boolean> wuDR5yvD9 = new m0<>();\n            wuDR5yvD9.Ux = true;\n            System.out.println(wuDR5yvD9.Ux);\n            wuDR5yvD9.Ux = false;\n        }\n        public static void Gf {\n            m0<String> T = new m0<>();\n            T.Ux = \"krt\";\n            T.Ux += \"m\";\n            T.Ux += \"a6\";\n            T.Ux = \"Z\";\n            System.out.println(T.Ux);\n            System.out.println(T.Ux);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("Ux").getReference()));
    //     assertEquals(3, accesses.size());
    // }

    @Test
    public void test127() {
        CtClass<?> clazz = Launcher.parseClass("public class T<T> {\n    T z3;\n    T Z;\n    T pCWa;\n        public static void d {\n            T<String> mc = new T<>();\n            mc.Z += \"Q\";\n        }\n        public static void e {\n            T<Integer> nA = new T<>();\n            System.out.println(nA.Z);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Z").getReference()));
        assertEquals(0, accesses.size());
    }

    // @Test
    // public void test128() {
    //     CtClass<?> clazz = Launcher.parseClass("public class Vi<T> {\n    T a;\n    T v;\n    T P;\n    T n;\n    T X;\n        public static void r {\n            Vi<String> e = new Vi<>();\n            System.out.println(e.a);\n            e.a += \"mg\";\n            e.a = \"TK\";\n            e.a += \"I\";\n        }\n        public static void vaigt {\n            Vi<String> uM9eE = new Vi<>();\n            uM9eE.a = \"r4I\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("a").getReference()));
    //     assertEquals(2, accesses.size());
    // }

    // @Test
    // public void test129() {
    //     CtClass<?> clazz = Launcher.parseClass("public class tUB<T> {\n    T reSI;\n    T TH;\n    T x;\n        public static void O {\n            tUB<String> Nnf = new tUB<>();\n            Nnf.reSI = \"H\";\n            Nnf.reSI = \"lY\";\n            Nnf.reSI += \"l\";\n            Nnf.reSI += \"e8X\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("reSI").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test130() {
        CtClass<?> clazz = Launcher.parseClass("public class H<T> {\n    T tL;\n    T Dd;\n        public static void mOG {\n            H<Integer> m = new H<>();\n            m.Dd = -1814;\n            System.out.println(m.Dd);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Dd").getReference()));
        assertEquals(2, accesses.size());
    }

    // @Test
    // public void test131() {
    //     CtClass<?> clazz = Launcher.parseClass("public class zekB7H<T> {\n    T yc;\n    T mu;\n    T rzST;\n        public static void N {\n            zekB7H<Integer> XBWd = new zekB7H<>();\n            XBWd.yc += -305;\n            XBWd.yc += -2151;\n            XBWd.yc = 1038;\n            System.out.println(XBWd.yc);\n            System.out.println(XBWd.yc);\n        }\n        public static void h2 {\n            zekB7H<String> C = new zekB7H<>();\n            C.yc += \"o\";\n            C.yc += \"tf\";\n            System.out.println(C.yc);\n            System.out.println(C.yc);\n        }\n        public static void r {\n            zekB7H<Integer> oMv1S = new zekB7H<>();\n            oMv1S.yc += 1943;\n            oMv1S.yc += 3323;\n            oMv1S.yc = -3625;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("yc").getReference()));
    //     assertEquals(8, accesses.size());
    // }

    @Test
    public void test132() {
        CtClass<?> clazz = Launcher.parseClass("public class n<T> {\n    T s;\n    T g;\n    T q;\n    T kV;\n    T B;\n        public static void vn {\n            n<Integer> z6k = new n<>();\n            System.out.println(z6k.q);\n            System.out.println(z6k.q);\n            z6k.q = -5;\n            System.out.println(z6k.q);\n            System.out.println(z6k.q);\n            z6k.q += -2841;\n        }\n        public static void po {\n            n<Boolean> z = new n<>();\n            System.out.println(z.g);\n            z.g = false;\n            z.g = !z.g;\n            z.g = !z.g;\n            System.out.println(z.g);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("g").getReference()));
        assertEquals(7, accesses.size());
    }

    @Test
    public void test133() {
        CtClass<?> clazz = Launcher.parseClass("public class l<T> {\n    T E;\n    T No4;\n    T RZ;\n    T Q;\n        public static void x {\n            l<Integer> iGpTTcsh = new l<>();\n            iGpTTcsh.RZ = -1530;\n            iGpTTcsh.RZ += 565;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("RZ").getReference()));
        assertEquals(2, accesses.size());
    }

    // @Test
    // public void test134() {
    //     CtClass<?> clazz = Launcher.parseClass("public class elDay<T> {\n    T F;\n    T Mq;\n    T Z;\n    T d;\n        public static void zN {\n            elDay<String> zONtc = new elDay<>();\n            zONtc.Z = \"M\";\n        }\n        public static void W {\n            elDay<String> o = new elDay<>();\n            o.Z = \"Ocb\";\n            System.out.println(o.Z);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("Z").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test135() {
        CtClass<?> clazz = Launcher.parseClass("public class n17<T> {\n    T xYg7;\n    T w;\n    T V;\n    T Bw;\n        public static void r {\n            n17<Integer> D = new n17<>();\n            System.out.println(D.V);\n            System.out.println(D.V);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("V").getReference()));
        assertEquals(2, accesses.size());
    }

    // @Test
    // public void test136() {
    //     CtClass<?> clazz = Launcher.parseClass("public class u<T> {\n    T Am;\n    T U;\n    T mE1i;\n    T eLu;\n        public static void qy {\n            u<String> O = new u<>();\n            O.mE1i = \"N\";\n            O.mE1i += \"t7\";\n            O.mE1i = \"P\";\n            O.mE1i += \"E0z\";\n            O.mE1i = \"V\";\n        }\n        public static void BBl {\n            u<Boolean> n = new u<>();\n            System.out.println(n.U);\n            n.U = false;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("mE1i").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test137() {
        CtClass<?> clazz = Launcher.parseClass("public class T<T> {\n    T I;\n    T Z;\n    T q;\n        public static void m {\n            T<String> e = new T<>();\n            e.Z = \"uefZ\";\n        }\n        public static void K {\n            T<Integer> w = new T<>();\n            System.out.println(w.I);\n            w.I = -3159;\n            w.I += 3744;\n        }\n        public static void XvC {\n            T<Boolean> Y55o = new T<>();\n            Y55o.I = false;\n            System.out.println(Y55o.I);\n            System.out.println(Y55o.I);\n            Y55o.I = !Y55o.I;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("I").getReference()));
        assertEquals(0, accesses.size());
    }

    @Test
    public void test138() {
        CtClass<?> clazz = Launcher.parseClass("public class X<T> {\n    T z6;\n    T PZn02;\n    T lvtn;\n    T N;\n        public static void pXH2 {\n            X<Integer> Z = new X<>();\n            System.out.println(Z.lvtn);\n            Z.lvtn = -1269;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("lvtn").getReference()));
        assertEquals(2, accesses.size());
    }

    @Test
    public void test139() {
        CtClass<?> clazz = Launcher.parseClass("public class iT<T> {\n    T c18;\n    T c;\n    T L;\n    T D;\n        public static void F8 {\n            iT<Boolean> IR = new iT<>();\n            System.out.println(IR.c);\n            IR.c = !IR.c;\n            System.out.println(IR.c);\n        }\n        public static void z {\n            iT<Boolean> yn6soz = new iT<>();\n            yn6soz.D = true;\n            yn6soz.D = false;\n            System.out.println(yn6soz.D);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("c").getReference()));
        assertEquals(4, accesses.size());
    }

    @Test
    public void test140() {
        CtClass<?> clazz = Launcher.parseClass("public class Zw<T> {\n    T n;\n    T hc;\n        public static void hA1wI {\n            Zw<Boolean> eg7SipGcW = new Zw<>();\n            System.out.println(eg7SipGcW.hc);\n            eg7SipGcW.hc = !eg7SipGcW.hc;\n        }\n        public static void x1E {\n            Zw<Integer> K = new Zw<>();\n            K.hc += 1303;\n            K.hc += 2295;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("hc").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test141() {
        CtClass<?> clazz = Launcher.parseClass("public class o<T> {\n    T v;\n    T a4J;\n    T y;\n        public static void f {\n            o<String> vgjV = new o<>();\n            System.out.println(vgjV.a4J);\n            System.out.println(vgjV.a4J);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("a4J").getReference()));
        assertEquals(2, accesses.size());
    }

    @Test
    public void test142() {
        CtClass<?> clazz = Launcher.parseClass("public class P8XS_L<T> {\n    T t;\n    T bP;\n        public static void l {\n            P8XS_L<Integer> M = new P8XS_L<>();\n            M.t = -1904;\n            M.t = -3020;\n            System.out.println(M.t);\n            M.t = -2258;\n            M.t = -4173;\n        }\n        public static void a {\n            P8XS_L<String> A = new P8XS_L<>();\n            A.bP += \"jqX\";\n        }\n        public static void p {\n            P8XS_L<Boolean> L2 = new P8XS_L<>();\n            L2.bP = false;\n            L2.bP = !L2.bP;\n            L2.bP = !L2.bP;\n            L2.bP = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("t").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test143() {
        CtClass<?> clazz = Launcher.parseClass("public class S<T> {\n    T q;\n    T pBl;\n    T u;\n        public static void Jr {\n            S<Boolean> Q = new S<>();\n            Q.pBl = true;\n            Q.pBl = false;\n        }\n        public static void F0 {\n            S<Integer> KyM = new S<>();\n            System.out.println(KyM.pBl);\n            KyM.pBl += -3663;\n            KyM.pBl += 964;\n            System.out.println(KyM.pBl);\n            System.out.println(KyM.pBl);\n        }\n        public static void k {\n            S<String> wH = new S<>();\n            wH.q += \"nc\";\n            wH.q += \"m\";\n            wH.q = \"v\";\n            wH.q = \"iA\";\n            wH.q = \"G0\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("pBl").getReference()));
        assertEquals(7, accesses.size());
    }

    // @Test
    // public void test144() {
    //     CtClass<?> clazz = Launcher.parseClass("public class ISA<T> {\n    T m5;\n    T O;\n    T YF1;\n    T geR;\n        public static void ly {\n            ISA<String> ztP = new ISA<>();\n            ztP.O += \"k\";\n            ztP.O += \"N\";\n            ztP.O += \"h\";\n            ztP.O += \"xgWb\";\n        }\n        public static void no {\n            ISA<String> yN = new ISA<>();\n            yN.geR = \"E7h\";\n            yN.geR += \"o\";\n            yN.geR = \"gi\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("geR").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test145() {
    //     CtClass<?> clazz = Launcher.parseClass("public class F<T> {\n    T Ub;\n    T FM;\n    T o;\n    T J;\n        public static void JhKi {\n            F<Boolean> l = new F<>();\n            l.FM = !l.FM;\n            l.FM = !l.FM;\n            System.out.println(l.FM);\n            System.out.println(l.FM);\n            l.FM = !l.FM;\n            System.out.println(l.FM);\n        }\n        public static void U {\n            F<String> N = new F<>();\n            System.out.println(N.J);\n            System.out.println(N.J);\n            N.J = \"h\";\n            System.out.println(N.J);\n            N.J = \"z\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("J").getReference()));
    //     assertEquals(2, accesses.size());
    // }

    // @Test
    // public void test146() {
    //     CtClass<?> clazz = Launcher.parseClass("public class N<T> {\n    T NcC;\n    T f;\n    T B;\n    T BNr;\n        public static void Rr {\n            N<String> j = new N<>();\n            j.f += \"xb\";\n            j.f += \"XI\";\n            System.out.println(j.f);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("f").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    // @Test
    // public void test147() {
    //     CtClass<?> clazz = Launcher.parseClass("public class j<T> {\n    T E;\n    T UgVpl7;\n    T m;\n    T OS;\n        public static void g6 {\n            j<Integer> le31m = new j<>();\n            le31m.OS = -1895;\n            le31m.OS += 353;\n            le31m.OS += 3131;\n        }\n        public static void dl {\n            j<String> fX = new j<>();\n            System.out.println(fX.m);\n            System.out.println(fX.m);\n            fX.m = \"O\";\n            fX.m += \"ed\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("m").getReference()));
    //     assertEquals(2, accesses.size());
    // }

    // @Test
    // public void test148() {
    //     CtClass<?> clazz = Launcher.parseClass("public class m<T> {\n    T t;\n    T e;\n        public static void W {\n            m<String> Q = new m<>();\n            Q.t = \"k32\";\n            Q.t += \"Co\";\n            Q.t += \"d\";\n            Q.t += \"B\";\n        }\n        public static void Sk {\n            m<String> VE = new m<>();\n            VE.e = \"s\";\n            System.out.println(VE.e);\n            VE.e += \"z\";\n            System.out.println(VE.e);\n            VE.e = \"O\";\n            VE.e = \"UO\";\n        }\n        public static void y {\n            m<String> X = new m<>();\n            X.t = \"dd\";\n            X.t = \"D\";\n            X.t += \"l\";\n            X.t = \"Khh\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("e").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test149() {
        CtClass<?> clazz = Launcher.parseClass("public class W<T> {\n    T ta;\n    T l;\n        public static void C {\n            W<Integer> BlYE = new W<>();\n            System.out.println(BlYE.l);\n            BlYE.l = 4207;\n            BlYE.l += 4039;\n            BlYE.l += -4629;\n            BlYE.l += 2888;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("l").getReference()));
        assertEquals(5, accesses.size());
    }

    @Test
    public void test150() {
        CtClass<?> clazz = Launcher.parseClass("public class j<T> {\n    T enaV;\n    T Z6;\n    T N;\n        public static void n {\n            j<Boolean> m = new j<>();\n            m.Z6 = false;\n            m.Z6 = true;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Z6").getReference()));
        assertEquals(2, accesses.size());
    }

    // @Test
    // public void test151() {
    //     CtClass<?> clazz = Launcher.parseClass("public class q6<T> {\n    T hQ;\n    T V;\n    T r;\n    T H;\n        public static void Fk {\n            q6<Integer> pDRr = new q6<>();\n            System.out.println(pDRr.r);\n        }\n        public static void S {\n            q6<Boolean> y = new q6<>();\n            System.out.println(y.r);\n            y.r = !y.r;\n        }\n        public static void Wl1 {\n            q6<String> K = new q6<>();\n            K.V = \"AJy\";\n            System.out.println(K.V);\n            K.V = \"TWK\";\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("V").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test152() {
        CtClass<?> clazz = Launcher.parseClass("public class gsXRDY<T> {\n    T M;\n    T zuHO;\n    T nF;\n    T E;\n        public static void p {\n            gsXRDY<Integer> l = new gsXRDY<>();\n            l.nF = -4595;\n        }\n        public static void NMiq {\n            gsXRDY<String> R = new gsXRDY<>();\n            R.M += \"z\";\n            R.M = \"tZI\";\n            R.M = \"i\";\n            R.M += \"U\";\n            System.out.println(R.M);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("nF").getReference()));
        assertEquals(1, accesses.size());
    }

    // @Test
    // public void test153() {
    //     CtClass<?> clazz = Launcher.parseClass("public class m_<T> {\n    T ExDf;\n    T sFR_;\n    T U;\n    T z;\n        public static void B {\n            m_<String> X = new m_<>();\n            X.ExDf += \"Y\";\n            X.ExDf += \"K0D2hO\";\n        }\n        public static void KceCxx60 {\n            m_<Integer> ksq = new m_<>();\n            ksq.ExDf += 1669;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("ExDf").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    // @Test
    // public void test154() {
    //     CtClass<?> clazz = Launcher.parseClass("public class H<T> {\n    T yVYJ;\n    T IsWx;\n        public static void X {\n            H<Boolean> nsv = new H<>();\n            nsv.IsWx = true;\n            System.out.println(nsv.IsWx);\n            nsv.IsWx = false;\n        }\n        public static void XtZOy4e {\n            H<String> QC = new H<>();\n            QC.yVYJ += \"UA\";\n            System.out.println(QC.yVYJ);\n            System.out.println(QC.yVYJ);\n            QC.yVYJ += \"Y\";\n            System.out.println(QC.yVYJ);\n            System.out.println(QC.yVYJ);\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("yVYJ").getReference()));
    //     assertEquals(0, accesses.size());
    // }

    @Test
    public void test155() {
        CtClass<?> clazz = Launcher.parseClass("public class r<T> {\n    T tI;\n    T H;\n    T Wk;\n    T Hb;\n    T J9dZ;\n        public static void f {\n            r<Integer> EJ = new r<>();\n            System.out.println(EJ.Hb);\n            EJ.Hb += -3226;\n        }\n        public static void Zya {\n            r<Integer> ehn = new r<>();\n            System.out.println(ehn.Hb);\n            System.out.println(ehn.Hb);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("Hb").getReference()));
        assertEquals(4, accesses.size());
    }

    // @Test
    // public void test156() {
    //     CtClass<?> clazz = Launcher.parseClass("public class UJ<T> {\n    T uAhwRPV;\n    T Rc;\n    T W6;\n        public static void w {\n            UJ<Boolean> y = new UJ<>();\n            y.W6 = !y.W6;\n            y.W6 = !y.W6;\n            y.W6 = !y.W6;\n        }\n        public static void a {\n            UJ<String> d = new UJ<>();\n            System.out.println(d.Rc);\n            d.Rc = \"H\";\n            d.Rc += \"DCd\";\n        }\n        public static void q {\n            UJ<Boolean> np = new UJ<>();\n            np.W6 = !np.W6;\n            System.out.println(np.W6);\n            np.W6 = true;\n            System.out.println(np.W6);\n            np.W6 = !np.W6;\n            np.W6 = true;\n        }\n}");
    //     List<CtVariableAccess<?>> accesses =
    //         clazz.getElements(new VariableAccessFilter<>(clazz.getField("Rc").getReference()));
    //     assertEquals(1, accesses.size());
    // }

    @Test
    public void test157() {
        CtClass<?> clazz = Launcher.parseClass("public class P<T> {\n    T p5;\n    T t;\n    T TuT;\n    T o;\n    T W;\n        public static void J3 {\n            P<Boolean> sqI = new P<>();\n            sqI.t = !sqI.t;\n            System.out.println(sqI.t);\n            sqI.t = !sqI.t;\n            sqI.t = !sqI.t;\n            System.out.println(sqI.t);\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("t").getReference()));
        assertEquals(8, accesses.size());
    }

    @Test
    public void test158() {
        CtClass<?> clazz = Launcher.parseClass("public class Pye<T> {\n    T nD5;\n    T c;\n    T n;\n        public static void M {\n            Pye<String> jQ = new Pye<>();\n            jQ.c += \"LoybTtq5\";\n        }\n        public static void XVr {\n            Pye<Boolean> Hf = new Pye<>();\n            Hf.nD5 = true;\n            Hf.nD5 = false;\n        }\n        public static void gA {\n            Pye<String> aE7p = new Pye<>();\n            aE7p.c = \"K\";\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("nD5").getReference()));
        assertEquals(2, accesses.size());
    }

    @Test
    public void test159() {
        CtClass<?> clazz = Launcher.parseClass("public class P<T> {\n    T zB;\n    T R;\n        public static void ZB {\n            P<Integer> Z = new P<>();\n            Z.zB += -1331;\n            System.out.println(Z.zB);\n            Z.zB += 3952;\n        }\n        public static void h {\n            P<String> A = new P<>();\n            System.out.println(A.zB);\n            System.out.println(A.zB);\n        }\n        public static void Y {\n            P<Boolean> SA = new P<>();\n            SA.R = !SA.R;\n            SA.R = !SA.R;\n            SA.R = false;\n            SA.R = !SA.R;\n            System.out.println(SA.R);\n            SA.R = !SA.R;\n        }\n}");
        List<CtVariableAccess<?>> accesses =
            clazz.getElements(new VariableAccessFilter<>(clazz.getField("R").getReference()));
        assertEquals(10, accesses.size());
    }
}

