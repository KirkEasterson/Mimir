package view;

import java.util.EventListener;

public interface StudentChooseViewListener extends EventListener
{
	public void sainButtonClicked(StudentChooseViewEvent ev);
	
	public void whatIfButtonClicked(StudentChooseViewEvent ev);
}
