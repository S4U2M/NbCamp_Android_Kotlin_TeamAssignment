package com.example.kiosk

class Order(private val cart: Cart) {
    private var orderCount = 0
    private lateinit var orderType: OrderType

    fun getCart(): Cart {
        return cart;
    }

    fun calculateTotalPrice(): Double {
        var totalPrice = 0.0
        cart.items.forEach { item ->
            totalPrice += item.price
        }
        return totalPrice
    }

    fun printOrder() {
        println("[ Orders ]")
        cart.items.forEach { item ->
            println("${item.name}     | ${String.format("%.1f", item.price)} | ${item.description}")
        }
        println("[ Total ]")
        println("W ${String.format("%.1f", calculateTotalPrice())}")
    }

    fun hasSufficientBalance(currentBalance: Double): Boolean {
        return currentBalance >= calculateTotalPrice()
    }

    fun processOrder(user: Member) {
        orderType = getOrderType() // 주문 유형을 선택
        val amount = user.balance - calculateTotalPrice()

        if (hasSufficientBalance(user.balance)) {
            printOrder()
            println(
                "주문이 완료되었습니다. 잔돈은 ${
                    String.format(
                        "%.1f",
                        (user.balance - calculateTotalPrice())
                    )
                } W 입니다."
            )
            orderCount++
            cart.items.clear()
        } else {
            println(
                "현재 잔액은 ${String.format("%.1f", user.balance)} W으로, ${
                    String.format(
                        "%.1f",
                        (-1) * amount
                    )
                } W이 부족해서 주문할 수 없습니다."
            )
        }
        user.balance = amount;
    }

    fun onOrderCancelled() {
        if (orderCount > 0) {
            orderCount--
        }
    }

    fun getNumberOfWaitingOrders(): Int {
        return orderCount
    }

    fun getOrderType(): OrderType {
        println("주문 유형을 선택하세요.")
        println("1. 매장 식사")
        println("2. 테이크 아웃")
        val orderTypeChoice = readLine()?.toIntOrNull()
        return if (orderTypeChoice == 2) {
            OrderType.TAKE_OUT
        } else {
            OrderType.DINE_IN
        }
    }
}