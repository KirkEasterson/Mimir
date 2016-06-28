package view;

import java.util.EventListener;

public interface SearchViewListener extends EventListener
{
	// Search button clicked
	public void searchButtonClicked(SearchViewEvent ev);
}
