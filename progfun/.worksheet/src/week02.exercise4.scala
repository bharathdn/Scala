package week02
import math.abs
object exercise4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 

  val tolerence = 0.0001;System.out.println("""tolerence  : Double = """ + $show(tolerence ));$skip(82); 

  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) / x < tolerence;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(234); 

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(31); val res$0 = 
	
	fixedPoint(x => 1 + x/2)(1);System.out.println("""res0: Double = """ + $show(res$0))}
}
