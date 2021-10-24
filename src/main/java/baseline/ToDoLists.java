package baseline;

import java.util.ArrayList;
import java.util.List;

public class ToDoLists {
    //container-like object to store all of the to-do lists
    private List<ItemList> allLists = new ArrayList<>();

    //used to access lists in controller classes
    public List<ItemList> getAllLists() {
        return allLists;
    }

    public void getList(String name) {
        //uses passed in name to get item list
    }

    public void setAllLists(List<ItemList> allLists) {
        this.allLists = allLists;
    }

    public void removeList(String name) {
        for (ItemList list: allLists) {
            //remove list from all lists
        }
    }
}
