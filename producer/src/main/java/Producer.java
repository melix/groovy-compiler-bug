import com.google.gson.Gson;

public class Producer {
   // this field is private, it shouldn't leak into the public API
   private Gson gson;

   public void foo() {
   }
}
