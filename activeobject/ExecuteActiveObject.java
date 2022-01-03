package activeobject;

import activeobject.activeobject.ActiveObject;
import activeobject.activeobject.ActiveObjectFactory;

public class ExecuteActiveObject {
    
    public static void main(String[] args) {
        // Push "CTRL + C" when you want to stop this program.
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new MakerClientThread("Alice", activeObject).start();
        new MakerClientThread("Bobby", activeObject).start();
        new DisplayClientThread("Chris", activeObject).start();
    }
}
