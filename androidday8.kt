fun main() {
//    var a = Person("Riya",22)
//    a.intro()
//    var b=Person()
//    b.intro()
//    var c=Person("Heena")
//    c.intro()
    val myRectangle = Rectangle(4.0,5.0)
    myRectangle.display()
    val mySquare = Rectangle.Square(3.0)
    mySquare.display()
}

// The primary constructor is a simple conscice way ti initialize a class.Its defined right after the class name;
// The secondary constructor

/*class Person {
    var name: String
    var age:Int

    constructor(x:String,y:Int){
        this.name = x
        this.age = y
    }
    constructor(x:String){
        this.name = x
        this.age = 0
    }
    constructor(){
        this.name="Rahul"
        this.age= 32
    }
    fun intro(){
        println("my name is $name and age is $age")
    }
}*/

class Person(var name:String,var age:Int){
    constructor(x:String) : this(){
        this.name = x
        this.age = 0
    }
    constructor() : this("rahul",50)
    fun intro(){
        println("my name is $name and age is $age")
    }
}

open class Rectangle(val a:Double, val b: Double){
    fun area():Double{
        return a * b
    }
    open fun display(){
        println("area of rectangle with dimensions $a and $b is ${area()}")
    }
    class Square(side:Double) : Rectangle(side,side){
        override fun display () {
            println("area of square with side $a is ${area()}")
        }
    }
}
