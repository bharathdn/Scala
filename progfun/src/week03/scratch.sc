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

object scratch {
  new Rational(1,2)                               //> res0: week03.Rational = 1/2
  
  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
  
  error("Calling method that throws exception")   //> java.lang.Error: Calling method that throws exception
                                                  //| 	at week03.scratch$$anonfun$main$1.error$1(week03.scratch.scala:19)
                                                  //| 	at week03.scratch$$anonfun$main$1.apply$mcV$sp(week03.scratch.scala:21)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week03.scratch$.main(week03.scratch.scala:16)
                                                  //| 	at week03.scratch.main(week03.scratch.scala)
}