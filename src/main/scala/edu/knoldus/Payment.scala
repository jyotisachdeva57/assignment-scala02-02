package edu.knoldus

class Payment {

  def compute(amount: Double, paymentMode: String): Double = {
    paymentMode.toLowerCase match {
      case "payTm" | "free charge" => amount + 0.02 * amount
      case "net banking" => amount + 5
      case "card payment" => amount + 1.5
      case "cash" => amount
      case _ => amount
    }
  }

}
