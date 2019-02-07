## Configuring a project


One of the project leaders needs to make sure the following one-time configuration is set up before a team starts work.

### Library header

In the file `header/0.library.cex`, edit these two lines by adding an appropriate name for your project and a URN identifying the library that can be automatically generated from your files:


    name#NAME OF YOUR PROJECT
    urn#urn:cite2:hcmid:PROJECTID.cex.VERSION:all


### Configure editions


-  Add an entry for each XML edition in the file `editions/catalog.cex`
-  Add an entry for each XML edition in the file `editions/citation.cex`
