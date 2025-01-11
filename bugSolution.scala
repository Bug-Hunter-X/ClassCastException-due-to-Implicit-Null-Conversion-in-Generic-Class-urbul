```scala
class MyClass[T](val value: T) {
  def this(value: T) = this(value)  //Removed aux constructor 
}

val instance = new MyClass[String]("Hello")
println(instance.value) // Prints Hello

//To handle potential nulls, you can make T nullable:
class MyClass2[T](val value: T) 

val anotherInstance = new MyClass2[Int](10) // this is ok 
println(anotherInstance.value) 

val anotherInstanceNull = new MyClass2[Int](null) // This will cause a NullPointerException, better handled with Option 

// or use Option[T] to handle nulls gracefully:
class MyClass3[T](val value: Option[T])

val safeInstance = new MyClass3[Int](Some(10))
println(safeInstance.value.getOrElse(0)) //Prints 10
val safeNullInstance = new MyClass3[Int](None)
println(safeNullInstance.value.getOrElse(0)) // Prints 0
```