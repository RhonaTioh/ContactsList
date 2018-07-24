package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvContactList;

    ArrayList<ContactList> contactLists;

    CustomAdapt caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContactList = findViewById(R.id.ListViewContact);

        contactLists = new ArrayList<>();

        ContactList list1 = new ContactList("Mary", 65, 65442334);
        ContactList list2 = new ContactList("Ken", 65, 97442437);

        contactLists.add(list1);
        contactLists.add(list2);

        caContact = new CustomAdapt(this, R.layout.contactlist, contactLists);

        lvContactList.setAdapter(caContact);
    }
}
