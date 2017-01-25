package week02

object exercise {
  def recursiveFactorial(n: Int): Int =
    if (n == 0) 1 else n * recursiveFactorial(n - 1)
                                                  //> recursiveFactorial: (n: Int)Int

	/**
	The advantage of tail recursive function is that it can be executed
	using constant space instead of a recursive call
	
	here we can force tail recursion as :
	 @tailrec
	 def tailRecursiveFactorial(n: Int): Int = {
	*/
  def tailRecursiveFactorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)

    loop(1, n)
  }                                               //> tailRecursiveFactorial: (n: Int)Int

  recursiveFactorial(4)                           //> res0: Int = 24
  tailRecursiveFactorial(4)                       //> res1: Int = 24
}