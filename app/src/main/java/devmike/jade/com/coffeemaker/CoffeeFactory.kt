package devmike.jade.com.coffeemaker

import java.lang.IllegalArgumentException

object CoffeeFactory {

    public enum class Type{
        LATTE, AMERICANO
    }

    fun getCoffee(type: Type): Coffee{
        if (type == CoffeeFactory.Type.LATTE){
            return CafeLatte()
        }else if(type == CoffeeFactory.Type.AMERICANO){
            return Americano()
        }
        throw IllegalArgumentException("Can't handle your command ${type.name}")
    }
}