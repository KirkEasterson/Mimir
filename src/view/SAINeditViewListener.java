////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package view;

import java.util.EventListener;

public interface SAINeditViewListener extends EventListener
{
	public void nameSearchClicked();
	
	public void updateNameClicked();
	
	public void updateMajorClicked();
	
	public void updateUserNameClicked();
	
	public void updatePasswordClicked();
	
	public void updateGpaClicked();
	
	public void updateCoursesTookClicked();
	
	public void updateCoursesTookOther();
	
	public void updateCoursesTookFailed();
	
	public void updateCoursesTookTaking();
	
	// Update button method
	public void saveButtonClicked(SAINeditViewEvent ev);
	
}
