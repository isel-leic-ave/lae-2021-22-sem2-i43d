Compiled from "erasure.kt"
public final class StringHolder implements Holder<java.lang.String> {
  private final java.lang.String value;

  public StringHolder(java.lang.String);
    Code:
       0: aload_1
       1: ldc           #12                 // String value
       3: invokestatic  #18                 // Method kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: invokespecial #21                 // Method java/lang/Object."<init>":()V
      10: aload_0
      11: aload_1
      12: putfield      #24                 // Field value:Ljava/lang/String;
      15: return

  public java.lang.String getData();
    Code:
       0: aload_0
       1: getfield      #24                 // Field value:Ljava/lang/String;
       4: areturn

  public java.lang.Object getData();
    Code:
       0: aload_0
       1: invokevirtual #31                 // Method getData:()Ljava/lang/String;
       4: areturn
}
