public class Task5 {
    public static void main(String[] args) {
//        Упаковка каждого типа переменных:
        byte a = 1;
        Byte boxed;
        boxed = new Byte(a);

        byte b = 2;
        Byte boxed2;
        boxed2 = Byte.valueOf(b);

        byte c = 3;
        Byte boxed3;
        boxed3 = c;

        System.out.println(a + "\n" + b + "\n" + c);

        short f = 350;
        Short boxed6;
        boxed6 = new Short(f);

        short h = 351;
        Short boxed7;
        boxed7 = Short.valueOf(h);

        short e = 352;
        Short boxed8;
        boxed8 = e;

        System.out.println(f + "\n" + h + "\n" + e);

        int j = 5;
        Integer boxed9;
        boxed9 = new Integer(j);

        int k = 6;
        Integer boxed10;
        boxed10 = Integer.valueOf(k);

        int l = 7;
        Integer boxed11;
        boxed11 = l;

        System.out.println(j + "\n" + k + "\n" + l);

        long m = 123456L;
        Long boxed12;
        boxed12 = new Long(m);

        long n = 12345L;
        Long boxed13;
        boxed13 = Long.valueOf(n);

        long o = 1234L;
        Long boxed14;
        boxed14 = o;

        System.out.println(m + "\n" + n + "\n" + o);

        char p = 1073;
        Character boxed15;
        boxed15 = new Character(p);

        char q = '\u0431';
        Character boxed16;
        boxed16 = Character.valueOf(q);

        char r = 'б';
        Character boxed17;
        boxed17 = r;

        System.out.println(p + "\n" + q + "\n" + r);

        float s = 2.1F;
        Float boxed18;
        boxed18 = new Float(s);

        float t = 2.2F;
        Float boxed19;
        boxed19 = Float.valueOf(t);

        float u = 2.3F;
        Float boxed20;
        boxed20 = u;

        System.out.println(s + "\n" + t + "\n" + u);

        double v = 16.2;
        Double boxed21;
        boxed21 = new Double(v);

        double w = 16.3;
        Double boxed22;
        boxed22 = Double.valueOf(w);

        double x = 16.4;
        Double boxed23;
        boxed23 = x;

        System.out.println(v + "\n" + w + "\n" + x);

        boolean isSend = true;
        Boolean boxed24;
        boxed24 = new Boolean(isSend);

        boolean isChanged = false;
        Boolean boxed25;
        boxed25 = Boolean.valueOf(isChanged);

        boolean something = true;
        Boolean boxed26;
        boxed26 = something;

        System.out.println(isSend + "\n" + isChanged + "\n" + something);

//            Распаковка:
        Byte boxed27 = 1;
        byte a1;
        a1 = boxed27.byteValue();

        Byte boxed28 = 2;
        byte a2;
        a2 = boxed28;

        Short boxed29 = 355;
        short b1;
        b1 = boxed29.byteValue();

        Short boxed30 = 356;
        short b2;
        b2 = boxed30;

        Integer boxed31 = 8;
        int c1;
        c1 = boxed31.intValue();

        Integer boxed32 = 9;
        int c2;
        c2 = boxed32;

        Long boxed33 = 1234567L;
        long d1;
        d1 = boxed33.longValue();

        Long boxed34 = 123456L;
        long d2;
        d2 = boxed34;

        Character boxed35 = 1072;
        char i1;
        i1 = boxed35.charValue();

        Character boxed36 = 'a';
        char i2;
        i2 = boxed36;

        Float boxed37 = 40.5F;
        float j1;
        j1 = boxed37.floatValue();

        Float boxed38 = 41.5F;
        float j2;
        j2 = boxed38;

        Double boxed39 = 15.25;
        double k1;
        k1 = boxed39.doubleValue();

        Double boxed40 = 15.26;
        double k2;
        k2 = boxed40;

        Boolean boxed41 = true;
        boolean f1;
        f1 = boxed41.booleanValue();

        Boolean boxed42 = false;
        boolean f2;
        f2 = boxed42;

        System.out.println(a1 + "\n" + a2 + "\n" + b1 + "\n" + b2 + "\n" + c1 + "\n" + c2
                + "\n" + d1 + "\n" + d2 + "\n" + i1 + "\n" + i2 + "\n" + j1 + "\n" + j2
                + "\n" + k1 + "\n" + k2 + "\n" + f1 + "\n" + f2);
    }
}


