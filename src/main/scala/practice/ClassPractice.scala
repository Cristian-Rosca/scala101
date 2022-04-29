package practice

object ClassPractice extends App {

  class Boat {
    val length: Int = 100
    val width: Int = 30
    val topSpeed: Int = 120

    def isFasterThan(boat: Boat): Unit = {
      if (this.topSpeed > boat.topSpeed) {
        true
      }
      else if (this.topSpeed < boat.topSpeed) {
        false
      }
      else {
        "same speed"
      }
    }
  }

  class SailBoat extends Boat {
    override val width: Int = 30
    val numOfSails: Int = 4
    val hasOars: Boolean = true
    val canTack: Boolean = true
  }

  class MotorBoat extends Boat {
    override val width = 25
    val engineSize: Int = 2
    val fuelType: String = "petrol"
  }

  class LuxurySailBoat extends SailBoat {
    override val width = 40
    val hasJacuzzi: Boolean = true
    val hasBooze: Boolean = true
  }

}
