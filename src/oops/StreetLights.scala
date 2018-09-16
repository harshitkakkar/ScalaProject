package oops

object StreetLights extends Enumeration {
  
  val Red , Green , Yellow = Value
  
}
class Streenlight (private var _color :StreetLights.Value) {
  def color = _color

import StreetLights._

def cycle:Unit = _color = _color match {
  case Red => Green
  case Green => Yellow
  case Yellow => Red
  }
}