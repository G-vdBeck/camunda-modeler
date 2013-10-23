package org.camunda.bpm.modeler.test.util.operations;

import org.camunda.bpm.modeler.ui.diagram.BPMN2FeatureProvider;
import org.camunda.bpm.modeler.ui.features.activity.subprocess.CallActivityFeatureContainer.CreateCallActivityFeature;
import org.eclipse.bpmn2.CallActivity;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.impl.CreateContext;

/**
 * {@link AbstractAddShapeOperation} to be used in testcases for creating call activities.
 * 
 * @author Daniel Meyer
 *
 */
public class AddCallActivityOperation extends AbstractAddShapeOperation<CreateCallActivityFeature, AddCallActivityOperation> {

  public AddCallActivityOperation(IDiagramTypeProvider diagramTypeProvider) {
    super(diagramTypeProvider, AddCallActivityOperation.class);
  }

  @Override
  protected CreateCallActivityFeature createFeature(CreateContext context) {
   
    BPMN2FeatureProvider featureProvider = (BPMN2FeatureProvider) diagramTypeProvider.getFeatureProvider();
    IFeature createFeature = featureProvider.getCreateFeatureForBusinessObject(CallActivity.class);
    
    return (CreateCallActivityFeature) createFeature;
  }

  public static AddCallActivityOperation addCallActivity(IDiagramTypeProvider diagramTypeProvider) {
    return new AddCallActivityOperation(diagramTypeProvider);
  }

}
