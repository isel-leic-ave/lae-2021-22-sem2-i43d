Compiled from "erasure.kt"
public final class ErasureKt {
  public static final void main();
    Code:
       0: new           #8                  // class StringHolder
       3: dup
       4: ldc           #10                 // String LAE/LEIC43D
       6: invokespecial #14                 // Method StringHolder."<init>":(Ljava/lang/String;)V
       9: checkcast     #16                 // class Holder
      12: astore_0
      13: new           #18                 // class DateHolder
      16: dup
      17: new           #20                 // class java/util/Date
      20: dup
      21: invokespecial #22                 // Method java/util/Date."<init>":()V
      24: invokespecial #25                 // Method DateHolder."<init>":(Ljava/util/Date;)V
      27: checkcast     #16                 // class Holder
      30: astore_1
      31: aload_0
      32: invokeinterface #29,  1           // InterfaceMethod Holder.getData:()Ljava/lang/Object;
      37: checkcast     #31                 // class java/lang/String
      40: astore_2
      41: aload_1
      42: invokeinterface #29,  1           // InterfaceMethod Holder.getData:()Ljava/lang/Object;
      47: checkcast     #20                 // class java/util/Date
      50: astore_3
      51: getstatic     #37                 // Field java/lang/System.out:Ljava/io/PrintStream;
      54: aload_2
      55: invokevirtual #43                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      58: getstatic     #37                 // Field java/lang/System.out:Ljava/io/PrintStream;
      61: aload_3
      62: invokevirtual #43                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      65: return

  public static void main(java.lang.String[]);
    Code:
       0: invokestatic  #53                 // Method main:()V
       3: return
}
