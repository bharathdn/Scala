object intsets {
  println("Hello");
  def tree = new NonEmpty(3, new Empty, new Empty)
  tree.incl(4)
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: Intset): IntSet
}

/*
	Take for example, binary tree
	there are 2 types of possbile trees,
		i) a tree for empty set
		ii) a tree consisting integer and 2 sub-trees
		
		Singleton:
		The object keyword makes the singleton, as in this case,
		there was no need to create more than one instance.
		
		Accessing the singleton object does not invovle using 'new keyword'
		
		To make it regular class, replace 'object' by class
*/

object Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty);
  def union(other: Intset): Intset = other
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

  def union(other: Intset): IntSet =
  	((left union right) union other) incl elem

  override def toString = "{" + left + elem + right + "}"
}