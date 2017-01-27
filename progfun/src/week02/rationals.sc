package week02

object rationals {
  val x = new Rational(1, 3)                      //> x  : week02.Rational = 1/3
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3

  val y = new Rational(5, 7)                      //> y  : week02.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : week02.Rational = 3/2
	
	x.sub(y).sub(z)                           //> res2: week02.Rational = -79/42
  y.add(y)                                        //> res3: week02.Rational = 10/7
}

class Rational(x: Int, y: Int) {
	private def gcd(a: Int, b: Int): Int = { if(b == 0) a else gcd(b, a % b) }
	private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def sub(that: Rational) = add(that.neg)

  def neg() = new Rational(-numer,  denom)

  override def toString = numer + "/" + denom

}