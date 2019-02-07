## Configuring a project


One of the project leaders needs to make sure the following one-time configuration is set up before a team starts work.

### Library header

In the file `header/0.library.cex`, edit these two lines by adding an appropriate name for your project and a URN identifying the library that can be automatically generated from your files:


    name#NAME OF YOUR PROJECT
    urn#urn:cite2:hcmid:PROJECTID.cex.VERSION:all


### Configure editions

You need to add entries for each XML edition in four files:


-  In `editions/catalog.cex`, catalog your text's citation scheme with human-readable labels, and a three-letter code for the language of the text.
-  In `editions/citation.cex`, identify how the citation scheme in `editions/catalog.xml` maps on to XML of your edition.
-  In `editions/readers.csv`, list the name of the software package that can convert your multivalent XML to one or more specific editions (e.g., diplomatic edition, or an edition normalized in various ways...) Note that the name of the software package must match a quoted value in the `readerMap` definition in `scripts/validation.sc`.
-  In `editions/orthographies.csv`, list the name of the software package that understands the orthographic system of your edition.  Note that the name of the software package must match a quoted value in the `orthoMap` definition in `scripts/validation.sc`.
