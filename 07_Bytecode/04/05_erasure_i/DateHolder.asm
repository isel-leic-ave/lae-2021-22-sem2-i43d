Compiled from "erasure.kt"
public final class DateHolder implements Holder<java.util.Date> {
  private final java.util.Date value;

  public DateHolder(java.util.Date);
    Code:
       0: aload_1
       1: ldc           #12                 // String value
       3: invokestatic  #18                 // Method kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: invokespecial #21                 // Method java/lang/Object."<init>":()V
      10: aload_0
      11: aload_1
      12: putfield      #24                 // Field value:Ljava/util/Date;
      15: return

  public java.util.Date getData();
    Code:
       0: aload_0
       1: getfield      #24                 // Field value:Ljava/util/Date;
       4: areturn

  public java.lang.Object getData();
    Code:
       0: aload_0
       1: invokevirtual #31                 // Method getData:()Ljava/util/Date;
       4: areturn
}
