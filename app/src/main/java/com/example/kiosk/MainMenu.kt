package com.example.kiosk;

class MainMenu {
    fun display() {
        println("STARBUCKS에 오신걸 환영합니다.")
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
        println("[ STARBUCKS MENU ]")
        println("0. 종료")
        println("1. COFFEE & ESPRESSO")
        println("2. FRAPPUCCINO & BLENDED")
        println("3. TEAVANA & COFFEE")
        println("4. COLD BREW & CHOCOLATE")

        println("\n[ ORDER MENU ]")
        println("5. Order ")
        println("6. Cancel \n")
        print(" > 선택 : ")
    }

    // 로그인 화면...
    fun selDisplay() : Int{
        println("|------------------------------|")
        println("| STARBUCKS에 오신걸 환영합니다.  |")
        println("|------------------------------|")
        println("| 1. 로그인       2. 회원가입     |");
        print("| > 선택 : "); val sel = readLine()?.toIntOrNull();

        return sel!!;
    }

    fun loginDisplay(){
        println("|------------------------------|")
        println("|            <로그인>           |")
        println("|------------------------------|")
        println("| ID : "); val id = readLine(); println();
        println("| PW : "); val passwd = readLine(); println();
    }

    fun signUpDisplay(){
        println("|------------------------------|")
        println("|          <회원 가입>          |")
        println("|------------------------------|")
        println("| ID : "); val id = readLine(); println();         // id 중복 체크 ...
        println("| PW : "); val passwd = readLine(); println();
    }
}