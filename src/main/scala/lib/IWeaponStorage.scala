package lib


trait IWeaponStorage {

  def put(key: String, id: Int): Int

  def get(weapon: String): Int

  def contains(weapon: String): Boolean

  def getWeapons: Map[String, Int]

  def getWeaponNames: Set[String]
}
