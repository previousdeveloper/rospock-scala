package lib.impl

import java.security.InvalidParameterException

import lib.{IGameLogicStrategy, IWeaponStorage, StrategyType}


class BasicGameLogicStrategy(weaponStorage: IWeaponStorage) extends IGameLogicStrategy {

  @throws(classOf[Exception])
  override def addWeapons(beater: String, beaten: String, beaterExistingWeapon: String): Unit = {
    throw new Exception("This operation doesn't supported in this strategy.")
  }

  override def getStrategyType: StrategyType = {

    StrategyType.Basic
  }

  override def getWeapons: Set[String] = {

    val names: Set[String] = weaponStorage.getWeaponNames
    names
  }

  @throws(classOf[Exception])
  override def canBeat(weapon1: String, weapon2: String): Int = {

    if (weapon1.isEmpty) {
      throw new InvalidParameterException("weapon1 must be not empty.")
    }

    if (weapon2.isEmpty) {
      throw new InvalidParameterException("weapon2 must be not empty.")
    }

    val weapon1Id: Int = weaponStorage.get(weapon1)
    val weapon2Id: Int = weaponStorage.get(weapon2)

    this.assertWeaponExists(weapon1Id, weapon1)
    this.assertWeaponExists(weapon2Id, weapon2)

    var difference: Int = weapon2Id - weapon1Id

    if (difference == 0) {
      return -1
    }

    if (difference < 0) {
      difference *= -1
      difference = difference + 1
    }

    difference % 2
  }

  private[this] def assertWeaponExists(weapon: Int, name: String) {

    if (weapon == -1) {
      throw new Exception("Invalid weapon " + name)
    }
  }
}
