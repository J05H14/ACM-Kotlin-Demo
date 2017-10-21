fun main(argd: Array<String>){
    var hello : String = "Hello, World"
    println(hello)
    
    var str = "Wake Me Up"
    println("${str}, nah...")
    
    var doubleNum = 5.5
    doubleNum+=10
    doubleNum = 5.toDouble()
    
    println(doubleNum)

    var isTrue = true
    var isFalse = false
    
    if(isTrue){
        println("isTrue is ${isTrue}")
    }
    else if(isFalse){
        println("isFalse is ${isFalse}")
    }
    else{
        println("Dumbass!")
    }
    
    var manyTypes = arrayOf(9,11.1, "Hello", 'u')
    println(manyTypes[3])
    
    var singleType = arrayOf<Int>(1, 2, 3)
//    println(singleType[1])
    var singleType2 = IntArray(5)
//    println(singleType2.size)
    
    var range = 1 .. 5
    //for(i in range){
    //    println(i)
    //}
    //for(i in 1 .. 5){
    //    println(i)
    //}
    //for(i in 0 until 15){
    //    println(i)
    //}
     for( i in 0 until manyTypes.size){
         println(manyTypes[i])
     }
    
    var bobRoss = Human(225, true, 8)
    bobRoss.addFinger()
    
    var humans = arrayListOf<Human>()
    humans.add(bobRoss)
    humans.get(0).addFinger()
    println(bobRoss.fingerCount)

    var pika = Pikachu("Green", false, true)
    println(pika)
    
}

class Human(var intelligence : Int, var brains : Boolean, var fingerCount : Int){
    fun addFinger(){
        fingerCount++
    }
}

class Pikachu{
	var color : String
    var hasTail : Boolean
    var isShiny : Boolean
    constructor(color : String, hasTail : Boolean, isShiny : Boolean){
        this.color = color
        this.hasTail = hasTail
        this.isShiny = isShiny
    }
    override fun toString() : String{
        return "This Pikachu is ${color} int color, it is ${hasTail} for tail, and ${isShiny} for shiny"
    }
}




