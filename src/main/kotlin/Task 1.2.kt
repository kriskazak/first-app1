//Задача №1 - Денежные переводы

fun main(){

    val amount = 1467
    val commissionPercent = 0.0075
    val minCommission = 35

    val commission = amount*commissionPercent
    val commissionRUB = commission.toInt()
    val commissionCoin = (commission-commissionRUB).toInt()

    println("Задача №1 - Денежные переводы")
    if (commission > minCommission)
        println("Комиссия составляет = $commissionRUB руб. $commissionCoin коп.")
    else println("Комиссия составляет = $minCommission руб.")


//Задача №2 - "Люди/Человеки"

val likes = 1745
var NumberOfLikes = 0
if (likes>1) NumberOfLikes = likes%10
val digits:Array<Int> = arrayOf(2,3,4,5,6,7,8,9,0)
val lastTwoNumber = likes%100

println("""
Задача №2 - "Люди/Человеки" """)

if (lastTwoNumber==11) println("Понравилось $likes людям")
else if(likes==0) println("Запись оценило 0 человек")
else if (likes==1) println("Понравилось $likes человеку")
else if(NumberOfLikes==1) println("Понравилось $likes человеку")
else if(NumberOfLikes in digits) println("Понравилось $likes людям")


// Задача №3 - "Меломан"

val buysMonthly = true
val SalesAmount = 4500
val maxSalesAmountWithStandardDiscount: IntRange = (1001..10000)
val minSalesWithPercentageDiscount = 10001
val standardDiscount = 100
val discountPercentage = 0.05
val bonusDiscount = 0.01
var finalDiscountFull = 0.00

if(SalesAmount in maxSalesAmountWithStandardDiscount) finalDiscountFull += standardDiscount
else if(SalesAmount >= minSalesWithPercentageDiscount) finalDiscountFull = (finalDiscountFull+SalesAmount*discountPercentage)

if(buysMonthly) finalDiscountFull += (SalesAmount * bonusDiscount)
val finalDiscountRUB = finalDiscountFull.toInt()
val finalDiscountPenny = ((finalDiscountFull-finalDiscountRUB)*100).toInt()


println("""
Задача №3 - "Меломан"
Скидка $finalDiscountRUB руб. $finalDiscountPenny коп.""")

}
