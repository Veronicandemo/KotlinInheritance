fun main() {
    var myCar = Car("Model X", "Tesla", "Grey", 7)
    myCar.carry(15)
    myCar.carry(7)
    myCar.identity()
    myCar.calculateParkingFees(4)
    println(myCar.calculateParkingFees(4))
    var myBus = Bus("Scania", "Toyota", "yellow", 47)
    println(myBus.maxTripFare(100.00))

    println(myBus.calculateParkingFees(3))

}
open class Car(var make: String, var model: String, var color: String, var capacity: Int){
    open  fun carry(people: Int){
        if (people <= capacity){
            println("Carrying $people passangers")
        }
        else{
            var x = people - capacity
            println("Over capacity by $x people")
        }
    }
    //Prints out the color, make and model in the following
    //format e.g: “I am a white subaru legacy”
    fun identity(){
        var x =
            println("I am a $color  $model $make")
    }
    open fun calculateParkingFees(hours: Int): Int{
        return hours * 20
    }

}
//Create a class Bus with the same attributes and functions as the Car class.
class Bus(make: String,model: String, color: String, capacity: Int) :Car(make,model,color,capacity){
    //returns and returns the maximum amount of fare that can be collected per
    fun maxTripFare(fare: Double): Double{
        return fare * capacity
    }
//calculateParkingFees method returns the product of hours and
//the capacity of the bus
    override fun calculateParkingFees(hours: Int): Int {
//        return super.calculateParkingFees(hours)
        return hours * capacity
    }
}