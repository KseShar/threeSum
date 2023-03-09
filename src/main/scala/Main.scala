sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

object Main {
  def main(args: Array[String]): Unit = {
    println(sum(Node(Node(Leaf(2), Leaf(5)), Leaf(1))))
  }

  def sum(treeBin: BinaryTree):Int = {
    treeBin match {
      case l: Leaf => l.value
      case n: Node => sum(n.left) + sum(n.right)
    }
  }
}

