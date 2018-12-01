package apollo.hospitals.kotlintutorialspoint

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var int_value  = 31
        var float_value  = 3.1f
        var str_Value  = "string"
        var char_Value  = 's'

        Log.e("int_value_is",int_value.toString())
        Log.e("float_value_is",float_value.toString())
        Log.e("str_valueIs",str_Value)
        Log.e("char_value",char_Value.toString())

        var int_array : IntArray = intArrayOf(3,1,4,7,4,9)
        Log.e("array_is",int_array[5].toString())

        val string_list : MutableList<String> = mutableListOf("three","one","four","seven","nine")
        string_list.add("four")
        Log.e("list_is",string_list.toString())
        Log.e("first_is",string_list.first())
        Log.e("last_is",string_list.last())

        val int_list = listOf(1,2,3)
        Log.e("int_list_is",int_list.filter { it%2==0 }.toString())

        for (i in int_list)
            Log.e("valueIs",i.toString())

        for ((index,value) in int_list.withIndex())
            Log.e("indexIs","Index is $index & Value is $value ")

        val hash_map = hashMapOf("one" to 1,"two" to 2)
        Log.e("map_Is",hash_map["two"].toString())

        val hash_set = hashSetOf('a','A')
        Log.e("set_is",hash_set.toString())

        val j  = 47
        if (j in 31..47)
            Log.e("found number is",j.toString())

        /*for(i in 31..49)
            Log.e("forLoopIs",i.toString())*/

        var a=1
        var b=0
        var c = 1
        if (a>b && a>c)
            Log.e("greatIs",a.toString())
        else if (b>c)
            Log.e("greatIs",b.toString())
        else
            Log.e("greatIs",c.toString())

        val x = 31
        val y = 47
        val max = if (x>y) x else y
        Log.e("zIs",max.toString())

        when(x)
        {
            1-> Log.e("one","x == 1")
            2-> Log.e("two","x == 2")
            else->
                Log.e("else","neither 1 or 2")
        }

        val v = ObjectDemo()
        Log.e("variableIs",v.va)
        Log.e("variableIs",ObjectDemo().va)

        val constructorDemo = ConstructorDemo("Rohit",5)
        constructorDemo.demo()

        var objectDemo = ObjectDemo()
        objectDemo.demo()

        var parent = ObjectDemo()
        parent.demo()

        var par = Parent()
        par.demo()
    }


    class ObjectDemo : Parent()//ObjectDemo is Child
    {
        val va = "var"

        override
        fun demo()
        {
            Log.e("inheritance","I am in child")
        }
    }

    class ConstructorDemo(var name:String , var age:Int)
    {
        fun demo()
        {
            Log.e("nameAndAge","name Is $name and age is $age")
        }
    }

    open class Parent
    {
        open fun demo()
        {
            Log.e("inheritance","I am in parent")
        }
    }

}
