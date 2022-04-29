package guess_who

import scala.util.Random

object Game {

  class Character(var name: String, var hairColour: String, var hasGlasses: Boolean) {

  }

  // generating some sample characters
  val bob = new Character("Bob", "blonde", false)
  val rachel = new Character("Rachel", "blonde", true)
  val sam = new Character("Sam", "black", false)

  // populating collection to store all characters
  var characterList: List[Character] = List(bob, rachel, sam)


  // function to remove characters if they are blonde
  def removeBlondeCharacters = {
    characterList = characterList.filter {
      char => char.hairColour == "blonde"
    }
  }

  // function to remove characters if they have glasses
  def removeCharactersWithGlasses = {
    characterList = characterList.filter {
      char => char.hasGlasses == true
    }
  }

  // functions to remove characters that are blonde and that are wearing glasses
  def removeCharactersWithBlondeAndGlasses = {
    characterList = characterList.filter {
      char => char.hasGlasses == true && char.hairColour == "blonde"
    }
  }

  // start with a placeholder user character
  var userCharacter = new Character("", "", false)

  // when the game starts the assignCharacter function would run and the placeholder char would be populated
  def assignCharacter = {
    val random = new Random
    userCharacter = characterList(random.nextInt(characterList.length))
    println(userCharacter.name)
  }


  def printBoard: Unit = {
    for (element <- characterList) {
      println(element.name)
    }
  }

  def makeAGuess(yourGuess: String): Unit = {
    if (userCharacter.name.toLowerCase() == yourGuess.toLowerCase) {
      print("You guessed right!")
    }
    else {
      characterList = characterList.filter {
        char => char.name.toLowerCase() != yourGuess.toLowerCase()
      }
      print("You guessed wrong. Your guess was removed from the board")
    }
  }

  assignCharacter
  println("----")
  printBoard
  println("----")
  removeBlondeCharacters
  println("----")
  printBoard



}
