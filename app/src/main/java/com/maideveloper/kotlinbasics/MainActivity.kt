package com.maideveloper.kotlinbasics

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Difference between var=variable and val=constant
        var x=4
        val y=5
        println("x :"+x)//println is log in kotlin
        println("y :"+y)

        x=9
        //y=8...This gives error bcz y is constant and we cannot change its value
        println("x :"+x)


        var name="Ali"
        var double=3.45//in these variable we don't have data type restriction. we can assign any type of value
        var number=5
        var bool=true

        println("String :"+name)
        println("Double :"+double)
        println("Integer :"+ number)
        println("Boolean :"+bool)


        //Pre-defined data types
        var name1:String="Ali"//here we defined type and so it's value is restricted with respect to its type
        var double1:Double=3.6//This variable can't store other than double value
        var number1:Int=5
        var bool1:Boolean=false

        println("String :"+name1)
        println("Double :"+double1)
        println("Integer :"+ number1)
        println("Boolean :"+bool1)


        //Arrays
        //Pre-defining size array
        val myArray= arrayOfNulls<String>(4)
        myArray[0]="James"
        myArray[1]="Ali"
        myArray[2]="John"
        myArray[3]="Bat"

        println("Array 2nd Element :"+myArray[1])

        //Defining Elements of Array instead of size
        val myArray1= doubleArrayOf(3.0,4.3,4.7,6.7)
        println("Double Type Array 4th Element :"+myArray1[3])
        println("Array Size: "+myArray1.size)
        println("Setting new Element at 2nd position :"+myArray1.set(2,9.5))
        println("Array new 2nd Element :"+myArray1.get(2))
       // myArray1.set(5,6.4)
        //println(myArray1[5])//This will give error as in array we can't add or increase size of array once defined

        //To increase size and add as many values as we want we use Array Lists

        //Lists/ArrayList
        var myArrayList= arrayListOf<Int>()
        myArrayList.add(1)
        myArrayList.add(2)
        myArrayList.add(1)

        println("Elements of ArrayLists: " + myArrayList)
        println("Size of ArrayList: "+myArrayList.size)

        myArrayList.add(2,6)
        myArrayList.add(9)
        println("Elements of ArrayLists: " + myArrayList)//Duplicate values are acceptable in Array Lists But if we want to have unique values
        println("Size of ArrayList: "+myArrayList.size)  // we use Sets

        //Sets/HashSet
        val myHashSet= hashSetOf<Float>()
        myHashSet.add(3.43f)
        myHashSet.add(3.43f)//It will show only 1 value that are duplicated
        myHashSet.add(1.2f)
        println("Size of HashSet: "+myHashSet.size)
        println("Elements of HashSet: "+myHashSet)


        //Maps/HashMap use 1 key and 1 value against that key. Key has to be unique
        val myHashMap= hashMapOf<String,Int>()
        myHashMap.put("One",1)
        myHashMap.put("One",2)
        println("Key one"+myHashMap["One"])//It will print and store value that is last assigned in this case '2'

        myHashMap.put("Two",2)
        myHashMap.put("Three",3)
        println("Key two"+myHashMap["Two"])



        //Operators
        


    }



}
