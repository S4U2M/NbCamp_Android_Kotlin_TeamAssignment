package com.example.kiosk

class LogIn(var loginSucces:Boolean) {

    // 로그인 메소드...
    fun logIn(memberList:ArrayList<Member>): Boolean {
        val mm = MemberManager()
        val mmlist = mm.memberList

        while (true) {

        if(memberList.isNotEmpty()) {

                print("| ID : ");
                val id = readLine(); println();
                print("| PW : ");
                val passwd = readLine(); println();

                val findMember = mmlist.find { it.ID == id && it.password == passwd }
                if (findMember != null) {
                    println("로그인에 성공하였습니다.")
                    loginSucces = true
                    break
                } else {
                    println("로그인에 실패하였습니다. ID와 비밀번호를 다시 확인해주세요")
                    loginSucces = false
                }

            }else{
                println("회원가입해주세요.")
            }
    }
        return loginSucces
    }
}