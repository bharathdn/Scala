package week02

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  val x = new Rational(1, 3);System.out.println("""x  : week02.Rational = """ + $show(x ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(30); 

  val y = new Rational(5, 7);System.out.println("""y  : week02.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : week02.Rational = """ + $show(z ));$skip(13); val res$2 = 

  x - y - z;System.out.println("""res2: week02.Rational = """ + $show(res$2));$skip(8); val res$3 = 
  y + y;System.out.println("""res3: week02.Rational = """ + $show(res$3));$skip(8); val res$4 = 
  x - y;System.out.println("""res4: week02.Rational = """ + $show(res$4));$skip(11); val res$5 = 
  x.max(y);System.out.println("""res5: week02.Rational = """ + $show(res$5));$skip(18); val res$6 = 
  new Rational(3);System.out.println("""res6: week02.Rational = """ + $show(res$6))}
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
