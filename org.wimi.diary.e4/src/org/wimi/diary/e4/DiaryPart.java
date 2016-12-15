 
package org.wimi.diary.e4;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.model.VContainedElement;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import diary.Diary;
import diary.DiaryPackage;

public class DiaryPart {
	
	private ComposedAdapterFactory composedAdapterFactory;
	
	private Resource resource;

	private Diary diary;
	
	@Inject
	public DiaryPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		final EObject dummyObject = getDummyEObject();
		try {
			final VView view = ViewProviderHelper.getView(dummyObject, null);
			Composite composite = new Composite(parent, SWT.NONE);
			FormLayout fl = new FormLayout();
			composite.setLayout(fl);

			Composite buttonBar = new Composite(composite, SWT.NONE);
			buttonBar.setLayout(new RowLayout());
			Button switchButton = new Button(buttonBar, SWT.PUSH);
			switchButton.setText("switch");
			
			buttonBar.setLayout(new RowLayout());
			Button saveButton = new Button(buttonBar, SWT.PUSH);
			saveButton.setText("save");
			
			buttonBar.setLayout(new RowLayout());
			Button loadButton = new Button(buttonBar, SWT.PUSH);
			loadButton.setText("load");
			
			final Composite viewContent = new Composite(composite, SWT.NONE);
			FormData formData = new FormData();
			formData.top = new FormAttachment(buttonBar,0);
			formData.right= new FormAttachment(100,0);
			formData.left= new FormAttachment(0,0);
			viewContent.setLayoutData(formData);
			switchButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Control child = viewContent.getChildren()[0];
					child.dispose();
					EList<VContainedElement> children = view.getChildren();
					VContainedElement child1 = children.get(0);
					VContainedElement child2 = children.get(1);
					
					view.getChildren().remove(1);
					view.getChildren().remove(0);
					
					view.getChildren().add(child2);
					view.getChildren().add(child1);
					try {
						addDiaryView(view, viewContent, dummyObject);
					} catch (ECPRendererException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			
			saveButton.addSelectionListener(new SelectionAdapter() {
				

				@Override
				public void widgetSelected(SelectionEvent e) {
//					AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(getAdapterFactory(),
//							new BasicCommandStack());

//					resource = domain.createResource(
//							"/Users/mwirth/dev/eclipse/modeling-rcp/runtime-org.wimi.diary.e4.product/My.diary");
					try {
						resource.save(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			
			loadButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					loadDiary();
				}

			});
			
			addDiaryView(view, viewContent, dummyObject);
		} catch (final ECPRendererException e) {
			e.printStackTrace();
		}
//		parent.layout();
	}

	public void setDiary(Diary eObject) {
		this.diary = eObject;
		
	}
	
	protected AdapterFactory getAdapterFactory() {
		if (composedAdapterFactory == null) {
			composedAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		}
		return composedAdapterFactory;
	}
	private void addDiaryView(VView view, Composite parent, final EObject dummyObject) throws ECPRendererException {
		parent.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		parent.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());
		
		ECPSWTViewRenderer.INSTANCE.render(parent, dummyObject, view);
		parent.layout();
	}
	
	private EObject getDummyEObject() {
		// Replace this with your own model EClass to test the application with a custom model
		// final EClass eClass = TaskPackage.eINSTANCE.getUser();
//		final EClass eClass = DiaryPackage.eINSTANCE.getDiary();
//		return EcoreUtil.create(eClass);
		loadDiary();
		return diary;
	}

	private void loadDiary() {
		System.out.println("----Start loading----");
		AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(getAdapterFactory(),
				new BasicCommandStack());
		resource = domain.createResource("/Users/mwirth/dev/eclipse/modeling-rcp/runtime-org.wimi.diary.e4.product/My.diary");
		try {
			resource.load(null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("----End loading----");
		EObject eObject = resource.getContents().get(0);
		setDiary((Diary) eObject);
	}
	
	
}