package com.example.kiosk

class LogIn(var loginSucces:Boolean,var id:String) {

    // 로그인 메소드...
    fun logIn(memberList:ArrayList<Member>): Pair<Boolean, String> {
        val mm = MemberManager()
        val mmlist = mm.memberList

        while (true) {

        if(memberList.isNotEmpty()) {

                print("| ID : ");
                id = readLine()!!; println();
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
                println("등록된 회원이 없습니다. 회원가입을 진행해 주세요.")
            break
            }
    }
        return Pair(loginSucces,id)
    }
}