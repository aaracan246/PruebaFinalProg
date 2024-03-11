package org.example.Menu

import com.github.ajalt.mordant.terminal.Terminal
import miscellaneous.DiceRoller

object Menu {
       fun menuBase(){
           val t = Terminal()

           t.println("Select your next move: ")
           t.println("1. Normal attack (1d4)")
           t.println("2. Skill")
           t.println("3. Use item")
           t.println("4. Pass turn")

//           val selection = readln()
//
//           when(selection){
//
//               1 -> return // TODO: combat -> NA / combat -> skill / combat use item / skip turn
//
//               2 -> return
//
//               3 -> return
//
//               4 -> return
//
//
//
//
//
//           }
       }



}