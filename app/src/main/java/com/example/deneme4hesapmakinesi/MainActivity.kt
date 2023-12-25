package com.example.deneme4hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.view.menu.ShowableListMenu
import com.example.deneme4hesapmakinesi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        var sayi1=0
        var sayi2=0
        var metin=""
        var sonuc=""
        var islem=""


        tasarim.button1.setOnClickListener {

            tasarim.sonuc.text=""
            metin+="1"
            tasarim.sonuc.text=metin.toString()

        }


        tasarim.button2.setOnClickListener {

            tasarim.sonuc.text=""
            metin+="2"
            tasarim.sonuc.text=metin.toString()
        }


        tasarim.button3.setOnClickListener {

            tasarim.sonuc.text=""
            metin+="3"
            tasarim.sonuc.text=metin.toString()
        }


        tasarim.button4.setOnClickListener {

            tasarim.sonuc.text=""
            metin+="4"
            tasarim.sonuc.text=metin.toString()
        }

        tasarim.button5.setOnClickListener {

            tasarim.sonuc.text=""
            metin+="5"
            tasarim.sonuc.text=metin.toString()
        }

        tasarim.button6.setOnClickListener {

            tasarim.sonuc.text=""
            metin+="6"
            tasarim.sonuc.text=metin.toString()
        }

        tasarim.button7.setOnClickListener {

            tasarim.sonuc.text=""
            metin+="7"
            tasarim.sonuc.text=metin.toString()
        }

        tasarim.button8.setOnClickListener {

            tasarim.sonuc.text=""
            metin+="8"
            tasarim.sonuc.text=metin.toString()
        }

        tasarim.button9.setOnClickListener {

            tasarim.sonuc.text=""
            metin+="9"
            tasarim.sonuc.text=metin.toString()
        }

        tasarim.button0.setOnClickListener {

            tasarim.sonuc.text=""
            metin+="0"
            tasarim.sonuc.text=metin.toString()
        }

        tasarim.button10.setOnClickListener {
            metin=""
            tasarim.sonuc.text=metin.toString()
        }


        tasarim.toplam.setOnClickListener {

            sayi1=metin.toString().toInt()
            metin=""
            islem="toplama"
        }

        tasarim.cikarma.setOnClickListener {

            sayi1=metin.toString().toInt()
            metin=""
            islem="cikarma"
        }

        tasarim.carpma.setOnClickListener {

            sayi1=metin.toString().toInt()
            metin=""
            islem="carpma"
        }

        tasarim.bolme.setOnClickListener {

            sayi1=metin.toString().toInt()
            metin=""
            islem="bolme"
        }

        tasarim.yuzde.setOnClickListener {

            sayi1=metin.toString().toInt()
            metin=""
            islem="yuzde"

        }

        tasarim.esittir.setOnClickListener {
            sayi2=metin.toString().toInt()
            metin=""



            when(islem) {

                "toplama" -> tasarim.sonuc.text=(sayi1+sayi2).toString()
                "cikarma" -> tasarim.sonuc.text=(sayi1-sayi2).toString()
                "carpma" -> tasarim.sonuc.text=(sayi1*sayi2).toString()
                "bolme" -> tasarim.sonuc.text=(sayi1/sayi2).toString()
                "yuzde" -> tasarim.sonuc.text=((sayi1*sayi2)/100).toString()

                else->{
                    tasarim.sonuc.text=sayi1.toString()
                }
            }




        }



    }



}




