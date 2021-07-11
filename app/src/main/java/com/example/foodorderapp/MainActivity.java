package com.example.foodorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.example.foodorderapp.Adapters.MainAdapter;
import com.example.foodorderapp.Models.MainModel;
import com.example.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list=new ArrayList<>();
        list.add(new MainModel(R.drawable.burger,"Burger","5","Burger'o clock is available to satisfy your hunger"));
        list.add(new MainModel(R.drawable.pizza,"Veg Supreme Pizza","10","Traditionally topped pizza with pepperoni, sausage and olives"));
        list.add(new MainModel(R.drawable.biryani,"Chicken Biryani","8","Spicy one pot chicken biryani made with rice, spices and chicken"));
        list.add(new MainModel(R.drawable.chats,"Pani Puri","3","Fried crispy puri filled with potato masala and loaded with flavored water!"));
        list.add(new MainModel(R.drawable.noodles,"Veg Hakka Noodles","7","Dish of stir fried noodles,veggies and sauces"));
        list.add(new MainModel(R.drawable.icecream,"Choco Sundae","8","Homemade chocolate fudge sauce and all the delicious trimmings."));
        list.add(new MainModel(R.drawable.paneertikka,"Paneer Tikka","7","Popular Indian appetizer made with cubes of paneer & veggies"));
        list.add(new MainModel(R.drawable.smoothie,"Strawberry Smoothie","6","Creamy, refreshing, and the perfect way to satisfy your sweet tooth!"));
        list.add(new MainModel(R.drawable.tandoori,"Tandoori Chicken","9","Grilled Tandoori Chicken with a flavorful yogurt-based marinade"));
        list.add(new MainModel(R.drawable.soup,"Veg Manchow","4","Vegan soup recipe made by cooking finely chopped vegetables."));
        list.add(new MainModel(R.drawable.friedrice,"Veg Fried Rice","5","Rice loaded with fresh mixed veggies and aromatic spices."));
        list.add(new MainModel(R.drawable.palakpaneer,"Palak Paneer","7","Indian cottage cheese is cooked with spinach puree."));
        list.add(new MainModel(R.drawable.momos,"Hot Steamed Momos","6","Looking for a yummy plate of chicken momos?"));
        list.add(new MainModel(R.drawable.rasmalai,"Rasmalai","3","Bengali dessert made of cheese balls."));
        list.add(new MainModel(R.drawable.jamun,"Gulab Jamun","3","Sweet made with khoya (mawa) and sugar syrup"));
        list.add(new MainModel(R.drawable.gobi,"Gobi Manchurian","5","Fried Gobi coated in a delicious sweet and tangy Manchurian sauce."));
        list.add(new MainModel(R.drawable.shawarma,"Shawarma","4","Spiced chicken wrapped in flatbreads with a creamy, tahini dressing"));



        MainAdapter adapter= new MainAdapter(list,this);
        binding.recyclerview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}