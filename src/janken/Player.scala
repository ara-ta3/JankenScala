package janken

class Player(var name:String,var hand:Hand) {
  
  def pon():Int	= {
    return hand.hand
  }
  def decideHand(handNum:Int):Unit	= {
    hand.hand	= handNum
  }
  override def toString	= "player" + name

}