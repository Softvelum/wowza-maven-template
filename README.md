Wowza Maven Template
====================

This is a Maven template for Wowza Media Server projects.

It is originally used for development of Wowza agent for https://wmspanel.com/.

When we started working on Wowza agent for WMSPanel we found that Wowza IDE is very inconvenient to use for the following reasons:

1. It does not support full development cycle. You can create Module or Listener but you cannot create and run Unit Tests, cannot add dependencies that will be copied $

2. After any change of any source file the IDE tries to build jar and copy it. A developer may want to have ability to implement some features and then build jar and c$

3. There are a lot of libraries we cannot use in general. Apache langs and codacs, joda time library etc. Maven is just great when you need to add publically available$

4. You cannot control jar manifest produced by IDE. If you need your jar to have some additional attributes you should use Maven. Wowza IDE cannot help you here.

This is why it as decided to make Maven template.

More details to come soon.
Meanwhile you can find more details here: http://wmsauth.blogspot.com/2011/10/maven-template-for-wowza.html

