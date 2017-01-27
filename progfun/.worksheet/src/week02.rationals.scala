package week02

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  val x = new Rational(1, 3);System.out.println("""x  : week02.Rational = """ + $show(x ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(30); 

  val y = new Rational(5, 7);System.out.println("""y  : week02.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : week02.Rational = """ + $show(z ));$skip(19); val res$2 = 
	
	x.sub(y).sub(z);System.out.println("""res2: week02.Rational = """ + $show(res$2))}
  
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def sub(that: Rational) = add(that.neg)

  def neg() = new Rational(-numer,  denom)

  override def toString = numer + "/" + denom

}
