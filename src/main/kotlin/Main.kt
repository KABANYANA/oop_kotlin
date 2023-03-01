fun main() {

val toyota = Car("Toyota","prado","KDG 1124",0)
    val Carina = Car("SCROPION","RAVA4","KDG 5647",0)
    val Rimu = Car("hyundai","main","KDG 9087",0)
    Carina.start()

    println(Carina.speed)
    Carina.accelerate(34)
    println(Carina.speed)
    Carina.accelerate(61)
    println(Carina.speed)
    Carina.deccelerate(25)
    println(Carina.speed)
    Carina.hoot()
    Carina.stop()

    var myBook = Book("Born a crime","Trevor Noah",288,2017)
    println(myBook.author)
    println(myBook.title)
    myBook.read()
}
class Car(var make:String, var model:String, var registration:String, var speed:Int) {
    fun start() {
        println("we goooo")
    }
    fun accelerate(acceleration:Int):Int{
        speed+=acceleration
        return speed
    }
    fun deccelerate(decceleration:Int):Int{
        speed-=decceleration
        return speed

    }
    fun hoot(){
        println("biiiiiiiii")
    }
    fun stop(){
        speed = 0
println(speed)

    }

}
data class Book(var title:String, var author:String, var pages:Int, var year:Int){
    fun read(){
        println("the book is funny")
    }
}