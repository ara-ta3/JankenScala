package janken

object Run extends App {
  var p1	= new Player("Arata",new Hand(0))
  var p2	= new Player("Tanaka",new Hand(2))
  
  var stage	= new Stage(p1,p2)
  println(stage.call)
}