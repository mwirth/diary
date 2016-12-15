
package org.wimi.diary.e4;

import javax.annotation.PostConstruct;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import diary.DiaryPackage;

public class ConfigurationPart {

	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new RowLayout());
		Button button = new Button(parent, SWT.CHECK);
		button.setSelection(true);
		button.setText("show load button");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("changed");
				EClass eClass = DiaryPackage.eINSTANCE.eClass();
				final VView view = ViewProviderHelper.getView(eClass, null);
				getLoadButton(view);
				System.out.println(view);
			}
		});
	}

	protected void getLoadButton(VView view) {
		view.getChildren();
	}
}