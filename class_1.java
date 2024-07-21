import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

// $FF: renamed from: b
public final class class_1 extends Canvas implements Runnable {
   // $FF: renamed from: a boolean
   public static final boolean field_5 = System.getProperty("microedition.platform").equals("Nokia3650");
   // $FF: renamed from: a b
   public static final class_1 field_6 = new class_1();
   // $FF: renamed from: b boolean
   public static boolean field_7 = true;
   // $FF: renamed from: c boolean
   public static boolean field_8 = false;
   // $FF: renamed from: d boolean
   public static boolean field_9 = false;
   // $FF: renamed from: a java.util.Random
   private static Random field_10 = new Random(System.currentTimeMillis());
   // $FF: renamed from: a short
   public static short field_11 = 1;
   // $FF: renamed from: b short
   public static short field_12 = 2;
   // $FF: renamed from: c short
   public static short field_13 = 0;
   // $FF: renamed from: d short
   public static short field_14 = 200;
   // $FF: renamed from: e short
   public static short field_15 = 300;
   // $FF: renamed from: f short
   public static short field_16 = 300;
   // $FF: renamed from: a short[]
   public static short[] field_17 = null;
   // $FF: renamed from: b short[]
   public static short[] field_18 = null;
   // $FF: renamed from: a int
   public static int field_19 = 0;
   // $FF: renamed from: b int
   public static int field_20 = 0;
   // $FF: renamed from: e boolean
   public static boolean field_21 = false;
   // $FF: renamed from: f boolean
   public static boolean field_22 = false;
   // $FF: renamed from: E short
   private static short field_23 = 0;
   // $FF: renamed from: F short
   private static short field_24 = 0;
   // $FF: renamed from: G short
   private static short field_25 = 0;
   // $FF: renamed from: v byte[]
   private static byte[] field_26 = null;
   // $FF: renamed from: H short
   private static short field_27 = 0;
   // $FF: renamed from: I short
   private static short field_28 = 100;
   // $FF: renamed from: J short
   private static short field_29 = 100;
   // $FF: renamed from: E boolean
   private static boolean field_30 = false;
   // $FF: renamed from: F boolean
   private static boolean field_31 = false;
   // $FF: renamed from: G boolean
   private static boolean field_32 = false;
   // $FF: renamed from: K short
   private static short field_33 = 0;
   // $FF: renamed from: ae int
   private static int field_34 = 0;
   // $FF: renamed from: af int
   private static int field_35 = 0;
   // $FF: renamed from: c int
   public static int field_36 = 0;
   // $FF: renamed from: d int
   public static int field_37 = 0;
   // $FF: renamed from: e int
   public static int field_38 = 8;
   // $FF: renamed from: ag int
   private static int field_39;
   // $FF: renamed from: ah int
   private static int field_40;
   // $FF: renamed from: ai int
   private static int field_41;
   // $FF: renamed from: aj int
   private static int field_42;
   // $FF: renamed from: ak int
   private static int field_43 = 0;
   // $FF: renamed from: al int
   private static int field_44 = 0;
   // $FF: renamed from: am int
   private static int field_45;
   // $FF: renamed from: an int
   private static int field_46;
   // $FF: renamed from: ao int
   private static int field_47;
   // $FF: renamed from: ap int
   private static int field_48 = 0;
   // $FF: renamed from: aq int
   private static int field_49;
   // $FF: renamed from: ar int
   private static int field_50 = 0;
   // $FF: renamed from: f int
   public static int field_51 = 6;
   // $FF: renamed from: g int
   public static int field_52 = 7;
   // $FF: renamed from: h int
   public static int field_53;
   // $FF: renamed from: i int
   public static int field_54;
   // $FF: renamed from: j int
   public static int field_55;
   // $FF: renamed from: k int
   public static int field_56;
   // $FF: renamed from: l int
   public static int field_57;
   // $FF: renamed from: m int
   public static int field_58;
   // $FF: renamed from: n int
   public static int field_59;
   // $FF: renamed from: o int
   public static int field_60;
   // $FF: renamed from: p int
   public static int field_61;
   // $FF: renamed from: q int
   public static int field_62;
   // $FF: renamed from: a byte[]
   public static byte[] field_63;
   // $FF: renamed from: b byte[]
   public static byte[] field_64;
   // $FF: renamed from: c byte[]
   public static byte[] field_65;
   // $FF: renamed from: c short[]
   public static short[] field_66;
   // $FF: renamed from: as int
   private static int field_67;
   // $FF: renamed from: at int
   private static int field_68;
   // $FF: renamed from: g int[]
   private static int[] field_69;
   // $FF: renamed from: h int[]
   private static int[] field_70;
   // $FF: renamed from: g short
   public static short field_71;
   // $FF: renamed from: a byte[][]
   public static byte[][] field_72;
   // $FF: renamed from: b byte[][]
   public static byte[][] field_73;
   // $FF: renamed from: c byte[][]
   public static byte[][] field_74;
   // $FF: renamed from: d byte[][]
   public static byte[][] field_75;
   // $FF: renamed from: e byte[][]
   public static byte[][] field_76;
   // $FF: renamed from: h short
   public static short field_77;
   // $FF: renamed from: i short
   public static short field_78;
   // $FF: renamed from: L short
   private static short field_79;
   // $FF: renamed from: a javax.microedition.lcdui.Image
   public static Image field_80;
   // $FF: renamed from: a javax.microedition.lcdui.Graphics
   public static Graphics field_81;
   // $FF: renamed from: w byte[]
   private static byte[] field_82;
   // $FF: renamed from: x byte[]
   private static byte[] field_83;
   // $FF: renamed from: y byte[]
   private static byte[] field_84;
   // $FF: renamed from: z byte[]
   private static byte[] field_85;
   // $FF: renamed from: A byte[]
   private static byte[] field_86;
   // $FF: renamed from: au int
   private static int field_87;
   // $FF: renamed from: H boolean
   private static boolean field_88;
   // $FF: renamed from: h long
   private static long field_89;
   // $FF: renamed from: a long
   public static long field_90;
   // $FF: renamed from: g boolean
   public static boolean field_91;
   // $FF: renamed from: h boolean
   public static boolean field_92;
   // $FF: renamed from: i boolean
   public static boolean field_93;
   // $FF: renamed from: r int
   public static int field_94;
   // $FF: renamed from: a byte
   public static byte field_95;
   // $FF: renamed from: s int
   public static int field_96;
   // $FF: renamed from: t int
   public static int field_97;
   // $FF: renamed from: j short
   public static short field_98;
   // $FF: renamed from: k short
   public static short field_99;
   // $FF: renamed from: l short
   public static short field_100;
   // $FF: renamed from: m short
   public static short field_101;
   // $FF: renamed from: d byte[]
   public static byte[] field_102;
   // $FF: renamed from: e byte[]
   public static byte[] field_103;
   // $FF: renamed from: d short[]
   public static short[] field_104;
   // $FF: renamed from: f byte[]
   public static byte[] field_105;
   // $FF: renamed from: e short[]
   public static short[] field_106;
   // $FF: renamed from: g byte[]
   public static byte[] field_107;
   // $FF: renamed from: h byte[]
   public static byte[] field_108;
   // $FF: renamed from: f short[]
   public static short[] field_109;
   // $FF: renamed from: i byte[]
   public static byte[] field_110;
   // $FF: renamed from: b byte
   public static byte field_111;
   // $FF: renamed from: j byte[]
   public static byte[] field_112;
   // $FF: renamed from: c byte
   public static byte field_113;
   // $FF: renamed from: k byte[]
   public static byte[] field_114;
   // $FF: renamed from: l byte[]
   public static byte[] field_115;
   // $FF: renamed from: m byte[]
   public static byte[] field_116;
   // $FF: renamed from: n byte[]
   public static byte[] field_117;
   // $FF: renamed from: o byte[]
   public static byte[] field_118;
   // $FF: renamed from: g short[]
   public static short[] field_119;
   // $FF: renamed from: p byte[]
   public static byte[] field_120;
   // $FF: renamed from: q byte[]
   public static byte[] field_121;
   // $FF: renamed from: u int
   public static int field_122;
   // $FF: renamed from: v int
   public static int field_123;
   // $FF: renamed from: w int
   public static int field_124;
   // $FF: renamed from: x int
   public static int field_125;
   // $FF: renamed from: y int
   public static int field_126;
   // $FF: renamed from: a int[]
   public static final int[] field_127;
   // $FF: renamed from: b int[]
   public static final int[] field_128;
   // $FF: renamed from: c int[]
   public static final int[] field_129;
   // $FF: renamed from: d int[]
   public static final int[] field_130;
   // $FF: renamed from: e int[]
   public static final int[] field_131;
   // $FF: renamed from: f int[]
   public static int[] field_132;
   // $FF: renamed from: r byte[]
   public static final byte[] field_133;
   // $FF: renamed from: z int
   public static final int field_134;
   // $FF: renamed from: A int
   public static final int field_135;
   // $FF: renamed from: B byte[]
   private static final byte[] field_136;
   // $FF: renamed from: C byte[]
   private static final byte[] field_137;
   // $FF: renamed from: D byte[]
   private static final byte[] field_138;
   // $FF: renamed from: E byte[]
   private static final byte[] field_139;
   // $FF: renamed from: F byte[]
   private static final byte[] field_140;
   // $FF: renamed from: G byte[]
   private static byte[] field_141;
   // $FF: renamed from: n short[]
   private static final short[] field_142;
   // $FF: renamed from: o short[]
   private static final short[] field_143;
   // $FF: renamed from: i int[]
   private static final int[] field_144;
   // $FF: renamed from: j int[]
   private static final int[] field_145;
   // $FF: renamed from: B int
   public static int field_146;
   // $FF: renamed from: b long
   public static long field_147;
   // $FF: renamed from: C int
   public static int field_148;
   // $FF: renamed from: D int
   public static int field_149;
   // $FF: renamed from: a javax.microedition.lcdui.Image[]
   public static Image[] field_150;
   // $FF: renamed from: h short[]
   public static short[] field_151;
   // $FF: renamed from: i short[]
   public static short[] field_152;
   // $FF: renamed from: j short[]
   public static short[] field_153;
   // $FF: renamed from: k short[]
   public static short[] field_154;
   // $FF: renamed from: k int[]
   private static final int[] field_155;
   // $FF: renamed from: H byte[]
   private static byte[] field_156;
   // $FF: renamed from: I byte[]
   private static byte[] field_157;
   // $FF: renamed from: J byte[]
   private static byte[] field_158;
   // $FF: renamed from: p byte
   private static byte field_159;
   // $FF: renamed from: q byte
   private static byte field_160;
   // $FF: renamed from: r byte
   private static byte field_161;
   // $FF: renamed from: p short[]
   private static short[] field_162;
   // $FF: renamed from: K byte[]
   private static byte[] field_163;
   // $FF: renamed from: c long
   public static long field_164;
   // $FF: renamed from: j boolean
   public static boolean field_165;
   // $FF: renamed from: n short
   public static short field_166;
   // $FF: renamed from: k boolean
   public static boolean field_167;
   // $FF: renamed from: l boolean
   public static boolean field_168;
   // $FF: renamed from: d long
   public static long field_169;
   // $FF: renamed from: e long
   public static long field_170;
   // $FF: renamed from: E int
   public static int field_171;
   // $FF: renamed from: F int
   public static int field_172;
   // $FF: renamed from: G int
   public static int field_173;
   // $FF: renamed from: H int
   public static int field_174;
   // $FF: renamed from: I int
   public static int field_175;
   // $FF: renamed from: m boolean
   public static boolean field_176;
   // $FF: renamed from: d byte
   public static byte field_177;
   // $FF: renamed from: e byte
   public static byte field_178;
   // $FF: renamed from: f byte
   public static byte field_179;
   // $FF: renamed from: o short
   public static short field_180;
   // $FF: renamed from: p short
   public static short field_181;
   // $FF: renamed from: q short
   public static short field_182;
   // $FF: renamed from: n boolean
   public static boolean field_183;
   // $FF: renamed from: J int
   public static int field_184;
   // $FF: renamed from: r short
   public static short field_185;
   // $FF: renamed from: K int
   public static int field_186;
   // $FF: renamed from: o boolean
   public static boolean field_187;
   // $FF: renamed from: p boolean
   public static boolean field_188;
   // $FF: renamed from: q boolean
   public static boolean field_189;
   // $FF: renamed from: r boolean
   public static boolean field_190;
   // $FF: renamed from: s byte[]
   public static byte[] field_191;
   // $FF: renamed from: L int
   public static int field_192;
   // $FF: renamed from: M int
   public static int field_193;
   // $FF: renamed from: N int
   public static int field_194;
   // $FF: renamed from: O int
   public static int field_195;
   // $FF: renamed from: P int
   public static int field_196;
   // $FF: renamed from: s boolean
   public static boolean field_197;
   // $FF: renamed from: t boolean
   public static boolean field_198;
   // $FF: renamed from: u boolean
   public static boolean field_199;
   // $FF: renamed from: v boolean
   public static boolean field_200;
   // $FF: renamed from: Q int
   public static int field_201;
   // $FF: renamed from: R int
   public static int field_202;
   // $FF: renamed from: S int
   public static int field_203;
   // $FF: renamed from: w boolean
   public static boolean field_204;
   // $FF: renamed from: x boolean
   public static boolean field_205;
   // $FF: renamed from: s short
   public static short field_206;
   // $FF: renamed from: l short[]
   public static short[] field_207;
   // $FF: renamed from: m short[]
   public static short[] field_208;
   // $FF: renamed from: t short
   public static short field_209;
   // $FF: renamed from: u short
   public static short field_210;
   // $FF: renamed from: T int
   public static int field_211;
   // $FF: renamed from: y boolean
   public static boolean field_212;
   // $FF: renamed from: z boolean
   public static boolean field_213;
   // $FF: renamed from: U int
   public static int field_214;
   // $FF: renamed from: V int
   public static int field_215;
   // $FF: renamed from: W int
   public static int field_216;
   // $FF: renamed from: X int
   public static int field_217;
   // $FF: renamed from: Y int
   public static int field_218;
   // $FF: renamed from: A boolean
   public static boolean field_219;
   // $FF: renamed from: Z int
   public static int field_220;
   // $FF: renamed from: aa int
   public static int field_221;
   // $FF: renamed from: ab int
   public static int field_222;
   // $FF: renamed from: t byte[]
   public static byte[] field_223;
   // $FF: renamed from: u byte[]
   public static byte[] field_224;
   // $FF: renamed from: v short
   public static short field_225;
   // $FF: renamed from: g byte
   public static byte field_226;
   // $FF: renamed from: h byte
   public static byte field_227;
   // $FF: renamed from: i byte
   public static byte field_228;
   // $FF: renamed from: j byte
   public static byte field_229;
   // $FF: renamed from: w short
   public static short field_230;
   // $FF: renamed from: x short
   public static short field_231;
   // $FF: renamed from: k byte
   public static byte field_232;
   // $FF: renamed from: l byte
   public static byte field_233;
   // $FF: renamed from: m byte
   public static byte field_234;
   // $FF: renamed from: n byte
   public static byte field_235;
   // $FF: renamed from: o byte
   public static byte field_236;
   // $FF: renamed from: y short
   public static short field_237;
   // $FF: renamed from: z short
   public static short field_238;
   // $FF: renamed from: A short
   public static short field_239;
   // $FF: renamed from: B short
   public static short field_240;
   // $FF: renamed from: C short
   public static short field_241;
   // $FF: renamed from: L byte[]
   private static byte[] field_242;
   // $FF: renamed from: M short
   private static short field_243;
   // $FF: renamed from: B boolean
   public static boolean field_244;
   // $FF: renamed from: C boolean
   public static boolean field_245;
   // $FF: renamed from: D short
   public static short field_246;
   // $FF: renamed from: ac int
   public static int field_247;
   // $FF: renamed from: f long
   public static long field_248;
   // $FF: renamed from: f byte[][]
   private static final byte[][] field_249;
   // $FF: renamed from: av int
   private static int field_250;
   // $FF: renamed from: D boolean
   public static boolean field_251;
   // $FF: renamed from: ad int
   public static int field_252;
   // $FF: renamed from: g long
   public static long field_253;
   // $FF: renamed from: a a[]
   public static class_0[] field_254;

   // $FF: renamed from: a (short) short
   public static final short method_9(short var0) {
      return field_106[13 * var0];
   }

   // $FF: renamed from: b (short) short
   public static final short method_10(short var0) {
      return field_106[13 * var0 + 1];
   }

   // $FF: renamed from: c (short) short
   public static final short method_11(short var0) {
      short var1 = 0;

      for(int var2 = 0; var2 < method_10(var0); ++var2) {
         var1 = (short)(var1 + field_107[method_9(var0) + var2 * 2 + 1]);
      }

      return var1;
   }

   // $FF: renamed from: a (short, short) short
   public static final short method_12(short var0, short var1) {
      for(short var2 = 0; var2 <= field_102.length - 1; ++var2) {
         short var3;
         if ((var3 = (short)field_102[var2]) != -1 && var0 == method_13(var3) && var1 == method_14(var3)) {
            return var3;
         }
      }

      return 100;
   }

   // $FF: renamed from: d (short) short
   public static final short method_13(short var0) {
      return field_106[13 * var0 + 6];
   }

   // $FF: renamed from: e (short) short
   public static final short method_14(short var0) {
      return field_106[13 * var0 + 7];
   }

   // $FF: renamed from: f (short) short
   public static final short method_15(short var0) {
      return field_106[13 * var0 + 8];
   }

   // $FF: renamed from: g (short) short
   public static final short method_16(short var0) {
      return field_106[13 * var0 + 9];
   }

   public final void keyPressed(int var1) {
      if (field_15 == 300 && field_16 == 300) {
         if (field_148 == var1 || field_14 == 0 || System.currentTimeMillis() - field_147 >= 200L) {
            if (!field_91 && !field_92 && !field_31 && field_149 == -1 || field_14 != 0 && field_14 != 6) {
               if (field_28 == 100 || field_14 != 6 || field_110[field_28] == 0) {
                  field_148 = var1;
                  field_147 = System.currentTimeMillis();
                  if (field_14 != 100) {
                     if (field_14 == 0 && field_8) {
                        field_8 = false;
                        method_17(4);
                        field_92 = true;
                     } else {
                        int var2;
                        if (field_14 == 0) {
                           if (var1 >> 4 == 3) {
                              field_146 = (field_146 << 4) + (var1 & 15);
                              System.out.println("(cheat_data & cheatMask[i]) : " + (field_146 & field_145[0]));

                              for(var2 = 0; var2 < 5; ++var2) {
                                 if ((field_146 & field_145[var2]) == field_144[var2]) {
                                    if (var2 == 0) {
                                       field_94 = 100000;
                                       field_7 = true;
                                    }

                                    if (var2 == 1) {
                                       short[] var3 = new short[]{1, 2, 3, 4, 5, 6, 7, 8};

                                       for(int var4 = 0; var4 < var3.length; ++var4) {
                                          for(int var5 = 0; var5 < method_10(var3[var4]); ++var5) {
                                             field_107[method_9(var3[var4]) + 2 * var5 + 1] = 100;
                                          }
                                       }
                                    }

                                    if (var2 == 2) {
                                       field_9 = true;
                                    }

                                    if (var2 == 3) {
                                       field_9 = false;
                                    }

                                    if (var2 == 4) {
                                       field_106[field_98 * 13 + 9] = 120;
                                    }
                                 }
                              }
                           } else {
                              field_146 = -1;
                           }
                        }

                        switch (var2 = method_157(var1)) {
                           case 1:
                           case 2:
                           case 5:
                           case 6:
                              if (field_14 == 0 || field_14 == 6) {
                                 field_164 = System.currentTimeMillis();
                                 field_165 = true;
                              }

                              field_87 = var2;
                              return;
                           case 8:
                              System.gc();
                              method_154();
                              return;
                           case 120:
                              System.gc();
                              method_152();
                              return;
                           case 121:
                              System.gc();
                              method_153();
                              return;
                           default:
                              short var6;
                              switch (field_14) {
                                 case 0:
                                    if (!field_91 && !field_92) {
                                       short var7;
                                       if (var1 == 42) {
                                          var6 = field_106[field_23 * 13 + 6];
                                          var7 = field_106[field_23 * 13 + 7];
                                          if (field_115[1] == 1 && (method_56(field_72[var6][var7], field_143) || method_56(field_72[var6 - 1][var7], field_143) || method_56(field_72[var6 - 1][var7 + 1], field_143) || method_56(field_72[var6][var7 - 1], field_143) || method_56(field_72[var6][var7 + 1], field_143) || method_56(field_72[var6 + 1][var7 - 1], field_143) || method_56(field_72[var6 + 1][var7], field_143) || method_56(field_72[var6 + 1][var7 + 1], field_143))) {
                                             field_101 = 105;
                                          }

                                          field_200 = true;
                                       }

                                       if (var1 == 35 && (var6 = method_12((short)(field_125 + field_36 / field_58), (short)(field_126 + field_37 / field_59))) != 100) {
                                          if ((var7 = method_11(var6)) == 0) {
                                             return;
                                          }

                                          method_59((short)(var7 < 20 ? 294 : (var7 < 50 ? 295 : 296)), (short)0, true);
                                          return;
                                       }
                                       break;
                                    }

                                    return;
                                 case 6:
                                    if (var1 == 48) {
                                       field_237 = method_120(-1, field_125, field_126);
                                       if (field_237 == 100) {
                                          return;
                                       }

                                       var6 = field_112[field_119[field_237 * 2] * field_111 + 2];
                                       if (field_237 != 100) {
                                          method_151(field_119[field_237 * 2], (short)((field_119[field_237 * 2 + 1] + var6 - 1) / var6), field_177, field_178, field_179);
                                          field_241 = field_14;
                                          field_15 = 16;
                                       }
                                    }
                              }

                        }
                     }
                  }
               }
            }
         }
      }
   }

   public final void keyReleased(int var1) {
      field_87 = 0;
   }

   public final void paint(Graphics var1) {
      if (System.currentTimeMillis() - field_248 > 10000L) {
         field_247 = -1;
      }

      try {
         method_57();
      } catch (Exception var4) {
         System.out.println("-= UpDate =-");
      }

      try {
         var1.setClip(0, 0, 240, 320);
         method_106(var1);
      } catch (Exception var3) {
         System.out.println("-= Render =-");
      }
   }

   // $FF: renamed from: a (int) void
   public static final void method_17(int var0) {
      field_150[var0] = null;
      System.gc();
   }

   // $FF: renamed from: b (int) void
   public static final void method_18(int var0) {
      try {
         field_150[var0] = Image.createImage("/" + var0 + ".png");
      } catch (Exception var2) {
      }
   }

   // $FF: renamed from: a (int) javax.microedition.lcdui.Image
   public static final Image method_19(int var0) {
      if (field_150[var0] == null) {
         method_18(var0);
      }

      return field_150[var0];
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int[]) void
   public static final void method_20(Graphics var0, int var1, int var2, int var3, int var4, int[] var5) {
      Image var6 = method_19(var1);
      method_36(var0, var5);
      int var7 = var6.getWidth();
      int var8 = var6.getHeight();
      var2 += method_26(var7, var4);
      var3 += method_27(var8, var4);
      var0.clipRect(var2, var3, var7, var8);
      if ((var0.getClipWidth() | var0.getClipWidth()) > 0) {
         var0.drawImage(var6, var2, var3, 0);
      }

   }

   // $FF: renamed from: a (int) short
   public static final short method_21(int var0) {
      return field_152[(var0 << 2) + 3];
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int, int[]) void
   public static final void method_22(Graphics var0, int var1, int var2, int var3, int var4, int[] var5) {
      if (var1 != -1) {
         Image var7 = method_19(field_151[var1]);
         int var8 = var1 << 2;
         method_23(var0, var7, field_152[var8 + 0], field_152[var8 + 1], field_152[var8 + 2], field_152[var8 + 3], var2, var3, var4, var5);
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, javax.microedition.lcdui.Image, int, int, int, int, int, int, int, int[]) void
   public static final void method_23(Graphics var0, Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9) {
      var6 += method_26(var4, var8);
      var7 += method_27(var5, var8);
      if (method_37(var0, var9, var6, var7, var4, var5) && (var0.getClipWidth() | var0.getClipWidth()) > 0) {
         var0.drawImage(var1, var6 - var2, var7 - var3, 0);
      }

   }

   // $FF: renamed from: a () void
   public static final void method_24() {
      try {
         DataInputStream var0;
         short var1 = (var0 = method_30("chars.img")).readShort();
         int var2 = 0;
         field_151 = new short[var1];
         field_152 = new short[var1 << 2];

         int var3;
         for(var3 = 0; var3 < var1; ++var3) {
            field_151[var3] = (short)var0.readByte();
            var2 = Math.max(var2, field_151[var3]);
            field_152[(var3 << 2) + 0] = var0.readShort();
            field_152[(var3 << 2) + 1] = var0.readShort();
            field_152[(var3 << 2) + 2] = var0.readShort();
            field_152[(var3 << 2) + 3] = var0.readShort();
         }

         field_153 = new short[var1 = var0.readShort()];

         for(var3 = 0; var3 < var1; ++var3) {
            field_153[var3] = var0.readShort();
         }

         field_154 = new short[(var1 = var0.readShort()) << 2];

         for(var3 = 0; var3 < var1; ++var3) {
            field_154[(var3 << 2) + 0] = var0.readShort();
            field_154[(var3 << 2) + 1] = var0.readShort();
            field_154[(var3 << 2) + 2] = var0.readShort();
         }

         for(var3 = 0; var3 < field_153.length; ++var3) {
            boolean var4 = false;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;

            short var12;
            for(int var9 = field_153[var3]; (var12 = field_154[(var9 << 2) + 0]) >= 0; ++var9) {
               int var10 = var12 << 2;
               var5 = Math.min(var5, field_154[(var9 << 2) + 1]);
               var6 = Math.min(var6, field_154[(var9 << 2) + 2]);
               var7 = Math.max(var7, field_154[(var9 << 2) + 1] + field_152[var10 + 2]);
               var8 = Math.max(var8, field_154[(var9 << 2) + 2] + field_152[var10 + 3]);
            }
         }

      } catch (Exception var11) {
      }
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int, int[]) void
   public static final void method_25(Graphics var0, int var1, int var2, int var3, int var4, int[] var5) {
      if (var1 != -1) {
         if (var1 != -1) {
            boolean var7 = false;

            short var18;
            for(int var8 = field_153[var1]; (var18 = field_154[(var8 << 2) + 0]) >= 0; ++var8) {
               int var9 = var18 << 2;
               short var10;
               Image var11 = method_19(var10 = field_151[var18]);
               short var12 = field_152[var9 + 2];
               short var13 = field_152[var9 + 3];
               int var14 = var4 == 1 ? var2 - (var12 + (field_154[(var8 << 2) + 1] << 1)) : var2;
               int var16 = var4 == 1 ? var14 - (method_19(var10).getWidth() - field_152[var9 + 0] - var12) + method_26(var12, 0) : var14 - field_152[var9 + 0] + method_26(var12, 0);
               int var17 = var3 - field_152[var9 + 1] + method_27(var13, 0);
               if (method_37(var0, var5, var14 + field_154[(var8 << 2) + 1], var3 + field_154[(var8 << 2) + 2], var12, Math.min(var13, Math.max(-field_154[(var8 << 2) + 2], 0))) && (var0.getClipWidth() | var0.getClipHeight()) > 0) {
                  if (var4 == 1) {
                     var0.drawImage(var11 == method_19(6) ? method_19(12) : method_19(13), var16 + field_154[(var8 << 2) + 1], var17 + field_154[(var8 << 2) + 2], 0);
                  } else {
                     var0.drawImage(var11, var16 + field_154[(var8 << 2) + 1], var17 + field_154[(var8 << 2) + 2], 0);
                  }
               }
            }

         }
      }
   }

   // $FF: renamed from: a (int, int) int
   public static final int method_26(int var0, int var1) {
      if ((var1 & 1) == 1) {
         return -(var0 >>> 1);
      } else {
         return (var1 & 8) == 8 ? -var0 : 0;
      }
   }

   // $FF: renamed from: b (int, int) int
   public static final int method_27(int var0, int var1) {
      if ((var1 & 2) == 2) {
         return -(var0 >>> 1);
      } else {
         return (var1 & 32) == 32 ? -var0 : 0;
      }
   }

   // $FF: renamed from: a (java.lang.String) byte[][]
   public static final byte[][] method_28(String var0) throws Exception {
      DataInputStream var1;
      short var2 = (var1 = method_30(var0)).readShort();
      short var3 = var1.readShort();
      byte[][] var4 = new byte[var2][var3];

      for(int var5 = 0; var5 < var2; ++var5) {
         var4[var5] = method_31(var1, var3);
      }

      return var4;
   }

   // $FF: renamed from: c (int) void
   public static final void method_29(int var0) throws Exception {
      DataInputStream var1;
      byte var2 = (var1 = method_30(var0 + ".tst")).readByte();
      byte var3 = var1.readByte();
      boolean var4 = false;
      if (var1.readBoolean()) {
         byte var6 = var1.readByte();
         int var7 = 0 + var6;
         if (var0 == 0) {
            field_54 = var2;
            field_55 = var3;
            field_63 = new byte[var6];
            field_65 = new byte[var6];
            field_63 = method_31(var1, var6);
            field_65 = method_31(var1, var6);
            method_19(4).getWidth();
            method_19(4).getHeight();
            return;
         }

         field_56 = var2;
         field_57 = var3;
         field_64 = new byte[var6];
         field_66 = new short[var6];
         field_64 = method_31(var1, var6);
         field_66 = method_32(var1, var6);
         field_141 = new byte[var7 += method_19(5).getWidth() / var2 * (method_19(5).getHeight() / var3)];
         field_141 = method_31(var1, var7);
      }

   }

   // $FF: renamed from: a (java.lang.String) java.io.DataInputStream
   public static final DataInputStream method_30(String var0) {
      return new DataInputStream(class_2.field_255.getClass().getResourceAsStream("/" + var0));
   }

   // $FF: renamed from: a (java.io.DataInputStream, int) byte[]
   public static final byte[] method_31(DataInputStream var0, int var1) throws Exception {
      byte[] var2 = new byte[var1];
      var0.read(var2);
      return var2;
   }

   // $FF: renamed from: a (java.io.DataInputStream, int) short[]
   public static final short[] method_32(DataInputStream var0, int var1) throws Exception {
      short[] var2 = new short[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0.readShort();
      }

      return var2;
   }

   // $FF: renamed from: c (int, int) int
   public static final int method_33(int var0, int var1) {
      return -(var1 >>> field_155[var0]);
   }

   // $FF: renamed from: a (int[], int, int, int, int) int[]
   public static final int[] method_34(int[] var0, int var1, int var2, int var3, int var4) {
      int[] var5;
      return (var5 = new int[]{Math.max(var0[0], var1), Math.max(var0[1], var2), Math.min(var0[2], var1 + var3), Math.min(var0[3], var2 + var4)})[2] >= var5[0] && var5[3] >= var5[1] ? var5 : null;
   }

   // $FF: renamed from: a (int[], int, int, int, int) boolean
   public static final boolean method_35(int[] var0, int var1, int var2, int var3, int var4) {
      return var0[0] >= var1 + var3 || var0[1] >= var2 + var4 || var0[2] <= var1 || var0[3] <= var2;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int[]) boolean
   public static final boolean method_36(Graphics var0, int[] var1) {
      var0.setClip(var1[0], var1[1], method_38(var1), method_39(var1));
      return true;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int[], int, int, int, int) boolean
   public static final boolean method_37(Graphics var0, int[] var1, int var2, int var3, int var4, int var5) {
      if (method_35(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         int[] var6;
         if ((var6 = method_34(var1, var2, var3, var4, var5)) == null) {
            return false;
         } else {
            method_36(var0, var6);
            return true;
         }
      }
   }

   // $FF: renamed from: a (int[]) int
   public static final int method_38(int[] var0) {
      return var0[2] - var0[0];
   }

   // $FF: renamed from: b (int[]) int
   public static final int method_39(int[] var0) {
      return var0[3] - var0[1];
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int[]) int
   public static final int method_40(Graphics var0, int var1, int var2, int var3, int var4, int[] var5) {
      int var6 = method_44(var1);
      if (var1 >= 0) {
         byte var7 = field_159;
         var2 += method_33(var4 & 3, var6);
         var3 += method_33(var4 >>> 2, var7);
         if (method_37(var0, var5, var2, var3, var6, var7)) {
            var0.drawImage(field_150[0], var2 - field_156[var1], var3 - field_157[var1], 20);
         }
      }

      return var6;
   }

   // $FF: renamed from: d (int) void
   public static final void method_41(int var0) {
      if (field_150[var0] == null) {
         try {
            DataInputStream var1;
            int var2 = (var1 = method_30(var0 + ".def")).readUnsignedByte();
            field_156 = method_31(var1, var2);
            field_157 = method_31(var1, var2);
            field_158 = method_31(var1, var2);
            field_159 = var1.readByte();
            field_160 = var1.readByte();
            field_161 = var1.readByte();
            field_150[0] = method_19(var0);
            return;
         } catch (Exception var3) {
         }
      }

   }

   // $FF: renamed from: b () void
   public static final void method_42() {
      try {
         DataInputStream var0;
         field_112 = method_31(var0 = method_30("conts.data"), var0.readShort());
         field_114 = method_31(var0, var0.readShort());
         field_105 = method_31(var0, var0.readShort());
         field_104 = method_32(var0, var0.readShort());
         field_106 = method_32(var0, var0.readShort());
         field_107 = method_31(var0, var0.readShort());
         field_108 = method_31(var0, var0.readShort());
         field_109 = method_32(var0, var0.readShort());
      } catch (Exception var1) {
      }
   }

   // $FF: renamed from: c () void
   public static final void method_43() {
      try {
         DataInputStream var0 = method_30("conts.data");

         for(int var1 = 0; var1 < 3; ++var1) {
            var0.skipBytes(var0.readShort());
         }

         var0.skipBytes(var0.readShort() * 2);
         var0.readShort();
         var0.skipBytes(1142);

         for(int var2 = 0; var2 < 33; ++var2) {
            field_106[(43 + var2) * 13 + 12] = var0.readShort();
            var0.skipBytes(24);
         }

      } catch (Exception var3) {
      }
   }

   // $FF: renamed from: a (int) int
   public static final int method_44(int var0) {
      return var0 < 0 ? field_160 : field_158[var0];
   }

   // $FF: renamed from: e (int) void
   public static final void method_45(int var0) throws Exception {
      DataInputStream var1;
      int var2;
      field_162 = new short[var2 = (var1 = method_30("t" + var0)).readUnsignedShort()];

      for(int var3 = 0; var3 < var2; ++var3) {
         field_162[var3] = var1.readShort();
      }

      field_163 = method_31(var1, var1.readUnsignedShort());
   }

   // $FF: renamed from: b (int) int
   public static final int method_46(int var0) {
      return method_47(field_163, field_162[var0], field_162[var0 + 1]);
   }

   // $FF: renamed from: a (byte[], int, int) int
   public static final int method_47(byte[] var0, int var1, int var2) {
      int var3 = 0;
      if (var1 < var2) {
         int var4 = 1 - field_161;

         for(int var5 = var1; var5 < var2; ++var5) {
            var3 += method_44(var0[var5]) + var4;
         }

         var3 -= var4;
      }

      return var3;
   }

   // $FF: renamed from: a () int
   public static final int method_48() {
      return field_159;
   }

   // $FF: renamed from: d (javax.microedition.lcdui.Graphics, int, int, int, int, int[]) void
   public static final void method_49(Graphics var0, int var1, int var2, int var3, int var4, int[] var5) {
      if (var1 != -1) {
         method_50(var0, field_163, field_162[var1], field_162[var1 + 1], var2, var3, var4, var5);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[], int, int, int, int, int, int[]) void
   public static final void method_50(Graphics var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if ((var6 & 3) != 0) {
         var4 += method_33(var6 & 3, method_47(var1, var2, var3));
      }

      if (var6 >>> 2 != 0) {
         var5 += method_33(var6 >>> 2, field_159);
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         var4 += 1 - field_161 + method_40(var0, var1[var8], var4, var5, 0, var7);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[], short[], short, int[], int, int) short
   public static final short method_51(Graphics var0, byte[] var1, short[] var2, short var3, int[] var4, int var5, int var6) {
      if (var2 != null && var1 != null) {
         int var7 = (var4[3] - var4[1]) / method_48() - 2;
         short var8 = (short)(var2.length - 1 - var7 - 1);
         if (field_87 == 1) {
            if (var3 - 1 >= 0) {
               var3 = (short)(var3 - (var7 + 1));
            }
         } else if (field_87 == 6 && var3 + 1 <= var8) {
            var3 = (short)(var3 + var7 + 1);
         }

         field_87 = 0;
         if (var3 < 0) {
            var3 = 0;
         }

         int var9;
         if (var7 >= var2.length - 2) {
            var3 = 0;
            var7 = var2.length - 2;
         } else if (field_14 != 14) {
            var9 = var2.length - 1;
            byte var10 = 0;
            byte var11 = 1;
            byte var12 = 3;
            if (var6 == 1) {
               var10 = 4;
               var11 = 5;
               var12 = 7;
            } else if (var6 == 2) {
               var10 = 8;
               var11 = 9;
               var12 = 11;
            }

            int var13 = (field_85[var11] + 1) * field_59 + (var3 > var8 ? var8 : var3) * (field_85[var12] - field_85[var11] - 1) * field_59 / var9 + field_62;
            int var14 = (field_85[var12] - field_85[var11] - 1) * field_59 * (var7 + 1) / var9 + 1;
            method_52(var0, var13, var14, field_85[var10] * field_58);
         }

         for(var9 = var3; var9 <= var3 + var7; ++var9) {
            if (var9 + 1 < var2.length) {
               if (var5 == 0) {
                  method_50(var0, var1, var2[var9], var2[var9 + 1], var4[0] + field_58, var4[1] + field_59 + method_48() * (var9 - var3), var5, var4);
               }

               if (var5 == 2) {
                  method_50(var0, var1, var2[var9], var2[var9 + 1], var4[2], var4[1] + field_59 + method_48() * (var9 - var3), var5, var4);
               }

               if (var5 == 1) {
                  method_50(var0, var1, var2[var9], var2[var9 + 1], (var4[2] + var4[0]) / 2, var4[1] + field_59 + method_48() * (var9 - var3), var5, var4);
               }
            }
         }

         return var3;
      } else {
         return var3;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int) void
   public static final void method_52(Graphics var0, int var1, int var2, int var3) {
      var3 += field_61;
      if (var2 <= 2 * field_59) {
         var0.setClip(var3, var1, field_58, var2 / 2);
         var0.drawImage(method_19(4), var3 - method_69(22, field_51, field_53, field_58), var1 - method_70(22, field_51, field_53, field_59), 0);
         var0.setClip(var3, var1 + var2 / 2, field_58, var2 / 2);
         var0.drawImage(method_19(4), var3 - method_69(28, field_51, field_53, field_58), var1 + var2 - field_59 - method_70(28, field_51, field_53, field_59), 0);
      } else {
         method_73(var0, (short)22, (short)4, var3, var1, field_51, field_53, field_58, field_59);
         int var4 = var1;

         while(var1 + field_59 * 2 < var4 + var2) {
            var1 += field_59;
            method_73(var0, (short)77, (short)4, var3, var1, field_51, field_53, field_58, field_59);
         }

         method_73(var0, (short)28, (short)4, var3, var4 + var2 - field_59 - 1, field_51, field_53, field_58, field_59);
      }
   }

   // $FF: renamed from: a (int, int) short[]
   public static final short[] method_53(int var0, int var1) {
      short var2;
      byte[] var3 = new byte[(var2 = field_162[var0 + 1]) - field_162[var0]];
      System.arraycopy(field_163, field_162[var0], var3, 0, var2 - field_162[var0]);
      return method_54(var3, field_162[var0], var1);
   }

   // $FF: renamed from: a (byte[], int, int) short[]
   public static final short[] method_54(byte[] var0, int var1, int var2) {
      if (var0 != null && var2 != 0) {
         short[] var3 = new short[100];
         short var4 = 0;
         short var5 = 0;
         short var6 = 0;

         short var7;
         for(var7 = 0; var6 < var0.length; ++var6) {
            if (var0[var6] == -2) {
               if (method_47(var0, var4, var6) > var2) {
                  var3[var7++] = var4;
                  var3[var7++] = (short)(var5 + 1);
               } else {
                  var3[var7++] = var4;
               }

               var4 = (short)(var6 + 1);
               var5 = (short)(var6 + 1);
            } else if (var0[var6] == -1) {
               if (method_47(var0, var4, var6) > var2) {
                  var3[var7++] = var4;
                  var4 = (short)(var5 + 1);
               }

               var5 = var6;
            }
         }

         if (method_47(var0, var4, var6) > var2) {
            var3[var7++] = var4;
            var3[var7++] = (short)(var5 + 1);
         } else {
            var3[var7++] = var4;
         }

         short[] var8 = new short[var7 + 1];

         for(byte var9 = 0; var9 < var7; ++var9) {
            var8[var9] = (short)(var3[var9] + var1);
         }

         var8[var7] = (short)(var0.length + var1);
         return var8;
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (byte, byte[]) boolean
   public static final boolean method_55(byte var0, byte[] var1) {
      for(int var2 = 0; var2 <= var1.length - 1; ++var2) {
         if (method_117(var0) == var1[var2]) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (byte, short[]) boolean
   public static final boolean method_56(byte var0, short[] var1) {
      for(int var2 = 0; var2 <= var1.length - 1; ++var2) {
         if (method_117(var0) == var1[var2]) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: d () void
   public static final void method_57() {
      method_58();
      method_63();
      if (field_14 == 0) {
         method_94();
         method_91();
         method_66();
      }

      if (field_14 == 6) {
         method_94();
         method_98();
         method_123();
      }

      if (field_91 && System.currentTimeMillis() - field_253 > 800L) {
         System.out.println("qwerty");
         class_0.method_5(4);
         field_253 = System.currentTimeMillis();
      }

   }

   // $FF: renamed from: w () void
   private static void method_58() {
      if (field_101 != -1 && field_101 < field_104.length) {
         field_15 = 0;
         field_91 = false;
         short var0 = field_104[field_101];
         field_101 = -1;
         short[] var10000;
         int var10001;
         short var2;
         int var4;
         byte var7;
         switch (field_105[var0]) {
            case 0:
            case 1:
               field_13 = (short)((byte)(method_164("GAME") ? 1 : 0));
               method_59((short)279, (short)1, true);
               return;
            case 2:
            default:
               break;
            case 3:
               field_166 = field_23;
               if ((field_95 == 1 ? 1 : (field_95 == 2 ? method_144(1) : 0)) == 0) {
                  field_23 = field_98;
                  field_27 = 0;
               } else {
                  field_23 = field_99;
                  field_27 = method_10(field_98);
               }

               if (field_99 == 49) {
                  method_61(20, (byte)114);
               }

               field_121 = null;
               field_205 = false;
               method_103();
               field_15 = 6;
               return;
            case 4:
               field_106[(field_105[var0 + 1] == -1 ? field_99 : (short)field_105[var0 + 1]) * 13 + 11] = (short)field_105[var0 + 2];
               return;
            case 5:
               boolean var1 = false;
               field_94 += 500;
               method_62(field_99);
               method_59((short)182, (short)0, true);
               return;
            case 6:
               var2 = (short)field_105[var0 + 2];
               short var10 = (short)field_105[var0 + 3];
               field_106[field_23 * 13 + 6] = (short)((byte)var2);
               field_106[field_23 * 13 + 7] = (short)((byte)var10);
               field_24 = (short)(var2 * field_58);
               field_25 = (short)(var10 * field_59);
               field_92 = true;
               field_16 = (short)field_105[var0 + 1];
               if (field_16 == 20 || field_16 == 12) {
                  method_43();
                  return;
               }
               break;
            case 7:
               try {
                  field_206 = method_117(field_105[var0 + 1]);
                  System.out.println("START : " + field_206);
                  var2 = (short)field_105[var0 + 2];
                  field_207 = new short[100];
                  field_208 = new short[var2];
                  field_207[0] = var2;
                  int var3 = var2 + 1;

                  for(var4 = 0; var4 <= var2 - 1; ++var4) {
                     short[] var6 = method_53(method_117(field_105[var0 + 3 + var4 * 2]), 240 - 3 * field_54);
                     field_207[var4 + 1] = (short)var3;
                     field_207[var3] = (short)(var6.length - 1);
                     System.arraycopy(var6, 0, field_207, var3 + 1, var6.length);
                     var3 += var6.length + 1;
                     field_208[var4] = (short)field_105[var0 + 3 + var4 * 2 + 1];
                  }

                  field_17 = method_53(field_206, 240 - 3 * field_54);
                  field_15 = 14;
                  System.out.println("Complitted : " + field_206);
                  return;
               } catch (Exception var9) {
                  var9.printStackTrace();
                  return;
               }
            case 8:
               field_225 = (short)field_105[var0 + 1];
               field_223 = new byte[field_106[13 * field_98 + field_225 * 2 + 1] * 2];
               System.arraycopy(field_107, field_106[13 * field_98 + field_225 * 2], field_223, 0, field_223.length);
               field_224 = new byte[field_106[13 * field_99 + field_225 * 2 + 1] * 2];
               System.arraycopy(field_107, field_106[13 * field_99 + field_225 * 2], field_224, 0, field_224.length);
               field_15 = 3;
               return;
            case 9:
               var4 = field_105[var0 + 1];
               method_62(field_99);
               method_81(field_98, field_99, var4);
               if (field_99 == 49) {
                  method_62(20);
                  return;
               }
               break;
            case 10:
               field_106[field_105[var0 + 1] * 13 + 12] = (short)field_105[var0 + 2];
               return;
            case 11:
               method_62(field_105[var0 + 1]);
               return;
            case 12:
               if ((var7 = field_105[var0 + 1]) < field_115.length) {
                  field_115[var7 - 1] = 1;
               }

               switch (var7) {
                  case 1:
                     System.out.println("Quest : " + var7);
                     method_61(17, (byte)11);
                     method_61(24, (byte)20);
                     break;
                  case 2:
                     method_59((short)168, (short)0, true);
                  case 3:
                  default:
                     break;
                  case 4:
                     method_61(37, (byte)57);
                     break;
                  case 5:
                     method_61(38, (byte)66);
                     field_202 = field_201;
                     break;
                  case 6:
                     method_61(28, (byte)69);
                     break;
                  case 8:
                     method_61(22, (byte)73);
                     break;
                  case 10:
                     method_61(20, (byte)16);
                     method_61(49, (byte)119);
                     break;
                  case 100:
                     method_61(20, (byte)114);
                     field_101 = 3;
                     field_204 = true;
                     break;
                  case 110:
                     method_61(2, (byte)48);
                     field_101 = 28;
                     break;
                  case 111:
                     method_61(2, (byte)48);
                     field_101 = 27;
                     break;
                  case 112:
                     method_61(21, (byte)60);
                     break;
                  case 114:
                     method_61(37, (byte)109);
                     field_101 = 3;
                     field_204 = true;
                     break;
                  case 115:
                     method_61(30, (byte)107);
                     method_59((short)173, (short)0, true);
                     break;
                  case 116:
                     method_62(20);
                     method_62(field_99);
                     method_81(field_98, field_99, 0);
                     break;
                  case 117:
                     method_61(22, (byte)112);
                     field_101 = 3;
                     field_204 = true;
                     break;
                  case 118:
                     method_61(18, (byte)16);
                     method_61(17, (byte)8);
                     method_59((short)170, (short)0, true);
                     break;
                  case 119:
                     method_61(26, (byte)108);
                     field_101 = 3;
                     field_204 = true;
                     break;
                  case 120:
                     method_61(29, (byte)115);
                     field_101 = 3;
                     field_204 = true;
                     break;
                  case 121:
                     method_61(38, (byte)110);
                     field_101 = 3;
                     field_204 = true;
                     break;
                  case 122:
                     method_61(28, (byte)111);
                     var10000 = field_106;
                     var10001 = field_98 * 13 + 9;
                     var10000[var10001] = (short)(var10000[var10001] + 20);
                     field_101 = 3;
                     field_204 = true;
                     break;
                  case 123:
                     method_61(21, (byte)99);
                     method_61(57, (byte)100);
                     field_101 = 3;
                     field_204 = true;
                     break;
                  case 124:
                     method_61(18, (byte)18);
                     method_81(field_98, (short)18, 1);
                     method_61(23, (byte)113);
                     break;
                  case 126:
                     method_61(41, (byte)81);
                     method_81(field_98, (short)27, 1);
                     method_62(27);
                     break;
                  case 127:
                     method_61(25, (byte)45);
                     method_61(17, (byte)106);
                     method_81(field_98, (short)25, 1);
                     field_94 -= 50;
               }

               return;
            case 13:
               if ((var7 = field_105[var0 + 1]) < field_115.length) {
                  field_115[var7 - 1] = 2;
               }

               short var8 = 168;
               switch (var7) {
                  case 1:
                     field_94 += 250;
                     method_61(18, (byte)17);
                     method_82(0, 1, 1);
                     method_81(field_98, (short)17, 0);
                     method_62(17);
                     var8 = 172;
                     break;
                  case 2:
                     method_61(30, (byte)52);
                     method_81(field_98, (short)30, 0);
                     method_81(field_98, (short)30, 2);
                     field_94 += 500;
                     var8 = 175;
                     break;
                  case 3:
                     method_62(26);
                     field_94 += 1000;
                     method_82(9, 1, 1);
                     method_81(field_98, (short)26, 2);
                     var8 = 174;
                     break;
                  case 4:
                     field_94 += 2500;
                     method_62(37);
                     method_82(10, 1, 1);
                     method_81(field_98, (short)37, 0);
                     var8 = 175;
                     break;
                  case 5:
                     field_94 += 250;
                     method_62(38);
                     method_81(field_98, (short)38, 0);
                     var8 = 176;
                     break;
                  case 6:
                     method_62(28);
                     field_94 += 1500;
                     var10000 = field_106;
                     var10001 = field_98 * 13 + 9;
                     var10000[var10001] = (short)(var10000[var10001] - 20);
                     method_82(3, 1, 1);
                     method_81(field_98, (short)28, 1);
                     var8 = 177;
                  case 7:
                  default:
                     break;
                  case 8:
                     field_94 += 1000;
                     method_61(22, (byte)103);
                     method_82(11, 1, 1);
                     var8 = 180;
                     field_101 = 103;
                     break;
                  case 9:
                     method_62(23);
                     method_82(1, 1, 1);
                     var8 = 180;
                     break;
                  case 10:
                     field_94 += 1000;
                     method_62(20);
                     var8 = 178;
                     break;
                  case 11:
                     field_94 += 1000;
                     method_62(29);
                     method_82(7, 1, 1);
                     method_81(field_98, (short)29, 1);
                     var8 = 179;
               }

               field_96 += 40;
               method_59(var8, (short)0, true);
               break;
            case 14:
               method_59(method_117(field_105[var0 + 1]), (short)0, true);
               return;
            case 15:
               method_61(field_105[var0 + 1], (byte)24);
               return;
            case 16:
               class_0.method_5(field_105[var0 + 1]);
               return;
         }

      }
   }

   // $FF: renamed from: a (short, short, boolean) void
   public static final void method_59(short var0, short var1, boolean var2) {
      field_17 = method_53(var0, 240 - 5 * field_54);
      field_15 = 7;
      field_241 = var1;
      field_167 = false;
      if (var2) {
         class_0.method_5(3);
      }

   }

   // $FF: renamed from: a (byte[], short, boolean) void
   public static final void method_60(byte[] var0, short var1, boolean var2) {
      field_15 = 7;
      field_241 = var1;
      field_167 = true;
      if (var2) {
         class_0.method_5(3);
      }

   }

   // $FF: renamed from: a (int, byte) void
   public static final void method_61(int var0, byte var1) {
      field_106[var0 * 13 + 11] = (short)var1;
   }

   // $FF: renamed from: f (int) void
   public static final void method_62(int var0) {
      field_106[var0 * 13 + 12] = -1;
      method_102();
   }

   // $FF: renamed from: x () void
   private static void method_63() {
      if (field_16 != 300) {
         field_15 = 100;
         field_71 = field_16;
         method_102();
         field_16 = 300;
      }

      if (field_15 != 300) {
         field_7 = true;
         if (field_15 == 100) {
            field_14 = 100;
            field_88 = true;
            field_15 = 300;
         } else {
            switch (field_14) {
               case 0:
                  field_45 = field_125;
                  field_46 = field_126;
                  field_47 = field_60;
                  field_48 = field_62;
                  field_34 = field_36;
                  field_35 = field_37;
                  break;
               case 1:
                  field_184 = field_122;
                  break;
               case 6:
                  field_49 = field_125;
                  field_50 = field_126;
            }

            field_36 = 0;
            field_37 = 0;
            field_60 = 0;
            field_62 = 0;
            field_61 = 0;
            field_185 = 0;
            field_149 = -1;
            if (field_15 == 0) {
               field_17 = null;
               field_18 = null;
               field_242 = null;
               field_82 = null;
               field_83 = null;
               field_84 = null;
               field_85 = null;
               field_86 = null;
               method_17(2);
               method_17(4);
            }

            if (field_15 == 7) {
               if (field_17 != null && field_17.length > 7) {
                  field_15 = 11;
               }

               if (field_18 != null && field_18.length > 7) {
                  field_15 = 11;
                  System.out.println("2");
               }
            }

            method_64(field_15);
            field_132 = field_127;
            int var1;
            int var5;
            switch (field_15) {
               case 0:
                  field_197 = true;
                  field_132 = field_128;
                  field_13 = 2;
                  field_49 = 0;
                  field_50 = 0;
                  if (field_71 < 16) {
                     field_116[field_71] = 1;
                  }

                  field_24 = (short)(method_13((short)field_103[field_23]) * field_58);
                  field_25 = (short)(method_14((short)field_103[field_23]) * field_59);
                  field_91 = false;
                  field_26 = null;
                  field_38 = 4 * (field_12 == 0 ? 1 : (field_12 == 1 ? 2 : 4));
                  field_60 = field_57;
                  field_62 = field_57;
                  if (field_14 == 100) {
                     var5 = (method_13((short)field_103[field_23]) - field_67 + 1) * field_56;
                     var1 = (method_14((short)field_103[field_23]) - field_68 + 1) * field_57;
                     field_36 = var5 > 0 ? var5 : 0;
                     field_37 = var1 > 0 ? var1 : 0;
                  } else if (field_45 == 0 && field_46 == 0) {
                     field_125 = method_13((short)field_103[field_23]) - field_36 / field_58;
                     field_126 = method_14((short)field_103[field_23]) - field_37 / field_59;
                  } else {
                     field_125 = field_45;
                     field_126 = field_46;
                     field_36 = field_34;
                     field_37 = field_35;
                     field_60 = field_47;
                     field_62 = field_48;
                  }

                  try {
                     field_76 = method_90(field_72, 0);
                  } catch (Exception var4) {
                     System.out.println("scan_game_field");
                     var4.printStackTrace();
                  }

                  method_139();
                  field_92 = true;
                  field_110 = new byte[field_102.length];
                  method_18(9);
                  break;
               case 1:
                  if (field_13 == 0) {
                     field_13 = (short)((byte)(method_164("GAME") ? 1 : 0));
                  }

                  field_122 = field_184;
                  field_123 = method_87(field_83, field_122);
                  field_124 = method_88(field_83, field_122);
                  field_26 = null;
                  method_17(5);
                  if (field_14 == 200 || field_14 == 20) {
                     class_0.method_5(0);
                  }
                  break;
               case 2:
               case 17:
               case 18:
                  if (field_15 == 17) {
                     field_110 = new byte[method_10(field_23)];
                  }

                  if (field_15 == 2) {
                     field_110 = new byte[field_106[13 * field_23 + 3]];
                  }

                  if (field_15 == 18) {
                     field_110 = new byte[field_106[13 * field_23 + 5]];
                  }

                  field_17 = method_53(282, 240 - 3 * field_54);
                  field_232 = 0;
                  field_233 = 0;
                  field_234 = 0;
                  field_235 = 0;
                  if (field_110.length > 0) {
                     field_110[0] = 1;
                  }

                  field_19 = 0;
                  field_123 = field_84[2];
                  field_124 = field_84[3];
                  break;
               case 3:
                  field_214 = field_84.length / 8;
                  field_215 = field_225 == 0 ? 3 : 4;
                  field_168 = false;
                  field_19 = 0;
                  field_20 = 0;
                  field_123 = method_87(field_84, field_216 + field_215 * 2 * field_217);
                  field_124 = method_88(field_84, field_216 + field_215 * 2 * field_217);
                  if (field_225 == 0) {
                     field_17 = method_53(282, 240 - 3 * field_54);
                  }

                  field_110 = new byte[field_223.length / 2 + field_224.length / 2];
               case 4:
               case 12:
               default:
                  break;
               case 5:
                  boolean var0 = false;
                  if (field_225 == 0) {
                     var5 = 282;
                  } else if (field_226 == 0) {
                     var5 = field_114[field_223[field_227 * 2] * field_113 + 2];
                  } else {
                     var5 = field_114[field_224[field_227 * 2] * field_113 + 2];
                  }

                  field_17 = method_53(var5, 240 - 3 * field_54);
                  field_229 = 0;
                  field_231 = 0;
                  break;
               case 6:
                  field_60 = field_55;
                  field_62 = field_55;
                  field_92 = false;
                  field_91 = false;
                  field_26 = null;
                  field_38 = 4;
                  field_28 = 100;
                  field_180 = (short)(field_120[field_27 * 2] * field_56);
                  field_181 = (short)(field_120[field_27 * 2 + 1] * field_56);
                  if (field_49 == 0 && field_50 == 0) {
                     field_125 = field_120[field_27 * 2];
                     field_126 = field_120[field_27 * 2 + 1];
                  } else {
                     field_125 = field_49;
                     field_126 = field_50;
                  }

                  method_104();
                  field_110 = new byte[field_117.length + 1];
                  break;
               case 7:
               case 11:
               case 22:
                  field_185 = 0;
                  field_122 = 0;
                  field_61 = field_54;
                  field_60 = (320 - field_78 * field_59) / 2;
                  field_62 = (320 - field_78 * field_59) / 2;
                  break;
               case 8:
                  field_17 = method_53(252, 240 - 3 * field_54);
                  break;
               case 9:
                  field_17 = method_53(field_5 ? 301 : 300, 240 - 3 * field_54);
                  break;
               case 10:
                  if (field_86 != null) {
                     field_123 = method_85(field_86, field_186);
                     field_124 = method_86(field_86, field_186);
                  }
                  break;
               case 13:
               case 19:
                  field_122 = 0;
                  field_60 = 320 - (field_78 + 1) * field_59;
                  field_62 = 320 - (field_78 + 1) * field_59;
                  break;
               case 14:
                  field_212 = true;
                  field_213 = false;
                  field_209 = 0;
                  field_210 = 0;
                  field_211 = 0;
                  break;
               case 15:
                  field_122 = 0;
                  field_60 = 320 - (field_78 + 2) * field_59;
                  field_62 = 320 - (field_78 + 2) * field_59;
                  break;
               case 16:
                  field_110[0] = 1;
                  field_17 = method_53(field_243, 240 - 3 * field_54);
                  field_185 = 0;
                  break;
               case 20:
                  field_61 = 240 - field_54 * 8;
                  field_122 = 0;
                  field_60 = 320 - (field_78 + 2) * field_59;
                  field_62 = 320 - (field_78 + 2) * field_59;
                  break;
               case 21:
                  field_242 = new byte[0];
                  var1 = 0;

                  for(int var2 = 0; var2 < field_115.length; ++var2) {
                     if (field_115[var2] == 1) {
                        byte[] var3 = method_79(field_163, field_162[200 + var2], 1, field_162[201 + var2] - field_162[200 + var2]);
                        field_242 = method_80(field_242, var3, field_242.length, 0, var3.length);
                        var1 += var3.length;
                     }
                  }

                  field_242 = method_76(field_242, var1);
                  field_18 = method_54(field_242, 0, 240 - 3 * field_54);
            }

            field_14 = field_15;
            field_15 = 300;
            method_67();
         }
      }
   }

   // $FF: renamed from: a (short) void
   public static final void method_64(short var0) {
      if (var0 == 0) {
         method_65(var0, field_71 + "");
      } else if (var0 == 3 && field_225 == 0) {
         method_65(var0, "i19");
      } else if (var0 == 1 && field_13 == 0) {
         method_65(var0, "i21");
      } else if (var0 == 1 && field_13 == 1) {
         method_65(var0, "i20");
      } else {
         method_65(var0, "i" + field_133[var0]);
      }
   }

   // $FF: renamed from: a (short, java.lang.String) void
   public static final void method_65(short var0, String var1) {
      if (var0 != 0 && var0 != 6) {
         field_58 = field_54;
         field_59 = field_55;
         field_79 = 4;
      } else {
         field_58 = field_56;
         field_59 = field_57;
         field_79 = 5;
      }

      field_51 = method_19(field_79).getWidth() / field_58;
      field_52 = method_19(field_79).getHeight() / field_59;
      field_53 = field_51 * field_52;

      try {
         field_72 = method_28(var1 + ".tmp");
         field_77 = (short)field_72.length;
         field_78 = (short)field_72[0].length;
         field_43 = field_77 * field_58 - 240;
         field_44 = field_78 * field_59 - (320 - field_55 * 4);
         field_67 = 239 / field_58 + 2;
         field_68 = (320 - field_59 - 1) / field_59 + 2;
         if (field_77 < field_67) {
            field_67 = field_77;
         }

         if (field_78 < field_68) {
            field_68 = field_78;
         }

         if (var0 != 0 && var0 != 6) {
            method_75(field_72);
         }

      } catch (Exception var3) {
      }
   }

   // $FF: renamed from: y () void
   private static final void method_66() {
      int var0 = field_36 / field_58;
      int var1 = field_37 / field_59;
      int var2;
      int var3;
      int var4;
      int var5;
      if (var0 != field_39) {
         if (var0 < field_39) {
            --field_41;
            if (field_41 < 0) {
               field_41 = field_67 - 1;
            }

            var2 = var0;
            var3 = field_41;
         } else {
            var3 = field_41++;
            if (field_41 >= field_67) {
               field_41 = 0;
            }

            var2 = var0 + field_67 - 1;
         }

         field_69[var3] = var2;

         for(var5 = 0; var5 < field_68; ++var5) {
            var4 = var5 * field_59;
            method_72(field_81, field_72, field_79, var3 * field_58, var4, var2, field_70[var5], field_51, field_53, field_58, field_59);
         }
      }

      if (var1 != field_40) {
         if (var1 < field_40) {
            --field_42;
            if (field_42 < 0) {
               field_42 = field_68 - 1;
            }

            var2 = var1;
            var3 = field_42;
         } else {
            var3 = field_42++;
            if (field_42 >= field_68) {
               field_42 = 0;
            }

            var2 = var1 + field_68 - 1;
         }

         field_70[var3] = var2;

         for(var5 = 0; var5 < field_67; ++var5) {
            var4 = var5 * field_58;
            method_72(field_81, field_72, field_79, var4, var3 * field_59, field_69[var5], var2, field_51, field_53, field_58, field_59);
         }
      }

      field_39 = var0;
      field_40 = var1;
      if ((!field_91 || !field_92) && System.currentTimeMillis() - field_169 > field_170) {
         for(var2 = 0; var2 < field_72.length; ++var2) {
            for(var3 = 0; var3 < field_72[0].length; ++var3) {
               if (field_72[var2][var3] == 46 || field_72[var2][var3] == 47 || field_72[var2][var3] == 49) {
                  if (method_144(2) == 0 || (var4 = method_144(3)) == 2) {
                     break;
                  }

                  field_72[var2][var3] = (byte)(46 + var4);
                  var5 = var2 * field_58;
                  int var6 = var3 * field_59;
                  if (var5 > field_134) {
                     var5 -= field_134;
                  }

                  var5 -= field_171 * field_58;
                  if (var6 > field_135) {
                     var6 -= field_135;
                  }

                  var6 -= field_172 * field_59;
                  if (var2 * field_58 > field_39 * field_58 && var2 * field_58 < 240 + field_39 * field_58 && var3 * field_59 > field_40 * field_59 && var3 * field_59 < 320 - 2 * field_59 + field_40 * field_59) {
                     method_72(field_81, field_72, field_79, var5, var6, var2, var3, field_51, field_53, field_58, field_59);
                  }

                  field_169 = System.currentTimeMillis();
                  field_170 = (long)method_144(10000);
               }
            }
         }
      }

   }

   // $FF: renamed from: z () void
   private static final void method_67() {
      method_68(new short[]{0, 0, (short)(field_67 - 1), (short)(field_68 - 1)});
   }

   // $FF: renamed from: a (short[]) void
   private static final void method_68(short[] var0) {
      field_39 = field_36 / field_58;
      field_40 = field_37 / field_59;
      field_171 = field_39;
      field_172 = field_40;
      field_42 = 0;
      field_41 = 0;

      for(int var1 = 0; var1 < field_67; ++var1) {
         field_69[var1] = field_39 + var1;

         for(int var2 = 0; var2 < field_68; ++var2) {
            field_70[var2] = field_40 + var2;
            if (var1 >= var0[0] && var1 <= var0[2] && var2 >= var0[1] && var2 <= var0[3]) {
               method_72(field_81, field_72, field_79, var1 * field_58, var2 * field_59, field_69[var1], field_70[var2], field_51, field_53, field_58, field_59);
            }
         }
      }

   }

   // $FF: renamed from: a (int, int, int, int) int
   public static final int method_69(int var0, int var1, int var2, int var3) {
      if (var0 < var2) {
         return var0 % var1 * var3;
      } else {
         return var3 == field_54 ? field_63[var0 - var2] : field_64[var0 - var2];
      }
   }

   // $FF: renamed from: b (int, int, int, int) int
   public static final int method_70(int var0, int var1, int var2, int var3) {
      if (var0 < var2) {
         return var0 / var1 * var3;
      } else {
         return var3 == field_55 ? field_65[var0 - var2] : field_66[var0 - var2];
      }
   }

   // $FF: renamed from: a (byte[][], int, int) short
   public static final short method_71(byte[][] var0, int var1, int var2) {
      try {
         return method_117(var0[var1 - (var1 > field_77 - 1 ? 1 : 0)][var2 - (var2 > field_78 - 1 ? 1 : 0)]);
      } catch (Exception var4) {
         return 0;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[][], short, int, int, int, int, int, int, int, int) void
   public static final void method_72(Graphics var0, byte[][] var1, short var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      method_73(var0, method_71(var1, var5, var6), var2, var3, var4, var7, var8, var9, var10);
      if (field_14 == 0 && !field_199 && (var5 == 0 || var6 == 0 || var5 >= var1.length - 1 || var6 >= var1[0].length - 1)) {
         method_22(var0, 36, var3, var4, 0, field_130);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, short, short, int, int, int, int, int, int) void
   public static final void method_73(Graphics var0, short var1, short var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         var0.setClip(var3, var4, var7, var8);
         var0.drawImage(method_19(var2), var3 - method_69(var1, var5, var6, var7), var4 - method_70(var1, var5, var6, var8), 0);
      } catch (Exception var10) {
         System.out.println("render_tile");
         var10.printStackTrace();
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[][], short, int, int, int, int, int, int) void
   public static final void method_74(Graphics var0, byte[][] var1, short var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for(int var9 = 0; var9 <= var1.length - 1; ++var9) {
         for(int var10 = 0; var10 <= var1[0].length - 1; ++var10) {
            method_72(var0, var1, var2, var3 + var9 * var7, var4 + var10 * var8, var9, var10, var5, var6, var7, var8);
         }
      }

   }

   // $FF: renamed from: a (byte[][]) void
   public static final void method_75(byte[][] var0) {
      field_85 = new byte[8];
      field_82 = new byte[0];
      field_84 = new byte[0];
      field_83 = new byte[0];
      field_86 = new byte[0];

      for(byte var1 = 0; var1 < field_78; ++var1) {
         for(byte var2 = 0; var2 < field_77; ++var2) {
            if (!method_55(var0[var2][var1], field_136)) {
               if (method_55(var0[var2][var1], field_139)) {
                  byte[] var6 = new byte[]{var2, var1, var2, var1};
                  field_86 = method_80(field_86, var6, field_86.length, 0, 4);
               } else if (var0[var2][var1] == field_140[0]) {
                  if (field_85[0] == 0 && field_85[1] == 0) {
                     field_85[0] = var2;
                     field_85[1] = var1;
                  } else {
                     field_85[4] = var2;
                     field_85[5] = var1;
                  }
               } else if (var0[var2][var1] == field_140[1]) {
                  if (field_85[2] == 0 && field_85[3] == 0) {
                     field_85[2] = var2;
                     field_85[3] = var1;
                  } else {
                     field_85[6] = var2;
                     field_85[7] = var1;
                  }
               }
            } else {
               byte var3 = var2;

               byte var4;
               for(var4 = var1; !method_55(var0[var3][var4], field_137); ++var4) {
               }

               while(!method_55(var0[var3][var4], field_138)) {
                  ++var3;
               }

               byte[] var5 = new byte[]{var2, var1, var3, var4};
               if (var0[var2][var1] != field_136[0] && var0[var2][var1] != field_136[1] && var0[var2][var1] != field_136[2]) {
                  if (var0[var2][var1] != field_136[3] && var0[var2][var1] != field_136[4] && var0[var2][var1] != field_136[7]) {
                     if (var0[var2][var1] == field_136[5] || var0[var2][var1] == field_136[6]) {
                        field_83 = method_80(field_83, var5, field_83.length, 0, 4);
                     }
                  } else {
                     field_84 = method_80(field_84, var5, field_84.length, 0, 4);
                  }
               } else {
                  field_82 = method_80(field_82, var5, field_82.length, 0, 4);
               }
            }
         }
      }

   }

   // $FF: renamed from: a (byte[], int) byte[]
   public static final byte[] method_76(byte[] var0, int var1) {
      if (var1 < 0) {
         return var0;
      } else {
         int var2 = var0.length;
         byte[] var3 = new byte[var1];
         if (var2 > var1) {
            System.arraycopy(var0, 0, var3, 0, var1);
         } else {
            System.arraycopy(var0, 0, var3, 0, var2);
         }

         return var3;
      }
   }

   // $FF: renamed from: a (short[], int) short[]
   public static final short[] method_77(short[] var0, int var1) {
      if (var1 < 0) {
         return var0;
      } else {
         int var2 = var0.length;
         short[] var3 = new short[var1];
         if (var2 > var1) {
            System.arraycopy(var0, 0, var3, 0, var1);
         } else {
            System.arraycopy(var0, 0, var3, 0, var2);
         }

         return var3;
      }
   }

   // $FF: renamed from: a (byte[], int, int) byte[]
   public static final byte[] method_78(byte[] var0, int var1, int var2) {
      int var3 = var0.length;
      if (var1 >= 0 && var1 <= var3 - 1) {
         byte[] var4 = method_76(var0, var3 - var2);
         System.arraycopy(var0, (var1 + 1) * var2, var4, var1 * var2, var3 - (var1 + 1) * var2);
         return var4;
      } else {
         return var0;
      }
   }

   // $FF: renamed from: a (byte[], int, int, int) byte[]
   public static final byte[] method_79(byte[] var0, int var1, int var2, int var3) {
      byte[] var4 = new byte[var2 * var3];
      System.arraycopy(var0, var1, var4, 0, var2 * var3);
      return var4;
   }

   // $FF: renamed from: a (byte[], byte[], int, int, int) byte[]
   public static final byte[] method_80(byte[] var0, byte[] var1, int var2, int var3, int var4) {
      int var5 = var1.length;
      byte[] var6 = method_76(var0, var0.length - var4 * var3 + var5);
      System.arraycopy(var1, 0, var6, var2, var5);
      System.arraycopy(var0, var2 + var3 * var4, var6, var2 + var5, var0.length - (var2 + var3 * var4));
      return var6;
   }

   // $FF: renamed from: a (short, short, int) void
   public static final void method_81(short var0, short var1, int var2) {
      for(int var3 = 0; var3 < field_106[var1 * 13 + var2 * 2 + 1]; ++var3) {
         boolean var4 = false;
         int var5 = field_106[var1 * 13 + var2 * 2] + var3 * 2;

         for(int var6 = 0; var6 < field_106[var0 * 13 + var2 * 2 + 1]; ++var6) {
            if (field_107[field_106[var0 * 13 + var2 * 2] + var6 * 2] == field_107[var5] && field_107[field_106[var0 * 13 + var2 * 2] + var6 * 2 + 1] < 120) {
               int var7 = field_107[field_106[var0 * 13 + var2 * 2] + var6 * 2 + 1] + field_107[var5 + 1];
               field_107[field_106[var0 * 13 + var2 * 2] + var6 * 2 + 1] = (byte)(var7 < 120 ? var7 : 120);
               var4 = true;
               break;
            }
         }

         if (!var4) {
            if (var2 == 0 && method_10(var0) >= 5) {
               break;
            }

            byte[] var8 = method_79(field_107, var5, 1, 2);
            field_107 = method_80(field_107, var8, field_106[var0 * 13 + var2 * 2] + field_106[var0 * 13 + 1 + var2 * 2] * 2, 0, 2);
            method_84(var0, var8.length, var2);
         }

         if (var5 == 3 && var2 == 1) {
            field_106[9] = 45;
         }
      }

      if (var2 == 0 && field_106[24] != 26) {
         field_106[24] = 26;
      }

   }

   // $FF: renamed from: a (int, int, int) void
   public static final void method_82(int var0, int var1, int var2) {
      for(int var3 = 0; var3 < field_106[field_98 * 13 + 2 * var2 + 1]; ++var3) {
         int var4 = var3 * 2 + field_106[field_98 * 13 + 2 * var2];
         if (field_107[var4] == var0) {
            byte[] var5 = new byte[0];
            field_107 = method_80(field_107, var5, var4, var1, 2);
            method_84(field_98, -var1 * 2, var2);
         }

         if (var0 == 3 && var2 == 1) {
            field_106[9] = 30;
         }
      }

   }

   // $FF: renamed from: a (int, int) void
   public static final void method_83(int var0, int var1) {
      if (var0 >= field_106[field_98 * 13] && var0 < field_106[field_98 * 13] + method_10(field_98) * 2) {
         byte[] var2 = new byte[0];
         field_107 = method_80(field_107, var2, var0, var1, 2);
         method_84(field_98, -var1 * 2, 0);
      }

   }

   // $FF: renamed from: b (int, int, int) void
   public static final void method_84(int var0, int var1, int var2) {
      short[] var10000 = field_106;
      var10000[var0 * 13 + 1 + var2 * 2] = (short)(var10000[var0 * 13 + 1 + var2 * 2] + var1 / 2);
      if (var2 < 1) {
         var10000 = field_106;
         var10000[var0 * 13 + 2] = (short)(var10000[var0 * 13 + 2] + var1);
      }

      if (var2 < 2) {
         var10000 = field_106;
         var10000[var0 * 13 + 4] = (short)(var10000[var0 * 13 + 4] + var1);
      }

      for(int var3 = var0 + 1; var3 < field_106.length / 13; ++var3) {
         var10000 = field_106;
         var10000[var3 * 13] = (short)(var10000[var3 * 13] + var1);
         var10000 = field_106;
         var10000[var3 * 13 + 2] = (short)(var10000[var3 * 13 + 2] + var1);
         var10000 = field_106;
         var10000[var3 * 13 + 4] = (short)(var10000[var3 * 13 + 4] + var1);
      }

   }

   // $FF: renamed from: a (byte[], int) byte
   public static final byte method_85(byte[] var0, int var1) {
      return var0[var1 * 4];
   }

   // $FF: renamed from: b (byte[], int) byte
   public static final byte method_86(byte[] var0, int var1) {
      return var0[var1 * 4 + 1];
   }

   // $FF: renamed from: c (byte[], int) byte
   public static final byte method_87(byte[] var0, int var1) {
      return var0[var1 * 4 + 2];
   }

   // $FF: renamed from: d (byte[], int) byte
   public static final byte method_88(byte[] var0, int var1) {
      return var0[var1 * 4 + 3];
   }

   // $FF: renamed from: e (byte[], int) byte
   public static final byte method_89(byte[] var0, int var1) {
      return (byte)(var0[var1 * 4 + 3] - var0[var1 * 4 + 1] + 1);
   }

   // $FF: renamed from: a (byte[][], int) byte[][]
   public static final byte[][] method_90(byte[][] var0, int var1) {
      byte[][] var2 = new byte[field_77][field_78];

      for(byte var3 = 0; var3 < field_78; ++var3) {
         for(byte var4 = 0; var4 < field_77; ++var4) {
            var2[var4][var3] = (byte)(field_141[method_117(var0[var4][var3])] == 5 && (!field_9 || var1 == 6) ? 0 : 100);
            if (var2[var4][var3] != 0) {
               if (var1 == 0) {
                  if (method_12((short)var4, (short)var3) != 100) {
                     var2[var4][var3] = 0;
                  }
               } else if (var1 == 6) {
                  for(int var5 = 0; var5 < field_117.length; ++var5) {
                     byte var6 = field_117[var5];
                     if (var4 == field_120[var6 * 2] && var3 == field_120[var6 * 2 + 1] && field_119[var6 * 2 + 1] > 0) {
                        var2[var4][var3] = 0;
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   // $FF: renamed from: A () void
   private static final void method_91() {
      if (field_91 || field_92) {
         field_173 = field_36;
         field_174 = field_37;
         short var0 = field_24;
         short var1 = field_25;
         if (field_36 > 0 && var0 - field_36 < field_58 * (field_67 - 1) / 2 / field_58 * field_58) {
            field_36 -= field_38;
         } else if (field_36 < field_43 && var0 - field_36 > (120 + 2 * field_58) / field_58 * field_58) {
            field_36 += field_38;
         } else if (field_36 > 0 && var0 - field_36 < (120 - 2 * field_58) / field_58 * field_58) {
            field_36 -= field_38;
         }

         if (field_37 > 0 && var1 - field_37 < field_59 * (field_68 - 1) / 2 / field_59 * field_59) {
            field_37 -= field_38;
         } else if (field_37 < field_44 && var1 - field_37 > (160 + 2 * field_59) / field_59 * field_59) {
            field_37 += field_38;
         } else if (field_37 > 0 && var1 - field_37 < (160 - 2 * field_59) / field_59 * field_59) {
            field_37 -= field_38;
         }

         if (field_173 == field_36 && field_174 == field_37 && field_92) {
            field_36 = field_36 / field_58 * field_58;
            field_37 = field_37 / field_59 * field_59;
            field_173 = field_36;
            field_174 = field_37;
            field_92 = false;
            field_125 = method_13(field_23) - field_36 / field_58;
            field_126 = method_14(field_23) - field_37 / field_59;
         }

      }
   }

   // $FF: renamed from: b (int, int) void
   private static final void method_92(int var0, int var1) {
      if (field_36 + var0 >= 0 && field_36 + var0 <= field_43) {
         field_36 += var0;
      }

      if (field_37 + var1 >= 0 && field_37 + var1 <= field_44) {
         field_37 += var1;
      }

   }

   // $FF: renamed from: B () void
   private static final void method_93() {
      int var0 = field_83.length / 4 - 1;
      if (field_87 == 1) {
         if (field_122 > 0) {
            --field_122;
         } else {
            field_122 = var0;
         }
      } else if (field_87 == 6) {
         if (field_122 < var0) {
            ++field_122;
         } else {
            field_122 = 0;
         }
      }

      field_87 = 0;
      field_123 = method_87(field_83, field_122);
      field_124 = method_88(field_83, field_122);
   }

   // $FF: renamed from: C () void
   private static final void method_94() {
      if (field_87 != 0 && (System.currentTimeMillis() - field_164 >= 500L || field_165)) {
         field_165 = false;
         switch (field_87) {
            case 1:
               if (field_126 > 0) {
                  --field_126;
                  return;
               }

               if (field_37 > 0) {
                  method_92(0, -1 * field_59);
                  field_197 = true;
                  return;
               }
               break;
            case 2:
               if (field_125 > 0) {
                  --field_125;
                  return;
               }

               if (field_36 > 0) {
                  method_92(-1 * field_58, 0);
                  field_197 = true;
                  return;
               }
            case 3:
            case 4:
            default:
               break;
            case 5:
               if (field_125 < (field_14 == 6 ? field_67 - 1 : field_67 - 1 - 1)) {
                  ++field_125;
                  return;
               }

               if (field_36 < field_43) {
                  method_92(1 * field_58, 0);
                  field_197 = true;
               }
               break;
            case 6:
               if (field_126 < (field_14 == 6 ? field_68 - 1 : field_68 - 1 - 1 - 1)) {
                  ++field_126;
                  return;
               }

               if (field_37 < field_44) {
                  method_92(0, 1 * field_59);
                  field_197 = true;
                  return;
               }
         }

      }
   }

   // $FF: renamed from: a (byte[][], byte, byte, byte, byte) byte
   public static final byte method_95(byte[][] var0, byte var1, byte var2, byte var3, byte var4) {
      var0[var1][var2] = 99;
      var0[var3][var4] = 1;
      byte var5 = 1;
      boolean var6 = false;
      if (field_121 != null) {
         var0[field_121[0]][field_121[1]] = 0;
      }

      for(byte var7 = 0; var7 < var0.length * var0[0].length; ++var7) {
         boolean var8 = false;

         for(byte var9 = 0; var9 < var0[0].length; ++var9) {
            for(byte var10 = 0; var10 < var0.length; ++var10) {
               if (var0[var10][var9] == var5) {
                  if (var10 < var0.length - 1 && var0[var10 + 1][var9] > var5) {
                     if (var0[var10 + 1][var9] == 99) {
                        var6 = true;
                        break;
                     }

                     var0[var10 + 1][var9] = (byte)(var5 + 1);
                     var8 = true;
                  }

                  if (var10 > 0 && var0[var10 - 1][var9] > var5) {
                     if (var0[var10 - 1][var9] == 99) {
                        var6 = true;
                        break;
                     }

                     var0[var10 - 1][var9] = (byte)(var5 + 1);
                     var8 = true;
                  }

                  if (var9 < var0[0].length - 1 && var0[var10][var9 + 1] > var5) {
                     if (var0[var10][var9 + 1] == 99) {
                        var6 = true;
                        break;
                     }

                     var0[var10][var9 + 1] = (byte)(var5 + 1);
                     var8 = true;
                  }

                  if (var9 > 0 && var0[var10][var9 - 1] > var5) {
                     if (var0[var10][var9 - 1] == 99) {
                        var6 = true;
                        break;
                     }

                     var0[var10][var9 - 1] = (byte)(var5 + 1);
                     var8 = true;
                  }
               }
            }

            if (var6) {
               break;
            }
         }

         if (var6) {
            break;
         }

         if (!var8) {
            var5 = 0;
            break;
         }

         ++var5;
      }

      return var5;
   }

   // $FF: renamed from: a (byte[][], byte[][], byte, byte, byte, byte) byte[]
   public static final byte[] method_96(byte[][] var0, byte[][] var1, byte var2, byte var3, byte var4, byte var5) {
      try {
         if (field_141[method_117(var0[var4][var5])] == 5 || var4 == var2 && var5 == var3) {
            if (field_14 == 0 && (var4 != var2 || var5 != var3)) {
               method_59((short)291, (short)0, true);
            }

            return null;
         } else if (Math.abs(var2 - var4) == 1 && var3 == var5 || Math.abs(var3 - var5) == 1 && var2 == var4) {
            return new byte[]{var4, var5};
         } else {
            byte var6;
            if ((var6 = method_95(var1, var2, var3, var4, var5)) != 0 && var6 <= 63) {
               short var7;
               short var8;
               if (var2 < var1.length - 1 && var1[var2 + 1][var3] == var6) {
                  var7 = (short)(var2 + 1);
                  var8 = (short)var3;
               } else if (var2 > 0 && var1[var2 - 1][var3] == var6) {
                  var7 = (short)(var2 - 1);
                  var8 = (short)var3;
               } else if (var3 < var1[0].length - 1 && var1[var2][var3 + 1] == var6) {
                  var7 = (short)var2;
                  var8 = (short)(var3 + 1);
               } else {
                  if (var3 <= 0 || var1[var2][var3 - 1] != var6) {
                     return null;
                  }

                  var7 = (short)var2;
                  var8 = (short)(var3 - 1);
               }

               boolean var9 = false;
               byte[] var10;
               (var10 = new byte[var6 * 2])[0] = (byte)var7;
               byte var14 = 2;

               for(var10[1] = (byte)var8; var6-- > 2; var10[var14++] = (byte)var8) {
                  boolean var11 = true;
                  byte var12 = 0;
                  if (var7 < var1.length - 1 && var1[var7 + 1][var8] == var6) {
                     var12 = 1;
                     var11 = !method_56(var0[var7 + 1][var8], field_142);
                  }

                  if (var7 > 0 && var1[var7 - 1][var8] == var6 && var11) {
                     var12 = 2;
                     var11 = !method_56(var0[var7 - 1][var8], field_142);
                  }

                  if (var8 < var1[0].length - 1 && var1[var7][var8 + 1] == var6 && var11) {
                     var12 = 3;
                     var11 = !method_56(var0[var7][var8 + 1], field_142);
                  }

                  if (var8 > 0 && var1[var7][var8 - 1] == var6 && var11) {
                     var12 = 4;
                  }

                  if (var12 == 1) {
                     ++var7;
                  }

                  if (var12 == 2) {
                     --var7;
                  }

                  if (var12 == 3) {
                     ++var8;
                  }

                  if (var12 == 4) {
                     --var8;
                  }

                  var10[var14++] = (byte)var7;
               }

               var10[var14++] = var4;
               var10[var14] = var5;
               return var10;
            } else {
               if (field_14 == 0) {
                  method_59((short)292, field_14, true);
               }

               return null;
            }
         }
      } catch (Exception var13) {
         return null;
      }
   }

   // $FF: renamed from: b (short) void
   public static final void method_97(short var0) {
      byte var1 = (byte)field_56;
      byte var2 = (byte)field_57;
      if (!field_91) {
         if (!field_92) {
            if (var0 != 0 && method_16(var0) != 0) {
               field_26 = method_96(field_72, field_76, (byte)field_106[var0 * 13 + 6], (byte)field_106[var0 * 13 + 7], (byte)field_106[6], (byte)field_106[7]);
               if (field_26 != null && field_26.length / 2 <= method_16(var0)) {
                  field_91 = true;
                  field_110[field_23] = 1;
                  return;
               }

               field_26 = null;
               method_118();
            }

         }
      } else {
         int var3 = method_15(var0);
         if (field_24 - field_36 >= 0 && field_24 - field_36 <= 240 && field_25 - field_37 >= 0 && field_25 - field_37 <= 320) {
            if (field_26 != null) {
               if (field_175 > field_26.length - 2) {
                  field_175 = 0;
                  field_26 = null;
                  field_91 = false;
                  field_110[field_23] = 0;
                  field_176 = true;
                  if ((field_24 + field_36) / var1 <= 0) {
                     field_24 = (short)((field_72.length - 2) * var1);
                     field_16 = (short)((byte)(field_71 - 1));
                  } else if (field_36 == field_43 && field_24 >= (field_72.length - 1) * var1) {
                     field_24 = (short)var1;
                     field_16 = (short)((byte)(field_71 + 1));
                  } else if ((field_25 + field_37) / var2 <= 0) {
                     field_25 = (short)((field_72[0].length - 2) * var2);
                     field_16 = (short)((byte)(field_71 - 4));
                  } else if (field_37 == field_44 && field_25 >= (field_72[0].length - 1) * var2) {
                     field_25 = (short)var2;
                     field_16 = (short)((byte)(field_71 + 4));
                  }

                  field_106[var0 * 13 + 6] = (short)((byte)(field_24 / var1));
                  field_106[var0 * 13 + 7] = (short)((byte)(field_25 / var2));
                  field_125 = (field_24 - field_36) / var1;
                  field_126 = (field_25 - field_37) / var2;
                  field_76 = method_90(field_72, 0);
                  method_139();
                  return;
               }

               if (field_175 == field_26.length - 2) {
                  for(int var4 = 0; var4 <= field_102.length - 1; ++var4) {
                     short var5;
                     if ((var5 = (short)field_102[var4]) != -1 && var5 != var0 && field_26[field_175] == method_13(var5) && field_26[field_175 + 1] == method_14(var5)) {
                        field_175 = 0;
                        field_26 = null;
                        field_106[var0 * 13 + 6] = (short)((byte)(field_24 / var1));
                        field_106[var0 * 13 + 7] = (short)((byte)(field_25 / var2));
                        field_91 = false;
                        field_110[field_23] = 0;
                        field_125 = (field_24 - field_36) / var1;
                        field_126 = (field_25 - field_37) / var2;
                        if (var0 == 0) {
                           field_98 = var0;
                           boolean var6 = false;
                           field_99 = var5;
                           field_100 = (short)var4;
                        } else {
                           field_99 = var0;

                           for(int var7 = 0; var7 < field_102.length; ++var7) {
                              if (field_102[var7] == var0) {
                                 field_100 = (short)var7;
                                 break;
                              }
                           }

                           field_98 = var5;
                        }

                        field_101 = field_106[field_99 * 13 + 11];
                        return;
                     }
                  }

                  if (field_141[method_117(field_72[field_26[field_175]][field_26[field_175 + 1]])] == 1) {
                     field_175 = 0;
                     field_26 = null;
                     field_106[var0 * 13 + 6] = (short)((byte)(field_24 / var1));
                     field_106[var0 * 13 + 7] = (short)((byte)(field_25 / var2));
                     field_91 = false;
                     field_110[field_23] = 0;
                     field_125 = (field_24 - field_36) / var1;
                     field_126 = (field_25 - field_37) / var2;
                     method_59((short)(192 + method_144(5)), (short)0, true);
                     return;
                  }
               }

               field_24 = method_105(field_24, (short)field_26[field_175]);
               field_25 = method_105(field_25, (short)field_26[field_175 + 1]);
               if (field_24 == field_26[field_175] * var1 && field_25 == field_26[field_175 + 1] * var2) {
                  field_175 += 2;
                  ++var3;
               }
            }

            field_106[var0 * 13 + 8] = (short)((byte)var3);
         }
      }
   }

   // $FF: renamed from: e () void
   public static final void method_98() {
      short var0;
      if (field_26 != null) {
         if (field_175 == field_26.length - 2 && (var0 = method_120(field_23, field_26[field_175], field_26[field_175 + 1])) < 100 && var0 != field_27) {
            field_175 = 0;
            field_26 = null;
            field_91 = false;
            field_110[field_27] = 0;
            field_120[field_27 * 2] = (byte)(field_180 / field_56);
            field_120[field_27 * 2 + 1] = (byte)(field_181 / field_57);
            method_101(field_27, var0, false);
            return;
         }

         if (field_175 > field_26.length - 2) {
            field_175 = 0;
            field_26 = null;
            field_91 = false;
            field_110[field_27] = 0;
            field_120[field_27 * 2] = (byte)(field_180 / field_56);
            field_120[field_27 * 2 + 1] = (byte)(field_181 / field_57);
            method_119();
            method_140();
            method_104();
            return;
         }

         field_180 = method_105(field_180, (short)field_26[field_175]);
         field_181 = method_105(field_181, (short)field_26[field_175 + 1]);
         if (field_180 == field_26[field_175] * field_56 && field_181 == field_26[field_175 + 1] * field_57) {
            field_175 += 2;
            return;
         }
      } else if (field_23 == field_99 && field_119[field_27 * 2 + 1] > 0 && field_28 == 100) {
         var0 = field_119[field_27 * 2];
         if (field_110[field_27] != 0) {
            return;
         }

         if (field_112[var0 * field_111 + 4] > 0) {
            field_28 = method_99();
            field_30 = true;
            field_110[field_27] = 2;
            class_0.method_5(5);
            return;
         }

         field_93 = true;
         method_100(field_27);
         if (field_26 != null) {
            int var1;
            if ((var1 = field_112[var0 * field_111 + 6] * 2) < field_26.length) {
               field_26 = method_76(field_26, var1);
            }

            field_91 = true;
            field_110[field_27] = 1;
            return;
         }

         method_119();
         method_104();
      }

   }

   // $FF: renamed from: a () short
   public static final short method_99() {
      short var0 = 100;
      short var1 = 0;

      for(short var2 = 0; var2 < method_10(field_98); ++var2) {
         if (field_119[var2 * 2 + 1] > 0) {
            if (field_112[field_119[var2 * 2] * field_111 + 4] * 2 > 0) {
               return var2;
            }

            if (var1 < field_119[var2 * 2 + 1]) {
               var1 = field_119[var2 * 2 + 1];
               var0 = var2;
            }
         }
      }

      return var0;
   }

   // $FF: renamed from: c (short) void
   public static final void method_100(short var0) {
      short var1 = method_10(field_98);
      short var2 = 127;
      short var3 = -100;
      field_26 = null;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (field_119[var4 * 2 + 1] > 0) {
            field_76 = method_90(field_72, 6);
            field_26 = method_96(field_72, field_76, field_120[var0 * 2], field_120[var0 * 2 + 1], field_120[var4 * 2], field_120[var4 * 2 + 1]);
            short var5;
            if (field_26 != null && (var5 = (short)(field_26.length / 2)) < var2) {
               var2 = var5;
               var3 = (short)var4;
            }
         }
      }

      if (var3 != var1 - 1 && var3 != -100) {
         field_76 = method_90(field_72, 6);
         field_26 = method_96(field_72, field_76, field_120[var0 * 2], field_120[var0 * 2 + 1], field_120[var3 * 2], field_120[var3 * 2 + 1]);
      }

   }

   // $FF: renamed from: b (short, short, boolean) void
   public static final void method_101(short var0, short var1, boolean var2) {
      byte var3 = 1;
      byte var4 = 1;
      byte var5 = 1;
      if (var0 < method_10(field_98)) {
         var3 = field_177;
         var4 = field_178;
      } else {
         var5 = field_179;
      }

      short var6 = field_119[var0 * 2];
      short var7 = field_119[var1 * 2];
      int var8;
      if ((var8 = (var2 ? field_112[var6 * field_111 + 4] * var4 : field_112[var6 * field_111 + 3] * var3 + (field_112[var6 * field_111 + 4] == 0 && field_112[var7 * field_111 + 4] != 0 ? 50 : 0)) - field_112[var7 * field_111 + 5] * var5) < 1) {
         var8 = 1;
      }

      short[] var10000 = field_119;
      var10000[var1 * 2 + 1] = (short)(var10000[var1 * 2 + 1] - field_119[var0 * 2 + 1] / field_112[var6 * field_111 + 2] * var8);
      if (field_119[var1 * 2 + 1] < 0) {
         field_119[var1 * 2 + 1] = 0;
      }

      if (!var2) {
         field_110[var0] = 2;
      }

      if (field_119[var1 * 2 + 1] > 0) {
         field_110[var1] = 3;
      } else {
         field_110[var1] = 4;
      }

      field_149 = var1;
      field_28 = var1;
      field_29 = var0;
      if (!var2) {
         class_0.method_5(1);
      }

   }

   // $FF: renamed from: f () void
   public static final void method_102() {
      field_23 = 0;
      int var0 = 0;
      field_102 = new byte[100];
      field_102[0] = (byte)field_23;
      ++var0;

      for(int var1 = 1; var1 < field_106.length / 13; ++var1) {
         if (field_106[var1 * 13 + 12] == field_71) {
            field_102[var0] = (byte)var1;
            ++var0;
         }
      }

      field_102 = method_76(field_102, var0);
      field_103 = new byte[var0];
      System.arraycopy(field_102, 0, field_103, 0, var0);
   }

   // $FF: renamed from: g () void
   public static final void method_103() {
      field_177 = 1;
      field_178 = 1;
      field_179 = 1;

      for(int var0 = 0; var0 < field_106[3]; ++var0) {
         int var1 = var0 * 2 + field_106[2];
         if (field_107[var1] == 10) {
            field_177 = (byte)(field_177 * 2);
         }

         if (field_107[var1] == 5) {
            field_178 = (byte)(field_178 * 2);
         }

         if (field_107[var1] == 8) {
            field_179 = (byte)(field_179 * 2);
         }

         if (field_107[var1] == 6) {
            field_177 = (byte)(field_177 * 2);
            field_179 = (byte)(field_179 * 2);
         }
      }

      short var6 = method_9(field_98);
      short var7 = method_10(field_98);
      short var2 = method_9(field_99);
      field_117 = new byte[var7 + method_10(field_99)];
      field_118 = new byte[var7 + method_10(field_99)];
      field_120 = new byte[field_117.length * 2];
      field_119 = new short[field_117.length * 2];

      for(int var3 = 0; var3 <= field_117.length - 1; ++var3) {
         field_117[var3] = (byte)var3;
         field_118[var3] = (byte)var3;
         int var4 = var3 * 2;
         short var5;
         if (var3 < var7) {
            field_120[var4] = 0;
            field_120[var4 + 1] = (byte)(var3 + 1);
            var5 = (short)field_107[var4 + var6];
            field_119[var4] = var5;
            field_119[var4 + 1] = (short)(field_107[var4 + 1 + var6] * field_112[var5 * field_111 + 2]);
         } else {
            field_120[var4] = (byte)((240 - field_56) / field_56);
            field_120[var4 + 1] = (byte)(var3 - var7 + 1);
            var5 = (short)field_107[(var3 - var7) * 2 + var2];
            field_119[var4] = var5;
            field_119[var4 + 1] = (short)(field_107[(var3 - var7) * 2 + 1 + var2] * field_112[var5 * field_111 + 2]);
         }
      }

   }

   // $FF: renamed from: h () void
   public static final void method_104() {
      field_76 = method_90(field_72, 6);
      byte var0 = field_120[field_27 * 2];
      byte var1 = field_120[field_27 * 2 + 1];
      method_95(field_76, var0, var1, var0, var1);

      for(byte var2 = 0; var2 < field_76[0].length; ++var2) {
         for(byte var3 = 0; var3 < field_76.length; ++var3) {
            if (field_76[var3][var2] > 0 && field_76[var3][var2] <= field_112[field_119[field_27 * 2] * field_111 + 6] + 1) {
               field_76[var3][var2] = 100;
            } else {
               field_76[var3][var2] = 0;
            }
         }
      }

   }

   // $FF: renamed from: b (short, short) short
   public static final short method_105(short var0, short var1) {
      if (var0 != var1 * field_56) {
         var0 = (short)(var0 + (var0 > var1 * field_56 ? -field_38 : field_38));
      }

      return var0;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public static final void method_106(Graphics var0) {
      if (field_14 == 200) {
         method_109(var0);
      } else if (field_14 == 100) {
         method_110(var0);
      } else {
         if (field_7 || field_14 == 6) {
            method_111(var0);
         }

         int[] var2;
         switch (field_14) {
            case 0:
               method_142(var0);
               return;
            case 1:
               method_130(var0);
               method_113(var0);
               return;
            case 2:
               method_149(var0, (short)273, method_79(field_107, field_106[field_98 * 13 + 2], field_106[field_98 * 13 + 3], 2), field_114, field_113);
               method_113(var0);
               return;
            case 3:
               method_111(var0);
               method_146(var0, field_223, field_224, field_225);
               method_113(var0);
               return;
            case 4:
               method_128(var0, 247, field_82);
               method_129(var0, 0, 229);
               method_134(var0, 245, field_82, 2, 0);
               if (field_191 != null) {
                  method_135(var0, field_191, field_82, 3, 0);
               }

               method_134(var0, 285, field_82, 4, 0);
               method_134(var0, 269 + (field_95 < 4 ? field_95 : 3) - 1, field_82, 5, 0);
               method_137(var0, field_106[field_23 * 13 + 10], (short)-1, field_84, 0, 0);
               method_134(var0, 283, field_82, 6, 0);
               method_135(var0, method_108(field_96), field_82, 7, 0);
               method_134(var0, 284, field_82, 8, 0);
               method_135(var0, method_108(field_97), field_82, 9, 0);
               method_134(var0, 268, field_82, 10, 0);
               method_135(var0, method_108(field_95), field_82, 11, 0);
               method_134(var0, 286, field_82, 12, 0);
               method_135(var0, method_108(method_16(field_98)), field_82, 13, 0);
               method_20(var0, 2, 120, (method_88(field_82, field_82.length / 4 - 1) + 2) * field_59, 17, field_132);
               return;
            case 5:
               switch (field_87) {
                  case 1:
                     field_228 = field_228 > 0 ? (byte)(field_228 - 1) : field_228;
                     break;
                  case 6:
                     field_228 = field_228 == 0 ? (byte)(field_228 + 1) : field_228;
               }

               field_123 = method_87(field_86, field_228);
               field_124 = method_88(field_86, field_228);
               if (field_7) {
                  if (field_226 == 0) {
                     method_128(field_81, 222, field_82);
                     method_129(field_81, 222, 229);
                     if (field_225 == 0) {
                        method_134(field_81, field_112[field_223[field_227 * 2] * field_111 + 1], field_82, 6, 0);
                     } else {
                        method_134(field_81, field_114[field_223[field_227 * 2] * field_113 + 1], field_82, 6, 0);
                     }
                  } else {
                     method_128(field_81, 223, field_82);
                     method_129(field_81, 223, 229);
                     if (field_225 == 0) {
                        method_134(field_81, field_112[field_224[field_227 * 2] * field_111 + 1], field_82, 6, 0);
                     } else {
                        method_134(field_81, field_114[field_224[field_227 * 2] * field_113 + 1], field_82, 6, 0);
                     }
                  }

                  method_134(field_81, 224, field_82, 4, 0);
                  method_134(field_81, 225, field_82, 2, 4);
                  method_134(field_81, 226, field_82, 3, 4);
                  if (field_225 == 0) {
                     if (field_226 == 0) {
                        field_230 = (short)(field_112[field_223[field_227 * 2] * field_111 + 7] * 4 / 5);
                     } else {
                        field_230 = (short)field_112[field_224[field_227 * 2] * field_111 + 7];
                     }
                  } else if (field_226 == 0) {
                     field_230 = (short)(field_114[field_223[field_227 * 2] * field_113 + 3] * 4 / 5);
                  } else {
                     field_230 = (short)field_114[field_224[field_227 * 2] * field_113 + 3];
                  }

                  field_7 = false;
               }

               method_112(var0, field_127);
               method_113(var0);
               method_135(var0, method_108(field_230), field_82, 2, 6);
               method_135(var0, method_108(field_231), field_82, 3, 6);
               method_135(var0, method_108(field_229), field_82, 5, 0);
               if (field_226 == 0) {
                  if (field_225 == 0) {
                     method_137(var0, (short)field_112[field_223[field_227 * 2] * field_111], (short)field_223[field_227 * 2 + 1], field_84, 0, field_227);
                  } else {
                     method_137(var0, (short)field_114[field_223[field_227 * 2] * field_113], (short)field_223[field_227 * 2 + 1], field_84, 0, field_227);
                  }
               } else if (field_225 == 0) {
                  method_137(var0, (short)field_112[field_224[field_227 * 2] * field_111], (short)field_224[field_227 * 2 + 1], field_84, 0, field_227);
               } else {
                  method_137(var0, (short)field_114[field_224[field_227 * 2] * field_113], (short)field_224[field_227 * 2 + 1], field_84, 0, field_227);
               }

               int[] var1 = method_132(field_82, 7);
               if (field_225 == 0) {
                  field_185 = method_51(var0, field_163, field_17, field_185, var1, 0, 0);
                  method_51(var0, field_242, field_18, field_185, var1, 2, 0);
                  return;
               }

               field_185 = method_51(var0, field_163, field_17, field_185, var1, 0, 0);
               return;
            case 6:
               method_143(var0);
               return;
            case 7:
            case 11:
               if (field_7) {
                  method_128(var0, 276, field_82);
                  method_134(var0, 232, field_83, 0, 0);
                  field_123 = (method_85(field_83, 0) + method_87(field_83, 0) + 1) / 2;
                  field_124 = method_88(field_83, 0) + 1;
                  method_113(var0);
               }

               try {
                  if (field_7 || field_87 != 0) {
                     var2 = new int[]{0, field_60 + 2 * field_59, 240, field_60 + (field_72[0].length - 2) * field_59};
                     method_112(var0, var2);
                     if (field_167) {
                        field_185 = method_51(var0, field_242, field_18, field_185, method_132(field_82, 1), 0, 0);
                     } else {
                        field_185 = method_51(var0, field_163, field_17, field_185, method_132(field_82, 1), 0, 0);
                     }
                  }
               } catch (Exception var3) {
                  System.out.println("SCN_INFO_MESSAGE : 7");
                  var3.printStackTrace();
               }

               field_7 = false;
               return;
            case 8:
               method_128(var0, 216, field_82);
               method_129(var0, 0, 227);
               method_51(var0, field_163, field_17, (short)0, method_132(field_82, 1), 1, 0);
               return;
            case 9:
               if (field_7) {
                  field_7 = false;
                  method_128(field_81, 215, field_82);
                  method_129(field_81, 0, 227);
                  method_111(var0);
                  field_185 = method_51(var0, field_163, field_17, field_185, method_132(field_82, 1), 0, 0);
               }

               if (field_87 != 0) {
                  method_111(var0);
                  field_185 = method_51(var0, field_163, field_17, field_185, method_132(field_82, 1), 0, 0);
                  return;
               }
               break;
            case 10:
               method_131();
               method_111(var0);
               method_113(var0);
               return;
            case 12:
               method_138(var0);
               return;
            case 13:
               method_93();
               method_134(var0, 258, field_83, 0, 0);
               method_134(var0, 249, field_83, 1, 0);
               method_134(var0, 250, field_83, 2, 0);
               method_134(var0, 251, field_83, 3, 0);
               method_107(var0);
               method_113(var0);
               return;
            case 14:
               method_145(var0);
               return;
            case 15:
               method_93();
               method_134(var0, 261, field_83, 0, 0);
               method_134(var0, 262, field_83, 1, 0);
               method_134(var0, 249, field_83, 2, 0);
               method_134(var0, 272, field_83, 3, 0);
               method_134(var0, 264, field_83, 4, 0);
               method_134(var0, 263, field_83, 5, 0);
               method_134(var0, 230, field_83, 6, 0);
               method_107(var0);
               method_113(var0);
               return;
            case 16:
               method_150(var0, field_238, field_239, field_244);
               return;
            case 17:
               method_149(var0, (short)272, method_79(field_107, field_106[field_98 * 13], field_106[field_98 * 13 + 1], 2), field_112, field_111);
               method_113(var0);
               byte var4;
               if ((var4 = (byte)(field_233 * (field_235 + field_19) + field_234)) > method_10(field_98) - 1) {
                  return;
               }

               field_237 = (short)(var4 * 2 + method_9(field_98));
               method_151((short)field_107[field_237], (short)field_107[field_237 + 1], field_177, field_178, field_179);
               method_134(var0, field_112[field_107[field_237] * field_111 + 1], field_82, 2, 1);
               method_51(var0, field_242, field_18, field_185, method_132(field_82, 3), 2, 0);
               method_51(var0, field_163, field_17, field_185, method_132(field_82, 3), 0, 0);
               break;
            case 18:
               method_149(var0, (short)249, method_79(field_107, field_106[field_98 * 13 + 4], field_106[field_98 * 13 + 5], 2), field_114, field_113);
               method_113(var0);
               return;
            case 19:
               method_93();
               method_134(var0, 258, field_83, 0, 0);
               method_134(var0, field_241 == 18 && field_236 == 6 ? 275 : 259, field_83, 1, 0);
               method_134(var0, 260, field_83, 2, 0);
               method_107(var0);
               method_113(var0);
               return;
            case 20:
               method_93();
               method_134(var0, 265, field_83, 0, 0);
               method_134(var0, 266, field_83, 1, 0);
               method_134(var0, 267, field_83, 2, 0);
               method_107(var0);
               method_129(var0, 0, 217);
               method_113(var0);
               return;
            case 21:
               method_128(var0, 264, field_82);
               method_129(var0, 0, 229);
               field_185 = method_51(var0, field_242, field_18, field_185, method_132(field_82, 1), 0, 0);
               return;
            case 22:
               if (field_7) {
                  method_128(var0, 276, field_82);
               }

               if (field_7 || field_87 != 0) {
                  switch (field_87) {
                     case 2:
                        if (field_122 > 0) {
                           field_122 = 0;
                        }
                        break;
                     case 5:
                        if (field_122 == 0) {
                           field_122 = 1;
                        }
                  }

                  var2 = new int[]{0, field_60 + 2 * field_59, 240, field_60 + field_72[0].length * field_59};
                  method_112(var0, var2);
                  method_134(var0, 289, field_83, 0, 0);
                  method_134(var0, 290, field_83, 1, 0);
                  field_185 = method_51(var0, field_163, field_17, field_185, method_132(field_82, 1), 0, 0);
                  field_123 = (method_85(field_83, field_122) + method_87(field_83, field_122) + 1) / 2 + 1;
                  field_124 = method_88(field_83, field_122);
                  method_113(var0);
               }

               field_7 = false;
               return;
         }

      }
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics) void
   public static final void method_107(Graphics var0) {
      int var1 = field_123 * field_58 - field_152[2];
      method_73(var0, (short)1, (short)4, var1 + field_61 + field_58, 320 - field_59 * (field_14 != 15 && field_14 != 20 ? 1 : 2), field_51, field_53, field_58, field_59);
   }

   // $FF: renamed from: a (int) byte[]
   public static final byte[] method_108(int var0) {
      int var1 = 1;
      byte[] var2 = new byte[7];

      int var3;
      for(var3 = 1; var1 <= var0; var1 *= 10) {
         var2[var3 - 1] = (byte)(var0 % (var1 * 10) / var1);
         ++var3;
      }

      byte[] var4 = new byte[var3 == 1 ? 1 : var3 - 1];

      for(int var5 = 0; var5 < var3 - 1; ++var5) {
         var4[var5] = var2[var3 - var5 - 2];
      }

      return var4;
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics) void
   public static final void method_109(Graphics var0) {
      if (field_7) {
         field_7 = false;
         if (field_182 == 1) {
            method_20(var0, field_182, 0, 0, 0, field_132);
         } else {
            var0.setClip(0, 0, 240, 320);
            var0.setColor(2434341);
            var0.fillRect(0, 0, 240, 320);
            method_20(var0, field_182, 120 - method_19(2).getWidth() / 2, 160 - method_19(2).getHeight() / 2, 0, field_132);
         }

         field_90 = System.currentTimeMillis();
      }

      if (field_251) {
         if (field_252 < 13) {
            var0.setClip(9, 304, 223, 7);
            var0.setColor(-1);
            var0.drawRect(9, 304, 221, 6);
            var0.setClip(9, 304, 221, 7);
            var0.setColor(16559104);
            var0.fillRect(10, 305, 18 * field_252, 5);
         } else {
            var0.setClip(9, 304, 223, 7);
            var0.setColor(2434341);
            var0.fillRect(9, 304, 223, 7);
         }
      }

      if (System.currentTimeMillis() - field_90 >= 3000L && field_182 == 1) {
         method_17(1);
         field_182 = 2;
         field_251 = true;
         field_7 = true;
      }

      if (System.currentTimeMillis() - field_90 > 3000L && field_252 >= 12) {
         method_17(2);
         field_15 = 1;
         field_251 = false;
         field_252 = 12;
      }

   }

   // $FF: renamed from: i (javax.microedition.lcdui.Graphics) void
   private static void method_110(Graphics var0) {
      method_36(var0, field_132);
      var0.setColor(16777215);
      var0.fillRect(8, field_57 + 3, 224, 320 - field_57 * 2 - 6);
      var0.setColor(0);
      var0.fillRect(10, field_57 + 3 + 2, 220, 320 - field_57 * 2 - 6 - 4);
      method_49(var0, 293, 120, 160, 5, field_127);
      if (field_88) {
         field_88 = false;
         field_89 = System.currentTimeMillis();
      }

      if (System.currentTimeMillis() - field_89 > 1L) {
         field_15 = 0;
         field_34 = field_36;
         field_35 = field_37;
      }

   }

   // $FF: renamed from: j (javax.microedition.lcdui.Graphics) void
   private static final void method_111(Graphics var0) {
      method_112(var0, field_132);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int[]) void
   private static final void method_112(Graphics var0, int[] var1) {
      method_36(var0, var1);
      int var2 = field_36 % field_58 + field_41 * field_58;
      int var3 = field_37 % field_59 + field_42 * field_59 - field_60;
      switch (field_14) {
         case 0:
            var0.drawImage(field_80, -var2, -var3, 0);
            if (field_77 * field_58 > 240 || field_78 * field_59 > 320) {
               var0.drawImage(field_80, field_134 - var2, -var3, 0);
               var0.drawImage(field_80, -var2, field_135 - var3, 0);
               var0.drawImage(field_80, field_134 - var2, field_135 - var3, 0);
               return;
            }
            break;
         case 6:
            var0.clipRect(0, field_55, 240, 320 - field_55 - 2 * field_55);
            var3 = field_37 % field_59 + field_42 * field_59 - field_55;
            var0.drawImage(field_80, -var2, -var3, 0);
            return;
         default:
            var0.clipRect(field_61, field_60, field_77 * field_58, field_78 * field_59);
            var0.drawImage(field_80, field_61, field_60, 0);
      }

   }

   // $FF: renamed from: d (javax.microedition.lcdui.Graphics) void
   public static final void method_113(Graphics var0) {
      if (field_14 != 10 && field_14 != 5) {
         if (field_14 == 22) {
            method_22(var0, 0, field_123 * field_58 + field_58 / 2 - field_152[2] + field_61, field_124 * field_59 - field_59 / 2 + field_62 - 2, 20, field_132);
         } else {
            method_22(var0, 0, field_123 * field_58 + field_58 / 2 - field_152[2] + field_61, field_124 * field_59 - field_59 / 2 + field_62, 20, field_132);
         }
      } else {
         method_22(var0, 0, field_123 * field_58 + field_58 / 2 + field_61, field_124 * field_59 + field_59 / 2 + field_62, 20, field_132);
      }
   }

   // $FF: renamed from: k (javax.microedition.lcdui.Graphics) void
   private static final void method_114(Graphics var0) {
      if (!field_91 && !field_92 && !field_31 && field_23 == field_98) {
         byte var1 = 0;
         if (field_14 == 0) {
            var1 = 0;
         } else if (field_23 == field_98) {
            if (method_120(field_98, field_125, field_126) < 100) {
               if (field_112[field_119[field_27 * 2] * field_111 + 4] > 0) {
                  var1 = 38;
               } else {
                  var1 = 0;
               }
            } else if (method_120(field_99, field_125, field_126) < 100) {
               var1 = 39;
            } else {
               var1 = 0;
            }

            if (field_32) {
               var1 = 40;
            }
         }

         method_22(var0, var1, field_125 * field_58 + (var1 == 0 ? field_58 / 2 : 0), field_126 * field_59 + field_62 + (var1 == 0 ? field_58 / 2 : 0), 0, field_14 == 6 ? field_129 : field_132);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, short) void
   public static final void method_115(Graphics var0, short var1) {
      int var2 = field_58 / 2;
      boolean var3 = false;
      short var4 = field_106[var1 * 13 + 10];
      if (var1 == field_103[field_23]) {
         method_97(var1);
      }

      int var6;
      if (field_91 && var1 == field_103[field_23]) {
         var2 += field_24;
         var6 = field_25;
      } else {
         var2 += method_13(var1) * field_58;
         var6 = method_14(var1) * field_59;
      }

      if (var4 != -1) {
         for(int var5 = 0; var5 < field_102.length; ++var5) {
            if (var1 == field_103[var5]) {
               method_116(var0, var4, var2 - field_36, var6 - field_37 + field_59 + field_62, var5, 0, field_132);
            }
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int[]) void
   public static final void method_116(Graphics var0, int var1, int var2, int var3, int var4, int var5, int[] var6) {
      short var7 = field_109[var1];
      short var8 = method_117(field_108[var7]);
      if (var4 == -1) {
         method_25(var0, method_117(field_108[var7 + 1 + var8]), var2, var3, var5, var6);
      } else {
         byte var10 = (byte)(field_110[var4] & 7);
         byte var11;
         if ((var11 = (byte)(field_110[var4] >>> 3)) < 0) {
            var11 = (byte)(32 + var11);
         }

         short var12 = method_117(field_108[var7 + 1 + var10]);
         if (var10 < var8) {
            int var13 = 0;

            for(int var14 = 0; var14 < var10; ++var14) {
               var13 += method_117(field_108[var7 + 1 + var14]);
            }

            method_25(var0, method_117(field_108[var7 + 1 + var8 + var13 + var11 / 3]), var2, var3, var5, var6);
            if (++var11 >= var12 * 3) {
               var11 = 0;
               if (field_14 == 6 && var10 == 4) {
                  field_118[var4] = -1;
               }

               if (var4 == field_149) {
                  field_149 = -1;
               }

               if (var10 != 1) {
                  var10 = 0;
               }
            }

            field_110[var4] = (byte)((var10 & 7) + (var11 << 3));
         }
      }
   }

   // $FF: renamed from: a (byte) short
   public static final short method_117(byte var0) {
      return var0 < 0 ? (short)(256 + var0) : (short)var0;
   }

   // $FF: renamed from: i () void
   public static final void method_118() {
      ++field_23;
      if (field_23 >= field_102.length) {
         field_23 = 0;
      }

      short var0;
      if (method_16(var0 = (short)field_103[field_23]) != 0 && method_55((byte)var0, field_102)) {
         if (var0 == 0) {
            method_59((short)278, (short)0, true);
            field_15 = 7;
            field_17 = method_53(278, 240 - 3 * field_54);
            field_241 = 0;
         }

         field_24 = (short)(method_13(var0) * field_58);
         field_25 = (short)(method_14(var0) * field_59);
         field_91 = false;
      } else {
         method_118();
      }
   }

   // $FF: renamed from: j () void
   public static final void method_119() {
      ++field_27;
      if (field_27 >= field_117.length) {
         field_27 = 0;
      }

      if (field_119[field_27 * 2 + 1] <= 0) {
         method_119();
      } else {
         field_247 = -1;
         field_23 = field_27 < method_10(field_98) ? field_98 : field_99;
         field_125 = field_120[field_27 * 2];
         field_126 = field_120[field_27 * 2 + 1];
         field_180 = (short)(field_125 * field_56);
         field_181 = (short)(field_126 * field_56);
      }
   }

   // $FF: renamed from: a (int, int, int) short
   public static final short method_120(int var0, int var1, int var2) {
      short var3 = method_10(field_98);

      for(short var4 = 0; var4 <= field_117.length - 1; ++var4) {
         if (var1 == field_120[var4 * 2] && var2 == field_120[var4 * 2 + 1] && field_119[var4 * 2 + 1] > 0) {
            if (var0 != -1 && (var0 != field_98 || var4 < var3) && (var0 != field_99 || var4 >= var3)) {
               return (short)(110 + var4);
            }

            return var4;
         }
      }

      return 100;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, boolean) void
   public static final void method_121(Graphics var0, boolean var1) {
      if (!field_183) {
         method_36(var0, field_130);

         for(int var2 = 0; var2 < field_117.length; ++var2) {
            byte var3 = field_117[var2];
            short var4 = field_119[var3 * 2];
            short var5 = field_119[var3 * 2 + 1];
            if (field_118[var3] >= 0) {
               byte var6 = field_112[var4 * field_111 + 2];
               byte var7 = field_112[var4 * field_111];
               int var8 = var3 < method_10(field_98) ? 0 : 1;
               if (var3 == field_27) {
                  if (var1) {
                     method_122(var0, var7, field_180 + field_58 / 2, field_181 + field_59 + field_62, (var5 + var6 - 1) / var6, var8, var3, true, field_130);
                  }
               } else {
                  method_122(var0, var7, field_120[var3 * 2] * field_58 + field_58 / 2, field_120[var3 * 2 + 1] * field_59 + field_59 + field_62, (var5 + var6 - 1) / var6, var8, var3, false, field_130);
               }
            }
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, boolean, int[]) void
   public static final void method_122(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int[] var8) {
      try {
         if (var6 == field_27 && field_91) {
            if (field_180 > field_26[field_175] * field_58) {
               var5 = 1;
            }

            if (field_180 < field_26[field_175] * field_58) {
               var5 = 0;
            }
         }

         if (field_28 != 100) {
            if (var6 == field_27) {
               if (field_120[field_28 * 2] > field_120[field_27 * 2]) {
                  var5 = 0;
               } else if (field_120[field_28 * 2] < field_120[field_27 * 2]) {
                  var5 = 1;
               }
            }

            if (var6 == field_28) {
               if (field_120[field_28 * 2] < field_120[field_27 * 2]) {
                  var5 = 0;
               } else if (field_120[field_28 * 2] > field_120[field_27 * 2]) {
                  var5 = 1;
               }
            }
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }

      method_116(var0, var1, var2, var3, var6, var5, field_132);
      method_36(var0, var8);
      if (var7) {
         var0.setColor(16776960);
         var0.drawArc(var2 - 9, var3 - 6, 21, 6, 120, 300);
      }

      if (!field_91 && var4 > 0) {
         byte[] var9 = method_108(var4);
         var0.clipRect(var2 - 5, var3 - 6, 5 * var9.length, 5);
         var0.setColor(0);
         var0.fillRect(var2 - 5, var3 - 6, 5 * var9.length, 5);
         method_50(var0, var9, 0, var9.length, var2 - 5, var3, 8, field_132);
      }

   }

   // $FF: renamed from: k () void
   public static final void method_123() {
      if (method_10(field_98) == 0) {
         field_13 = (short)((byte)(method_164("GAME") ? 1 : 0));
         method_59((short)279, (short)1, true);
         field_204 = false;
      }

      short var0 = method_10(field_98);

      for(int var1 = 0; var1 < field_117.length; ++var1) {
         if (field_119[var1 * 2 + 1] <= 0) {
            field_183 = true;
            int var3;
            if (var1 < var0) {
               for(var3 = 0; var3 <= var0 - 1; ++var3) {
                  if (field_119[var3 * 2 + 1] > 0) {
                     field_183 = false;
                  }

                  if (field_118[var3] >= 0) {
                     field_183 = false;
                  }
               }

               if (field_183) {
                  field_183 = false;
                  field_13 = (short)((byte)(method_164("GAME") ? 1 : 0));
                  method_59((short)279, (short)1, true);
                  field_204 = false;
               }
            } else {
               for(var3 = var0; var3 <= field_117.length - 1; ++var3) {
                  if (field_119[var3 * 2 + 1] > 0) {
                     field_183 = false;
                  }

                  if (field_118[var3] >= 0) {
                     field_183 = false;
                  }
               }

               if (field_183) {
                  field_183 = false;
                  method_17(10);
                  method_17(12);
                  method_17(13);
                  if (field_99 == 63) {
                     field_13 = (short)((byte)(method_164("GAME") ? 1 : 0));
                     method_59((short)281, (short)1, false);
                  } else {
                     try {
                        field_242 = new byte[0];
                        byte[] var12 = method_79(field_163, field_162[280], 1, field_162[281] - field_162[280]);
                        field_242 = method_80(field_242, var12, field_242.length, 0, var12.length);
                        var12 = method_79(field_163, field_162[297], 1, field_162[298] - field_162[297]);
                        field_242 = method_80(field_242, var12, field_242.length, 0, var12.length);
                        short[] var4;
                        (var4 = new short[2])[0] = field_119[0];
                        var4[1] = (short)((byte)(field_107[method_9(field_98) + 1] - (field_119[1] + field_112[field_119[0] * field_111 + 2] - 1) / field_112[field_119[0] * field_111 + 2]));

                        int var5;
                        boolean var6;
                        int var7;
                        for(var5 = 1; var5 < method_10(field_98); ++var5) {
                           var6 = false;

                           for(var7 = 0; var7 < var4.length / 2; ++var7) {
                              if (var4[var7 * 2] == field_119[var5 * 2]) {
                                 var6 = true;
                                 var4[var7 * 2 + 1] = (short)(var4[var7 * 2 + 1] + (byte)(field_107[method_9(field_98) + var5 * 2 + 1] - (field_119[var5 * 2 + 1] + field_112[field_119[var5 * 2] * field_111 + 2] - 1) / field_112[field_119[var5 * 2] * field_111 + 2]));
                                 break;
                              }
                           }

                           if (!var6) {
                              (var4 = method_77(var4, var4.length + 2))[var4.length - 2] = field_119[var5 * 2];
                              var4[var4.length - 1] = (short)((byte)(field_107[method_9(field_98) + var5 * 2 + 1] - (field_119[var5 * 2 + 1] + field_112[field_119[var5 * 2] * field_111 + 2] - 1) / field_112[field_119[var5 * 2] * field_111 + 2]));
                           }
                        }

                        byte var14;
                        byte[] var15;
                        try {
                           for(var5 = 0; var5 < var4.length / 2; ++var5) {
                              var14 = field_112[var4[var5 * 2] * field_111 + 1];
                              var12 = method_79(field_163, field_162[var14], 1, field_162[var14 + 1] - field_162[var14]);
                              field_242 = method_80(field_242, var12, field_242.length, 0, var12.length);
                              var15 = method_108(var4[var5 * 2 + 1]);
                              (var12 = method_76(var12 = new byte[0], var12.length + var15.length + 2))[var12.length - 2 - var15.length] = -1;
                              (var12 = method_80(var12, var15, var12.length - 1 - var15.length, 1, var15.length))[var12.length - 1] = -2;
                              field_242 = method_80(field_242, var12, field_242.length, 0, var12.length);
                              System.out.println(field_107[method_9(field_98) + var5 * 2 + 1]);
                              System.out.println((field_119[var5 * 2 + 1] + field_112[field_119[var5 * 2] * field_111 + 2] - 1) / field_112[field_119[var5 * 2] * field_111 + 2]);
                           }
                        } catch (Exception var9) {
                           System.out.println("!!!!!");
                           var9.printStackTrace();
                        }

                        (var12 = method_76(var12, var12.length + 2))[var12.length - 2] = -2;
                        var12[var12.length - 1] = -2;
                        var12 = method_79(field_163, field_162[298], 1, field_162[299] - field_162[298]);
                        field_242 = method_80(field_242, var12, field_242.length, 0, var12.length);
                        (var4 = new short[2])[0] = field_119[method_10(field_98) * 2];
                        var4[1] = (short)((byte)(field_107[method_9(field_99) + 1] - (field_119[method_10(field_98) * 2 + 1] + field_112[field_119[method_10(field_98) * 2] * field_111 + 2] - 1) / field_112[field_119[method_10(field_98) * 2] * field_111 + 2]));

                        for(var5 = 1; var5 < method_10(field_99); ++var5) {
                           System.out.println("------------------z : " + var5);
                           var6 = false;

                           for(var7 = 0; var7 < var4.length / 2; ++var7) {
                              if (var4[var7 * 2] == field_119[method_10(field_98) * 2 + var5 * 2]) {
                                 var6 = true;
                                 var4[var7 * 2 + 1] = (short)(var4[var7 * 2 + 1] + (byte)(field_107[method_9(field_99) + var5 * 2 + 1] - (field_119[method_10(field_98) * 2 + var5 * 2 + 1] + field_112[field_119[method_10(field_98) * 2 + var5 * 2] * field_111 + 2] - 1) / field_112[field_119[method_10(field_98) * 2 + var5 * 2] * field_111 + 2]));
                                 break;
                              }
                           }

                           if (!var6) {
                              (var4 = method_77(var4, var4.length + 2))[var4.length - 2] = field_119[method_10(field_98) * 2 + var5 * 2];
                              var4[var4.length - 1] = (short)((byte)(field_107[method_9(field_99) + var5 * 2 + 1] - (field_119[method_10(field_98) * 2 + var5 * 2 + 1] + field_112[field_119[method_10(field_98) * 2 + var5 * 2] * field_111 + 2] - 1) / field_112[field_119[method_10(field_98) * 2 + var5 * 2] * field_111 + 2]));
                           }
                        }

                        try {
                           for(var5 = 0; var5 < var4.length / 2; ++var5) {
                              System.out.println(" mass_data 1 : " + var4[var5 * 2]);
                              System.out.println(" mass_data 2 : " + var4[var5 * 2 + 1]);
                              var14 = field_112[var4[var5 * 2] * field_111 + 1];
                              System.out.println("T_IND : " + var14);
                              var12 = method_79(field_163, field_162[var14], 1, field_162[var14 + 1] - field_162[var14]);
                              field_242 = method_80(field_242, var12, field_242.length, 0, var12.length);
                              var15 = method_108(var4[var5 * 2 + 1]);
                              System.out.println("cnt : " + var15.length);
                              (var12 = method_76(var12 = new byte[0], var12.length + var15.length + 2))[var12.length - 2 - var15.length] = -1;
                              (var12 = method_80(var12, var15, var12.length - 1 - var15.length, 1, var15.length))[var12.length - 1] = -2;
                              field_242 = method_80(field_242, var12, field_242.length, 0, var12.length);
                              System.out.println(field_107[method_9(field_98) + var5 * 2 + 1]);
                              System.out.println((field_119[var5 * 2 + 1] + field_112[field_119[var5 * 2] * field_111 + 2] - 1) / field_112[field_119[var5 * 2] * field_111 + 2]);
                           }

                           field_242 = method_76(field_242, field_242.length - 1);
                        } catch (Exception var8) {
                           System.out.println("!!!!!");
                           var8.printStackTrace();
                        }

                        field_17 = null;
                        field_18 = method_54(field_242, 0, 240 - 3 * field_54);
                        method_60(field_242, (short)0, false);
                     } catch (Exception var10) {
                        System.out.println("view mess");
                        var10.printStackTrace();
                     }
                  }

                  field_102[field_100] = -1;
                  method_155(1);
                  method_81(field_98, field_99, 1);
                  method_62(field_99);
                  field_204 = false;
                  field_96 += 5 * method_10(field_99);
                  if (field_96 > field_97) {
                     ++field_95;
                     field_97 = 2 * field_97;
                  }

                  field_94 += 100 * method_10(field_99);

                  for(var3 = 0; var3 < field_106[3]; ++var3) {
                     int var13 = var3 * 2 + field_106[2];
                     if (field_107[var13] == 17) {
                        field_94 += 6 * method_10(field_99);
                     }
                  }

                  field_23 = field_166;
                  class_0.method_5(2);
                  return;
               }
            }
         }
      }

      if (field_28 != 100 && !field_30) {
         if (field_110[field_28] != 0) {
            return;
         }

         short var11 = field_119[field_28 * 2 + 1];
         if (field_119[field_29 * 2 + 1] > 0 && var11 > 0) {
            method_101(field_28, field_29, false);
         }

         field_28 = 100;
         method_119();
         method_104();
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public static final void method_124(Graphics var0, int var1, int var2) {
      method_22(var0, 36, var1, var2 + field_62, 0, field_132);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int) void
   public static final void method_125(Graphics var0, int var1) {
      short var2 = field_119[var1 * 2];
      byte var3 = field_112[var2 * field_111 + 6];
      byte var4 = field_120[var1 * 2];
      byte var5 = field_120[var1 * 2 + 1];

      for(int var6 = 0; var6 <= var3; ++var6) {
         for(int var7 = 0; var7 <= var3; ++var7) {
            if (var6 + var7 <= var3) {
               if (var4 + var6 >= 0 && var4 + var6 < field_77 && var5 + var7 >= 0 && var5 + var7 < field_78 && field_76[var4 + var6][var5 + var7] != 0) {
                  method_124(var0, (var4 + var6) * field_58, (var5 + var7) * field_59);
               }

               if (var4 + var6 >= 0 && var4 + var6 < field_77 && var5 - var7 >= 0 && var5 - var7 < field_78 && field_76[var4 + var6][var5 - var7] != 0) {
                  method_124(var0, (var4 + var6) * field_58, (var5 - var7) * field_59);
               }

               if (var4 - var6 >= 0 && var4 - var6 < field_77 && var5 + var7 >= 0 && var5 + var7 < field_78 && field_76[var4 - var6][var5 + var7] != 0) {
                  method_124(var0, (var4 - var6) * field_58, (var5 + var7) * field_59);
               }

               if (var4 - var6 >= 0 && var4 - var6 < field_77 && var5 - var7 >= 0 && var5 - var7 < field_78 && field_76[var4 - var6][var5 - var7] != 0) {
                  method_124(var0, (var4 - var6) * field_58, (var5 - var7) * field_59);
               }
            }
         }
      }

   }

   // $FF: renamed from: l (javax.microedition.lcdui.Graphics) void
   private static final void method_126(Graphics var0) {
      if (!field_91 && !field_92) {
         short var1 = method_15(field_23);
         short var2 = method_16(field_23);
         if (field_26 != null) {
            for(int var3 = 0; var3 <= field_26.length / 2 - 1; ++var3) {
               method_127(var0, field_26, var3, var2 - var1, var2);
            }
         }

         if (field_93) {
            field_93 = false;
            field_76 = method_90(field_72, 0);
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[], int, int, int) void
   public static final void method_127(Graphics var0, byte[] var1, int var2, int var3, int var4) {
      int var5 = field_26[var2 * 2] * field_58 - field_36 + field_58 / 2;
      int var6 = field_26[var2 * 2 + 1] * field_59 - field_37 + field_62 + (field_59 - method_21(29)) / 2;
      int var7 = var2 < var3 ? 0 : 5;
      if (var1.length / 2 - 1 == var2) {
         method_22(var0, 29 + var7, var5, var6, 5, field_132);
         var0.setColor(0);
         method_36(var0, field_132);
         if (var6 < 298 - field_59 + method_48()) {
            var0.clipRect(var5 - 1, var6 + 6 + field_59 - method_48(), 13, method_48());
            var0.fillRect(var5 - 1, var6 + 6 + field_59 - method_48(), 13, method_48());
            method_49(var0, 257, var5, var6 + 6 + field_59, 8, field_132);
            byte[] var8 = method_108((field_26.length / 2 + field_106[field_23 * 13 + 8] + var4 - 1) / var4);
            method_50(var0, var8, 0, var8.length, var5 + field_58 / 2, var6 + 6 + field_59, 8, field_132);
            return;
         }
      } else {
         int var11 = 0;
         int var9 = field_26[var2 * 2 + 2] * field_58 - field_36 + field_58 / 2;
         int var10 = field_26[var2 * 2 + 3] * field_59 - field_37 + field_62 + (field_59 - method_21(29)) / 2;
         if (var9 == var5 && var10 < var6) {
            var11 = 28 + var7;
         } else if (var9 == var5 && var10 > var6) {
            var11 = 27 + var7;
         } else if (var9 < var5 && var10 == var6) {
            var11 = 25 + var7;
         } else if (var9 > var5 && var10 == var6) {
            var11 = 26 + var7;
         }

         method_22(var0, var11, var5, var6, 5, field_132);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, byte[]) void
   public static final void method_128(Graphics var0, int var1, byte[] var2) {
      if (var1 != -1) {
         method_134(var0, var1, var2, 0, 0);
      }

      if (field_14 != 21 && field_14 != 8 && field_14 != 12 && field_14 != 10 && field_14 != 9 && field_14 != 7 && field_14 != 11 && field_14 != 22) {
         method_135(var0, method_108(field_94), var2, 1, 0);
      }

   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int) void
   public static final void method_129(Graphics var0, int var1, int var2) {
      int var3 = field_14 != 0 && field_14 != 20 ? 320 : 316;
      if (var1 != 0) {
         method_49(var0, var1, 2, var3, 8, field_127);
      }

      if (var2 != 0) {
         method_49(var0, var2, 238, var3, 10, field_127);
      }

   }

   // $FF: renamed from: m (javax.microedition.lcdui.Graphics) void
   private static final void method_130(Graphics var0) {
      int var1 = field_83.length / 4 - 1;
      boolean var2 = false;
      if (field_87 == 1) {
         if (field_122 > 0) {
            --field_122;
         } else {
            field_122 = var1;
         }
      } else if (field_87 == 6) {
         if (field_122 < var1) {
            ++field_122;
         } else {
            field_122 = 0;
         }
      }

      field_124 = method_88(field_83, field_122);
      field_87 = 0;
      if (field_7) {
         method_20(field_81, 2, 120 - method_19(2).getWidth() / 2, 45, 20, field_132);

         for(int var3 = 0; var3 <= var1; ++var3) {
            method_134(field_81, 211 + var3 + 2 - field_13, field_83, var3, 0);
         }

         field_7 = false;
      }

      var0.setClip(0, 0, 240, 320);
      var0.drawImage(field_80, 0, 0, 0);
   }

   // $FF: renamed from: l () void
   public static final void method_131() {
      if (field_7 || field_187) {
         method_68(method_133(field_82, 2));
         method_134(field_81, class_0.method_0() ? 235 : 236, field_82, 2, 0);
      }

      if (field_7 || field_188) {
         method_68(method_133(field_82, 4));
         method_134(field_81, class_0.method_6() ? 235 : 236, field_82, 4, 0);
      }

      if (field_7 || field_189) {
         method_68(method_133(field_82, 6));
         method_134(field_81, 238 + field_11, field_82, 6, 0);
      }

      if (field_7 || field_190) {
         method_68(method_133(field_82, 8));
         method_134(field_81, 242 + field_12, field_82, 8, 0);
      }

      if (field_7) {
         method_128(field_81, 214, field_82);
         method_129(field_81, 0, 227);
         method_20(field_81, 2, 120, 50, 17, field_132);
         method_134(field_81, 233, field_82, 1, 0);
         method_134(field_81, 234, field_82, 3, 0);
         method_134(field_81, 237, field_82, 5, 0);
         method_134(field_81, 241, field_82, 7, 0);
         field_7 = false;
      }

      if (field_87 != 0) {
         switch (field_87) {
            case 1:
               if (field_186 > 0) {
                  --field_186;
               } else {
                  field_186 = field_86.length / 4 - 1;
               }
               break;
            case 6:
               if (field_186 < field_86.length / 4 - 1) {
                  ++field_186;
               } else {
                  field_186 = 0;
               }
         }

         field_87 = 0;
         field_123 = method_87(field_86, field_186);
         field_124 = method_88(field_86, field_186);
      }

   }

   // $FF: renamed from: a (byte[], int) int[]
   public static final int[] method_132(byte[] var0, int var1) {
      return new int[]{method_85(var0, var1) * field_58 + field_61, method_86(var0, var1) * field_59 + field_62, method_87(var0, var1) * field_58 + field_61, method_88(var0, var1) * field_59 + field_62};
   }

   // $FF: renamed from: a (byte[], int) short[]
   public static final short[] method_133(byte[] var0, int var1) {
      return new short[]{(short)method_85(var0, var1), (short)method_86(var0, var1), (short)method_87(var0, var1), (short)method_88(var0, var1)};
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, byte[], int, int) void
   public static final void method_134(Graphics var0, int var1, byte[] var2, int var3, int var4) {
      method_136(var0, field_163, field_162[var1], field_162[var1 + 1], var2, var3, var4);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[], byte[], int, int) void
   public static final void method_135(Graphics var0, byte[] var1, byte[] var2, int var3, int var4) {
      method_136(var0, var1, (short)0, (short)var1.length, var2, var3, var4);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[], short, short, byte[], int, int) void
   public static final void method_136(Graphics var0, byte[] var1, short var2, short var3, byte[] var4, int var5, int var6) {
      int[] var7 = method_132(var4, var5);
      if (var6 == 4) {
         method_50(var0, var1, var2, var3, var7[0] + field_58, (var7[1] + var7[3] + field_59) / 2, 4, field_132);
      } else if (var6 == 6) {
         method_50(var0, var1, var2, var3, var7[2], (var7[1] + var7[3] + field_59) / 2, 6, field_132);
      } else {
         method_50(var0, var1, var2, var3, (var7[0] + var7[2] + field_58) / 2, (var7[1] + var7[3] + field_59) / 2, 5, field_132);
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, short, short, byte[], int, int) void
   public static final void method_137(Graphics var0, short var1, short var2, byte[] var3, int var4, int var5) {
      int[] var6 = method_132(var3, var4);
      method_116(var0, var1, (var6[0] + var6[2] + field_58) / 2, var6[3] + field_59 - 2, var5, 0, field_127);
      if (var2 >= 0) {
         byte[] var7 = method_108(var2);
         method_50(var0, var7, 0, var7.length, (var6[0] + var6[2] + field_58) / 2, var6[3] + field_59 * 3 / 2 - 2, 5, field_127);
      }

   }

   // $FF: renamed from: e (javax.microedition.lcdui.Graphics) void
   public static final void method_138(Graphics var0) {
      int var1 = field_162[220] - field_162[219] > 28 ? 5 : 4;
      if (field_87 != 0) {
         field_192 = field_194;
         field_193 = field_195;
         switch (field_87) {
            case 1:
               --field_195;
               if (field_195 < 0) {
                  field_195 = var1 - 1;
               }
               break;
            case 2:
               --field_194;
               if (field_194 < 0) {
                  field_194 = 6;
               }
            case 3:
            case 4:
            default:
               break;
            case 5:
               ++field_194;
               if (field_194 > 6) {
                  field_194 = 0;
               }
               break;
            case 6:
               ++field_195;
               if (field_195 > var1 - 1) {
                  field_195 = 0;
               }
         }

         field_87 = 0;
      }

      int var3 = (method_86(field_82, 1) + 2) * field_59;
      int var5 = (method_88(field_82, 1) * field_59 - var3) / (var1 + 4);
      int var6;
      if (field_7) {
         field_7 = false;
         method_128(var0, 220, field_82);
         method_129(var0, 228, 231);
         var0.setClip(10, var3, 220, method_48() + 6);
         var0.setColor(8347984);
         var0.fillRect(10, var3, 220, method_48() + 6);
         if (field_191 != null) {
            method_50(var0, field_191, 0, field_191.length, 120, var3 + 7, 5, field_132);
         }

         var3 += var5 * 2;
         var6 = 0;

         for(int var7 = 0; var7 < var1; ++var7) {
            for(int var8 = 0; var8 < 7; ++var8) {
               method_40(var0, field_163[field_162[219] + var6], 8 + 224 * (var8 + 1) / 8, var3, 5, field_132);
               ++var6;
            }

            var3 += method_48() + var5;
         }
      } else {
         ++field_196;
         var0.setClip(0, 0, 240, 320);
         if (field_196 < 5) {
            var0.setColor(16777215);
         } else {
            var0.setColor(8347984);
         }

         if (field_191 != null) {
            var6 = 121 + method_47(field_191, 0, field_191.length) / 2;
            if (field_191.length < 6) {
               var0.drawLine(var6, var3 + 2, var6, var3 + 12);
            }
         } else {
            var0.drawLine(121, var3 + 2, 121, var3 + 12);
         }

         if (field_196 > 10) {
            field_196 = 0;
         }

         var3 += var5 * 2;
         var0.setColor(921899);
         var0.drawRect(8 + 224 * (field_192 + 1) / 8 - 7 - 1, var3 + (method_48() + var5) * field_193 - 7, 17, 14);
         var0.setColor(16777215);
         var0.drawRect(8 + 224 * (field_194 + 1) / 8 - 7 - 1, var3 + (method_48() + var5) * field_195 - 7, 17, 14);
      }

   }

   // $FF: renamed from: m () void
   public static final void method_139() {
      short[] var0 = new short[field_102.length];

      for(int var1 = 0; var1 <= field_102.length - 1; ++var1) {
         var0[var1] = field_102[var1] != -1 ? method_14((short)field_102[var1]) : 0;
      }

      method_141(field_102, var0);
   }

   // $FF: renamed from: n () void
   public static final void method_140() {
      short[] var0 = new short[field_117.length];

      for(int var1 = 0; var1 <= field_117.length - 1; ++var1) {
         var0[var1] = field_117[var1] != -1 ? (short)field_120[field_117[var1] * 2 + 1] : 0;
      }

      method_141(field_117, var0);
   }

   // $FF: renamed from: a (byte[], short[]) void
   public static final void method_141(byte[] var0, short[] var1) {
      for(int var2 = 0; var2 <= var0.length - 1; ++var2) {
         for(int var3 = var0.length - 1; var3 > var2; --var3) {
            if (var1[var3 - 1] > var1[var3]) {
               byte var4 = var0[var3 - 1];
               short var5 = var1[var3 - 1];
               var0[var3 - 1] = var0[var3];
               var1[var3 - 1] = var1[var3];
               var0[var3] = var4;
               var1[var3] = var5;
            }
         }
      }

   }

   // $FF: renamed from: f (javax.microedition.lcdui.Graphics) void
   public static final void method_142(Graphics var0) {
      try {
         int var1;
         int var2;
         int var3;
         if (field_7) {
            var1 = method_19(4).getWidth() / field_54;
            var2 = method_19(4).getHeight() / field_55;
            var3 = var1 * var2;
            field_199 = true;
            method_74(var0, field_73, (short)4, 0, 0, var1, var3, field_54, field_55);
            var0.setClip(0, 15, 240, 4);
            var0.setColor(3544320);
            var0.fillRect(0, 15, 240, 4);
            method_74(var0, field_75, (short)4, 0, 320 - field_55 * field_75[0].length, var1, var3, field_54, field_55);
            method_17(4);
            field_199 = false;
            method_129(var0, 227, 217);
            method_49(var0, 254, 2, -1, 0, field_127);
            method_49(var0, 256, 2, field_55, 0, field_127);
            method_49(var0, 268, 230, field_55, 2, field_127);
            byte[] var4 = method_108(field_94);
            method_50(var0, var4, 0, var4.length, 239, -1, 2, field_127);
            byte[] var5 = method_108(field_95);
            method_50(var0, var5, 0, var5.length, 239, field_55, 2, field_127);
            byte[] var6 = method_108(field_96);
            method_50(var0, var6, 0, var6.length, method_46(256) + 5, field_55, 0, field_127);
            byte[] var7 = method_108(method_16(field_23) - method_15(field_23));
            method_50(var0, var7, 0, var7.length, method_46(254) + 5, -1, 0, field_127);
         }

         if (field_200) {
            ++field_201;
            field_200 = false;
            field_26 = null;
            field_106[field_98 * 13 + 8] = 0;

            for(var1 = 0; var1 < field_106[3]; ++var1) {
               var2 = var1 * 2 + field_106[2];
               if (field_107[var2] == 15) {
                  field_94 += 10 * field_107[var2 + 1];
               }
            }

            field_15 = 0;
            method_118();
            field_176 = true;
            if (field_201 % 14 == 0) {
               method_81((short)1, (short)9, 0);
               method_81((short)2, (short)10, 1);
               method_81((short)2, (short)10, 2);
               method_81((short)3, (short)11, 0);
               method_81((short)4, (short)12, 1);
               method_81((short)5, (short)13, 0);
               method_81((short)6, (short)14, 0);
               method_81((short)7, (short)15, 2);
               method_81((short)8, (short)16, 0);
               method_82(15, 1, 1);
            }

            if (field_202 != -1 && field_201 - field_202 > 3 && field_106[506] != -1) {
               method_62(38);
            }
         }

         if (field_8) {
            if (!field_7) {
               return;
            }

            field_7 = false;
            field_92 = false;
            method_17(5);
            method_17(4);
            method_17(7);
            var1 = method_19(9).getWidth();
            var2 = method_19(9).getHeight();
            var3 = (240 - var1) / 2;
            int var13 = field_60 + 5;
            method_36(var0, field_132);
            var0.setColor(-1);
            var0.fillRect(var3 - 3, var13 - 3, var1 + 6, var2 + 6);
            var0.setColor(0);
            var0.fillRect(var3, var13, var1, var2);
            int var14 = var1 / 4;

            for(int var15 = 0; var15 < field_116.length; ++var15) {
               if (field_116[var15] != 0) {
                  int var16 = var3 + var15 % 4 * var14;
                  int var8 = var13 + var15 / 4 * var14;
                  int[] var9 = new int[]{var16, var8, var16 + var14, var8 + var14};
                  method_20(var0, 9, var3, var13, 0, var9);
               }
            }

            if (field_71 < 16) {
               method_36(var0, field_132);
               var0.setColor(16711680);
               var0.fillRect(var3 + field_71 % 4 * var14 + field_24 / field_58 * 2 - 2, var13 + field_71 / 4 * var14 + field_25 / field_59 * 2 + 1, 2, 2);
            }

            return;
         }

         if (field_197 || field_91 || field_92) {
            method_111(var0);
            method_126(var0);
         }

         if (field_7 || field_176) {
            field_7 = false;
            field_176 = false;
            byte[] var11 = method_108(method_16(field_23) - method_15(field_23));
            var0.setClip(method_46(254) + 5, 1, 16, field_55 - 1);
            var0.setColor(5518098);
            var0.fillRect(method_46(254) + 5, 1, 16, field_55 - 1);
            method_50(var0, var11, 0, var11.length, method_46(254) + 5, -1, 0, field_127);
         }

         for(short var12 = 0; var12 <= field_102.length - 1; ++var12) {
            if (field_102[var12] != -1) {
               method_115(var0, (short)field_102[var12]);
            }
         }

         method_114(var0);
      } catch (Exception var10) {
      }

      if (field_198) {
         field_198 = false;
         method_59((short)198, (short)0, true);
      }

   }

   // $FF: renamed from: g (javax.microedition.lcdui.Graphics) void
   public static final void method_143(Graphics var0) {
      int var1;
      int var2;
      int var3;
      if (field_7) {
         field_7 = false;
         var1 = method_19(4).getWidth() / field_54;
         var2 = method_19(4).getHeight() / field_55;
         var3 = var1 * var2;
         method_74(var0, field_74, (short)4, 0, 0, var1, var3, field_54, field_55);
         method_74(var0, field_75, (short)4, 0, 320 - field_55 * field_75[0].length, var1, var3, field_54, field_55);
         method_17(4);
         method_49(var0, 248, 120, field_59 / 4, 5, field_132);
         method_129(var0, 227, 0);
      }

      if (field_121 != null && field_205) {
         method_22(var0, 120, field_121[0] * field_58, field_121[1] * field_59 + field_62, 0, field_132);
      }

      if (field_27 < method_10(field_98)) {
         method_125(var0, field_27);
      }

      method_121(var0, true);
      if (!field_91 && field_23 == field_98) {
         method_114(var0);
      }

      if (field_31) {
         ++field_203;
         if (field_203 == 1) {
            field_110[field_110.length - 1] = 1;
            if (field_33 == 18) {
               field_121 = new byte[2];
               field_205 = false;
               field_121[0] = (byte)field_125;
               field_121[1] = (byte)field_126;
               method_104();
            }
         }

         method_116(var0, field_114[field_33 * field_113], field_125 * field_58 + field_58 / 2, (field_126 + 1) * field_59 + field_62, field_110.length - 1, 0, field_132);
         if (field_110[field_110.length - 1] == 1) {
            field_31 = false;
            if (field_33 == 18) {
               field_205 = true;
            }

            field_203 = 0;
            if (field_33 == 18) {
               field_110[field_110.length - 1] = 0;
            } else {
               short var6;
               if ((var6 = method_120(field_23, field_125, field_126)) < 100 || var6 >= 110) {
                  short var7;
                  if (var6 < 100) {
                     var7 = 0;
                     switch (field_33) {
                        case 2:
                           var7 = 500;
                           break;
                        case 12:
                           var7 = 80;
                           break;
                        case 13:
                           var7 = 90;
                           break;
                        case 14:
                           var7 = 100;
                           break;
                        case 21:
                           var7 = 120;
                           break;
                        case 22:
                           var7 = 105;
                     }

                     short[] var10000 = field_119;
                     var10000[var6 * 2 + 1] -= var7;
                     if (field_119[var6 * 2 + 1] < 0) {
                        field_119[var6 * 2 + 1] = 0;
                     }

                     if (field_119[var6 * 2 + 1] > 0) {
                        field_110[var6] = 3;
                     } else {
                        field_110[var6] = 4;
                     }

                     field_149 = var6;
                  }

                  if (var6 >= 110) {
                     var1 = 110 - var6;
                     var7 = field_119[var1 * 2];
                     byte var8 = field_112[var7 * field_111 + 2];
                     switch (field_33) {
                        case 19:
                           field_119[var1 * 2 + 1] = (short)((field_119[var1 * 2 + 1] / var8 + 1) * var8);
                           break;
                        case 20:
                           field_119[var1 * 2 + 1] = (short)(field_107[method_9(field_98) + var1 * 2 + 1] * var8);
                     }
                  }
               }
            }
         }
      }

      if (field_30) {
         var1 = field_58;
         if (field_203 + 2 <= var1) {
            if (field_28 != 100) {
               field_203 += 2;
               var2 = field_120[field_27 * 2] * field_58;
               var3 = field_120[field_27 * 2 + 1] * field_58;
               int var4 = field_120[field_28 * 2] * field_58;
               int var5 = field_120[field_28 * 2 + 1] * field_58;
               var0.setColor(-1);
               var0.setClip(var2 + (var4 - var2) / field_58 * field_203, var3 + (var5 - var3) / field_59 * field_203, field_58, field_59);
               var0.drawLine(var2 + field_58 / 2, var3 + field_59 / 2, var4 + field_58 / 2, var5 + field_59 / 2);
               return;
            }
         } else {
            field_203 = 0;
            field_30 = false;
            method_101(field_27, field_28, true);
            field_28 = 100;
            method_119();
            method_104();
         }
      }

   }

   // $FF: renamed from: c (int) int
   public static final int method_144(int var0) {
      return var0 < 0 ? 0 : (field_10.nextInt() & Integer.MAX_VALUE) % (var0 + 1);
   }

   // $FF: renamed from: h (javax.microedition.lcdui.Graphics) void
   public static final void method_145(Graphics var0) {
      int[] var1 = method_132(field_82, 3);
      short var2 = field_207[0];
      if (field_211 != 0) {
         if (field_87 == 1 && field_210 > 0) {
            --field_210;
            field_213 = true;
         }

         if (field_87 == 6 && field_210 < var2 - 1) {
            ++field_210;
            field_213 = true;
         }
      }

      field_87 = 0;
      if (field_7) {
         method_128(var0, 253, field_82);
         int[] var3;
         int var4 = ((var3 = method_132(field_82, 2))[3] - var3[1]) / method_48() - 1;
         if (field_17.length - 1 <= var4) {
            field_211 = 1;
         }
      }

      if (field_212 || field_7) {
         var0.setClip(0, method_86(field_82, 2) * field_59, 240, (method_88(field_82, 2) + 1) * field_59);
         var0.drawImage(field_80, 0, 0, 0);
         method_51(var0, field_163, field_17, field_209, method_132(field_82, 2), 0, 0);
         if (field_211 == 1) {
            field_212 = false;
            field_213 = true;
         }
      }

      if (field_213 || field_7) {
         byte var10 = method_86(field_82, 3);
         byte var11 = method_89(field_82, 3);
         field_123 = 240 / field_58 - 1;
         if (field_211 == 0) {
            method_134(var0, 274, field_82, 3, 0);
            field_124 = var10 + var11 / 2 + 1;
         } else {
            field_213 = false;
            var0.setClip(0, var10 * field_59, 240, var11 * field_59);
            var0.drawImage(field_80, 0, 0, 0);
            int var5 = (var10 + 1) * field_59;
            int var6 = field_210 > 1 ? field_210 - 1 : 0;

            while(true) {
               if (var6 > var2 - 1) {
                  short var12;
                  if ((var12 = field_207[0]) > 2) {
                     int var8;
                     int var9 = (var8 = (field_85[3] - field_85[1]) * field_59) * 2 / var12;
                     method_52(var0, (field_85[1] + 1) * field_59 + field_210 * ((var8 - var9) / var2 - 1), var9, field_85[0] * field_58);
                  }

                  field_124 = var10 + 2 + (field_210 > 0 ? 2 : 0);
                  break;
               }

               for(int var7 = 0; var7 <= field_207[field_207[var6 + 1]] - 1; ++var7) {
                  method_50(var0, field_163, field_207[field_207[var6 + 1] + var7 + 1], field_207[field_207[var6 + 1] + var7 + 2], 120, var5, 5, var1);
                  var5 += method_48();
               }

               var5 += method_48();
               ++var6;
            }
         }

         method_113(var0);
         field_7 = false;
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, byte[], byte[], short) void
   public static final void method_146(Graphics var0, byte[] var1, byte[] var2, short var3) {
      int var4 = var1.length / 2;
      int var5 = var2.length / 2;
      if (field_7) {
         method_128(field_81, 221, field_82);
         field_219 = true;
         field_221 = var4 / field_215 + (var4 % field_215 > 0 ? 1 : 0);
         field_222 = var5 / field_215 + (var5 % field_215 > 0 ? 1 : 0);
         field_220 = field_214 / field_215;
         if (field_216 < field_215) {
            field_218 = 0;
         } else {
            field_218 = 1;
         }

         field_219 = true;
         method_111(var0);
         field_7 = false;
      }

      switch (field_87) {
         case 1:
            if (field_217 > 0) {
               --field_217;
            } else {
               field_21 = true;
            }
            break;
         case 2:
            if (field_216 > 0) {
               --field_216;
               if (field_216 == 2 && field_225 == 0 && field_217 == field_214 / field_215 - 1) {
                  --field_216;
               }

               if (field_216 < field_215 && field_218 == 1) {
                  field_218 = 0;
                  field_219 = true;
               }
            }
         case 3:
         case 4:
         default:
            break;
         case 5:
            if (field_216 < field_215 * 2 - 1) {
               ++field_216;
               if (field_216 == 2 && field_225 == 0 && field_217 == field_214 / field_215 - 1) {
                  ++field_216;
               }

               if (field_216 >= field_215 && field_218 == 0) {
                  field_218 = 1;
                  field_219 = true;
               }
            }
            break;
         case 6:
            if (field_217 < field_214 / field_215 - 1) {
               ++field_217;
               if (field_216 == field_215 - 1 && field_225 == 0) {
                  --field_217;
               }
            } else {
               field_22 = true;
            }
      }

      if (field_87 != 0) {
         int var6 = field_216 + field_215 * 2 * field_217;
         field_123 = method_87(field_84, var6);
         field_124 = method_88(field_84, var6);
         field_87 = 0;
      }

      if (field_219) {
         field_219 = false;
         method_68(new short[]{0, (short)(field_68 - 2), (short)(field_67 / 2), (short)field_68});
         if (field_218 == 0) {
            method_129(field_81, 222, 217);
         } else {
            method_129(field_81, 223, 217);
         }
      }

      if (field_123 < field_67 / 2) {
         field_19 = method_147(var0, field_19, var1, var3, 0);
      } else {
         field_20 = method_147(var0, field_20, var2, var3, 1);
      }

      method_148(var0, 0, var1, var3, field_19, 0, field_225 == 0 ? -1 : (field_216 < field_215 && field_216 + field_215 * field_217 < var1.length / 2 ? field_216 + field_215 * field_217 : -1));
      method_148(var0, 1, var2, var3, field_20, var1.length / 2, field_225 == 0 ? -1 : (field_216 >= field_215 && field_216 + field_215 * field_217 - field_215 < var2.length / 2 ? field_216 + field_215 * field_217 - field_215 + var1.length / 2 : -1));
      if (field_221 > field_220) {
         method_52(var0, (field_85[1] + 1) * field_59 + field_19 * (field_85[3] - field_85[1] - 1) * field_59 / field_221, (field_85[3] - field_85[1] - 1) * field_59 * field_220 / field_221 + 1, field_85[0] * field_58);
      }

      if (field_222 > field_220) {
         if (field_225 == 0) {
            method_52(var0, (field_85[1] + 1) * field_59 + field_20 * (field_85[3] - field_85[1] - 1) * field_59 / field_222, (field_85[3] - field_85[1] - 1) * field_59 * field_220 / field_222 + 1, field_85[0] * field_58);
         } else {
            method_52(var0, (field_85[5] + 1) * field_59 + field_20 * (field_85[7] - field_85[5] - 1) * field_59 / field_222, (field_85[7] - field_85[5] - 1) * field_59 * field_220 / field_222 + 1, field_85[4] * field_58);
         }
      }

      byte[] var12 = field_225 == 0 ? field_112 : field_114;
      byte var7 = field_225 == 0 ? field_111 : field_113;
      int var8 = field_225 == 0 ? 1 : 2;
      int var9;
      byte var10;
      if (field_216 < field_215) {
         if ((var9 = field_216 + field_215 * field_217) < var1.length / 2) {
            var10 = var12[var1[var9 * 2] * var7 + 1];
            method_134(var0, var10, field_82, 2, 1);
            if (field_225 == 0) {
               method_151((short)var1[var9 * 2], (short)var1[var9 * 2 + 1], (byte)1, (byte)1, (byte)1);
               method_51(var0, field_242, field_18, field_185, method_132(field_82, 3), 2, var8);
            } else {
               field_17 = method_53(var12[var1[var9 * 2] * var7 + 2], 240 - 3 * field_54);
            }

            method_51(var0, field_163, field_17, field_185, method_132(field_82, 3), 0, var8);
         } else {
            field_110 = new byte[field_110.length];
         }
      } else if ((var9 = field_216 + field_215 * field_217 - field_215) < var2.length / 2) {
         var10 = var12[var2[var9 * 2] * var7 + 1];
         method_134(var0, var10, field_82, 2, 1);
         if (field_225 == 0) {
            method_151((short)var2[var9 * 2], (short)var2[var9 * 2 + 1], (byte)1, (byte)1, (byte)1);
            method_51(var0, field_242, field_18, field_185, method_132(field_82, 3), 2, var8);
         } else {
            field_17 = method_53(var12[var2[var9 * 2] * var7 + 2], 240 - 3 * field_54);
         }

         method_51(var0, field_163, field_17, field_185, method_132(field_82, 3), 0, var8);
      } else {
         field_110 = new byte[field_110.length];
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, byte[], short, int) int
   public static final int method_147(Graphics var0, int var1, byte[] var2, short var3, int var4) {
      if (field_21) {
         field_21 = false;
         if (var1 - 1 >= 0) {
            --var1;
         }
      } else if (field_22) {
         field_22 = false;
         if ((var1 + 1) * field_215 + field_214 < var2.length / 2 + field_215) {
            ++var1;
         }
      }

      return var1;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, byte[], short, int, int, int) void
   public static final void method_148(Graphics var0, int var1, byte[] var2, short var3, int var4, int var5, int var6) {
      if (var2 != null) {
         int var7 = var2.length / 2;
         if (var6 != -1 && field_110[var6] == 0) {
            field_110 = new byte[field_110.length];
            field_110[var6] = 1;
         }

         byte[] var8 = var3 == 0 ? field_112 : field_114;
         short var9 = var3 == 0 ? (short)field_111 : (short)field_113;
         int var10;
         if (field_214 >= var7) {
            for(var10 = 0; var10 <= var7 - 1; ++var10) {
               method_137(var0, (short)var8[var2[var10 * 2] * var9], (short)var2[var10 * 2 + 1], field_84, var10 / field_215 * field_215 * 2 + var10 % field_215 + (var1 > 0 ? field_215 : 0), var10 + var5);
            }
         } else {
            for(var10 = field_215 * var4; var10 <= (field_214 + field_215 * var4 > var7 - 1 ? var7 - 1 : field_214 + field_215 * var4 - 1); ++var10) {
               System.out.print("k : " + var10 + " ");
               System.out.print("z : " + ((var10 - field_215 * var4) / field_215 * field_215 * 2 + (var10 - field_215 * var4) % field_215 + (var1 > 0 ? 3 : 0)) + " ");
               System.out.println("data[k * 2] : " + var2[var10 * 2] + " ");
               method_137(var0, (short)var8[var2[var10 * 2] * var9], (short)var2[var10 * 2 + 1], field_84, (var10 - field_215 * var4) / field_215 * field_215 * 2 + (var10 - field_215 * var4) % field_215 + (var1 > 0 ? field_215 : 0), 0);
            }
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, short, byte[], byte[], byte) void
   public static final void method_149(Graphics var0, short var1, byte[] var2, byte[] var3, byte var4) {
      int var5;
      if (field_7) {
         field_7 = false;
         method_128(var0, var1, field_82);
         method_129(var0, 227, 229);
         field_132 = field_131;

         for(var5 = 0; var5 <= field_84.length / 4 - 1; ++var5) {
            if (method_87(field_84, var5) != 0 || method_88(field_84, var5) != 0) {
               ++field_232;
               if (method_86(field_84, var5) == method_86(field_84, 0)) {
                  ++field_233;
               }
            }
         }
      } else {
         method_111(var0);
      }

      var5 = field_232 / field_233;
      if (field_234 > 0 && field_87 == 2) {
         --field_234;
      }

      if (field_234 < field_233 - 1 && field_87 == 5) {
         ++field_234;
      }

      if (field_87 == 1) {
         if (field_235 > 0) {
            --field_235;
         } else {
            field_21 = true;
         }
      }

      if (field_87 == 6) {
         if (field_235 < var5 - 1) {
            ++field_235;
         } else {
            field_22 = true;
         }
      }

      field_123 = method_87(field_84, field_233 * field_235 + field_234);
      field_124 = method_88(field_84, field_233 * field_235 + field_234);
      if (var2.length > 0) {
         int var6;
         int var7 = (var6 = var2.length / 2) / field_233 + (var6 % field_233 > 0 ? 1 : 0);
         if (field_21 && field_19 - 1 >= 0) {
            --field_19;
         }

         field_21 = false;
         if (field_22 && (field_19 + 1) * field_233 + field_232 < var6 + field_233) {
            ++field_19;
         }

         field_22 = false;
         int var8;
         if (field_87 != 0) {
            try {
               field_110 = new byte[field_110.length];
               if ((var8 = field_234 + field_233 * (field_19 + field_235)) < var2.length / 2) {
                  field_110[var8] = 1;
               }
            } catch (Exception var12) {
            }
         }

         field_87 = 0;
         if (field_232 < var6) {
            var8 = field_85[3] - field_85[1];
            method_52(var0, (field_85[1] + 1) * field_59 + field_19 * var8 * field_59 / var7, (var8 - 1) * field_59 * var5 / var7 + 1, field_85[0] * field_58);
         }

         int var9;
         for(var9 = var8 = field_233 * field_19; var9 <= (field_232 + var8 > var6 - 1 ? var6 - 1 : field_232 + var8 - 1); ++var9) {
            int var10 = var9 - var8;
            method_137(var0, (short)var3[var2[var9 * 2] * var4], (short)var2[var9 * 2 + 1], field_84, var10, var3 == field_112 ? -1 : var10);
         }

         if ((var9 = field_234 + field_233 * (field_19 + field_235)) < var2.length / 2 && var3 == field_114) {
            byte var13 = var3[var2[var9 * 2] * var4 + 1];
            field_17 = method_53(var3[var2[var9 * 2] * var4 + 2], 240 - 3 * field_54);
            method_134(var0, var13, field_82, 2, 1);
            field_185 = method_51(var0, field_163, field_17, field_185, method_132(field_82, 3), 0, 1);
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, short, short, boolean) void
   public static final void method_150(Graphics var0, short var1, short var2, boolean var3) {
      if (field_7) {
         field_7 = false;
         method_128(var0, 258, field_82);
         method_129(var0, 0, 229);
         method_134(var0, field_240, field_82, 2, 0);
         field_132 = new int[]{0, 7 * field_55, 240, 320 - field_55 * 2};
      }

      int[] var4 = new int[]{0, field_59 * 2, 3 * field_58, field_59 * 6};
      method_112(var0, var4);
      method_111(var0);
      method_137(var0, var1, var2, field_84, 0, var3 ? 0 : -1);
      int[] var5 = method_132(field_82, 3);
      field_185 = method_51(var0, field_163, field_17, field_185, var5, 0, 0);
      method_51(var0, field_242, field_18, field_185, var5, 2, 0);
   }

   // $FF: renamed from: a (short, short, byte, byte, byte) void
   public static final void method_151(short var0, short var1, byte var2, byte var3, byte var4) {
      try {
         field_238 = (short)field_112[var0 * field_111];
         field_239 = var1;
         field_244 = false;
         field_240 = (short)field_112[var0 * field_111 + 1];
         field_243 = 282;
         short[] var5 = new short[]{(short)field_112[var0 * field_111 + 2], (short)((field_112[var0 * field_111 + 4] + field_112[var0 * field_111 + 3]) * var2 * var3), (short)(field_112[var0 * field_111 + 5] * var4), (short)field_112[var0 * field_111 + 6], (short)(field_112[var0 * field_111 + 4] == 0 ? -2 : -1), -2, -2};
         int var6 = 0;
         field_242 = new byte[500];
         int var7 = 0;

         while(var7 < var5.length) {
            byte[] var8;
            if (var5[var7] >= 0) {
               var8 = method_108(var5[var7]);
            } else {
               int var9 = var5[var7] == -1 ? 235 : 236;
               int var10;
               var8 = new byte[var10 = field_162[var9 + 1] - field_162[var9]];
               System.arraycopy(field_163, field_162[var9], var8, 0, var10);
            }

            System.arraycopy(var8, 0, field_242, var6, var8.length);
            var6 += var8.length;
            ++var7;
            field_242[var6] = (byte)(var7 < var5.length ? -2 : -1);
            ++var6;
            if (var7 == 1) {
               field_242[var6] = -2;
               ++var6;
            }
         }

         field_242 = method_76(field_242, var6);
         field_18 = method_54(field_242, 0, 240 - 3 * field_54);
      } catch (Exception var11) {
      }
   }

   // $FF: renamed from: o () void
   public static final void method_152() {
      boolean var1;
      int var2;
      switch (field_14) {
         case 0:
            if (!field_91 && !field_92 && !field_8) {
               field_15 = 15;
               return;
            }
            break;
         case 1:
            switch (field_122 + 2 - field_13) {
               case 0:
                  field_71 = field_106[field_98 * 13 + 12];
                  method_102();
                  field_15 = 0;
                  break;
               case 1:
                  if (!method_164("GAME")) {
                     method_59((short)218, (short)1, true);
                     return;
                  }

                  method_17(2);
                  method_17(7);
                  field_23 = 0;
                  field_98 = 0;
                  method_163();
                  field_71 = field_106[field_98 * 13 + 12];
                  method_102();
                  field_15 = 0;
                  break;
               case 2:
                  field_23 = 0;
                  field_98 = 0;
                  field_91 = false;
                  field_201 = 0;
                  field_202 = -1;
                  field_198 = true;
                  method_42();
                  method_81(field_98, (short)76, 1);
                  method_81(field_98, (short)76, 2);
                  method_81(field_98, (short)76, 0);
                  field_71 = field_106[field_98 * 13 + 12];
                  field_115 = new byte[12];
                  field_116 = new byte[16];
                  field_94 = field_11 == 0 ? 6000 : (field_11 == 1 ? 3000 : 1500);
                  field_95 = 1;
                  field_96 = 0;
                  field_97 = 250;
                  method_102();
                  field_15 = 12;
                  break;
               case 3:
                  method_161();
                  field_15 = 10;
                  break;
               case 4:
                  field_15 = 9;
                  break;
               case 5:
                  field_15 = 8;
                  break;
               case 6:
                  try {
                     class_2.field_255.destroyApp(true);
                  } catch (Exception var3) {
                  }
            }

            return;
         case 2:
         case 17:
         case 18:
            method_154();
            if (!field_245) {
               return;
            }

            field_241 = field_14;
            field_15 = 19;
            return;
         case 3:
            if (field_123 < field_67 / 2) {
               field_226 = 0;
               field_246 = 0;
               field_227 = (byte)(field_216 + (field_217 + field_19) * field_215);
               if (field_227 >= field_223.length >> 1) {
                  return;
               }

               if (field_225 == 1) {
                  field_15 = 7;
                  field_17 = method_53(199, 240 - 3 * field_54);
                  field_241 = 3;
                  return;
               }
            } else {
               field_226 = 1;
               field_227 = (byte)(field_216 - field_215 + (field_217 + field_20) * field_215);
               if (field_227 >= field_224.length >> 1) {
                  return;
               }

               field_246 = 120;
               var1 = false;

               for(var2 = 0; var2 < field_223.length / 2; ++var2) {
                  if (field_223[var2 * 2] == field_224[field_227 * 2]) {
                     var1 = true;
                     if (field_223[var2 * 2 + 1] < field_246) {
                        field_246 = (short)field_223[var2 * 2 + 1];
                     }
                  }
               }

               if (!var1) {
                  field_246 = 0;
               }

               if (field_223.length < 10) {
                  if (var1 && field_225 == 0) {
                     field_17 = method_53(288, 240 - 3 * field_54);
                     field_15 = 22;
                     return;
                  }
               } else if (!var1 && field_225 == 0) {
                  field_15 = 7;
                  field_17 = method_53(277, 240 - 3 * field_54);
                  field_241 = 3;
                  return;
               }
            }

            field_15 = 5;
            return;
         case 4:
         case 7:
         case 8:
         case 9:
         case 11:
         case 14:
         case 16:
         default:
            break;
         case 5:
            if (field_229 == 0) {
               return;
            }

            byte[] var10000;
            int var10001;
            if (field_226 == 0) {
               var1 = false;

               for(var2 = 0; var2 < field_224.length / 2; ++var2) {
                  if (field_224[var2 * 2] == field_223[field_227 * 2] && field_224[var2 * 2 + 1] + field_229 < 120) {
                     var1 = true;
                     var10000 = field_224;
                     var10000[var2 * 2 + 1] += field_229;
                     break;
                  }
               }

               if (!var1) {
                  field_224 = method_76(field_224, field_224.length + 2);
                  field_224[field_224.length - 2] = field_223[field_227 * 2];
                  field_224[field_224.length - 1] = field_229;
               }

               if (field_229 >= field_223[field_227 * 2 + 1]) {
                  field_223 = method_78(field_223, field_227, 2);
               } else {
                  var10000 = field_223;
                  var10001 = field_227 * 2 + 1;
                  var10000[var10001] -= field_229;
               }

               field_94 += field_231;
            } else {
               var1 = false;
               if (!field_168) {
                  for(var2 = 0; var2 < field_223.length / 2; ++var2) {
                     if (field_223[var2 * 2] == field_224[field_227 * 2] && field_223[var2 * 2 + 1] + field_229 <= 120) {
                        var1 = true;
                        var10000 = field_223;
                        var10000[var2 * 2 + 1] += field_229;
                        break;
                     }
                  }
               }

               if (!var1) {
                  field_223 = method_76(field_223, field_223.length + 2);
                  field_223[field_223.length - 2] = field_224[field_227 * 2];
                  field_223[field_223.length - 1] = field_229;
               }

               if (field_229 >= field_224[field_227 * 2 + 1]) {
                  field_224 = method_78(field_224, field_227, 2);
               } else {
                  var10000 = field_224;
                  var10001 = field_227 * 2 + 1;
                  var10000[var10001] -= field_229;
               }

               field_94 -= field_231;
            }

            field_15 = 3;
            break;
         case 6:
            if (field_27 >= method_10(field_98)) {
               return;
            }

            field_15 = 13;
            return;
         case 10:
            switch (field_186) {
               case 0:
               case 1:
                  class_0.method_1(!class_0.method_0());
                  field_187 = true;
                  break;
               case 2:
               case 3:
                  class_0.method_7(!class_0.method_6());
                  field_188 = true;
                  break;
               case 4:
                  --field_11;
                  if (field_11 < 0) {
                     field_11 = 2;
                  }

                  field_189 = true;
                  break;
               case 5:
                  ++field_11;
                  if (field_11 > 2) {
                     field_11 = 0;
                  }

                  field_189 = true;
                  break;
               case 6:
                  --field_12;
                  if (field_12 < 0) {
                     field_12 = 2;
                  }

                  field_190 = true;
                  break;
               case 7:
                  ++field_12;
                  if (field_12 > 2) {
                     field_12 = 0;
                  }

                  field_190 = true;
            }

            return;
         case 12:
            field_7 = true;
            int var0 = field_194 + field_195 * 7;
            if (field_191 == null) {
               field_191 = new byte[0];
            }

            if (var0 == 7 * (field_162[220] - field_162[219] > 28 ? 5 : 4) - 1) {
               field_191 = method_76(field_191, field_191.length - 1);
               return;
            }

            if (field_191.length < 6) {
               field_191 = method_76(field_191, field_191.length + 1);
               field_191[field_191.length - 1] = field_163[field_162[219] + var0];
               return;
            }
            break;
         case 13:
            field_15 = 6;
            return;
         case 15:
         case 20:
            field_15 = 0;
            return;
         case 19:
            field_15 = field_241;
            return;
      }

   }

   // $FF: renamed from: p () void
   public static final void method_153() {
      switch (field_14) {
         case 0:
            if (!field_91 && !field_92 && !field_8) {
               field_15 = 20;
               return;
            }
         case 1:
         case 6:
         case 7:
         case 11:
         case 13:
         case 14:
         default:
            break;
         case 2:
         case 4:
         case 15:
         case 17:
         case 20:
         case 21:
            field_242 = null;
            field_18 = null;
            field_15 = 0;
            return;
         case 3:
            short var0 = field_106[field_98 * 13 + field_225 * 2];
            short var1 = field_106[field_98 * 13 + field_225 * 2 + 1];
            int var2 = field_223.length / 2 - var1;
            field_107 = method_80(field_107, field_223, var0, var1, 2);
            method_84(field_98, var2 * 2, field_225);
            var0 = field_106[field_99 * 13 + field_225 * 2];
            var1 = field_106[field_99 * 13 + field_225 * 2 + 1];
            var2 = field_224.length / 2 - var1;
            field_107 = method_80(field_107, field_224, var0, var1, 2);
            method_84(field_99, var2 * 2, field_225);
            field_15 = 0;
            break;
         case 5:
            field_15 = 3;
            return;
         case 8:
         case 9:
            field_15 = 1;
            return;
         case 10:
            method_160();
            field_15 = 1;
            return;
         case 12:
            if (field_191 == null) {
               field_191 = new byte[3];
               field_191[0] = 83;
               field_191[1] = 83;
               field_191[2] = 83;
            }

            method_160();
            field_15 = 0;
            return;
         case 16:
            field_242 = null;
            field_18 = null;
            field_15 = field_241;
            return;
         case 18:
            field_15 = (short)field_236;
            return;
         case 19:
            field_15 = field_241;
            return;
      }

   }

   // $FF: renamed from: q () void
   public static final void method_154() {
      short var0;
      byte var1;
      switch (field_14) {
         case 0:
            if (field_26 != null && field_125 == field_26[field_26.length - 2] - field_36 / field_58 && field_126 == field_26[field_26.length - 1] - field_37 / field_59) {
               if ((method_16(field_23) - method_15(field_23)) * 2 < field_26.length) {
                  field_26 = method_76(field_26, (method_16(field_23) - method_15(field_23)) * 2);
               }

               if (field_26.length == 0) {
                  field_26 = null;
                  return;
               }

               field_253 = System.currentTimeMillis() - 300L;
               field_91 = true;
               field_92 = true;
               field_110[field_23] = 1;
            }

            if (!field_91) {
               field_93 = true;
               field_26 = method_96(field_72, field_76, (byte)method_13(field_23), (byte)method_14(field_23), (byte)(field_125 + field_36 / field_58), (byte)(field_126 + field_37 / field_59));
               if (field_26 != null) {
                  field_197 = true;
                  return;
               }
            }
            break;
         case 1:
         case 10:
         case 12:
            method_152();
            return;
         case 2:
         case 17:
         case 18:
            field_245 = false;
            byte var5 = (byte)(field_233 * (field_235 + field_19) + field_234);
            field_242 = null;
            if (field_14 == 2) {
               if (var5 > field_106[field_98 * 13 + 3] - 1) {
                  return;
               }

               field_237 = (short)(var5 * 2 + field_106[field_98 * 13 + 2]);
               field_238 = (short)field_114[field_107[field_237] * field_113];
               field_239 = (short)field_107[field_237 + 1];
               field_244 = true;
               field_240 = (short)field_114[field_107[field_237] * field_113 + 1];
               field_243 = (short)field_114[field_107[field_237] * field_113 + 2];
            } else if (field_14 == 18) {
               if (var5 > field_106[field_98 * 13 + 5] - 1) {
                  return;
               }

               field_237 = (short)(var5 * 2 + field_106[field_98 * 13 + 4]);
               field_238 = (short)field_114[field_107[field_237] * field_113];
               field_239 = (short)field_107[field_237 + 1];
               field_244 = true;
               field_240 = (short)field_114[field_107[field_237] * field_113 + 1];
               field_243 = (short)field_114[field_107[field_237] * field_113 + 2];
            } else {
               if (var5 > method_10(field_98) - 1) {
                  return;
               }

               field_237 = (short)(var5 * 2 + method_9(field_98));
               method_151((short)field_107[field_237], (short)field_107[field_237 + 1], field_177, field_178, field_179);
            }

            field_245 = true;
            field_241 = field_14;
            field_15 = 16;
            return;
         case 3:
            if (field_123 < field_67 / 2) {
               if (field_223 == null || field_223.length == 0) {
                  return;
               }

               field_227 = (byte)(field_216 + (field_217 + field_19) * field_215);
               if (field_227 * 2 > field_223.length - 1) {
                  return;
               }

               var1 = field_223[field_227 * 2];
               field_239 = (short)field_223[field_227 * 2 + 1];
            } else {
               if (field_224 == null || field_224.length == 0) {
                  return;
               }

               field_227 = (byte)(field_216 - field_215 + (field_217 + field_20) * field_215);
               if (field_227 * 2 > field_224.length - 1) {
                  return;
               }

               var1 = field_224[field_227 * 2];
               field_239 = (short)field_224[field_227 * 2 + 1];
            }

            if (field_225 == 0) {
               method_151((short)var1, field_239, (byte)1, (byte)1, (byte)1);
            } else {
               field_238 = (short)field_114[var1 * field_113];
               field_240 = (short)field_114[var1 * field_113 + 1];
               field_243 = (short)field_114[var1 * field_113 + 2];
            }

            field_241 = 3;
            field_15 = 16;
            return;
         case 4:
         case 8:
         case 9:
         case 16:
         case 21:
         default:
            break;
         case 5:
            if (field_228 == 1) {
               if (field_229 > 0) {
                  --field_229;
               }
            } else if (field_226 == 0 && field_229 < field_223[field_227 * 2 + 1] || field_226 == 1 && field_229 < field_224[field_227 * 2 + 1] && field_230 * (field_229 + 1) <= field_94) {
               if (field_226 == 0 && field_229 == field_223[field_227 * 2 + 1] - 1 && field_223.length == 2 && field_225 == 0) {
                  field_15 = 7;
                  field_17 = method_53(287, 240 - 3 * field_54);
                  field_241 = 5;
               } else {
                  ++field_229;
                  if (field_246 + field_229 > 120) {
                     field_229 = (byte)(120 - field_246);
                  }
               }
            }

            field_231 = (short)(field_229 * field_230);
            return;
         case 6:
            if (field_32) {
               if (field_33 == 18 && method_120(-1, field_125, field_126) != 100) {
                  return;
               }

               field_32 = false;
               field_31 = true;
               field_203 = 0;
               if (field_33 != 19 && field_33 != 20) {
                  class_0.method_5(6);
                  return;
               }

               class_0.method_5(7);
               return;
            }

            if (!field_91 && (field_110[field_27] & 7) == 0 && field_247 != field_27) {
               var0 = field_119[field_27 * 2];
               var1 = field_112[var0 * field_111 + 6];
               byte var6 = field_112[var0 * field_111 + 4];
               if (Math.abs(field_125 - field_120[field_27 * 2]) + Math.abs(field_126 - field_120[field_27 * 2 + 1]) <= var1) {
                  if (field_76[field_125][field_126] == 0 && method_120(field_23, field_125, field_126) >= 100) {
                     return;
                  }

                  field_93 = true;
                  field_26 = method_96(field_72, field_76, field_120[field_27 * 2], field_120[field_27 * 2 + 1], (byte)field_125, (byte)field_126);
                  if (field_26 != null) {
                     field_247 = field_27;
                     field_248 = System.currentTimeMillis();
                     field_91 = true;
                     field_110[field_27] = 1;
                     return;
                  }
               } else if (var6 > 0) {
                  field_175 = 0;
                  field_26 = null;
                  field_91 = false;
                  short var7;
                  if ((var7 = method_120(field_23, field_125, field_126)) < 100) {
                     field_247 = field_27;
                     field_248 = System.currentTimeMillis();
                     field_28 = var7;
                     field_110[field_27] = 2;
                     field_30 = true;
                     class_0.method_5(5);
                     return;
                  }
               }
            }
            break;
         case 7:
         case 11:
            field_15 = field_241;
            if (field_241 == 0 && field_23 != 0) {
               method_118();
               return;
            }
            break;
         case 13:
            if (field_122 == 0) {
               field_237 = method_120(-1, field_125, field_126);
               if (field_237 != 100) {
                  var0 = field_112[field_119[field_237 * 2] * field_111 + 2];
                  method_151(field_119[field_237 * 2], (short)((field_119[field_237 * 2 + 1] + var0 - 1) / var0), field_177, field_178, field_179);
                  field_241 = 6;
                  field_15 = 16;
                  return;
               }
            } else {
               if (field_122 == 1) {
                  field_15 = 18;
                  field_236 = 6;
                  return;
               }

               if (field_122 == 2) {
                  if (!field_204) {
                     method_155(2);
                     field_23 = field_166;
                     if (field_23 != 0) {
                        method_118();
                     }

                     field_15 = 0;
                     return;
                  }

                  method_59((short)181, (short)6, true);
                  return;
               }

               if (field_122 == 3) {
                  field_15 = 6;
                  method_119();
                  field_49 = field_120[field_27 * 2];
                  field_50 = field_120[field_27 * 2 + 1];
                  return;
               }
            }
            break;
         case 14:
            int[] var2;
            int var3 = ((var2 = method_132(field_82, 2))[3] - var2[1]) / method_48() - 1;
            if (field_211 == 0) {
               if (field_209 < field_17.length - var3 - 1) {
                  field_209 = (short)(field_209 + var3);
               } else {
                  ++field_211;
               }

               field_212 = true;
               return;
            }

            field_101 = field_208[field_210];
            return;
         case 15:
            if (field_122 == 0) {
               field_15 = 4;
               return;
            }

            if (field_122 == 1) {
               field_15 = 2;
               return;
            }

            if (field_122 == 2) {
               field_15 = 18;
               field_236 = 0;
               return;
            }

            if (field_122 == 3) {
               field_15 = 17;
               return;
            }

            if (field_122 == 4) {
               field_15 = 21;
               return;
            }

            if (field_122 == 5) {
               field_8 = true;
               method_17(5);
               method_17(2);
               method_17(8);
               field_15 = 0;
               return;
            }

            if (field_122 == 6) {
               field_200 = true;
               field_15 = 0;
               return;
            }
            break;
         case 19:
            if (field_122 == 0) {
               field_15 = 16;
               return;
            }

            if (field_122 == 1) {
               if (field_241 == 18 && field_236 == 6) {
                  field_33 = (short)field_107[field_237];
                  if (field_239 == 1) {
                     method_82(field_107[field_237], 1, 2);
                  } else {
                     --field_107[field_237 + 1];
                  }

                  field_32 = true;
                  field_15 = (short)field_236;
                  return;
               }

               field_15 = 16;
               return;
            }

            if (field_122 == 2) {
               if (field_241 == 17 && field_106[field_98 * 13 + 1] == 1) {
                  field_15 = 7;
                  field_17 = method_53(287, 240 - 3 * field_54);
                  return;
               }

               if (field_241 == 2) {
                  field_15 = 7;
                  field_17 = method_53(199, 240 - 3 * field_54);
                  field_241 = 2;
                  return;
               }

               if (field_241 == 18) {
                  method_82(field_107[field_237], 1, 2);
               } else if (field_241 == 17) {
                  method_83(field_237, 1);
               }

               field_15 = field_241;
               return;
            }
            break;
         case 20:
            if (field_122 == 0) {
               method_17(7);
               field_106[field_98 * 13 + 12] = (short)((byte)field_71);

               try {
                  method_162();
               } catch (Exception var4) {
               }

               method_59((short)299, (short)0, true);
            }

            if (field_122 == 1) {
               if (!method_164("GAME")) {
                  method_59((short)218, (short)0, true);
                  return;
               }

               method_17(7);
               method_163();
               field_16 = field_106[field_98 * 13 + 12];
            }

            if (field_122 == 2) {
               method_17(5);
               method_17(7);
               field_106[field_98 * 13 + 12] = (short)((byte)field_71);
               field_15 = 1;
               return;
            }
            break;
         case 22:
            if (field_122 == 0) {
               field_168 = true;
               field_246 = 0;
            }

            field_15 = 5;
      }

   }

   // $FF: renamed from: g (int) void
   public static final void method_155(int var0) {
      byte[] var1 = new byte[10];
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < method_10(field_98); ++var4) {
         if (field_119[var4 * 2 + 1] > 0) {
            var1[(var4 - var3) * 2] = (byte)field_119[var4 * 2];
            byte var5 = field_112[field_119[var4 * 2] * field_111 + 2];
            int var6 = (field_119[var4 * 2 + 1] + var5 - 1) / var5;
            var1[(var4 - var3) * 2 + 1] = (byte)(var6 > 1 ? var6 / var0 : var6);
            ++var2;
         } else {
            ++var3;
         }
      }

      field_107 = method_80(field_107, method_76(var1, var2 * 2), method_9(field_98), method_10(field_98), 2);
      method_84(field_98, (var2 - method_10(field_98)) * 2, 0);
   }

   public class_1() {
      this.setFullScreenMode(true);
   }

   public final void showNotify() {
      field_7 = true;
      method_161();
   }

   public final void hideNotify() {
   }

   // $FF: renamed from: d (int, int) int
   public static final int method_156(int var0, int var1) {
      byte[] var2 = field_249[var1];

      for(int var3 = 0; var3 < var2.length; var3 += 2) {
         if (var2[var3] == var0) {
            return var2[var3 + 1];
         }
      }

      return 0;
   }

   // $FF: renamed from: d (int) int
   public static final int method_157(int var0) {
      int var1;
      return (var1 = method_156(var0, 0)) != 0 ? var1 : method_156(var0, 1);
   }

   // $FF: renamed from: h (int) void
   public static final void method_158(int var0) {
      field_250 = var0;
      (new Thread(field_6)).start();

      while(field_250 != 0) {
         Thread.yield();
      }

   }

   public final void run() {
      int var1 = field_250;
      field_250 = 0;
      Thread.currentThread().setPriority(1);

      for(; !class_2.field_256; Thread.yield()) {
         switch (var1) {
            case -2:
               synchronized(this) {
                  if (field_251) {
                     ++field_252;

                     try {
                        switch (field_252) {
                           case 0:
                              method_165();
                              continue;
                           case 1:
                              method_45(0);
                              continue;
                           case 2:
                              method_41(0);
                              continue;
                           case 3:
                              method_42();
                              continue;
                           case 4:
                              method_24();
                              continue;
                           case 5:
                              method_29(0);
                              continue;
                           case 6:
                              method_29(1);
                              continue;
                           case 7:
                              field_73 = method_28("m3.tmp");
                              continue;
                           case 8:
                              field_74 = method_28("m1.tmp");
                              continue;
                           case 9:
                              field_75 = method_28("m2.tmp");
                              continue;
                           case 10:
                              field_80 = Image.createImage(field_134, field_135);
                              field_81 = field_80.getGraphics();
                              field_7 = true;
                              continue;
                           case 11:
                              method_161();
                        }
                     } catch (Exception var8) {
                     }
                  }
                  break;
               }
            case -1:
               synchronized(this) {
                  this.repaint();
                  this.serviceRepaints();

                  try {
                     Thread.sleep(10L);
                  } catch (InterruptedException var6) {
                  }
               }
         }
      }

   }

   // $FF: renamed from: a (java.io.ByteArrayOutputStream, java.lang.String) void
   public static final void method_159(ByteArrayOutputStream var0, String var1) {
      try {
         RecordStore var2 = RecordStore.openRecordStore(var1, true);

         try {
            var2.setRecord(1, var0.toByteArray(), 0, var0.size());
         } catch (RecordStoreException var4) {
            var2.addRecord(var0.toByteArray(), 0, var0.size());
         }

         var2.closeRecordStore();
      } catch (RecordStoreException var5) {
      }
   }

   // $FF: renamed from: r () void
   public static final void method_160() {
      try {
         ByteArrayOutputStream var0 = new ByteArrayOutputStream();
         DataOutputStream var1;
         (var1 = new DataOutputStream(var0)).writeBoolean(class_0.field_0);
         var1.writeBoolean(class_0.field_1);
         var1.writeByte(field_11);
         var1.writeByte(field_12);
         method_159(var0, "SETT");
      } catch (IOException var2) {
      }
   }

   // $FF: renamed from: s () void
   public static final void method_161() {
      if (method_164("SETT")) {
         RecordStore var0 = null;

         try {
            var0 = RecordStore.openRecordStore("SETT", false);
            DataInputStream var1;
            class_0.method_1((var1 = new DataInputStream(new ByteArrayInputStream(var0.getRecord(1)))).readBoolean());
            class_0.method_7(var1.readBoolean());
            field_11 = (short)var1.readByte();
            field_12 = (short)var1.readByte();
            var0.closeRecordStore();
            return;
         } catch (Exception var2) {
         }
      }

   }

   // $FF: renamed from: t () void
   public static final void method_162() {
      try {
         ByteArrayOutputStream var0 = new ByteArrayOutputStream();
         DataOutputStream var1;
         (var1 = new DataOutputStream(var0)).writeInt(field_201);
         var1.writeInt(field_202);
         var1.writeByte(field_191.length);
         var1.write(field_191);
         var1.writeShort(field_94);
         var1.writeShort(field_96);
         var1.writeByte(field_95);
         var1.writeShort(field_97);
         var1.writeShort(field_116.length);
         var1.write(field_116);
         var1.writeShort(field_115.length);
         var1.write(field_115);
         short var2 = (short)(field_106.length / 13);
         var1.writeShort(var2);
         field_106[field_98 * 13 + 12] = (short)((byte)field_71);

         int var3;
         for(var3 = 0; var3 < 13; ++var3) {
            var1.writeByte(field_106[var3]);
         }

         for(var3 = 1; var3 < var2; ++var3) {
            var1.writeShort(field_106[var3 * 13]);
            var1.writeShort(field_106[var3 * 13 + 1]);
            var1.writeShort(field_106[var3 * 13 + 2]);
            var1.writeShort(field_106[var3 * 13 + 3]);
            var1.writeShort(field_106[var3 * 13 + 4]);
            var1.writeShort(field_106[var3 * 13 + 5]);
            var1.writeShort(field_106[var3 * 13 + 11]);
            var1.writeShort(field_106[var3 * 13 + 12]);
         }

         var1.writeShort(field_107.length);
         var1.write(field_107);
         method_159(var0, "GAME");
      } catch (IOException var4) {
      }
   }

   // $FF: renamed from: u () void
   public static final void method_163() {
      if (method_164("GAME")) {
         method_42();
         RecordStore var0 = null;

         try {
            var0 = RecordStore.openRecordStore("GAME", false);
            DataInputStream var1;
            field_201 = (var1 = new DataInputStream(new ByteArrayInputStream(var0.getRecord(1)))).readInt();
            field_202 = var1.readInt();
            field_191 = new byte[var1.readByte()];
            var1.read(field_191);
            field_94 = var1.readShort();
            field_96 = var1.readShort();
            field_95 = var1.readByte();
            field_97 = var1.readShort();
            short var2 = var1.readShort();
            field_116 = method_31(var1, var2);
            var2 = var1.readShort();
            field_115 = method_31(var1, var2);
            var2 = var1.readShort();

            int var3;
            for(var3 = 0; var3 < 13; ++var3) {
               field_106[var3] = (short)var1.readByte();
            }

            for(var3 = 1; var3 < var2; ++var3) {
               field_106[var3 * 13] = var1.readShort();
               field_106[var3 * 13 + 1] = var1.readShort();
               field_106[var3 * 13 + 2] = var1.readShort();
               field_106[var3 * 13 + 3] = var1.readShort();
               field_106[var3 * 13 + 4] = var1.readShort();
               field_106[var3 * 13 + 5] = var1.readShort();
               field_106[var3 * 13 + 11] = var1.readShort();
               field_106[var3 * 13 + 12] = var1.readShort();
            }

            var2 = var1.readShort();
            field_107 = method_31(var1, var2);
            var0.closeRecordStore();
            return;
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      }

   }

   // $FF: renamed from: a (java.lang.String) boolean
   public static final boolean method_164(String var0) {
      try {
         RecordStore.openRecordStore(var0, false).closeRecordStore();
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   // $FF: renamed from: v () void
   public static final void method_165() {
      try {
         field_254 = new class_0[10];

         for(int var0 = 0; var0 < 10; ++var0) {
            try {
               field_254[var0] = new class_0(var0 + ".mid");
            } catch (Exception var2) {
            }
         }

      } catch (Exception var3) {
      }
   }

   static {
      field_53 = field_51 * field_52;
      field_54 = 8;
      field_55 = 8;
      field_56 = 16;
      field_57 = 16;
      field_58 = field_54;
      field_59 = field_55;
      field_60 = field_54 * 2;
      field_61 = 240 - field_54 * 8;
      field_62 = field_60;
      field_63 = null;
      field_64 = null;
      field_65 = null;
      field_66 = null;
      field_67 = 239 / field_58 + 3;
      field_68 = (320 - field_57 - 1) / field_59 + 3;
      field_69 = new int[field_67];
      field_70 = new int[field_68];
      field_71 = 12;
      field_72 = new byte[17][17];
      field_73 = new byte[2][16];
      field_74 = new byte[1][16];
      field_75 = new byte[2][16];
      field_76 = new byte[17][17];
      field_77 = 0;
      field_78 = 0;
      field_79 = 0;
      field_82 = new byte[0];
      field_83 = new byte[0];
      field_84 = new byte[0];
      field_85 = new byte[0];
      field_86 = new byte[0];
      field_87 = 0;
      field_88 = true;
      field_89 = 0L;
      field_90 = 0L;
      field_91 = false;
      field_92 = false;
      field_93 = false;
      field_94 = 1000;
      field_95 = 1;
      field_96 = 0;
      field_97 = 250;
      field_98 = 0;
      field_99 = 1;
      field_100 = 1;
      field_101 = -1;
      field_111 = 9;
      field_113 = 4;
      field_115 = new byte[11];
      field_116 = new byte[16];
      field_122 = 0;
      field_123 = 0;
      field_124 = 0;
      field_125 = 0;
      field_126 = 0;
      field_127 = new int[]{0, 0, 240, 320};
      field_128 = new int[]{0, field_55 * 2 + 2, 240, 320 - field_55 * 2};
      field_129 = new int[]{0, field_55, 240, 320 - field_55};
      field_130 = new int[]{0, 0, 240 + field_56, 320};
      field_131 = new int[]{0, field_55 * 2 - 2, 240, 320 - field_55};
      field_132 = field_127;
      field_133 = new byte[]{0, 1, 6, 5, 9, 7, 17, 15, 4, 3, 2, 16, 4, 13, 11, 12, 10, 8, 6, 14, 14, 3, 18};
      field_134 = field_67 * field_58;
      field_135 = field_68 * field_59;
      field_136 = new byte[]{6, 18, 30, 20, 8, 69, 72, 78};
      field_137 = new byte[]{12, 14, 24, 26, 32, 34, 36, 70, 73, 79};
      field_138 = new byte[]{13, 15, 25, 27, 33, 35, 37, 71, 74, 80};
      field_139 = new byte[]{10, 16};
      field_140 = new byte[]{11, 29};
      field_141 = null;
      field_142 = new short[]{6, 7, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 168, 169, 170, 171, 172, 173, 181, 182};
      field_143 = new short[]{0, 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 100, 176, 177, 178, 179, 180, 188, 189, 190, 191};
      field_144 = new int[]{59139641, 120751204, 3511862, 418649, 73892727};
      field_145 = new int[]{268435455, 268435455, 268435455, 268435455, 268435455};
      field_146 = -1;
      field_147 = 0L;
      field_148 = -235;
      field_149 = -1;
      field_150 = new Image[14];
      field_155 = new int[]{31, 1, 0};
      field_164 = 0L;
      field_165 = true;
      field_166 = 0;
      field_167 = false;
      field_168 = false;
      field_169 = 0L;
      field_170 = 0L;
      field_171 = 0;
      field_172 = 0;
      field_173 = 0;
      field_174 = 0;
      field_175 = 0;
      field_176 = false;
      field_177 = 1;
      field_178 = 1;
      field_179 = 1;
      field_180 = 0;
      field_181 = 0;
      field_182 = 1;
      field_183 = false;
      field_184 = 0;
      field_185 = 0;
      field_186 = 0;
      field_187 = false;
      field_188 = false;
      field_189 = false;
      field_190 = false;
      field_191 = null;
      field_192 = 0;
      field_193 = 0;
      field_194 = 0;
      field_195 = 0;
      field_196 = 0;
      field_197 = false;
      field_198 = false;
      field_199 = false;
      field_200 = false;
      field_201 = 0;
      field_202 = -1;
      field_203 = 0;
      field_204 = false;
      field_205 = false;
      field_206 = -1;
      field_207 = null;
      field_208 = null;
      field_209 = 0;
      field_210 = 0;
      field_211 = 0;
      field_212 = false;
      field_213 = false;
      field_214 = 6;
      field_215 = 3;
      field_216 = 0;
      field_217 = 0;
      field_218 = 0;
      field_219 = false;
      field_220 = 3;
      field_221 = 0;
      field_222 = 0;
      field_226 = 0;
      field_227 = 0;
      field_228 = 0;
      field_229 = 0;
      field_230 = 0;
      field_231 = 0;
      field_232 = 0;
      field_233 = 0;
      field_234 = 0;
      field_235 = 0;
      field_236 = 0;
      field_245 = false;
      field_246 = 0;
      field_247 = 0;
      field_248 = 0L;
      field_249 = new byte[][]{{-3, 2, -4, 5, -1, 1, -2, 6, -6, 120, -7, 121, -5, 8}, {(byte)(field_5 ? 51 : 52), 2, (byte)(field_5 ? 56 : 54), 5, 50, 1, (byte)(field_5 ? 57 : 50), 1, (byte)(field_5 ? 55 : 56), 6, (byte)(field_5 ? 52 : 56), 6, 53, 8}};
      field_250 = 0;
      field_251 = false;
      field_252 = -1;
      field_253 = 0L;
      field_254 = null;
   }
}
