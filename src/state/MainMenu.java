package state;

import com.jme3.app.Application;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.AppStateManager;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Node;

public class MainMenu extends AbstractAppState {
    
    private final Node rootNode;
    private final Node localRootNode = new Node("Main Menu");
    
    public MainMenu(SimpleApplication app){
        rootNode = app.getRootNode();
    }
    
    @Override
    public void initialize(AppStateManager stateManager, Application app){
        super.initialize(stateManager, app);
        
        rootNode.attachChild(localRootNode);
    }
    
    @Override
    public void cleanup(){
        rootNode.detachChild(localRootNode);
        
        super.cleanup();
    }
    
    @Override
    public void update(float dt){
        
    }
    
    @Override
    public void render(RenderManager rm){
        
    }
}
