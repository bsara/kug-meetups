package javainterop;



public class JavaInteropExamples {

  public void jvmNameExamples() {
    NoJvmNameKt.blah();

    // `StringUtils` is actually `HasJvmName.kt` and `join`
    // is named `joinString` in Kotlin.
    StringUtils.join();
  }


  public void jvmStaticUses() {
    JvmStaticUses.myStaticFunction();
    JvmStaticUses.INSTANCE.myOtherFunction();
  }


  public void jvmOverloadsUses() {
    HasJvmOverloads hasOverloads0 = new HasJvmOverloads(42, false);
    HasJvmOverloads hasOverloads1 = new HasJvmOverloads(42, false, "blah");
    HasJvmOverloads hasOverloads2 = new HasJvmOverloads(42, false, "blah", "blee");
    hasOverloads0.overloadedFunction(72);
    hasOverloads0.overloadedFunction(72, false);

    // Since @JvmOverloads isn't used on the constructor, all parameters
    // are always required.
    NoJvmOverloads noOverloads = new NoJvmOverloads(42, false, "blah", "blee");

    // Since @JvmOverloads isn't used on the function, all parameters
    // are always required.
    noOverloads.overloadedFunction(72, false);
  }


  public void kotlinProperties() {
    PropertiesExample propsEx = new PropertiesExample(true);

    propsEx.setMutableProp(42);
    propsEx.getMutableProp();

    // No `setImmutableProp` method exists because it is declared as `val` in Kotlin.
    propsEx.getImmutableProp();

    PropertiesExampleUtils.setMutableStaticProp(42);
    PropertiesExampleUtils.getMutableStaticProp();

    // No `setImmutableStaticProp` method exists because it is declared as `val` in Kotlin.
    PropertiesExampleUtils.getImmutableStaticProp();
  }


  public void throwsExample() {
    try {
      ThrowsExampleKt.throwsExample();
    } catch(Exception ex) {
      // Required to handle Exception because it is in the @Throws of `ThrowsExampleKt.throwsExample`.
    }
  }
}
