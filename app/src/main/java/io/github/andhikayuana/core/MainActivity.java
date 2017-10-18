package io.github.andhikayuana.core;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.github.andhikayuana.core.login.Contact;
import io.github.andhikayuana.core.login.ContactsAdapter;
import io.github.andhikayuana.core.login.ContactsSectionedAdapter;
import io.github.andhikayuana.lib.base.BaseActivity;
import io.github.andhikayuana.lib.util.SharedPrefUtil;

public class MainActivity extends BaseActivity {

    private RecyclerView rvContact;
    private ContactsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPrefUtil.putString("tag", "Hai");

        initView();

        initData();
    }

    private void initView() {
        rvContact = (RecyclerView) findViewById(R.id.rvContact);
        rvContact.setLayoutManager(new LinearLayoutManager(this));
        rvContact.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
    }

    private void initData() {
        mAdapter = new ContactsAdapter(this);
        mAdapter.addAll(Contact.generateData());

        // TODO: 7/10/17 sectioned
        //This is the code to provide a sectioned list
        List<ContactsSectionedAdapter.Section> sections =
                new ArrayList<ContactsSectionedAdapter.Section>();

        //Sections
        sections.add(new ContactsSectionedAdapter.Section(0, "Section 1"));
        sections.add(new ContactsSectionedAdapter.Section(3, "Section 2"));

        //Add your adapter to the sectionAdapter
        ContactsSectionedAdapter.Section[] dummy = new ContactsSectionedAdapter.Section[sections.size()];
        ContactsSectionedAdapter mSectionedAdapter = new
                ContactsSectionedAdapter(this, R.layout.item_section, R.id.tvSection, mAdapter);
        mSectionedAdapter.setSections(sections.toArray(dummy));

        rvContact.setAdapter(mSectionedAdapter);
    }
}
