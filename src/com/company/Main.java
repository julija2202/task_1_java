package com.company;

public class Main {
static byte a;
static short b;
static int c;
static long d;
static float e;
static double f;
static char h;
static boolean v;
static String t;
static Byte aA;
static Short bB;
static Integer cC;
static Long dD;
static Float eE;
static Double fF;
static Character hH;
static Boolean vV;

    public static void main(String[] args) {
Number number = new Number();
number.setJ((byte)12);
System.out.println(number.getJ());
number.setIi((short)1289);
System.out.println(number.getIi());
number.setM((int)1567645456);
System.out.println(number.getM());
number.setNn((long)16576576778899943l);
System.out.println(number.getNn());
number.setRr((double)1567645.6);
System.out.println(number.getRr());
number.setPp((Float)1657657.7f);
System.out.println(number.getPp());
number.setQ((char)'#');
System.out.println(number.getQ());
number.setGg((Boolean)true);
System.out.println(number.getGg());
number.setL((String)"jkgkgkhg");
System.out.println(number.getL());
int z = 456;
byte x = 13;
float k = 15754.9f;
String s = "hjfghdhgdhd";
Boolean y = false;
boolean w = false;
Boolean yy = (boolean) y;
System.out.println(yy);
//String uu = (float) k; нельзя число float в строку
//System.out.println(uu);
//String uuy = (byte) x; //нельзя число byte в строку
// System.out.println(uuy);
int ttt = (byte) x;
System.out.println(ttt);
//int tt = (float) k;  нельзя нецелое число в целое
//System.out.println(tt);
//byte hgh = (int) z; нельзя в меньшее засунуть большее число
//System.out.println(hgh);
float hg = (int) z;
System.out.println(hg);
    }
}
