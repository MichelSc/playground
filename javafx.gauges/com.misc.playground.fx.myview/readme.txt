-------------------------------------------------------------------------------
Tutorials
-------------------------------------------------------------------------------
https://cdtdoug.ca/2014/04/21/tutorial-a-simple-approach-to-writing-javafx-eclipse-rcp-apps/

-------------------------------------------------------------------------------
Installation
-------------------------------------------------------------------------------

-------------------------------------------------------------------------------
the system

For openjdk on linux, install package openjfx.

-------------------------------------------------------------------------------
eclipse

Install the IDE thing  from e(fx)clipse - http://download.eclipse.org/efxclipse/updates-released/2.4.0/site

-------------------------------------------------------------------------------
the IDE projects

Build path

First step is to make the javafx packages visible to the JDT compiler. 
Of course, make sure the Execution Environment is set to JavaSE-8 and that it’s linked to the Oracle Java 8 JRE. 
In the project properties under Java Build Path, click on the Libraries tab and expand the JRE system library. 
Edit the access rules and add one that makes javafx/** Accessible.

Alternative is to import all the javafx libraries explicitly.


-------------------------------------------------------------------------------
Necessary with e3
Plugin dependencies
  org.eclipse.fx.ui.workbench3 (necessar

The launch configuration


-------------------------------------------------------------------------------
Dont know when necessary
  org.eclipse.fx.javafx   
  org.eclipse.fx.osgi.util
	
The launch configuration, vm arguments
  -Dorg.osgi.framework.bundle.parent=ext
  -Dosgi.framework.extensions=org.eclipse.fx.osgi
