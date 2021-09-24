// Elisha Catherasoo
// 101148507

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<>();
    }
    // add a new Buddy
    public void addBuddy(BuddyInfo aBuddy){
        if (aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }

    // remove a Buddy
    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
