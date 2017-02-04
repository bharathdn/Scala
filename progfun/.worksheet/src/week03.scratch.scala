package week03

/**
ways to import in scala

-- Named Imports
1) import week03.Rational
2) import week03._

-- Wildcard Imports
3) import week03.{Hello, Rational}

*/
import week03._

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(220); val res$0 = 
  new Rational(1,2);System.out.println("""res0: week03.Rational = """ + $show(res$0));$skip(51); 
  
  def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(51); val res$1 = 
  
  error("Calling method that throws exception");System.out.println("""res1: Nothing = """ + $show(res$1))}
}
