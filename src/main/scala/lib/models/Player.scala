package lib.models

import lib.IPlayer


abstract class Player extends IPlayer {

  var _name: String

  def miles = _name

  def name_=(value: String): Unit = {

    _name = value
  }
}
