Wowza Maven Template
====================

**Overview**

This is a Maven template for Wowza Streaming Server projects.

It is originally used for development of Wowza agent for https://wmspanel.com/.

When we started working on Wowza agent for WMSPanel we found that Wowza IDE is very inconvenient to use for the following reasons:

1. It does not support full development cycle. You can create Module or Listener but you cannot create and run Unit Tests, cannot add dependencies that will be copied with your jar before Wowza launch.It does not support full development cycle. You can create Module or Listener but you cannot create and run Unit Tests, cannot add dependencies that will be copied with your jar before Wowza launch.

2. After any change of any source file the IDE tries to build jar and copy it. A developer may want to have ability to implement some features and then build jar and copy it explicitly.

3. There are a lot of libraries we cannot use in general. Apache langs and codacs, joda time library etc. Maven is just great when you need to add publically available libraries.

4. You cannot control jar manifest produced by IDE. If you need your jar to have some additional attributes you should use Maven. Wowza IDE cannot help you here.

This is why it as decided to make Maven template. Original creator is Alex Pokotilo.

Please find more details here: http://blog.wmspanel.com/2011/10/maven-template-for-wowza.html

This template is released under GPLv3 license: http://www.gnu.org/licenses/gpl.html



This template is used for developing Wowza Media Server agent for WMSPanel - the admin control and reporting panel for Wowza Media Server: https://wmspanel.com/


**Usage**

Follow these instructions to begin using this template as the basis for your Wowza Streaming Server project.

* Edit ```pom.xml``` and replace the ```wms.installpath``` property with the full path to your local Wowza Streaming Engine installation directory. The default OSX path is provided herein.
* Run ```mvn validate``` to install any dependencies to your local Maven cache
	* This must be performed each time a new local dependency is provided 
* Run ```mvn package``` to build the deployable JAR file
* Run ```mvn clean install``` to build and deploy the JAR file into your local Wowza installation 