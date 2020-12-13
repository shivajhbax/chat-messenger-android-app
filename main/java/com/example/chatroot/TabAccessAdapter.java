package com.example.chatroot;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.chatroot.GroupsFragment;

public class TabAccessAdapter extends FragmentPagerAdapter
{
	public TabAccessAdapter(@NonNull FragmentManager fm)
	{
	super(fm);
}

@NonNull
@Override
public Fragment getItem(int position)
{
	switch (position)
	{
		case 0:ChatsFragment chatsFrag=new ChatsFragment();
		
		       
		case 1:GroupsFragment groupsFragment=new GroupsFragment();
			return groupsFragment;
			
		case 2:ContactsFragment contactsFragment=new ContactsFragment();
			   return contactsFragment;
		
			default:
			return null;
	
	}
	
	
	
	
}

@Override
public int getCount()
{
	return 3;
}

@Nullable
@Override
public CharSequence getPageTitle(int position) {
	switch (position)
	{
		case 0:
			return "Chats";
		case 1:GroupsFragment groupsFragment=new GroupsFragment();
			return "Groups";
		
		case 2:ContactsFragment contactsFragment=new ContactsFragment();
			return "Contacts";
		
		default:
			return null;
		
	}

}
}

