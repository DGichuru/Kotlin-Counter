package com.android50.clickergame

import kotlinx.android.synthetic.main. activity_main.*

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var money = 0

    var clickPower = 1 // dollars
    var robotCount = 0
    var isDoubleBonusEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickButton.setOnClickListener {
            money += 1
            moneyText.text = "$$money"
        }

        clickPowerButton.setOnClickListener {

            if(money >= 100) {
                clickPower += 1
                clickPowerText.text = "CLICK POWER: $$clickPower"

                money -= 100
                moneyText.text = "$$money"
            }

        }
        robotButton.setOnClickListener{
            if(money >= 1000) {
                robotCount += 1
                robotText.text= "ROBOT COUNT: $robotCount"

                money -= 1000
                moneyText.text = "$$money"
            }
        }
        doubleButton.setOnClickListener {
            if(money >= 5000){
              isDoubleBonusEnabled = true
              doubleText.text = "DOUBLE BONUS: ACTIVE"
                money -= 5000
                moneyText.text = "$$money"
            }
        }
    }
}