# project-template


Minimal template for starting an editing project in HC MID.


## Overview of files and directory layout

-   `dse`.  Directory for files with DSE records.  Files may be any name ending `.cex` but must begin with the header line `passage#imageroi#surface`
-  `editions`.  Your project's XML editions go here.  They are cataloged in two files, `catalog.cex` and `citation.cex`.
-  `header`.  Header files used when compiling your entire repository into a single CEX file.  You can fill in your project's name and ID in `0.library.cex`, but otherwise should not edit these files.
-   `paleography`.  Directory for files with paleographic observations.  Files may be any name ending `.cex` but must begin with the header line `observation#text#image#comments`.
-   `scripts/validate.sc`.  The scala script used in validating and verifying your work.
-   `validation`.  Reports on validating your work are written to this directory.
