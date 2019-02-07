---
layout: page
title: "MID template: organization of files and directories"
---


## Overview of files and directory layout


### Editing directories

The two directories where you will edit content are:

-   `dse`.  Directory for files with DSE records.  Files may be any name ending `.cex` but must begin with the header line `passage#imageroi#surface`
-  `editions`.  Your project's XML editions go here.
    -  All editions are cataloged in `catalog.cex`
    -  The mapping of the citation scheme onto XML markup for each edition is documented in `citation.cex`.
    -  `readers.csv` matches text URNs with the name of a class that can convert multivalent XML documents to one or more unambiguous editions
    - `orthographies.csv`

### Validating directories

-   `scripts/validate.sc`.  The scala script used in validating and verifying your work.
-   `validation`.  Reports on validating your work are written to this directory.


### Project metadata

-  `header`.  Header files used when compiling your entire repository into a single CEX file.  You can fill in your project's name and ID in `0.library.cex`, but otherwise should not need to edit these files.

### Paleography

-   `paleography`.  Directory for files with paleographic observations.  Files may be any name ending `.cex` but must begin with the header line `observation#text#image#comments`.
