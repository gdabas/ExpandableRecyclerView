package com.gauravdabas.extendedrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ExtendedRecyclerActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_recycler);

        mRecyclerView = findViewById(R.id.recyclerView);
        RecyclerDataAdapter recyclerDataAdapter = new RecyclerDataAdapter(getDummyDataToPass());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(recyclerDataAdapter);
        mRecyclerView.setHasFixedSize(true);
    }

    private ArrayList<ParentDataItem> getDummyDataToPass() {
        ArrayList<ParentDataItem> arrDummyData = new ArrayList<>();
        ArrayList<ChildDataItem> childDataItems;

        childDataItems = new ArrayList<>();
        childDataItems.add(new ChildDataItem("A Child 1"));
        childDataItems.add(new ChildDataItem("A Child 2"));
        childDataItems.add(new ChildDataItem("A Child 3"));
        arrDummyData.add(new ParentDataItem("A Parent, 3 Children", childDataItems));

        childDataItems = new ArrayList<>();
        childDataItems.add(new ChildDataItem("B Child 1"));
        childDataItems.add(new ChildDataItem("B Child 2"));
        childDataItems.add(new ChildDataItem("B Child 3"));
        childDataItems.add(new ChildDataItem("B Child 4"));
        childDataItems.add(new ChildDataItem("B Child 5"));
        childDataItems.add(new ChildDataItem("B Child 6"));
        arrDummyData.add(new ParentDataItem("B Parent, 6 Children", childDataItems));

        childDataItems = new ArrayList<>();
        childDataItems.add(new ChildDataItem("C Child 1"));
        childDataItems.add(new ChildDataItem("C Child 2"));
        childDataItems.add(new ChildDataItem("C Child 3"));
        childDataItems.add(new ChildDataItem("C Child 4"));
        childDataItems.add(new ChildDataItem("C Child 5"));
        childDataItems.add(new ChildDataItem("C Child 6"));
        childDataItems.add(new ChildDataItem("C Child 7"));
        childDataItems.add(new ChildDataItem("C Child 8"));
        childDataItems.add(new ChildDataItem("C Child 9"));
        arrDummyData.add(new ParentDataItem("C Parent, 9 Children", childDataItems));

        childDataItems = new ArrayList<>();
        childDataItems.add(new ChildDataItem("D Child 1"));
        arrDummyData.add(new ParentDataItem("D Parent, 1 Children", childDataItems));

        childDataItems = new ArrayList<>();
        arrDummyData.add(new ParentDataItem("E Parent, 0 Children", childDataItems));

        childDataItems = new ArrayList<>();
        childDataItems.add(new ChildDataItem("F Child 1"));
        childDataItems.add(new ChildDataItem("F Child 2"));
        arrDummyData.add(new ParentDataItem("F Parent, 2 Children", childDataItems));

        childDataItems = new ArrayList<>();
        childDataItems.add(new ChildDataItem("G Child 1"));
        childDataItems.add(new ChildDataItem("G Child 2"));
        childDataItems.add(new ChildDataItem("G Child 3"));
        childDataItems.add(new ChildDataItem("G Child 4"));
        arrDummyData.add(new ParentDataItem("G Parent, 4 Children", childDataItems));

        childDataItems = new ArrayList<>();
        childDataItems.add(new ChildDataItem("H Child 1"));
        childDataItems.add(new ChildDataItem("H Child 2"));
        childDataItems.add(new ChildDataItem("H Child 3"));
        childDataItems.add(new ChildDataItem("H Child 4"));
        childDataItems.add(new ChildDataItem("H Child 5"));
        childDataItems.add(new ChildDataItem("H Child 6"));
        childDataItems.add(new ChildDataItem("H Child 7"));
        childDataItems.add(new ChildDataItem("H Child 8"));
        arrDummyData.add(new ParentDataItem("H Parent, 8 Children", childDataItems));

        childDataItems = new ArrayList<>();
        childDataItems.add(new ChildDataItem("I Child 1"));
        arrDummyData.add(new ParentDataItem("I Parent, 1 Children", childDataItems));

        childDataItems = new ArrayList<>();
        childDataItems.add(new ChildDataItem("J Child 1"));
        childDataItems.add(new ChildDataItem("J Child 2"));
        childDataItems.add(new ChildDataItem("J Child 3"));
        childDataItems.add(new ChildDataItem("J Child 4"));
        childDataItems.add(new ChildDataItem("J Child 5"));
        arrDummyData.add(new ParentDataItem("J Parent, 5 Children", childDataItems));

        return arrDummyData;
    }
}
