package com.gauravdabas.extendedrecyclerview;

import java.util.ArrayList;

class ParentDataItem {
    private String parentName;
    private ArrayList<ChildDataItem> childDataItems;

    ParentDataItem(String parentName, ArrayList<ChildDataItem> childDataItems) {
        this.parentName = parentName;
        this.childDataItems = childDataItems;
    }

    String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    ArrayList<ChildDataItem> getChildDataItems() {
        return childDataItems;
    }

    public void setChildDataItems(ArrayList<ChildDataItem> childDataItems) {
        this.childDataItems = childDataItems;
    }
}
