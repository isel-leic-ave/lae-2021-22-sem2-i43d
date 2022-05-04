Compiled from "erasure.kt"
public class ValueHolder<T> implements Holder<T> {
  private final T value;

  public ValueHolder(T);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field value:Ljava/lang/Object;
       9: return

  public T getData();
    Code:
       0: aload_0
       1: getfield      #17                 // Field value:Ljava/lang/Object;
       4: areturn
}
