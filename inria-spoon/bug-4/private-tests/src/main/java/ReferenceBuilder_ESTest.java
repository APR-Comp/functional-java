import spoon.Launcher;
import spoon.refactoring.Refactoring;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtArrayTypeReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.reflect.visitor.filter.VariableAccessFilter;
import spoon.support.compiler.VirtualFile;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReferenceBuilder_ESTest {
    @Test
    public void test000() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class Z {\n    public String[] qWPnb = new String[356];\n    public Z yW;\n    public static void main(String[] args) {\n            Z CZ8ub = new Z();\n            CZ8ub.yW = new Z();\n            int a = CZ8ub.yW.qWPnb.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(4, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(3).getDeclaringType());
    }

    @Test
    public void test001() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class B {\n    public String[] HC = new String[389];\n    public B Jo;\n    public static void main(String[] args) {\n            B D = new B();\n            D.Jo = new B();\n            D.Jo.Jo = new B();\n            int b6 = D.Jo.Jo.HC.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(7, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(6).getDeclaringType());
    }

    @Test
    public void test002() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class sv {\n    public String[] T = new String[466];\n    public sv B;\n    public static void main(String[] args) {\n            sv Qs = new sv();\n            Qs.B = new sv();\n            Qs.B.B = new sv();\n            Qs.B.B.B = new sv();\n            int F = Qs.B.B.B.T.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(11, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(10).getDeclaringType());
    }

    @Test
    public void test003() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class zl4 {\n    public String[] R = new String[201];\n    public zl4 fGk;\n    public static void main(String[] args) {\n            zl4 xbt = new zl4();\n            xbt.fGk = new zl4();\n            xbt.fGk.fGk = new zl4();\n            xbt.fGk.fGk.fGk = new zl4();\n            xbt.fGk.fGk.fGk.fGk = new zl4();\n            int N = xbt.fGk.fGk.fGk.fGk.R.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(16, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(15).getDeclaringType());
    }

    @Test
    public void test004() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class k {\n    public String[] a = new String[280];\n    public k I;\n    public static void main(String[] args) {\n            k ow = new k();\n            ow.I = new k();\n            ow.I.I = new k();\n            ow.I.I.I = new k();\n            ow.I.I.I.I = new k();\n            ow.I.I.I.I.I = new k();\n            int K6J = ow.I.I.I.I.I.a.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(22, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(21).getDeclaringType());
    }

    @Test
    public void test005() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class V {\n    public String[] i = new String[313];\n    public V J83JG0wI;\n    public static void main(String[] args) {\n            V vb = new V();\n            vb.J83JG0wI = new V();\n            vb.J83JG0wI.J83JG0wI = new V();\n            vb.J83JG0wI.J83JG0wI.J83JG0wI = new V();\n            vb.J83JG0wI.J83JG0wI.J83JG0wI.J83JG0wI = new V();\n            vb.J83JG0wI.J83JG0wI.J83JG0wI.J83JG0wI.J83JG0wI = new V();\n            vb.J83JG0wI.J83JG0wI.J83JG0wI.J83JG0wI.J83JG0wI.J83JG0wI = new V();\n            int OLf = vb.J83JG0wI.J83JG0wI.J83JG0wI.J83JG0wI.J83JG0wI.J83JG0wI.i.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(29, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(28).getDeclaringType());
    }

    @Test
    public void test006() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class q8 {\n    public String[] f = new String[150];\n    public q8 CWrNsk8r;\n    public static void main(String[] args) {\n            q8 D = new q8();\n            D.CWrNsk8r = new q8();\n            D.CWrNsk8r.CWrNsk8r = new q8();\n            D.CWrNsk8r.CWrNsk8r.CWrNsk8r = new q8();\n            D.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r = new q8();\n            D.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r = new q8();\n            D.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r = new q8();\n            D.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r = new q8();\n            int Fbvmq = D.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r.CWrNsk8r.f.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(37, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(36).getDeclaringType());
    }

    @Test
    public void test007() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class M_bc {\n    public String[] kG = new String[500];\n    public M_bc I;\n    public static void main(String[] args) {\n            M_bc O = new M_bc();\n            O.I = new M_bc();\n            O.I.I = new M_bc();\n            O.I.I.I = new M_bc();\n            O.I.I.I.I = new M_bc();\n            O.I.I.I.I.I = new M_bc();\n            O.I.I.I.I.I.I = new M_bc();\n            O.I.I.I.I.I.I.I = new M_bc();\n            O.I.I.I.I.I.I.I.I = new M_bc();\n            int HH = O.I.I.I.I.I.I.I.I.kG.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(46, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(45).getDeclaringType());
    }

    @Test
    public void test008() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class ZOV9d26 {\n    public String[] VKa = new String[111];\n    public ZOV9d26 c;\n    public static void main(String[] args) {\n            ZOV9d26 K0 = new ZOV9d26();\n            K0.c = new ZOV9d26();\n            K0.c.c = new ZOV9d26();\n            K0.c.c.c = new ZOV9d26();\n            K0.c.c.c.c = new ZOV9d26();\n            K0.c.c.c.c.c = new ZOV9d26();\n            K0.c.c.c.c.c.c = new ZOV9d26();\n            K0.c.c.c.c.c.c.c = new ZOV9d26();\n            K0.c.c.c.c.c.c.c.c = new ZOV9d26();\n            K0.c.c.c.c.c.c.c.c.c = new ZOV9d26();\n            int X = K0.c.c.c.c.c.c.c.c.c.VKa.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(56, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(55).getDeclaringType());
    }

    @Test
    public void test009() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class B {\n    public String[] FQGu = new String[9];\n    public B z;\n    public static void main(String[] args) {\n            B ku = new B();\n            ku.z = new B();\n            ku.z.z = new B();\n            ku.z.z.z = new B();\n            ku.z.z.z.z = new B();\n            ku.z.z.z.z.z = new B();\n            ku.z.z.z.z.z.z = new B();\n            ku.z.z.z.z.z.z.z = new B();\n            ku.z.z.z.z.z.z.z.z = new B();\n            ku.z.z.z.z.z.z.z.z.z = new B();\n            ku.z.z.z.z.z.z.z.z.z.z = new B();\n            int K = ku.z.z.z.z.z.z.z.z.z.z.FQGu.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(67, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(66).getDeclaringType());
    }

    @Test
    public void test010() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class y {\n    public String[] w = new String[393];\n    public y R;\n    public static void main(String[] args) {\n            y IUi6 = new y();\n            IUi6.R = new y();\n            IUi6.R.R = new y();\n            IUi6.R.R.R = new y();\n            IUi6.R.R.R.R = new y();\n            IUi6.R.R.R.R.R = new y();\n            IUi6.R.R.R.R.R.R = new y();\n            IUi6.R.R.R.R.R.R.R = new y();\n            IUi6.R.R.R.R.R.R.R.R = new y();\n            IUi6.R.R.R.R.R.R.R.R.R = new y();\n            IUi6.R.R.R.R.R.R.R.R.R.R = new y();\n            IUi6.R.R.R.R.R.R.R.R.R.R.R = new y();\n            int r = IUi6.R.R.R.R.R.R.R.R.R.R.R.w.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(79, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(78).getDeclaringType());
    }

    @Test
    public void test011() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class qvp {\n    public String[] T = new String[394];\n    public qvp i;\n    public static void main(String[] args) {\n            qvp gA3 = new qvp();\n            gA3.i = new qvp();\n            gA3.i.i = new qvp();\n            gA3.i.i.i = new qvp();\n            gA3.i.i.i.i = new qvp();\n            gA3.i.i.i.i.i = new qvp();\n            gA3.i.i.i.i.i.i = new qvp();\n            gA3.i.i.i.i.i.i.i = new qvp();\n            gA3.i.i.i.i.i.i.i.i = new qvp();\n            gA3.i.i.i.i.i.i.i.i.i = new qvp();\n            gA3.i.i.i.i.i.i.i.i.i.i = new qvp();\n            gA3.i.i.i.i.i.i.i.i.i.i.i = new qvp();\n            gA3.i.i.i.i.i.i.i.i.i.i.i.i = new qvp();\n            int j = gA3.i.i.i.i.i.i.i.i.i.i.i.i.T.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(92, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(91).getDeclaringType());
    }

    @Test
    public void test012() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class yJf {\n    public String[] x = new String[58];\n    public yJf K;\n    public static void main(String[] args) {\n            yJf D = new yJf();\n            D.K = new yJf();\n            D.K.K = new yJf();\n            D.K.K.K = new yJf();\n            D.K.K.K.K = new yJf();\n            D.K.K.K.K.K = new yJf();\n            D.K.K.K.K.K.K = new yJf();\n            D.K.K.K.K.K.K.K = new yJf();\n            D.K.K.K.K.K.K.K.K = new yJf();\n            D.K.K.K.K.K.K.K.K.K = new yJf();\n            D.K.K.K.K.K.K.K.K.K.K = new yJf();\n            D.K.K.K.K.K.K.K.K.K.K.K = new yJf();\n            D.K.K.K.K.K.K.K.K.K.K.K.K = new yJf();\n            D.K.K.K.K.K.K.K.K.K.K.K.K.K = new yJf();\n            int g = D.K.K.K.K.K.K.K.K.K.K.K.K.K.x.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(106, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(105).getDeclaringType());
    }

    @Test
    public void test013() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class mLhRV {\n    public String[] B = new String[277];\n    public mLhRV y;\n    public static void main(String[] args) {\n            mLhRV s = new mLhRV();\n            s.y = new mLhRV();\n            s.y.y = new mLhRV();\n            s.y.y.y = new mLhRV();\n            s.y.y.y.y = new mLhRV();\n            s.y.y.y.y.y = new mLhRV();\n            s.y.y.y.y.y.y = new mLhRV();\n            s.y.y.y.y.y.y.y = new mLhRV();\n            s.y.y.y.y.y.y.y.y = new mLhRV();\n            s.y.y.y.y.y.y.y.y.y = new mLhRV();\n            s.y.y.y.y.y.y.y.y.y.y = new mLhRV();\n            s.y.y.y.y.y.y.y.y.y.y.y = new mLhRV();\n            s.y.y.y.y.y.y.y.y.y.y.y.y = new mLhRV();\n            s.y.y.y.y.y.y.y.y.y.y.y.y.y = new mLhRV();\n            s.y.y.y.y.y.y.y.y.y.y.y.y.y.y = new mLhRV();\n            int Tgua = s.y.y.y.y.y.y.y.y.y.y.y.y.y.y.B.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(121, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(120).getDeclaringType());
    }

    @Test
    public void test014() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class uue {\n    public String[] M = new String[456];\n    public uue hY;\n    public static void main(String[] args) {\n            uue I = new uue();\n            I.hY = new uue();\n            I.hY.hY = new uue();\n            I.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY = new uue();\n            I.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY = new uue();\n            int E = I.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.hY.M.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(137, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(136).getDeclaringType());
    }

    @Test
    public void test015() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class f {\n    public String[] Potl2 = new String[296];\n    public f tg;\n    public static void main(String[] args) {\n            f Z = new f();\n            Z.tg = new f();\n            Z.tg.tg = new f();\n            Z.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg = new f();\n            Z.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg = new f();\n            int pZe3eaYE = Z.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.tg.Potl2.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(154, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(153).getDeclaringType());
    }

    @Test
    public void test016() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class e {\n    public String[] QXj = new String[470];\n    public e uT;\n    public static void main(String[] args) {\n            e M5I = new e();\n            M5I.uT = new e();\n            M5I.uT.uT = new e();\n            M5I.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT = new e();\n            M5I.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT = new e();\n            int c = M5I.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.uT.QXj.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(172, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(171).getDeclaringType());
    }

    @Test
    public void test017() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class J {\n    public String[] V = new String[24];\n    public J nB;\n    public static void main(String[] args) {\n            J T = new J();\n            T.nB = new J();\n            T.nB.nB = new J();\n            T.nB.nB.nB = new J();\n            T.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            T.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB = new J();\n            int pe = T.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.nB.V.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(191, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(190).getDeclaringType());
    }

    @Test
    public void test018() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class JC {\n    public String[] D1qY = new String[9];\n    public JC A;\n    public static void main(String[] args) {\n            JC d = new JC();\n            d.A = new JC();\n            d.A.A = new JC();\n            d.A.A.A = new JC();\n            d.A.A.A.A = new JC();\n            d.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new JC();\n            d.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new JC();\n            int Li_ = d.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.D1qY.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(211, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(210).getDeclaringType());
    }

    @Test
    public void test019() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class l {\n    public String[] ol = new String[471];\n    public l G;\n    public static void main(String[] args) {\n            l C = new l();\n            C.G = new l();\n            C.G.G = new l();\n            C.G.G.G = new l();\n            C.G.G.G.G = new l();\n            C.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new l();\n            C.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new l();\n            int O = C.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.ol.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(232, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(231).getDeclaringType());
    }

    @Test
    public void test020() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class v {\n    public String[] U = new String[112];\n    public v r;\n    public static void main(String[] args) {\n            v d = new v();\n            d.r = new v();\n            d.r.r = new v();\n            d.r.r.r = new v();\n            d.r.r.r.r = new v();\n            d.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r = new v();\n            d.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r = new v();\n            int W = d.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.r.U.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(254, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(253).getDeclaringType());
    }

    @Test
    public void test021() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class nSJS {\n    public String[] D = new String[491];\n    public nSJS h;\n    public static void main(String[] args) {\n            nSJS G = new nSJS();\n            G.h = new nSJS();\n            G.h.h = new nSJS();\n            G.h.h.h = new nSJS();\n            G.h.h.h.h = new nSJS();\n            G.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            G.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new nSJS();\n            int lBK = G.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.D.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(277, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(276).getDeclaringType());
    }

    @Test
    public void test022() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class I {\n    public String[] c = new String[321];\n    public I f;\n    public static void main(String[] args) {\n            I g6_X = new I();\n            g6_X.f = new I();\n            g6_X.f.f = new I();\n            g6_X.f.f.f = new I();\n            g6_X.f.f.f.f = new I();\n            g6_X.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f = new I();\n            int Q = g6_X.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.f.c.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(301, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(300).getDeclaringType());
    }

    @Test
    public void test023() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class zuN {\n    public String[] nM = new String[142];\n    public zuN h;\n    public static void main(String[] args) {\n            zuN pJm = new zuN();\n            pJm.h = new zuN();\n            pJm.h.h = new zuN();\n            pJm.h.h.h = new zuN();\n            pJm.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h = new zuN();\n            int LO = pJm.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.h.nM.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(326, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(325).getDeclaringType());
    }

    @Test
    public void test024() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class nj {\n    public String[] rWR3 = new String[251];\n    public nj k;\n    public static void main(String[] args) {\n            nj A = new nj();\n            A.k = new nj();\n            A.k.k = new nj();\n            A.k.k.k = new nj();\n            A.k.k.k.k = new nj();\n            A.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k = new nj();\n            int X4s = A.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.k.rWR3.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(352, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(351).getDeclaringType());
    }

    @Test
    public void test025() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class IR {\n    public String[] PGZG = new String[0];\n    public IR W;\n    public static void main(String[] args) {\n            IR hCIY = new IR();\n            hCIY.W = new IR();\n            hCIY.W.W = new IR();\n            hCIY.W.W.W = new IR();\n            hCIY.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W = new IR();\n            int KP = hCIY.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.W.PGZG.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(379, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(378).getDeclaringType());
    }

    @Test
    public void test026() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class O {\n    public String[] V = new String[479];\n    public O G71;\n    public static void main(String[] args) {\n            O t = new O();\n            t.G71 = new O();\n            t.G71.G71 = new O();\n            t.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71 = new O();\n            int C = t.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.G71.V.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(407, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(406).getDeclaringType());
    }

    @Test
    public void test027() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class zN {\n    public String[] U = new String[322];\n    public zN VV9;\n    public static void main(String[] args) {\n            zN bOX = new zN();\n            bOX.VV9 = new zN();\n            bOX.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9 = new zN();\n            int Yl = bOX.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.VV9.U.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(436, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(435).getDeclaringType());
    }

    @Test
    public void test028() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class w {\n    public String[] Z = new String[77];\n    public w R;\n    public static void main(String[] args) {\n            w D = new w();\n            D.R = new w();\n            D.R.R = new w();\n            D.R.R.R = new w();\n            D.R.R.R.R = new w();\n            D.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R = new w();\n            int FGGLwCG = D.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.R.Z.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(466, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(465).getDeclaringType());
    }

    @Test
    public void test029() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class z {\n    public String[] r = new String[121];\n    public z n;\n    public static void main(String[] args) {\n            z ve = new z();\n            ve.n = new z();\n            ve.n.n = new z();\n            ve.n.n.n = new z();\n            ve.n.n.n.n = new z();\n            ve.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n = new z();\n            int H = ve.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.n.r.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(497, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(496).getDeclaringType());
    }

    @Test
    public void test030() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class Vt {\n    public String[] T = new String[200];\n    public Vt JN;\n    public static void main(String[] args) {\n            Vt JE = new Vt();\n            JE.JN = new Vt();\n            JE.JN.JN = new Vt();\n            JE.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN = new Vt();\n            int NoN = JE.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.JN.T.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(529, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(528).getDeclaringType());
    }

    @Test
    public void test031() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class zB {\n    public String[] p = new String[297];\n    public zB mU_;\n    public static void main(String[] args) {\n            zB U8HXTt = new zB();\n            U8HXTt.mU_ = new zB();\n            U8HXTt.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_ = new zB();\n            int pn = U8HXTt.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.mU_.p.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(562, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(561).getDeclaringType());
    }

    @Test
    public void test032() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class lZ {\n    public String[] WcH = new String[60];\n    public lZ NQ;\n    public static void main(String[] args) {\n            lZ N = new lZ();\n            N.NQ = new lZ();\n            N.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ = new lZ();\n            int goy = N.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.NQ.WcH.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(596, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(595).getDeclaringType());
    }

    @Test
    public void test033() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class vh {\n    public String[] fZEy = new String[204];\n    public vh s;\n    public static void main(String[] args) {\n            vh k = new vh();\n            k.s = new vh();\n            k.s.s = new vh();\n            k.s.s.s = new vh();\n            k.s.s.s.s = new vh();\n            k.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s = new vh();\n            int W = k.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.s.fZEy.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(631, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.String");
        assertEquals(arrayRef, elements.get(630).getDeclaringType());
    }

    @Test
    public void test034() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class a4 {\n    public Integer[] d = new Integer[155];\n    public a4 qD;\n    public static void main(String[] args) {\n            a4 ad = new a4();\n            ad.qD = new a4();\n            int ir = ad.qD.d.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(4, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(3).getDeclaringType());
    }

    @Test
    public void test035() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class R {\n    public Integer[] m = new Integer[328];\n    public R yr;\n    public static void main(String[] args) {\n            R Od = new R();\n            Od.yr = new R();\n            Od.yr.yr = new R();\n            int Y = Od.yr.yr.m.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(7, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(6).getDeclaringType());
    }

    @Test
    public void test036() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class H {\n    public Integer[] w = new Integer[470];\n    public H I4;\n    public static void main(String[] args) {\n            H Qr = new H();\n            Qr.I4 = new H();\n            Qr.I4.I4 = new H();\n            Qr.I4.I4.I4 = new H();\n            int U = Qr.I4.I4.I4.w.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(11, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(10).getDeclaringType());
    }

    @Test
    public void test037() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class B {\n    public Integer[] d = new Integer[460];\n    public B GxuIQz;\n    public static void main(String[] args) {\n            B CHq = new B();\n            CHq.GxuIQz = new B();\n            CHq.GxuIQz.GxuIQz = new B();\n            CHq.GxuIQz.GxuIQz.GxuIQz = new B();\n            CHq.GxuIQz.GxuIQz.GxuIQz.GxuIQz = new B();\n            int f3UVYh = CHq.GxuIQz.GxuIQz.GxuIQz.GxuIQz.d.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(16, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(15).getDeclaringType());
    }

    @Test
    public void test038() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class g0J {\n    public Integer[] L = new Integer[149];\n    public g0J I_;\n    public static void main(String[] args) {\n            g0J Vxuwe0 = new g0J();\n            Vxuwe0.I_ = new g0J();\n            Vxuwe0.I_.I_ = new g0J();\n            Vxuwe0.I_.I_.I_ = new g0J();\n            Vxuwe0.I_.I_.I_.I_ = new g0J();\n            Vxuwe0.I_.I_.I_.I_.I_ = new g0J();\n            int ItrV = Vxuwe0.I_.I_.I_.I_.I_.L.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(22, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(21).getDeclaringType());
    }

    @Test
    public void test039() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class jUu {\n    public Integer[] C = new Integer[496];\n    public jUu Ex;\n    public static void main(String[] args) {\n            jUu y = new jUu();\n            y.Ex = new jUu();\n            y.Ex.Ex = new jUu();\n            y.Ex.Ex.Ex = new jUu();\n            y.Ex.Ex.Ex.Ex = new jUu();\n            y.Ex.Ex.Ex.Ex.Ex = new jUu();\n            y.Ex.Ex.Ex.Ex.Ex.Ex = new jUu();\n            int f = y.Ex.Ex.Ex.Ex.Ex.Ex.C.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(29, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(28).getDeclaringType());
    }

    @Test
    public void test040() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class K {\n    public Integer[] q = new Integer[173];\n    public K S;\n    public static void main(String[] args) {\n            K x = new K();\n            x.S = new K();\n            x.S.S = new K();\n            x.S.S.S = new K();\n            x.S.S.S.S = new K();\n            x.S.S.S.S.S = new K();\n            x.S.S.S.S.S.S = new K();\n            x.S.S.S.S.S.S.S = new K();\n            int Z = x.S.S.S.S.S.S.S.q.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(37, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(36).getDeclaringType());
    }

    @Test
    public void test041() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class I {\n    public Integer[] bRi = new Integer[480];\n    public I l;\n    public static void main(String[] args) {\n            I U = new I();\n            U.l = new I();\n            U.l.l = new I();\n            U.l.l.l = new I();\n            U.l.l.l.l = new I();\n            U.l.l.l.l.l = new I();\n            U.l.l.l.l.l.l = new I();\n            U.l.l.l.l.l.l.l = new I();\n            U.l.l.l.l.l.l.l.l = new I();\n            int ZI = U.l.l.l.l.l.l.l.l.bRi.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(46, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(45).getDeclaringType());
    }

    @Test
    public void test042() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class f {\n    public Integer[] Y = new Integer[261];\n    public f P;\n    public static void main(String[] args) {\n            f Bx = new f();\n            Bx.P = new f();\n            Bx.P.P = new f();\n            Bx.P.P.P = new f();\n            Bx.P.P.P.P = new f();\n            Bx.P.P.P.P.P = new f();\n            Bx.P.P.P.P.P.P = new f();\n            Bx.P.P.P.P.P.P.P = new f();\n            Bx.P.P.P.P.P.P.P.P = new f();\n            Bx.P.P.P.P.P.P.P.P.P = new f();\n            int F = Bx.P.P.P.P.P.P.P.P.P.Y.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(56, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(55).getDeclaringType());
    }

    @Test
    public void test043() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class pR6 {\n    public Integer[] Ze = new Integer[394];\n    public pR6 qa;\n    public static void main(String[] args) {\n            pR6 y = new pR6();\n            y.qa = new pR6();\n            y.qa.qa = new pR6();\n            y.qa.qa.qa = new pR6();\n            y.qa.qa.qa.qa = new pR6();\n            y.qa.qa.qa.qa.qa = new pR6();\n            y.qa.qa.qa.qa.qa.qa = new pR6();\n            y.qa.qa.qa.qa.qa.qa.qa = new pR6();\n            y.qa.qa.qa.qa.qa.qa.qa.qa = new pR6();\n            y.qa.qa.qa.qa.qa.qa.qa.qa.qa = new pR6();\n            y.qa.qa.qa.qa.qa.qa.qa.qa.qa.qa = new pR6();\n            int FN = y.qa.qa.qa.qa.qa.qa.qa.qa.qa.qa.Ze.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(67, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(66).getDeclaringType());
    }

    @Test
    public void test044() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class B2 {\n    public Integer[] at = new Integer[262];\n    public B2 Ph;\n    public static void main(String[] args) {\n            B2 VX = new B2();\n            VX.Ph = new B2();\n            VX.Ph.Ph = new B2();\n            VX.Ph.Ph.Ph = new B2();\n            VX.Ph.Ph.Ph.Ph = new B2();\n            VX.Ph.Ph.Ph.Ph.Ph = new B2();\n            VX.Ph.Ph.Ph.Ph.Ph.Ph = new B2();\n            VX.Ph.Ph.Ph.Ph.Ph.Ph.Ph = new B2();\n            VX.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph = new B2();\n            VX.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph = new B2();\n            VX.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph = new B2();\n            VX.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph = new B2();\n            int K = VX.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph.Ph.at.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(79, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(78).getDeclaringType());
    }

    @Test
    public void test045() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class I {\n    public Integer[] HO = new Integer[500];\n    public I CGi;\n    public static void main(String[] args) {\n            I ka = new I();\n            ka.CGi = new I();\n            ka.CGi.CGi = new I();\n            ka.CGi.CGi.CGi = new I();\n            ka.CGi.CGi.CGi.CGi = new I();\n            ka.CGi.CGi.CGi.CGi.CGi = new I();\n            ka.CGi.CGi.CGi.CGi.CGi.CGi = new I();\n            ka.CGi.CGi.CGi.CGi.CGi.CGi.CGi = new I();\n            ka.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi = new I();\n            ka.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi = new I();\n            ka.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi = new I();\n            ka.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi = new I();\n            ka.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi = new I();\n            int V = ka.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.CGi.HO.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(92, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(91).getDeclaringType());
    }

    @Test
    public void test046() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class Qf {\n    public Integer[] aDYV = new Integer[247];\n    public Qf XD;\n    public static void main(String[] args) {\n            Qf wjl = new Qf();\n            wjl.XD = new Qf();\n            wjl.XD.XD = new Qf();\n            wjl.XD.XD.XD = new Qf();\n            wjl.XD.XD.XD.XD = new Qf();\n            wjl.XD.XD.XD.XD.XD = new Qf();\n            wjl.XD.XD.XD.XD.XD.XD = new Qf();\n            wjl.XD.XD.XD.XD.XD.XD.XD = new Qf();\n            wjl.XD.XD.XD.XD.XD.XD.XD.XD = new Qf();\n            wjl.XD.XD.XD.XD.XD.XD.XD.XD.XD = new Qf();\n            wjl.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD = new Qf();\n            wjl.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD = new Qf();\n            wjl.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD = new Qf();\n            wjl.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD = new Qf();\n            int x = wjl.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD.XD.aDYV.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(106, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(105).getDeclaringType());
    }

    @Test
    public void test047() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class AGA {\n    public Integer[] B6T = new Integer[46];\n    public AGA z;\n    public static void main(String[] args) {\n            AGA e9UqX = new AGA();\n            e9UqX.z = new AGA();\n            e9UqX.z.z = new AGA();\n            e9UqX.z.z.z = new AGA();\n            e9UqX.z.z.z.z = new AGA();\n            e9UqX.z.z.z.z.z = new AGA();\n            e9UqX.z.z.z.z.z.z = new AGA();\n            e9UqX.z.z.z.z.z.z.z = new AGA();\n            e9UqX.z.z.z.z.z.z.z.z = new AGA();\n            e9UqX.z.z.z.z.z.z.z.z.z = new AGA();\n            e9UqX.z.z.z.z.z.z.z.z.z.z = new AGA();\n            e9UqX.z.z.z.z.z.z.z.z.z.z.z = new AGA();\n            e9UqX.z.z.z.z.z.z.z.z.z.z.z.z = new AGA();\n            e9UqX.z.z.z.z.z.z.z.z.z.z.z.z.z = new AGA();\n            e9UqX.z.z.z.z.z.z.z.z.z.z.z.z.z.z = new AGA();\n            int l = e9UqX.z.z.z.z.z.z.z.z.z.z.z.z.z.z.B6T.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(121, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(120).getDeclaringType());
    }

    @Test
    public void test048() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class JB8 {\n    public Integer[] g = new Integer[135];\n    public JB8 RQ;\n    public static void main(String[] args) {\n            JB8 RE = new JB8();\n            RE.RQ = new JB8();\n            RE.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ = new JB8();\n            RE.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ = new JB8();\n            int T = RE.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.RQ.g.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(137, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(136).getDeclaringType());
    }

    @Test
    public void test049() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class k {\n    public Integer[] A = new Integer[414];\n    public k IF;\n    public static void main(String[] args) {\n            k I = new k();\n            I.IF = new k();\n            I.IF.IF = new k();\n            I.IF.IF.IF = new k();\n            I.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF = new k();\n            I.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF = new k();\n            int Y = I.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.IF.A.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(154, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(153).getDeclaringType());
    }

    @Test
    public void test050() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class gU {\n    public Integer[] TI = new Integer[431];\n    public gU t;\n    public static void main(String[] args) {\n            gU grpiA = new gU();\n            grpiA.t = new gU();\n            grpiA.t.t = new gU();\n            grpiA.t.t.t = new gU();\n            grpiA.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new gU();\n            grpiA.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new gU();\n            int M = grpiA.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.TI.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(172, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(171).getDeclaringType());
    }

    @Test
    public void test051() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class M {\n    public Integer[] AE = new Integer[92];\n    public M rFEl;\n    public static void main(String[] args) {\n            M V = new M();\n            V.rFEl = new M();\n            V.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl = new M();\n            int Sju = V.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.rFEl.AE.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(191, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(190).getDeclaringType());
    }

    @Test
    public void test052() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class Z {\n    public Integer[] nFhi = new Integer[25];\n    public Z oI;\n    public static void main(String[] args) {\n            Z Khm = new Z();\n            Khm.oI = new Z();\n            Khm.oI.oI = new Z();\n            Khm.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI = new Z();\n            int Q = Khm.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.oI.nFhi.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(211, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(210).getDeclaringType());
    }

    @Test
    public void test053() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class ooO {\n    public Integer[] vU = new Integer[73];\n    public ooO bwq;\n    public static void main(String[] args) {\n            ooO R = new ooO();\n            R.bwq = new ooO();\n            R.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq = new ooO();\n            int wU = R.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.bwq.vU.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(232, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(231).getDeclaringType());
    }

    @Test
    public void test054() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class xi {\n    public Integer[] x = new Integer[48];\n    public xi O;\n    public static void main(String[] args) {\n            xi Ra = new xi();\n            Ra.O = new xi();\n            Ra.O.O = new xi();\n            Ra.O.O.O = new xi();\n            Ra.O.O.O.O = new xi();\n            Ra.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            Ra.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O = new xi();\n            int u = Ra.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.O.x.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(254, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(253).getDeclaringType());
    }

    @Test
    public void test055() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class U {\n    public Integer[] M = new Integer[371];\n    public U rR;\n    public static void main(String[] args) {\n            U HA = new U();\n            HA.rR = new U();\n            HA.rR.rR = new U();\n            HA.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR = new U();\n            int zo = HA.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.rR.M.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(277, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(276).getDeclaringType());
    }

    @Test
    public void test056() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class l5IIHig {\n    public Integer[] e = new Integer[370];\n    public l5IIHig IJ;\n    public static void main(String[] args) {\n            l5IIHig G = new l5IIHig();\n            G.IJ = new l5IIHig();\n            G.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ = new l5IIHig();\n            int b = G.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.IJ.e.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(301, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(300).getDeclaringType());
    }

    @Test
    public void test057() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class jL4 {\n    public Integer[] E = new Integer[195];\n    public jL4 X4j;\n    public static void main(String[] args) {\n            jL4 C_ = new jL4();\n            C_.X4j = new jL4();\n            C_.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j = new jL4();\n            int rR = C_.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.X4j.E.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(326, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(325).getDeclaringType());
    }

    @Test
    public void test058() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class I {\n    public Integer[] PV = new Integer[27];\n    public I gXR7z;\n    public static void main(String[] args) {\n            I gc = new I();\n            gc.gXR7z = new I();\n            gc.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z = new I();\n            int Sc = gc.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.gXR7z.PV.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(352, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(351).getDeclaringType());
    }

    @Test
    public void test059() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class J_ {\n    public Integer[] PE = new Integer[318];\n    public J_ p;\n    public static void main(String[] args) {\n            J_ p8kc = new J_();\n            p8kc.p = new J_();\n            p8kc.p.p = new J_();\n            p8kc.p.p.p = new J_();\n            p8kc.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new J_();\n            int uUQ = p8kc.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.PE.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(379, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(378).getDeclaringType());
    }

    @Test
    public void test060() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class NyW {\n    public Integer[] C = new Integer[265];\n    public NyW p;\n    public static void main(String[] args) {\n            NyW jRGP = new NyW();\n            jRGP.p = new NyW();\n            jRGP.p.p = new NyW();\n            jRGP.p.p.p = new NyW();\n            jRGP.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p = new NyW();\n            int v = jRGP.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.C.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(407, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(406).getDeclaringType());
    }

    @Test
    public void test061() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class bn1 {\n    public Integer[] z = new Integer[336];\n    public bn1 g_;\n    public static void main(String[] args) {\n            bn1 p = new bn1();\n            p.g_ = new bn1();\n            p.g_.g_ = new bn1();\n            p.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_ = new bn1();\n            int D = p.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.g_.z.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(436, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(435).getDeclaringType());
    }

    @Test
    public void test062() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class mz {\n    public Integer[] Kr = new Integer[481];\n    public mz jAb;\n    public static void main(String[] args) {\n            mz ly = new mz();\n            ly.jAb = new mz();\n            ly.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb = new mz();\n            int Z = ly.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.jAb.Kr.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(466, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(465).getDeclaringType());
    }

    @Test
    public void test063() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class qz {\n    public Integer[] T = new Integer[200];\n    public qz o;\n    public static void main(String[] args) {\n            qz a = new qz();\n            a.o = new qz();\n            a.o.o = new qz();\n            a.o.o.o = new qz();\n            a.o.o.o.o = new qz();\n            a.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new qz();\n            int p = a.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.T.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(497, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(496).getDeclaringType());
    }

    @Test
    public void test064() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class v {\n    public Integer[] e = new Integer[89];\n    public v J;\n    public static void main(String[] args) {\n            v y = new v();\n            y.J = new v();\n            y.J.J = new v();\n            y.J.J.J = new v();\n            y.J.J.J.J = new v();\n            y.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J = new v();\n            int Gp = y.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.J.e.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(529, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(528).getDeclaringType());
    }

    @Test
    public void test065() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class S {\n    public Integer[] N = new Integer[60];\n    public S Iz;\n    public static void main(String[] args) {\n            S K = new S();\n            K.Iz = new S();\n            K.Iz.Iz = new S();\n            K.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz = new S();\n            int yg = K.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.Iz.N.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(562, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(561).getDeclaringType());
    }

    @Test
    public void test066() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class k {\n    public Integer[] J = new Integer[325];\n    public k u;\n    public static void main(String[] args) {\n            k C = new k();\n            C.u = new k();\n            C.u.u = new k();\n            C.u.u.u = new k();\n            C.u.u.u.u = new k();\n            C.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u = new k();\n            int Zk = C.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.u.J.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(596, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(595).getDeclaringType());
    }

    @Test
    public void test067() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class X {\n    public Integer[] f = new Integer[132];\n    public X v;\n    public static void main(String[] args) {\n            X qyD9qe = new X();\n            qyD9qe.v = new X();\n            qyD9qe.v.v = new X();\n            qyD9qe.v.v.v = new X();\n            qyD9qe.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v = new X();\n            int I = qyD9qe.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.v.f.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(631, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Integer");
        assertEquals(arrayRef, elements.get(630).getDeclaringType());
    }

    @Test
    public void test068() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class z {\n    public Boolean[] f = new Boolean[302];\n    public z eQVA;\n    public static void main(String[] args) {\n            z MI = new z();\n            MI.eQVA = new z();\n            int p = MI.eQVA.f.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(4, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(3).getDeclaringType());
    }

    @Test
    public void test069() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class z1t {\n    public Boolean[] ws0Ts = new Boolean[314];\n    public z1t N;\n    public static void main(String[] args) {\n            z1t x = new z1t();\n            x.N = new z1t();\n            x.N.N = new z1t();\n            int q = x.N.N.ws0Ts.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(7, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(6).getDeclaringType());
    }

    @Test
    public void test070() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class ui {\n    public Boolean[] O = new Boolean[324];\n    public ui h;\n    public static void main(String[] args) {\n            ui Ln = new ui();\n            Ln.h = new ui();\n            Ln.h.h = new ui();\n            Ln.h.h.h = new ui();\n            int z5 = Ln.h.h.h.O.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(11, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(10).getDeclaringType());
    }

    @Test
    public void test071() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class y {\n    public Boolean[] HT = new Boolean[390];\n    public y Uh;\n    public static void main(String[] args) {\n            y KE = new y();\n            KE.Uh = new y();\n            KE.Uh.Uh = new y();\n            KE.Uh.Uh.Uh = new y();\n            KE.Uh.Uh.Uh.Uh = new y();\n            int oOQ = KE.Uh.Uh.Uh.Uh.HT.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(16, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(15).getDeclaringType());
    }

    @Test
    public void test072() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class X {\n    public Boolean[] zg = new Boolean[275];\n    public X ibcz;\n    public static void main(String[] args) {\n            X v = new X();\n            v.ibcz = new X();\n            v.ibcz.ibcz = new X();\n            v.ibcz.ibcz.ibcz = new X();\n            v.ibcz.ibcz.ibcz.ibcz = new X();\n            v.ibcz.ibcz.ibcz.ibcz.ibcz = new X();\n            int gVB = v.ibcz.ibcz.ibcz.ibcz.ibcz.zg.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(22, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(21).getDeclaringType());
    }

    @Test
    public void test073() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class M {\n    public Boolean[] Gxx = new Boolean[397];\n    public M L;\n    public static void main(String[] args) {\n            M ed1 = new M();\n            ed1.L = new M();\n            ed1.L.L = new M();\n            ed1.L.L.L = new M();\n            ed1.L.L.L.L = new M();\n            ed1.L.L.L.L.L = new M();\n            ed1.L.L.L.L.L.L = new M();\n            int j = ed1.L.L.L.L.L.L.Gxx.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(29, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(28).getDeclaringType());
    }

    @Test
    public void test074() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class Kz {\n    public Boolean[] K = new Boolean[244];\n    public Kz zw78;\n    public static void main(String[] args) {\n            Kz bL = new Kz();\n            bL.zw78 = new Kz();\n            bL.zw78.zw78 = new Kz();\n            bL.zw78.zw78.zw78 = new Kz();\n            bL.zw78.zw78.zw78.zw78 = new Kz();\n            bL.zw78.zw78.zw78.zw78.zw78 = new Kz();\n            bL.zw78.zw78.zw78.zw78.zw78.zw78 = new Kz();\n            bL.zw78.zw78.zw78.zw78.zw78.zw78.zw78 = new Kz();\n            int YL = bL.zw78.zw78.zw78.zw78.zw78.zw78.zw78.K.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(37, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(36).getDeclaringType());
    }

    @Test
    public void test075() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class Xz {\n    public Boolean[] YLK = new Boolean[172];\n    public Xz g;\n    public static void main(String[] args) {\n            Xz x = new Xz();\n            x.g = new Xz();\n            x.g.g = new Xz();\n            x.g.g.g = new Xz();\n            x.g.g.g.g = new Xz();\n            x.g.g.g.g.g = new Xz();\n            x.g.g.g.g.g.g = new Xz();\n            x.g.g.g.g.g.g.g = new Xz();\n            x.g.g.g.g.g.g.g.g = new Xz();\n            int c = x.g.g.g.g.g.g.g.g.YLK.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(46, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(45).getDeclaringType());
    }

    @Test
    public void test076() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class IG {\n    public Boolean[] Ik = new Boolean[301];\n    public IG x5;\n    public static void main(String[] args) {\n            IG g3 = new IG();\n            g3.x5 = new IG();\n            g3.x5.x5 = new IG();\n            g3.x5.x5.x5 = new IG();\n            g3.x5.x5.x5.x5 = new IG();\n            g3.x5.x5.x5.x5.x5 = new IG();\n            g3.x5.x5.x5.x5.x5.x5 = new IG();\n            g3.x5.x5.x5.x5.x5.x5.x5 = new IG();\n            g3.x5.x5.x5.x5.x5.x5.x5.x5 = new IG();\n            g3.x5.x5.x5.x5.x5.x5.x5.x5.x5 = new IG();\n            int x = g3.x5.x5.x5.x5.x5.x5.x5.x5.x5.Ik.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(56, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(55).getDeclaringType());
    }

    @Test
    public void test077() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class c {\n    public Boolean[] X = new Boolean[316];\n    public c Y_s;\n    public static void main(String[] args) {\n            c fk = new c();\n            fk.Y_s = new c();\n            fk.Y_s.Y_s = new c();\n            fk.Y_s.Y_s.Y_s = new c();\n            fk.Y_s.Y_s.Y_s.Y_s = new c();\n            fk.Y_s.Y_s.Y_s.Y_s.Y_s = new c();\n            fk.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s = new c();\n            fk.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s = new c();\n            fk.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s = new c();\n            fk.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s = new c();\n            fk.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s = new c();\n            int riU = fk.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.Y_s.X.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(67, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(66).getDeclaringType());
    }

    @Test
    public void test078() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class d {\n    public Boolean[] t = new Boolean[420];\n    public d Z;\n    public static void main(String[] args) {\n            d Ius = new d();\n            Ius.Z = new d();\n            Ius.Z.Z = new d();\n            Ius.Z.Z.Z = new d();\n            Ius.Z.Z.Z.Z = new d();\n            Ius.Z.Z.Z.Z.Z = new d();\n            Ius.Z.Z.Z.Z.Z.Z = new d();\n            Ius.Z.Z.Z.Z.Z.Z.Z = new d();\n            Ius.Z.Z.Z.Z.Z.Z.Z.Z = new d();\n            Ius.Z.Z.Z.Z.Z.Z.Z.Z.Z = new d();\n            Ius.Z.Z.Z.Z.Z.Z.Z.Z.Z.Z = new d();\n            Ius.Z.Z.Z.Z.Z.Z.Z.Z.Z.Z.Z = new d();\n            int i0Vuk = Ius.Z.Z.Z.Z.Z.Z.Z.Z.Z.Z.Z.t.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(79, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(78).getDeclaringType());
    }

    @Test
    public void test079() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class S {\n    public Boolean[] H_ = new Boolean[259];\n    public S oi;\n    public static void main(String[] args) {\n            S h = new S();\n            h.oi = new S();\n            h.oi.oi = new S();\n            h.oi.oi.oi = new S();\n            h.oi.oi.oi.oi = new S();\n            h.oi.oi.oi.oi.oi = new S();\n            h.oi.oi.oi.oi.oi.oi = new S();\n            h.oi.oi.oi.oi.oi.oi.oi = new S();\n            h.oi.oi.oi.oi.oi.oi.oi.oi = new S();\n            h.oi.oi.oi.oi.oi.oi.oi.oi.oi = new S();\n            h.oi.oi.oi.oi.oi.oi.oi.oi.oi.oi = new S();\n            h.oi.oi.oi.oi.oi.oi.oi.oi.oi.oi.oi = new S();\n            h.oi.oi.oi.oi.oi.oi.oi.oi.oi.oi.oi.oi = new S();\n            int DdD9 = h.oi.oi.oi.oi.oi.oi.oi.oi.oi.oi.oi.oi.H_.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(92, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(91).getDeclaringType());
    }

    @Test
    public void test080() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class a {\n    public Boolean[] c5 = new Boolean[107];\n    public a a408;\n    public static void main(String[] args) {\n            a CF = new a();\n            CF.a408 = new a();\n            CF.a408.a408 = new a();\n            CF.a408.a408.a408 = new a();\n            CF.a408.a408.a408.a408 = new a();\n            CF.a408.a408.a408.a408.a408 = new a();\n            CF.a408.a408.a408.a408.a408.a408 = new a();\n            CF.a408.a408.a408.a408.a408.a408.a408 = new a();\n            CF.a408.a408.a408.a408.a408.a408.a408.a408 = new a();\n            CF.a408.a408.a408.a408.a408.a408.a408.a408.a408 = new a();\n            CF.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408 = new a();\n            CF.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408 = new a();\n            CF.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408 = new a();\n            CF.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408 = new a();\n            int uPMR = CF.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408.a408.c5.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(106, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(105).getDeclaringType());
    }

    @Test
    public void test081() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class K {\n    public Boolean[] B = new Boolean[99];\n    public K Le;\n    public static void main(String[] args) {\n            K S = new K();\n            S.Le = new K();\n            S.Le.Le = new K();\n            S.Le.Le.Le = new K();\n            S.Le.Le.Le.Le = new K();\n            S.Le.Le.Le.Le.Le = new K();\n            S.Le.Le.Le.Le.Le.Le = new K();\n            S.Le.Le.Le.Le.Le.Le.Le = new K();\n            S.Le.Le.Le.Le.Le.Le.Le.Le = new K();\n            S.Le.Le.Le.Le.Le.Le.Le.Le.Le = new K();\n            S.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le = new K();\n            S.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le = new K();\n            S.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le = new K();\n            S.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le = new K();\n            S.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le = new K();\n            int F = S.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.Le.B.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(121, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(120).getDeclaringType());
    }

    @Test
    public void test082() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class J {\n    public Boolean[] E = new Boolean[438];\n    public J V;\n    public static void main(String[] args) {\n            J XEr = new J();\n            XEr.V = new J();\n            XEr.V.V = new J();\n            XEr.V.V.V = new J();\n            XEr.V.V.V.V = new J();\n            XEr.V.V.V.V.V = new J();\n            XEr.V.V.V.V.V.V = new J();\n            XEr.V.V.V.V.V.V.V = new J();\n            XEr.V.V.V.V.V.V.V.V = new J();\n            XEr.V.V.V.V.V.V.V.V.V = new J();\n            XEr.V.V.V.V.V.V.V.V.V.V = new J();\n            XEr.V.V.V.V.V.V.V.V.V.V.V = new J();\n            XEr.V.V.V.V.V.V.V.V.V.V.V.V = new J();\n            XEr.V.V.V.V.V.V.V.V.V.V.V.V.V = new J();\n            XEr.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new J();\n            XEr.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new J();\n            int HW = XEr.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.E.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(137, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(136).getDeclaringType());
    }

    @Test
    public void test083() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class qM {\n    public Boolean[] Y5GSv = new Boolean[4];\n    public qM O3P3;\n    public static void main(String[] args) {\n            qM q = new qM();\n            q.O3P3 = new qM();\n            q.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3 = new qM();\n            int Vyv4 = q.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.O3P3.Y5GSv.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(154, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(153).getDeclaringType());
    }

    @Test
    public void test084() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class PX {\n    public Boolean[] A = new Boolean[93];\n    public PX oP;\n    public static void main(String[] args) {\n            PX W = new PX();\n            W.oP = new PX();\n            W.oP.oP = new PX();\n            W.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP = new PX();\n            W.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP = new PX();\n            int G = W.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.oP.A.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(172, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(171).getDeclaringType());
    }

    @Test
    public void test085() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class D {\n    public Boolean[] e = new Boolean[311];\n    public D A;\n    public static void main(String[] args) {\n            D c = new D();\n            c.A = new D();\n            c.A.A = new D();\n            c.A.A.A = new D();\n            c.A.A.A.A = new D();\n            c.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new D();\n            c.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A = new D();\n            int OTn = c.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.A.e.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(191, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(190).getDeclaringType());
    }

    @Test
    public void test086() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class V {\n    public Boolean[] xT = new Boolean[262];\n    public V CRxv;\n    public static void main(String[] args) {\n            V FMPJ = new V();\n            FMPJ.CRxv = new V();\n            FMPJ.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv = new V();\n            int Bt = FMPJ.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.CRxv.xT.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(211, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(210).getDeclaringType());
    }

    @Test
    public void test087() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class V {\n    public Boolean[] qYg = new Boolean[66];\n    public V G;\n    public static void main(String[] args) {\n            V s = new V();\n            s.G = new V();\n            s.G.G = new V();\n            s.G.G.G = new V();\n            s.G.G.G.G = new V();\n            s.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new V();\n            s.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G = new V();\n            int eRU = s.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.G.qYg.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(232, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(231).getDeclaringType());
    }

    @Test
    public void test088() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class JmL {\n    public Boolean[] q = new Boolean[231];\n    public JmL l4_;\n    public static void main(String[] args) {\n            JmL cAKOllZYU1os = new JmL();\n            cAKOllZYU1os.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_ = new JmL();\n            int d = cAKOllZYU1os.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.l4_.q.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(254, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(253).getDeclaringType());
    }

    @Test
    public void test089() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class hd {\n    public Boolean[] hY = new Boolean[365];\n    public hd o;\n    public static void main(String[] args) {\n            hd q = new hd();\n            q.o = new hd();\n            q.o.o = new hd();\n            q.o.o.o = new hd();\n            q.o.o.o.o = new hd();\n            q.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            q.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o = new hd();\n            int p = q.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.o.hY.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(277, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(276).getDeclaringType());
    }

    @Test
    public void test090() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class NRB {\n    public Boolean[] F = new Boolean[58];\n    public NRB l;\n    public static void main(String[] args) {\n            NRB pZr = new NRB();\n            pZr.l = new NRB();\n            pZr.l.l = new NRB();\n            pZr.l.l.l = new NRB();\n            pZr.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l = new NRB();\n            int v = pZr.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.F.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(301, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(300).getDeclaringType());
    }

    @Test
    public void test091() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class Git {\n    public Boolean[] J = new Boolean[69];\n    public Git jP;\n    public static void main(String[] args) {\n            Git kNw = new Git();\n            kNw.jP = new Git();\n            kNw.jP.jP = new Git();\n            kNw.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP = new Git();\n            int kEBw = kNw.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.jP.J.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(326, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(325).getDeclaringType());
    }

    @Test
    public void test092() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class RRIc {\n    public Boolean[] m = new Boolean[259];\n    public RRIc V;\n    public static void main(String[] args) {\n            RRIc w = new RRIc();\n            w.V = new RRIc();\n            w.V.V = new RRIc();\n            w.V.V.V = new RRIc();\n            w.V.V.V.V = new RRIc();\n            w.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V = new RRIc();\n            int Y = w.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.V.m.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(352, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(351).getDeclaringType());
    }

    @Test
    public void test093() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class v {\n    public Boolean[] l = new Boolean[453];\n    public v c;\n    public static void main(String[] args) {\n            v N = new v();\n            N.c = new v();\n            N.c.c = new v();\n            N.c.c.c = new v();\n            N.c.c.c.c = new v();\n            N.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c = new v();\n            int Zp = N.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.c.l.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(379, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(378).getDeclaringType());
    }

    @Test
    public void test094() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class o4kt {\n    public Boolean[] G = new Boolean[442];\n    public o4kt I;\n    public static void main(String[] args) {\n            o4kt C = new o4kt();\n            C.I = new o4kt();\n            C.I.I = new o4kt();\n            C.I.I.I = new o4kt();\n            C.I.I.I.I = new o4kt();\n            C.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I = new o4kt();\n            int E3B = C.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.I.G.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(407, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(406).getDeclaringType());
    }

    @Test
    public void test095() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class nP {\n    public Boolean[] MK = new Boolean[475];\n    public nP Q;\n    public static void main(String[] args) {\n            nP b4c = new nP();\n            b4c.Q = new nP();\n            b4c.Q.Q = new nP();\n            b4c.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q = new nP();\n            int xwe = b4c.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.Q.MK.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(436, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(435).getDeclaringType());
    }

    @Test
    public void test096() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class K {\n    public Boolean[] t = new Boolean[246];\n    public K Y;\n    public static void main(String[] args) {\n            K veQ = new K();\n            veQ.Y = new K();\n            veQ.Y.Y = new K();\n            veQ.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y = new K();\n            int ul = veQ.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.Y.t.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(466, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(465).getDeclaringType());
    }

    @Test
    public void test097() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class t {\n    public Boolean[] A = new Boolean[368];\n    public t ssBNw;\n    public static void main(String[] args) {\n            t Ks = new t();\n            Ks.ssBNw = new t();\n            Ks.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw = new t();\n            int RjzV = Ks.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.ssBNw.A.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(497, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(496).getDeclaringType());
    }

    @Test
    public void test098() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class pOVH {\n    public Boolean[] Ku = new Boolean[379];\n    public pOVH YTaU;\n    public static void main(String[] args) {\n            pOVH CL1 = new pOVH();\n            CL1.YTaU = new pOVH();\n            CL1.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU = new pOVH();\n            int wS = CL1.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.YTaU.Ku.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(529, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(528).getDeclaringType());
    }

    @Test
    public void test099() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class x {\n    public Boolean[] ZFK4 = new Boolean[260];\n    public x C;\n    public static void main(String[] args) {\n            x n = new x();\n            n.C = new x();\n            n.C.C = new x();\n            n.C.C.C = new x();\n            n.C.C.C.C = new x();\n            n.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C = new x();\n            int Dqkl = n.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.C.ZFK4.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(562, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(561).getDeclaringType());
    }

    @Test
    public void test100() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class tTD {\n    public Boolean[] tN = new Boolean[403];\n    public tTD t;\n    public static void main(String[] args) {\n            tTD nj = new tTD();\n            nj.t = new tTD();\n            nj.t.t = new tTD();\n            nj.t.t.t = new tTD();\n            nj.t.t.t.t = new tTD();\n            nj.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t = new tTD();\n            int vy = nj.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.t.tN.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(596, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(595).getDeclaringType());
    }

    @Test
    public void test101() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(new VirtualFile("public class N {\n    public Boolean[] C = new Boolean[300];\n    public N CnUICE2;\n    public static void main(String[] args) {\n            N m = new N();\n            m.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2 = new N();\n            int Lyw = m.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.CnUICE2.C.length;\n    }\n}"));
        CtModel ctModel = launcher.buildModel();
        List<CtFieldReference<?>> elements = ctModel.getElements(new TypeFilter<>(CtFieldReference.class));
        assertEquals(631, elements.size());
        CtArrayTypeReference<?> arrayRef = launcher.getFactory().createArrayReference("java.lang.Boolean");
        assertEquals(arrayRef, elements.get(630).getDeclaringType());
    }
}

