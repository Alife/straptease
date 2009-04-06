package straptease;

import joc.Message;
import obc.EAGLView;
import obc.NSObject;

public final class EAGLViewDelegate extends NSObject {
	@Message(name="drawView:")
	public void drawView$(EAGLView view) {
		view.renderGL();
	}

	@Message(name="setupView:")
	public void setupView$(EAGLView view) {
		view.setupGL();
	}
}
