package javainterop



object JvmStaticUses {

  // When @JvmStatic is present, then a property or function
  // of an `object` will be attached to its class as a static
  // member.
  // Example: `JvmStaticUses.myStaticFunction()`
  @JvmStatic
  fun myStaticFunction() {
    // do something
  }

  // When @JvmStatic is NOT present, then a property or function
  // of an `object` will be attached to the `INSTANCE` of the
  // `object` class.
  // Example: `JvmStaticUses.INSTANCE.myOtherFunction()`
  fun myOtherFunction() {
    // do something
  }
}
