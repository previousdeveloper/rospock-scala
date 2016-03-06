package lib

import lib.models.MatchResult


trait IGame {

  def getPlayers: List[IPlayer]

  def clear(): Unit

  @throws(classOf[Exception])
  def addPlayer(playerType: PlayerType): Unit

  def play(): List[MatchResult]
}
