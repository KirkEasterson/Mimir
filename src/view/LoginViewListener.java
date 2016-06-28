////////////////////
// Kirk Easterson //
// CST 242 Final ///
////////////////////

package view;

import java.util.EventListener;

public interface LoginViewListener extends EventListener
{
	// Login button method
	public void loginButtonClicked(LoginViewEvent ev);
}
