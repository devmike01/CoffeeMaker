package devmike.jade.com.coffeemaker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isChanged: Boolean =false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set button click
        coffee_btn.setOnClickListener(this::changeCoffee)

    }

    /**
     * Change coffee recipe and name when button is clicked
     */
    fun changeCoffee(view: View){
        var factory: Coffee
        if (isChanged){
            factory = CoffeeFactory.getCoffee(CoffeeFactory.Type.AMERICANO)
            isChanged = false
        }else{
            factory = CoffeeFactory.getCoffee(CoffeeFactory.Type.LATTE)
            isChanged = true
        }

        changeCoffeeType(factory.recipes(), factory.name())
    }

    /**
     * Method that changes the coffee type
     */
    private fun changeCoffeeType(recipe: String, name: String){

        coffee_recipe.text = recipe

        coffee_name.text =name
    }
}
