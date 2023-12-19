class Calculator extends Operation {
  override def sum(a: Float, b: Float): Float = a + b

  override def sub(a: Float, b: Float): Float = a - b

  override def mult(a: Float, b: Float): Float = a * b

  override def div(a: Float, b: Float): Float = a / b
}
