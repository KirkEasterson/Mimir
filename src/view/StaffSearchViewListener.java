package view;

import java.util.EventListener;

public interface StaffSearchViewListener extends EventListener
{
	public void searchButtonClicked(StaffSearchViewEvent ev);
}
