//Задача №1 - Денежные переводы

fun main(){

    val amount = 1000
    val commissionPercent = 0.0075
    val minCommission = 35

    val commission = amount*commissionPercent
    val commissionRUB = commission.toInt()
    val commissionCoin = (commission-commissionRUB).toInt()

    println("Задание №1 - Денежные переводы")
    if (commission > minCommission) println("Комиссия составляет = $commissionRUB руб. $commissionCoin коп.") else println("Комиссия составляет = $minCommission руб.")
}
