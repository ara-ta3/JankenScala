package janken

class Hand(var hand:Int){
  val m 	= Map[Int,String](0->"グー",1->"チョキ",2->"パー")
  var name	= m.get(hand)
}