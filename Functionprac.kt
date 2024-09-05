//fun main() {
//    val total_sum = 10000
//    val user_membership = "yes"
//    if (total_sum >= 1000){
//        if (user_membership == "yes"){
//            val membership_price = total_sum - (total_sum * 0.2)
//            println("You got a discount of 20% and the final amout to pay is  $membership_price")
//        }
//        else{
//            println("You dont have a membership and the final amount to pay is $total_sum")
//        }
//    }
//    else{
//        println("Discount cannot be applied because the amount is less than Rs1000.And the final amount to pay is $total_sum")
//    }
//}

fun main() {
    var current_balance = 1000
    var continue_prompt = "Yes"

    while (continue_prompt == "Yes") {
        println("Enter the amount to withdraw: ")
        val withdrawal = readLine()!!.toInt() // User input for withdrawal

        current_balance = withdraw_proc(current_balance, withdrawal)

        println("Do you want to make another withdrawal? (Yes/No)")
        continue_prompt = readLine()!!
    }

    println("Thank you")
}

fun withdraw_proc(current_balance: Int, withdrawal: Int): Int {
    return if (withdrawal <= current_balance) {
        val left_balance = current_balance - withdrawal
        println("The balance left is $$left_balance")
        left_balance
    } else {
        println("Insufficient balance. Your current balance is $$current_balance.")
        current_balance
    }
}
