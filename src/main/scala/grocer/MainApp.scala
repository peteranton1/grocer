package grocer

import grocer.domain.Item
import grocer.service.Pricer


/**
  * MainApp class to run service.
  */
object MainApp {

  /**
    * MainApp object to run application.
    *
    * @param args argments from command line.
    */
  def main(args: Array[String]): Unit = {
    println("Grocer app")

    val items = Item.getItems(List(
      Item.apple, Item.orange, Item.apple,
      Item.apple, Item.orange, Item.orange,
      Item.orange))

    val prices = items.map(i => i.price)

    println("Items Bought: " + items)
    println("Prices Bought: " + prices)
    println("Total Price with no discounts: " + Pricer.getTotal(items))
    println("Total Price with discounts   : " + Pricer.getDiscounted(items))

  }
}
