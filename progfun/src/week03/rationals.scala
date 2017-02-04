package week03

trait Planar {
  def x: Int = 0
  def y: Int = 10
  def surface = x * y
}

class Rational(x: Int, y: Int) {
	// require is used to check for pre-conditions
	require(y != 0, "Denominator cannot be zero")
	
	// when "this" is used as function identifier, it means its a constructor(ctor)
	// here, this additional ctor calls the default ctor
	def this(x: Int) = this(x, 1)
	
  private def gcd(a: Int, b: Int): Int = { if (b == 0) a else gcd(b, a % b) }
  
  def numer = x
  def denom = y

  def < (that: Rational) =
    numer * that.denom < that.numer * denom

  def max(that: Rational) =
    if (this < that) that else this

  def + (that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def - (that: Rational) = this + -that

  def unary_- () = new Rational(-numer, denom)

  override def toString = {
   val g = gcd(x, y)
   numer / g + "/" + denom / g
   }
}