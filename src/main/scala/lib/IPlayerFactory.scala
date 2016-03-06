package lib


trait IPlayerFactory {

  def createComputerPlayer(name: String): IPlayer

  def createUserPlayer(name: String): IPlayer
}
