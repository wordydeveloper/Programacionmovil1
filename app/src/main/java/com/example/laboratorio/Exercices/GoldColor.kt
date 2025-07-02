package Exercices

abstract class AquariumFishc(): FishAction {
     abstract var bienes : String
     abstract  var color: String
    override fun eat() {
        print("yum")
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}


//sub clases
   class  Shark : FishColor , FishAction{
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }

       //override var bienes= "gold"
    }
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

   class Plecostomus /*FishColor by GoldColor, FishAction*/(fishColor: FishColor = GoldColor): //FishAction,
       //FishColor by GoldColor
       FishAction by PrintingFishAction("eat algae"),
       FishColor by fishColor
   {
       // override var color = "gold"
       // override var bienes= "gold"

      // eliminada override fun eat(){
      //     print("eat algae ")
     //  }


    }

