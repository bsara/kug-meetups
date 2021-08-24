package javainterop



class HasJvmOverloads @JvmOverloads constructor(
  var myProp0: Int,
  var myProp1: Boolean,
  var myProp2: String? = null,
  var myProp3: String? = null
) {
  @JvmOverloads
  fun overloadedFunction(blah: Int, blee: Boolean = true) {
    // do something
  }
}



class NoJvmOverloads(
  var myProp0: Int,
  var myProp1: Boolean,
  var myProp2: String? = null,
  var myProp3: String? = null
) {
  fun overloadedFunction(blah: Int, blee: Boolean = true) {
    // do something
  }
}
