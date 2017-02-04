package list

object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(188); 
  def nth[T](index: Int, xs: List[T]): T =
  	if(xs.isEmpty) throw new IndexOutOfBoundsException
    else if(index == 0) xs.head
    else nth(index - 1, xs.tail);System.out.println("""nth: [T](index: Int, xs: list.List[T])T""");$skip(61); 

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : list.Cons[Int] = """ + $show(list ));$skip(14); val res$0 = 
	nth(2, list);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
	nth(-1, list);System.out.println("""res1: Int = """ + $show(res$1));$skip(14); val res$2 = 
	nth(4, list);System.out.println("""res2: Int = """ + $show(res$2))}
}
