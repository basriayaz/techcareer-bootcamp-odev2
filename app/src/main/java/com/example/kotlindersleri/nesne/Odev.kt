package com.example.kotlindersleri.nesne

    fun soru1(sayi:Double): Double {
    return sayi*18+32
    }
//-------------------------------------------------------------------------------------->>>>
    fun soru2(kenar1:Double,kenar2:Double,kenar3:Double,kenar4:Double):Double {
        return kenar1+kenar2+kenar3+kenar4
    }
//-------------------------------------------------------------------------------------->>>>
    fun soru3(sayi:Int): Int{
        var i = 1
        var sonuc = 1
        while(i<=sayi){
            sonuc *= i
            i++
        }
    return sonuc
    }
//-------------------------------------------------------------------------------------->>>>
fun soru4(harf: Char, kelime:String):Int{
    var harfsayisi = kelime.length
    var sayac = 0
    for(i in 0 until harfsayisi){

     val sayac:Int = if(kelime.get(i)==harf) sayac++ else sayac +-1
    }

    return sayac
}
//-------------------------------------------------------------------------------------->>>>

    fun soru5(kenar:Int):Int {
        return (kenar-2)*180
    }
//-------------------------------------------------------------------------------------->>>>
    fun soru6(gunsayisi:Int):Int{
        var toplamsaat = gunsayisi*8
        val maas:Int = if (toplamsaat>160) (toplamsaat-160)*20+1600 else toplamsaat*10
        return maas
    }
//-------------------------------------------------------------------------------------->>>>
fun soru7(kota:Double):Double{
    val tutar: Double = if (kota>50.00) (kota-50.00)*4+100 else 100.00
return tutar
}
//-------------------------------------------------------------------------------------->>>>
