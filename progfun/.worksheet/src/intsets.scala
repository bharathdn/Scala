object intsets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(36); 
  println("Hello");$skip(51); ;
  def tree = new NonEmpty(3, new Empty, new Empty);System.out.println("""tree: => NonEmpty""");$skip(15); val res$0 = 
  tree.incl(4);System.out.println("""res0: IntSet = """ + $show(res$0))}
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}

/*
	Take for example, binary tree
	there are 2 types of possbile trees,
		i) a tree for empty set
		ii) a tree consisting integer and 2 sub-trees
*/
class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty);
  override def toString = ".";
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this

  override def toString = "{" + left + elem + right + "}"
}
