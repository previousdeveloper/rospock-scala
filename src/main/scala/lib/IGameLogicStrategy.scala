package lib


trait IGameLogicStrategy {

  @throws(classOf[Exception])
  def addWeapons(beater: String, beaten: String, beaterExistingWeapon: String): Unit

  @throws(classOf[Exception])
  def canBeat(weapon1: String, weapon2: String): Int

  def getWeapons: Set[String]

  def getStrategyType: StrategyType
}
