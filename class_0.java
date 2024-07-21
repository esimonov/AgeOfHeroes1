import java.io.InputStream;
import javax.microedition.lcdui.Display;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;

// $FF: renamed from: a
public final class class_0 {
   // $FF: renamed from: a boolean
   public static boolean field_0 = true;
   // $FF: renamed from: b boolean
   public static boolean field_1 = true;
   // $FF: renamed from: a javax.microedition.media.Player
   private Player field_2;
   // $FF: renamed from: a int
   private int field_3;
   // $FF: renamed from: a a
   private static class_0 field_4 = null;

   // $FF: renamed from: a () boolean
   public static final synchronized boolean method_0() {
      return field_0;
   }

   // $FF: renamed from: a (boolean) void
   public static final void method_1(boolean var0) {
      method_2();
      field_0 = var0;
   }

   public class_0() {
      this.field_2 = null;
   }

   public class_0(String var1) {
      this(var1, 0);
   }

   public class_0(String var1, int var2) {
      this.field_2 = null;
      InputStream var3 = this.getClass().getResourceAsStream(var1);

      try {
         String var4 = "audio/midi";
         if (var1.endsWith(".amr")) {
            var4 = "audio/amr";
         }

         this.field_2 = Manager.createPlayer(var3, var4);
         this.field_2.prefetch();
      } catch (Exception var5) {
      }

      this.field_3 = var2;
   }

   // $FF: renamed from: a () void
   public static final void method_2() {
      if (field_4 != null) {
         field_4.method_3();
         field_4 = null;
      }

   }

   // $FF: renamed from: b () void
   public final void method_3() {
      if (this.field_2 != null) {
         try {
            if (this.field_2.getState() == 400) {
               this.field_2.stop();
            }

            return;
         } catch (Exception var2) {
         }
      }

   }

   // $FF: renamed from: c () void
   public final void method_4() {
      if (field_0) {
         if (this.field_2 == null) {
            return;
         }

         if (field_4 != null && field_4.field_2 != null && field_4.field_2.getState() == 400 && field_4.field_3 > this.field_3) {
            return;
         }

         method_2();

         try {
            this.field_2.start();
            field_4 = this;
         } catch (Exception var2) {
         }
      }

      if (field_1) {
         method_8();
      }
   }

   // $FF: renamed from: a (int) void
   public static final void method_5(int var0) {
      try {
         class_1.field_254[var0].method_4();
      } catch (Exception var2) {
      }
   }

   // $FF: renamed from: b () boolean
   public static final boolean method_6() {
      return field_1;
   }

   // $FF: renamed from: b (boolean) void
   public static final void method_7(boolean var0) {
      field_1 = var0;
   }

   // $FF: renamed from: d () void
   public static final void method_8() {
      if (field_1) {
         try {
            Display.getDisplay(class_2.field_255).vibrate(500);
         } catch (Exception var1) {
            field_1 = false;
         }
      }
   }
}
