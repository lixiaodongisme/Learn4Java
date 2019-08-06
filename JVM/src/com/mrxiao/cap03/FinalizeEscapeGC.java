package com.mrxiao.cap03;
/*
* 代码说明了两点：
* 1.对象可以在被GC时自我拯救
* 2.这种自救的机会只有一次，因为一个对象的finalize()方法最多只会被系统调用一次
* */
public class FinalizeEscapeGC {
   public static FinalizeEscapeGC SAVA_HOOK = null;

   public void isAlive() {
      System.out.println("yes, I'm still alive");
   }

   @Override
   protected void finalize() throws Throwable {
      super.finalize();
      System.out.println("finalize method executed!");
      FinalizeEscapeGC.SAVA_HOOK = this;
   }

   public static void main(String[] args) throws InterruptedException {
      SAVA_HOOK = new FinalizeEscapeGC();

      // 对象第一次拯救自己
      SAVA_HOOK = null;
      System.gc();
      // 因为finalize优先级很低，所以暂停0.5秒等待它
      Thread.sleep(500);
      if (SAVA_HOOK != null) {
         SAVA_HOOK.isAlive();
      } else {
         System.out.println("no, I'm dead");
      }

      // 以下代码与上面的完全相同，但是对象自救失败了。原因是任何一个对象的finalize方法都只会被系统调用一次
      SAVA_HOOK = null;
      System.gc();
      // 因为finalize优先级很低，所以暂停0.5秒等待它
      Thread.sleep(500);
      if (SAVA_HOOK != null) {
         SAVA_HOOK.isAlive();
      } else {
         System.out.println("no, I'm dead");
      }
   }
}
