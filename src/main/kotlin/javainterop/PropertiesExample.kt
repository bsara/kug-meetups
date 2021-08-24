@file:JvmName("PropertiesExampleUtils")

package javainterop

import org.jetbrains.annotations.NotNull



class PropertiesExample(
  val immutableProp: Boolean
) {

  @field:NotNull // Use if you need to put an annotation on only the field and not the getters/setters that are generated at compilation.
  @set:NotNull // Used if you need to put an annotation on only the setter that is generated at compilation.
  @get:NotNull // Used if you need to put an annotation on only the getter that is generated at compilation.
  var mutableProp: Int = -1
}


var mutableStaticProp: Int = -1
val immutableStaticProp: Boolean = false
