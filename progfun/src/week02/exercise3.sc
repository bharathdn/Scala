package week02

object exercise3 {
	/**
		Uncurried version
	*/
	
  def product2(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product2(f)(a + 1, b)
  }                                               //> product2: (f: Int => Int)(a: Int, b: Int)Int

  product2(x => x)(3, 4)                          //> res0: Int = 12

  def factorial(a: Int) = product2(x => x)(1, a)  //> factorial: (a: Int)Int

  factorial(5)                                    //> res1: Int = 120

  
  /**
  	Curried version
	*/
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  }                                               //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int

  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x => x)(3, 4)                           //> res2: Int = 12
  
  def sum(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x + y, 0)(a, b)
                                                  //> sum: (f: Int => Int)(a: Int, b: Int)Int
  
}