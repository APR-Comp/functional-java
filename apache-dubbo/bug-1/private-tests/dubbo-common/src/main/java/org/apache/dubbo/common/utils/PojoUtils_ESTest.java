package org.apache.dubbo.common.utils;
 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class PojoUtils_ESTest {
    class E implements Serializable {
        private String Y;
        private String E5;
        private String Gi;
        private String N;
    
        public void setY(String Y) {
            this.Y = Y;
        }
    
        public String getY() {
            return this.Y;
        }
    
        public void setT(String E5) {
            this.E5 = E5;
        }
    
        public String getT() {
            return this.E5;
        }
    
        public void setGi(String Gi) {
            this.Gi = Gi;
        }
    
        public String getGi() {
            return this.Gi;
        }
    
        public void setU2(String N) {
            this.N = N;
        }
    
        public String getU2() {
            return this.N;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            E that = (E) o;
            return Objects.equals(Y, that.Y) && Objects.equals(E5, that.E5) && Objects.equals(Gi, that.Gi) && Objects.equals(N, that.N);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Y, E5, Gi, N);
        }
    }

    @Test
    void test000() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        E wN = new E();
        wN.setY("n");
        wN.setT("EHZ");
        wN.setGi("a10");
        wN.setU2("OF");
    
        Object generalized = PojoUtils.generalize(wN);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("n", ((Map)generalized).get("y"));
        Assertions.assertEquals("EHZ", ((Map)generalized).get("t"));
        Assertions.assertEquals("a10", ((Map)generalized).get("gi"));
        Assertions.assertEquals("OF", ((Map)generalized).get("u2"));
    
        E realization = (E) PojoUtils.realize(PojoUtils.generalize(wN), E.class, E.class);
        Assertions.assertEquals(wN, realization);
    
        Map<String, Object> vu = new HashMap<>();
        vu.put("Y", "n");
        vu.put("T", "EHZ");
        vu.put("Gi", "a10");
        vu.put("U2", "OF");
    
        E realization2 = (E) PojoUtils.realize(vu, E.class, E.class);
        Assertions.assertEquals(wN, realization2);
    }

    class Cu implements Serializable {
        private String KZ;
    
        public void setKZ(String KZ) {
            this.KZ = KZ;
        }
    
        public String getKZ() {
            return this.KZ;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cu that = (Cu) o;
            return Objects.equals(KZ, that.KZ);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(KZ);
        }
    }

    @Test
    void test001() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Cu FJh = new Cu();
        FJh.setKZ("IZ");
    
        Object generalized = PojoUtils.generalize(FJh);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("IZ", ((Map)generalized).get("kZ"));
    
        Cu realization = (Cu) PojoUtils.realize(PojoUtils.generalize(FJh), Cu.class, Cu.class);
        Assertions.assertEquals(FJh, realization);
    
        Map<String, Object> Lf = new HashMap<>();
        Lf.put("KZ", "IZ");
    
        Cu realization2 = (Cu) PojoUtils.realize(Lf, Cu.class, Cu.class);
        Assertions.assertEquals(FJh, realization2);
    }

    class Tn implements Serializable {
        private String H;
    
        public void setKf_M9(String H) {
            this.H = H;
        }
    
        public String getKf_M9() {
            return this.H;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tn that = (Tn) o;
            return Objects.equals(H, that.H);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(H);
        }
    }

    @Test
    void test003() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Tn d = new Tn();
        d.setKf_M9("b");
    
        Object generalized = PojoUtils.generalize(d);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("b", ((Map)generalized).get("kf_M9"));
    
        Tn realization = (Tn) PojoUtils.realize(PojoUtils.generalize(d), Tn.class, Tn.class);
        Assertions.assertEquals(d, realization);
    
        Map<String, Object> Nqe = new HashMap<>();
        Nqe.put("Kf_M9", "b");
    
        Tn realization2 = (Tn) PojoUtils.realize(Nqe, Tn.class, Tn.class);
        Assertions.assertEquals(d, realization2);
    }

    class TCSH implements Serializable {
        private String S;
    
        public void setS(String S) {
            this.S = S;
        }
    
        public String getS() {
            return this.S;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TCSH that = (TCSH) o;
            return Objects.equals(S, that.S);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(S);
        }
    }

    @Test
    void test005() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        TCSH J = new TCSH();
        J.setS("a");
    
        Object generalized = PojoUtils.generalize(J);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("a", ((Map)generalized).get("s"));
    
        TCSH realization = (TCSH) PojoUtils.realize(PojoUtils.generalize(J), TCSH.class, TCSH.class);
        Assertions.assertEquals(J, realization);
    
        Map<String, Object> F1Z = new HashMap<>();
        F1Z.put("S", "a");
    
        TCSH realization2 = (TCSH) PojoUtils.realize(F1Z, TCSH.class, TCSH.class);
        Assertions.assertEquals(J, realization2);
    }

    class X4SO implements Serializable {
        private String M;
    
        public void setPy(String M) {
            this.M = M;
        }
    
        public String getPy() {
            return this.M;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            X4SO that = (X4SO) o;
            return Objects.equals(M, that.M);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(M);
        }
    }

    @Test
    void test009() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        X4SO PR = new X4SO();
        PR.setPy("s");
    
        Object generalized = PojoUtils.generalize(PR);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("s", ((Map)generalized).get("py"));
    
        X4SO realization = (X4SO) PojoUtils.realize(PojoUtils.generalize(PR), X4SO.class, X4SO.class);
        Assertions.assertEquals(PR, realization);
    
        Map<String, Object> i = new HashMap<>();
        i.put("Py", "s");
    
        X4SO realization2 = (X4SO) PojoUtils.realize(i, X4SO.class, X4SO.class);
        Assertions.assertEquals(PR, realization2);
    }

    class W69a implements Serializable {
        private String BaP0_;
        private String Njl;
        private String Vaq;
    
        public void setBaP0_(String BaP0_) {
            this.BaP0_ = BaP0_;
        }
    
        public String getBaP0_() {
            return this.BaP0_;
        }
    
        public void setNjl(String Njl) {
            this.Njl = Njl;
        }
    
        public String getNjl() {
            return this.Njl;
        }
    
        public void setVaq(String Vaq) {
            this.Vaq = Vaq;
        }
    
        public String getVaq() {
            return this.Vaq;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            W69a that = (W69a) o;
            return Objects.equals(BaP0_, that.BaP0_) && Objects.equals(Njl, that.Njl) && Objects.equals(Vaq, that.Vaq);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(BaP0_, Njl, Vaq);
        }
    }

    @Test
    void test016() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        W69a Sv1 = new W69a();
        Sv1.setBaP0_("T7");
        Sv1.setNjl("qV");
        Sv1.setVaq("cwjGV");
    
        Object generalized = PojoUtils.generalize(Sv1);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("T7", ((Map)generalized).get("baP0_"));
        Assertions.assertEquals("qV", ((Map)generalized).get("njl"));
        Assertions.assertEquals("cwjGV", ((Map)generalized).get("vaq"));
    
        W69a realization = (W69a) PojoUtils.realize(PojoUtils.generalize(Sv1), W69a.class, W69a.class);
        Assertions.assertEquals(Sv1, realization);
    
        Map<String, Object> vF = new HashMap<>();
        vF.put("BaP0_", "T7");
        vF.put("Njl", "qV");
        vF.put("Vaq", "cwjGV");
    
        W69a realization2 = (W69a) PojoUtils.realize(vF, W69a.class, W69a.class);
        Assertions.assertEquals(Sv1, realization2);
    }

    class eYp implements Serializable {
        private String P;
    
        public void setP(String P) {
            this.P = P;
        }
    
        public String getP() {
            return this.P;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            eYp that = (eYp) o;
            return Objects.equals(P, that.P);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(P);
        }
    }

    @Test
    void test020() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        eYp Hv = new eYp();
        Hv.setP("iJf");
    
        Object generalized = PojoUtils.generalize(Hv);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("iJf", ((Map)generalized).get("p"));
    
        eYp realization = (eYp) PojoUtils.realize(PojoUtils.generalize(Hv), eYp.class, eYp.class);
        Assertions.assertEquals(Hv, realization);
    
        Map<String, Object> vXB = new HashMap<>();
        vXB.put("P", "iJf");
    
        eYp realization2 = (eYp) PojoUtils.realize(vXB, eYp.class, eYp.class);
        Assertions.assertEquals(Hv, realization2);
    }

    class GS implements Serializable {
        private String T6;
        private String WE;
        private String JL;
    
        public void setT6(String T6) {
            this.T6 = T6;
        }
    
        public String getT6() {
            return this.T6;
        }
    
        public void setWE(String WE) {
            this.WE = WE;
        }
    
        public String getWE() {
            return this.WE;
        }
    
        public void setSP(String JL) {
            this.JL = JL;
        }
    
        public String getSP() {
            return this.JL;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GS that = (GS) o;
            return Objects.equals(T6, that.T6) && Objects.equals(WE, that.WE) && Objects.equals(JL, that.JL);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(T6, WE, JL);
        }
    }

    @Test
    void test023() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        GS kYh = new GS();
        kYh.setT6("Ug");
        kYh.setWE("kP");
        kYh.setSP("HQT");
    
        Object generalized = PojoUtils.generalize(kYh);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Ug", ((Map)generalized).get("t6"));
        Assertions.assertEquals("kP", ((Map)generalized).get("wE"));
        Assertions.assertEquals("HQT", ((Map)generalized).get("sP"));
    
        GS realization = (GS) PojoUtils.realize(PojoUtils.generalize(kYh), GS.class, GS.class);
        Assertions.assertEquals(kYh, realization);
    
        Map<String, Object> qi = new HashMap<>();
        qi.put("T6", "Ug");
        qi.put("WE", "kP");
        qi.put("SP", "HQT");
    
        GS realization2 = (GS) PojoUtils.realize(qi, GS.class, GS.class);
        Assertions.assertEquals(kYh, realization2);
    }

    class sZQ implements Serializable {
        private String ZG;
        private String CgGPqIt;
    
        public void setZG(String ZG) {
            this.ZG = ZG;
        }
    
        public String getZG() {
            return this.ZG;
        }
    
        public void setE8fo(String CgGPqIt) {
            this.CgGPqIt = CgGPqIt;
        }
    
        public String getE8fo() {
            return this.CgGPqIt;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            sZQ that = (sZQ) o;
            return Objects.equals(ZG, that.ZG) && Objects.equals(CgGPqIt, that.CgGPqIt);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(ZG, CgGPqIt);
        }
    }

    @Test
    void test024() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        sZQ QJc = new sZQ();
        QJc.setZG("MSE");
        QJc.setE8fo("Xg");
    
        Object generalized = PojoUtils.generalize(QJc);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("MSE", ((Map)generalized).get("zG"));
        Assertions.assertEquals("Xg", ((Map)generalized).get("e8fo"));
    
        sZQ realization = (sZQ) PojoUtils.realize(PojoUtils.generalize(QJc), sZQ.class, sZQ.class);
        Assertions.assertEquals(QJc, realization);
    
        Map<String, Object> p1 = new HashMap<>();
        p1.put("ZG", "MSE");
        p1.put("E8fo", "Xg");
    
        sZQ realization2 = (sZQ) PojoUtils.realize(p1, sZQ.class, sZQ.class);
        Assertions.assertEquals(QJc, realization2);
    }

    class ai3 implements Serializable {
        private String RFz8;
        private String NQ;
    
        public void setCF(String RFz8) {
            this.RFz8 = RFz8;
        }
    
        public String getCF() {
            return this.RFz8;
        }
    
        public void setNQ(String NQ) {
            this.NQ = NQ;
        }
    
        public String getNQ() {
            return this.NQ;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ai3 that = (ai3) o;
            return Objects.equals(RFz8, that.RFz8) && Objects.equals(NQ, that.NQ);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(RFz8, NQ);
        }
    }

    @Test
    void test028() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        ai3 vmJ = new ai3();
        vmJ.setCF("Do");
        vmJ.setNQ("W7D");
    
        Object generalized = PojoUtils.generalize(vmJ);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Do", ((Map)generalized).get("cF"));
        Assertions.assertEquals("W7D", ((Map)generalized).get("nQ"));
    
        ai3 realization = (ai3) PojoUtils.realize(PojoUtils.generalize(vmJ), ai3.class, ai3.class);
        Assertions.assertEquals(vmJ, realization);
    
        Map<String, Object> Tz2K = new HashMap<>();
        Tz2K.put("CF", "Do");
        Tz2K.put("NQ", "W7D");
    
        ai3 realization2 = (ai3) PojoUtils.realize(Tz2K, ai3.class, ai3.class);
        Assertions.assertEquals(vmJ, realization2);
    }

    class BYw implements Serializable {
        private String MP;
        private String Ndi_;
        private String RE;
        private String VPZ;
    
        public void setMP(String MP) {
            this.MP = MP;
        }
    
        public String getMP() {
            return this.MP;
        }
    
        public void setMQ7i(String Ndi_) {
            this.Ndi_ = Ndi_;
        }
    
        public String getMQ7i() {
            return this.Ndi_;
        }
    
        public void setRE(String RE) {
            this.RE = RE;
        }
    
        public String getRE() {
            return this.RE;
        }
    
        public void setVPZ(String VPZ) {
            this.VPZ = VPZ;
        }
    
        public String getVPZ() {
            return this.VPZ;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BYw that = (BYw) o;
            return Objects.equals(MP, that.MP) && Objects.equals(Ndi_, that.Ndi_) && Objects.equals(RE, that.RE) && Objects.equals(VPZ, that.VPZ);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(MP, Ndi_, RE, VPZ);
        }
    }

    @Test
    void test034() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        BYw aa = new BYw();
        aa.setMP("A_b0SL");
        aa.setMQ7i("oA");
        aa.setRE("bYJ");
        aa.setVPZ("t5");
    
        Object generalized = PojoUtils.generalize(aa);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("A_b0SL", ((Map)generalized).get("mP"));
        Assertions.assertEquals("oA", ((Map)generalized).get("mQ7i"));
        Assertions.assertEquals("bYJ", ((Map)generalized).get("rE"));
        Assertions.assertEquals("t5", ((Map)generalized).get("vPZ"));
    
        BYw realization = (BYw) PojoUtils.realize(PojoUtils.generalize(aa), BYw.class, BYw.class);
        Assertions.assertEquals(aa, realization);
    
        Map<String, Object> I1I8 = new HashMap<>();
        I1I8.put("MP", "A_b0SL");
        I1I8.put("MQ7i", "oA");
        I1I8.put("RE", "bYJ");
        I1I8.put("VPZ", "t5");
    
        BYw realization2 = (BYw) PojoUtils.realize(I1I8, BYw.class, BYw.class);
        Assertions.assertEquals(aa, realization2);
    }

    class u2 implements Serializable {
        private String KhX;
        private String IGc;
        private String LF6;
    
        public void setS4(String KhX) {
            this.KhX = KhX;
        }
    
        public String getS4() {
            return this.KhX;
        }
    
        public void setQCu(String IGc) {
            this.IGc = IGc;
        }
    
        public String getQCu() {
            return this.IGc;
        }
    
        public void setOBxp9L(String LF6) {
            this.LF6 = LF6;
        }
    
        public String getOBxp9L() {
            return this.LF6;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            u2 that = (u2) o;
            return Objects.equals(KhX, that.KhX) && Objects.equals(IGc, that.IGc) && Objects.equals(LF6, that.LF6);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(KhX, IGc, LF6);
        }
    }

    @Test
    void test036() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        u2 JT = new u2();
        JT.setS4("CSw");
        JT.setQCu("Inr");
        JT.setOBxp9L("cm");
    
        Object generalized = PojoUtils.generalize(JT);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("CSw", ((Map)generalized).get("s4"));
        Assertions.assertEquals("Inr", ((Map)generalized).get("qCu"));
        Assertions.assertEquals("cm", ((Map)generalized).get("oBxp9L"));
    
        u2 realization = (u2) PojoUtils.realize(PojoUtils.generalize(JT), u2.class, u2.class);
        Assertions.assertEquals(JT, realization);
    
        Map<String, Object> DGFu = new HashMap<>();
        DGFu.put("S4", "CSw");
        DGFu.put("QCu", "Inr");
        DGFu.put("OBxp9L", "cm");
    
        u2 realization2 = (u2) PojoUtils.realize(DGFu, u2.class, u2.class);
        Assertions.assertEquals(JT, realization2);
    }

    class egD implements Serializable {
        private String Kx;
        private String Gp;
        private String Fq;
        private String Yp;
    
        public void setOoM(String Kx) {
            this.Kx = Kx;
        }
    
        public String getOoM() {
            return this.Kx;
        }
    
        public void setGp(String Gp) {
            this.Gp = Gp;
        }
    
        public String getGp() {
            return this.Gp;
        }
    
        public void setFq(String Fq) {
            this.Fq = Fq;
        }
    
        public String getFq() {
            return this.Fq;
        }
    
        public void setYp(String Yp) {
            this.Yp = Yp;
        }
    
        public String getYp() {
            return this.Yp;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            egD that = (egD) o;
            return Objects.equals(Kx, that.Kx) && Objects.equals(Gp, that.Gp) && Objects.equals(Fq, that.Fq) && Objects.equals(Yp, that.Yp);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Kx, Gp, Fq, Yp);
        }
    }

    @Test
    void test039() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        egD CvAb = new egD();
        CvAb.setOoM("PXU3");
        CvAb.setGp("C3qH");
        CvAb.setFq("mC");
        CvAb.setYp("rPXxbPO");
    
        Object generalized = PojoUtils.generalize(CvAb);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("PXU3", ((Map)generalized).get("ooM"));
        Assertions.assertEquals("C3qH", ((Map)generalized).get("gp"));
        Assertions.assertEquals("mC", ((Map)generalized).get("fq"));
        Assertions.assertEquals("rPXxbPO", ((Map)generalized).get("yp"));
    
        egD realization = (egD) PojoUtils.realize(PojoUtils.generalize(CvAb), egD.class, egD.class);
        Assertions.assertEquals(CvAb, realization);
    
        Map<String, Object> XN = new HashMap<>();
        XN.put("OoM", "PXU3");
        XN.put("Gp", "C3qH");
        XN.put("Fq", "mC");
        XN.put("Yp", "rPXxbPO");
    
        egD realization2 = (egD) PojoUtils.realize(XN, egD.class, egD.class);
        Assertions.assertEquals(CvAb, realization2);
    }

    class JU implements Serializable {
        private String BY;
        private String Xtc;
        private String Kf;
    
        public void setYTX(String BY) {
            this.BY = BY;
        }
    
        public String getYTX() {
            return this.BY;
        }
    
        public void setBE(String Xtc) {
            this.Xtc = Xtc;
        }
    
        public String getBE() {
            return this.Xtc;
        }
    
        public void setGO(String Kf) {
            this.Kf = Kf;
        }
    
        public String getGO() {
            return this.Kf;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            JU that = (JU) o;
            return Objects.equals(BY, that.BY) && Objects.equals(Xtc, that.Xtc) && Objects.equals(Kf, that.Kf);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(BY, Xtc, Kf);
        }
    }

    @Test
    void test043() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        JU ItSMX = new JU();
        ItSMX.setYTX("Vw");
        ItSMX.setBE("bjR");
        ItSMX.setGO("lF");
    
        Object generalized = PojoUtils.generalize(ItSMX);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Vw", ((Map)generalized).get("yTX"));
        Assertions.assertEquals("bjR", ((Map)generalized).get("bE"));
        Assertions.assertEquals("lF", ((Map)generalized).get("gO"));
    
        JU realization = (JU) PojoUtils.realize(PojoUtils.generalize(ItSMX), JU.class, JU.class);
        Assertions.assertEquals(ItSMX, realization);
    
        Map<String, Object> Q9i = new HashMap<>();
        Q9i.put("YTX", "Vw");
        Q9i.put("BE", "bjR");
        Q9i.put("GO", "lF");
    
        JU realization2 = (JU) PojoUtils.realize(Q9i, JU.class, JU.class);
        Assertions.assertEquals(ItSMX, realization2);
    }

    class Ubf implements Serializable {
        private String Vjz5;
        private String BhuUM;
    
        public void setGr(String Vjz5) {
            this.Vjz5 = Vjz5;
        }
    
        public String getGr() {
            return this.Vjz5;
        }
    
        public void setBhuUM(String BhuUM) {
            this.BhuUM = BhuUM;
        }
    
        public String getBhuUM() {
            return this.BhuUM;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ubf that = (Ubf) o;
            return Objects.equals(Vjz5, that.Vjz5) && Objects.equals(BhuUM, that.BhuUM);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Vjz5, BhuUM);
        }
    }

    @Test
    void test046() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Ubf bR = new Ubf();
        bR.setGr("IE");
        bR.setBhuUM("LL");
    
        Object generalized = PojoUtils.generalize(bR);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("IE", ((Map)generalized).get("gr"));
        Assertions.assertEquals("LL", ((Map)generalized).get("bhuUM"));
    
        Ubf realization = (Ubf) PojoUtils.realize(PojoUtils.generalize(bR), Ubf.class, Ubf.class);
        Assertions.assertEquals(bR, realization);
    
        Map<String, Object> MtoY = new HashMap<>();
        MtoY.put("Gr", "IE");
        MtoY.put("BhuUM", "LL");
    
        Ubf realization2 = (Ubf) PojoUtils.realize(MtoY, Ubf.class, Ubf.class);
        Assertions.assertEquals(bR, realization2);
    }

    class KZU implements Serializable {
        private String VL6;
        private String CC2W;
    
        public void setUT(String VL6) {
            this.VL6 = VL6;
        }
    
        public String getUT() {
            return this.VL6;
        }
    
        public void setCC2W(String CC2W) {
            this.CC2W = CC2W;
        }
    
        public String getCC2W() {
            return this.CC2W;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            KZU that = (KZU) o;
            return Objects.equals(VL6, that.VL6) && Objects.equals(CC2W, that.CC2W);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(VL6, CC2W);
        }
    }

    @Test
    void test052() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        KZU hyZN = new KZU();
        hyZN.setUT("z8");
        hyZN.setCC2W("ye");
    
        Object generalized = PojoUtils.generalize(hyZN);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("z8", ((Map)generalized).get("uT"));
        Assertions.assertEquals("ye", ((Map)generalized).get("cC2W"));
    
        KZU realization = (KZU) PojoUtils.realize(PojoUtils.generalize(hyZN), KZU.class, KZU.class);
        Assertions.assertEquals(hyZN, realization);
    
        Map<String, Object> nC = new HashMap<>();
        nC.put("UT", "z8");
        nC.put("CC2W", "ye");
    
        KZU realization2 = (KZU) PojoUtils.realize(nC, KZU.class, KZU.class);
        Assertions.assertEquals(hyZN, realization2);
    }

    class Xi implements Serializable {
        private String Xo;
    
        public void setIP(String Xo) {
            this.Xo = Xo;
        }
    
        public String getIP() {
            return this.Xo;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Xi that = (Xi) o;
            return Objects.equals(Xo, that.Xo);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Xo);
        }
    }

    @Test
    void test057() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Xi ogJ1 = new Xi();
        ogJ1.setIP("NPa");
    
        Object generalized = PojoUtils.generalize(ogJ1);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("NPa", ((Map)generalized).get("iP"));
    
        Xi realization = (Xi) PojoUtils.realize(PojoUtils.generalize(ogJ1), Xi.class, Xi.class);
        Assertions.assertEquals(ogJ1, realization);
    
        Map<String, Object> nt = new HashMap<>();
        nt.put("IP", "NPa");
    
        Xi realization2 = (Xi) PojoUtils.realize(nt, Xi.class, Xi.class);
        Assertions.assertEquals(ogJ1, realization2);
    }

    class ySa implements Serializable {
        private String Wqzgq;
    
        public void setWiA(String Wqzgq) {
            this.Wqzgq = Wqzgq;
        }
    
        public String getWiA() {
            return this.Wqzgq;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ySa that = (ySa) o;
            return Objects.equals(Wqzgq, that.Wqzgq);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Wqzgq);
        }
    }

    @Test
    void test060() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        ySa NN = new ySa();
        NN.setWiA("dk");
    
        Object generalized = PojoUtils.generalize(NN);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("dk", ((Map)generalized).get("wiA"));
    
        ySa realization = (ySa) PojoUtils.realize(PojoUtils.generalize(NN), ySa.class, ySa.class);
        Assertions.assertEquals(NN, realization);
    
        Map<String, Object> uNK = new HashMap<>();
        uNK.put("WiA", "dk");
    
        ySa realization2 = (ySa) PojoUtils.realize(uNK, ySa.class, ySa.class);
        Assertions.assertEquals(NN, realization2);
    }

    class d7sd8 implements Serializable {
        private String Gknk3;
    
        public void setGknk3(String Gknk3) {
            this.Gknk3 = Gknk3;
        }
    
        public String getGknk3() {
            return this.Gknk3;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            d7sd8 that = (d7sd8) o;
            return Objects.equals(Gknk3, that.Gknk3);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Gknk3);
        }
    }

    @Test
    void test062() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        d7sd8 gv = new d7sd8();
        gv.setGknk3("Zv");
    
        Object generalized = PojoUtils.generalize(gv);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Zv", ((Map)generalized).get("gknk3"));
    
        d7sd8 realization = (d7sd8) PojoUtils.realize(PojoUtils.generalize(gv), d7sd8.class, d7sd8.class);
        Assertions.assertEquals(gv, realization);
    
        Map<String, Object> Mu = new HashMap<>();
        Mu.put("Gknk3", "Zv");
    
        d7sd8 realization2 = (d7sd8) PojoUtils.realize(Mu, d7sd8.class, d7sd8.class);
        Assertions.assertEquals(gv, realization2);
    }

    class cLrlj implements Serializable {
        private String BcU;
        private String VA;
    
        public void setJAVvw(String BcU) {
            this.BcU = BcU;
        }
    
        public String getJAVvw() {
            return this.BcU;
        }
    
        public void setQS(String VA) {
            this.VA = VA;
        }
    
        public String getQS() {
            return this.VA;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            cLrlj that = (cLrlj) o;
            return Objects.equals(BcU, that.BcU) && Objects.equals(VA, that.VA);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(BcU, VA);
        }
    }

    @Test
    void test065() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        cLrlj oM = new cLrlj();
        oM.setJAVvw("zH");
        oM.setQS("i7");
    
        Object generalized = PojoUtils.generalize(oM);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("zH", ((Map)generalized).get("jAVvw"));
        Assertions.assertEquals("i7", ((Map)generalized).get("qS"));
    
        cLrlj realization = (cLrlj) PojoUtils.realize(PojoUtils.generalize(oM), cLrlj.class, cLrlj.class);
        Assertions.assertEquals(oM, realization);
    
        Map<String, Object> e3 = new HashMap<>();
        e3.put("JAVvw", "zH");
        e3.put("QS", "i7");
    
        cLrlj realization2 = (cLrlj) PojoUtils.realize(e3, cLrlj.class, cLrlj.class);
        Assertions.assertEquals(oM, realization2);
    }

    class QV implements Serializable {
        private String FM;
    
        public void setQSK(String FM) {
            this.FM = FM;
        }
    
        public String getQSK() {
            return this.FM;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            QV that = (QV) o;
            return Objects.equals(FM, that.FM);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(FM);
        }
    }

    @Test
    void test066() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        QV IeI = new QV();
        IeI.setQSK("U3");
    
        Object generalized = PojoUtils.generalize(IeI);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("U3", ((Map)generalized).get("qSK"));
    
        QV realization = (QV) PojoUtils.realize(PojoUtils.generalize(IeI), QV.class, QV.class);
        Assertions.assertEquals(IeI, realization);
    
        Map<String, Object> ryu = new HashMap<>();
        ryu.put("QSK", "U3");
    
        QV realization2 = (QV) PojoUtils.realize(ryu, QV.class, QV.class);
        Assertions.assertEquals(IeI, realization2);
    }

    class qzMdv implements Serializable {
        private String TpInD;
        private String P838Rk;
    
        public void setTpInD(String TpInD) {
            this.TpInD = TpInD;
        }
    
        public String getTpInD() {
            return this.TpInD;
        }
    
        public void setP838Rk(String P838Rk) {
            this.P838Rk = P838Rk;
        }
    
        public String getP838Rk() {
            return this.P838Rk;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            qzMdv that = (qzMdv) o;
            return Objects.equals(TpInD, that.TpInD) && Objects.equals(P838Rk, that.P838Rk);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(TpInD, P838Rk);
        }
    }

    @Test
    void test067() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        qzMdv cE = new qzMdv();
        cE.setTpInD("f9");
        cE.setP838Rk("J5");
    
        Object generalized = PojoUtils.generalize(cE);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("f9", ((Map)generalized).get("tpInD"));
        Assertions.assertEquals("J5", ((Map)generalized).get("p838Rk"));
    
        qzMdv realization = (qzMdv) PojoUtils.realize(PojoUtils.generalize(cE), qzMdv.class, qzMdv.class);
        Assertions.assertEquals(cE, realization);
    
        Map<String, Object> vGW = new HashMap<>();
        vGW.put("TpInD", "f9");
        vGW.put("P838Rk", "J5");
    
        qzMdv realization2 = (qzMdv) PojoUtils.realize(vGW, qzMdv.class, qzMdv.class);
        Assertions.assertEquals(cE, realization2);
    }

    class UM implements Serializable {
        private String KT;
    
        public void setKT(String KT) {
            this.KT = KT;
        }
    
        public String getKT() {
            return this.KT;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UM that = (UM) o;
            return Objects.equals(KT, that.KT);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(KT);
        }
    }

    @Test
    void test069() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        UM LoX = new UM();
        LoX.setKT("Wq9");
    
        Object generalized = PojoUtils.generalize(LoX);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Wq9", ((Map)generalized).get("kT"));
    
        UM realization = (UM) PojoUtils.realize(PojoUtils.generalize(LoX), UM.class, UM.class);
        Assertions.assertEquals(LoX, realization);
    
        Map<String, Object> sv = new HashMap<>();
        sv.put("KT", "Wq9");
    
        UM realization2 = (UM) PojoUtils.realize(sv, UM.class, UM.class);
        Assertions.assertEquals(LoX, realization2);
    }

    class jlJ implements Serializable {
        private String IUjAq;
        private String OG;
    
        public void setTYg(String IUjAq) {
            this.IUjAq = IUjAq;
        }
    
        public String getTYg() {
            return this.IUjAq;
        }
    
        public void setOG(String OG) {
            this.OG = OG;
        }
    
        public String getOG() {
            return this.OG;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            jlJ that = (jlJ) o;
            return Objects.equals(IUjAq, that.IUjAq) && Objects.equals(OG, that.OG);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(IUjAq, OG);
        }
    }

    @Test
    void test070() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        jlJ ws_ = new jlJ();
        ws_.setTYg("MQ");
        ws_.setOG("oU");
    
        Object generalized = PojoUtils.generalize(ws_);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("MQ", ((Map)generalized).get("tYg"));
        Assertions.assertEquals("oU", ((Map)generalized).get("oG"));
    
        jlJ realization = (jlJ) PojoUtils.realize(PojoUtils.generalize(ws_), jlJ.class, jlJ.class);
        Assertions.assertEquals(ws_, realization);
    
        Map<String, Object> AIm = new HashMap<>();
        AIm.put("TYg", "MQ");
        AIm.put("OG", "oU");
    
        jlJ realization2 = (jlJ) PojoUtils.realize(AIm, jlJ.class, jlJ.class);
        Assertions.assertEquals(ws_, realization2);
    }

    class Wv implements Serializable {
        private String GUiNnaB;
        private String RAWz;
    
        public void setUn(String GUiNnaB) {
            this.GUiNnaB = GUiNnaB;
        }
    
        public String getUn() {
            return this.GUiNnaB;
        }
    
        public void setRAWz(String RAWz) {
            this.RAWz = RAWz;
        }
    
        public String getRAWz() {
            return this.RAWz;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Wv that = (Wv) o;
            return Objects.equals(GUiNnaB, that.GUiNnaB) && Objects.equals(RAWz, that.RAWz);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(GUiNnaB, RAWz);
        }
    }

    @Test
    void test071() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Wv KF = new Wv();
        KF.setUn("n3ooB");
        KF.setRAWz("bs");
    
        Object generalized = PojoUtils.generalize(KF);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("n3ooB", ((Map)generalized).get("un"));
        Assertions.assertEquals("bs", ((Map)generalized).get("rAWz"));
    
        Wv realization = (Wv) PojoUtils.realize(PojoUtils.generalize(KF), Wv.class, Wv.class);
        Assertions.assertEquals(KF, realization);
    
        Map<String, Object> KFN = new HashMap<>();
        KFN.put("Un", "n3ooB");
        KFN.put("RAWz", "bs");
    
        Wv realization2 = (Wv) PojoUtils.realize(KFN, Wv.class, Wv.class);
        Assertions.assertEquals(KF, realization2);
    }

    class L_ED implements Serializable {
        private String MVaQ;
        private String MF;
        private String Hka;
    
        public void setSUK(String MVaQ) {
            this.MVaQ = MVaQ;
        }
    
        public String getSUK() {
            return this.MVaQ;
        }
    
        public void setTYks(String MF) {
            this.MF = MF;
        }
    
        public String getTYks() {
            return this.MF;
        }
    
        public void setHka(String Hka) {
            this.Hka = Hka;
        }
    
        public String getHka() {
            return this.Hka;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            L_ED that = (L_ED) o;
            return Objects.equals(MVaQ, that.MVaQ) && Objects.equals(MF, that.MF) && Objects.equals(Hka, that.Hka);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(MVaQ, MF, Hka);
        }
    }

    @Test
    void test072() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        L_ED Nt6 = new L_ED();
        Nt6.setSUK("DPSxP");
        Nt6.setTYks("LQ");
        Nt6.setHka("PUJ");
    
        Object generalized = PojoUtils.generalize(Nt6);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("DPSxP", ((Map)generalized).get("sUK"));
        Assertions.assertEquals("LQ", ((Map)generalized).get("tYks"));
        Assertions.assertEquals("PUJ", ((Map)generalized).get("hka"));
    
        L_ED realization = (L_ED) PojoUtils.realize(PojoUtils.generalize(Nt6), L_ED.class, L_ED.class);
        Assertions.assertEquals(Nt6, realization);
    
        Map<String, Object> r0 = new HashMap<>();
        r0.put("SUK", "DPSxP");
        r0.put("TYks", "LQ");
        r0.put("Hka", "PUJ");
    
        L_ED realization2 = (L_ED) PojoUtils.realize(r0, L_ED.class, L_ED.class);
        Assertions.assertEquals(Nt6, realization2);
    }

    class keA implements Serializable {
        private String CX;
        private String Fyn8E;
        private String E8W;
        private String No;
    
        public void setFP3(String CX) {
            this.CX = CX;
        }
    
        public String getFP3() {
            return this.CX;
        }
    
        public void setF7jUH(String Fyn8E) {
            this.Fyn8E = Fyn8E;
        }
    
        public String getF7jUH() {
            return this.Fyn8E;
        }
    
        public void setE8W(String E8W) {
            this.E8W = E8W;
        }
    
        public String getE8W() {
            return this.E8W;
        }
    
        public void setNo(String No) {
            this.No = No;
        }
    
        public String getNo() {
            return this.No;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            keA that = (keA) o;
            return Objects.equals(CX, that.CX) && Objects.equals(Fyn8E, that.Fyn8E) && Objects.equals(E8W, that.E8W) && Objects.equals(No, that.No);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(CX, Fyn8E, E8W, No);
        }
    }

    @Test
    void test073() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        keA Gj90 = new keA();
        Gj90.setFP3("b0O");
        Gj90.setF7jUH("fDWo5");
        Gj90.setE8W("xYxAZ3");
        Gj90.setNo("ioBQl");
    
        Object generalized = PojoUtils.generalize(Gj90);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("b0O", ((Map)generalized).get("fP3"));
        Assertions.assertEquals("fDWo5", ((Map)generalized).get("f7jUH"));
        Assertions.assertEquals("xYxAZ3", ((Map)generalized).get("e8W"));
        Assertions.assertEquals("ioBQl", ((Map)generalized).get("no"));
    
        keA realization = (keA) PojoUtils.realize(PojoUtils.generalize(Gj90), keA.class, keA.class);
        Assertions.assertEquals(Gj90, realization);
    
        Map<String, Object> fT = new HashMap<>();
        fT.put("FP3", "b0O");
        fT.put("F7jUH", "fDWo5");
        fT.put("E8W", "xYxAZ3");
        fT.put("No", "ioBQl");
    
        keA realization2 = (keA) PojoUtils.realize(fT, keA.class, keA.class);
        Assertions.assertEquals(Gj90, realization2);
    }

    class VFLO implements Serializable {
        private String CEo;
    
        public void setCEo(String CEo) {
            this.CEo = CEo;
        }
    
        public String getCEo() {
            return this.CEo;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            VFLO that = (VFLO) o;
            return Objects.equals(CEo, that.CEo);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(CEo);
        }
    }

    @Test
    void test075() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        VFLO YI = new VFLO();
        YI.setCEo("Sn7zZ");
    
        Object generalized = PojoUtils.generalize(YI);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Sn7zZ", ((Map)generalized).get("cEo"));
    
        VFLO realization = (VFLO) PojoUtils.realize(PojoUtils.generalize(YI), VFLO.class, VFLO.class);
        Assertions.assertEquals(YI, realization);
    
        Map<String, Object> qY = new HashMap<>();
        qY.put("CEo", "Sn7zZ");
    
        VFLO realization2 = (VFLO) PojoUtils.realize(qY, VFLO.class, VFLO.class);
        Assertions.assertEquals(YI, realization2);
    }

    class syR implements Serializable {
        private String Vp;
        private String Te;
    
        public void setMy(String Vp) {
            this.Vp = Vp;
        }
    
        public String getMy() {
            return this.Vp;
        }
    
        public void setVTbf(String Te) {
            this.Te = Te;
        }
    
        public String getVTbf() {
            return this.Te;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            syR that = (syR) o;
            return Objects.equals(Vp, that.Vp) && Objects.equals(Te, that.Te);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Vp, Te);
        }
    }

    @Test
    void test077() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        syR x_ = new syR();
        x_.setMy("Zj");
        x_.setVTbf("jc");
    
        Object generalized = PojoUtils.generalize(x_);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Zj", ((Map)generalized).get("my"));
        Assertions.assertEquals("jc", ((Map)generalized).get("vTbf"));
    
        syR realization = (syR) PojoUtils.realize(PojoUtils.generalize(x_), syR.class, syR.class);
        Assertions.assertEquals(x_, realization);
    
        Map<String, Object> PG = new HashMap<>();
        PG.put("My", "Zj");
        PG.put("VTbf", "jc");
    
        syR realization2 = (syR) PojoUtils.realize(PG, syR.class, syR.class);
        Assertions.assertEquals(x_, realization2);
    }

    class RhH_ implements Serializable {
        private String Ak;
    
        public void setB5yA(String Ak) {
            this.Ak = Ak;
        }
    
        public String getB5yA() {
            return this.Ak;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RhH_ that = (RhH_) o;
            return Objects.equals(Ak, that.Ak);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Ak);
        }
    }

    @Test
    void test079() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        RhH_ Tf77H = new RhH_();
        Tf77H.setB5yA("jQK");
    
        Object generalized = PojoUtils.generalize(Tf77H);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("jQK", ((Map)generalized).get("b5yA"));
    
        RhH_ realization = (RhH_) PojoUtils.realize(PojoUtils.generalize(Tf77H), RhH_.class, RhH_.class);
        Assertions.assertEquals(Tf77H, realization);
    
        Map<String, Object> oWU = new HashMap<>();
        oWU.put("B5yA", "jQK");
    
        RhH_ realization2 = (RhH_) PojoUtils.realize(oWU, RhH_.class, RhH_.class);
        Assertions.assertEquals(Tf77H, realization2);
    }

    class N3IA implements Serializable {
        private String R6;
        private String Td;
    
        public void setR6(String R6) {
            this.R6 = R6;
        }
    
        public String getR6() {
            return this.R6;
        }
    
        public void setGiF(String Td) {
            this.Td = Td;
        }
    
        public String getGiF() {
            return this.Td;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            N3IA that = (N3IA) o;
            return Objects.equals(R6, that.R6) && Objects.equals(Td, that.Td);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(R6, Td);
        }
    }

    @Test
    void test081() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        N3IA Sx = new N3IA();
        Sx.setR6("IT");
        Sx.setGiF("wF");
    
        Object generalized = PojoUtils.generalize(Sx);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("IT", ((Map)generalized).get("r6"));
        Assertions.assertEquals("wF", ((Map)generalized).get("giF"));
    
        N3IA realization = (N3IA) PojoUtils.realize(PojoUtils.generalize(Sx), N3IA.class, N3IA.class);
        Assertions.assertEquals(Sx, realization);
    
        Map<String, Object> Du1u = new HashMap<>();
        Du1u.put("R6", "IT");
        Du1u.put("GiF", "wF");
    
        N3IA realization2 = (N3IA) PojoUtils.realize(Du1u, N3IA.class, N3IA.class);
        Assertions.assertEquals(Sx, realization2);
    }

    class zNwumZ4 implements Serializable {
        private String ETs;
        private String SNQMD;
        private String Dd;
        private String N1;
    
        public void setMI(String ETs) {
            this.ETs = ETs;
        }
    
        public String getMI() {
            return this.ETs;
        }
    
        public void setSNQMD(String SNQMD) {
            this.SNQMD = SNQMD;
        }
    
        public String getSNQMD() {
            return this.SNQMD;
        }
    
        public void setDd(String Dd) {
            this.Dd = Dd;
        }
    
        public String getDd() {
            return this.Dd;
        }
    
        public void setN1(String N1) {
            this.N1 = N1;
        }
    
        public String getN1() {
            return this.N1;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            zNwumZ4 that = (zNwumZ4) o;
            return Objects.equals(ETs, that.ETs) && Objects.equals(SNQMD, that.SNQMD) && Objects.equals(Dd, that.Dd) && Objects.equals(N1, that.N1);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(ETs, SNQMD, Dd, N1);
        }
    }

    @Test
    void test082() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        zNwumZ4 ta = new zNwumZ4();
        ta.setMI("qc");
        ta.setSNQMD("VMo");
        ta.setDd("oc");
        ta.setN1("K5");
    
        Object generalized = PojoUtils.generalize(ta);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("qc", ((Map)generalized).get("mI"));
        Assertions.assertEquals("VMo", ((Map)generalized).get("sNQMD"));
        Assertions.assertEquals("oc", ((Map)generalized).get("dd"));
        Assertions.assertEquals("K5", ((Map)generalized).get("n1"));
    
        zNwumZ4 realization = (zNwumZ4) PojoUtils.realize(PojoUtils.generalize(ta), zNwumZ4.class, zNwumZ4.class);
        Assertions.assertEquals(ta, realization);
    
        Map<String, Object> qt0 = new HashMap<>();
        qt0.put("MI", "qc");
        qt0.put("SNQMD", "VMo");
        qt0.put("Dd", "oc");
        qt0.put("N1", "K5");
    
        zNwumZ4 realization2 = (zNwumZ4) PojoUtils.realize(qt0, zNwumZ4.class, zNwumZ4.class);
        Assertions.assertEquals(ta, realization2);
    }

    class dP implements Serializable {
        private String Sm;
        private String HC;
        private String XX;
    
        public void setSm(String Sm) {
            this.Sm = Sm;
        }
    
        public String getSm() {
            return this.Sm;
        }
    
        public void setW67S(String HC) {
            this.HC = HC;
        }
    
        public String getW67S() {
            return this.HC;
        }
    
        public void setJ8gs(String XX) {
            this.XX = XX;
        }
    
        public String getJ8gs() {
            return this.XX;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            dP that = (dP) o;
            return Objects.equals(Sm, that.Sm) && Objects.equals(HC, that.HC) && Objects.equals(XX, that.XX);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Sm, HC, XX);
        }
    }

    @Test
    void test083() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        dP EEIOKp = new dP();
        EEIOKp.setSm("wyAc1");
        EEIOKp.setW67S("vi");
        EEIOKp.setJ8gs("tm");
    
        Object generalized = PojoUtils.generalize(EEIOKp);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("wyAc1", ((Map)generalized).get("sm"));
        Assertions.assertEquals("vi", ((Map)generalized).get("w67S"));
        Assertions.assertEquals("tm", ((Map)generalized).get("j8gs"));
    
        dP realization = (dP) PojoUtils.realize(PojoUtils.generalize(EEIOKp), dP.class, dP.class);
        Assertions.assertEquals(EEIOKp, realization);
    
        Map<String, Object> qDIu = new HashMap<>();
        qDIu.put("Sm", "wyAc1");
        qDIu.put("W67S", "vi");
        qDIu.put("J8gs", "tm");
    
        dP realization2 = (dP) PojoUtils.realize(qDIu, dP.class, dP.class);
        Assertions.assertEquals(EEIOKp, realization2);
    }

    class M_ implements Serializable {
        private String RO;
        private String J9Ht;
    
        public void setTj(String RO) {
            this.RO = RO;
        }
    
        public String getTj() {
            return this.RO;
        }
    
        public void setJ9Ht(String J9Ht) {
            this.J9Ht = J9Ht;
        }
    
        public String getJ9Ht() {
            return this.J9Ht;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            M_ that = (M_) o;
            return Objects.equals(RO, that.RO) && Objects.equals(J9Ht, that.J9Ht);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(RO, J9Ht);
        }
    }

    @Test
    void test086() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        M_ O_o5Njo = new M_();
        O_o5Njo.setTj("NM");
        O_o5Njo.setJ9Ht("V_");
    
        Object generalized = PojoUtils.generalize(O_o5Njo);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("NM", ((Map)generalized).get("tj"));
        Assertions.assertEquals("V_", ((Map)generalized).get("j9Ht"));
    
        M_ realization = (M_) PojoUtils.realize(PojoUtils.generalize(O_o5Njo), M_.class, M_.class);
        Assertions.assertEquals(O_o5Njo, realization);
    
        Map<String, Object> LLe = new HashMap<>();
        LLe.put("Tj", "NM");
        LLe.put("J9Ht", "V_");
    
        M_ realization2 = (M_) PojoUtils.realize(LLe, M_.class, M_.class);
        Assertions.assertEquals(O_o5Njo, realization2);
    }

    class fk9 implements Serializable {
        private String NH;
        private String FfYGe;
    
        public void setT4x(String NH) {
            this.NH = NH;
        }
    
        public String getT4x() {
            return this.NH;
        }
    
        public void setW_(String FfYGe) {
            this.FfYGe = FfYGe;
        }
    
        public String getW_() {
            return this.FfYGe;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            fk9 that = (fk9) o;
            return Objects.equals(NH, that.NH) && Objects.equals(FfYGe, that.FfYGe);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(NH, FfYGe);
        }
    }

    @Test
    void test087() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        fk9 gjv = new fk9();
        gjv.setT4x("qh");
        gjv.setW_("UJ");
    
        Object generalized = PojoUtils.generalize(gjv);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("qh", ((Map)generalized).get("t4x"));
        Assertions.assertEquals("UJ", ((Map)generalized).get("w_"));
    
        fk9 realization = (fk9) PojoUtils.realize(PojoUtils.generalize(gjv), fk9.class, fk9.class);
        Assertions.assertEquals(gjv, realization);
    
        Map<String, Object> tut = new HashMap<>();
        tut.put("T4x", "qh");
        tut.put("W_", "UJ");
    
        fk9 realization2 = (fk9) PojoUtils.realize(tut, fk9.class, fk9.class);
        Assertions.assertEquals(gjv, realization2);
    }

    class B1U9 implements Serializable {
        private String UQqO;
    
        public void setUQqO(String UQqO) {
            this.UQqO = UQqO;
        }
    
        public String getUQqO() {
            return this.UQqO;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            B1U9 that = (B1U9) o;
            return Objects.equals(UQqO, that.UQqO);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(UQqO);
        }
    }

    @Test
    void test088() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        B1U9 AR = new B1U9();
        AR.setUQqO("TVYJA");
    
        Object generalized = PojoUtils.generalize(AR);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("TVYJA", ((Map)generalized).get("uQqO"));
    
        B1U9 realization = (B1U9) PojoUtils.realize(PojoUtils.generalize(AR), B1U9.class, B1U9.class);
        Assertions.assertEquals(AR, realization);
    
        Map<String, Object> nfv = new HashMap<>();
        nfv.put("UQqO", "TVYJA");
    
        B1U9 realization2 = (B1U9) PojoUtils.realize(nfv, B1U9.class, B1U9.class);
        Assertions.assertEquals(AR, realization2);
    }

    class d4H implements Serializable {
        private String MY;
        private String KnE;
        private String AV;
        private String PcP;
    
        public void setMY(String MY) {
            this.MY = MY;
        }
    
        public String getMY() {
            return this.MY;
        }
    
        public void setKnE(String KnE) {
            this.KnE = KnE;
        }
    
        public String getKnE() {
            return this.KnE;
        }
    
        public void setAV(String AV) {
            this.AV = AV;
        }
    
        public String getAV() {
            return this.AV;
        }
    
        public void setPcP(String PcP) {
            this.PcP = PcP;
        }
    
        public String getPcP() {
            return this.PcP;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            d4H that = (d4H) o;
            return Objects.equals(MY, that.MY) && Objects.equals(KnE, that.KnE) && Objects.equals(AV, that.AV) && Objects.equals(PcP, that.PcP);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(MY, KnE, AV, PcP);
        }
    }

    @Test
    void test099() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        d4H ih = new d4H();
        ih.setMY("fwg");
        ih.setKnE("Ly");
        ih.setAV("qk");
        ih.setPcP("hfoCOH");
    
        Object generalized = PojoUtils.generalize(ih);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("fwg", ((Map)generalized).get("mY"));
        Assertions.assertEquals("Ly", ((Map)generalized).get("knE"));
        Assertions.assertEquals("qk", ((Map)generalized).get("aV"));
        Assertions.assertEquals("hfoCOH", ((Map)generalized).get("pcP"));
    
        d4H realization = (d4H) PojoUtils.realize(PojoUtils.generalize(ih), d4H.class, d4H.class);
        Assertions.assertEquals(ih, realization);
    
        Map<String, Object> liJ = new HashMap<>();
        liJ.put("MY", "fwg");
        liJ.put("KnE", "Ly");
        liJ.put("AV", "qk");
        liJ.put("PcP", "hfoCOH");
    
        d4H realization2 = (d4H) PojoUtils.realize(liJ, d4H.class, d4H.class);
        Assertions.assertEquals(ih, realization2);
    }

    class ug implements Serializable {
        private String Uz;
        private String Z7kSk;
        private String NO;
    
        public void setMgyC(String Uz) {
            this.Uz = Uz;
        }
    
        public String getMgyC() {
            return this.Uz;
        }
    
        public void setZ7kSk(String Z7kSk) {
            this.Z7kSk = Z7kSk;
        }
    
        public String getZ7kSk() {
            return this.Z7kSk;
        }
    
        public void setNO(String NO) {
            this.NO = NO;
        }
    
        public String getNO() {
            return this.NO;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ug that = (ug) o;
            return Objects.equals(Uz, that.Uz) && Objects.equals(Z7kSk, that.Z7kSk) && Objects.equals(NO, that.NO);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Uz, Z7kSk, NO);
        }
    }

    @Test
    void test100() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        ug iCn = new ug();
        iCn.setMgyC("TO");
        iCn.setZ7kSk("OY");
        iCn.setNO("HP");
    
        Object generalized = PojoUtils.generalize(iCn);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("TO", ((Map)generalized).get("mgyC"));
        Assertions.assertEquals("OY", ((Map)generalized).get("z7kSk"));
        Assertions.assertEquals("HP", ((Map)generalized).get("nO"));
    
        ug realization = (ug) PojoUtils.realize(PojoUtils.generalize(iCn), ug.class, ug.class);
        Assertions.assertEquals(iCn, realization);
    
        Map<String, Object> oA5c = new HashMap<>();
        oA5c.put("MgyC", "TO");
        oA5c.put("Z7kSk", "OY");
        oA5c.put("NO", "HP");
    
        ug realization2 = (ug) PojoUtils.realize(oA5c, ug.class, ug.class);
        Assertions.assertEquals(iCn, realization2);
    }

    class an_ implements Serializable {
        private String YC;
    
        public void setNyEu(String YC) {
            this.YC = YC;
        }
    
        public String getNyEu() {
            return this.YC;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            an_ that = (an_) o;
            return Objects.equals(YC, that.YC);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(YC);
        }
    }

    @Test
    void test111() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        an_ cublp = new an_();
        cublp.setNyEu("yX");
    
        Object generalized = PojoUtils.generalize(cublp);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("yX", ((Map)generalized).get("nyEu"));
    
        an_ realization = (an_) PojoUtils.realize(PojoUtils.generalize(cublp), an_.class, an_.class);
        Assertions.assertEquals(cublp, realization);
    
        Map<String, Object> tl = new HashMap<>();
        tl.put("NyEu", "yX");
    
        an_ realization2 = (an_) PojoUtils.realize(tl, an_.class, an_.class);
        Assertions.assertEquals(cublp, realization2);
    }

    class XE implements Serializable {
        private String Rj8gtoK;
        private String Lo;
    
        public void setAekV(String Rj8gtoK) {
            this.Rj8gtoK = Rj8gtoK;
        }
    
        public String getAekV() {
            return this.Rj8gtoK;
        }
    
        public void setLo(String Lo) {
            this.Lo = Lo;
        }
    
        public String getLo() {
            return this.Lo;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            XE that = (XE) o;
            return Objects.equals(Rj8gtoK, that.Rj8gtoK) && Objects.equals(Lo, that.Lo);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Rj8gtoK, Lo);
        }
    }

    @Test
    void test116() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        XE i5 = new XE();
        i5.setAekV("Zm");
        i5.setLo("WPhCV");
    
        Object generalized = PojoUtils.generalize(i5);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Zm", ((Map)generalized).get("aekV"));
        Assertions.assertEquals("WPhCV", ((Map)generalized).get("lo"));
    
        XE realization = (XE) PojoUtils.realize(PojoUtils.generalize(i5), XE.class, XE.class);
        Assertions.assertEquals(i5, realization);
    
        Map<String, Object> m7bSf = new HashMap<>();
        m7bSf.put("AekV", "Zm");
        m7bSf.put("Lo", "WPhCV");
    
        XE realization2 = (XE) PojoUtils.realize(m7bSf, XE.class, XE.class);
        Assertions.assertEquals(i5, realization2);
    }

    class SL implements Serializable {
        private String Ev9r;
    
        public void setG1t(String Ev9r) {
            this.Ev9r = Ev9r;
        }
    
        public String getG1t() {
            return this.Ev9r;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SL that = (SL) o;
            return Objects.equals(Ev9r, that.Ev9r);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Ev9r);
        }
    }

    @Test
    void test118() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        SL fkv = new SL();
        fkv.setG1t("aP");
    
        Object generalized = PojoUtils.generalize(fkv);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("aP", ((Map)generalized).get("g1t"));
    
        SL realization = (SL) PojoUtils.realize(PojoUtils.generalize(fkv), SL.class, SL.class);
        Assertions.assertEquals(fkv, realization);
    
        Map<String, Object> BSK = new HashMap<>();
        BSK.put("G1t", "aP");
    
        SL realization2 = (SL) PojoUtils.realize(BSK, SL.class, SL.class);
        Assertions.assertEquals(fkv, realization2);
    }

    class Ex implements Serializable {
        private String W7k;
        private String VLP;
        private String ZYqb;
    
        public void setW7k(String W7k) {
            this.W7k = W7k;
        }
    
        public String getW7k() {
            return this.W7k;
        }
    
        public void setVLP(String VLP) {
            this.VLP = VLP;
        }
    
        public String getVLP() {
            return this.VLP;
        }
    
        public void setZYqb(String ZYqb) {
            this.ZYqb = ZYqb;
        }
    
        public String getZYqb() {
            return this.ZYqb;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ex that = (Ex) o;
            return Objects.equals(W7k, that.W7k) && Objects.equals(VLP, that.VLP) && Objects.equals(ZYqb, that.ZYqb);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(W7k, VLP, ZYqb);
        }
    }

    @Test
    void test121() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Ex yXgq = new Ex();
        yXgq.setW7k("s2V");
        yXgq.setVLP("A7J");
        yXgq.setZYqb("Zf");
    
        Object generalized = PojoUtils.generalize(yXgq);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("s2V", ((Map)generalized).get("w7k"));
        Assertions.assertEquals("A7J", ((Map)generalized).get("vLP"));
        Assertions.assertEquals("Zf", ((Map)generalized).get("zYqb"));
    
        Ex realization = (Ex) PojoUtils.realize(PojoUtils.generalize(yXgq), Ex.class, Ex.class);
        Assertions.assertEquals(yXgq, realization);
    
        Map<String, Object> uFWzpsd = new HashMap<>();
        uFWzpsd.put("W7k", "s2V");
        uFWzpsd.put("VLP", "A7J");
        uFWzpsd.put("ZYqb", "Zf");
    
        Ex realization2 = (Ex) PojoUtils.realize(uFWzpsd, Ex.class, Ex.class);
        Assertions.assertEquals(yXgq, realization2);
    }

    class fcB implements Serializable {
        private String Gatye;
        private String AJ0;
        private String Ljpe4eWw;
    
        public void setGatye(String Gatye) {
            this.Gatye = Gatye;
        }
    
        public String getGatye() {
            return this.Gatye;
        }
    
        public void setYt(String AJ0) {
            this.AJ0 = AJ0;
        }
    
        public String getYt() {
            return this.AJ0;
        }
    
        public void setTpA0t(String Ljpe4eWw) {
            this.Ljpe4eWw = Ljpe4eWw;
        }
    
        public String getTpA0t() {
            return this.Ljpe4eWw;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            fcB that = (fcB) o;
            return Objects.equals(Gatye, that.Gatye) && Objects.equals(AJ0, that.AJ0) && Objects.equals(Ljpe4eWw, that.Ljpe4eWw);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Gatye, AJ0, Ljpe4eWw);
        }
    }

    @Test
    void test122() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        fcB PM = new fcB();
        PM.setGatye("PM6");
        PM.setYt("kA");
        PM.setTpA0t("qAfY");
    
        Object generalized = PojoUtils.generalize(PM);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("PM6", ((Map)generalized).get("gatye"));
        Assertions.assertEquals("kA", ((Map)generalized).get("yt"));
        Assertions.assertEquals("qAfY", ((Map)generalized).get("tpA0t"));
    
        fcB realization = (fcB) PojoUtils.realize(PojoUtils.generalize(PM), fcB.class, fcB.class);
        Assertions.assertEquals(PM, realization);
    
        Map<String, Object> io = new HashMap<>();
        io.put("Gatye", "PM6");
        io.put("Yt", "kA");
        io.put("TpA0t", "qAfY");
    
        fcB realization2 = (fcB) PojoUtils.realize(io, fcB.class, fcB.class);
        Assertions.assertEquals(PM, realization2);
    }

    class xoIM implements Serializable {
        private String JbL;
        private String VGyr;
        private String AQr;
    
        public void setJbL(String JbL) {
            this.JbL = JbL;
        }
    
        public String getJbL() {
            return this.JbL;
        }
    
        public void setNG(String VGyr) {
            this.VGyr = VGyr;
        }
    
        public String getNG() {
            return this.VGyr;
        }
    
        public void setAQr(String AQr) {
            this.AQr = AQr;
        }
    
        public String getAQr() {
            return this.AQr;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            xoIM that = (xoIM) o;
            return Objects.equals(JbL, that.JbL) && Objects.equals(VGyr, that.VGyr) && Objects.equals(AQr, that.AQr);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(JbL, VGyr, AQr);
        }
    }

    @Test
    void test129() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        xoIM jZvEe = new xoIM();
        jZvEe.setJbL("LZSFz");
        jZvEe.setNG("HzLGs");
        jZvEe.setAQr("ELm");
    
        Object generalized = PojoUtils.generalize(jZvEe);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("LZSFz", ((Map)generalized).get("jbL"));
        Assertions.assertEquals("HzLGs", ((Map)generalized).get("nG"));
        Assertions.assertEquals("ELm", ((Map)generalized).get("aQr"));
    
        xoIM realization = (xoIM) PojoUtils.realize(PojoUtils.generalize(jZvEe), xoIM.class, xoIM.class);
        Assertions.assertEquals(jZvEe, realization);
    
        Map<String, Object> dW = new HashMap<>();
        dW.put("JbL", "LZSFz");
        dW.put("NG", "HzLGs");
        dW.put("AQr", "ELm");
    
        xoIM realization2 = (xoIM) PojoUtils.realize(dW, xoIM.class, xoIM.class);
        Assertions.assertEquals(jZvEe, realization2);
    }

    class kjyz implements Serializable {
        private String RTH;
    
        public void setRTH(String RTH) {
            this.RTH = RTH;
        }
    
        public String getRTH() {
            return this.RTH;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            kjyz that = (kjyz) o;
            return Objects.equals(RTH, that.RTH);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(RTH);
        }
    }

    @Test
    void test134() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        kjyz uPx3 = new kjyz();
        uPx3.setRTH("zphl6");
    
        Object generalized = PojoUtils.generalize(uPx3);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("zphl6", ((Map)generalized).get("rTH"));
    
        kjyz realization = (kjyz) PojoUtils.realize(PojoUtils.generalize(uPx3), kjyz.class, kjyz.class);
        Assertions.assertEquals(uPx3, realization);
    
        Map<String, Object> op3QT = new HashMap<>();
        op3QT.put("RTH", "zphl6");
    
        kjyz realization2 = (kjyz) PojoUtils.realize(op3QT, kjyz.class, kjyz.class);
        Assertions.assertEquals(uPx3, realization2);
    }

    class ap implements Serializable {
        private String BTlDJ;
        private String X7;
    
        public void setEA(String BTlDJ) {
            this.BTlDJ = BTlDJ;
        }
    
        public String getEA() {
            return this.BTlDJ;
        }
    
        public void setX7(String X7) {
            this.X7 = X7;
        }
    
        public String getX7() {
            return this.X7;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ap that = (ap) o;
            return Objects.equals(BTlDJ, that.BTlDJ) && Objects.equals(X7, that.X7);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(BTlDJ, X7);
        }
    }

    @Test
    void test137() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        ap CMS7b = new ap();
        CMS7b.setEA("vvfP");
        CMS7b.setX7("cULSJBzu");
    
        Object generalized = PojoUtils.generalize(CMS7b);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("vvfP", ((Map)generalized).get("eA"));
        Assertions.assertEquals("cULSJBzu", ((Map)generalized).get("x7"));
    
        ap realization = (ap) PojoUtils.realize(PojoUtils.generalize(CMS7b), ap.class, ap.class);
        Assertions.assertEquals(CMS7b, realization);
    
        Map<String, Object> jy = new HashMap<>();
        jy.put("EA", "vvfP");
        jy.put("X7", "cULSJBzu");
    
        ap realization2 = (ap) PojoUtils.realize(jy, ap.class, ap.class);
        Assertions.assertEquals(CMS7b, realization2);
    }

    class AU implements Serializable {
        private String Let;
        private String IL;
        private String D7Ei0;
    
        public void setLB(String Let) {
            this.Let = Let;
        }
    
        public String getLB() {
            return this.Let;
        }
    
        public void setDf(String IL) {
            this.IL = IL;
        }
    
        public String getDf() {
            return this.IL;
        }
    
        public void setDY(String D7Ei0) {
            this.D7Ei0 = D7Ei0;
        }
    
        public String getDY() {
            return this.D7Ei0;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            AU that = (AU) o;
            return Objects.equals(Let, that.Let) && Objects.equals(IL, that.IL) && Objects.equals(D7Ei0, that.D7Ei0);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Let, IL, D7Ei0);
        }
    }

    @Test
    void test139() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        AU gz = new AU();
        gz.setLB("ZobT");
        gz.setDf("Uk");
        gz.setDY("MhJ");
    
        Object generalized = PojoUtils.generalize(gz);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("ZobT", ((Map)generalized).get("lB"));
        Assertions.assertEquals("Uk", ((Map)generalized).get("df"));
        Assertions.assertEquals("MhJ", ((Map)generalized).get("dY"));
    
        AU realization = (AU) PojoUtils.realize(PojoUtils.generalize(gz), AU.class, AU.class);
        Assertions.assertEquals(gz, realization);
    
        Map<String, Object> yoh = new HashMap<>();
        yoh.put("LB", "ZobT");
        yoh.put("Df", "Uk");
        yoh.put("DY", "MhJ");
    
        AU realization2 = (AU) PojoUtils.realize(yoh, AU.class, AU.class);
        Assertions.assertEquals(gz, realization2);
    }

    class a_dif implements Serializable {
        private String Xq;
    
        public void setXq(String Xq) {
            this.Xq = Xq;
        }
    
        public String getXq() {
            return this.Xq;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            a_dif that = (a_dif) o;
            return Objects.equals(Xq, that.Xq);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Xq);
        }
    }

    @Test
    void test141() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        a_dif kjRR = new a_dif();
        kjRR.setXq("Zu");
    
        Object generalized = PojoUtils.generalize(kjRR);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Zu", ((Map)generalized).get("xq"));
    
        a_dif realization = (a_dif) PojoUtils.realize(PojoUtils.generalize(kjRR), a_dif.class, a_dif.class);
        Assertions.assertEquals(kjRR, realization);
    
        Map<String, Object> mkcKDdCnU = new HashMap<>();
        mkcKDdCnU.put("Xq", "Zu");
    
        a_dif realization2 = (a_dif) PojoUtils.realize(mkcKDdCnU, a_dif.class, a_dif.class);
        Assertions.assertEquals(kjRR, realization2);
    }

    class Ha implements Serializable {
        private String TC;
    
        public void setKrh(String TC) {
            this.TC = TC;
        }
    
        public String getKrh() {
            return this.TC;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ha that = (Ha) o;
            return Objects.equals(TC, that.TC);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(TC);
        }
    }

    @Test
    void test146() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Ha oId = new Ha();
        oId.setKrh("Zz");
    
        Object generalized = PojoUtils.generalize(oId);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Zz", ((Map)generalized).get("krh"));
    
        Ha realization = (Ha) PojoUtils.realize(PojoUtils.generalize(oId), Ha.class, Ha.class);
        Assertions.assertEquals(oId, realization);
    
        Map<String, Object> tkE = new HashMap<>();
        tkE.put("Krh", "Zz");
    
        Ha realization2 = (Ha) PojoUtils.realize(tkE, Ha.class, Ha.class);
        Assertions.assertEquals(oId, realization2);
    }

    class XJQ implements Serializable {
        private String YF;
    
        public void setKL(String YF) {
            this.YF = YF;
        }
    
        public String getKL() {
            return this.YF;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            XJQ that = (XJQ) o;
            return Objects.equals(YF, that.YF);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(YF);
        }
    }

    @Test
    void test148() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        XJQ BA = new XJQ();
        BA.setKL("VO");
    
        Object generalized = PojoUtils.generalize(BA);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("VO", ((Map)generalized).get("kL"));
    
        XJQ realization = (XJQ) PojoUtils.realize(PojoUtils.generalize(BA), XJQ.class, XJQ.class);
        Assertions.assertEquals(BA, realization);
    
        Map<String, Object> CKy_ = new HashMap<>();
        CKy_.put("KL", "VO");
    
        XJQ realization2 = (XJQ) PojoUtils.realize(CKy_, XJQ.class, XJQ.class);
        Assertions.assertEquals(BA, realization2);
    }

    class rY implements Serializable {
        private String AuP;
    
        public void setIja(String AuP) {
            this.AuP = AuP;
        }
    
        public String getIja() {
            return this.AuP;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            rY that = (rY) o;
            return Objects.equals(AuP, that.AuP);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(AuP);
        }
    }

    @Test
    void test152() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        rY l5uu = new rY();
        l5uu.setIja("Ev");
    
        Object generalized = PojoUtils.generalize(l5uu);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Ev", ((Map)generalized).get("ija"));
    
        rY realization = (rY) PojoUtils.realize(PojoUtils.generalize(l5uu), rY.class, rY.class);
        Assertions.assertEquals(l5uu, realization);
    
        Map<String, Object> tP = new HashMap<>();
        tP.put("Ija", "Ev");
    
        rY realization2 = (rY) PojoUtils.realize(tP, rY.class, rY.class);
        Assertions.assertEquals(l5uu, realization2);
    }

    class rl4 implements Serializable {
        private String Jq;
    
        public void setJq(String Jq) {
            this.Jq = Jq;
        }
    
        public String getJq() {
            return this.Jq;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            rl4 that = (rl4) o;
            return Objects.equals(Jq, that.Jq);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Jq);
        }
    }

    @Test
    void test153() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        rl4 v0 = new rl4();
        v0.setJq("q_");
    
        Object generalized = PojoUtils.generalize(v0);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("q_", ((Map)generalized).get("jq"));
    
        rl4 realization = (rl4) PojoUtils.realize(PojoUtils.generalize(v0), rl4.class, rl4.class);
        Assertions.assertEquals(v0, realization);
    
        Map<String, Object> uR = new HashMap<>();
        uR.put("Jq", "q_");
    
        rl4 realization2 = (rl4) PojoUtils.realize(uR, rl4.class, rl4.class);
        Assertions.assertEquals(v0, realization2);
    }

    class BJ4 implements Serializable {
        private String Nvw;
    
        public void setNvw(String Nvw) {
            this.Nvw = Nvw;
        }
    
        public String getNvw() {
            return this.Nvw;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BJ4 that = (BJ4) o;
            return Objects.equals(Nvw, that.Nvw);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Nvw);
        }
    }

    @Test
    void test158() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        BJ4 zX = new BJ4();
        zX.setNvw("fR");
    
        Object generalized = PojoUtils.generalize(zX);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("fR", ((Map)generalized).get("nvw"));
    
        BJ4 realization = (BJ4) PojoUtils.realize(PojoUtils.generalize(zX), BJ4.class, BJ4.class);
        Assertions.assertEquals(zX, realization);
    
        Map<String, Object> jYR = new HashMap<>();
        jYR.put("Nvw", "fR");
    
        BJ4 realization2 = (BJ4) PojoUtils.realize(jYR, BJ4.class, BJ4.class);
        Assertions.assertEquals(zX, realization2);
    }

    class TOwDl implements Serializable {
        private String UTU3ED;
        private String Vxg;
    
        public void setQiK(String UTU3ED) {
            this.UTU3ED = UTU3ED;
        }
    
        public String getQiK() {
            return this.UTU3ED;
        }
    
        public void setYi(String Vxg) {
            this.Vxg = Vxg;
        }
    
        public String getYi() {
            return this.Vxg;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TOwDl that = (TOwDl) o;
            return Objects.equals(UTU3ED, that.UTU3ED) && Objects.equals(Vxg, that.Vxg);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(UTU3ED, Vxg);
        }
    }

    @Test
    void test166() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        TOwDl GTf = new TOwDl();
        GTf.setQiK("KG");
        GTf.setYi("r5");
    
        Object generalized = PojoUtils.generalize(GTf);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("KG", ((Map)generalized).get("qiK"));
        Assertions.assertEquals("r5", ((Map)generalized).get("yi"));
    
        TOwDl realization = (TOwDl) PojoUtils.realize(PojoUtils.generalize(GTf), TOwDl.class, TOwDl.class);
        Assertions.assertEquals(GTf, realization);
    
        Map<String, Object> jp6 = new HashMap<>();
        jp6.put("QiK", "KG");
        jp6.put("Yi", "r5");
    
        TOwDl realization2 = (TOwDl) PojoUtils.realize(jp6, TOwDl.class, TOwDl.class);
        Assertions.assertEquals(GTf, realization2);
    }

    class TSEI implements Serializable {
        private String WPoV;
        private String TX;
    
        public void setWPoV(String WPoV) {
            this.WPoV = WPoV;
        }
    
        public String getWPoV() {
            return this.WPoV;
        }
    
        public void setTX(String TX) {
            this.TX = TX;
        }
    
        public String getTX() {
            return this.TX;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TSEI that = (TSEI) o;
            return Objects.equals(WPoV, that.WPoV) && Objects.equals(TX, that.TX);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(WPoV, TX);
        }
    }

    @Test
    void test172() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        TSEI VU = new TSEI();
        VU.setWPoV("Vwi");
        VU.setTX("TIOT");
    
        Object generalized = PojoUtils.generalize(VU);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Vwi", ((Map)generalized).get("wPoV"));
        Assertions.assertEquals("TIOT", ((Map)generalized).get("tX"));
    
        TSEI realization = (TSEI) PojoUtils.realize(PojoUtils.generalize(VU), TSEI.class, TSEI.class);
        Assertions.assertEquals(VU, realization);
    
        Map<String, Object> Id = new HashMap<>();
        Id.put("WPoV", "Vwi");
        Id.put("TX", "TIOT");
    
        TSEI realization2 = (TSEI) PojoUtils.realize(Id, TSEI.class, TSEI.class);
        Assertions.assertEquals(VU, realization2);
    }

    class rk implements Serializable {
        private String Da;
        private String Zd;
    
        public void setDa(String Da) {
            this.Da = Da;
        }
    
        public String getDa() {
            return this.Da;
        }
    
        public void setAmf(String Zd) {
            this.Zd = Zd;
        }
    
        public String getAmf() {
            return this.Zd;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            rk that = (rk) o;
            return Objects.equals(Da, that.Da) && Objects.equals(Zd, that.Zd);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Da, Zd);
        }
    }

    @Test
    void test175() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        rk W0 = new rk();
        W0.setDa("Uz");
        W0.setAmf("lDDI");
    
        Object generalized = PojoUtils.generalize(W0);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Uz", ((Map)generalized).get("da"));
        Assertions.assertEquals("lDDI", ((Map)generalized).get("amf"));
    
        rk realization = (rk) PojoUtils.realize(PojoUtils.generalize(W0), rk.class, rk.class);
        Assertions.assertEquals(W0, realization);
    
        Map<String, Object> Iwg = new HashMap<>();
        Iwg.put("Da", "Uz");
        Iwg.put("Amf", "lDDI");
    
        rk realization2 = (rk) PojoUtils.realize(Iwg, rk.class, rk.class);
        Assertions.assertEquals(W0, realization2);
    }

    class l5M implements Serializable {
        private String FCO;
        private String Nb;
        private String PQ;
    
        public void setFCO(String FCO) {
            this.FCO = FCO;
        }
    
        public String getFCO() {
            return this.FCO;
        }
    
        public void setGnb(String Nb) {
            this.Nb = Nb;
        }
    
        public String getGnb() {
            return this.Nb;
        }
    
        public void setFi8(String PQ) {
            this.PQ = PQ;
        }
    
        public String getFi8() {
            return this.PQ;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            l5M that = (l5M) o;
            return Objects.equals(FCO, that.FCO) && Objects.equals(Nb, that.Nb) && Objects.equals(PQ, that.PQ);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(FCO, Nb, PQ);
        }
    }

    @Test
    void test176() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        l5M rts = new l5M();
        rts.setFCO("G7Q");
        rts.setGnb("NvU");
        rts.setFi8("j9Kr");
    
        Object generalized = PojoUtils.generalize(rts);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("G7Q", ((Map)generalized).get("fCO"));
        Assertions.assertEquals("NvU", ((Map)generalized).get("gnb"));
        Assertions.assertEquals("j9Kr", ((Map)generalized).get("fi8"));
    
        l5M realization = (l5M) PojoUtils.realize(PojoUtils.generalize(rts), l5M.class, l5M.class);
        Assertions.assertEquals(rts, realization);
    
        Map<String, Object> gQPx = new HashMap<>();
        gQPx.put("FCO", "G7Q");
        gQPx.put("Gnb", "NvU");
        gQPx.put("Fi8", "j9Kr");
    
        l5M realization2 = (l5M) PojoUtils.realize(gQPx, l5M.class, l5M.class);
        Assertions.assertEquals(rts, realization2);
    }

    class ukZEr3 implements Serializable {
        private String K2;
        private String P3;
    
        public void setK2(String K2) {
            this.K2 = K2;
        }
    
        public String getK2() {
            return this.K2;
        }
    
        public void setP3(String P3) {
            this.P3 = P3;
        }
    
        public String getP3() {
            return this.P3;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ukZEr3 that = (ukZEr3) o;
            return Objects.equals(K2, that.K2) && Objects.equals(P3, that.P3);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(K2, P3);
        }
    }

    @Test
    void test178() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        ukZEr3 aC = new ukZEr3();
        aC.setK2("fn");
        aC.setP3("Ik");
    
        Object generalized = PojoUtils.generalize(aC);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("fn", ((Map)generalized).get("k2"));
        Assertions.assertEquals("Ik", ((Map)generalized).get("p3"));
    
        ukZEr3 realization = (ukZEr3) PojoUtils.realize(PojoUtils.generalize(aC), ukZEr3.class, ukZEr3.class);
        Assertions.assertEquals(aC, realization);
    
        Map<String, Object> mE = new HashMap<>();
        mE.put("K2", "fn");
        mE.put("P3", "Ik");
    
        ukZEr3 realization2 = (ukZEr3) PojoUtils.realize(mE, ukZEr3.class, ukZEr3.class);
        Assertions.assertEquals(aC, realization2);
    }

    class xxY implements Serializable {
        private String Gd;
    
        public void setChuAJBH(String Gd) {
            this.Gd = Gd;
        }
    
        public String getChuAJBH() {
            return this.Gd;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            xxY that = (xxY) o;
            return Objects.equals(Gd, that.Gd);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Gd);
        }
    }

    @Test
    void test181() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        xxY VFYG = new xxY();
        VFYG.setChuAJBH("L_");
    
        Object generalized = PojoUtils.generalize(VFYG);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("L_", ((Map)generalized).get("chuAJBH"));
    
        xxY realization = (xxY) PojoUtils.realize(PojoUtils.generalize(VFYG), xxY.class, xxY.class);
        Assertions.assertEquals(VFYG, realization);
    
        Map<String, Object> u6Gl = new HashMap<>();
        u6Gl.put("ChuAJBH", "L_");
    
        xxY realization2 = (xxY) PojoUtils.realize(u6Gl, xxY.class, xxY.class);
        Assertions.assertEquals(VFYG, realization2);
    }

    class yw implements Serializable {
        private String J7W;
        private String CcryK;
        private String E2;
    
        public void setJ7W(String J7W) {
            this.J7W = J7W;
        }
    
        public String getJ7W() {
            return this.J7W;
        }
    
        public void setCcryK(String CcryK) {
            this.CcryK = CcryK;
        }
    
        public String getCcryK() {
            return this.CcryK;
        }
    
        public void setDzK(String E2) {
            this.E2 = E2;
        }
    
        public String getDzK() {
            return this.E2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            yw that = (yw) o;
            return Objects.equals(J7W, that.J7W) && Objects.equals(CcryK, that.CcryK) && Objects.equals(E2, that.E2);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(J7W, CcryK, E2);
        }
    }

    @Test
    void test182() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        yw q45z = new yw();
        q45z.setJ7W("X5");
        q45z.setCcryK("Zn");
        q45z.setDzK("cTzs");
    
        Object generalized = PojoUtils.generalize(q45z);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("X5", ((Map)generalized).get("j7W"));
        Assertions.assertEquals("Zn", ((Map)generalized).get("ccryK"));
        Assertions.assertEquals("cTzs", ((Map)generalized).get("dzK"));
    
        yw realization = (yw) PojoUtils.realize(PojoUtils.generalize(q45z), yw.class, yw.class);
        Assertions.assertEquals(q45z, realization);
    
        Map<String, Object> D2m = new HashMap<>();
        D2m.put("J7W", "X5");
        D2m.put("CcryK", "Zn");
        D2m.put("DzK", "cTzs");
    
        yw realization2 = (yw) PojoUtils.realize(D2m, yw.class, yw.class);
        Assertions.assertEquals(q45z, realization2);
    }

    class pFs implements Serializable {
        private String Tp;
    
        public void setTp(String Tp) {
            this.Tp = Tp;
        }
    
        public String getTp() {
            return this.Tp;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            pFs that = (pFs) o;
            return Objects.equals(Tp, that.Tp);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Tp);
        }
    }

    @Test
    void test186() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        pFs gt = new pFs();
        gt.setTp("SKGal");
    
        Object generalized = PojoUtils.generalize(gt);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("SKGal", ((Map)generalized).get("tp"));
    
        pFs realization = (pFs) PojoUtils.realize(PojoUtils.generalize(gt), pFs.class, pFs.class);
        Assertions.assertEquals(gt, realization);
    
        Map<String, Object> aB = new HashMap<>();
        aB.put("Tp", "SKGal");
    
        pFs realization2 = (pFs) PojoUtils.realize(aB, pFs.class, pFs.class);
        Assertions.assertEquals(gt, realization2);
    }

    class tNhf implements Serializable {
        private String EFOJ;
    
        public void setEFOJ(String EFOJ) {
            this.EFOJ = EFOJ;
        }
    
        public String getEFOJ() {
            return this.EFOJ;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            tNhf that = (tNhf) o;
            return Objects.equals(EFOJ, that.EFOJ);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(EFOJ);
        }
    }

    @Test
    void test190() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        tNhf AX = new tNhf();
        AX.setEFOJ("jZ");
    
        Object generalized = PojoUtils.generalize(AX);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("jZ", ((Map)generalized).get("eFOJ"));
    
        tNhf realization = (tNhf) PojoUtils.realize(PojoUtils.generalize(AX), tNhf.class, tNhf.class);
        Assertions.assertEquals(AX, realization);
    
        Map<String, Object> ST = new HashMap<>();
        ST.put("EFOJ", "jZ");
    
        tNhf realization2 = (tNhf) PojoUtils.realize(ST, tNhf.class, tNhf.class);
        Assertions.assertEquals(AX, realization2);
    }

    class we implements Serializable {
        private String DUd;
    
        public void setITS7H(String DUd) {
            this.DUd = DUd;
        }
    
        public String getITS7H() {
            return this.DUd;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            we that = (we) o;
            return Objects.equals(DUd, that.DUd);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(DUd);
        }
    }

    @Test
    void test192() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        we Yru = new we();
        Yru.setITS7H("OM");
    
        Object generalized = PojoUtils.generalize(Yru);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("OM", ((Map)generalized).get("iTS7H"));
    
        we realization = (we) PojoUtils.realize(PojoUtils.generalize(Yru), we.class, we.class);
        Assertions.assertEquals(Yru, realization);
    
        Map<String, Object> NqzEul = new HashMap<>();
        NqzEul.put("ITS7H", "OM");
    
        we realization2 = (we) PojoUtils.realize(NqzEul, we.class, we.class);
        Assertions.assertEquals(Yru, realization2);
    }

    class il63 implements Serializable {
        private String UfMP;
    
        public void setUfMP(String UfMP) {
            this.UfMP = UfMP;
        }
    
        public String getUfMP() {
            return this.UfMP;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            il63 that = (il63) o;
            return Objects.equals(UfMP, that.UfMP);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(UfMP);
        }
    }

    @Test
    void test197() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        il63 Ht = new il63();
        Ht.setUfMP("kPRI");
    
        Object generalized = PojoUtils.generalize(Ht);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("kPRI", ((Map)generalized).get("ufMP"));
    
        il63 realization = (il63) PojoUtils.realize(PojoUtils.generalize(Ht), il63.class, il63.class);
        Assertions.assertEquals(Ht, realization);
    
        Map<String, Object> EV = new HashMap<>();
        EV.put("UfMP", "kPRI");
    
        il63 realization2 = (il63) PojoUtils.realize(EV, il63.class, il63.class);
        Assertions.assertEquals(Ht, realization2);
    }

    class D7h implements Serializable {
        private String Y3;
    
        public void setY3(String Y3) {
            this.Y3 = Y3;
        }
    
        public String getY3() {
            return this.Y3;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            D7h that = (D7h) o;
            return Objects.equals(Y3, that.Y3);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Y3);
        }
    }

    @Test
    void test199() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        D7h Kp = new D7h();
        Kp.setY3("lE");
    
        Object generalized = PojoUtils.generalize(Kp);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("lE", ((Map)generalized).get("y3"));
    
        D7h realization = (D7h) PojoUtils.realize(PojoUtils.generalize(Kp), D7h.class, D7h.class);
        Assertions.assertEquals(Kp, realization);
    
        Map<String, Object> sm = new HashMap<>();
        sm.put("Y3", "lE");
    
        D7h realization2 = (D7h) PojoUtils.realize(sm, D7h.class, D7h.class);
        Assertions.assertEquals(Kp, realization2);
    }

    class xp implements Serializable {
        private String Dn;
    
        public void setOv(String Dn) {
            this.Dn = Dn;
        }
    
        public String getOv() {
            return this.Dn;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            xp that = (xp) o;
            return Objects.equals(Dn, that.Dn);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Dn);
        }
    }

    @Test
    void test204() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        xp wd = new xp();
        wd.setOv("yf");
    
        Object generalized = PojoUtils.generalize(wd);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("yf", ((Map)generalized).get("ov"));
    
        xp realization = (xp) PojoUtils.realize(PojoUtils.generalize(wd), xp.class, xp.class);
        Assertions.assertEquals(wd, realization);
    
        Map<String, Object> Bn = new HashMap<>();
        Bn.put("Ov", "yf");
    
        xp realization2 = (xp) PojoUtils.realize(Bn, xp.class, xp.class);
        Assertions.assertEquals(wd, realization2);
    }

    class NHb implements Serializable {
        private String BTI;
    
        public void setL3(String BTI) {
            this.BTI = BTI;
        }
    
        public String getL3() {
            return this.BTI;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NHb that = (NHb) o;
            return Objects.equals(BTI, that.BTI);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(BTI);
        }
    }

    @Test
    void test206() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        NHb ovN = new NHb();
        ovN.setL3("nk4kYv");
    
        Object generalized = PojoUtils.generalize(ovN);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("nk4kYv", ((Map)generalized).get("l3"));
    
        NHb realization = (NHb) PojoUtils.realize(PojoUtils.generalize(ovN), NHb.class, NHb.class);
        Assertions.assertEquals(ovN, realization);
    
        Map<String, Object> ebS6 = new HashMap<>();
        ebS6.put("L3", "nk4kYv");
    
        NHb realization2 = (NHb) PojoUtils.realize(ebS6, NHb.class, NHb.class);
        Assertions.assertEquals(ovN, realization2);
    }

    class EG4h implements Serializable {
        private String Jw;
        private String UC0zi;
        private String OyIF;
    
        public void setNxqG(String Jw) {
            this.Jw = Jw;
        }
    
        public String getNxqG() {
            return this.Jw;
        }
    
        public void setUC0zi(String UC0zi) {
            this.UC0zi = UC0zi;
        }
    
        public String getUC0zi() {
            return this.UC0zi;
        }
    
        public void setOyIF(String OyIF) {
            this.OyIF = OyIF;
        }
    
        public String getOyIF() {
            return this.OyIF;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EG4h that = (EG4h) o;
            return Objects.equals(Jw, that.Jw) && Objects.equals(UC0zi, that.UC0zi) && Objects.equals(OyIF, that.OyIF);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Jw, UC0zi, OyIF);
        }
    }

    @Test
    void test212() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        EG4h ZG = new EG4h();
        ZG.setNxqG("tMvYPK");
        ZG.setUC0zi("Vz");
        ZG.setOyIF("OV");
    
        Object generalized = PojoUtils.generalize(ZG);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("tMvYPK", ((Map)generalized).get("nxqG"));
        Assertions.assertEquals("Vz", ((Map)generalized).get("uC0zi"));
        Assertions.assertEquals("OV", ((Map)generalized).get("oyIF"));
    
        EG4h realization = (EG4h) PojoUtils.realize(PojoUtils.generalize(ZG), EG4h.class, EG4h.class);
        Assertions.assertEquals(ZG, realization);
    
        Map<String, Object> Jz = new HashMap<>();
        Jz.put("NxqG", "tMvYPK");
        Jz.put("UC0zi", "Vz");
        Jz.put("OyIF", "OV");
    
        EG4h realization2 = (EG4h) PojoUtils.realize(Jz, EG4h.class, EG4h.class);
        Assertions.assertEquals(ZG, realization2);
    }

    class fl implements Serializable {
        private String Vmp;
        private String QU;
        private String UKfj1;
        private String WW;
    
        public void setJQD(String Vmp) {
            this.Vmp = Vmp;
        }
    
        public String getJQD() {
            return this.Vmp;
        }
    
        public void setWJeX(String QU) {
            this.QU = QU;
        }
    
        public String getWJeX() {
            return this.QU;
        }
    
        public void setRY8fr(String UKfj1) {
            this.UKfj1 = UKfj1;
        }
    
        public String getRY8fr() {
            return this.UKfj1;
        }
    
        public void setEU(String WW) {
            this.WW = WW;
        }
    
        public String getEU() {
            return this.WW;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            fl that = (fl) o;
            return Objects.equals(Vmp, that.Vmp) && Objects.equals(QU, that.QU) && Objects.equals(UKfj1, that.UKfj1) && Objects.equals(WW, that.WW);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Vmp, QU, UKfj1, WW);
        }
    }

    @Test
    void test213() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        fl lGJ = new fl();
        lGJ.setJQD("x8");
        lGJ.setWJeX("l30");
        lGJ.setRY8fr("fM");
        lGJ.setEU("R9ds");
    
        Object generalized = PojoUtils.generalize(lGJ);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("x8", ((Map)generalized).get("jQD"));
        Assertions.assertEquals("l30", ((Map)generalized).get("wJeX"));
        Assertions.assertEquals("fM", ((Map)generalized).get("rY8fr"));
        Assertions.assertEquals("R9ds", ((Map)generalized).get("eU"));
    
        fl realization = (fl) PojoUtils.realize(PojoUtils.generalize(lGJ), fl.class, fl.class);
        Assertions.assertEquals(lGJ, realization);
    
        Map<String, Object> JudeJ = new HashMap<>();
        JudeJ.put("JQD", "x8");
        JudeJ.put("WJeX", "l30");
        JudeJ.put("RY8fr", "fM");
        JudeJ.put("EU", "R9ds");
    
        fl realization2 = (fl) PojoUtils.realize(JudeJ, fl.class, fl.class);
        Assertions.assertEquals(lGJ, realization2);
    }

    class B5 implements Serializable {
        private String RD;
    
        public void setRD(String RD) {
            this.RD = RD;
        }
    
        public String getRD() {
            return this.RD;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            B5 that = (B5) o;
            return Objects.equals(RD, that.RD);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(RD);
        }
    }

    @Test
    void test217() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        B5 sVvM34D = new B5();
        sVvM34D.setRD("RAIW");
    
        Object generalized = PojoUtils.generalize(sVvM34D);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("RAIW", ((Map)generalized).get("rD"));
    
        B5 realization = (B5) PojoUtils.realize(PojoUtils.generalize(sVvM34D), B5.class, B5.class);
        Assertions.assertEquals(sVvM34D, realization);
    
        Map<String, Object> h6 = new HashMap<>();
        h6.put("RD", "RAIW");
    
        B5 realization2 = (B5) PojoUtils.realize(h6, B5.class, B5.class);
        Assertions.assertEquals(sVvM34D, realization2);
    }

    class Wm implements Serializable {
        private String QW;
        private String Td;
        private String WVN;
    
        public void setUs(String QW) {
            this.QW = QW;
        }
    
        public String getUs() {
            return this.QW;
        }
    
        public void setOEMh(String Td) {
            this.Td = Td;
        }
    
        public String getOEMh() {
            return this.Td;
        }
    
        public void setWVN(String WVN) {
            this.WVN = WVN;
        }
    
        public String getWVN() {
            return this.WVN;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Wm that = (Wm) o;
            return Objects.equals(QW, that.QW) && Objects.equals(Td, that.Td) && Objects.equals(WVN, that.WVN);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(QW, Td, WVN);
        }
    }

    @Test
    void test221() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Wm Px = new Wm();
        Px.setUs("Xj");
        Px.setOEMh("boOx");
        Px.setWVN("R5q");
    
        Object generalized = PojoUtils.generalize(Px);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Xj", ((Map)generalized).get("us"));
        Assertions.assertEquals("boOx", ((Map)generalized).get("oEMh"));
        Assertions.assertEquals("R5q", ((Map)generalized).get("wVN"));
    
        Wm realization = (Wm) PojoUtils.realize(PojoUtils.generalize(Px), Wm.class, Wm.class);
        Assertions.assertEquals(Px, realization);
    
        Map<String, Object> OH = new HashMap<>();
        OH.put("Us", "Xj");
        OH.put("OEMh", "boOx");
        OH.put("WVN", "R5q");
    
        Wm realization2 = (Wm) PojoUtils.realize(OH, Wm.class, Wm.class);
        Assertions.assertEquals(Px, realization2);
    }

    class HFAc implements Serializable {
        private String A4;
    
        public void setA4(String A4) {
            this.A4 = A4;
        }
    
        public String getA4() {
            return this.A4;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HFAc that = (HFAc) o;
            return Objects.equals(A4, that.A4);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(A4);
        }
    }

    @Test
    void test223() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        HFAc m_8aFK = new HFAc();
        m_8aFK.setA4("wcd9f7");
    
        Object generalized = PojoUtils.generalize(m_8aFK);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("wcd9f7", ((Map)generalized).get("a4"));
    
        HFAc realization = (HFAc) PojoUtils.realize(PojoUtils.generalize(m_8aFK), HFAc.class, HFAc.class);
        Assertions.assertEquals(m_8aFK, realization);
    
        Map<String, Object> u8KO = new HashMap<>();
        u8KO.put("A4", "wcd9f7");
    
        HFAc realization2 = (HFAc) PojoUtils.realize(u8KO, HFAc.class, HFAc.class);
        Assertions.assertEquals(m_8aFK, realization2);
    }

    class QhnN implements Serializable {
        private String TG;
        private String RIZ;
        private String M5;
    
        public void setTG(String TG) {
            this.TG = TG;
        }
    
        public String getTG() {
            return this.TG;
        }
    
        public void setRIZ(String RIZ) {
            this.RIZ = RIZ;
        }
    
        public String getRIZ() {
            return this.RIZ;
        }
    
        public void setM5(String M5) {
            this.M5 = M5;
        }
    
        public String getM5() {
            return this.M5;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            QhnN that = (QhnN) o;
            return Objects.equals(TG, that.TG) && Objects.equals(RIZ, that.RIZ) && Objects.equals(M5, that.M5);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(TG, RIZ, M5);
        }
    }

    @Test
    void test224() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        QhnN F8R = new QhnN();
        F8R.setTG("RCp");
        F8R.setRIZ("dPQ");
        F8R.setM5("iL");
    
        Object generalized = PojoUtils.generalize(F8R);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("RCp", ((Map)generalized).get("tG"));
        Assertions.assertEquals("dPQ", ((Map)generalized).get("rIZ"));
        Assertions.assertEquals("iL", ((Map)generalized).get("m5"));
    
        QhnN realization = (QhnN) PojoUtils.realize(PojoUtils.generalize(F8R), QhnN.class, QhnN.class);
        Assertions.assertEquals(F8R, realization);
    
        Map<String, Object> A2 = new HashMap<>();
        A2.put("TG", "RCp");
        A2.put("RIZ", "dPQ");
        A2.put("M5", "iL");
    
        QhnN realization2 = (QhnN) PojoUtils.realize(A2, QhnN.class, QhnN.class);
        Assertions.assertEquals(F8R, realization2);
    }

    class sf implements Serializable {
        private String IUB;
    
        public void setIUB(String IUB) {
            this.IUB = IUB;
        }
    
        public String getIUB() {
            return this.IUB;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            sf that = (sf) o;
            return Objects.equals(IUB, that.IUB);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(IUB);
        }
    }

    @Test
    void test225() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        sf Xps = new sf();
        Xps.setIUB("VJ_rG");
    
        Object generalized = PojoUtils.generalize(Xps);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("VJ_rG", ((Map)generalized).get("iUB"));
    
        sf realization = (sf) PojoUtils.realize(PojoUtils.generalize(Xps), sf.class, sf.class);
        Assertions.assertEquals(Xps, realization);
    
        Map<String, Object> wOfd = new HashMap<>();
        wOfd.put("IUB", "VJ_rG");
    
        sf realization2 = (sf) PojoUtils.realize(wOfd, sf.class, sf.class);
        Assertions.assertEquals(Xps, realization2);
    }

    class lKa implements Serializable {
        private String Ko;
    
        public void setKo(String Ko) {
            this.Ko = Ko;
        }
    
        public String getKo() {
            return this.Ko;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            lKa that = (lKa) o;
            return Objects.equals(Ko, that.Ko);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Ko);
        }
    }

    @Test
    void test231() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        lKa Zk = new lKa();
        Zk.setKo("xI");
    
        Object generalized = PojoUtils.generalize(Zk);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("xI", ((Map)generalized).get("ko"));
    
        lKa realization = (lKa) PojoUtils.realize(PojoUtils.generalize(Zk), lKa.class, lKa.class);
        Assertions.assertEquals(Zk, realization);
    
        Map<String, Object> BH1 = new HashMap<>();
        BH1.put("Ko", "xI");
    
        lKa realization2 = (lKa) PojoUtils.realize(BH1, lKa.class, lKa.class);
        Assertions.assertEquals(Zk, realization2);
    }

    class p67J implements Serializable {
        private String PROq;
    
        public void setPROq(String PROq) {
            this.PROq = PROq;
        }
    
        public String getPROq() {
            return this.PROq;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            p67J that = (p67J) o;
            return Objects.equals(PROq, that.PROq);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(PROq);
        }
    }

    @Test
    void test233() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        p67J KU = new p67J();
        KU.setPROq("FVvm_");
    
        Object generalized = PojoUtils.generalize(KU);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("FVvm_", ((Map)generalized).get("pROq"));
    
        p67J realization = (p67J) PojoUtils.realize(PojoUtils.generalize(KU), p67J.class, p67J.class);
        Assertions.assertEquals(KU, realization);
    
        Map<String, Object> B1A = new HashMap<>();
        B1A.put("PROq", "FVvm_");
    
        p67J realization2 = (p67J) PojoUtils.realize(B1A, p67J.class, p67J.class);
        Assertions.assertEquals(KU, realization2);
    }

    class te4 implements Serializable {
        private String J9d;
        private String K2H;
    
        public void setGs(String J9d) {
            this.J9d = J9d;
        }
    
        public String getGs() {
            return this.J9d;
        }
    
        public void setFS(String K2H) {
            this.K2H = K2H;
        }
    
        public String getFS() {
            return this.K2H;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            te4 that = (te4) o;
            return Objects.equals(J9d, that.J9d) && Objects.equals(K2H, that.K2H);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(J9d, K2H);
        }
    }

    @Test
    void test234() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        te4 dTl_ = new te4();
        dTl_.setGs("dMDw");
        dTl_.setFS("zQ");
    
        Object generalized = PojoUtils.generalize(dTl_);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("dMDw", ((Map)generalized).get("gs"));
        Assertions.assertEquals("zQ", ((Map)generalized).get("fS"));
    
        te4 realization = (te4) PojoUtils.realize(PojoUtils.generalize(dTl_), te4.class, te4.class);
        Assertions.assertEquals(dTl_, realization);
    
        Map<String, Object> oYoT = new HashMap<>();
        oYoT.put("Gs", "dMDw");
        oYoT.put("FS", "zQ");
    
        te4 realization2 = (te4) PojoUtils.realize(oYoT, te4.class, te4.class);
        Assertions.assertEquals(dTl_, realization2);
    }

    class xWj implements Serializable {
        private String YH;
        private String X4HL;
        private String NmXyDeW2;
    
        public void setYH(String YH) {
            this.YH = YH;
        }
    
        public String getYH() {
            return this.YH;
        }
    
        public void setRUfobT6(String X4HL) {
            this.X4HL = X4HL;
        }
    
        public String getRUfobT6() {
            return this.X4HL;
        }
    
        public void setKsi(String NmXyDeW2) {
            this.NmXyDeW2 = NmXyDeW2;
        }
    
        public String getKsi() {
            return this.NmXyDeW2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            xWj that = (xWj) o;
            return Objects.equals(YH, that.YH) && Objects.equals(X4HL, that.X4HL) && Objects.equals(NmXyDeW2, that.NmXyDeW2);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(YH, X4HL, NmXyDeW2);
        }
    }

    @Test
    void test235() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        xWj bS = new xWj();
        bS.setYH("xY");
        bS.setRUfobT6("bl");
        bS.setKsi("IBm");
    
        Object generalized = PojoUtils.generalize(bS);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("xY", ((Map)generalized).get("yH"));
        Assertions.assertEquals("bl", ((Map)generalized).get("rUfobT6"));
        Assertions.assertEquals("IBm", ((Map)generalized).get("ksi"));
    
        xWj realization = (xWj) PojoUtils.realize(PojoUtils.generalize(bS), xWj.class, xWj.class);
        Assertions.assertEquals(bS, realization);
    
        Map<String, Object> t4VAZ = new HashMap<>();
        t4VAZ.put("YH", "xY");
        t4VAZ.put("RUfobT6", "bl");
        t4VAZ.put("Ksi", "IBm");
    
        xWj realization2 = (xWj) PojoUtils.realize(t4VAZ, xWj.class, xWj.class);
        Assertions.assertEquals(bS, realization2);
    }

    class Pp implements Serializable {
        private String W0;
    
        public void setTJUohH(String W0) {
            this.W0 = W0;
        }
    
        public String getTJUohH() {
            return this.W0;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pp that = (Pp) o;
            return Objects.equals(W0, that.W0);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(W0);
        }
    }

    @Test
    void test239() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Pp kug = new Pp();
        kug.setTJUohH("o7O");
    
        Object generalized = PojoUtils.generalize(kug);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("o7O", ((Map)generalized).get("tJUohH"));
    
        Pp realization = (Pp) PojoUtils.realize(PojoUtils.generalize(kug), Pp.class, Pp.class);
        Assertions.assertEquals(kug, realization);
    
        Map<String, Object> xi = new HashMap<>();
        xi.put("TJUohH", "o7O");
    
        Pp realization2 = (Pp) PojoUtils.realize(xi, Pp.class, Pp.class);
        Assertions.assertEquals(kug, realization2);
    }

    class O2PC implements Serializable {
        private String OFKz;
        private String UrDY;
        private String HKRPsdr;
        private String D0AX;
    
        public void setO2o(String OFKz) {
            this.OFKz = OFKz;
        }
    
        public String getO2o() {
            return this.OFKz;
        }
    
        public void setP578F1(String UrDY) {
            this.UrDY = UrDY;
        }
    
        public String getP578F1() {
            return this.UrDY;
        }
    
        public void setDv(String HKRPsdr) {
            this.HKRPsdr = HKRPsdr;
        }
    
        public String getDv() {
            return this.HKRPsdr;
        }
    
        public void setD0AX(String D0AX) {
            this.D0AX = D0AX;
        }
    
        public String getD0AX() {
            return this.D0AX;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            O2PC that = (O2PC) o;
            return Objects.equals(OFKz, that.OFKz) && Objects.equals(UrDY, that.UrDY) && Objects.equals(HKRPsdr, that.HKRPsdr) && Objects.equals(D0AX, that.D0AX);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(OFKz, UrDY, HKRPsdr, D0AX);
        }
    }

    @Test
    void test241() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        O2PC V6MfY = new O2PC();
        V6MfY.setO2o("An");
        V6MfY.setP578F1("qmg5r");
        V6MfY.setDv("Sx1");
        V6MfY.setD0AX("xs");
    
        Object generalized = PojoUtils.generalize(V6MfY);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("An", ((Map)generalized).get("o2o"));
        Assertions.assertEquals("qmg5r", ((Map)generalized).get("p578F1"));
        Assertions.assertEquals("Sx1", ((Map)generalized).get("dv"));
        Assertions.assertEquals("xs", ((Map)generalized).get("d0AX"));
    
        O2PC realization = (O2PC) PojoUtils.realize(PojoUtils.generalize(V6MfY), O2PC.class, O2PC.class);
        Assertions.assertEquals(V6MfY, realization);
    
        Map<String, Object> Uv = new HashMap<>();
        Uv.put("O2o", "An");
        Uv.put("P578F1", "qmg5r");
        Uv.put("Dv", "Sx1");
        Uv.put("D0AX", "xs");
    
        O2PC realization2 = (O2PC) PojoUtils.realize(Uv, O2PC.class, O2PC.class);
        Assertions.assertEquals(V6MfY, realization2);
    }

    class gU implements Serializable {
        private String PY2Y;
        private String Fi;
    
        public void setPY2Y(String PY2Y) {
            this.PY2Y = PY2Y;
        }
    
        public String getPY2Y() {
            return this.PY2Y;
        }
    
        public void setCk(String Fi) {
            this.Fi = Fi;
        }
    
        public String getCk() {
            return this.Fi;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            gU that = (gU) o;
            return Objects.equals(PY2Y, that.PY2Y) && Objects.equals(Fi, that.Fi);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(PY2Y, Fi);
        }
    }

    @Test
    void test243() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        gU kmYn = new gU();
        kmYn.setPY2Y("ha");
        kmYn.setCk("Uj");
    
        Object generalized = PojoUtils.generalize(kmYn);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("ha", ((Map)generalized).get("pY2Y"));
        Assertions.assertEquals("Uj", ((Map)generalized).get("ck"));
    
        gU realization = (gU) PojoUtils.realize(PojoUtils.generalize(kmYn), gU.class, gU.class);
        Assertions.assertEquals(kmYn, realization);
    
        Map<String, Object> hGt = new HashMap<>();
        hGt.put("PY2Y", "ha");
        hGt.put("Ck", "Uj");
    
        gU realization2 = (gU) PojoUtils.realize(hGt, gU.class, gU.class);
        Assertions.assertEquals(kmYn, realization2);
    }

    class apg implements Serializable {
        private String Vh;
    
        public void setVh(String Vh) {
            this.Vh = Vh;
        }
    
        public String getVh() {
            return this.Vh;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            apg that = (apg) o;
            return Objects.equals(Vh, that.Vh);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Vh);
        }
    }

    @Test
    void test247() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        apg Um = new apg();
        Um.setVh("Acv");
    
        Object generalized = PojoUtils.generalize(Um);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Acv", ((Map)generalized).get("vh"));
    
        apg realization = (apg) PojoUtils.realize(PojoUtils.generalize(Um), apg.class, apg.class);
        Assertions.assertEquals(Um, realization);
    
        Map<String, Object> Fg = new HashMap<>();
        Fg.put("Vh", "Acv");
    
        apg realization2 = (apg) PojoUtils.realize(Fg, apg.class, apg.class);
        Assertions.assertEquals(Um, realization2);
    }

    class F3N_ implements Serializable {
        private String Qf;
        private String ZNYo;
        private String Cb;
    
        public void setQf(String Qf) {
            this.Qf = Qf;
        }
    
        public String getQf() {
            return this.Qf;
        }
    
        public void setZNYo(String ZNYo) {
            this.ZNYo = ZNYo;
        }
    
        public String getZNYo() {
            return this.ZNYo;
        }
    
        public void setJyb(String Cb) {
            this.Cb = Cb;
        }
    
        public String getJyb() {
            return this.Cb;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            F3N_ that = (F3N_) o;
            return Objects.equals(Qf, that.Qf) && Objects.equals(ZNYo, that.ZNYo) && Objects.equals(Cb, that.Cb);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Qf, ZNYo, Cb);
        }
    }

    @Test
    void test252() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        F3N_ nKh = new F3N_();
        nKh.setQf("Jg");
        nKh.setZNYo("bV");
        nKh.setJyb("Zn2");
    
        Object generalized = PojoUtils.generalize(nKh);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Jg", ((Map)generalized).get("qf"));
        Assertions.assertEquals("bV", ((Map)generalized).get("zNYo"));
        Assertions.assertEquals("Zn2", ((Map)generalized).get("jyb"));
    
        F3N_ realization = (F3N_) PojoUtils.realize(PojoUtils.generalize(nKh), F3N_.class, F3N_.class);
        Assertions.assertEquals(nKh, realization);
    
        Map<String, Object> Xv = new HashMap<>();
        Xv.put("Qf", "Jg");
        Xv.put("ZNYo", "bV");
        Xv.put("Jyb", "Zn2");
    
        F3N_ realization2 = (F3N_) PojoUtils.realize(Xv, F3N_.class, F3N_.class);
        Assertions.assertEquals(nKh, realization2);
    }

    class E1 implements Serializable {
        private String FDag;
        private String Su;
        private String Xo;
        private String L9;
    
        public void setFDag(String FDag) {
            this.FDag = FDag;
        }
    
        public String getFDag() {
            return this.FDag;
        }
    
        public void setSu(String Su) {
            this.Su = Su;
        }
    
        public String getSu() {
            return this.Su;
        }
    
        public void setXo(String Xo) {
            this.Xo = Xo;
        }
    
        public String getXo() {
            return this.Xo;
        }
    
        public void setL9(String L9) {
            this.L9 = L9;
        }
    
        public String getL9() {
            return this.L9;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            E1 that = (E1) o;
            return Objects.equals(FDag, that.FDag) && Objects.equals(Su, that.Su) && Objects.equals(Xo, that.Xo) && Objects.equals(L9, that.L9);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(FDag, Su, Xo, L9);
        }
    }

    @Test
    void test254() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        E1 Of = new E1();
        Of.setFDag("H9");
        Of.setSu("zJ6");
        Of.setXo("LXn");
        Of.setL9("GyQ");
    
        Object generalized = PojoUtils.generalize(Of);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("H9", ((Map)generalized).get("fDag"));
        Assertions.assertEquals("zJ6", ((Map)generalized).get("su"));
        Assertions.assertEquals("LXn", ((Map)generalized).get("xo"));
        Assertions.assertEquals("GyQ", ((Map)generalized).get("l9"));
    
        E1 realization = (E1) PojoUtils.realize(PojoUtils.generalize(Of), E1.class, E1.class);
        Assertions.assertEquals(Of, realization);
    
        Map<String, Object> Qvt1v = new HashMap<>();
        Qvt1v.put("FDag", "H9");
        Qvt1v.put("Su", "zJ6");
        Qvt1v.put("Xo", "LXn");
        Qvt1v.put("L9", "GyQ");
    
        E1 realization2 = (E1) PojoUtils.realize(Qvt1v, E1.class, E1.class);
        Assertions.assertEquals(Of, realization2);
    }

    class t3k implements Serializable {
        private String K3F;
        private String XZ2B;
    
        public void setHN(String K3F) {
            this.K3F = K3F;
        }
    
        public String getHN() {
            return this.K3F;
        }
    
        public void setMLDl(String XZ2B) {
            this.XZ2B = XZ2B;
        }
    
        public String getMLDl() {
            return this.XZ2B;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            t3k that = (t3k) o;
            return Objects.equals(K3F, that.K3F) && Objects.equals(XZ2B, that.XZ2B);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(K3F, XZ2B);
        }
    }

    @Test
    void test255() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        t3k W7 = new t3k();
        W7.setHN("IR");
        W7.setMLDl("PMxt3");
    
        Object generalized = PojoUtils.generalize(W7);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("IR", ((Map)generalized).get("hN"));
        Assertions.assertEquals("PMxt3", ((Map)generalized).get("mLDl"));
    
        t3k realization = (t3k) PojoUtils.realize(PojoUtils.generalize(W7), t3k.class, t3k.class);
        Assertions.assertEquals(W7, realization);
    
        Map<String, Object> IMEM = new HashMap<>();
        IMEM.put("HN", "IR");
        IMEM.put("MLDl", "PMxt3");
    
        t3k realization2 = (t3k) PojoUtils.realize(IMEM, t3k.class, t3k.class);
        Assertions.assertEquals(W7, realization2);
    }

    class IJ implements Serializable {
        private String PvO;
    
        public void setJHt(String PvO) {
            this.PvO = PvO;
        }
    
        public String getJHt() {
            return this.PvO;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IJ that = (IJ) o;
            return Objects.equals(PvO, that.PvO);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(PvO);
        }
    }

    @Test
    void test257() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        IJ KBWEb = new IJ();
        KBWEb.setJHt("x3");
    
        Object generalized = PojoUtils.generalize(KBWEb);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("x3", ((Map)generalized).get("jHt"));
    
        IJ realization = (IJ) PojoUtils.realize(PojoUtils.generalize(KBWEb), IJ.class, IJ.class);
        Assertions.assertEquals(KBWEb, realization);
    
        Map<String, Object> sT = new HashMap<>();
        sT.put("JHt", "x3");
    
        IJ realization2 = (IJ) PojoUtils.realize(sT, IJ.class, IJ.class);
        Assertions.assertEquals(KBWEb, realization2);
    }

    class zM9 implements Serializable {
        private String WTkbv;
    
        public void setDh(String WTkbv) {
            this.WTkbv = WTkbv;
        }
    
        public String getDh() {
            return this.WTkbv;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            zM9 that = (zM9) o;
            return Objects.equals(WTkbv, that.WTkbv);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(WTkbv);
        }
    }

    @Test
    void test260() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        zM9 e64 = new zM9();
        e64.setDh("Sz");
    
        Object generalized = PojoUtils.generalize(e64);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("Sz", ((Map)generalized).get("dh"));
    
        zM9 realization = (zM9) PojoUtils.realize(PojoUtils.generalize(e64), zM9.class, zM9.class);
        Assertions.assertEquals(e64, realization);
    
        Map<String, Object> Sc = new HashMap<>();
        Sc.put("Dh", "Sz");
    
        zM9 realization2 = (zM9) PojoUtils.realize(Sc, zM9.class, zM9.class);
        Assertions.assertEquals(e64, realization2);
    }

    class db implements Serializable {
        private String QO_7z;
    
        public void setQO_7z(String QO_7z) {
            this.QO_7z = QO_7z;
        }
    
        public String getQO_7z() {
            return this.QO_7z;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            db that = (db) o;
            return Objects.equals(QO_7z, that.QO_7z);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(QO_7z);
        }
    }

    @Test
    void test263() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        db AQgP = new db();
        AQgP.setQO_7z("IZ3");
    
        Object generalized = PojoUtils.generalize(AQgP);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("IZ3", ((Map)generalized).get("qO_7z"));
    
        db realization = (db) PojoUtils.realize(PojoUtils.generalize(AQgP), db.class, db.class);
        Assertions.assertEquals(AQgP, realization);
    
        Map<String, Object> NC7 = new HashMap<>();
        NC7.put("QO_7z", "IZ3");
    
        db realization2 = (db) PojoUtils.realize(NC7, db.class, db.class);
        Assertions.assertEquals(AQgP, realization2);
    }

    class rEk implements Serializable {
        private String SKH;
        private String VGg5u1;
    
        public void setSKH(String SKH) {
            this.SKH = SKH;
        }
    
        public String getSKH() {
            return this.SKH;
        }
    
        public void setVGg5u1(String VGg5u1) {
            this.VGg5u1 = VGg5u1;
        }
    
        public String getVGg5u1() {
            return this.VGg5u1;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            rEk that = (rEk) o;
            return Objects.equals(SKH, that.SKH) && Objects.equals(VGg5u1, that.VGg5u1);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(SKH, VGg5u1);
        }
    }

    @Test
    void test264() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        rEk Ny = new rEk();
        Ny.setSKH("k1");
        Ny.setVGg5u1("xu8D_");
    
        Object generalized = PojoUtils.generalize(Ny);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("k1", ((Map)generalized).get("sKH"));
        Assertions.assertEquals("xu8D_", ((Map)generalized).get("vGg5u1"));
    
        rEk realization = (rEk) PojoUtils.realize(PojoUtils.generalize(Ny), rEk.class, rEk.class);
        Assertions.assertEquals(Ny, realization);
    
        Map<String, Object> SKdCy = new HashMap<>();
        SKdCy.put("SKH", "k1");
        SKdCy.put("VGg5u1", "xu8D_");
    
        rEk realization2 = (rEk) PojoUtils.realize(SKdCy, rEk.class, rEk.class);
        Assertions.assertEquals(Ny, realization2);
    }

    class af implements Serializable {
        private String Ut;
        private String Zqy;
    
        public void setYzB(String Ut) {
            this.Ut = Ut;
        }
    
        public String getYzB() {
            return this.Ut;
        }
    
        public void setWBq(String Zqy) {
            this.Zqy = Zqy;
        }
    
        public String getWBq() {
            return this.Zqy;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            af that = (af) o;
            return Objects.equals(Ut, that.Ut) && Objects.equals(Zqy, that.Zqy);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Ut, Zqy);
        }
    }

    @Test
    void test266() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        af POns = new af();
        POns.setYzB("W2pl");
        POns.setWBq("jC");
    
        Object generalized = PojoUtils.generalize(POns);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("W2pl", ((Map)generalized).get("yzB"));
        Assertions.assertEquals("jC", ((Map)generalized).get("wBq"));
    
        af realization = (af) PojoUtils.realize(PojoUtils.generalize(POns), af.class, af.class);
        Assertions.assertEquals(POns, realization);
    
        Map<String, Object> ww1BgYK7R = new HashMap<>();
        ww1BgYK7R.put("YzB", "W2pl");
        ww1BgYK7R.put("WBq", "jC");
    
        af realization2 = (af) PojoUtils.realize(ww1BgYK7R, af.class, af.class);
        Assertions.assertEquals(POns, realization2);
    }

    class KL6 implements Serializable {
        private String TdI;
    
        public void setWq(String TdI) {
            this.TdI = TdI;
        }
    
        public String getWq() {
            return this.TdI;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            KL6 that = (KL6) o;
            return Objects.equals(TdI, that.TdI);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(TdI);
        }
    }

    @Test
    void test268() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        KL6 DPR3 = new KL6();
        DPR3.setWq("du");
    
        Object generalized = PojoUtils.generalize(DPR3);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("du", ((Map)generalized).get("wq"));
    
        KL6 realization = (KL6) PojoUtils.realize(PojoUtils.generalize(DPR3), KL6.class, KL6.class);
        Assertions.assertEquals(DPR3, realization);
    
        Map<String, Object> LEB = new HashMap<>();
        LEB.put("Wq", "du");
    
        KL6 realization2 = (KL6) PojoUtils.realize(LEB, KL6.class, KL6.class);
        Assertions.assertEquals(DPR3, realization2);
    }

    class v4 implements Serializable {
        private String CP;
    
        public void setF3Sa(String CP) {
            this.CP = CP;
        }
    
        public String getF3Sa() {
            return this.CP;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            v4 that = (v4) o;
            return Objects.equals(CP, that.CP);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(CP);
        }
    }

    @Test
    void test271() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        v4 yr6 = new v4();
        yr6.setF3Sa("ucctXe7");
    
        Object generalized = PojoUtils.generalize(yr6);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("ucctXe7", ((Map)generalized).get("f3Sa"));
    
        v4 realization = (v4) PojoUtils.realize(PojoUtils.generalize(yr6), v4.class, v4.class);
        Assertions.assertEquals(yr6, realization);
    
        Map<String, Object> uWdd = new HashMap<>();
        uWdd.put("F3Sa", "ucctXe7");
    
        v4 realization2 = (v4) PojoUtils.realize(uWdd, v4.class, v4.class);
        Assertions.assertEquals(yr6, realization2);
    }

    class l_ implements Serializable {
        private String Fvrz;
    
        public void setFvrz(String Fvrz) {
            this.Fvrz = Fvrz;
        }
    
        public String getFvrz() {
            return this.Fvrz;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            l_ that = (l_) o;
            return Objects.equals(Fvrz, that.Fvrz);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Fvrz);
        }
    }

    @Test
    void test272() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        l_ w6 = new l_();
        w6.setFvrz("r87A");
    
        Object generalized = PojoUtils.generalize(w6);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("r87A", ((Map)generalized).get("fvrz"));
    
        l_ realization = (l_) PojoUtils.realize(PojoUtils.generalize(w6), l_.class, l_.class);
        Assertions.assertEquals(w6, realization);
    
        Map<String, Object> GC2h = new HashMap<>();
        GC2h.put("Fvrz", "r87A");
    
        l_ realization2 = (l_) PojoUtils.realize(GC2h, l_.class, l_.class);
        Assertions.assertEquals(w6, realization2);
    }

    class hC7xx implements Serializable {
        private String Kvl;
        private String Etn;
        private String QJ_;
    
        public void setKvl(String Kvl) {
            this.Kvl = Kvl;
        }
    
        public String getKvl() {
            return this.Kvl;
        }
    
        public void setEtn(String Etn) {
            this.Etn = Etn;
        }
    
        public String getEtn() {
            return this.Etn;
        }
    
        public void setZEx(String QJ_) {
            this.QJ_ = QJ_;
        }
    
        public String getZEx() {
            return this.QJ_;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            hC7xx that = (hC7xx) o;
            return Objects.equals(Kvl, that.Kvl) && Objects.equals(Etn, that.Etn) && Objects.equals(QJ_, that.QJ_);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Kvl, Etn, QJ_);
        }
    }

    @Test
    void test277() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        hC7xx rSaj = new hC7xx();
        rSaj.setKvl("tb3D");
        rSaj.setEtn("OmX");
        rSaj.setZEx("MP1");
    
        Object generalized = PojoUtils.generalize(rSaj);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("tb3D", ((Map)generalized).get("kvl"));
        Assertions.assertEquals("OmX", ((Map)generalized).get("etn"));
        Assertions.assertEquals("MP1", ((Map)generalized).get("zEx"));
    
        hC7xx realization = (hC7xx) PojoUtils.realize(PojoUtils.generalize(rSaj), hC7xx.class, hC7xx.class);
        Assertions.assertEquals(rSaj, realization);
    
        Map<String, Object> uf3c = new HashMap<>();
        uf3c.put("Kvl", "tb3D");
        uf3c.put("Etn", "OmX");
        uf3c.put("ZEx", "MP1");
    
        hC7xx realization2 = (hC7xx) PojoUtils.realize(uf3c, hC7xx.class, hC7xx.class);
        Assertions.assertEquals(rSaj, realization2);
    }

    class KH implements Serializable {
        private String I9V;
    
        public void setI9V(String I9V) {
            this.I9V = I9V;
        }
    
        public String getI9V() {
            return this.I9V;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            KH that = (KH) o;
            return Objects.equals(I9V, that.I9V);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(I9V);
        }
    }

    @Test
    void test278() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        KH zrj = new KH();
        zrj.setI9V("HA");
    
        Object generalized = PojoUtils.generalize(zrj);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("HA", ((Map)generalized).get("i9V"));
    
        KH realization = (KH) PojoUtils.realize(PojoUtils.generalize(zrj), KH.class, KH.class);
        Assertions.assertEquals(zrj, realization);
    
        Map<String, Object> tqs = new HashMap<>();
        tqs.put("I9V", "HA");
    
        KH realization2 = (KH) PojoUtils.realize(tqs, KH.class, KH.class);
        Assertions.assertEquals(zrj, realization2);
    }

    class Y0I2M implements Serializable {
        private String Ln;
    
        public void setNo(String Ln) {
            this.Ln = Ln;
        }
    
        public String getNo() {
            return this.Ln;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Y0I2M that = (Y0I2M) o;
            return Objects.equals(Ln, that.Ln);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Ln);
        }
    }

    @Test
    void test285() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Y0I2M wjD = new Y0I2M();
        wjD.setNo("JrIp");
    
        Object generalized = PojoUtils.generalize(wjD);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("JrIp", ((Map)generalized).get("no"));
    
        Y0I2M realization = (Y0I2M) PojoUtils.realize(PojoUtils.generalize(wjD), Y0I2M.class, Y0I2M.class);
        Assertions.assertEquals(wjD, realization);
    
        Map<String, Object> fS = new HashMap<>();
        fS.put("No", "JrIp");
    
        Y0I2M realization2 = (Y0I2M) PojoUtils.realize(fS, Y0I2M.class, Y0I2M.class);
        Assertions.assertEquals(wjD, realization2);
    }

    class Qa7 implements Serializable {
        private String Sj;
    
        public void setSj(String Sj) {
            this.Sj = Sj;
        }
    
        public String getSj() {
            return this.Sj;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Qa7 that = (Qa7) o;
            return Objects.equals(Sj, that.Sj);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Sj);
        }
    }

    @Test
    void test289() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Qa7 O2 = new Qa7();
        O2.setSj("vOc");
    
        Object generalized = PojoUtils.generalize(O2);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("vOc", ((Map)generalized).get("sj"));
    
        Qa7 realization = (Qa7) PojoUtils.realize(PojoUtils.generalize(O2), Qa7.class, Qa7.class);
        Assertions.assertEquals(O2, realization);
    
        Map<String, Object> u7go = new HashMap<>();
        u7go.put("Sj", "vOc");
    
        Qa7 realization2 = (Qa7) PojoUtils.realize(u7go, Qa7.class, Qa7.class);
        Assertions.assertEquals(O2, realization2);
    }

    class NYh implements Serializable {
        private String BI;
    
        public void setWpE(String BI) {
            this.BI = BI;
        }
    
        public String getWpE() {
            return this.BI;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NYh that = (NYh) o;
            return Objects.equals(BI, that.BI);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(BI);
        }
    }

    @Test
    void test296() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        NYh YdlB = new NYh();
        YdlB.setWpE("QJR1");
    
        Object generalized = PojoUtils.generalize(YdlB);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("QJR1", ((Map)generalized).get("wpE"));
    
        NYh realization = (NYh) PojoUtils.realize(PojoUtils.generalize(YdlB), NYh.class, NYh.class);
        Assertions.assertEquals(YdlB, realization);
    
        Map<String, Object> tI = new HashMap<>();
        tI.put("WpE", "QJR1");
    
        NYh realization2 = (NYh) PojoUtils.realize(tI, NYh.class, NYh.class);
        Assertions.assertEquals(YdlB, realization2);
    }

    class FV implements Serializable {
        private String WQE;
        private String UJlw;
        private String V7e;
    
        public void setWQE(String WQE) {
            this.WQE = WQE;
        }
    
        public String getWQE() {
            return this.WQE;
        }
    
        public void setUJlw(String UJlw) {
            this.UJlw = UJlw;
        }
    
        public String getUJlw() {
            return this.UJlw;
        }
    
        public void setV7e(String V7e) {
            this.V7e = V7e;
        }
    
        public String getV7e() {
            return this.V7e;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FV that = (FV) o;
            return Objects.equals(WQE, that.WQE) && Objects.equals(UJlw, that.UJlw) && Objects.equals(V7e, that.V7e);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(WQE, UJlw, V7e);
        }
    }

    @Test
    void test297() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        FV sK = new FV();
        sK.setWQE("eDw");
        sK.setUJlw("qp");
        sK.setV7e("CL");
    
        Object generalized = PojoUtils.generalize(sK);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("eDw", ((Map)generalized).get("wQE"));
        Assertions.assertEquals("qp", ((Map)generalized).get("uJlw"));
        Assertions.assertEquals("CL", ((Map)generalized).get("v7e"));
    
        FV realization = (FV) PojoUtils.realize(PojoUtils.generalize(sK), FV.class, FV.class);
        Assertions.assertEquals(sK, realization);
    
        Map<String, Object> Wu = new HashMap<>();
        Wu.put("WQE", "eDw");
        Wu.put("UJlw", "qp");
        Wu.put("V7e", "CL");
    
        FV realization2 = (FV) PojoUtils.realize(Wu, FV.class, FV.class);
        Assertions.assertEquals(sK, realization2);
    }

    class MabN implements Serializable {
        private String Tv;
        private String STOO;
        private String Id2;
        private String Eu;
    
        public void setU4(String Tv) {
            this.Tv = Tv;
        }
    
        public String getU4() {
            return this.Tv;
        }
    
        public void setFa(String STOO) {
            this.STOO = STOO;
        }
    
        public String getFa() {
            return this.STOO;
        }
    
        public void setId2(String Id2) {
            this.Id2 = Id2;
        }
    
        public String getId2() {
            return this.Id2;
        }
    
        public void setEu(String Eu) {
            this.Eu = Eu;
        }
    
        public String getEu() {
            return this.Eu;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MabN that = (MabN) o;
            return Objects.equals(Tv, that.Tv) && Objects.equals(STOO, that.STOO) && Objects.equals(Id2, that.Id2) && Objects.equals(Eu, that.Eu);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Tv, STOO, Id2, Eu);
        }
    }

    @Test
    void test301() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        MabN SMkv8GF = new MabN();
        SMkv8GF.setU4("I0W");
        SMkv8GF.setFa("HM");
        SMkv8GF.setId2("BO");
        SMkv8GF.setEu("U5i");
    
        Object generalized = PojoUtils.generalize(SMkv8GF);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("I0W", ((Map)generalized).get("u4"));
        Assertions.assertEquals("HM", ((Map)generalized).get("fa"));
        Assertions.assertEquals("BO", ((Map)generalized).get("id2"));
        Assertions.assertEquals("U5i", ((Map)generalized).get("eu"));
    
        MabN realization = (MabN) PojoUtils.realize(PojoUtils.generalize(SMkv8GF), MabN.class, MabN.class);
        Assertions.assertEquals(SMkv8GF, realization);
    
        Map<String, Object> KCDdWM = new HashMap<>();
        KCDdWM.put("U4", "I0W");
        KCDdWM.put("Fa", "HM");
        KCDdWM.put("Id2", "BO");
        KCDdWM.put("Eu", "U5i");
    
        MabN realization2 = (MabN) PojoUtils.realize(KCDdWM, MabN.class, MabN.class);
        Assertions.assertEquals(SMkv8GF, realization2);
    }

    class Hy implements Serializable {
        private String Sm_;
        private String GW5;
    
        public void setSm_(String Sm_) {
            this.Sm_ = Sm_;
        }
    
        public String getSm_() {
            return this.Sm_;
        }
    
        public void setGW5(String GW5) {
            this.GW5 = GW5;
        }
    
        public String getGW5() {
            return this.GW5;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Hy that = (Hy) o;
            return Objects.equals(Sm_, that.Sm_) && Objects.equals(GW5, that.GW5);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Sm_, GW5);
        }
    }

    @Test
    void test302() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        Hy EM = new Hy();
        EM.setSm_("c6F");
        EM.setGW5("M08K4");
    
        Object generalized = PojoUtils.generalize(EM);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("c6F", ((Map)generalized).get("sm_"));
        Assertions.assertEquals("M08K4", ((Map)generalized).get("gW5"));
    
        Hy realization = (Hy) PojoUtils.realize(PojoUtils.generalize(EM), Hy.class, Hy.class);
        Assertions.assertEquals(EM, realization);
    
        Map<String, Object> ogEu = new HashMap<>();
        ogEu.put("Sm_", "c6F");
        ogEu.put("GW5", "M08K4");
    
        Hy realization2 = (Hy) PojoUtils.realize(ogEu, Hy.class, Hy.class);
        Assertions.assertEquals(EM, realization2);
    }

    class pgz3 implements Serializable {
        private String Ju_;
    
        public void setKy1(String Ju_) {
            this.Ju_ = Ju_;
        }
    
        public String getKy1() {
            return this.Ju_;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            pgz3 that = (pgz3) o;
            return Objects.equals(Ju_, that.Ju_);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Ju_);
        }
    }

    @Test
    void test308() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        pgz3 l41K = new pgz3();
        l41K.setKy1("axt");
    
        Object generalized = PojoUtils.generalize(l41K);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("axt", ((Map)generalized).get("ky1"));
    
        pgz3 realization = (pgz3) PojoUtils.realize(PojoUtils.generalize(l41K), pgz3.class, pgz3.class);
        Assertions.assertEquals(l41K, realization);
    
        Map<String, Object> J1 = new HashMap<>();
        J1.put("Ky1", "axt");
    
        pgz3 realization2 = (pgz3) PojoUtils.realize(J1, pgz3.class, pgz3.class);
        Assertions.assertEquals(l41K, realization2);
    }

    class nkI4xh implements Serializable {
        private String Wa;
    
        public void setWa(String Wa) {
            this.Wa = Wa;
        }
    
        public String getWa() {
            return this.Wa;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            nkI4xh that = (nkI4xh) o;
            return Objects.equals(Wa, that.Wa);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(Wa);
        }
    }

    @Test
    void test309() {
        System.setProperty("dubbo.application.serialize-check-status", "WARN");
        nkI4xh Jyq = new nkI4xh();
        Jyq.setWa("hjT");
    
        Object generalized = PojoUtils.generalize(Jyq);
        Assertions.assertInstanceOf(Map.class, generalized);
        Assertions.assertEquals("hjT", ((Map)generalized).get("wa"));
    
        nkI4xh realization = (nkI4xh) PojoUtils.realize(PojoUtils.generalize(Jyq), nkI4xh.class, nkI4xh.class);
        Assertions.assertEquals(Jyq, realization);
    
        Map<String, Object> C1JP = new HashMap<>();
        C1JP.put("Wa", "hjT");
    
        nkI4xh realization2 = (nkI4xh) PojoUtils.realize(C1JP, nkI4xh.class, nkI4xh.class);
        Assertions.assertEquals(Jyq, realization2);
    }
}

