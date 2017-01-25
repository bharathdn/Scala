package week02

object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(126); 
  def recursiveFactorial(n: Int): Int =
    if (n == 0) 1 else n * recursiveFactorial(n - 1);System.out.println("""recursiveFactorial: (n: Int)Int""");$skip(385); 

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
  };System.out.println("""tailRecursiveFactorial: (n: Int)Int""");$skip(25); val res$0 = 

  recursiveFactorial(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(28); val res$1 = 
  tailRecursiveFactorial(4);System.out.println("""res1: Int = """ + $show(res$1))}
}
