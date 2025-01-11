```scala
class MyClass[T](val value: T) {
  def this() = this(null.asInstanceOf[T]) // Implicit null conversion
}

val instance = new MyClass[String]()
println(instance.value) // Prints null

val anotherInstance = new MyClass[Int]()
println(anotherInstance.value) // Throws a ClassCastException at runtime
```