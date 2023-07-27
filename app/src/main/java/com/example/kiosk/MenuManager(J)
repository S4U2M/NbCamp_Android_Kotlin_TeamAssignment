package com.example.kiosk

class MenuManager {
    private val menuItems = ArrayList<MenuItem>()

    init {
        menuItems.apply {
            val coffeeCategory = arrayListOf(
                Beverage(1, "돌체 라떼", 6.9, "COFFEE & ESPRESSO", "good taste", "Hot and Ice"),
                Beverage(2, "카라멜 마키아또", 8.9, "COFFEE & ESPRESSO", "good taste", "Hot and Ice"),
                Beverage(3, "카페 라떼", 6.9, "COFFEE & ESPRESSO", "good taste", "Hot and Ice"),
                Beverage(4, "아메리카노", 8.9, "COFFEE & ESPRESSO", "good taste", "Hot and Ice")
            )

            val frappuccinoCategory = arrayListOf(
                Beverage(1, "에스프레소 칩", 6.9, "FRAPPUCCINO & BLENDED", "good taste", "Iced Only"),
                Beverage(2, "모카", 8.9, "FRAPPUCCINO & BLENDED", "good taste", "Iced Only"),
                Beverage(3, "자몽 셔벗", 6.9, "FRAPPUCCINO & BLENDED", "good taste", "Iced Only"),
                Beverage(4, "망고 바나나", 8.9, "FRAPPUCCINO & BLENDED", "good taste", "Iced Only")
            )

            val teavanaCategory = arrayListOf(
                Beverage(1, "피치 젤리 티", 6.9, "TEAVANA & COFFEE", "good taste", "Hot and Ice"),
                Beverage(2, "유자 민트 티", 8.9, "TEAVANA & COFFEE", "good taste", "Hot and Ice"),
                Beverage(3, "제주 유기 녹차", 6.9, "TEAVANA & COFFEE", "good taste", "Hot and Ice"),
                Beverage(4, "히비스커스 블렌드 티", 8.9, "TEAVANA & COFFEE", "good taste", "Hot and Ice")
            )

            val coldBrewCategory = arrayListOf(
                Beverage(1, "돌체 콜드 브루", 6.9, "COLD BREW & CHOCOLATE", "good taste", "Iced Only"),
                Beverage(2, "바닐라 크림 콜드 브루", 8.9, "COLD BREW & CHOCOLATE", "good taste", "Iced Only"),
                Beverage(3, "콜드브루", 6.9, "COLD BREW & CHOCOLATE", "good taste", "Iced Only"),
                Beverage(4, "시그니처 초콜릿", 8.9, "COLD BREW & CHOCOLATE", "good taste", "Hot and Ice")
            )

            addAll(coffeeCategory)
            addAll(frappuccinoCategory)
            addAll(teavanaCategory)
            addAll(coldBrewCategory)
        }
    }

    fun displayMenu(category: String) {
        println("[ $category ]")
        menuItems.filter { it.category == category }.forEach {
            println("${it.id}. ${it.display()}")
        }
        println("0. 뒤로가기")
    }

    fun findByIdAndCategory(id: Int, category: String): MenuItem? {
        return menuItems
            .filter { it.category == category }
            .find { it.id == id }
    }

    fun getCategorySize(category: String): Int {
        return menuItems
            .filter { it.category == category }
            .size
    }

     fun hotAndIce(hotIce: String) {
       menuItems.filter { it.hotIce == "Iced Only"}
     }
}
