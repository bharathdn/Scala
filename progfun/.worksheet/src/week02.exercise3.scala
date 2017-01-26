package week02

object exercise3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(179); 
	/**
		Uncurried version
	*/
	
  def product2(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product2(f)(a + 1, b)
  };System.out.println("""product2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(26); val res$0 = 

  product2(x => x)(3, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(50); 

  def factorial(a: Int) = product2(x => x)(1, a);System.out.println("""factorial: (a: Int)Int""");$skip(16); val res$1 = 

  factorial(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(214); 

  
  /**
  	Curried version
	*/
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  };System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(92); 

  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(24); val res$2 = 
  product(x => x)(3, 4);System.out.println("""res2: Int = """ + $show(res$2));$skip(90); 
  
  def sum(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x + y, 0)(a, b);System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""")}
  
}
