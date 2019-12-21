import groovy.transform.CompileStatic

@CompileStatic
class Consumer {
   void doSomething(Producer producer) {
      // this shouldn't trigger a compile error
      producer.foo()
   }

}
