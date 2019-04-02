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
        var m=5
        println(m)
        m=m+1
        println(m)
        m++//same as m=m+1
        println(m)

        var n=4
        println(m>n)//IT will print true since m=5 and n=4 and so m>n
        println(m<n)//IT will print false since m=5 and n=4 and so m>n

        /*
        >  => Greater Than
        >= => Greater Than Equal To
        <  => Less Than
        <= => Less Than Equal To
        == => Equal To
        != => Not Equal To
        && => AND
        || => OR
         */

        //IF Statements
        println("m= "+m)
        println("n= "+n)
        if (m>n){
            println("It's true , m is greater than n")
        }
        n=9
        m=3
        println("m= "+m)
        println("n= "+n)
        if (m>n){
            println("It's False , m is Less than n")
        }
        else {
            println("It's true , n is greater than m")
        }

        n=3
        m=3
        println("m= "+m)
        println("n= "+n)
        if (m>n){
            println("It's False")
        }
        else if (n>m) {
            println("It's false ")
        }
        else{
            println("It's true ")
        }


        //Switch Statement. Sometime it is better to use 'switch' than 'if' to make code elegant and efficient
        var day=1
        var dayString=" "
        if (day==1){
            println("Monday")
        }
       else if (day==2){
            println("Tuesday")
        }
       else if (day==3){
            println("Wednesday")
        }
        else if (day==4){
            println("Thursday")
        }
        else if (day==5){
            println("Friday")
        }
       else if (day==6){
            println("Saturday")
        }
       else{
            println("Sunday")
        }

        //We can do above work in more simple and easy way using switch
        when(day){
            1-> dayString="Monday"
            2-> dayString="Tuesday"
            3-> dayString="Wednesday"
            4-> dayString="Thursday"
            5-> dayString="Friday"
            6-> dayString="Saturday"
            else-> dayString="Sunday"
        }
        println(dayString)


        //For Loop: Useful with arrays for retrieving and storing values

        val myNumbers= intArrayOf(20,40,50)
        val r=myNumbers[0]/3*5
        println("R: "+r)//IF we do this logic with all array elements it will be time consuming So for this we use
                   // for loops
        for (number in myNumbers){//Each element of muNumbers create number variable and element stored in that
            val z=number/3*5      //variable
            println("Z :" +z)
        }

        //There is another method using for loop with arrays by creating index and get elements from index
        for(i in myNumbers.indices){
            val q=myNumbers[i]/3*5
            println("Q :"+q)
        }

        for (a in 0..9){//It means 'a' has some value from 0 to 9
            val b=a+10
            println("A :"+a+" B :"+b)
        }
        //This loop looks difficult. We can do this task simply and easily using
        //While Loops
        var j=0
        while (j<10){
            val p=j+10
            println("J :"+j+" P :"+p)
            j++
        }

    }



}
