package list

object nth {
  def nth[T](index: Int, xs: List[T]): T =
  	if(xs.isEmpty) throw new IndexOutOfBoundsException
    else if(index == 0) xs.head
    else nth(index - 1, xs.tail)                  //> nth: [T](index: Int, xs: list.List[T])T

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : list.Cons[Int] = list.Cons@7a79be86
	nth(2, list)                              //> res0: Int = 3
	nth(-1, list)                             //> java.lang.IndexOutOfBoundsException
                                                  //| 	at list.nth$$anonfun$main$1.nth$1(list.nth.scala:5)
                                                  //| 	at list.nth$$anonfun$main$1.apply$mcV$sp(list.nth.scala:11)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at list.nth$.main(list.nth.scala:3)
                                                  //| 	at list.nth.main(list.nth.scala)
	nth(4, list)
}