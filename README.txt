Maven

Apache Maven is a software project management and build management tool for java Framworks.

Java FrameWorks : 
1) Selenium written in Java
2) Appimium written in Java
3) Rest Assured API written in Java


Why Maven
=========
. Central repository to get dependencies
. Maintaining common structure across the organization
. Flexibility in integrating with CI tools
. Plugins for Test framework execution.
=============================================

Artifact: An artifact is a file, usually a JAR, that gets deployed to a Maven repository.

Groupid : groupid will identify your project uniquely across all projects.

archetype:generate: Generates a new project from an archetype

Creaeing Maven Project
======================
mvn archtype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

mvn archetype:generate -DgroupId=Rakesh1 -DartifactId=Mavenjava -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false










