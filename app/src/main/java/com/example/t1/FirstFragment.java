package com.example.t1;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.t1.adapters.FaunaAdapter;
import com.example.t1.models.Africa;
import com.example.t1.models.America;
import com.example.t1.models.Asia;
import com.example.t1.models.Australia;
import com.example.t1.models.Europa;
import com.example.t1.models.Fauna;


import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.rv_animals);

        List<Fauna> animals=new ArrayList<>();
        animals.add(new Europa("Wolf"));
        animals.add(new Africa("Lion"));
        animals.add(new Asia("Koala"));
        animals.add(new America("Grizzly"));
        animals.add(new Australia("Kangaroo"));
        animals.add(new Europa("Wolf"));
        animals.add(new Africa("Lion"));
        animals.add(new Asia("Koala"));
        animals.add(new America("Grizzly"));
        animals.add(new Australia("Kangaroo"));
        animals.add(new Europa("Wolf"));
        animals.add(new Africa("Lion"));
        animals.add(new Asia("Koala"));
        animals.add(new America("Grizzly"));
        animals.add(new Australia("Kangaroo"));
        animals.add(new Europa("Wolf"));
        animals.add(new Africa("Lion"));
        animals.add(new Asia("Koala"));
        animals.add(new America("Grizzly"));
        animals.add(new Australia("Kangaroo"));
        animals.add(new Europa("Wolf"));
        animals.add(new Africa("Lion"));
        animals.add(new Asia("Koala"));
        animals.add(new America("Grizzly"));
        animals.add(new Australia("Kangaroo"));
        animals.add(new Europa("Wolf"));
        animals.add(new Africa("Lion"));
        animals.add(new Asia("Koala"));
        animals.add(new America("Grizzly"));
        animals.add(new Australia("Kangaroo"));
        animals.add(new Europa("Wolf"));
        animals.add(new Africa("Lion"));
        animals.add(new Asia("Koala"));
        animals.add(new America("Grizzly"));
        animals.add(new Australia("Kangaroo"));
        animals.add(new Europa("Wolf"));
        animals.add(new Africa("Lion"));
        animals.add(new Asia("Koala"));
        animals.add(new America("Grizzly"));
        animals.add(new Australia("Kangaroo"));
        animals.add(new Europa("Wolf"));
        animals.add(new Africa("Lion"));
        animals.add(new Asia("Koala"));
        animals.add(new America("Grizzly"));
        animals.add(new Australia("Kangaroo"));
        animals.add(new Europa("Wolf"));
        animals.add(new Africa("Lion"));
        animals.add(new Asia("Koala"));
        animals.add(new America("Grizzly"));
        animals.add(new Australia("Kangaroo"));

        FaunaAdapter adapter = new FaunaAdapter(animals);
        adapter.setOnItemClickListener(new FaunaAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position,String an) {
                Fauna animal = animals.get(position);
                NavController navController = Navigation.findNavController(view);
                Bundle bundle = new Bundle();
                bundle.putString("Animal", an+"\n"+animal.getType().toString());
                navController.navigate(R.id.secondFragment,bundle);

            }
        });
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
    }
}