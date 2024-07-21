import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

// $FF: renamed from: M
public final class class_2 extends MIDlet {
   // $FF: renamed from: a M
   public static class_2 field_255;
   // $FF: renamed from: a boolean
   public static boolean field_256 = false;
   // $FF: renamed from: b boolean
   public static boolean field_257 = false;

   public class_2() {
      field_255 = this;
   }

   public final void startApp() {
      class_1.field_13 = (short)((byte)(class_1.method_164("GAME") ? 1 : 0));
      if (!field_257) {
         class_1.field_90 = System.currentTimeMillis();
         class_1.method_158(-1);
         class_1.method_158(-2);
         field_257 = true;
      } else {
         class_1.field_6.showNotify();
      }

      Display.getDisplay(this).setCurrent(class_1.field_6);
   }

   public final void pauseApp() {
      this.notifyPaused();
   }

   public final void destroyApp(boolean var1) {
      try {
         field_256 = true;
         this.notifyDestroyed();
      } catch (Exception var3) {
      }
   }
}
