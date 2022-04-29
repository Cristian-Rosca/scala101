package practice

object MapsAndFiltersPractice extends App {

  // write a function that returns true if a Seq has a String that contains the letter “t”
  // (to check if a string contains a character use .contains("t") )

  var initialSeq: Seq[String] = Seq("test", "word")

  def checkIfContainsT(sequence: Seq[String]): Unit = {
    var outcome = sequence.exists {
      s => s.contains("t")
    }
    println(outcome)
  }

  checkIfContainsT(initialSeq)

}
