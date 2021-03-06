package fr.sekaijin.osgi.web.main.api;

import java.util.List;

public class Menu implements IMenu {

	private String moduleName;
	private String moduleIcon;
	private List<MenuItem> menuItems;

	public Menu() {
		super();
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleIcon() {
		return moduleIcon;
	}

	public void setModuleIcon(String moduleIcon) {
		this.moduleIcon = moduleIcon;
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}


	public void setMenuItems(List<MenuItem> menuItemList) {
		this.menuItems = menuItemList;
	}

}
