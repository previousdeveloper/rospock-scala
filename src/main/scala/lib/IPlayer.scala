package lib


trait IPlayer {


  def makeChoice(): String

  def getName: String

  def setName(name: String): Unit

  def toString: String
}
