# Env Properties

Older Spring code that might need porting to AWS will need a mechanism to 
read properties files from some place other than the classpath or the file
system.

This is a demonstration of using a Spring factory bean to create a properties 
file from some other source (SSM) but satisfy downstream dependencies for a
java util properties object.

The switch is done upstream of the bean instantiation, so the downstream code
will not have to change. The only thing that changes is the SOURCE of Spring
property substitutions in the context file.

