package janken

class Hand(var hand:Int){
  val m 	= Map[Int,String](0->"�O�[",1->"�`���L",2->"�p�[")
  var name	= m.get(hand)
}